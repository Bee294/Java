package lambda.project;
//Functional interface: Là các interface có duy nhất một method trùy trừu tượng.
// Để sử dụng nó ta thêm annotation @FunctionalInterface

@FunctionalInterface
public interface AddNumber {
    public int sum(int numb1, int num2);
}
