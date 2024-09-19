package sberernguer._daw.ejercicios.progFuncional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {
    static Ejercicios ejercicios;
    List<Integer> list = List.of(1, 2, 3, 4,1,3);
    List<String> listString = List.of("a", "b", "c", "d","andalucia");
    Integer value=2;
    @BeforeAll
    static void setup(){
        ejercicios= new Ejercicios();
    }

    @Test
    void suma() {
        assertEquals(14, ejercicios.suma(list));
    }

    @Test
    void pares() {
        assertEquals(List.of(2,4),ejercicios.pares(list));
    }

    @Test
    void mayusculas() {
        assertEquals(List.of("A", "B", "C", "D","ANDALUCIA"), ejercicios.mayusculas(listString));
    }

    @Test
    void maximo() {
        assertEquals(4,ejercicios.maximo(list));
    }

    @Test
    void mayores() {
        assertEquals(3,ejercicios.mayores(list,value));
    }

    @Test
    void concatenar() {
        assertEquals("abcdandalucia", ejercicios.concatenar(listString));
    }

    @Test
    void cuadrado() {
    }

    @Test
    void borraduplicados() {
    }

    @Test
    void mayorvalor() {
    }

    @Test
    void letraempieza() {
    }
}