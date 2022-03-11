# ------------- TIPOS DE DATOS -------------





# Ejercicio 1


palabra = "¡Hola Mundo!"
print (palabra)


# Ejercicio 2


print ("Ingrese su nombre\n")
nombre = input()
print ("\n¡Hola",nombre,"!")


# Ejercicio 3


a = 3 + 2
b = 2 * 5
c = a / b
e = c ** 2
print(e)


# Ejercicio 4


print("¿Cuantas horas trabajo hoy?")
horas = int(input())

print("¿Cúal es el costo por hora?")
costo = int(input())

a = horas * costo

print ("Le corresponden $",a)


# Ejercicio 5


print("Ingrese un número entero positivo")
n = int(input())
suma = n*(n+1)/2
print("Suma:",suma)


# Ejercicio 6


print ("Ingrese su estatura en metros")
estatura = float(input())
print ("Ingrese su peso en kilogramos")
peso = float(input())

imc = peso/estatura**2
imc = round(imc,2)
print("Su indice de masa corporal es:", imc)


# Ejercicio 7


print ("¿Cuantos payasos tiene el último pedido?")
payasos = int(input())

print("¿Cuantas muñecas tiene el último pedido?")
muñecas = int(input())

payasos = payasos * 112
muñecas = muñecas * 75
peso = payasos + muñecas

print("El peso total del paquete es:", peso)


# Ejercicio 8


print("Ingrese sus ahorros:")
ahorros = float(input())

primero = float (0.04 * ahorros + ahorros)

segundo = float (0.04 * primero + primero)

tercero = float (0.04 * segundo + segundo)

primero = round(primero, 2)
segundo = round(segundo, 2)
tercero = round(tercero,2)

print ("Ahorros en el primer año:", primero)
print ("Ahorros en el segundo año:", segundo)
print ("Ahorros en el tercer año:", tercero)





# ------------- CADENAS DE TEXTO -------------





# Ejercicio 1


print("Ingrese su nombre:")
nombre = input()

print("\nNombre en minúsculas")
print(nombre.lower())
print("\nNombre en mayúsculas")
print(nombre.upper())
print ("\nNombre solo con la primer letra en mayúscula: ")
print(nombre.title())


# Ejercicio 2


print("Ingrese su nombre:")
nombre = input()
print("Tu nombre tiene",len (nombre) , "letras")


# Ejercicio 3


numero = "+34-913724710-56"
numero = input()
print (numero[4: -3])


# Ejercicio 4


print ("Ingrese una frase: ")
frase = input()
print(frase[::-1])


# Ejercicio 5


print("Ingrese una frase")
frase = input()
print("Ingrese una vocal")
vocal = input()
vocal = vocal.lower()
vocalUp = vocal.upper()
print (frase.replace(vocal, vocalUp))





# ------------- LISTAS Y TUPLAS -------------





# Ejercicio 1


materias = ["Matemáticas", "Física", "Química", "Historia"]
print ("Las materias son:", materias)


# Ejercicio 2


materias = []
print ("\nCuanto te sacaste en Matemáticas?")
materias.append("Matemáticas")
materias.append(input())
print("\nCuanto te sacaste en Física")
materias.append("Física")
materias.append(input())
print("\nCuanto te sacaste en Química")
materias.append("Química")
materias.append(input())
print("\nCuanto te sacaste en Historia")
materias.append("Historia")
materias.append(input())
print("\nCuanto te sacaste en Lengua")
materias.append("Lengua")
materias.append(input())

i = 0

while (i < 10):
    posNota = i + 1
    materia = materias[i]
    nota = materias[posNota]
    print("\nEn", materia, "te sacaste un", nota)
    i = i + 2


# Ejercicio 3


num = []
i = 0

print ("Ingrese los números ganadores de la lotería: (Ingrese 'listo' para terminar)")

while (i == 0):
    a = (input())

    if (a != "listo"):
        a = int(a)
        num.append(a)

    else:
        i = i + 1
      
print(sorted(num))


# Ejercicio 4


num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print (num[::-1])


# Ejercicio 5


materias = ["Matemáticas", "Física", "Química", "Historia", "Lengua"]
notas = []

print ("\nCuanto te sacaste en Matemáticas?")
num = int(input())
if(num < 6):
    num = str(num)
    notas.append(num)
