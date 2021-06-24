package Function.Project;

import Function.Project.AddTravel.MainAddExecute;
import Function.Project.AnyaMed.MainAnyaExecute;
import Function.Project.SpeedyErSepsis.MainSpeedyExecute;

public class ProjectFactory {
    public static ProjectManager getProject(String Project, String Browser) {
        ProjectManager projectManager;

        switch (Project) {
            case "Speedy Er Sepsis" -> projectManager = new MainSpeedyExecute(Browser);
            case "Add Travel" -> projectManager = new MainAddExecute(Browser);
            case "Anya Med" -> projectManager = new MainAnyaExecute(Browser);
            default -> throw new IllegalStateException("Unexpected value: " + Project);
        }
        return projectManager;
    }
}
