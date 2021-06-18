package Project;

import Project.AddTravel.MainAddExecute;
import Project.AnyaMed.MainAnyaExecute;
import Project.SpeedyErSepsis.MainSpeedyExecute;

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
