package JavaBasics;
public class binaryToDecimal {

    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while (binNum>0) {
            int lastDigit=binNum%10;
            decNum+=lastDigit*(int)Math.pow(2, pow);
            pow++;
            binNum/=10;

        }
        System.out.println("decimal form of "+myNum+" is :"+decNum);

    }
    public static void main(String[] args) {
        binToDec(111);
    }
}