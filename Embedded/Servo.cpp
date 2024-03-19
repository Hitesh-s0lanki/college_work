#include <Servo.h>

Servo servo;

void setup()
{
    servo.attach(A0);
    servo.write(0);
}

void loop()
{
    for (int i = 0; i <= 360; i++)
    {
        servo.write(i);
    }
}