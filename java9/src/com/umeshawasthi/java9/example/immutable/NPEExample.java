package com.umeshawasthi.java9.example.immutable;

import java.util.List;

public class NPEExample {

    public static void main(String[] args) {

        List<String> immutableList = List.of("one", null);
    }
}
