package com.thestrikem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum CarEnum {
    SMALL("Генадий"), BIG("Валерий");
    private String name;
    CarEnum(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}


public class StaticClass {
    private String[] messages;

    StaticClass(String[] messages) {
        this.messages = messages;
    }

    String[] getAllMessages() {
        return this.messages;
    }

    void getAllMessagesWithPrint(CarEnum type) {
        if (type == CarEnum.BIG) { System.out.println("This is BIG"); }
        else if (type == CarEnum.SMALL) { System.out.println("This is SMALL"); }

        for (String message : messages) { System.out.println(message); }
    }
}

class ExampleClass {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass(new String[]{"Привет!", "Пока!"});
        System.out.println(staticClass.getAllMessages());
        staticClass.getAllMessagesWithPrint(CarEnum.BIG);

        System.out.println(CarEnum.BIG.getName());
    }
}

class ExampleClass2 {
    private String[] nameList;

    ExampleClass2(String[] nameList) {
        this.nameList = nameList;
    }

    boolean isItemInList(String findValue) {
        boolean result = false;
        for (String name : nameList) {
            if (name.equals(findValue)) { result = true; break; }
        }
        return result;
    }

    int getIndexOnList(String findValue) {
        boolean result = false;
        int index = 0;
        for (int name = 0; name < nameList.length; name++) {
            if (nameList[name].equals(findValue)) { result = true; index = name; break; }
        }
        if (result) { return index; }
        else { return -1; }
    }

    String getItemOnList(int index) {
        return nameList[index];
    }

    int parseToInt(String value) {
        int[] numbersList = {0,1,2,3,4,5,6,7,8,9};
        return Integer.parseInt(value);
    }

    int parseToIntWithValueOf(String value) {
        return Integer.valueOf(value);
    }

    public String[] getNameList() {
        return nameList;
    }

    public static void main(String[] args) throws IOException {
        ExampleClass2 exampleClass2 = new ExampleClass2(new String[]{"Генадий", "Василий", "Петр"});
        int result = 0;
        String findValue = "Петр";

        if (exampleClass2.isItemInList(findValue)) {
            result = exampleClass2.getIndexOnList(findValue);
            System.out.println(exampleClass2.getNameList());
        }
        else {
            System.out.println(false);
        }

        System.out.println(exampleClass2.parseToInt("576"));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        for (final int item : list) {
            System.out.println(item);
        }

        System.out.println(list);

        String item = "test";
        String item2 = "test";
        if (item == item2) {
            System.out.println("True 1");
        }
        if (item.equals(item2)) {
            System.out.println("True 2");
        }

        System.out.println(new Date());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        boolean resultS = name == "Генадий" || name == "Василий";
        System.out.println("Your name is " + name + " " + resultS);
    }
}

