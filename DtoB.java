//Decimálisról binárisra konvertáló program

import java.util.Scanner;

public class DtoB {

    public static void main(String[] args) {
       
        System.out.println("Adj meg egy pozitív egész számot:");
        double dec = 0;
        try {
            dec = Double.parseDouble(new Scanner(System.in).nextLine());
        }catch (Exception e){
            System.out.println("Nem a kérésnek megfelelő számot adtál meg!");
        }
        double x = 0;
        double i = 0;
        for(; dec>=2*x; i++){
            x = Math.pow(2, i);
        }
        String bin = "";
        for(; i>0; i--){
            if (dec>=x){
                bin=bin+1;
                dec=dec-x;
            }else {
                bin=bin+0;
            }
            x = x/2;
        }
        System.out.println(bin+" (bináris)");
    }
}