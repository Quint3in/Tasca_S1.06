package org.example;

public class NoGenericMethods {
    private Object element1;
    private Object element2;
    private Object element3;

    public NoGenericMethods(Object element1, Object element2, Object element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "element1=" + element1 +
                ", element2=" + element2 +
                ", element3=" + element3 +
                '}';
    }
}
