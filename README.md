# Light Control: Command Pattern

Das **Command Pattern** ist ein Verhaltensmuster der Softwarearchitektur, das dazu dient, Anfragen als Objekte zu kapseln. Dadurch wird die Entkopplung zwischen dem Objekt, das eine Aktion auslöst (Invoker), und dem Objekt, das die Aktion ausführt (Receiver), erreicht.

## Ziel des Patterns
- Aktionen sollen wie Objekte behandelt werden.
- Die Ausführung einer Aktion soll unabhängig von der Komponente sein, die sie anfordert.
- Einfaches Rückgängig machen (Undo), Wiederholen (Redo) oder Ausführen in einer Queue wird möglich.

## Bestandteile
- **Command (Interface)**  
  Definiert die Methode `execute()`.
- **LightOnCommand, LightOffCommand**  
  Sind die Commands in denen die tatsächliche Anweisung steht.
- **RemoteControl**  
  Hier wird der Command gesetzt und ausgeführt.
- **Room**
  Jeder Raum hat einen Identifikationsnamen um das Licht nur im entsprechenden Raum anzuschalten
- **Light**
  Das Licht was an und ausgeht, hier sind die beiden Aktionen (Licht an/aus) festgelegt.


<img width="800" height="400" alt="image" src="https://github.com/user-attachments/assets/7101450f-9a86-4d96-b6ed-9bedbed667d7" />
