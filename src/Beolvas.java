/*

* Author: Jakabos Ábel
* Copyright: 2023, Jakabos Ábel
* Group: Szoft/1/n
* Date: 2021-09-03

* Licenc: GNU GPL
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Beolvas {
    public static List<String>
    readFileInList(String fileName)
    {
 
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(
                Paths.get(fileName),
                StandardCharsets.UTF_8);
        }
 
        catch (IOException e) {
 
            // do something
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args)
    {
        List l = readFileInList(
            "berkft.txt");
 
        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

