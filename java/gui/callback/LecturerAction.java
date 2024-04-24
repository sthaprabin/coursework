package gui.callback;

import gui.model.DataPage;
import gui.model.Teacher;

import java.util.ArrayList;

public class LecturerAction implements Action {

    @Override
    public void call(ArrayList<Teacher> teacherArrayList) {
        // Open the new page
        DataPage newPage = new DataPage(teacherArrayList);
        newPage.show();
    }
}
