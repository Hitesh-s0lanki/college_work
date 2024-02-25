#include<iostream>
#include<graphics.h>
#include<conio.h>

using namespace std;

void drawcircle(int x0, int y0, int radius)
{
 int x = radius;
 int y = 0;
 int error = 0;

 while (x >= y)
 {
putpixel(x0 + x, y0 + y, YELLOW);
putpixel(x0 + y, y0 + x, YELLOW);
putpixel(x0 - y, y0 + x, YELLOW);
putpixel(x0 - x, y0 + y, YELLOW);
putpixel(x0 - x, y0 - y, YELLOW);
putpixel(x0 - y, y0 - x, YELLOW);
putpixel(x0 + y, y0 - x, YELLOW);
putpixel(x0 + x, y0 - y, YELLOW);
if (error <= 0)
{
 y =y+1;
 error += 2*y + 1;
}
if (error > 0)
{
 x =x-1;
 error -= 2*x + 1;
}
 }
}
int main()
{
int gdriver=DETECT, gmode, x, y, r;
initgraph(&gdriver, &gmode, "c:\\turboc3\\bgi");

outtextxy(10, 10, "51 - Hitesh Solanki");

cout<<"Enter radius of circle: ";
cin>>r;
cout<<"Enter co-ordinates of center(x and y): ";
cin>>x>>y;
drawcircle(x, y, r);

getch();
return 0;
}

