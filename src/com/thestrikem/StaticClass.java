package com.thestrikem;

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