else:
    materias.remove("Matemáticas")

print("\nCuanto te sacaste en Física")
num = int(input())
if(num < 6):
    num = str(num)
    notas.append(num)
else:
    materias.remove("Física")



print("\nCuanto te sacaste en Química")
num = int(input())
if(num < 6):
    num = str(num)
    notas.append(num)
else: 
    materias.remove("Química")



print("\nCuanto te sacaste en Historia")
num = int(input())
if(num < 6):
    num = str(num)
    notas.append(num)
else:
    materias.remove("Historia")


print("\nCuanto te sacaste en Lengua")
num = int(input())
if(num < 6):
    num = str(num)
    notas.append(num)
else:
    materias.remove("Lengua")

if materias == []:
    print("El alumno aprobó todas las materias")
else:
    print("El alumno debe repetir las siguientes materias", materias)


# Ejercicio 6


abc = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]

for i in range(len(abc), 1, -1):
    
    if i % 3 == 0:
        abc.pop(i-1)

print(abc)


# Ejercicio 7


num = [50, 75, 46, 22, 80, 65, 8]
num = sorted(num)
print ("Menor:", num[0], "- Mayor:", num[-1])


# Ejercicio 8


num1 = [1, 2, 3]
num2 = [-1, 0, 2]
producto = []

primero = num1[0] * num2[0]
segundo = num1[1] * num2[1] 
tercero = num1[2] * num2[2]

producto.append(primero)
producto.append(segundo)
producto.append(tercero)

print(producto)





# ------------- DICCIONARIOS -------------





# Ejercicio 1


divisa = {"Euro":"€", "Dollar":"$", "Yen":"¥"}

print("Ingrese la divisa (Euro, Dollar, Yen)")
div = input()

if div == "Euro":
    print (divisa.get("Euro"))

if div == "Dollar":
    print (divisa.get("Dollar"))

if div == "Yen":
    print (divisa.get("Yen"))


# Ejercicio 2


nombre = input("Nombre: ")
edad = input("Edad: ")
direccion = input("Direccion: ")
telefono = input("Telefono: ")

datos = {"Nombre" : nombre, "Edad" : edad, "Direccion" : direccion, "Telefono" : telefono}

print (datos.get("Nombre"), "tiene", datos.get("Edad"), "años, vive en", datos.get("Direccion"), "y su numero es", datos.get("Telefono"))


# Ejercicio 3


frutas = {"Plátano": 1.35, "Manzana": 0.8, "Pera": 0.85, "Naranja": 0.7}

pedido = input("Ingrese la fruta: ")
kilos = int(input ("Ingrese la cantidad de kilos: "))

if pedido == "Plátano":
    print(round(frutas.get("Plátano") * kilos, 2))

if pedido == "Manzana":
    print(round(frutas.get("Manzana") * kilos, 2))

if pedido == "Pera":
    print(round(frutas.get("Pera") * kilos, 2))

if pedido == "Naranja":
    print(round(frutas.get("Naranja") * kilos, 2))

if pedido != "Plátano" and pedido != "Manzana" and pedido != "Pera" and pedido != "Naranja":
    print ("La fruta que ingreso no esta disponible o no la escribio de manera correcta")
    print ("Frutas disponibles: ", frutas.keys())


# Ejercicio 4


num1 = int(input("Ingrese nota de Matemáticas: "))
num2 = int(input("Ingrese nota de Física: "))
num3 = int(input("Ingrese nota de Química: "))

materias = {"Matemáticas": num1, "Física": num2, "Química": num3 }

print("\n\nMatemáticas tiene", materias.get("Matemáticas"), "notas")
print("Física tiene", materias.get("Física"), "notas")
print("Química tiene", materias.get("Química"), "notas\n\n")

print("El promedio de notas es:", (materias.get("Matemáticas") + materias.get("Física") + materias.get("Química"))/ len(materias.keys()))


# Ejercicio 5


carro = {}
i = 0

while i == 0:

    prod = input("\n\nIngrese el producto o 'listo' para terminar: ")
    
    if (prod != "listo"):

        precio = float(input("Ingrese el precio: "))

        if prod in carro.keys():
            nuevo = {prod : carro.get(prod) + precio}
            carro.update(nuevo)

        else:
            carro [prod] = precio

    else:
        i = 1

print ("\nArticulos                   Precio\n")

