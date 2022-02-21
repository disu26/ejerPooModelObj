/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 * Clase planeta, esta se extiende de la clase abastracta sistema planetario.
 * 
 * @version 1.00.000 2022-02-20
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Planet extends PlanetarySistem{
    
    /**
     * Constructor para la clase planeta, los atributos se extienden de la clase abstracta.
     * @param mass
     * @param density
     * @param diameter
     * @param sunDistancy
     * @param id
     * @param name 
     */
    public Planet(double mass, double density, double diameter, double sunDistancy, String id, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistancy = sunDistancy;
        this.id = id;
        this.name = name;
    }
}
