#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;

void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int color){
	setcolor(color);
	line(x1, y1, x2, y2);
	line(x1, y1, x3, y3);
	line(x2, y2, x3, y3);
}

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	outtextxy(10, 10, "51 - Hitesh Solanki");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	//divide the screen in Four parts
	line(0, height/2, width, height/2);
	line(width/2, 0, width/2, height);
	
	int x1 = (width / 2) + (width / 4) + 50, y1 = 50;
	int x2 = (width / 2) + (width / 4) - 100, y2 = height/2 - 100;
	int x3 = (width / 2) + (width / 4) + 100 , y3 = height/2 - 50;

	drawTriangle(x1, y1, x2, y2, x3, y3, WHITE);

	//reflection in y-axis
	int y1_new, y2_new, y3_new;
	y1_new = height - y1;
	y2_new = height - y2;
	y3_new = height - y3;
	drawTriangle(x1, y1_new, x2, y2_new, x3, y3_new, YELLOW);

	//reflection in x-axis
	int x1_new, x2_new, x3_new;
	x1_new = width - x1;
	x2_new = width - x2;
	x3_new = width - x3;
	drawTriangle(x1_new, y1, x2_new, y2, x3_new, y3, CYAN);
	
	//reflection in origin
	drawTriangle(x1_new, y1_new, x2_new, y2_new, x3_new, y3_new, GREEN);

    getch();
    closegraph();
}
