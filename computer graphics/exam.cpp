#include<stdio.h>
#include<conio.h>
#include<iostream>
#include<graphics.h>

using namespace std;

//The height of the screen : 479
//The width of the screen : 639

void floodFill(int x,int y, int set_color){
	if(getpixel(x, y) == BLACK){
		putpixel(x, y, set_color);
		floodFill(x, y - 1, set_color);
		floodFill(x, y + 1, set_color);
		floodFill(x - 1, y, set_color);
		floodFill(x + 1, y, set_color);
	}
}

void printText(int height, int width){
	int font = 4, size = 8, direction = 3, color = 15;

	while(!kbhit()){
		int x = rand() % width;
		int y = rand() % height;
		
		settextstyle(rand() % font, rand() % direction, rand() % size);
		setcolor(rand() % color);
		outtextxy(x, y, "Hitesh Solanki");
		
		delay(500);
	}
}

void smile(int height, int width){
	int x = width / 2;
	int y = height / 2;
	int radius = 80;
	
	setcolor(YELLOW);
	circle(x, y, radius);
	setfillstyle(SOLID_FILL, YELLOW);
	floodfill(x, y, YELLOW);
	
	//Eyes
	setcolor(BLACK);
	setfillstyle(SOLID_FILL, BLACK);
	fillellipse(width/2 + 25, height/2 - 30, 6, 10);
	fillellipse(width/2 - 25, height/2 - 30, 6, 10);

	//arc
	ellipse(width/2 - 10, height/2 + 10, 220, 320, 50, 60);
	
	cleardevice();
	
	setcolor(WHITE);
	line(0, 0, width, height);
}

void dda(int height, int width){
	float x1, y1, x2, y2;
	
	cout<<"Enter the x1 : ";
  	cin>>x1;
  	cout<<"Enter the y1 : ";
  	cin>>y1;
  	cout<<"Enter the x2 : ";
  	cin>>x2;
  	cout<<"Enter the y2 : ";
  	cin>>y2;
  	
	float dx = x2 - x1;
	float dy = y2 - y1;
	
	float step = dx > dy ? dx : dy;
	
	float x_inc = dx/step;
	float y_inc = dy/step;
	
	while(x1 != x2 || y1 != y2){
		
		putpixel(x1, y1, WHITE);
		
		x1 += x_inc;
		y1 += y_inc;
	}
	
	cout<<"Done";
}

void scaling(int sx, int sy){
	int left = 100, top = 100, bottom = 150, right= 150;
	
	rectangle(left, top, right, bottom);
	
	//after scaling
	setcolor(YELLOW);
	rectangle(left * sx, top * sy, right * sx, bottom * sy);
}

void bresenham(int x1, int y1, int x2, int y2)
{
    int m_new = 2 * (y2 - y1);
    int slope_error_new = m_new - (x2 - x1);
    for (int x = x1, y = y1; x <= x2; x++) {
        putpixel(x, y, WHITE);

        // Add slope to increment angle formed
        slope_error_new += m_new;

        // Slope error reached limit, time to
        // increment y and update slope error.
        if (slope_error_new >= 0) {
            y++;
            slope_error_new -= 2 * (x2 - x1);
        }
    }
}

main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	
	int width = getmaxx();
	int height = getmaxy();
	
	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

//	circle(width/2, height/2 , 100);
//	floodFill(width/2, height/2, YELLOW);

//	printText(height, width);

//	smile(height, width);

//	dda(height, width);

//	scaling(3, 2);
	
	bresenham(0, 0, 100, 400);
//	dda(height, width);
	
	getch();
	closegraph();
}
