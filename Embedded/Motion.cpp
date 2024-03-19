void setup()
{
    pinMode(11, OUTPUT);
    pinMode(4, INPUT);
    Serial.begin(9600);
}

void loop()
{
    int val = digitalRead(4);
    digitalWrite(11, val);
}