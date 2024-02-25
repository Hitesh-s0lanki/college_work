#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

// Draw a coordinate axis at the center of screen
using namespace std;

main() {
	
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	
	int max_x = getmaxx();
	int max_y = getmaxy();
	
	cout<<"The width of screen is : "<<max_x<<endl;
	cout<<"The Height of Screen is : "<<max_y<<endl;
	
	int mid_x = max_x/2;
	int mid_y = max_y/2;
	
	line(0, mid_y, max_x, mid_y);
	line(mid_x, 0, mid_x, max_y);
	
	getch();
	closegraph();
}
