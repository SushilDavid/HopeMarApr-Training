

public class Apart {
    private int bedroom;
    private int washroom;
    private int pg;
    private int kitchen;
    private int hall;
    private int diningroom;
    public Apart(int bedroom,int washroom,int kitchen, int hall,int diningroom,int pg){
       this.bedroom=bedroom;
       this.washroom=washroom;
         this.kitchen=kitchen;
            this.hall=hall;
               this.diningroom=diningroom;
                  this.pg=pg;
    }
    public void display(int x){
        System.out.println("Apartment "+x);
        System.out.println("Bedroom:"+bedroom);
        System.out.println("Washroom:"+washroom);
        System.out.println("Kitchen:"+kitchen);
        System.out.println("Hall:"+hall);
        System.out.println("Diningroom:"+diningroom);
        System.out.println("PG:"+pg);
        System.out.println("Apartment "+x+" has "+bedroom+" bedroom");
    }
    public static void main(String[] args) {
        Apart a1=new Apart(2,1,1,1,1,0);
        Apart a2=new Apart(3,2,1,1,1,0);
        Apart a3=new Apart(4,3,1,1,1,0);
        a1.display(1);
        a2.display(2);
        a3.display(3);

    }
}
