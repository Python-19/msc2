/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmoments;
import java.io.*;
import java.util.*;

/**
 *
 * @author Merin
 */
public class KMoments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 15;
        String stream[] = {"a","b","c","b","d","a","c","d","a","b","d","c","a","a","b"};
        int zerothMoment = 0, firstMoment = 0, secondMoment = 0, count = 1, flag = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        for(String character : stream){
            System.out.print(character + "\t\t\t");
        }
        System.out.println();
        Arrays.sort(stream);
        for(int i = 1; i < n; i++)
    {
    if(stream[i] == stream[i - 1]){
        count++;
    }
    else
    {
        arrayList.add(count);
        count = 1;
    }
}
    arrayList.add(count);
    System.out.println("Zeroth moment:\t\t\t" + zerothMoment);
    for(int i : arrayList){
        firstMoment += i;
        secondMoment += i * i;
    }
    System.out.println("First Moment:\t\t\t" + firstMoment);
    System.out.println("Second Moment:\t\t\t" + secondMoment);
}

}
