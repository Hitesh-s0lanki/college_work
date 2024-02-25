#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;

// Hut diagram

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	int max_x = getmaxx();
	int max_y = getmaxy();
	
	cout<<"The width of screen is : "<<max_x<<endl;
	cout<<"The height of screen is : "<<max_y<<endl;
	
	
	line(150, 200, 210, 100);
	line(210, 100, 270, 200);
	
	line(210, 100, 400, 100);
	line(400, 100, 450, 200);
	
	rectangle(150 + 30, 250, 270 - 30 , 400);
	
	rectangle(270 + 60, 200 + 70, 450 - 60, 400 - 70);
	line(270 + 60, 200 + 70 + 30, 450 - 60, 200 + 70 + 30);
	line(270 + 60 + 30, 200 + 70, 270 + 60 + 30, 400 - 70 );
	
	rectangle(150, 200, 450, 400);
	rectangle(150, 200, 270, 400);
	
    getch();
    closegraph();
}
