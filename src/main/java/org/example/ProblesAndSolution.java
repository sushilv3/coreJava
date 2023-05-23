package org.example;

import org.example.codingDProblems.Emp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblesAndSolution {

    private String name = "sushil";
    private String statement = "ilovejavalanguage";

    /* count the occurrence of each character*/
    public void occurrenceOfCharacter() {
        Map<String, Long> stringMap =   Arrays.stream(name.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println("stringMap = "+stringMap);
        Map<String, Long> map = Arrays.stream(statement.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("statementcharacter with their count = " + map);
        Map<String, List<String>> map1 = Arrays.stream(statement.split("")).collect(Collectors.groupingBy(s -> s));
        System.out.println("character with their character list occurrence = " + map1);
        List<String> duplicateElement = Arrays.stream(statement.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("find all duplicate character = " + duplicateElement);
        List<String> uniqueElement = Arrays.stream(statement.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("find all uniqueElement character = " + uniqueElement);
        /*we can also pass LinkedHasMap for preserving insertion order Collectors.groupingBy(s -> s, LinkedHashMap::new,Collectors.counting()*/
        String findFirstUniqueElement = Arrays.stream(statement.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println("find first uniqueElement character = " + findFirstUniqueElement);
        int[] numbers = {10, 12, 9, 8, 7, 6, 5, 3};
        List<Integer> integerList = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
        Integer scndhigestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("find second highest = " + integerList);
        System.out.println("find second highest = " + scndhigestNumber);

        String[] strArray = {"java", "spring", "springboot", "spting data jpa", "microservices"};

        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("longest string = " + longestString);

        int[] numbs = {0, 2, 3, 23, 45, 41, 40, 3, 7, 9};
        List<String> stringList = Arrays.stream(numbs).boxed().map(s -> s + "").filter(s->s.startsWith("4")).collect(Collectors.toList());
        System.out.println(" string start with 4 = " + stringList);

        List<String> nbs = Arrays.asList("1","2","3","4","5");
        System.out.println("String join with - : "+String.join("-",nbs));

        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);
        List<String> countries = Arrays.asList("India", "Japan", "England", "Spain", "Iceland", "Canada");
        List<String> sort=countries.stream().sorted().filter(country -> !country.contains("land")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(sort);
        countries.stream().map(x->x.replaceAll("land","")).map(s->s.toUpperCase()).forEach(x->{
            System.out.println(x);
        });

        Integer[] numberArray = {10, 12, 9, 8, 7, 6, 5, 3};
        List<Integer> sortedArray = Arrays.stream(numberArray).sorted().collect(Collectors.toList());

        /*wave array*/
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); // prints [2, 1, 4, 3, 5]

        Arrays.sort(arr); // sort the array in ascending order

        for (int i = 0; i < arr.length - 1; i += 2) {
            // swap adjacent elements to create the wave pattern
//            System.out.println("i value = "+ i);
            int temp = arr[i];
//            System.out.println("temp value = "+ temp);
            arr[i] = arr[i + 1];
//            System.out.println("arr[i] = "+ arr[i]);
            arr[i + 1] = temp;
        }
        System.out.println("wave array = ");
        Arrays.stream(arr).boxed().forEach(n-> System.out.println(" wave array = "+n));


        System.out.println("================emp problem================");

        List<String > stringd;



    }
}
