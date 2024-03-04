package bcel;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Drivers {
    public static void main(String[] args) throws IOException {
        LCOM4Calculation calculation =new LCOM4Calculation();
        File file=new File("target/classes/bcel/Group.class");
        List<Group> lst = calculation.loadGroups(file);
        lst.forEach(System.out::println);
        int lcom4 = calculation.loadGroups(file).size();
        System.out.printf("LCOM4 of class %s is %d\n",file.getName(),lcom4);
    }
}
