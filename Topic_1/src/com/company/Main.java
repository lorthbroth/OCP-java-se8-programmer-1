package com.company;

/**
 * 
 * @author dominic
 *
 */

public class Main {

    public static void main(String[] args) {
        RainbowColor color = RainbowColor.RED;

        Main es = new Main();
        String colorCode = es.getColorCode(color);
        System.out.println("ColorCode for " + color + " is = #" + colorCode);

        LanguageName test = new LanguageName();
        System.out.println(test.getName() + " is the basic front-end markup language");

        Php myphp = new Php();
        System.out.println(myphp.getBacks() + " can be back-end and front-end ");
        myphp.info();
        myphp.framework();

        //instance of nested static class
        Datasources.NestedStaticClass print = new Datasources.NestedStaticClass();
        print.printmessage();

        Test obj = null;
        if(obj instanceof Test)
            System.out.println("obj is instance of Test class");
        else
            System.out.println("obj is NOT instance of Test class");
    }

    public String getColorCode(RainbowColor color){
        String colorCode = "";

        switch (color) {
            // We use RED instead of RainbowColor.RED
            case RED:
                colorCode = "FF0000";
                break;
            case ORANGE:
                colorCode = "FFA500";
                break;
            case YELLOW:
                colorCode = "FFFF00";
                break;
            case GREEN:
                colorCode = "008000";
                break;
            case BLUE:
                colorCode = "0000FF";
                break;
            case INDIGO:
                colorCode = "4B0082";
                break;
            case VIOLET:
                colorCode = "EE82EE";
                break;
            default:
                break;
        }
        return colorCode;
    }
}
class Test{}
