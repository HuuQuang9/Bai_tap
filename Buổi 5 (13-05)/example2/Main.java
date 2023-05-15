package day5.example2;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Huan");
        System.out.println(customer.getName());
        customer.setMember(true);
        System.out.println(customer.isMember());
        customer.setMemberType("Gold");
        System.out.println(customer.getMemberType());
    }
}
