package Project;


import Project.SpeedyErSepsis.MainSpeedyExecute;

public class ProjectFactory {
    public static ProjectManager getProject(String Project, String Browser) {
        ProjectManager projectManager;

        switch (Project) {
            case "Speedy Er Sepsis" -> projectManager = new MainSpeedyExecute(Browser);

            default -> throw new IllegalStateException("Unexpected value: " + Project);
        }
        return projectManager;
    }
}
