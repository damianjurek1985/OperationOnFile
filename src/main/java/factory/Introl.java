package factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Introl {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Projects\\OperationOnXmlFile\\src\\main\\java\\factory\\factory.txt"));
        ArrayList<String> list = new ArrayList();
        while (sc.hasNextLine()){
            String facory = sc.nextLine();
            list.add(facory);
        }
        for ( String fact : list){
            System.out.println(fact);
        }
    }
}
