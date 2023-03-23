package com.alexgroot.week3.Encryption;

public class runner {
    public static void main(String[] args) {


        String enStr = Encryptor.encrypt("HELLO john ZA za", 4);
        System.out.println(enStr);

        String deStr = Decryptor.decrypt(enStr, 4);
        System.out.println(deStr);


    }
}
