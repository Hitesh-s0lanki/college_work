void setup()
{
    pinMode(A0, OUTPUT);
    Serial.begin(9600);
}

void loop()
{
    int val = analogRead(A0);
    int humidityPercentage = map(val, 0, 1023, 10, 70);
    Serial.println(humidityPercentage);
    delay(100);
}