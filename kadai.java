import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        String[]kaitou={"まったくそうではない","あまりそうじゃないかも","そうかも","完全に当てはまる"};
        String[]hello={"相性チェック!","Input Your name to Start",
                "1問 私はカレーが好きだ。(0まったく 1あまり 2まぁまぁ 3当てはまる)",
                "2問　休日外出をよくする。(0まったく 1あまり 2まぁまぁ 3当てはまる)",
                "3問　キーボードをついついそろばんと呼んでしまう。(0まったく 1あまり 2まぁまぁ 3当てはまる)",
                "4問　９時間以上睡眠しないとダメだ。(0まったく 1あまり 2まぁまぁ 3当てはまる)",
                "5問　ついつい、いろんな本を買って積んでしまう。(0まったく 1あまり 2まぁまぁ 3当てはまる)"};
        System.out.println(hello[0]);

        try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();
        }
        System.out.println(hello[1]);

        Scanner scanner9 = new Scanner(System.in);
        String str9=scanner9.next();
        System.out.println("Welcome "+str9+"!  以下の質問の答えを０−３番から選んで入力し、Enterを押して下さい。");
        try{Thread.sleep(4000);}catch(InterruptedException e){e.printStackTrace();
        }

        System.out.println(hello[2]);
        Scanner scanner1 = new Scanner(System.in);
        int str1=scanner1.nextInt();
        System.out.println(kaitou[str1]);
        try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();
        }


        System.out.println(hello[3]);
        Scanner scanner2 = new Scanner(System.in);
        int str2=scanner2.nextInt();
        System.out.println(kaitou[str2]);
        try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();
        }

        System.out.println(hello[4]);
        Scanner scanner3 = new Scanner(System.in);
        int str3=scanner3.nextInt();
        System.out.println(kaitou[str3]);
        try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();
        }

        System.out.println(hello[5]);
        Scanner scanner4 = new Scanner(System.in);
        int str4=scanner4.nextInt();
        System.out.println(kaitou[str4]);
        try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();
        }

        System.out.println(hello[6]);
        Scanner scanner5 = new Scanner(System.in);
        int str5=scanner5.nextInt();
        System.out.println(kaitou[str5]);
        try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();
        }

        int answer;
        answer=str1+str2+str3+str4+str5;
        //System.out.println(answer);
        System.out.print("Processing:");

        for(int i=0;i<10;i++){System.out.print(".");
            try{Thread.sleep(500);}catch(InterruptedException e){e.printStackTrace();
            }}
        System.out.println("　");
        System.out.println("　");
        System.out.print("結果：");


    if (answer>10){System.out.println("相性バッチリ");}  else {if (5<answer || answer<=10)System.out.println("まぁまぁですが、一緒に遊ぼう!");}
         {if (5>answer)System.out.println("あぁ〜残念！");}


           ;}     }

