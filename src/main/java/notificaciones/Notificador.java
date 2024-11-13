/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificaciones;
import java.util.*;
import java.text.SimpleDateFormat;
import Database.*;

/**
 *
 * @author bolli
 */
public class Notificador {
    public static void notificarSiEsElMomento(int userId) {
        // Paso 1: Obtener los medicamentos del usuario desde la base de datos
        ArrayList<HashMap<String, String>> medicamentos = DatabaseFunctions.SELECT(
            "user_meds", 
            new String[]{"id", "user_id", "medicine_id", "frecuency", "start_time", "dose"}, 
            "user_id", 
            String.valueOf(userId)  // Usamos el ID del usuario
        );

        // Paso 2: Obtener la hora actual
        Calendar ahora = Calendar.getInstance();
        int horaActual = ahora.get(Calendar.HOUR_OF_DAY);
        int minutoActual = ahora.get(Calendar.MINUTE);

        // Paso 3: Iterar sobre los medicamentos del usuario
        for (HashMap<String, String> medicamento : medicamentos) {
            // Obtener los datos de cada medicamento
            String nombreMedicamento = medicamento.get("medicine_id"); // Suponiendo que 'medicine_id' es el nombre del medicamento
            String dosis = medicamento.get("dose");
            int frecuencia =Integer.parseInt(medicamento.get("frecuency"));
            String startTime = medicamento.get("start_time");  // Hora de inicio configurada

            // Analizar la hora de inicio del medicamento (en formato "HH:mm")
            String[] horaInicio = startTime.split(":");  // Asumimos que start_time es una cadena en formato "HH:mm"
            int horaInicioMedicamento = Integer.parseInt(horaInicio[0]);  // Hora de inicio
            int minutoInicioMedicamento = Integer.parseInt(horaInicio[1]);  // Minuto de inicio

            // Convertir la hora de inicio del medicamento en minutos desde la medianoche
            int minutosInicioMedicamento = horaInicioMedicamento * 60 + minutoInicioMedicamento;

            // Convertir la hora actual en minutos desde la medianoche
            int minutosActuales = horaActual * 60 + minutoActual;

            // Calcular la diferencia de minutos entre la hora actual y la hora de inicio del medicamento
            int diferenciaDeMinutos = minutosActuales - minutosInicioMedicamento;

            // Comprobar si es el momento de tomar la medicación según la frecuencia
            if ((diferenciaDeMinutos >= 0) && (diferenciaDeMinutos % frecuencia == 0)) {
                // Si ha pasado el tiempo correcto según la frecuencia, mostramos la notificación
                mostrarNotificacion(nombreMedicamento, dosis);
                }
            }
        }
    

    // Paso 8: Mostrar la ventana de notificación
    private static void mostrarNotificacion(String nombreMedicamento, String dosis) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Crea y muestra la ventana de notificación con el nombre y la dosis del medicamento
            Notificacion notificacion = new Notificacion(nombreMedicamento, dosis);
            notificacion.setVisible(true);
        });
    }
}
    

