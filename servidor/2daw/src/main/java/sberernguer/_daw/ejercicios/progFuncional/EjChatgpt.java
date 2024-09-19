package sberernguer._daw.ejercicios.progFuncional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjChatgpt {
    List<Integer> list = List.of(1, 2, 3, 4,5,6);
    List<String> listString = List.of("abc", "andalucia", "cordoba", "vlc","malaga","df");
    //ejercicio1chatgpt
    /*### 1. *Suma de los cuadrados de números pares*
    Dada una lista de enteros, calcula la suma de los cuadrados de los números pares.
     *Hint*: Usa filter, map y reduce.*/
    public Integer cuadradopar(){
        Integer resultado = list.stream().filter(num->num%2==0).map(num -> num*num).reduce(0,(a,b)->a+b);
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio2chatgpt
    /*### 2. *Filtrado de cadenas*
    Dada una lista de cadenas, devuelve una nueva lista que contenga
    solo las cadenas que tienen más de 5 caracteres.
    - *Hint*: Usa filter y collect(Collectors.toList()).*/
    public List<String> filterString(){
        List<String> resultado= listString.stream().filter(s->s.length()>5).toList();
        System.out.println(resultado);
        return resultado;
    }

    /*### 3. *Conversión de una lista a un mapa*
    Dada una lista de cadenas, convierte esa lista a un mapa donde la clave
    sea la cadena y el valor sea la longitud de esa cadena.
    - *Hint*: Usa Collectors.toMap.*/
    /*
    public Map<String,Integer> mapa(){
        Map<String,Integer> resultado= listString.stream().map(cadena->cadena,);
        System.out.println(resultado);
        return resultado;
    }*/

    /*### 4. *Palabras que empiezan con una letra dada*
    Dada una lista de palabras y una letra, devuelve una lista con todas
    las palabras que comienzan con esa letra.
    - *Hint*: Usa filter y collect.*/

    /*### 5. *El número más grande menor que un valor dado*
    Dada una lista de enteros, encuentra el número más grande que sea menor a un valor dado.
    - *Hint*: Usa filter, max, y un Comparator si es necesario.*/
}
