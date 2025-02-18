package com.training.reflection.advancelevel.customobjectmapper;import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    // Converts a Map of properties into an object of the specified class
    public static <T> T toObject(Class<T> class1, Map<String, Object> properties) throws Exception {

        // Create a new instance of the class
        T obj = class1.getDeclaredConstructor().newInstance();

        // Iterate over the map entries
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            Field field = class1.getDeclaredField(entry.getKey());
            field.setAccessible(true);

            // Set the value of the field
            field.set(obj, entry.getValue());
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = Map.of("name", "Sonu", "age", 21);
        // Create a Person object from the map
        Person person = toObject(Person.class, properties);
        System.out.println(person);
    }
}