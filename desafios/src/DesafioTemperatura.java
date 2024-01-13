public class DesafioTemperatura {
    public static void main(String[] args) {

        double temperaturaEmGrausCelsius = 33.2;
        double temperaturaEmFahrenheit = (temperaturaEmGrausCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura em Graus Celsius é de %fé equivalente a Fahrenit é %f ", temperaturaEmGrausCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura sem casas decimais em Fahrenheit é " + temperaturaEmFahrenheitInteira);
    }
}
