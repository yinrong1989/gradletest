package com.manning.gia.todo.utils;

/**
 * Created by yinrong on 2016/8/8.
 */
public enum CommandLineInput {
    FIND_ALL('a'),FIND_BY_ID('f'),INSERT('i'),UPDATE('u'),DELETE('d'),EXIT('e');

    CommandLineInput(char shortCmd) {
        this.shortCmd = shortCmd;
    }

    char[] inputChars;
    private char shortCmd;
    public static CommandLineInput getCommandLineInputForInput(char command){
        CommandLineInput commandLineInput=null;
        switch (command) {
            case 'a':commandLineInput= FIND_ALL;break;
            case 'f':commandLineInput= FIND_BY_ID;break;
            case 'i':commandLineInput= INSERT;break;
            case 'u':commandLineInput= UPDATE;break;
            case 'd':commandLineInput= DELETE;break;
            case 'e':commandLineInput= EXIT;break;
        }
        return commandLineInput;

    }

    public char[] getInputChars() {
        return inputChars;
    }

    public void setInputChars(char[] inputChars) {
        this.inputChars = inputChars;
    }

    public char getShortCmd() {
        return shortCmd;
    }

    public void setShortCmd(char shortCmd) {
        this.shortCmd = shortCmd;
    }
}
