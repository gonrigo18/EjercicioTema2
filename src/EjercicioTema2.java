public class EjercicioTema2 {

    public static void main(String[] args) {
    iva(100);
    }
    public static void iva (int monto){
        int iva = (monto*21)/100;
        int total = monto + iva;
        System.out.println(total);

    }
}
