# Programowanie w Java

## Ważne linki
https://docs.google.com/document/d/1uPmPdZjfHZVdhdMOLbjywY_1pOTKaSZq-QT_V5PKx8E/edit?usp=sharing

## Ogólnie
nie ma co liczyć na więcej niż 4 z egz. :P

## Konserwatorium 1

### java.lang
* nie trzeba importować klas z tego pakietu
* np. Math, String
* można zrobić import static java.lang.Math.* - imprtuje wszystkie metody statyczne z danego pakietu i zaśmieca nimi bieżacy namespace
* to co jest w pakiecie src jest pakietem defaultowym - nie ma możliwości zaimportowania jej

### protected
* to co dziedziczy po danej klasie lub w tym samym pakiecie - mają dostęp

### interfejsy
* w interfejsie wszystkie pola są public static
* w interfejsie wszystkie metody są public
* jeżeli nadpisujesz metodę to nie możesz rozszerzać ilości wyjątków jakie rzucasz

### Wyjątki
* dwa typy wyjątków - RuntimeException  - wyjątki i IOException - runtime nie trzeba obsługiwać
* można zmniejszyć ilośc wyjątków kórymi rzucasz
* można zmienić typ returna dla przeciążonej metody
* jeżeli nie przypiszesz wartości do pola klasy - przypisze defaultową wartość dla danego typu

### variadic argument
* var-arg - variadic argument - podajesz tablicę argumentów

### Klasy i dziedziczenie
każda klasa dziedziczy po object

### enum
* enum może mieć konstruktory: wywołujesz ją w ten sposób: TREE("cośtam")

### Bloki inicjalizujące
* bloki inicjalizujące sttyczne potem inicjalizujące

### Autoboxing
* Autoboxing - prymitywy przechowywane w obiekcie (aby przechowywać w kolekcjach)

### INNE
* można przeglądać mapę w for eachu używając hashMap.entrySet()
* covariant return nie dziala w przypadku typów prostych(zmiana typu

## Ćwiczenia 1

http://misztal.edu.pl/teaching/2015-2016-java/

## Konserwatorium 2
### char
* char w javie: 'z' aznaczamy pojedynczym apostrofem

char 'a'
'a' + 1 => rezultatem jest 98 bo wszystkie operacje na typach rzutujących się niejawnie na int => wykonywane są na incie
+= kowertuje na typ do którego dodajemy

float
jest 32 bitowy
aby literał zdefiniować trzeba napisać: 1.3f
literał: 1.2 to double (64 bity)

unreachable statement
kompilator wyrzuci ostrzeżenie po pętli która działa w nieskończoność
czyli jeżeli jest coś po pętli nieskończonej to będzie ostrzeżenie

Garbage Collector
zlicza referencje
nigdy nie powinno się wywoływać System.gc()
można przeciążyć metodę finalize() -> gdy garbage collector chce zniszczyć obiekt to wywołuje najpierw finalize

Sleep
Thread.sleep(10000) usypia wątek który to wykonuje te funkcje

String literal pull
jeżeli używasz literałów stringów to kompilator zomptymalizuje i dla s1 == s2 zwróci true
to samo dla Integerów ale tylko do wartości 1 B bajtu

### StringBuilder
* do dodawania stringów w pętli
* string jest niemutowalny

### Tablice
* tablice to obiekty nie mają przeciążonego toString()
* tablice możesz wypisać jako .deepToString() - >

Quizy:
1: C
2: C
3: B
4: C, A
5: C

Masz mieć jedną odpowiedź na Stacku ale zajebistą - 200pkt

## Wykład 21.04

### ExecutorService
* fabryka do nowych wątków

### ReentrantLock
* jak robisz r.lock() to znaczy że czytasz i blokujesz piszącym wątkom pisanie

* jak robisz w.lock() to znaczy że piszesz i blokujesz czytającym czytanie

### Atomic type..
* np. AtomicInteger - wraper atomowy na integerze
* Optimistic Locking - kiedy oczekujemy mało konfliktów
* wolniejsze niż synchronizacja synchronize(Blabla.class){..}

### Callable
* działa podobnie jak `Runnable` ale możesz zwrócić z wątku obiekt
* możesz naprzykład wrzucić `Callable` do środka `ScheduledThreadPool` i za pomocą `Future`

### Futures
* potem aby wyciągnąć wartość z `Future` musimy użyć `future.get()` wtedy wyciągamy wartość którą zwróciło `Callable` ze środka

### Fork i Join
* tworzysz task który np. rozszerza `RecursiveTask` - wtedy możesz zyskać dużo w rekursywnym algorytmie który używa wielu wątków
* robisz `pool.invoke(task)`
* musisz zrobić `task.fork()` wtedy wrzucam zadanie na pulę wątków
* dopiero gdy zrobisz `task.join()` czekasz na zakończenie danego zadania

#### Recursive task
* można zdefiniować co w zasadzie zwraca

### Volataile
* jest klasa `Logger`
* zmienna `volataile` nie jest `atomic`
* jeżeli jest `volataile` to wątki nie cache'ują sobie tej zmiennej - za każdym razem gdy się do niej odnosi to wczytuje ze wspólnej pamięci


### Lazy evaluation
* `&&` - sprawdza leniwie
* `&` - sprawdze eager

### Ingellij
* plugin `FindBugsTM`
