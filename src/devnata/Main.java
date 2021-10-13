package devnata;

import java.util.Arrays;
import java.util.LinkedList;

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
        System.out.println("-----------");
        System.out.println("Inheritance Exercise:");

        ModArrayList list = new ModArrayList();
        list.add(0);
        list.add(20);
        list.add(3);

        System.out.println(list.getUsingMod(1));
        System.out.println(list.getUsingMod(0));
        System.out.println(list.getUsingMod(-2));

    }
}

