package metier;

import dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gestion implements IGestion {
    //couplage faible
    @Autowired
    @Qualifier("cal1")
    private ICalcul cal;

    @Override
    public double calcul() {
        double d = cal.getValue();
        double resultat = d * 10;
        return resultat;
    }

    public void setCal(ICalcul c) {
        this.cal = c;
    }
}
