package com.alexgroot.bankProj;

import com.alexgroot.bankProj.domain.BankAccount;
import com.alexgroot.bankProj.domain.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        User henk = new User(new BankAccount("22"), "henk", "vlierdam", new Date());
        User tom = new User(new BankAccount("23"), "tom", "java", new Date());
        User jan = new User(new BankAccount("24"), "jan", "potsdam", new Date());

        User.transaction(new BigDecimal(200), henk.getBankAccount(), tom.getBankAccount());

        Optional<BankAccount> accountOptional = chooseCustomer(sc);
        do {
            if (accountOptional.isEmpty()) {
                return;
            }
            BankAccount account = accountOptional.get();
            System.out.println("saldo: " + account.calculateBalance());
            System.out.println("Optie 1: storten\n" +
                    "Optie 2: overboeken\n" +
                    "Optie 3: transactiegeschiedenis inzien.\n" +
                    "Optie 4: terug naar klant kiezen. \n"
                    + "Optie 5: stoppen. ");


            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("gaat uw gang");
                    account.stort(sc.nextBigDecimal());
                    break;
                case 2:
                    System.out.println("welke klant?");
                    sc.next();
                    Optional<BankAccount> acc2 = chooseCustomer(sc);
                    if (acc2.isEmpty()) {
                        System.out.println("user does not exist");
                        break;
                    }
                    System.out.println("hoeveel?");
                    BigDecimal amount = sc.nextBigDecimal();
                    if (amount.doubleValue() > 0) {
                        User.transaction(amount, acc2.get(), account);
                    } else {
                        System.out.println("bad transaction");
                    }
                    break;
                case 3:
                    System.out.println(account.getTransactions());
                case 4:
                    break;
                case 5:
                    return;
            }

        }
        while (true);


    }

    public static Optional<BankAccount> chooseCustomer(Scanner sc) {


        Optional<BankAccount> account = Optional.empty();

        do {
            System.out.println("1. Van welk persoon wilt u de gegevens hebben" +
                    "\n2. van welke rekening wilt u de gegevens hebben? " +
                    "\n3. stoppen met klant kiezen");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("please enter the name");
                String name = sc.nextLine();
                account = User.getUserByName(name);
            } else if (choice == 2) {
                System.out.println("please enter the bank number ");
                String number = sc.nextLine();
                account = User.getUserByNumber(number);
            } else if (choice == 3) {
                break;
            }

        }
        while (account.isEmpty());

        return account;

    }


}
