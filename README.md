# Slide- Android aplikacija s dinamičkom lokacijom 

Slide je Android aplikacija razvijena za natjecanje iz informatike i završni rad u Elektrotehničkoj školi Split smjera Tehničar za računalstvo, čija je glavna svrha olakšati spontano upoznavanje i komunikaciju ljudi u stvarnom svijetu pomoću dinamičke GPS lokacije u stvarnom vremenu.

Aplikacija koristi Google Mape za prikaz korisnika u radijusu od 50 metara, gdje se svaki korisnik prikazuje kao marker na karti. Klikom na marker moguće je pregledati osnovne informacije profila i poslati zahtjev za povezivanje, čime se ostvaruje jednostavan i prirodan prijelaz od interesa u stvarnom životu do digitalne komunikacije.

Slide je razvijen u Android Studiju (Java) te koristi Firebase infrastrukturu:

- Realtime Database za praćenje korisničkih lokacija u stvarnom vremenu

- Firestore za korisničke profile, razgovore i poruke

- Firebase Cloud Messaging (FCM) za push notifikacije

Aplikacija uključuje:

- interaktivnu Google mapu s dinamičkim ažuriranjem lokacije (svakih 0.5 s)

- korisničke profile s osnovnim informacijama

- sustav dopisivanja u stvarnom vremenu

- push notifikacije

- fokus na sigurnost, privatnost i GDPR usklađenost
