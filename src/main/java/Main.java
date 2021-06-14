import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        xehoi xh = new xehoi();
        String[] xe = {"Ford", "Honda", "Toyota", "Suzuki", "Isuzu"};
        System.out.println("Mảng xe hơi đã sắp xếp là: ");
        for (int i = 0; i < xh.sosanh(xe).length; i++) {
            System.out.println(xh.sosanh(xe)[i]);
        }

        System.out.println("Nhập số sinh viên: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("so sv là" + n);
        boolean check = false;
        String[] mang = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            do  {
                System.out.println("Nhập tên sinh viên thứ " + (i + 1));
                mang[i] = sc2.nextLine();
                System.out.println("Mảng nhập là: " + mang[i]);
                for (int j = 0; j < mang[i].length(); j++) {
                    check = true;
                    if (Character.isDigit(mang[i].charAt(j)) == true) {
                        System.out.println("tên không đượcnhập số");
                        check = false;
                    }
                    }

               }  while (check == false);
            }
chuanhoa ch = new chuanhoa();

        System.out.println("Danh sách sinh viên đã được chuẩn hóa và sắp xếp:");
        for (int i= 0; i<n;i++){
            System.out.println(ch.chuanhoaten(mang)[i]);
        }
        }


    }


