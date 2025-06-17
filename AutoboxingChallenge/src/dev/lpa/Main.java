package dev.lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {

this(name.toUpperCase(), new ArrayList<Double>(500));//here we made the list of the Double not double so we need to use it as it is.
        transactions.add(initialDeposit);
    }
    }


public class Main {

        public static void main(String[] args) {

        Customer bob = new Customer("bob S",1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("jane A", 500.0);
            System.out.println(bank);

        bank.addTransaction("Jane A", -10.20);
        bank.addTransaction("jane A",-75.01);
        bank.printStatement("Jane a");

        bank.addNewCustomer("Bob S",25);
        bank.addTransaction("Bob s",100);
        bank.printStatement("bob S");

            bank.addTransaction("Bob s",-46);
            bank.printStatement("bob s");
    }
}

class Bank{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);
    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for(var customer:customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }
    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName)==null){
            Customer customer= new Customer( customerName,initialDeposit);
            customers.add(customer);

            System.out.println("New customer added:" + customer);
            }
        }
        public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if(customer!= null){
            customer.transactions().add(transactionAmount);
        }
        }
        public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if (customer == null){
            return;
        }
        System.out.println("-".repeat(30));
            System.out.println("Customer Name: "+ customer.name());
            System.out.println("Transactions: ");
            for(double d : customer.transactions()){//unboxing
                System.out.printf("$%10.2f (%s)%n",d,d<0 ? "debit" : "credit");
            }

        }
    }
