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

    getch();  
    closegraph();
}
