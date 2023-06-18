package com.wonu606.commandpattern.output;

public class ColorCommand implements Command {

    private Color color;

    public ColorCommand(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color.getCode());
    }

    public enum Color {
        BLACK("\u001B[30m"), RED("\u001B[31m"),
        GREEN("\u001B[32m"), YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"), PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"), WHITE("\u001B[37m");

        final private String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
