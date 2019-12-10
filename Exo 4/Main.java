public class Main {
    public static void main(String[] args)  {
        if (args.length==0) {
            System.out.println("Manque des arguments");
        }
        String test = "bacalo";
        System.out.println(test.length());
            Alphabet alphabet = new Alphabet(args[0]);
            alphabet.verifyAlphabet(args[1]);
        if(args[2] != null && args[3] != null){
            switch (args[2]){
                case "/a":
                    alphabet.checkAnagramme(args[1],args[3]);
                    break;
                case "/o":
                    alphabet.deleteString(args[1], args[3]);
                    break;
                default:
                    throw new IllegalStateException("Valeur incorrecte" + args[3]);
            }
        }
    }
}
