import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static  final Map<String,Developer> developerMap = new HashMap<>() ;

    public Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developerMap.get(specialty);

        if(developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;

                case "c++":
                    System.out.println(" Hiring C++ developer");
                    developer = new CppDeveloper();
                    break;
            }
            developerMap.put(specialty,developer);
        }
        return developer;
    }
}
