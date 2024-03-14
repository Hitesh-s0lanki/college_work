#include<iostream>
#include<stdio.h>
#include<conio.h>
#include<graphics.h>

using namespace std;

main(){
	
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	
	int height = getmaxy();
	int width = getmaxx();
	
	//pixel
	putpixel(100, 100, WHITE);
	
	//for line
	setcolor(GREEN);
	line(0, getmaxy()/2, getmaxx(), getmaxy()/2);
	
	//for rectangle
	int left = 300, top = 300, bottom = 400, right = 400;
	setcolor(YELLOW);
	rectangle(left, top, right, bottom);
	setfillstyle(CLOSE_DOT_FILL, YELLOW);
	floodfill(350, 350, YELLOW);

	//for bar
	setcolor(RED);
	setfillstyle(HATCH_FILL, RED);
	bar(150, 50, 400, 150);
	
	//for circle
	setcolor(WHITE);
//	setfillstyle(INTERLEAVE_FILL, WHITE);
//	floodfill(getmaxx()/2,getmaxy()/2, WHITE);
	circle(getmaxx()/2,getmaxy()/2, 50);

	//for arc
	int x=width/2 - 50, y= height/2 + 50, start_angle = 0, end_angle = 120, radius = 50;
	arc(x, y, start_angle, end_angle, radius);

	//for ellipse
	int x_radius = 20, y_radius = 10;
	ellipse(x, y, start_angle, 360, x_radius, y_radius);

	//draw poly
	int arr[] = {320, 150, 400, 250,
                 250, 350, 320, 150};
	drawpoly(4, arr);

	//fill poly
	fillpoly(4, arr);
	
	//fill ellipse
	setfillstyle(INTERLEAVE_FILL, WHITE);
	fillellipse(getmaxx()/2,getmaxy()/2, 50, 100);

	getch();
	closegraph();
}

