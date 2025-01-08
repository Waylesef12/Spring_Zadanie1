# Spring Web Application - Hello Vistula

Aplikacja "Hello Vistula" jest prostym projektem opartym na frameworku Spring, który umożliwia użytkownikowi interakcję z dwiema stronami internetowymi. Projekt ma na celu zaprezentowanie podstawowych możliwości Springa oraz Thymeleaf jako silnika szablonów. Aplikacja wyświetla powitanie na pierwszej stronie oraz umożliwia wprowadzenie imienia, które jest następnie wyświetlane na drugiej stronie.

## Funkcjonalności

### Strona główna (`/`)
Po wejściu na stronę główną użytkownik widzi powitaną wiadomość:

### Strona powitania (`/greeting`)
Na tej stronie użytkownik może podać swoje imię poprzez parametr URL, na przykład: http://localhost:8080/greeting?name=Greg
Wtedy aplikacja wyświetli spersonalizowane powiatnie "Hello, Greg!"

Jeśli użytkownik nie poda imienia, aplikacja użyje domyślnej wartości "Vistula", wyświetlając: "Hello, Vistula"

## Technologie

- **Spring Boot** – użyty jako główny framework do stworzenia aplikacji backendowej.
- **Thymeleaf** – silnik szablonów, który renderuje HTML na podstawie danych z kontrolerów.
- **Java** – język programowania wykorzystywany do budowy logiki aplikacji.