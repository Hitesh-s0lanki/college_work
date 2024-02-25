#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>

using namespace std;

void drawCycle(int width, int height){
	for(int i = 0 ; i < width; i = i + 10) {
		
		outtextxy(10, 10, "51 - Hitesh Solanki");

		line(0, height - 100, width, height - 100);
		
		// wheel
		circle(100 + i, height - 140, 40);
		circle(200 + i, height - 140, 40);
		
		line(100 + i, height - 140, 150 + i, height - 140);
		line(100 + i, height - 140, 140 + i, height - 180);
		
		line(150 + i, height - 140, 150 + i, height - 200);
		line(130 + i, height - 200, 150 + i, height - 200);

		line(150 + i, height - 200, 200 + i, height - 140);
		line(130 + i, height - 200, 130 + i, height - 180);
		
		line(140 + i, height - 180, 165 + i, height - 180);
		line(128 + i, height - 180, 134 + i, height - 180);
		
		delay(1000);
		cleardevice();
	}
}

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	

	int height = getmaxy();
	int width = getmaxx();
	
 	drawCycle(width, height);


    getch();
    closegraph();
}
