package com.metin.adapter.design.pattern;

public class Test {

    public static void main(String[] args) {

        Crypt crypt = new CryptA();
        crypt.encrypt("Yusuf");
        crypt.decrypt("Metin");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.encrypt("Dilek");
        crypt.decrypt("Mehmet");

        System.out.println("-------------");

        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("Ahmet");
        crypt.decrypt("Acar");
    }
}
