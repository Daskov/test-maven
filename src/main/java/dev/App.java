package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Ello World!" );
        String a = FigletFont.convertOneLine("Guillaume");
        System.out.println(a);
    }
}
