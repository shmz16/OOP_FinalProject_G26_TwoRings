/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

<<<<<<< HEAD
public class AppendableObjectOutputStream extends ObjectOutputStream {

=======
class AppendableObjectOutputStream extends ObjectOutputStream {
>>>>>>> FahimsBranch01
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
<<<<<<< HEAD
    protected void writeStreamHeader() throws IOException {

    }
}
=======
    protected void writeStreamHeader() throws IOException { 
        
    }
}
>>>>>>> FahimsBranch01
