public class rectangleFor {
    
    public static void main(String[] args) {
       int  height=4;
       int width=4;
        
        for(int rowCounter=0;rowCounter<height; rowCounter++){
           for(int columnCounter=0;columnCounter<width;columnCounter++){
               System.out.print("*");
           }
           System.out.println();
        }   
    }    
}
