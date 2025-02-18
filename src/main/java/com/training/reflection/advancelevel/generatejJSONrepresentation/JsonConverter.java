package com.training.reflection.advancelevel.generatejJSONrepresentation;
import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object obj) throws IllegalAccessException {
        // creating the string builder
        StringBuilder json = new StringBuilder("{");

        // Create a field method
        Field[] fields = obj.getClass().getDeclaredFields();

        // iterate throw the fields
        for (Field field : fields) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\": \"")
                    .append(field.get(obj)).append("\", ");
        }
        if (json.length() > 1) {
            // Remove trailing comma
            json.setLength(json.length() - 2);
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        // Example
        Person person = new Person();
        person.name = "SOnu";
        person.age = 21;
        System.out.println(toJson(person));
    }
}