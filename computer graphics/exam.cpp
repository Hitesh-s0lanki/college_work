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

main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	
	int width = getmaxx();
	int height = getmaxy();
	
	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	circle(width/2, height/2 , 100);
	floodFill(width/2, height/2, YELLOW);

	getch();
	closegraph();
}
