package gui.callback;

import gui.model.Teacher;

import java.util.ArrayList;

public interface Action {
    void call(ArrayList<Teacher> teacherArrayList);
}
