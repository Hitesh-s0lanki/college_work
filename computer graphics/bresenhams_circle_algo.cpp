#include<iostream>
#include<graphics.h>
#include<conio.h>

using namespace std;

void midPointAlgo(int x_center, int y_center, int radius){
	
	int x = radius;
	int y = 0;
	int error = 0;
	
	while(x >= y){
		
		//four conner
		putpixel(x_center + x, y_center + y, WHITE);
		putpixel(x_center - x, y_center + y, WHITE);
		putpixel(x_center + y, y_center + x, WHITE);
		putpixel(x_center + y, y_center - x, WHITE);
		
		//45 degree points
		// If the generated point is on the line x = y then
        // the perimeter points have already been printed
		if (x != y)
        {
            cout << "(" << y + x_center << ", " << x + y_center << ") ";
            cout << "(" << -y + x_center << ", " << x + y_center << ") ";
            cout << "(" << y + x_center << ", " << -x + y_center << ") ";
            cout << "(" << -y + x_center << ", " << -x + y_center << ")\n";
        }
		
		if(error <= 0){
			y++;
			error += 2*y + 1;
		}else{
			x--;
			error -= 2*x + 1;
		}
	}
	
}

void drawcircle(int x0, int y0, int radius){
	
	int x = radius;
	int y = 0;
	int error = 0;

 	while (x >= y){
		putpixel(x0 + x, y0 + y, YELLOW);
		putpixel(x0 + y, y0 + x, YELLOW);
		putpixel(x0 - y, y0 + x, YELLOW);
		putpixel(x0 - x, y0 + y, YELLOW);
		putpixel(x0 - x, y0 - y, YELLOW);
		putpixel(x0 - y, y0 - x, YELLOW);
		putpixel(x0 + y, y0 - x, YELLOW);
		putpixel(x0 + x, y0 - y, YELLOW);
		if (error <= 0){
		 y = y + 1;
		 error += 2 * y + 1;
		}
		if (error > 0){
		 x = x - 1;
		 error -= 2 * x + 1;
		}
 	}
}

main(){
	int gdriver=DETECT, gmode, x, y, r;
	initgraph(&gdriver, &gmode, "");

	outtextxy(10, 10, "51 - Hitesh Solanki");

	int height = getmaxy();
	int width = getmaxx();

	drawcircle(width/2, height/2, 100);

	getch();
	closegraph();
}

