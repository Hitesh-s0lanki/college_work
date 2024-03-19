int echoPin = 11;
int trigPin = 12;
void setup()
{
    pinMode(trigPin, OUTPUT);
    pinMode(echoPin, INPUT);
    Serial.begin(9600);
}

void loop()
{
    digitalWrite(trigPin, 0);
    delayMicroseconds(2);
    digitalWrite(trigPin, 1);
    delayMicroseconds(10);
    digitalWrite(trigPin, 0);

    int duration = pulseIn(echoPin, 1);

    int distance = duration * 0.034 / 2;

    Serial.print(distance);
    Serial.println(" cm");

    delay(100);
}