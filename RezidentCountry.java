public class RezidentCountry {

    public static final String[] names = {"Alexandru", "Andrei", "Mirel", "Mihai"};

    public static AbstractRezident getRezident(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name) && !names[i].equalsIgnoreCase("Cristi")) {
                return new Townsman(name);
            } else if (names[i].equalsIgnoreCase("Cristi")) {
                return new Villager(name);
            }
        }
            return new NullRezident();
        }
    }

