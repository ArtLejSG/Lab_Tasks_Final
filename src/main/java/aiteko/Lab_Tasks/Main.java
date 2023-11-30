package aiteko.Lab_Tasks;

import aiteko.Lab_Tasks.*;
import java.util.stream.Stream;

public class Main
{
    public static void main( String[] args ) {
        Stream.of(new Number1(), new Number2(),
                new Number3(), new Number4(),
                new Number5(), new Number6(),
                new Number7(), new Number8(),
                new Number9()).forEach(Runner::run);
    }
}