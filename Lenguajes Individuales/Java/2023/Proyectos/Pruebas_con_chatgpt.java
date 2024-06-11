public class Pruebas_con_chatgpt {

    public static void main(String[] args) {
        final int numThreads = 2; // Número de hilos a utilizar (igual al número de núcleos del procesador)

        // Realizar prueba de rendimiento
        long startTime = System.nanoTime();

        // Crear un arreglo de hilos
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(Pruebas_con_chatgpt::realizarTarea);
            threads[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + elapsedTime + " nanosegundos");
    }

    public static void realizarTarea() {
        // Aquí implementa la tarea que deseas probar
        for (int i = 0; i < 500000; i++) {
            // Realiza alguna operación
        }
    }
}