import java.awt.*;
import java.applet.*;

public class almiranteFinals extends Applet {
	

	
	public void init() {
		
	}

	public void paint(Graphics g) {
		resize(2000, 1000);
		
		
		//clouds
		g.setColor(new Color(66, 16, 9));
		g.fillRect(0,0,2000,200);
		
		//ground
		g.setColor(new Color(32, 9, 7));
		g.fillRect(0,800,2000,250);
		
		//middle fire
		g.setColor(new Color(219, 76, 10));
		g.fillRect(0,120,2000,720);
		
		//house1 (left-right)
		g.setColor(new Color(32, 9, 7));
		g.fillRect(50,580,150,270);
		//roof
		int rx[] = {130,20,230};
		int ry[] = {450,580,580};
		g.fillPolygon(rx,ry,rx.length);
		g.fillRect(170,475,20,60); //chimney
		//2nd floor window
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(107,510,40,50,2,2);
		//1st floor window
		g.fillRoundRect(85, 600, 80, 100, 2, 2); 
		//window bars
		g.setColor(new Color(32, 9, 7));
		g.fillRect(107, 530, 40, 5);
		g.fillRect(125, 510, 5, 60);
		g.fillRect(108, 600, 5, 100);
		g.fillRect(136, 600, 5, 100);
		g.fillRect(85, 625, 80, 5);
		g.fillRect(85, 650, 80, 5);
		g.fillRect(85, 675, 80, 5);
		
		//house2
		g.setColor(new Color(32, 9, 7));
		g.fillRect(330,700,150,150);
		//roof
		int rx1[] = {405,300,510};
		int ry1[] = {600,700,700};
		g.fillPolygon(rx1,ry1,rx1.length);
		g.fillRect(450,600,20,65); //chimney
		//window
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(350,720,40,40,2,2);
		g.fillRoundRect(420,720,40,40,2,2);
		//window bars
		g.setColor(new Color(32, 9, 7));
		g.fillRect(367,720,5,40);
		g.fillRect(437,720,5,40);
		g.fillRect(350,738,40,5);
		g.fillRect(420,738,40,5);
		
		//Altar
		g.setColor(new Color(32, 9, 7));
		g.fillRect(600,350,100,500);
		//roof
		int rx2[] = {650, 585, 713};
		int ry2[] = {220, 350, 350};
		g.fillPolygon(rx2,ry2,rx2.length);
		//window-top
		g.setColor(new Color(219, 76, 10));
		g.fillOval(620, 370, 60, 60);
		//window bars
		g.setColor(new Color(32, 9, 7));
		g.fillRect(620, 400, 60, 5);
		g.fillRect(648, 370, 5, 60);
		
		//House 3
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1300,580,400,270);
		//roof1
		int rx3[] = {1400, 1270,1520 };
		int ry3[] = {450, 580, 580};
		g.fillPolygon(rx3,ry3,rx3.length);
		//roof2
		int rx4[] = {1600, 1450, 1725};
		int ry4[] = {450, 580, 580};
		g.fillPolygon(rx4,ry4,rx4.length);
		//Chimney1
		g.fillRect(1440,450,20,80);
		//Chimney2
		g.fillRect(1650,450,20,80);
		
		//Window1 1st floor
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(1350, 600, 90, 110, 2, 2);
		//WindowBars 1st floor
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1350, 650, 90, 5);
		g.fillRect(1350, 622, 90, 5);
		g.fillRect(1350, 678, 90, 5);
		g.fillRect(1377, 600, 5, 110);
		g.fillRect(1410, 600, 5, 110);
		
		//Window1 2nd Floor
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(1375,510,40,50,2,2);
		//WindowBars 2nd Floor
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1375,533,40,5);
		g.fillRect(1393,510,5,60);
		
		//Window2 1st floor
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(1545, 600, 100, 110, 2, 2);
		//WindowBars2 1st Floor
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1545, 650, 100, 5);
		g.fillRect(1545, 622, 100, 5);
		g.fillRect(1545, 678, 100, 5);
		g.fillRect(1574, 600, 5, 110);
		g.fillRect(1610, 600, 5, 110);
		
		//Window2 2nd Floor
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(1575,510,40,50,2,2); 
		//Windowbars2 2nd floor
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1575,533,40,5);
		g.fillRect(1593,510,5,60);
		
		//house4
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1820,700,150,150);
		//roof
		int rx5[] = {1950,1800,2000};
		int ry5[] = {600,700,700};
		g.fillPolygon(rx5,ry5,rx5.length);
		//window
		g.setColor(new Color(219, 76, 10));
		g.fillRoundRect(1850,720,40,40,2,2);
		//windowbars
		g.setColor(new Color(32, 9, 7));
		g.fillRect(1850, 740, 90, 5);
		g.fillRect(1867, 720, 5, 90);
		
		//portal
		g.setColor(new Color(217, 233, 255));
		g.fillRoundRect(730,0,535,1000,10,10);
		//effect-left
		g.fillRoundRect(710,20,10,130,10,10);
		g.fillRoundRect(710,180,10,20,10,10);
		g.fillRoundRect(710,220,10,350,10,10);
		g.fillRoundRect(710,600,10,50,10,10);
		g.fillRoundRect(710,670,10,300,10,10);
		//effect-right
		g.fillRoundRect(1275,0,10,300,10,10);
		g.fillRoundRect(1275,320,10,40,10,10);
		g.fillRoundRect(1275,380,10,280,10,10);
		g.fillRoundRect(1275,680,10,20,10,10);
		g.fillRoundRect(1275,720,10,150,10,10);
		g.fillRoundRect(1275,890,10,70,10,10);
		
		//shadow
		g.setColor(new Color(172, 201, 230));
		g.fillOval(870,870,250,30);
		
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