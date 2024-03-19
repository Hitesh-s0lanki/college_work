void setup()
{
    pinMode(12, OUTPUT);
    pinMode(A1, INPUT);
    Serial.begin(9600);
}

void loop()
{
    int val = analogRead(A1);
    if (val > 200)
    {
        digitalWrite(12, 1);
    }
    else
    {
        digitalWrite(12, 0);
    }
    Serial.println(val);
    delay(100);
}