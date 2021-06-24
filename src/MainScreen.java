import Function.ExtraComponent.CheckBoxGroup;
import Function.Project.AddTravel.AddTestCaseName;
import Function.Project.AnyaMed.AnyaTestCaseName;
import Function.Project.MainShortcut;
import Function.Project.SpeedyErSepsis.SpeedyTestCaseName;
import Function.ProjectAndBrowserConnector;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MainScreen {
    public static void main(String[] args) {
        MainScreen GUI = new MainScreen();

        GUI.CreateMainComponent();
        GUI.ComponentPersonality();
        GUI.AddComponentToFrame();
        GUI.SubmitEvent();
        GUI.ProjectEvent();

        MainShortcut.WindowsTerminateTask();
    }

    String[] BrowserList, ProjectList;
    CheckBoxGroup ContainTestCase;
    JComboBox<String> TestSegment, Browser, Project;
    JFrame Frame;
    JLabel SegmentTitle, BrowserTitle, ProjectTitle;
    JButton Submit;

    public void CreateMainComponent() {
        Frame = new JFrame();
        BrowserList = new String[]{"Chrome", "Firefox"};
        ProjectList = new String[]{"--- Please Select project ---", "Add Travel", "Anya Med", "Speedy Er Sepsis"};
        Browser = new JComboBox<>(BrowserList);
        Project = new JComboBox<>(ProjectList);
        BrowserTitle = new JLabel("Browser List");
        ProjectTitle = new JLabel("Project List");
        Submit = new JButton("Submit");
        TestSegment = new JComboBox<>();
        ContainTestCase = new CheckBoxGroup("");
        SegmentTitle = new JLabel("Testcase Segment");
    }

    public void ComponentPersonality() {
        Frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/Icon.png")));
        Frame.getContentPane().setBackground(Color.lightGray);
        Frame.setTitle("Automated testing By DJ (ง 'w')ว");
        Frame.setSize(400, 600);
        Frame.setResizable(false);
        Frame.setLocation(400, 50);
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ContainTestCase.setBounds(10, 200, 365, 300);
        TestSegment.setBounds(10, 170, 365, 25);

        SegmentTitle.setFont(new Font("Ariel", Font.BOLD, 16));
        SegmentTitle.setBounds(10, 140, 365, 25);

        BrowserTitle.setFont(new Font("Ariel", Font.BOLD, 20));
        BrowserTitle.setBounds(10, 10, 365, 25);
        Browser.setBounds(10, 40, 365, 25);

        ProjectTitle.setFont(new Font("Ariel", Font.BOLD, 20));
        ProjectTitle.setBounds(10, 80, 365, 25);
        Project.setBounds(10, 110, 365, 25);

        Submit.setBounds(10, 510, 365, 40);
    }

    public void AddComponentToFrame() {
        Frame.add(Submit);
        Frame.add(Browser);
        Frame.add(Project);
        Frame.add(BrowserTitle);
        Frame.add(ProjectTitle);
    }

    public void SubmitEvent() {
        Submit.addActionListener(e -> {
            String SelectedBrowser = (String) Browser.getSelectedItem();
            String SelectedProject = (String) Project.getSelectedItem();

            if (Objects.equals(Project.getSelectedItem(), ProjectList[0])) {
                JOptionPane.showMessageDialog(Frame
                        , "Please select project!!!!"
                        , "Alert"
                        , JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Frame
                        , SelectedBrowser + ", " + SelectedProject + ", " + ContainTestCase.KeepIndex
                        , "Alert"
                        , JOptionPane.PLAIN_MESSAGE);
                new ProjectAndBrowserConnector(SelectedBrowser, SelectedProject, ContainTestCase.KeepIndex);
            }
        });
    }

    public void ProjectEvent() {
        Project.addActionListener(e -> {
            switch (Objects.requireNonNull(Project.getSelectedItem()).toString()) {
                case "--- Please Select project ---" -> NonSelectProject();
                case "Anya Med" -> AnyaMedProjectSection();
                case "Add Travel" -> AddTravelProjectSection();
                case "Speedy Er Sepsis" -> SpeedyErSepsisProjectSection();
            }
        });
    }

    /*========Project========*/
    public void SpeedyErSepsisProjectSection() {
        String[] SpeedySegment = {
                "All",
                "Create or status change",
                "Login",
                "Homepage",
                "Create patient page",
                "Assess page",
                "Diagnose page",
                "Treatment page",
                "Disposition page",
                "All patient page"};
        Frame.remove(TestSegment);
        TestSegment = new JComboBox<>(SpeedySegment);
        TestSegment.setBounds(10, 170, 365, 25);
        TestSegment.addActionListener(q -> {
            switch (Objects.requireNonNull(TestSegment.getSelectedItem()).toString()) {
                case "All" -> SegmentCall(SpeedyTestCaseName.TestCaseList);
                case "Create or status change" -> SegmentCall(SpeedyTestCaseName.TestCaseListCreateOrStatusChangePage);
                case "Login" -> SegmentCall(SpeedyTestCaseName.TestCaseList[0]);
                case "Homepage" -> SegmentCall(SpeedyTestCaseName.TestCaseListHome);
                case "Create patient page" -> SegmentCall(SpeedyTestCaseName.TestCaseListCreatePatientPage);
                case "Assess page" -> SegmentCall(SpeedyTestCaseName.TestCaseListAssessPage);
                case "Diagnose page" -> SegmentCall(SpeedyTestCaseName.TestCaseListDiagnosePage);
                case "Treatment page" -> SegmentCall(SpeedyTestCaseName.TestCaseListTreatmentPage);
                case "Disposition page" -> SegmentCall(SpeedyTestCaseName.TestCaseListDispositionPage);
                case "All patient page" -> SegmentCall(SpeedyTestCaseName.TestCaseListAllPatientPage);
            }
        });
        CheckBoxGroupCall(SpeedyTestCaseName.TestCaseList);
    }

    public void AddTravelProjectSection() {
        String[] AddTravelSegment = {
                "All"
                , "AllAddTravel"
        };
        Frame.remove(TestSegment);
        TestSegment = new JComboBox<>(AddTravelSegment);
        TestSegment.setBounds(10, 170, 365, 25);
        TestSegment.addActionListener(q -> {
            switch (Objects.requireNonNull(TestSegment.getSelectedItem()).toString()) {
                case "All" -> SegmentCall(AddTestCaseName.TestCaseList);
                case "AllAddTravel" -> SegmentCall(AddTestCaseName.TestCaseList[0]);
            }
        });
        CheckBoxGroupCall(AddTestCaseName.TestCaseList);
    }

    public void AnyaMedProjectSection() {
        String[] AnyaSegment = {
                "All"
                , "AllAnya"
        };
        Frame.remove(TestSegment);
        TestSegment = new JComboBox<>(AnyaSegment);
        TestSegment.setBounds(10, 170, 365, 25);
        TestSegment.addActionListener(q -> {
            switch (Objects.requireNonNull(TestSegment.getSelectedItem()).toString()) {
                case "All" -> SegmentCall(AnyaTestCaseName.TestCaseList);
                case "AllAnya" -> SegmentCall(AnyaTestCaseName.TestCaseList[1]);
            }
        });
        CheckBoxGroupCall(AnyaTestCaseName.TestCaseList);
    }

    /*=============Calling=============*/
    public void SegmentCall(String... TestCaseList) {
        RemoveSegmentFrame();
        ContainTestCase = new CheckBoxGroup(TestCaseList);
        ContainTestCase.setBounds(10, 200, 365, 300);
        RepaintFrame();
    }

    public void CheckBoxGroupCall(String... TestCaseList) {
        Frame.remove(ContainTestCase);
        ContainTestCase = new CheckBoxGroup(TestCaseList);
        ContainTestCase.setBounds(10, 200, 365, 300);
        RepaintFrame();
    }

    public void NonSelectProject() {
        Frame.remove(ContainTestCase);
        Frame.remove(TestSegment);
        Frame.remove(SegmentTitle);
        ContainTestCase = new CheckBoxGroup("");

        Frame.add(ContainTestCase);
        Frame.invalidate();
        Frame.validate();
        Frame.repaint();
    }

    public void RepaintFrame() {
        Frame.add(SegmentTitle);
        Frame.add(TestSegment);
        Frame.add(ContainTestCase);
        Frame.invalidate();
        Frame.validate();
        Frame.repaint();
    }

    public void RemoveSegmentFrame() {
        Frame.remove(TestSegment);
        Frame.remove(ContainTestCase);
    }


}