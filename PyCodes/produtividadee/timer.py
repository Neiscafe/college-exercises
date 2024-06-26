import time
import threading


def my_start_countdown(tempo):
    for min in reversed(range(0, tempo)):
        for seg in reversed(range(0, 60)):
            print(f"{min}:{seg}", end="\r", flush=True)
            time.sleep(1)


while True:
    inputted_value = str(input("Esperando input:"))
    comandos = inputted_value.split()
    if comandos[0] != "timer":
        next
    tempo = int(comandos[1])
    tasks = comandos[2:]
    # newThread = threading.Thread(target=my_start_countdown, args=[tempo])
    # newThread.start()
    # while(newThread.is_alive):
    #     print("\n")
    #     newInput = str(input(""))
    #     print(newInput)

    for minutes in reversed(range(0, tempo)):
        for seg in reversed(range(0, 60)):
            print("                                                     ", end="r")
            print(f"{minutes}:{seg}", end="\r", flush=True)
            time.sleep(1)
    print("Time's up!")
