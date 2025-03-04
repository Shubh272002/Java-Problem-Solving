class company{
    int n;
     synchronized public void prduce_item(int n)

    {
        this.n=n;
        System.out.println("Produced :"+this.n);

    }
     synchronized public void consume_item()
    {

        System.out.println("Consumed: "+this.n);
        return this.n;


        


    }
}