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

	float x1 = 50.0, y1 = 50.0, x2 = 100.0, y2 = 100.0;
	float sx, sy;

	rectangle(x1, y1, x2, y2);
	
	cout<<"Enter the scale factor of x : ";
	cin>>sx;
	cout<<"Enter the scale factor of y : ";
	cin>>sy;
	
	rectangle(x1 * sx, y1 * sy, x2 * sx, y2 *sy);

    getch();
    closegraph();
}