for i in carro.keys():
    
    precio = carro.get(i)
    while len(i)<10:
        i = i + " "
    print (i, "                ", precio)

print ("\nTotal                      ", sum(carro.values()),"\n")


# Ejercicio 6


trad = {}

print ("Ingrese las palabras a traducir 'español:ingles' separadas por comas")

word = input ().split(",")

for i in word:
    español, ingles = i.split(":")
    trad [español] = ingles

print ("Ingrese una frase paraa traducir: ")
frase = input()
frase = frase.lower()

for i in frase.split():

    if i in trad:
        print(trad.get(i), end = " ")

    else:
        print(i, end = " ")


# ------------- CONDICIONALES -------------


# Ejercicio 1


psw = "contraseña"

contra = input("Ingrese su contraseña: ")
contra = contra.lower()

if psw == contra:
    print("\nAcceso validado!!")
else:
    print("\nAcceso denegado!!")


# Ejercicio 2


num = int(input("Ingrese un numero entero: "))

if num % 2 == 0:
    print("Es par")
else:
    print("Es impar")


# Ejercicio 3


edad = int(input("Ingrese su edad: "))
ingreso = input("Ingrese sus ingresos mensuales con el signo de la moneda: ")

i = 0
for i in ingreso:
    if "€" not in ingreso:
        i = 1

if i == 1:
    print("Debe mostrar su ingreso en euros (€)")
else:
    ingreso = ingreso.replace("€", "")
    
    ingreso = int(ingreso)

    if edad >= 16 and ingreso >= 1000:
        print("\n¡Usted puede tributar!")
    else:
        print("\n¡Usted no puede tributar!")


# Ejercicio 4


sexo = input("Ingrese su sexo(Masculino/Femenino): ")
sexo = sexo.lower()
nombre = input("Ingrese su nombre: ")
nombre = nombre.title()
asci = ord(nombre[0])


if asci >= 65 and asci <= 90:

    if sexo == "masculino":

        if asci >= 78:
            print("Usted pertenece al grupo A")
        else:
            print("Usted pertenece al grupo B")
    
    if sexo == "femenino":

        if asci <= 77:
            print("Usted pertenece al grupo A")
        else:
            print("Usted pertenece al grupo B")

else:
    print("Ingrese un nombre, no use caracteres especiales ni letras")


# Ejercicio 5


renta = input("Ingrese su renta anual: ")

i = 0
for i in renta:
    if "€" not in renta:
        i = 1

if i == 1:
    print("Debe mostrar su renta en euros (€)")
else:
    renta = renta.replace("€", "")
    
    renta = int(renta)

    if renta < 10000:
        print("Su tipo impositivo es del 5%")

    if renta >= 10000 and renta < 20000:
        print("Su tipo impositivo es del 15% ")
    
    if renta >= 20000 and renta < 35000:
        print("Su tipo impositivo es del 20% ")

    if renta >= 35000 and renta < 60000:
        print("Su tipo impositivo es del 30% ")

    if renta >= 60000:
        print("Su tipo impositivo es del 45% ")


# Ejercicio 6


ingVeg = {1 : "Pimiento", 2 : "Tofu"}
ing = {1 : "Muzarella", 2 : "Tomate"}
ingNoVeg = {1 : "Peperoni", 2 : "Jamón", 3 : "Salmón"}

vegui = input("Quiere una pizza vegatariana (SI/NO): ").lower()

if vegui != "si" and vegui != "no":
    print("Debe ingresar SI o NO como respuesta")

if vegui == "si":
    print ("• Ingredientes vegetarianos: \n1: Pimiento\n2: Tofu")
    print("Ingrese el número del ingrediente que desea agregar (solo puede ingresar un ingrediente)")
    x = input()
    x = int(x)
    if x in ingVeg.keys():
        print ("\n\nLos ingredientes de su pizza 'vegui' son: ")
        print(ing.get(1),"\n", ing.get(2),"\n", ingVeg.get(x))
    else:
        print("Ese ingrediente no existe")

if vegui == "no":
    print ("• Ingredientes no vegetarianos: \n1: Peperoni\n2: Jamón\n3: Salmón.")
    print("Ingrese el número del ingrediente que desea agregar (solo puede ingresar un ingrediente)")
    x = input()
    x = int(x)

    if x in ingNoVeg.keys():
        print ("\n\nLos ingredientes de su pizza 'no vegui' son: ")
        print(ing.get(1),"\n", ing.get(2),"\n", ingNoVeg.get(x))
    else:
        print("Ese ingrediente no existe")    





