#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	outtextxy(10, 10, "51 - Hitesh Solanki");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	int x = width / 2;
	int y = height / 2;
	
	setcolor(YELLOW);
	circle(x, y, 50);
	setfillstyle(SOLID_FILL, YELLOW);
	floodfill(x, y, YELLOW);
	
	setcolor(BLACK);
	setfillstyle(SOLID_FILL, BLACK);
	fillellipse(x - 13, y - 10, 3, 7);
	fillellipse(x + 13, y - 10, 3, 7);
	
	ellipse(x, y + 10, 180, 360 , 26, 7);
	ellipse(x, y + 10, 180, 360 , 26, 14);
	


    getch();
    closegraph();
}
