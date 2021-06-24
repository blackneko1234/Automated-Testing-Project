package Function;

import Function.Project.ProjectFactory;
import Function.Project.ProjectManager;

import java.util.ArrayList;

public class ProjectAndBrowserConnector {

    ProjectManager projectManager;

    public ProjectAndBrowserConnector(String Browser, String Project, ArrayList<String> keepIndex) {
        try {
            System.out.println(keepIndex);
            projectManager = ProjectFactory.getProject(Project, Browser);
            projectManager.TestRun(keepIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
