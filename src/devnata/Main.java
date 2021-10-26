package devnata;

import hackerrank.Arrays2ndMax;
import hackerrank.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {

    public static void main (String[] args){
//        System.out.println("Linked Lists:");
//        new MyLinkedList(); //calling linked list exercise
//        System.out.println("-----------");
//        System.out.println("Arrays:");
//        Array numbers = new Array(3); //calling array exercise
//        numbers.printArray();
//        System.out.println("-----------");
//        System.out.println("Employee exercise:");
//
//        Employee[] a = new Employee[] {
//                new Employee("Flora",28,7000.00,"Iran",Department.SUPPORT),
//                new Employee("Renata",26,6100.00,"Brazil",Department.DEVELOPMENT)
//        };
//
//        Salesperson salesperson = new Salesperson("Marcia",23,3500.00,"San Francisco",Department.SALES,.2);
//        salesperson.raiseCommission();
//        a[0].raiseSalary();
//        System.out.println("Employee salaries are:");
//        for(int i = 0;i < a.length; i++){
//            a[i].printSalary();
//        }
//        System.out.println("-----------");
//        System.out.println("Bank Account exercise:");
//
//        BankAccount[] b = new BankAccount[] {
//                new BankAccount("Flora",280.00),
//                new BankAccount("Marcia",233500.00),
//                new BankAccount("Renata",266100.00)
//        };
//        b[0].withdrawBalance(400); //testing validation
//        b[1].withdrawBalance(1000);
//        b[2].depositBalance(10000);
//        b[2].depositBalance(-500); //testing validation
//        b[1].withdrawBalance(0); //testing validation
//        b[0].withdrawBalance(280);
//        System.out.println("Bank accounts in the system:");
//        System.out.println("Owner | Balance");
//        for(int i = 0;i < b.length; i++){
//            b[i].printAccounts();
//        }
//        System.out.println("-----------");
//        System.out.println("Inheritance Exercise:");
//
//        ModArrayList list = new ModArrayList();
//        list.add(0);
//        list.add(20);
//        list.add(3);
//
//        System.out.println(list.getUsingMod(1));
//        System.out.println(list.getUsingMod(0));
//        System.out.println(list.getUsingMod(-2));

//COUNTING SORT
//        List<Integer> arr = new ArrayList<Integer>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(2);
//        arr.add(1);
//        System.out.println(countingSort(arr));

//DIAGONAL MATRIX SUM
//        List<List<Integer>> arr = new ArrayList<List<Integer>>();
//        List<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
//        List<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
//        List<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7,8,9));
//        arr.add(row1);
//        arr.add(row2);
//        arr.add(row3);
//        diagonalDifference(arr);
//PALINDROMO
//        if(isPalindromo("arara")){
//            System.out.println("Palindromo");
//        } else {
//            System.out.println("Não é Palíndromo");
//        }
//STRING WITHIN
//        if(contains("corpo intensivo","corpo")){
//            System.out.println("String2 existe em String1");
//        }else{
//            System.out.println("String2 não existe em String1");
//        }
//SECOND-BIGGEST NUMBER IN AN ARRAY
        var merge = new Arrays2ndMax();
        int[] array = {1,3,5,8,11};
        int[] array2 = {10,5,6};
        System.out.println(merge.secondBigNumber(array, array2));

//BINARY SEARCH
//        var search = new BinarySearch();
//        search.binarySearch();
    }
}

