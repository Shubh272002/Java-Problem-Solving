class Consumner extends Thread{
    Company c;
    
    Consumer(Company c)
    {
        this.c=c;
    }
    public void run(){
        while(true)
        {
            this.c.consume_item();
            try{Thread.sleep(20000);}catch(Exception e{
                
            })
        }
    }

}