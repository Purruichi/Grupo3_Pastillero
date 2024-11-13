/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Languages;

/**
 *
 * @author bolli
 */
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;

public class IdiomaManager {
    private static IdiomaManager instance;
    private Locale currentLocale;
    private ResourceBundle bundle;
    private List <IdiomaListener> listeners = new ArrayList<>();

    private IdiomaManager() {
        // Idioma predeterminado
        setLocale(new Locale("en", "US"));
    }

    public static IdiomaManager getInstance() {
        if (instance == null) {
            instance = new IdiomaManager();
        }
        return instance;
    }

    public void setLocale(Locale locale) {
        this.currentLocale = locale;
        this.bundle = ResourceBundle.getBundle("messages", currentLocale);
        notifyListeners();
    }

    public String getString(String key) {
        return bundle.getString(key);
    }

    public void addIdiomaListener(IdiomaListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (IdiomaListener listener : listeners) {
            listener.onIdiomaChanged();
        }
    }
}



