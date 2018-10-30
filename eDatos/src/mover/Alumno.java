package mover;

import java.io.*;

public class Alumno implements Serializable{
  int legajo;
  String nombre;
  Fecha fecha = new Fecha();
}