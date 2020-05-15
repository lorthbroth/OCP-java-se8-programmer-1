package com.company;

import java.util.Objects;

class Programming {
    void Designation(){
        System.out.println("Web development");
    }

}

class LanguageName extends Programming{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        name = "HTML";
        return name;
    }

    /*LanguageName(String name) {
        this.name = name;
        name = "HTML";
    }*/

    @Override
    public String toString() {
        return "LanguageName{" +
                "name='" + name + '\'' +
                '}';
    }
}

abstract class Backend{

    private String backs;

    public String getBacks(){
        backs = "Spring boot";
        return backs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Backend)) return false;
        Backend backend = (Backend) o;
        return backs.equals(backend.backs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backs);
    }

    public abstract void framework();
    public void info(){
        System.out.println("back-end is not for the end user");
    }
}

//subclass inherits from backend
class Php extends Backend{
    public void framework(){
        System.out.println("Leravel is a PHP framewok");
    }
}
