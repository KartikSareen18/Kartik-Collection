package org.example;

/**
 * Hello world!
 *
 */

import java.util.logging.*;
import List.List;

public class App
{
    private static final Logger logger = Logger.getLogger((org.example.App.class.getName()));

    public static void main( String[] args )
    {
        List<Integer> list = new List<Integer>();

        logger.severe("Initiating List:");
        for(int i=0;i<10;i++)
            list.add(i);

        logger.info("List : ");
        logger.info(list.toString());
        logger.info("Removing 7 and 8 from list");
        logger.info("Element removed " +list.remove(7));
        logger.info("Element removed " +list.remove(7));
        logger.info("Size of list : "+list.size());
        logger.info("List : ");
        logger.info(list.toString());
    }
}
