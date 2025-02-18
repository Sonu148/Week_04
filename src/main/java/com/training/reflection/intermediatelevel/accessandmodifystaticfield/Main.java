package com.training.reflection.intermediatelevel.accessandmodifystaticfield;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // creating the configuration class object
        Configuration configuration= new Configuration();
        //Method class object to get the api key
        Method method1= configuration.getClass().getDeclaredMethod("getApiKey");

        // using the set accessible we use static method or field
          method1.setAccessible(true);
          String keyApi=(String)method1.invoke(null);
        System.out.println("The Current api key: "+keyApi);

        //Method class object to set the api key
        Method method2= configuration.getClass().getDeclaredMethod("setApiKey", String.class);

        // using the set accessible we use static method or field
        method2.setAccessible(true);
           method2.invoke(null,"EW232AMPQ");
            keyApi=(String)method1.invoke(null);
        System.out.println("The updated keyApi is : "+keyApi);
    }
}
