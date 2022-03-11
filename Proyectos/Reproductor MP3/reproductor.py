from tkinter import *
import tkinter
import os
import random
from tkinter.constants import HORIZONTAL, Y
import pygame
from PIL import ImageTk, Image

canciones=[]
reproduciendo = False
pausado = 0



ventana = Tk()

screen_width = ventana.winfo_screenwidth()
screen_height = ventana.winfo_screenheight()

centro_x = int(screen_width/2)
centro_y = int(screen_height/2)

ventana.geometry(f"600x400+{centro_x - 300}+{centro_y - 200}")

photo = ImageTk.PhotoImage(file = "img1.jpg")
img = tkinter.Label(ventana, image = photo).pack()



cancion = tkinter.Entry(ventana)

cancion.pack()



def rgb(rgb):
    return "#%02x%02x%02x" % rgb   

def files():
    try:
        for i in (os.listdir("C:/Users/mateo/Desktop/Colegio/Proyectos/Python Proyects/Reproductor MP3/canciones/")):
            if i[-3:] == "mp3": 
                canciones.append(i)
        
    except:
        texto = tkinter.Label(ventana, text = "El directorio especificado para la carpeta de canciones es incorrecto.\nCorrijalo en el codigo y vuelva a intentarlo")
        texto.pack()

    


def play():
    
    
    global reproduciendo
    global actual
    global canciones
    global cancion
    esta = False
    
    actual = cancion.get()
    
    for i in canciones:

        if actual == i[:-4]:
            actual = actual + ".mp3"
            actual = "canciones/" + actual
            pygame.mixer.init()
            pygame.mixer.init()
            pygame.mixer.music.load(actual)
            pygame.mixer.music.play()
            reproduciendo = True
            esta = True
               

        elif i == actual:
            actual = "canciones/" + actual
            pygame.mixer.init()
            pygame.mixer.init()
            pygame.mixer.music.load(actual)
            pygame.mixer.music.play()
            reproduciendo = True
            esta = True



    if esta == False:
        noFile()
            
           
            

def noFile():
    
    ventana2 = tkinter.Tk()
    ventana2.geometry(f"300x100+{centro_x - 100}+{centro_y - 100}")
    ventana2.title("ERROR!")
    texto = tkinter.Label(ventana2, text = "No se encontro esa cancion")
    texto.pack()
    ventana2.mainloop()
    
        

def random():
    import random
    global canciones
    global actual
    global reproduciendo

    print(canciones)
    actual = "canciones/" + random.choice(canciones)
    pygame.mixer.init()
    pygame.mixer.music.load(actual)
    pygame.mixer.music.play()
    reproduciendo = True                  



def stop():
    
    global actual
    global reproduciendo
    global pausado

    if pausado == 0:
        if reproduciendo == True:
            pygame.mixer.music.pause()
            pausado = 1
        else:
            etiqueta = tkinter.Label(ventana, text = "No hay archivos en reproduccion")
            etiqueta.pack()
    else:
        pygame.mixer.music.unpause()
        pausado = 0

def close():
    global reproduciendo
    global actual
    if reproduciendo == True:
        print("iniciado")
        pygame.mixer.music.unload()
        reproduciendo = False
    else:
        print("nada q cerrar")

def volMas():
    vol = pygame.mixer.Sound.get_volume
    print (vol)



files()



botonPlay = tkinter.Button(ventana, text = "Play", bg = rgb((140,140,140)), command = lambda : play())
botonPlay.place(x=275, y=325, width=50, height=30)

botonStop = tkinter.Button(ventana, text = "Stop", bg = rgb((140,140,140)), command = lambda : stop())
botonStop.place(x=350, y=325, width=50, height=30)

botonClose = tkinter.Button(ventana, text = "Close", bg = rgb((140,140,140)), command = lambda : close())
botonClose.place(x=200, y=325, width=50, height=30)

botonRandom = tkinter.Button(ventana, text = "Random", bg = rgb((140,140,140)), command = lambda : random())
botonRandom.place(x=275, y=275, width=50, height=30)

botonRandom = tkinter.Button(ventana, text = "vol+", bg = rgb((140,140,140)), command = lambda : volMas())
botonRandom.place(x=500, y=275, width=30, height=30)

botonRandom = tkinter.Button(ventana, text = "vol-", bg = rgb((140,140,140)), command = lambda : volMenos())
botonRandom.place(x=500, y=315, width=30, height=30)


ventana.mainloop()
files()