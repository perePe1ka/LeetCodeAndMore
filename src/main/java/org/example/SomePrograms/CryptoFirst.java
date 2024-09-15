package org.example.SomePrograms;

class CryptoFirst {
    public String doCryptoFirst(String initPhrase) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < initPhrase.length(); i++) {
            char newChar = initPhrase.charAt(i);
            int newInt = newChar + 2;
            stringBuilder.append((char) newInt);
        }
        return stringBuilder.toString();
    }

    public String doDeCryptoFirst(String cryptoPhrase) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < cryptoPhrase.length(); i++) {
            char newChar = cryptoPhrase.charAt(i);
            int newInt = newChar - 2;
            stringBuilder.append((char) newInt);
        }
        return stringBuilder.toString();
    }
}