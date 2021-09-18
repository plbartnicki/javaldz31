package oop.logger;

/*
	interfejs podobnie jak klasas abstrakcyjna dostarcza abstrakcji z tym ze:
	 - nie mozna w nim zawrzec konstruktora
	 - nie mozna w nim zamiescic zmiennych (ale mozna dodac stale (final))

	 => interfejs to jest zbior abstrakcyjnych (bez implementacji) metod
 */
public interface Logger
{
	void log(String message);   //domyslnie to jest public
}
