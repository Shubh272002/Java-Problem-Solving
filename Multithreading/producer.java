class Producer extends Thread{

    Company c;

    Produce(Company c){
        this.c=c;

    }

    public void run(){
        int i=1;
        while(true){
            this.c.produce_item(i);
            try{
            Thread.sleep(20000);}
            catch(Exception e){
                
            }
            i++;
        }

    }
}