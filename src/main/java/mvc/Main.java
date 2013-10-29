package mvc;

import mvc.controller.BeatController;
import mvc.controller.BeatControllerInterfejs;
import mvc.model.BeatModel;
import mvc.model.BeatModelInterfejs;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Daniel
 * Date: 15.08.13
 */

public class Main {
    public static void main(String[] args) {
        BeatModelInterfejs model = new BeatModel();
        BeatControllerInterfejs controller = new BeatController(model);
    }
}
