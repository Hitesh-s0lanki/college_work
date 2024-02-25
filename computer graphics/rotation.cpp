#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<iostream>
#include<cmath>

using namespace std;

main(){

	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	outtextxy(10, 10, "51 - Hitesh Solanki");

	int width = getmaxx();
	int height = getmaxy();

	cout<<"The height of the screen : "<<height<<endl;
	cout<<"The width of the screen : "<<width<<endl;
	
	float x1 = 200.0, y1 = 200.0;
	float x2 = 250.0, y2 = 250.0;
	
	setcolor(WHITE);
	rectangle(x1, y1, x2, y2);
	
	float angle;
	cout<<"Enter the Angle : ";
	cin>>angle;
	
	float x_new = x1 + ((x2 - x1) * cos(angle *3.14159/180 )) - ((y2 - y1) * sin(angle *3.14159/180 ));
	float y_new = y1 + ((x2 - x1) * sin(angle *3.14159/180 )) + ((y2 - y1) * cos(angle *3.14159/180 ));
	
	setcolor(YELLOW);
	if(angle > 45 && angle < 135){
		rectangle(x_new, y1, x1, y_new);
	}else if(angle > 225 && angle < 315){
		rectangle(x1, y_new, x_new, y1);
	}else{
		rectangle(x_new, y_new, x1, y1);
	}
	
	
//	circle(x1, y1, 5);
//	putpixel(x1, y1, WHITE);
//	line(0, 0, x1, y1);
//	
//	circle(x2, y2, 5);
//	putpixel(x2, y2, WHITE);
//	line(0, 0, x2, y2);
//
//	float x_new = x1 * cos(15 *3.14159/180 ) - y1 * sin(15 *3.14159/180 );
//	float y_new = x1 * sin(15 *3.14159/180 ) + y1 * cos(15 *3.14159/180 );
//	
//	float x_new_2 = x2 * cos(15 *3.14159/180 ) - y2 * sin(15 *3.14159/180 );
//	float y_new_2 = x2 * sin(15 *3.14159/180 ) + y2 * cos(15 *3.14159/180 );
//
//	circle(x_new, y_new, 5);
//	putpixel(x_new, x_new, WHITE);
//	line(0, 0, x_new, y_new);
//	
//	circle(x_new_2, y_new_2, 5);
//	putpixel(x_new_2, x_new_2, WHITE);
//	line(0, 0, x_new_2, y_new_2);

    getch();
    closegraph();
}
