package sberernguer._daw.ejemplos;

//la interfaz funcional solo puede tener 1 metodo y es igual q una interfaz normal
@FunctionalInterface
public interface AddOperation {
    Integer add(Integer a, Integer b);
}
