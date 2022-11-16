package com.command;
import java.io.IOException;
import java.util.Scanner;

public class Database {
    Scanner scanner = new Scanner(System.in);
    public Database(SalatFileCommand salatFileCommand, HelpCommand helpCommand, ExitCommand exitCommand) {
    }

    public Database() {

    }


    public void salatFile() throws IOException {
    }

    public void help() throws IOException {
    }

    public void exit(){
        System.exit(0);
    }

}
