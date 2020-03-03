package com.company;

/*

1213 “Correct the code”, part 2
Correct the code so that the program compiles.

Requirements:
1. The class Pet must be static.
2. The Pet class must have two methods.
3. The getChild () method must be abstract.
4. The Pet class must be declared with a modifier that prohibits the creation of specific objects of this class.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {

            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}

