void setup()
{
    pinMode(A1, INPUT);
    Serial.begin(9600);
}

void loop()
{
    int val = analogRead(A1);
    float voltage = (val * 5.0) / 1024;
    float celusis = (voltage - 0.5) * 100.0;
    Serial.println(celusis);
    delay(100);
}