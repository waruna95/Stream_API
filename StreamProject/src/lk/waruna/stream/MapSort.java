package lk.waruna.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSort {
    public static void main(String[] args) {

        //sort by marks by pass mark greater than that mark
        //get marks with list decending order

        Map<String,Integer> students = new HashMap<>();

        students.put("Krish",100);
        students.put("Nuwan",90);
        students.put("Bhagya",120);
        students.put("Hasini",90);
        students.put("Suranga",100);
        students.put("Erandika",100);


        Integer passMark =60;

        //UGLYWAY
        students.entrySet().stream()
                .filter(s1->s1.getValue()>=passMark)
                .sorted((s1,s2)-> -s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList())
                .stream().forEach(s-> System.out.println(s.getKey()));


        //myway
//        students.entrySet().stream()
//                .filter(s1->s1.getValue()>=passMark)
//                .sorted((s1,s2)-> -s1.getValue().compareTo(s2.getValue()))
//                .forEach(s->System.out::println(s.getkey));
//
        //using list
        List<String> strings= new ArrayList<>();
        students.entrySet().stream().filter(e->e.getValue()>=60)
                .sorted((s1,s2)->-s1.getValue().compareTo(s2.getValue()))
                .peek(s->strings.add(s.getKey())).collect(Collectors.toList());
        System.out.println("----------");
        System.out.println(strings);



        //you need to create two diffe list, with key in decsending ordar all vehicle assending order axpest ship

//        Map<Integer,String> vehicles = new HashMap<>();
//        vehicles.put(10,"CAR");
//        vehicles.put(50,"SUV");
//        vehicles.put(20,"Jeep");
//        vehicles.put(12,"BUS");
//        vehicles.put(15,"SHIP");
//        vehicles.put(16,"LORRY");
//        vehicles.put(4,"CYCLE");
//
//        List<String> strings1 = new ArrayList<>();
//        vehicles.entrySet().
        Map<Integer, String> vehicles = new HashMap<>();
        vehicles.put(10, "car");
        vehicles.put(50, "SUV");
        vehicles.put(20, "Jeep");
        vehicles.put(12, "Bus");
        vehicles.put(15, "Ship");
        vehicles.put(16, "Lorry");
        vehicles.put(4, "Cycle");

        List<Integer> keys = new ArrayList<>();
        List<String> names = new ArrayList<>();

        vehicles.entrySet()
                .stream()
                .sorted((v1,v2) -> -v1.getKey().compareTo(v2.getKey()))
                .peek(s -> keys.add(s.getKey()))
                .sorted((v1,v2) -> v1.getValue().compareTo(v2.getValue()) )
                .filter(v1 -> v1.getValue() != "Ship")
                .peek(v -> names.add(v.getValue()))
                .collect(Collectors.toList());

        System.out.println(keys);
        System.out.println(names);


    }


}
