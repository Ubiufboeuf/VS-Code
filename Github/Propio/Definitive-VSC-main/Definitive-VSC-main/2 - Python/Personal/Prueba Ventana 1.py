import tkinter as tk

x = 1
while (x == 1):
    #Crea una ventana
    root = tk.Tk()

    #Establece el titulo de la ventana
    root.title("Ventana")

    #Establece el tamaño de la ventana
    root.geometry("600x600")
    
    #Establece el color de fondo de la ventana
    root.configure(background="red")

    # Añade un botón
    boton = tk.Button(root, text="Hola")
    
    # Cambia el tamaño del botón
    boton.config(width=100, height=50)

    # Coloca el botón en el centro de la ventana
    boton.place(x=root.winfo_width() // 2, y=root.winfo_height() // 2)

    
    #Muestra la ventana
    root.mainloop()