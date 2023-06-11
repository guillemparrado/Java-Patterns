# Java-Patterns
Sprint 3 of the Java Bootcamp at IT Academy (Barcelona Activa).

## Tasks

En tots els exercicis, crea un projecte amb una classe Main que demostri l'ús del patró (amb les invocacions necessàries).

### Ex 1.1: Singleton


Crea una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe serà utilitzada per la classe Main, que permetrà introduir opcions per consola.
- La classe 'Undo' ha de guardar les últimes comandes introduïdes. Ha de permetre afegir o eliminar comandes, així 
com llistar les últimes comandes introduïdes (semblant a la comanda 'history' en Linux).
- La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.

### Ex 1.2: Abstract Factory

Crea un petit gestor de direccions i números de telèfon internacionals.

- L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals. Tenint en compte els 
diferents formats dels diferents països, construeix l'agenda, les adreces i els telèfons implementant un patró Abstract Factory.

### Ex 1.3: Command

Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell.

Mostra com funciona el patró Command que implementa els mètodes arrencar, accelerar i frenar per a cada tipus de vehicle.


### Ex 2.1: Observer
Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) canvis quan la Borsa puja o baixa.

- És necessari que l'objecte Observable mantingui referències als Observers.

### Ex 2.2: Callback
Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: targeta de crèdit, Paypal o deute en compte bancari.

- La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
- La classe que invoca la passarel·la de pagament serà una botiga de sabates.

### Ex 2.3: Dependency Injection

Dissenya una classe que mostri en pantalla el preu de diversos articles. Ja que haurà de mostrar-los també en diversos tipus de moneda.

- **Important**: Assegura't d'afegir-li com a Injecció de Dependència una classe Convertidor de Moneda que efectuï la correcció del preu en funció del canvi de divisa.