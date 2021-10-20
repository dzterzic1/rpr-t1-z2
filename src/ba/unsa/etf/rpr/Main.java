package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Unesite prirodan broj: ");
        Scanner ulaz=new Scanner (System.in);   //ulazni tok
        int n=ulaz.nextInt();                   //unosimo neki int
        System.out.println("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=1; i<n; i++){
            if(i%sumaCifara(i)==0) System.out.print(i + " ");
        }
    }
    private static int sumaCifara(int x){    //iz static mozemo pozvati samo static
        int suma=0;
        while(x!=0){
            suma+=x%10;
            x/=10;
        }
        return suma;
    }
}
