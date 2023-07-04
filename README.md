# ricerca-dei-percorsi-mezzi-GTT
Esercitazione in vista dell'esame finale per il diploma di FinTech Software Developer erogato da ITS ICT Piemonte

## Requsiti

Si vuole realizzare un sito per una società di trasporto pubblico (es. la GTT) che permetta la ricerca dei percorsi tra diverse fermate dei mezzi. 
Il sito fornirà l’indicazione delle linee che collegano le fermate, e del percorso completo di ciascuna delle linee di mezzi.

Si supponga che il sistema informativo si basi su un database così organizzato: 

Linea (idLinea) /* es. “10”, “58”, “58B”, ... */
Fermata(idFermata, nomeFermata) 
Percorso(idLinea, idFermata, numOrdine) 

/* numOrdine è un intero che indica l’ordine con cui vengono visitate le fermate dai mezzi della linea indicata */

Si vuole realizzare in tecnologia JSP una porzione del sito, che comprenda le seguenti funzionalità:

1. Una pagina mediante la quale l’utente possa scegliere la fermata di partenza e la fermata di arrivo del proprio viaggio. La pagina dovrà contenere due menu a tendine, rispettivamente per la partenza e l’arrivo, ciascuna delle quali contiene l’intero elenco (alfabetico) di tutte le fermate esistenti. Dopo aver selezionato le fermate di interesse, l’utente selezionerà un bottone di “Invio” per passare alla pagina successiva.
2. La seconda pagina contiene le informazioni su tutte le linee che collegano le due fermate indicate. La pagina dovrà contenere informazioni di questo tipo, opportunamente formattate:
“Le linee che portano dalla fermata ____ alla fermata ___ sono le seguenti: 10, 13, 1”. Nel caso in cui non ci sia alcuna linea che collega le due fermate, si visualizzi un’indicazione di errore e si ri-propongano le due tendine per modificare la scelta.

**IMPORTANTE:** nel calcolo dei percorsi non è richiesto di considerare le “coincidenze” tra i mezzi, ma occorre identificare solamente i percorsi “diretti”.

In particolare, si richiede di:
- identificare, a partire dalle specifiche precedenti, le componenti necessarie (pagine jsp, servlet, bean, ...) a realizzare le funzionalità sopra descritte secondo il paradigma MVC
- implementare tali pagine e classi.
