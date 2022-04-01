package Theorie.Bases.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        // HashMap : ensemble de clefs / valeurs
        // Ex : Dictionnaire

        /*
            Constructeur
         */

        HashMap<String, String> myHashMap = new HashMap<>();

        /*
            Méthodes
         */

        // Object put(Object, Object)
        // > Insérerer une clé associé à une valeur fournies en paramètre au dictionnaire

        System.out.println("\n--- Object put(Object, Object) ---\n");

        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put("00001", "Quentin"));
        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put("00002", "Houda"));
        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put("00003", "Thomas"));
        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put("00004", "Tommy"));
        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put("00001", "William"));
        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put("00002", "Noël"));
        System.out.println("Précédente valeur associée à la clef : " + myHashMap.put(null, "Simon"));

        System.out.println("myHashMap : " + myHashMap);

        // boolean containsKey(Object)
        // > Indiquer si la clef est présente dans le dictionnaire

        System.out.println("\n--- boolean containsKey(Object) ---\n");

        System.out.println("Contient la clef ? : " + myHashMap.containsKey("00001")); // output : true
        System.out.println("Contient la clef ? : " + myHashMap.containsKey("00000")); // output : false
        System.out.println("Contient la clef ? : " + myHashMap.containsKey(null)); // output : false

        System.out.println("myHashMap : " + myHashMap);

        // boolean containsValue(Object)
        // > Indiquer si la clef est présente dans le dictionnaire

        System.out.println("\n--- boolean containsValue(Object) ---\n");

        System.out.println("Contient la valeur ? : " + myHashMap.containsValue("Thomas")); // output : true
        System.out.println("Contient la valeur ? : " + myHashMap.containsValue("00000")); // output : false

        System.out.println("myHashMap : " + myHashMap);

        // Set entrySet()
        // > Renvoyer un ensemble contenant les paires clefs/valeurs du dictionnaire

        System.out.println("\n--- Set entrySet() ---\n");

        Set<Map.Entry<String, String>> returnedEntrySet = myHashMap.entrySet();
        for (Map.Entry<String, String> entry : returnedEntrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("returnedEntrySet : " + returnedEntrySet);

        System.out.println("myHashMap : " + myHashMap);

        // Object get(Object)
        // > Renvoyer la valeur associée à la clef fournie en paramètre

        System.out.println("\n--- Object get(Object) ---\n");
        System.out.println("Valeur de la clef : " + myHashMap.get("00001")); // output : William
        System.out.println("Valeur de la clef : " + myHashMap.get("00000")); // output : null

        System.out.println("myHashMap : " + myHashMap);

        // Set keySet()
        // > Renvoyer un ensemble contennant les clefs du dictionnaire

        System.out.println("\n--- Set keySet() ---\n");

        Set<String> returnedKeySet = myHashMap.keySet();

        for (String key : returnedKeySet) {
            System.out.println(key);
        }

        System.out.println("myHashMap : " + myHashMap);

        // Collection values()
        // > Renvoyer un ensemble contennant les valeurs du dictionnaire

        System.out.println("\n--- Collection values() ---\n");

        Collection<String> returnedValues = myHashMap.values();

        for (String value : returnedValues) {
            System.out.println(value);
        }

        System.out.println("myHashMap : " + myHashMap);



    }
}
