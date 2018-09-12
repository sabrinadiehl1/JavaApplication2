/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sabrina.diehl
 */
public class TrianguloTeste {
    
    @Test
    public void TrianguloEscaleno() {
        Triangulo triagulo = new Triangulo();
          Set<String> propriedades = triagulo.calculaTriangulo(12, 14, 5);
          assertEquals(propriedades.toString(), "[Escaleno, Válido]");
        
    }
    
        @Test
    public void TrianguloInvalido() {
        Triangulo triagulo = new Triangulo();
          Set<String> propriedades = triagulo.calculaTriangulo(99, 4, 3);
          assertEquals(propriedades.toString(), "[Inválido]");
        
    }
    
}
