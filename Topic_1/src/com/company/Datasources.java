package com.company;

class Datasources {
    private static String msg = "Data source level";

    //static nasted class
    public static class NestedStaticClass {
        public void printmessage(){
            System.out.println("Databases are from " + msg);
        }
    }
}
