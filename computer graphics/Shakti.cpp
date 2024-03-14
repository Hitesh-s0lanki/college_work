#include<iostream>
#include<stdio.h>
#include<graphics.h>
main()
{
	int gd=DETECT,gm;
	initgraph(&gd,&gm," ");
	int xcen,ycen;
	xcen=getmaxx()/2;
	ycen=getmaxy()/2;

	line(xcen,0,xcen,getmaxy());
	line(0,ycen,getmaxx(),ycen);
	setcolor(RED);
	circle(xcen/2,ycen/2,80);
	setcolor(WHITE);
	settextstyle(4, 0, 2);
	outtextxy(xcen/2 - 20,ycen/2 - 100, "Circle");
	setcolor(BLUE);
	rectangle(xcen+50,ycen-200,xcen+300,ycen-50);
	setcolor(YELLOW);
	ellipse(xcen/2,ycen+ycen/2,0,360,100,50);
	setcolor(GREEN);
	arc(xcen+xcen/2,ycen+ycen/2,0,90,50);

	getch();
	closegraph();
}
