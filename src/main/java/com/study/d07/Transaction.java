package com.study.d07;

// 超載(Overloading)練習
public class Transaction {
    void sumbit(int money){
        System.out.printf("現金 $%d 結帳\n", money);
    }
    void sumbit(int money1, int money2, int money3){
        System.out.printf("現金1 $%d 結帳\n", money1);
        System.out.printf("現金2 $%d 結帳\n", money2);
        System.out.printf("現金3 $%d 結帳\n", money3);
    }
    void sumbit(String cardNo){
        System.out.printf("Yoyo 卡號: $%s 結帳\n", cardNo);
    }
    void sumbit(Double point){
        System.out.printf("點數 $%.1f 結帳\n", point);
    }
    void sumbit(){
        System.out.println("賒帳");
    }
    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.sumbit();
        t.sumbit(10.5);
        t.sumbit("111-222-333-444");
        t.sumbit(100);
        t.sumbit(100, 200, 300);
    }
}