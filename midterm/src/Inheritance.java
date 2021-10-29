public class Inheritance {
    public static void main(String[] args) {
        /**
         * Create Chicago
         * provinceName, provinceCapital, and provincePopulation are left as null or 0 because the U.S. does not
         * have provinces.
         */
        Town chicago = new Town("United States", "Washington D.C.", Government.DEMOCRACY,
                Currency.USD, 333532490, null, null, 0,
                "Illinois", "Springfield", 12569321, StateBird.NORTHERN_CARDINAL,
                "Cook", "Chicago", 5106780, "Chicago",
                2679080, 1833, TypeOfRule.NONE);

        // Simple output to show use of getters
        System.out.printf("%s is in %s County, %s, %s. %s has a population of %d and %s county has a population of %d.",
                chicago.getTownName(), chicago.getCountyName(), chicago.getStateName(), chicago.getCountryName(),
                chicago.getTownName(), chicago.getTownPopulation(), chicago.getCountyName(), chicago.getCountyPopulation());
    }
}

enum Government { DEMOCRACY, MONARCHY, COMMUNISM }

enum Currency { USD, EUR, GBP, CAD }

enum StateBird { NORTHERN_CARDINAL, AMERICAN_ROBIN, MOCKINGBIRD, PEREGRINE_FALCON }

enum TypeOfRule { HOME_RULE, DILLONS_RULE, NONE }

class Country {
    private String countryName;
    private String countryCapital;
    private Government government;
    private Currency currency;
    private int countryPopulation;

    public Country(String countryName, String countryCapital, Government government, Currency currency, int countryPopulation) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.government = government;
        this.currency = currency;
        this.countryPopulation = countryPopulation;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public Government getGovernment() {
        return government;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }
}

class Province extends Country {
    private String provinceName;
    private String provinceCapital;
    private int provincePopulation;

    public Province(String countryName, String countryCapital, Government government, Currency currency,
                    int countryPopulation, String provinceName, String provinceCapital, int provincePopulation) {
        super(countryName, countryCapital, government, currency, countryPopulation);
        this.provinceName = provinceName;
        this.provinceCapital = provinceCapital;
        this.provincePopulation = provincePopulation;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getProvinceCapital() {
        return provinceCapital;
    }

    public int getProvincePopulation() {
        return provincePopulation;
    }
}

class State extends Province {
    private String stateName;
    private String stateCapital;
    private int statePopulation;
    private StateBird stateBird;

    public State(String countryName, String countryCapital, Government government, Currency currency,
                 int countryPopulation, String provinceName, String provinceCapital, int provincePopulation,
                 String stateName, String stateCapital, int statePopulation, StateBird stateBird) {
        super(countryName, countryCapital, government, currency, countryPopulation, provinceName,
                provinceCapital, provincePopulation);
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.statePopulation = statePopulation;
        this.stateBird = stateBird;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateCapital() {
        return stateCapital;
    }

    public int getStatePopulation() {
        return statePopulation;
    }

    public StateBird getStateBird() {
        return stateBird;
    }
}

class County extends State {
    private String countyName;
    private String countySeat;
    private int countyPopulation;

    public County(String countryName, String countryCapital, Government government, Currency currency,
                  int countryPopulation, String provinceName, String provinceCapital, int provincePopulation,
                  String stateName, String stateCapital, int statePopulation, StateBird stateBird, String countyName,
                  String countySeat, int countyPopulation) {
        super(countryName, countryCapital, government, currency, countryPopulation, provinceName,
                provinceCapital, provincePopulation, stateName, stateCapital, statePopulation, stateBird);
        this.countyName = countyName;
        this.countySeat = countySeat;
        this.countyPopulation = countyPopulation;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getCountySeat() {
        return countySeat;
    }

    public int getCountyPopulation() {
        return countyPopulation;
    }
}

class Town extends County {
    private String townName;
    private int townPopulation;
    private int yearEstablish;
    private TypeOfRule typeOfRule;

    public Town(String countryName, String countryCapital, Government government, Currency currency,
                int countryPopulation, String provinceName, String provinceCapital, int provincePopulation,
                String stateName, String stateCapital, int statePopulation, StateBird stateBird, String countyName,
                String countySeat, int countyPopulation, String townName, int townPopulation, int yearEstablish,
                TypeOfRule typeOfRule) {
        super(countryName, countryCapital, government, currency, countryPopulation, provinceName, provinceCapital,
                provincePopulation, stateName, stateCapital, statePopulation, stateBird, countyName, countySeat,
                countyPopulation);
        this.townName = townName;
        this.townPopulation = townPopulation;
        this.yearEstablish = yearEstablish;
        this.typeOfRule = typeOfRule;
    }

    public String getTownName() {
        return townName;
    }

    public int getTownPopulation() {
        return townPopulation;
    }

    public int getYearEstablish() {
        return yearEstablish;
    }

    public TypeOfRule getTypeOfRule() {
        return typeOfRule;
    }
}

