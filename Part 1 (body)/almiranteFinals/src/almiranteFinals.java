import java.awt.*;
import java.applet.*;

public class almiranteFinals extends Applet {
	

	
	public void init() {
		
	}

	public void paint(Graphics g) {
		resize(2000, 1000);
		
	
  			
		
	//body (start)
	
		//body-glitch red
		int x3[] = {1010, 800, 1230};
  		int y3[] = {280,660,660};
  		g.setColor(new Color(237, 6, 119));
  		g.fillPolygon(x3, y3, x3.length);
		
		//body-glitch blue
		int x2[] = {990, 770, 1200};
  		int y2[] = {280,660,660};
  		g.setColor(new Color(22, 193, 243));
  		g.fillPolygon(x2, y2, x2.length);
		
		//body outline
		int x1[] = {1000, 780, 1220};
  		int y1[] = {280,660,660};
  		g.setColor(Color.black);
  		g.fillPolygon(x1, y1, x1.length);
  		
		//main body
		int x[] = {1000, 800, 1200};
  		int y[] = {300,650,650};
  		g.setColor(new Color(255, 233, 79));
  		g.fillPolygon(x, y, x.length);
  		
  		
  	
  	//body (closing)
  	
  	//Hat (start)
  		//Hat-up-glitch blue
  		g.setColor(new Color(22, 193, 243));
  		g.fillRoundRect(965,155,60,160,10,10);
  		
  		//Hat-up-glitch red
  		g.setColor(new Color(237, 6, 119));
  		g.fillRoundRect(975,155,60,160,10,10);
  
  		//Hat-up
  		g.setColor(Color.black);
  		g.fillRoundRect(975,155,50,160,10,10);
  		
  		//Hat-low-glitch blue
  		g.setColor(new Color(22, 193, 243));
  		g.fillRoundRect(915,310,50,20,10,10);
  		
  		//Hat-low-glitch red
  		g.setColor(new Color(237, 6, 119));
  		g.fillRoundRect(1050,310,35,20,10,10);
  		
  		//Hat-low
  		g.setColor(Color.black);
  		g.fillRoundRect(925,310,150,20,10,10);
  		
  	//Hat (closing)
  		
  	//Eyes (start)
  		//eye-outline
  		g.setColor(Color.black);
  		g.fillOval(927,422,145,115);
  		
  		//eye-white
  		g.setColor(Color.white);
  		g.fillOval(935,430,130,100);
  		
  		//filler for eyes
  		g.setColor(new Color(255, 233, 79));
  		g.fillRect(930,430,140,20);
  		
  		//filler for eyes (2)
  		g.setColor(new Color(255, 233, 79));
  		g.fillRect(960,400,80,40);
  		
  		//iris-glitch blue
  		g.setColor(new Color(22, 193, 243));
  		g.fillRoundRect(977,440,25,70,30,30);
  		
  		//iris-glitch red
  		g.setColor(new Color(237, 6, 119));
  		g.fillRoundRect(997,440,25,70,30,30);
  		
  		//iris
  		g.setColor(Color.black);
  		g.fillRoundRect(987,440,25,70,30,30);
  	
  		//eyebrow
  		g.setColor(Color.black);
  		g.fillRoundRect(925,440,150,10,10,10);
  		
  	//Eyes (closing)
  	
  	//Hands (start)
  		//hand-left
  		g.setColor(Color.black);
  		g.fillRect(850,650,20,150);
  		
  		g.setColor(Color.black);
  		g.fillOval(847,762,50,50);
  		
  		//hand-right
  		g.setColor(Color.black);
  		g.fillRect(1130,650,20,150);
  		
  		g.setColor(Color.black);
  		g.fillOval(1104,762,50,50);
  	
  	//Hands (closing) 
  		
  	//Feet (start)
  		//foot-left
  		//Horizontal1
  		g.setColor(Color.black);
  		g.fillRoundRect(930,650,20,75,20,20);
  		//Vertical
  		g.setColor(Color.black);
  		g.fillRoundRect(930,705,50,20,20,20);
  		//Horizontal2
  		g.setColor(Color.black);
  		g.fillRoundRect(960,705,20,50,20,20);
  		
  		
  		//foot-right
  		//Horizontal1
  		g.setColor(Color.black);
  		g.fillRoundRect(1050,650,20,75,20,20);
  		//Vertical
  		g.setColor(Color.black);
  		g.fillRoundRect(1020,705,50,20,20,20);
  		//Horizontal2
  		g.setColor(Color.black);
  		g.fillRoundRect(1020,705,20,50,20,20);
  	//Feet (closing)
  	
  	//bodylines (start)	
  		//bodylines-horizontal1
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(822,610,357,5);
  		
  		//bodylines-horizontal2
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(851,560,299,5);
  		
  		//bodylines-vertical1
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(900,610,5,40);
  		
  		//bodylines-vertical2
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(1000,610,5,40);
  		
  		//bodylines-vertical3
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(1100,610,5,40);
  		
  		//bodylines-vertical4
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(950,560,5,55);
  		
  		//bodylines-vertical4
  		g.setColor(new Color(161, 143, 52));
  		g.fillRect(1050,560,5,55);
  		
  	//bodylines (closing)
  	
  	//Bowtie (start)
  		//Bowtie left triangle
  		int x4[] = {1005, 935, 935};
  		int y4[] = {585,560,610};
  		g.setColor(Color.black);
  		g.fillPolygon(x4, y4, x4.length);
  		
  		//Bowtie right triangle
  		int x5[] = {995, 1065, 1065};
  		int y5[] = {585,560,610};
  		g.setColor(Color.black);
  		g.fillPolygon(x5, y5, x5.length);
  		
  	//Bowtie (closing)
  	
  	
  	
  		
	}
}