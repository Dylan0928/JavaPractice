public class Rectangle {
    int width = 25;
    int height = 10;
    
    public Rectangle(){
        this.height = 10;
        this.width = 25;
    }
    public Rectangle(int length){
        this.height = length;
        this.width = length;
    }
    
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    
    public int getArea(){
        return width*height;
    }
    
    public void draw(){
        for(int i= 0; i<height ; i++){
            for(int j=0 ; j<width ; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
