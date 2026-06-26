package threads;

import de.gurkenlabs.input4j.InputDevices;
import engine.Global;
import menu.MenuMain;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

import static threads.EventListener_XBoxController.componentOfController.KEY_RECORD;

public class EventListener_XBoxController {

    public enum componentOfController {
        KEY_RECORD,
        BUTTON_0,
        BUTTON_1,
        BTN_C,
        BUTTON_2,
        BUTTON_3,
        BTN_Z,
        BUTTON_4,
        BUTTON_5,
        BTN_TL2,
        BTN_TR2,
        BUTTON_6,
        BUTTON_7,
        BUTTON_10,
        BUTTON_8,
        BUTTON_9,
        LEFT_AXIS_X,
        LEFT_AXIS_Y,
        LEFT_AXIS_Z,
        RIGHT_AXIS_Z,
        ABS_GAS,
        ABS_BRAKE,
        DPAD_LEFT_RIGHT,
        DPAD_UP_DOWN,
        DPAD_UP,
        DPAD_DOWN,
        DPAD_LEFT,
        DPAD_RIGHT,
        NULL
    }

    private static componentOfController componentToSample = componentOfController.NULL;

    public EventListener_XBoxController()
    {
         Thread thread = new Thread(() -> {
            try (var inputDevices = InputDevices.init()) {
                while (!inputDevices.getAll().isEmpty()) {
                    // iterate all available input devices and poll their data every second
                    for (var inputDevice : inputDevices.getAll()) {
                        if(Objects.equals(inputDevice.getName(), "Xbox Wireless Controller"))
                        {
                            MenuMain.printConsoleAndOutput(inputDevice.getName() + ": ALPHA");
                            inputDevice.poll();
                            cycleToNextComponent();
                            for(var component : inputDevice.getComponents()) {
                                if(component.getData() != 0.0) {
                                    switch(componentToSample)
                                    {
                                        case KEY_RECORD:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_0:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_1:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BTN_C:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_2:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_3:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BTN_Z:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_4:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_5:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BTN_TL2:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BTN_TR2:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_6:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_7:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_10:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_8:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case BUTTON_9:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case LEFT_AXIS_X:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case LEFT_AXIS_Y:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case LEFT_AXIS_Z:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case RIGHT_AXIS_Z:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case ABS_GAS:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case ABS_BRAKE:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case DPAD_LEFT_RIGHT:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case DPAD_UP_DOWN:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case DPAD_UP:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case DPAD_DOWN:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case DPAD_LEFT:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case DPAD_RIGHT:
                                            MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                            break;
                                        case NULL:
                                            
                                            break;
                                    }
                                }
                                cycleToNextComponent();
                            }
                            //MenuMain.printConsoleAndOutput(inputDevice.getName() + ":" + inputDevice.getComponents());
                        }
                    }
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
    }

    private static void cycleToNextComponent()
    {
        switch(componentToSample)
        {
            case KEY_RECORD:
                componentToSample = componentOfController.BUTTON_0;
                break;
            case BUTTON_0:
                componentToSample = componentOfController.BUTTON_1;
                break;
            case BUTTON_1:
                componentToSample = componentOfController.BTN_C;
                break;
            case BTN_C:
                componentToSample = componentOfController.BUTTON_2;
                break;
            case BUTTON_2:
                componentToSample = componentOfController.BUTTON_3;
                break;
            case BUTTON_3:
                componentToSample = componentOfController.BTN_Z;
                break;
            case BTN_Z:
                componentToSample = componentOfController.BUTTON_4;
                break;
            case BUTTON_4:
                componentToSample = componentOfController.BUTTON_5;
                break;
            case BUTTON_5:
                componentToSample = componentOfController.BTN_TL2;
                break;
            case BTN_TL2:
                componentToSample = componentOfController.BTN_TR2;
                break;
            case BTN_TR2:
                componentToSample = componentOfController.BUTTON_6;
                break;
            case BUTTON_6:
                componentToSample = componentOfController.BUTTON_7;
                break;
            case BUTTON_7:
                componentToSample = componentOfController.BUTTON_10;
                break;
            case BUTTON_10:
                componentToSample = componentOfController.BUTTON_8;
                break;
            case BUTTON_8:
                componentToSample = componentOfController.BUTTON_9;
                break;
            case BUTTON_9:
                componentToSample = componentOfController.LEFT_AXIS_X;
                break;
            case LEFT_AXIS_X:
                componentToSample = componentOfController.LEFT_AXIS_Y;
                break;
            case LEFT_AXIS_Y:
                componentToSample = componentOfController.LEFT_AXIS_Z;
                break;
            case LEFT_AXIS_Z:
                componentToSample = componentOfController.RIGHT_AXIS_Z;
                break;
            case RIGHT_AXIS_Z:
                componentToSample = componentOfController.ABS_GAS;
                break;
            case ABS_GAS:
                componentToSample = componentOfController.ABS_BRAKE;
                break;
            case ABS_BRAKE:
                componentToSample = componentOfController.DPAD_LEFT_RIGHT;
                break;
            case DPAD_LEFT_RIGHT:
                componentToSample = componentOfController.DPAD_UP_DOWN;
                break;
            case DPAD_UP_DOWN:
                componentToSample = componentOfController.DPAD_UP;
                break;
            case DPAD_UP:
                componentToSample = componentOfController.DPAD_DOWN;
                break;
            case DPAD_DOWN:
                componentToSample = componentOfController.DPAD_LEFT;
                break;
            case DPAD_LEFT:
                componentToSample = componentOfController.DPAD_RIGHT;
                break;
            case DPAD_RIGHT:
                componentToSample = componentOfController.NULL;
                break;
            case NULL:
                componentToSample = KEY_RECORD;
                break;
        }
    }
}
