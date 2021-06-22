package Project.SpeedyErSepsis;

public class SpeedyTestCaseName {
    public static String[] TestCaseList = new String[]{
            "1. Login Test"
            , "2. Show username"
            , "3. Add patient"
            , "4. Current time when add patient"
            , "5. Can save the data when add all patient detail"
            , "6. Can selected only one consciousness"
            , "7. Value cannot breakout the limit"
            , "8. Value cannot negative"
            , "9. When edit data the value cannot be negative"
            , "10. Show the created time of case"
            , "11. Show MPEW/NEWS"
            , "12. Cannot edit data with alphabet"
            , "13. Change status waiting for assess to waiting for diagnosis"
            , "14. Data in diagnosis cannot negative"
            , "15. pMap, NEWS, or MPEW cannot edit"
            , "16. Diagnose page cannot type alphabet"
            , "17. Click assess icon it will bring you back to assess page"
            , "18. Can choose one choice of infection and not infection"
            , "19. Edit data, Check status when activate fast protocol, Show time when save in patient treatment that save from diagnose page, and Check status waiting for treatment"
            , "20. Data in patient treatment cannot be negative"
            , "21. Status changed to Treating"
            , "22. Can choose only one infection or not infection in treatment page"
            , "23. Can input note in treatment page"
            , "24. Click assess icon it will bring you back to assess page and click treat icon it will bring you back to treat page"
            , "25. Edit patient information in treatment page"
            , "26. Can choose only one sepsis, septic shock, or sepsis induced in treatment page"
            , "27. Mecrit Notified when save"
            , "28. Change time in Admit and Refer"
            , "29. Can choose only one Discharge,Against advice,and Death"
            , "30. Can edit patient information in disposition page"
            , "31. Show all patient information"
            , "32. Press cancel button to back to all patient"
            , "33. Press save button it will show confirm popup, When click cancel popup it will show the disposition page, and When submit popup status will changed to archive"
            , "34. Show all patient status"
            , "35. When scroll down and up it can press add button to go to add page"
            , "36. Go to disposition page"
            , "37. Show all patient info in disposition icon"
            , "38. Press status filter to show the chooses status"
            , "39. If status is \"Archive\" the status cannot change to other"
    };

    /*public static SpeedyTestCaseID[] TestCaseList2 = new SpeedyTestCaseID[]{
            new SpeedyTestCaseID(1, " Login Test")

    };*/

    public static String[] TestCaseListCreateOrStatusChangePage = new String[]{
            "3. Add patient (Add patient and status is \"waiting for assess\")"
            , "13. Change status waiting for assess to waiting for diagnosis (Change status to \"waiting for diagnose\")"
            , "19. Edit data, Check status when activate fast protocol, Show time when save in patient treatment that save from diagnose page, and Check status waiting for treatment (Status change to \"Waiting to treatment\")"
            , "27. Mecrit Notified when save (Change status to \"Treating\")"
            , "33. Press save button it will show confirm popup, When click cancel popup it will show the disposition page, and When submit popup status will changed to archive (Change status to \"Archive\")"
    };

    public static String[] TestCaseListHome = new String[]{
            "2. Show username"
            , "3. Add patient"
    };

    public static String[] TestCaseListCreatePatientPage = new String[]{
            "4. Current time when add patient"
            , "5. Can save the data when add all patient detail"
            , "6. Can selected only one consciousness"
            , "7. Value cannot breakout the limit"
            , "8. Value cannot negative"
    };

    public static String[] TestCaseListAssessPage = new String[]{
            "9. When edit data the value cannot be negative"
            , "10. Show the created time of case"
            , "11. Show MPEW/NEWS"
            , "12. Cannot edit data with alphabet"
            , "13. Change status waiting for assess to waiting for diagnosis"
    };

    public static String[] TestCaseListDiagnosePage = new String[]{
            "14. Data in diagnosis cannot negative"
            , "15. pMap, NEWS, or MPEW cannot edit"
            , "16. Diagnose page cannot type alphabet"
            , "17. Click assess icon it will bring you back to assess page"
            , "18. Can choose one choice of infection and not infection"
            , "19. Edit data, Check status when activate fast protocol, Show time when save in patient treatment that save from diagnose page, and Check status waiting for treatment"
    };

    public static String[] TestCaseListTreatmentPage = new String[]{
            "20. Data in patient treatment cannot be negative"
            , "21. Status changed to Treating"
            , "22. Can choose only one infection or not infection in treatment page"
            , "23. Can input note in treatment page"
            , "24. Click assess icon it will bring you back to assess page and click treat icon it will bring you back to treat page"
            , "25. Edit patient information in treatment page"
            , "26. Can choose only one sepsis, septic shock, or sepsis induced in treatment page"
            , "27. Mecrit Notified when save"
    };

    public static String[] TestCaseListDispositionPage = new String[]{
            "28. Change time in Admit and Refer"
            , "29. Can choose only one Discharge,Against advice,and Death"
            , "30. Can edit patient information in disposition page"
            , "31. Show all patient information"
            , "32. Press cancel button to back to all patient"
            , "33. Press save button it will show confirm popup, When click cancel popup it will show the disposition page, and When submit popup status will changed to archive"
    };

    public static String[] TestCaseListAllPatientPage = new String[]{
            "34. Show all patient status"
            , "35. When scroll down and up it can press add button to go to add page"
            , "36. Go to disposition page"
            , "37. Show all patient info in disposition icon"
            , "38. Press status filter to show the chooses status"
            , "39. If status is \"Archive\" the status cannot change to other"
    };

}
