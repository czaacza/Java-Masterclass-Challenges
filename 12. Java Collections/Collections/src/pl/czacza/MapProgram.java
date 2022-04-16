package pl.czacza;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, Object-oriented language");
        languages.put("Python", "an interpreted high level, Object-oriented language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Lisp", "Therein lies madness ");
        languages.put("BASIC", "Begginers Instruction Code");

        if(languages.containsKey("Python")){
            System.out.println("Python already exists");
        } else {
            languages.put("Python", "Best language");
        }

        System.out.println("========================================================");

        for(String key : languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }

//        languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed\n");
        } else{
            System.out.println("Algol not removed\n");
        }

        if(languages.replace("Lisp", "This will not work"))
        System.out.println(languages.replace("Lisp", "a functional language"));
        System.out.println(languages.replace("Scala", "this will not be added"));

        for(String key : languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
