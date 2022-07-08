interface Drawable {
    void draw();
}

class DrawCircle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}

class DrawSquare implements Drawable{
    public void draw(){
        System.out.println("drawing square");
    }
}

class demo{
    public static void main(String[] args){
        DrawCircle d1 = new DrawCircle();
        DrawSquare d2 = new DrawSquare();
        d1.draw();
        d2.draw();
    }
}