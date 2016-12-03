public class rectangle {
    
    public static void main(String[] args) {
        int height=3; 
        int width=10;
        int rowCounter=0;
        int columnCounter=0;
        
        while (rowCounter<height){
            columnCounter=0;
            while (columnCounter<width){
                System.out.print("@");
                columnCounter++;
            }
          System.out.println();
          rowCounter++;
        }
      
    }
    
}
