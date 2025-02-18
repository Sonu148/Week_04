package com.training.reflection.advancelevel.dependencyinjectionusingreflection;

import java.lang.reflect.Field;

public class DIContainer {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        // Inject dependencies into the client
        injectDependencies(client);
        // Call the method
        client.callService();
    }

    // Injects dependencies into fields annotated with @Inject
    public static void injectDependencies(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                // Make field accessible
                field.setAccessible(true);
                Object dependency = getDependency(field.getType());
                // Inject the dependency
                field.set(obj, dependency);
            }
        }
    }

    // Provides a dependency based on the field's type
    public static Object getDependency(Class<?> type) {
        if (type == Service.class) {
            // Return a new Service instance
            return new Service();
        }
        //null for unsupported type
        return null;
    }
}
