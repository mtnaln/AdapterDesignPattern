package com.metin.adapter.design.pattern;

public class CryptB implements Crypt {

    public void encrypt(String text) {

        System.out.println("#CryptB#encrypt()");
    }

    public void decrypt(String text) {

        System.out.println("#CryptB#decrypt()");
    }
}
