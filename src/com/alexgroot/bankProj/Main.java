package com.alexgroot.bankProj;

import com.alexgroot.bankProj.domain.BankAccount;
import com.alexgroot.bankProj.domain.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User henk = new User(new BankAccount("22"), "henk", "vlierdam", new Date());
        User tom = new User(new BankAccount("23"), "tom", "java", new Date());
        User jan = new User(new BankAccount("24"), "jan", "potsdam", new Date());

        User.transaction(new BigDecimal(200), henk.getBankAccount(), tom.getBankAccount());
        BankAccount account = chooseCustomer(sc);

        System.out.println(" optie 1: storten\n" +
                "Optie 2: overboeken\n" +
                "Optie 3: transactiegeschiedenis inzien.\n" +
                "OPtie 4: terug naar klant kiezen");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("gaat uw gang");
                account.stort(sc.nextBigDecimal());
                break;
            case 2:
                System.out.println("welk banknummer?");
                sc.nextLine();
                BankAccount acc2 = chooseCustomer(sc);
                if (acc2 == null) {
                    System.out.println("user does not exist");
                    break;
                }
                System.out.println("hoeveel?");
                int amount = sc.nextInt();
                if (amount > 0) {
                    User.transaction(BigDecimal.valueOf(amount), acc2, account);
                } else {
                    System.out.println("bad transaction");
                }
                break;
            case 3:
                System.out.println(account.getTransactions());
            case 4:
                break;
        }
        System.out.println(account.getTransactions());

    }

    public static BankAccount chooseCustomer(Scanner sc) {
        System.out.println(" Van welk persoon of rekening wilt u de gegevens hebben?");
        String name = sc.nextLine();

        Optional<BankAccount> account = User.getUserByName(name);
        return account.orElse(null);

    }


}
