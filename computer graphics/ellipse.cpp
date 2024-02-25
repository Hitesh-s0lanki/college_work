#include<iostream>
#include<conio.h>
#include<math.h>
#include<graphics.h>

using namespace std;

void display (int x1, int y1, int x, int y);
void ellipse(int x1,int y1,int rx, int ry)
{
 int x,y;
 float d1,d2,dx,dy;
 x = 0;
 // take start position as (0,ry)
 y = ry;
 d1 = pow(ry,2) - (pow(rx,2) * ry) + (0.25 * pow(rx,2));
 dx = 2 * pow(ry,2) * x;
 dy = 2 * pow(rx,2) * y;
//region 1
 while(dx<dy)
 {
 display(x1,y1,x,y);
 if(d1<0)
 {
 x++;
 dx = dx + (2 * pow(ry,2));
 d1 = d1 + dx +pow(ry,2);
 }
 else
 {
 x++;
 y--;
 dx = dx + (2 * pow(ry,2));
 dy = dy - (2 * pow(rx,2));
 d1 = d1 + dx - dy + pow(ry,2);
 }
 }
 //region 2
 while(y>0)
 {
 display(x1,y1,x,y);
 if(d2>0)
 {
 x = x;
 y--;
 dy = dy - (2 * pow(rx,2));
 
 d2 = d2 - dy + pow(rx,2);
 }
 else
 {
 x++;
 y--;
 dy = dy - (2 * pow(rx,2));
 dx = dx + (2 * pow(ry,2));
 d2 = d2 +dx - dy + pow(rx,2);
 }
 }
}
void display(int x1,int y1,int x, int y)
{
 putpixel(x1+x,y1+y,WHITE);
 putpixel(x1-x,y1+y,WHITE);
 putpixel(x1-x,y1-y,WHITE);
 putpixel(x1+x,y1-y,WHITE);
}
main()
{
 int x1,y1;
 float rx,ry;
 int gd = DETECT,gm;
 initgraph(&gd,&gm,"c:\\turboc3\\bgi");
 
 outtextxy(10, 10, "51 - Hitesh Solanki");
 
 cout<<"\n Midpoint Ellipse Drawing";
 cout<<"Enter the Center Co-ordinates\n";
 cin>>x1>>y1;
 cout<<"Enter the X Radius\t";
 cin>>rx;
 cout<<"Enter the Y Radius\t";
 cin>>ry;
 ellipse(x1,y1,rx,ry);
 getch();
 closegraph();
}
