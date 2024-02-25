#include<stdio.h>
#include<conio.h>
#include<cstdlib>
#include<graphics.h>
#include<iostream>

using namespace std;

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

//	outtextxy(10, 10, "51 - Hitesh Solanki");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	int font = 4, direction = 2, size = 8, color = 10;

	while(!kbhit()){
		int x = rand() % width;
		int y = rand() % height;

		settextstyle(rand() % font, rand() % direction, rand() % size);
		setcolor(rand() % color);
		outtextxy(x, y, "51 - Hitesh Solanki");
		delay(500);
	}

    getch();
    closegraph();
}
