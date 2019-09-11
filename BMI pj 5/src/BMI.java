import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        // แสดงค่า
        System.out.println("ชื่ออะไรครับ:");

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try{
            name = dataIn.readLine();//รับชื่อจาก dataIn
        }

        catch (IOException e){
            System.out.println("Error!");
        }

        System.out.println(" สวัดดีครับ " +name+ "!");

        System.out.println(":คุณส่วนสูงเท่าไหร่ครับคุณ(ส่วนสูงทำเป็นเมตรก่อนนะครับ)");
        System.out.println(":คุณน้ำหนักเท่าไหร่ครับ");

        // หาตัวเลขส่วนสูงเก็บไว้ที่ h
        double height ;
        String  H  = "";
        // หาตัวเลขน้ำหนักเก็บไว้ที่ w
        double weight ;
        String W  = "";
        double b = 0.0d;

        // สแกนรับค่าส่วนสูงจากแป้นพิมพ์มาเก็บไว้ที่ H และ สแกนรับค่าน้ำหนักจากแป้นพิมพ์มาเก็บไว้ที่ W
        try{
            System.out.println(":พิมพ์ ส่วนสูงคุณ");
            H =  br.readLine();
            System.out.println(":พิมพ์ น้ำหนักคุณ");
            W = br.readLine();
        }// แสดงค่า Error เมื่อผิด
        catch (IOException e){
            System.out.println("Error!"); }
        //คำนวน
        height= Double.parseDouble(H);
        weight = Double.parseDouble(W);
        b= weight/(height*height);

        System.out.println("BMI ="  + b  );
        // คำสั่งเมื่อเงื่อนไขเป็นจริง
        if(b>40){
            System.out.println("อ้วนมากๆ");
        }
        // คำสั่งเมื่อเงื่อนไขเป็นจริง
        else if(b>35){
            System.out.println("อ้วนขั้น 2");
        }
        else if(b>28.5){
                System.out.println("อ้วนขั้น 1");
        }
        // คำสั่งเมื่อเงื่อนไขเป็นจริง
        else if(b>23.5){
            System.out.println("น้ำหนักเกิน");
        }
        // คำสั่งเมื่อเงื่อนไขเป็นจริง
        else if(b>18.5){
            System.out.println("มาตรฐาน");
        }
        // คำสั่งเมื่อเงื่อนไขเป็นจริง
        else if(b<18.5){
            System.out.println("ต่ำกว่าปกติ");
        }


    }
}