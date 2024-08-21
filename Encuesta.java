public class Encuesta {
    public static void main(String[] args) {
        char[][] respuestas = {
            {'s','n','x','x','s'},
            {'n','n','s','x','n'}            
        };

        System.out.println("Total de hombre que aprueban la gestion del gobierno: " + contarHombreAprueban(respuestas));
        System.out.println("Total de mujeres que desaprueban la gestion: " + contarMujeresDesaprueban(respuestas));
        System.out.println("Porcentaje total de encuestados que aprueban la gestion: " + porcentajeAprueban(respuestas) +"%");
        System.out.println("Total de personas que participaron en la encuesta " + totalPersonas(respuestas));

    }

    public static int contarHombreAprueban(char[][] respuestas) {
        int cuenta = 0;
        for (int i = 0; i < respuestas[0].length; i++){

            if (respuestas[0][i] == 's'){
                cuenta ++;
            }

        }
        return cuenta;
    }

    public static int contarMujeresDesaprueban(char[][] respuestas) {
        int cuenta = 0;
        for (int i = 0; i < respuestas[0].length; i++ ){

            if (respuestas[1][i] == 'n'){
                cuenta ++;
            }

        }
        return cuenta;
    }

    public static double porcentajeAprueban(char[][] respuestas) { 
        int totalAprobados = 0;
        int totalEncuestados = respuestas[0].length + respuestas[1].length;
        for (int i = 0; i < respuestas[0].length;c i++ ){

            if (respuestas[0][i] == 's') {
                totalAprobados ++;
            }

            if (respuestas[1][i] == 's') {
                totalAprobados ++;
            }

        }
        return (totalAprobados * 100) / totalEncuestados;
    }

    public static int totalPersonas(char[][] respuestas) {
        return respuestas[0].length + respuestas[1].length;
    }

}