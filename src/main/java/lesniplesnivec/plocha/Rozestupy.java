package lesniplesnivec.plocha;

public class Rozestupy {
    private final Double MININALNI_ROZESTUP = 2D;

    public Double minimalniPlocha ( int pocetLidi) {
      Double plocha = Math.pow(MININALNI_ROZESTUP,2);
      return  plocha * pocetLidi;
    }
}
