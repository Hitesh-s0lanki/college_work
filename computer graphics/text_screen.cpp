#include<stdio.h>
#include<conio.h>
#include<cstdlib>
#include<graphics.h>
#include<iostream>

using namespace std;

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;

	int font = 4, size = 8, direction = 2, color = 15;
	
	while(!kbhit()){
		int x = rand() % width;
		int y = rand() % height;
		
		setcolor(rand() % color);
		settextstyle(rand() % font, rand() % direction, rand() % size);
		outtextxy(x, y, "Hitesh Solanki");
		
		delay(500);
	}

    getch();
    closegraph();
}
