int val = 0;

void setup()
{
    pinMode(11, OUTPUT);
    pinMode(A0, INPUT);
    Serial.begin(9600);
}

void loop()
{
    val = analogRead(A0);
    Serial.println(val);
    int ledBrightness = map(val, 0, 1023, 0, 255);
    analogWrite(11, ledBrightness);
}
