// class MyThread implements Runnable
// {
//     public void run(){
//         for(int i=1; i<=10; i++){
//             System.out.println("Value Of i Is "+i);
//         }
//     }
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         Thread thr = new Thread(t1);
//         thr.start();
//     }
// }

// class MyAnotherThread extends Thread {
//     public void run(){
//         for(int i=10;i>=1;i--){

//             System.out.println("Another Thread = "+i);
//             try{
//                 Thread.sleep(20000);
//             }catch(Exception e){

//             }
//         }
//     }

//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         Thread thr = new Thread(t1);


//         AnotherThread t2 = new AnotherThread();
//         thr.start();
//         t2.start();
//     }
// }

class ThreadOp{
    public static void main(String[] args) {
        System.out.println("Program started...");
        int x= 56+34;
        System.out.println("Sum is"+x);

        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current running Therad is" +tname);


        t.setName("MyMain");
        System.out.println(t.getName());

        try{Thread.sleep(5000);
        }catch(Exception e){

        }

        System.out.println(t.getId());

        System.out.println("program ended...");
    }
}