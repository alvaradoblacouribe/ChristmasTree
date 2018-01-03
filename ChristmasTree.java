import java.awt.Color;
import java.awt.Graphics;

public class ChristmasTree {
  public static void main(String[] args) {
      //Step1:create an empty canvas
    DrawingPanel canvas= new DrawingPanel(500,500);
      //Step2: Pick up the pen
    Graphics c= canvas.getGraphics();
  // Method trying
    c.setColor(new Color(0, 102, 0));
    Triangles(220,250,280,200,120,200,c);
    Lights(c);

  }
  public static void Triangles(int x1,int x2,int x3, int y1, int y2, int y3, Graphics c){
    int xpoints []= {x1,x2,x3};
    int ypoints []= {y1,y2,y3};
    for (int i=1; i<=8; i++){
      int npoints=3;
      xpoints[0]= -20*i+x1;
      xpoints[2]= 20*i+x3;
      ypoints[0]= 25*i+y1;
      ypoints[1]= 25*i+y2;
      ypoints[2]= 25*i+y3;
      c.drawPolygon(xpoints, ypoints, npoints);
      c.fillPolygon(xpoints, ypoints, npoints);
    }
}
  public static void Lights(Graphics c){
    int width= 15;
    int height= 15;
    Red(width, height,c);
    Blue(width, height,c);
    Fuschia(width, height,c);
    Orange(width, height,c);
  }
  public static void PositionLights(int x, int y, int width, int height, Graphics c){
    c.drawOval(x,y,width,height);
    c.fillOval(x,y,width,height);
  }
  public static void Red(int width, int height,Graphics c){
    c.setColor(new Color(255, 51, 0));
    PositionLights(250,250,width,height,c);
}
  public static void Blue(int width, int height,Graphics c){
    c.setColor(new Color(0,0,220));
    PositionLights(200,350,width,height,c);
}
  public static void Fuschia(int width, int height,Graphics c){
    c.setColor(new Color(255, 0, 255));
    PositionLights(300,370,width,height,c);
}
  public static void Orange(int width, int height,Graphics c){
    c.setColor(new Color(255, 153, 51));
    PositionLights(290,300,width,height,c);
}

}
