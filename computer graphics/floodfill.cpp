#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;

void floodfill(int x, int y, int oldColor, int newColor) {
	delay(1);
	if(getpixel(x, y) == oldColor){
		putpixel(x, y, newColor);
		floodfill(x + 1, y, oldColor, newColor);
		floodfill(x, y + 1, oldColor, newColor);
		floodfill(x - 1, y, oldColor, newColor);
		floodfill(x, y - 1, oldColor, newColor);
	}
}

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	outtextxy(10, 10, "51 - Hitesh Solanki");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	circle(width/2, height/2, 50);
	floodfill(width/2, height/2, 0, 15);
	
	delay(1000);

	getch();
    closegraph();
}
