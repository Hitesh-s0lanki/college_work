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

	int left = 50, top = 50, right = 150, bottom = 150;

	rectangle(left, top, right, bottom);
	
	int tx, ty;
	cout<<"Enter the translating factor x : ";
	cin>>tx;
	cout<<"Enter the translating factor y : ";
	cin>>ty;
	
	setcolor(YELLOW);
	rectangle(left + tx, top + ty, right + tx, bottom + ty);

    getch();
    closegraph();
}
