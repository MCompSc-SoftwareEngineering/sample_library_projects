package structs;

import engine.Framework;
import structs.peripheralSamples.xboxController;

public class Game_Instance {
    
    private static xboxController[] _stat_REG_Array_Of_xboxController;
    
    public Game_Instance()
    {
        
    }
    public void dyn_REG_boot1_DEFINE_Game_Instance(Framework obj) {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Game_Instance().%n");
        stat_REG_boot1_DEFINE_xboxController();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Game_Instance().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Game_Instance(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Game_Instance().%n");
        stat_REG_boot2_SUBSTANTIATE_xboxController();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Game_Instance().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Game_Instance(Framework obj, xboxController controller) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Game_Instance().%n");
        stat_REG_boot3_INITIALISE_xboxController(controller);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Game_Instance().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Game_Instance(Framework obj) {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Game_Instance().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Game_Instance().%n");
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Framework_App().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Framework_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Framework_App().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Framework_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework_App().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework_App().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_xboxController()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_xboxController().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_xboxController().%n");
    }
    private static void stat_REG_boot1_DEFINE_xboxController()
    {
        System.out.printf("entered stat_REG_boot1_DEFINE_xboxController().%n");
        _stat_REG_Array_Of_xboxController = null;
        System.out.printf("exiting stat_REG_boot1_DEFINE_xboxController().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_xboxController()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_xboxController().%n");
        _stat_REG_Array_Of_xboxController = new xboxController[1];//todo make 4 detect and save
        while(stat_REG_get_Array_Of_xboxController() == null) { }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_xboxController().%n");
    }
    private static void stat_REG_boot3_INITIALISE_xboxController(xboxController controller)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_xboxController().%n");
        for(char controllerId = 0; controllerId < 1; controllerId++)//todo make 4 detect and save
        {
            _stat_REG_Array_Of_xboxController[controllerId] = controller;
        }
        System.out.printf("exiting stat_REG_boot3_INITIALISE_xboxController().%n");
    }
    private static xboxController[] stat_REG_get_Array_Of_xboxController()
    {
        return _stat_REG_Array_Of_xboxController;
    }
}
