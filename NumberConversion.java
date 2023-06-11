public class NumberConversion {
    public static int binaryTodecimal(int bin_num,int deci_num,int index) {
        //Termination case
        if(bin_num==0){
            return deci_num;
        }
        //Business Logic
        deci_num = deci_num + (int)(Math.pow(2,index)*(bin_num%10));
        //Recursive call
        return binaryTodecimal(bin_num/10,deci_num,index+1);
    }

    public static void decimalTobinary(int deci_num,String bin_num) {
        //Termination case
        if(deci_num==0){
            System.out.println("Binary value of decinal number is: "+ bin_num);
            return;
        }
        //Business logic
        bin_num = deci_num%2+bin_num;
        //Recursive call
        decimalTobinary(deci_num/2, bin_num);
    }

    public static void binaryToctal(int deci_num,String oct_num,int index) {
        //Termination case
        if(deci_num==0){
            System.out.println("Octal value of binary number is:"+ oct_num);
            return;
        }
        //Business Logic
        oct_num = deci_num%8 + oct_num;
        //Recursive call
        binaryToctal(deci_num/10,oct_num,index+1);
    }

    public static void octalTobinary(int oct_num,String bin_num) {
        //Termination case
        if(oct_num==0){
            System.out.println("Binary value of octal number is: "+ bin_num);
            return;
        }
        //Business logic
        switch(oct_num%10){
            case 0: bin_num = "000"+bin_num;
                    break;
            case 1: bin_num = "001"+bin_num;
                    break;
            case 2: bin_num = "010"+bin_num;
                    break;
            case 3: bin_num = "011"+bin_num;
                    break;
            case 4: bin_num = "100"+bin_num;
                    break;
            case 5: bin_num = "101"+bin_num;
                    break;
            case 6: bin_num = "110"+bin_num;
                    break;
            case 7: bin_num = "111"+bin_num;
                    break;
            case 8: bin_num = "001"+bin_num;
                    break;
            default:System.out.println("Not working!!");
        }
        //Recursive call
        octalTobinary(oct_num/10, bin_num);
    }

    public static int octalTodecimal(int octal_num,int deci_num,int index) {
        //Termination case
        if(octal_num==0){
            return deci_num;
        }
        //Business Logic
        deci_num = deci_num + (int)(Math.pow(8,index)*(octal_num%10));
        //Recursive call
        return octalTodecimal(octal_num/10,deci_num,index+1);
    }

    public static void HexaTobinary(String hexa_num,String bin_num) {
        //Termination case
        if(hexa_num.length()==0){
            System.out.println("Binary value of Hexadecimal number is: "+ bin_num);
            return;
        }
        //Business logic
        switch(hexa_num.charAt(0)){
            case '0': bin_num = bin_num + "0000";
                    break;
            case '1': bin_num = bin_num + "0001"; 
                    break;
            case '2': bin_num = bin_num + "0010";
                    break;
            case '3': bin_num = bin_num + "0011";
                    break;
            case '4': bin_num = bin_num + "0100";
                    break;
            case '5': bin_num = bin_num + "0101";
                    break;
            case '6': bin_num = bin_num + "0110";
                    break;
            case '7': bin_num = bin_num + "0111";
                    break;
            case '8': bin_num = bin_num + "1000";
                    break;
            case '9': bin_num = bin_num + "1001";
                    break;
            case 'A': bin_num = bin_num + "1010";
                    break;
            case 'B': bin_num = bin_num + "1011";
                    break;
            case 'C': bin_num = bin_num + "1100";
                    break;
            case 'D': bin_num = bin_num + "1101";
                    break;
            case 'E': bin_num = bin_num + "1110";
                    break;
            case 'F': bin_num = bin_num + "1111";
                    break;

            default:System.out.println("Not working!!");
        }
        //Recursive call
        HexaTobinary(hexa_num.substring(1), bin_num);
    }

    public static int HexaTodecimal(String hexa_num,int deci_num,int index,int count) {
        //Termination case
        if(index<0){
            return deci_num;
        }
        //Business Logic
        //System.out.println(hexa_num.charAt(index));
        if(hexa_num.charAt(index)=='A'){
            deci_num = deci_num + (int)(Math.pow(16,count)*(10));    
        }
        else if(hexa_num.charAt(index)=='B'){
            deci_num = deci_num + (int)(Math.pow(16,count)*(11));    
        }
        else if(hexa_num.charAt(index)=='C'){
            deci_num = deci_num + (int)(Math.pow(16,count)*(12));    
        }
        else if(hexa_num.charAt(index)=='D'){
            deci_num = deci_num + (int)(Math.pow(16,count)*(13));    
        }
        else if(hexa_num.charAt(index)=='E'){
            deci_num = deci_num + (int)(Math.pow(16,count)*(14));    
        }        
        else if(hexa_num.charAt(index)=='F'){
            deci_num = deci_num + (int)(Math.pow(16,count)*(15));    
        }
        else{
            deci_num = deci_num + (int)(Math.pow(16,count)*(Integer.parseInt(""+hexa_num.charAt(index))));
        }
        
        //Recursive call
        return HexaTodecimal(hexa_num,deci_num,index-1,count+1);
    }

    public static void decimalToHexa(int deci_num,String hexa_num) {
        //Termination case
        if(deci_num==0){
            System.out.println("Hexadecimal value of decinal number is: "+ hexa_num);
            return;
        }
        //Business logic
        if(deci_num%16==10){
            hexa_num = "A"+hexa_num;    
        }
        else if(deci_num%16==11){
            hexa_num = "B"+hexa_num;    
        }
        else if(deci_num%16==12){
            hexa_num = "C"+hexa_num;    
        }
        else if(deci_num%16==13){
            hexa_num = "D"+hexa_num;    
        }
        else if(deci_num%16==14){
            hexa_num = "E"+hexa_num;    
        }  
        else if(deci_num%16==15){
            hexa_num = "F"+hexa_num;    
        }
        else{
            hexa_num = deci_num%16+hexa_num;
        }

        
        //Recursive call
        decimalToHexa(deci_num/16, hexa_num);
    }

    public static void main(String[] args) {
        System.out.println("The decimal value of binary number is: "+binaryTodecimal(10101, 0, 0));
        decimalTobinary(21, "");

        binaryToctal(binaryTodecimal(10101, 0, 0), "", 0);
        octalTobinary(21, "");

        System.out.println("The decimal value of octal number is: "+octalTodecimal(25, 0, 0));
        HexaTobinary("2A", "");

        System.out.println("The decimal value of Hexadecimal number is: "+ HexaTodecimal("6A", 0, ("6A".length()-1),0));
        decimalToHexa(125, "");


    }
}
