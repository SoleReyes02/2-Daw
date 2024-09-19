package sberernguer._daw.ejemplos;

public class LambdaProgfuncional {
    //sin programacion funcional
    AddOperation addOperation= new AddOperation() {
        @Override
        public Integer add(Integer a, Integer b) {
            return 0;
        }
    };


//con programacion funcional lambda
    AddOperation addOperationFunctional = (a, b) -> a + b;
    public Integer add(Integer a,Integer b, AddOperation addOperation){
        return addOperation.add(a,b);
    }
}
