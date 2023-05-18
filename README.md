Problema 1: DesignPattern Iterator

Avem o clasa "AgeHandler" care implementează interfața "Container" și are o clasă internă privată numită "AgeIterator" care implementează interfața "Iterator". 
Avem o clasa "AgeIterator" care gestionează iterația prin vectorul "ages" și returnează următoarea valoare la fiecare apel al unei metode: "next()". 
Exista o metoda "hasNext()" care verifică dacă mai există elemente în vectorul "ages" care pot fi iterate.
În clasa "IteratorPattern", în metoda "main()", se creează o instanță a clasei "AgeHandler". 
Apoi, se obține un iterator folosind o metoda "getIterator()" și se iterează prin vectorul "ages".
La fiecare iterație, se afișează valoarea curentă a vârstei.
Astfel, Design Pattern-ul Iterator este utilizat pentru a itera prin elementele unui container (în acest caz, vectorul "ages") fără a dezvălui detaliile 
de implementare ale containerului.


Problema 2: DesignPattern Null Object Pattern

Se dorește implementarea unui sistem de rezidenți într-o țară. Există două tipuri de rezidenți: cetățeni din orașe ("Townsman") și locuitori din sate ("Villager"). Fiecare rezident are un nume asociat.
Clasa abstractă "AbstractRezident" conține un membru de tip String pentru numele rezidentului și două metode abstracte: "isNull()" și "getName()".
Clasa "Townsman" extinde clasa "AbstractRezident" și implementează metodele abstracte. Constructorul primește ca parametru numele rezidentului și îl atribuie membrului de tip String.
Clasa "Villager" extinde clasa "AbstractRezident" și implementează metodele abstracte. Constructorul primește ca parametru numele rezidentului și îl atribuie membrului de tip String.
Clasa "RezidentCountry" conține un array de String-uri cu nume predefinite. Metoda statică "getRezident(String name)" primește ca parametru un nume și verifică dacă acesta corespunde cu numele din array-ul predefinit. 
Dacă numele se potrivește cu unul din lista de nume și nu este "Cristi", se returnează un obiect de tip "Townsman" cu numele respectiv. Dacă numele este "Cristi", se returnează un obiect de tip "Villager" cu numele respectiv. 
În caz contrar, se returnează un obiect de tip "NullRezident".
Clasa "NullRezident" extinde clasa "AbstractRezident" și implementează metodele abstracte. Aceasta reprezintă un rezident inexistent și returnează un nume predefinit și un indicator de rezident inexistent.
Clasa "NullPattern" conține metoda "main()" în care se testează funcționalitatea sistemului. Se creează mai mulți rezidenți folosind metoda "getRezident()" din clasa "RezidentCountry" și se afișează numele fiecărui rezident.
Scopul implementării acestui sistem este de a permite manipularea și gestionarea rezidenților într-o țară, inclusiv cazurile în care numele rezidentului nu este disponibil sau nu există.
