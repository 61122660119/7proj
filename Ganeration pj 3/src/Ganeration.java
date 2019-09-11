import java.util.Scanner;

public class Ganeration {
    public static void main(String[] args) {
        System.out.println("สวัดดีคับ ท่านผู้ชม ของต้องรับสู่ ไอซ์แลนด์\n");

        // สร้างออบเจ็กต์จากคลาส Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณากรอก พ.ศ. : ");

        int score = sc.nextInt();

        if (score <= 2507) {
            // คำสั่งเมื่อเงื่อนไขเป็นจริง
            System.out.println("จัดอยู๋ในกลุ่ม Baly Boomer");
        } else if (score <= 2519) {
            // คำสั่งเมื่อเงื่อนไขเป็นจริง
            System.out.println("จัดอยู๋ในกลุ่ม GEN Y");
        } else if (score <= 2538) {
            // คำสั่งเมื่อเงื่อนไขเป็นจริง
            System.out.println("จัดอยู๋ในกลุ่ม YGEN X");
        } else {
            // คำสั่งเมื่อเงื่อนไขเป็นจริง
            System.out.println("จัดอยู๋ในกลุ่ม GEN Z");
        }
        // คำสั่งเมื่อเงื่อนไขเป็นจริง
            System.out.println("\nเสร็จสิ้น ");

        }
    }
