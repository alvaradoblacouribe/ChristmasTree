/* To Do
- Add the Music by watching the YouTube Video
- Organize the star ratios 9 4 4 9 and 5 12 5 with methods and not hardcoding the numbers
- Ramdomize the coordinates for the colors?
*/



import java.awt.Color;
import java.awt.Graphics;
import sun.audio.*;

public class ChristmasTree {
  public static void main(String[] args) {
      //Step1:create an empty canvas
    DrawingPanel canvas= new DrawingPanel(500,500);
      //Step2: Pick up the pen
    Graphics c= canvas.getGraphics();
  // Method trying
    Trunk(200,300,400,440,c);
    Triangles(220,250,280,200,120,200,c);
    Star(92,178,c);
    Star(389,127,c);
    Star(160,50,c);
    Star(360,25,c);
    Star(27,70,c);
    Star(37,267,c);
    Star(363,210,c);
    Star(430,272,c);
    Star(300,80,c);
    canvas.setBackground(new Color(0,0,0));
    Lights(c, canvas);

  }
  public static void Triangles(int x1,int x2,int x3, int y1, int y2, int y3, Graphics c){
    c.setColor(new Color(0, 102, 0));
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
  public static void Trunk(int x1,int x2,int y1, int y2, Graphics c){
    int xpoints[]={x1,x2,x2,x1};
    int ypoints[]={y1,y1,y2,y2};
    c.drawPolygon(xpoints,ypoints, 4);
    c.setColor(new Color(102, 51, 0));
    c.fillPolygon(xpoints, ypoints, 4);
  }
  public static void Lights(Graphics c, DrawingPanel canvas){
    int width= 15;
    int height= 15;
    int height2=22;
    int width2=22;
    for (int i=0; i<=i;i++){
      canvas.sleep(300);
      NotOrange(width2,height2,c);
      Red(width, height,c);
      canvas.sleep(300);
      NotRed(width2,height2,c);
      Blue(width, height,c);
      canvas.sleep(300);
      NotBlue(width2,height2,c);
      Fuschia(width, height,c);
      canvas.sleep(300);
      NotFuschia(width2,height2,c);
      Orange(width, height,c);
    }
  }
  public static void PositionLights(int x, int y, int width, int height, Graphics c){
    c.drawOval(x,y,width,height);
    c.fillOval(x,y,width,height);
  }
  public static void Red(int width, int height,Graphics c){
    c.setColor(new Color(255, 51, 0));
    PositionLights(275,250,width,height,c);
    PositionLights(157,373,width,height,c);
    PositionLights(265,327,width,height,c);
}
  public static void NotRed(int width2, int height2,Graphics c){
    c.setColor(new Color(0, 102, 0));
    PositionLights(271,250,width2,height2,c);
    PositionLights(153,373,width2,height2,c);
    PositionLights(261,326,width2,height2,c);
}
  public static void Blue(int width, int height,Graphics c){
    c.setColor(new Color(0,0,220));
    PositionLights(220,350,width,height,c);
    PositionLights(337,336,width,height,c);
    PositionLights(216,240,width,height,c);
}
  public static void NotBlue(int width2, int height2,Graphics c){
    c.setColor(new Color(0, 102, 0));
    PositionLights(217,349,width2,height2,c);
    PositionLights(334,335,width2,height2,c);
    PositionLights(213,239,width2,height2,c);
  }
  public static void Fuschia(int width, int height,Graphics c){
    c.setColor(new Color(255, 0, 255));
    PositionLights(300,370,width,height,c);
    PositionLights(225,275,width,height,c);
}
  public static void NotFuschia(int width2, int height2,Graphics c){
    c.setColor(new Color(0, 102, 0));
    PositionLights(297,369,width2,height2,c);
    PositionLights(222,274,width2,height2,c);
}
  public static void Orange(int width, int height,Graphics c){
    c.setColor(new Color(255, 153, 51));
    PositionLights(290,300,width,height,c);
    PositionLights(185,314,width,height,c);
    PositionLights(244,206,width,height,c);
}
  public static void NotOrange(int width2, int height2,Graphics c){
    c.setColor(new Color(0,102, 0));
    PositionLights(287,299,width2,height2,c);
    PositionLights(182,313,width2,height2,c);
    PositionLights(241,205,width2,height2,c);

}
  public static void StarDrawing(int x1, int x2, int x3, int x4, int x5, int y1, int y2, int y3, int y4,Graphics c){
    c.setColor(new Color(255, 207, 0));
    int xpoints[]= {x1,x3,x5,x1,x2,x1,x3,x5,x4};
    int ypoints[]={y3,y1,y3,y3,y2,y2,y4,y2,y2};
    c.drawPolygon(xpoints, ypoints, 9);
    c.fillPolygon(xpoints,ypoints,9);

  }
  public static void Star (int x, int y,Graphics c){
    int x1= x;
    int x2= x1+9;
    int x3= x2+4;
    int x4= x3+4;
    int x5= x4+9;
    int y1= y;
    int y2= y1+5;
    int y3= y2+12;
    int y4= y3+5;
    StarDrawing(x1,x2,x3,x4,x5,y1,y2,y3,y4,c);
  }
  //This is for music ~ figure out by watching the YouTube Video
  /*public static class AL implements ActionListener{
	  public final void actionPerformed(ActionEvent e) {
		  music();
	  }
  }
  public static void music() {
	  AudioPlayer MPG= AudioPlayer.player;
	  AudioStream
	  AudioData
  }
  */
}

//canvas.sleep(1000);
//c.setColor(new Color(0, 102, 0));
