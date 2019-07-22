public class d2b {

    public static void main(String[] args) {
        try {
            double dec = Double.parseDouble(args[0].toString());
            System.out.print(dec+" = ");
            double x = 0;
            double i = 0;
            double j;
            while(dec>=2*x){
                x = Math.pow(2, i);
                i++;
            }
            String bin = "";
            for(;i>0;i--){
                if (dec>=x){
                    bin=bin+1;
                    dec=dec-x;
                }else {
                    bin=bin+0;
                }
                x=x/2;
            }
            System.out.println(bin+".bin");
        }catch (Exception e){
            System.out.println("The input must be a positiv number");
        }
    }
}
