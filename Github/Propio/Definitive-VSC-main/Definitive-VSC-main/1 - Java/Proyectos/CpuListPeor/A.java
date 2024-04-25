package CpuListPeor;

import java.io.IOException;

public interface A {
    public static void main(String[] args) throws InterruptedException, IOException {
        String color_black = "\033[30m";
        String color_red = "\033[31m";
        String color_green = "\033[32m";
        String color_yellow = "\033[33m";
        String color_blue = "\033[34m";
        String color_purple = "\033[35m";
        String color_cyan = "\033[36m";
        String color_white = "\033[37m";
        String color_reset = "\u001B[0m";

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("                - Inicio -");
    }
}
