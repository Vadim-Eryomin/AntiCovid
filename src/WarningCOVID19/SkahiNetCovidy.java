package WarningCOVID19;

public class SkahiNetCovidy {
    public boolean NetCovidy(int chislo) {
        boolean DaIliNet;

        if (chislo % 2 == 0) {
            DaIliNet = true;
        } else {
            DaIliNet= false;
        }

            return DaIliNet;
    }
    public boolean BolisheNylailiMenisheNyla(int chislo ){
        boolean Otvet;
        if (chislo>0) {
            Otvet = true;
        }else
            Otvet = false;
            return Otvet;

    }
}
