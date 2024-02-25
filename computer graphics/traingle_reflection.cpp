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

	int y1 = height / 2 - 50;
	int y2 = y1;
	int y3 = y1 - 100;
	
	int x1 = width / 2 - 50;
	int x2 = width / 2 + 50;
	int x3 = width / 2;
	
	//Draw first real traingle
	setcolor(DARKGRAY);
	line(x1, y1, x2, y2);
	line(x1, y1, x3, y3);
	line(x2, y2, x3, y3);
	
	//Draw second reflection traingle
	setcolor(MAGENTA);
	line(x1, y1 + 50, x2, y2 + 50);
	line(x1, y1 + 50, x3, y3 + 250);
	line(x2, y2 + 50, x3, y3 + 250);

    getch();
    closegraph();
}
