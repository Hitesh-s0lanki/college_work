#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;

// DDA Algorithm for drawing line

void DDA(float x1, float y1, float x2, float y2){
	float dx = x2 - x1;
	float dy = y2 - y1;
	
	float steps = dx > dy ? dx : dy;
	
	float x_inc = dx / steps;
	float y_inc = dy / steps;

	while(x1 != x2 || y1 != y2){
		putpixel(x1, y1, WHITE);
		x1 += x_inc;
		y1 += y_inc;
	}
}

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	float x1, x2, y1, y2;
	cout<<"Enter the x1 point : "<<endl;
	cin>>x1;
	cout<<"Enter the y1 point : "<<endl;
	cin>>y1;
	cout<<"Enter the x2 point : "<<endl;
	cin>>x2;
	cout<<"Enter the y2 point : "<<endl;
	cin>>y2;

	DDA(x1, y1, x2, y2);

    getch();
    closegraph();
}
