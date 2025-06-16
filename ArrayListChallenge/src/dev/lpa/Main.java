package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        boolean flag = true;
//        ArrayList<String> groceries = new ArrayList<>();
//        while(flag){
//            printActions();
//            //here switch case is used to initalize the operation to be performed and which function to be called.
//            switch (Integer.parseInt(scanner.nextLine())){
//                case 1 -> addItems(groceries);
//                case 2 -> removeItems(groceries);
//                default -> flag = false;
//            }
//            groceries.sort(Comparator.naturalOrder());//here the list is sorted.
//            System.out.println(groceries);



            MobilePhone mobilePhone = new MobilePhone("123-456-7890");

            Contact contact1 = Contact.createContact("John Doe", "111-222-3333");
            Contact contact2 = Contact.createContact("Jane Doe", "444-555-6666");
            Contact contact3 = Contact.createContact("Alice Smith", "777-888-9999");

            mobilePhone.addNewContact(contact1);
            mobilePhone.addNewContact(contact2);
            mobilePhone.addNewContact(contact3);

            mobilePhone.printContacts();

            Contact newContact = Contact.createContact("John Smith", "000-111-2222");
            mobilePhone.updateContact(contact1, newContact);

            mobilePhone.printContacts();

            mobilePhone.removeContact(contact2);

            mobilePhone.printContacts();

            Contact queriedContact = mobilePhone.queryContact("Alice Smith");
            if (queriedContact != null) {
                System.out.println("Found contact: " + queriedContact.getName() + " -> " + queriedContact.getPhoneNumber());
            } else {
                System.out.println("Contact not found.");
            }
        }
    }

//    private static void addItems(ArrayList<String> groceries){
//        System.out.println("Add items [seperate items by comma]:");
//        String[] items = scanner.nextLine().split(",");
//       // groceries.addAll(List.of(items));
//        //here the code is to check that the item already in the list must not be repeated.
//        for(String i: items){
//            String trimmed = i.trim();
//            if(groceries.indexOf(trimmed)<0){
//                groceries.add(trimmed);
//            }
//        }
//    }
//
//    private static void removeItems(ArrayList<String> groceries){
//        System.out.println("remove items [seperate items by comma]:");
//        String[] items = scanner.nextLine().split(",");
//        // groceries.addAll(List.of(items));
//        for(String i: items){
//            String trimmed = i.trim();
//            groceries.remove(trimmed);
//        }
//        }
//
//    private static void printActions() {
//        //a textblock is used to write multiline of code which is to be printed out at once.
//            String textblock = """
//                    0 - to shutdown
//                    1 - to add items to the list (comma delimited list)
//                    2 - to remove any item of the list(comma delimited list)
//                    Enter the number for which action you want to perform:""";
//
//            System.out.println(textblock + " ");
//
//        }

//}
