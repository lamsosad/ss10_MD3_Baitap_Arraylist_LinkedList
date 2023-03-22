package bai1_ArrayList;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Array: " + arrayList);
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn xóa trong mảng: ");
        int index = input.nextInt();
        arrayList.remove(index);
        //System.out.print("Nhập vị trí muốn thêm vào mảng: ");
        //        int index = input.nextInt();
        //        System.out.print("Nhập phần tử muốn thêm vào mảng: ");
        //        int number = input.nextInt();
//        arrayList.add(index,number);
        System.out.println("New Array" + arrayList);
        System.out.println("vị trí thứ: " + arrayList.indexOf(2) + " trong mảng");
    }
}
