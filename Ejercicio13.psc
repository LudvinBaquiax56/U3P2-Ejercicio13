Algoritmo Ejercicio13
	Repetir
		Escribir 'Elija la operacion que desea realizar'
		Escribir '1. Suma'
		Escribir '2. Division'
		Escribir '3. Salir'
		Leer opcionUsuario
		si opcionUsuario <> 3 Entonces
			Escribir 'Ingrese el primer numero'
			Leer numero1
			Escribir 'Ingrese el segundo numero'
			Leer numero2
			Segun opcionUsuario Hacer
				1:
					suma = numero1 + numero2
					Escribir 'La suma es ' suma
				2:
					Si numero2 = 0  Entonces
						Escribir 'Error no se puede dividir por 0'
					SiNo
						division = numero1 / numero2
						Escribir 'El resultado de la division es ' division
					Fin Si
				De Otro Modo:
					Escribir 'Error opcion incorrecta'
			Fin Segun
		FinSi
	Hasta Que opcionUsuario = 3
FinAlgoritmo
