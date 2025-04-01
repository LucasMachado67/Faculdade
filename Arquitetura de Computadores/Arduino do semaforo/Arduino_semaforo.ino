#define VERDE A3
#define AMARELO A4
#define VERMELHO A5

void setup() {
  pinMode (VERDE, OUTPUT);
  pinMode (AMARELO, OUTPUT);
  pinMode (VERMELHO, OUTPUT);
  
}

void loop() {
  digitalWrite(VERDE, HIGH);
  delay(3000); //Fica verde por 3 segundos ou 3000 milisegundos
  digitalWrite(VERDE, LOW);
  digitalWrite(AMARELO, HIGH);
  delay(2000);
  digitalWrite(AMARELO, LOW);
  digitalWrite(VERMELHO, HIGH);
  delay(3000);
  digitalWrite(VERMELHO, LOW); 
}
