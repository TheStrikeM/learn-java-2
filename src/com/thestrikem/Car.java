package com.thestrikem;

interface Car {
    String getMessage();
}

class Toyota implements Car {

    @Override
    public String getMessage() {
        return "Good driving";
    }
}
