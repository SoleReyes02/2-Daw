package sberernguer._daw.ejercicios.progFuncional;

import java.util.List;
import java.util.Optional;

public class Ejercicios {

    //ejercicio1
    public Integer suma(List<Integer> list) {
        /*forma facil el listado son integer y quieres sumar*/
        Integer resultado = list.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
        return resultado;
    }

    //ejercicio2
    public List<Integer> pares(List<Integer> list) {
        List<Integer> resultado = list.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(resultado);
        return resultado;
    }

    //ejercicio3
    public List<String> mayusculas( List<String> listString) {
        List<String> resultado = listString.stream().map(string->string.toUpperCase()).toList();
                System.out.println(resultado);
        return resultado;
    }
    //ejercicio4
    public Integer maximo(List<Integer> list){
        Integer resultado = list.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio5
    public long mayores(List<Integer> list,Integer value){
        long resultado = list.stream().filter(num->num>value).count();
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio6
    public String concatenar( List<String> listString){
        String resultado = listString.stream().reduce("",(a,b)->a+b);
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio7
    public List<Integer> cuadrado(List<Integer> list){
        List<Integer> resultado = list.stream().map(num -> num*num).toList();
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio8
    public List<Integer> borraduplicados(List<Integer> list){
        List<Integer> resultado=list.stream().distinct().toList();
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio9
    public Optional<Integer> mayorvalor(List<Integer> list,Integer value){
        Optional<Integer> resultado = list.stream().filter(num->num>value).findFirst();
        System.out.println(resultado);
        return resultado;
    }
    //ejercicio10
    public List<String> letraempieza(List<String> listString) {
        List<String> resultado = listString.stream().filter(name -> name.startsWith("a")).toList();
        System.out.println(resultado);
        return resultado;
    }

}
