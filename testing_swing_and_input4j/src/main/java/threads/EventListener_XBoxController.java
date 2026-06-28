package threads;
import de.gurkenlabs.input4j.InputDevices;
import engine.Framework;
import io.WriteQue_InputPerihperalSamples;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import menu.MenuMain;
import structs.peripheralSamples.xboxController;
public class EventListener_XBoxController {
    public enum componentOfController {
    // list as polled from controller (not alphabetical).
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
    public void doScanOfXBoxControllers(Framework obj)
    {
         Thread thread = new Thread(() -> {
            try (var inputDevices = InputDevices.init()) {
                while (!inputDevices.getAll().isEmpty()) {
                    // iterate all available input devices and poll their data every second
                    for (var inputDevice : inputDevices.getAll()) {
                        if(Objects.equals(inputDevice.getName(), "Xbox Wireless Controller"))
                        {
                            MenuMain.printConsoleAndOutput(inputDevice.getName() + ": ALPHA");
                            xboxController sampleTEMP = obj.dyn_REG_get_Item_InputPeripheralSampled_Data();
                            inputDevice.poll();
                            cycleToNextComponent();
                            for(var component : inputDevice.getComponents()) {
                                if(component.getData() != 0.0) {
                                    switch(componentToSample)
                                    {
                                        case KEY_RECORD:
                                            sampleTEMP.dyn_REG_set_KEY_RECORD(component.getData());
                                            break;
                                        case BUTTON_0:
                                            sampleTEMP.dyn_REG_set_BUTTON_0(component.getData());
                                            break;
                                        case BUTTON_1:
                                            sampleTEMP.dyn_REG_set_BUTTON_1(component.getData());
                                            break;
                                        case BTN_C:
                                            sampleTEMP.dyn_REG_set_BTN_C(component.getData());
                                            break;
                                        case BUTTON_2:
                                            sampleTEMP.dyn_REG_set_BUTTON_2(component.getData());
                                            break;
                                        case BUTTON_3:
                                            sampleTEMP.dyn_REG_set_BUTTON_3(component.getData());
                                            break;
                                        case BTN_Z:
                                            sampleTEMP.dyn_REG_set_BTN_Z(component.getData());
                                            break;
                                        case BUTTON_4:
                                            sampleTEMP.dyn_REG_set_BUTTON_4(component.getData());
                                            break;
                                        case BUTTON_5:
                                            sampleTEMP.dyn_REG_set_BUTTON_5(component.getData());
                                            break;
                                        case BTN_TL2:
                                            sampleTEMP.dyn_REG_set_BTN_TL2(component.getData());
                                            break;
                                        case BTN_TR2:
                                            sampleTEMP.dyn_REG_set_BTN_TR2(component.getData());
                                            break;
                                        case BUTTON_6:
                                            sampleTEMP.dyn_REG_set_BUTTON_6(component.getData());
                                            break;
                                        case BUTTON_7:
                                            sampleTEMP.dyn_REG_set_BUTTON_7(component.getData());
                                            break;
                                        case BUTTON_10:
                                            sampleTEMP.dyn_REG_set_BUTTON_10(component.getData());
                                            break;
                                        case BUTTON_8:
                                            sampleTEMP.dyn_REG_set_BUTTON_8(component.getData());
                                            break;
                                        case BUTTON_9:
                                            sampleTEMP.dyn_REG_set_BUTTON_9(component.getData());
                                            break;
                                        case LEFT_AXIS_X:
                                            sampleTEMP.dyn_REG_set_LEFT_AXIS_X(component.getData());
                                            break;
                                        case LEFT_AXIS_Y:
                                            sampleTEMP.dyn_REG_set_LEFT_AXIS_Y(component.getData());
                                            break;
                                        case LEFT_AXIS_Z:
                                            sampleTEMP.dyn_REG_set_LEFT_AXIS_Z(component.getData());
                                            break;
                                        case RIGHT_AXIS_Z:
                                            sampleTEMP.dyn_REG_set_RIGHT_AXIS_Z(component.getData());
                                            break;
                                        case ABS_GAS:
                                            sampleTEMP.dyn_REG_set_ABS_GAS(component.getData());
                                            break;
                                        case ABS_BRAKE:
                                            sampleTEMP.dyn_REG_set_ABS_BRAKE(component.getData());
                                            break;
                                        case DPAD_LEFT_RIGHT:
                                            sampleTEMP.dyn_REG_set_DPAD_LEFT_RIGHT(component.getData());
                                            break;
                                        case DPAD_UP_DOWN:
                                            sampleTEMP.dyn_REG_set_DPAD_UP_DOWN(component.getData());
                                            break;
                                        case DPAD_UP:
                                            sampleTEMP.dyn_REG_set_DPAD_UP(component.getData());
                                            break;
                                        case DPAD_DOWN:
                                            sampleTEMP.dyn_REG_set_DPAD_DOWN(component.getData());
                                            break;
                                        case DPAD_LEFT:
                                            sampleTEMP.dyn_REG_set_DPAD_LEFT(component.getData());
                                            break;
                                        case DPAD_RIGHT:
                                            sampleTEMP.dyn_REG_set_DPAD_RIGHT(component.getData());
                                            break;
                                        case NULL:
                                            break;
                                    }
                                    MenuMain.printConsoleAndOutput(component + " => " + component.getData());
                                }
                                WriteQue_InputPerihperalSamples.app_FUNCT_write_Start(0);
                                obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_INSTANCE_Game().dyn_APP_saveSampleOfController((char) 0, sampleTEMP);
                                cycleToNextComponent();
                            }
                            //MenuMain.printConsoleAndOutput(inputDevice.getName() + ":" + inputDevice.getComponents());
                        }
                    }
                    WriteQue_InputPerihperalSamples.app_FUNCT_write_End(0);
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
                componentToSample = componentOfController.KEY_RECORD;
                break;
        }
    }
}
