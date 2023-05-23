package org.example;

import org.example.clone.InputOutPut;
import org.example.codingDProblems.DProblems;
import org.example.codingDProblems.Emp;
import org.example.codingDProblems.Job;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        char[] charArray = {'a', 'b', 'c', 'd'};

        String ipAddress = "192.168.0.1";
        List<String> stringList = new ArrayList<>();
        for (char c : ipAddress.toCharArray()) {
            stringList.add(String.valueOf(c));
        }
        String ipAddressWithoutDots = ipAddress.replace(".", "@");
        System.out.println("IP address without dots: " + ipAddressWithoutDots);
        System.out.println("Hello world!");
        Map<String, Long> map = stringList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("############### " + map);
        Data d1 = new Data(1, "Mike", "Doe", 25, "male", "New York", "USA", true);
        Data d2 = new Data(2, "", "Doe", 30, "female", "London", "UK", true);
        Data d3 = new Data(3, "Bob", "Smith", 22, "female", "Paris", "France", false);
        Data d4 = new Data(4, "Bob", "Johnson", 40, "male", "Sydney", "Australia", false);
        Data d5 = new Data(5, "Bob", "Johnson", 50, "female", "Tokyo", "null", true);

        /*List<Data> dataList = Arrays.asList(d1,d2,d3,d4,d5);
        dataList.stream()
                .filter(data->data.getFirstName().equals("Bob"))
                .filter(data->data.getLastName().equals("")).forEach(x->{
            System.out.println("==== "+x.toString());
        });*/
//        System.out.println("= " + d1.toString());
//        dataList.forEach(x-> System.out.println("==== "+x.toString()));

        System.out.println("======== 2nd way ====================");
        // Create dynamic filter based on properties
        Predicate<Data> dynamicFilter = data -> true;
        String firstNameFilter = "Bob";
        String lastNameFilter = null;
        Integer ageFilter = null;
        String genderFilter = null;
        String cityFilter = null;
        String countryFilter = null;
        Boolean isActiveFilter = null;

        if (firstNameFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> firstNameFilter.equals(data.getFirstName()));
        }
        if (lastNameFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> lastNameFilter.equals(data.getLastName()));
        }
        if (ageFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> ageFilter.equals(data.getAge()));
        }
        if (genderFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> genderFilter.equals(data.getGender()));
        }

        if (cityFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> cityFilter.equals(data.getCity()));
        }

        if (countryFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> countryFilter.equals(data.getCountry()));
        }

        if (isActiveFilter != null) {
            dynamicFilter = dynamicFilter.and(data -> isActiveFilter.equals(data.isActive()));
        }

        // Filter data based on dynamic filter
      /*  List<Data> filteredDataList = dataList.stream()
                .filter(dynamicFilter)
                .collect(Collectors.toList());*/

        // Print filtered data
//        filteredDataList.forEach(System.out::println);

        System.out.println(" ==================================Problems====================================");
        ProblesAndSolution ps = new ProblesAndSolution();
        ps.occurrenceOfCharacter();


        //map vs flatMap

        List<Customer> customer = Customer.getAllCustomer();
        List<String> names = customer.stream().map(c -> c.getName()).collect(Collectors.toList());
        System.out.println("customer names " + names);
        List<List<String>> emails = customer.stream().map(c -> c.getEmailId()).collect(Collectors.toList());
        System.out.println("customer emails using map " + emails);
        List<String> flatMapEmails = customer.stream().flatMap(c -> c.getEmailId().stream()).collect(Collectors.toList());
        System.out.println("customer emails using flatMap " + flatMapEmails);
        customer.sort(Comparator.comparing(Customer::getName).reversed());
        System.out.println(customer);
        Collections.sort(customer, Comparator.comparing(Customer::getId));
        //Consumer interface
        Consumer<Integer> consumer = t -> System.out.println("print " + t);
        consumer.accept(20);
        Map<String, String> m = new ConcurrentHashMap<>();

        Integer[] arr = {5, 2, 8, 3, 1};
        // sort in ascending order
        Arrays.sort(arr, Comparator.comparingInt(Integer::intValue));
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
        // sort in descending order
        Arrays.sort(arr, Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));

        System.out.println("fail-fast example");
        FailFastAndFailSafe fffs = new FailFastAndFailSafe();
//        fffs.names();
       /* List<String> fNames = new ArrayList<>();
        fNames.add("ram");
        fNames.add("shyam");
        fNames.add("dhyan shyam");
        fNames.add("ram dulare");*/
        List<String> fNames = Arrays.asList("ram", "guddu", "munna", "rahul");
      /*  fNames.forEach(s -> {
            System.out.println(s);
            fNames.add("new names");
        });*/

        InputOutPut.result();
        DProblems.waveProblem();
        DProblems.moveAllZerosToEnd();


        System.out.println("===============practical================== ");
        List<String> dname = Arrays.asList("d1", "d2");
        System.out.println("====before");
        List<Job> filteredJob = Job.getAllJobs(dname);
        System.out.println("size of filteredJob = " + filteredJob.size());
        System.out.println("====after");

        String extraName = "dontKnow";
        List<String> ns = Arrays.asList("Sushil", "Kumar", "Verma");
        String concatenatedNames = String.join(",", ns);

        System.out.println(concatenatedNames);
        String con =concatenatedNames+ ", "+extraName;
        System.out.println(con);

        Map<String,Long> empEmp = Emp.getEmpls().stream().collect(Collectors.groupingBy(e-> e.getName() , Collectors.counting()));
        System.out.println(empEmp);

       /* Map<String,Long> empEmp1 = */
        List<String> duplicateElement = Emp.getEmpls().stream().collect(Collectors.groupingBy(e-> e.getName() , Collectors.counting()))
                        .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateElement);

        List<String> nonDuplicateElement = Emp.getEmpls().stream().collect(Collectors.groupingBy(e-> e.getName() , Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(nonDuplicateElement);
        List<String > stringd = Arrays.asList("a","b","c","d");
        stringd.forEach(System.out::println);

    }
}