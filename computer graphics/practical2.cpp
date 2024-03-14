#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;


void printCircle(int height, int width){
	int x = width/4, y = height/4, radiusCirle = 80;
	circle(x, y, radiusCirle);
	int textwidthCircle = textwidth("Circle");
	int textHeightCircle = textheight("Cicrle");
	outtextxy(x - textwidthCircle/2, y - textHeightCircle/2, "Circle");
}

void printRectangle(int height, int width){
	int left = width/2 + 50, right = width - 50, top = 50, bottom = height/2 - 50;
	rectangle(left, top, right, bottom);
	int x = left + (right - left)/2, y = top + (bottom - top)/2;
	int textWidth = textwidth("Rectangle");
	int textHeight = textheight("Rectangle");
	outtextxy(x - textWidth/2, y - textHeight/2, "Rectangle");
}

void printEllipse(int height, int width){
	char* text = "Ellipse";
	int x = width/4, y = (height/2) + (height/4), x_radius = 90, y_radius = 50 ;
	ellipse(x, y, 0, 360, x_radius, y_radius);
	
	int textWidth = textwidth(text);
	int textHeight = textheight(text);
	outtextxy(x - textWidth/2, y - textHeight/2, text);
}

void printArc(int height, int width){
	char* text = "Arc";
	int x = (width/2) + (width/4), y = (height/2) + (height/4), radius = 70;
	arc(x, y, 0, 180, radius);

	int textWidth = textwidth(text);
	int textHeight = textheight(text);
	outtextxy(x - textWidth/2, y - textHeight/2, text);
}

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	outtextxy(10, 10, "51 - Hitesh Solanki");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	// divide the screen in 4 part
	line(0, height/2, width, height/2);
	line(width/2, 0, width/2, height);
	
	//The height of the screen : 479
	//The width of the screen : 639

	//first quadrant
	printCircle(height, width);

	//2nd
	printRectangle(height, width);
	
	//#rd
	printEllipse(height, width);
	
	//4th
	printArc(height, width);

    getch();
    closegraph();
}
