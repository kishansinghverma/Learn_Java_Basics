/*
package xyz;
package abc;

we cant specify more than one package statement in the file
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Packages_Basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> li=new ArrayList<>();

        for (int i=0; i<5; i++){
            li.add(sc.nextInt());
        }

        ListIterator<Integer> lr=li.listIterator(li.size());
        while(lr.hasPrevious()){
            System.out.println(lr.previous());
        }
    }


}