# ------------- BUCLES -------------





# Ejercicio 1


word = input("Ingrese una palabra: ")
i = 0

while i < 10:
    print (word)
    i += 1


# Ejercicio 2


edad = int(input("Ingrese su edad: "))
i = 1

while edad >= i:
    print(i)
    i = i + 1


# Ejercicio 3


num = int(input("Ingrese un número: "))
x = 1
if num % 2 == 0:
    num = num - 1

while num >= x:
        print(x, end = ", ")
        x = x + 2


# Ejercicio 4


num = int(input("Ingrese un número: "))

while num >= 0:
        print(num, end = ", ")
        num = num - 1


# Ejercicio 5


num = int(input("Ingrese un número: "))
i = 0
y = 0

while num > 0:
    
    num = num - 1
    y = y + 1

    for i in range(y):
        print ("*", end = "")
    
    print("")


# Ejercicio 6


x = 1
for i in range(10):
    print(x*1, x*2, x*3, x*5, x*6, x*7, x*8, x*9, x*10)
    x += 1


# Ejercicio 7


contraseña = "contraseña"

i = 0

while i == 0:
    x = input("Ingrese la contraseña: ")

    if x == contraseña:
        print("¡Acceso Validado!")
        i = 1
    else:
        print("Acceso Denegado, vuelva a ingresar")


# Ejercicio 8


word = input("Ingrese una palabra: ")

i = len(word)

for i in range(len(word), 0, -1):
    print (word[i-1], end = " - ")


# Ejercicio 9


frase = input("Ingrese una frase: ").lower()
i = 1
while i == 1:

    letra = input("Ingrese una letra: ").lower()
    x = ord(letra)
    
    if (x >= 97 and x <= 122):
        i = 0
    else:
        print("No ingreso una letra, ingrese una letra: ")

for x in frase:
    if (x == letra):
        i = i + 1
print("La letra", letra, "se encuentra", i, "veces en la frase")





# ------------- FUNCIONES -------------





# Ejercicio 1


def saludo():
    print("¡Hola amiga!")

saludo()


# Ejercicio 2


nombre = input("Ingrese su nombre: ").title()
def saludo():
    print("Hola", nombre)

saludo()


# Ejercicio 3


def factorial(num):

    i = 0
    x = num
    fact = 1
    for i in range(num):

        fact = fact * num
        num = num - 1
    
    print("El factorial de", x, "es",fact)

factorial(num = int(input("Ingrese un número para caluclar su factorial: ")))


# Ejercicio 4


def funcion():
    factura = float(input("Ingrese su factura: "))
    iva = input("Ingrese el IVA: ")
    if iva:
        iva = float(iva)
        print(factura + ((iva/100) * factura))
    
    else:
        print(factura + ((21/100) * factura))

funcion()


# Ejercicio 5


def circulo():
    diametro = float(input("Ingrese el diametro de un circulo en cm: "))
    radio = diametro / 2
    pi = 3.141592
    area = round(pi * (radio ** 2), 2)
    print ("El area del circulo es: ", area, "cm")
    
    return pi, radio
    

def cilindro(pi, radio):

    h = float(input("Ingrese la altura del cilindro: "))
    volumen = round(pi * h * (radio ** 2), 2)
    print ("El volumen del cilindro es de: ", volumen)

pi, radio = circulo()
cilindro(pi, radio)


# Ejercicio 6


num = []
i = 0
print("Ingrese numeros al azar para calcular su media (Para finalizar ingrese cualquier letra): ")

while i == 0:
    x = input()
    if x.isdigit():
        x = float(x)
        num.append(x)
    else:
        i = 1

sum = sum(num)
len = len(num)

print("La media de los numeros ingresados es: ", sum/len)


# Ejercicio 7


num = []
cdr = []
i = 0

print("Ingrese los numeros: ")

while i == 0:
    x = input()
    if x.isdigit():
        x = int(x)
        num.append(x)
    else:
        i = 1

print(num)

y = 0

while y == 0:

    for z in range (len(num)): 
        cdr.append(num[z]**2)

    else:
        y = 1

print(cdr)