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

        Optional<BankAccount> accountOptional = chooseCustomer(sc);


        System.out.println(" optie 1: storten\n" +
                "Optie 2: overboeken\n" +
                "Optie 3: transactiegeschiedenis inzien.\n" +
                "OPtie 4: terug naar klant kiezen");

        int choice = sc.nextInt();
        if (accountOptional.isEmpty()) {
            return;
        }
        BankAccount account = accountOptional.get();

        switch (choice) {
            case 1:
                System.out.println("gaat uw gang");
                account.stort(sc.nextBigDecimal());
                break;
            case 2:
                System.out.println("welk banknummer?");
                sc.nextLine();
                Optional<BankAccount> acc2 = chooseCustomer(sc);
                if (acc2.isEmpty()) {
                    System.out.println("user does not exist");
                    break;
                }
                System.out.println("hoeveel?");
                int amount = sc.nextInt();
                if (amount > 0) {
                    User.transaction(BigDecimal.valueOf(amount), acc2.get(), account);
                } else {
                    System.out.println("bad transaction");
                }
                break;
            case 3:
                System.out.println(account.getTransactions());
            case 4:
                break;
        }


    }

    public static Optional<BankAccount> chooseCustomer(Scanner sc) {


        Optional<BankAccount> account = Optional.empty();

        do {
            System.out.println(" Van welk persoon of rekening wilt u de gegevens hebben?");
            String name = sc.nextLine();
            account = User.getUserByName(name);
        }
        while (account.isEmpty());

        return account;

    }


}
