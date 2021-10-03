package Mypackage;

import pl.wszib.lab1.Myclass;

public class MyExtends extends Myclass {
    @Override
    public void print() {
        super.print();
        super.name = "extended name";
        super.name1 = "extended name1";

    }
}
