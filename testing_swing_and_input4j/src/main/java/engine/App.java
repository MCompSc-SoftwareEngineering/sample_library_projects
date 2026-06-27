package engine;

public class App 
{
    private static Algorithims _stat_CLASS_Algorithims;
    private static Data _stat_CLASS_Data;
    private static Execute _stat_CLASS_Execute;
// public.
    public App() 
    {
        System.out.printf("entered CONSTRUCTOR App().%n");
        stat_CLASS_boot0_DECLAIRE_App();
        stat_CLASS_boot1_DEFINE_App();
        stat_CLASS_boot3_INITIALISE_App();
        stat_REG_boot0_DECLAIRE_App();
        System.out.printf("exiting CONSTRUCTOR App().%n");
    }
    public Algorithims dyn_CLASS_get_Algorithims()
    {
        return stat_CLASS_get_Algorithims();
    }
    public Data dyn_CLASS_get_Data()
    {
        return stat_CLASS_get_Data();
    }
    public Execute dyn_CLASS_get_Execute()
    {
        return stat_CLASS_get_Execute();
    }
    public void dyn_REG_boot1_DEFINE_App(Framework obj)
    {
        System.out.printf("entered dyn_boot1_REG_DEFINE_App().%n");

        System.out.printf("exiting dyn_boot1_REG_DEFINE_App().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_App(Framework obj)
    {
        System.out.printf("entered dyn_boot2_REG_SUBSTANTIATE_App().%n");

        System.out.printf("exiting dyn_boot2_REG_SUBSTANTIATE_App().%n");
    }
    public void dyn_REG_boot3_INITIALISE_App(Framework obj)
    {
        System.out.printf("entered dyn_boot3_REG_INITIALISE_App().%n");

        System.out.printf("exiting dyn_boot3_REG_INITIALISE_App().%n");
    }
    public void dyn_PGM_boot4_INSTANTIATE_App(Framework obj)
    {
        System.out.printf("entered dyn_boot4_PGM_INSTANTIATE_App().%n");

        System.out.printf("exiting dyn_boot4_PGM_INSTANTIATE_App().%n");
    }
    private static void stat_CLASS_boot0_DECLAIRE_App()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_App().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_App().%n");
        boot1_CLASS_DEFINE_Algorithims();
        boot1_CLASS_DEFINE_Data();
        boot1_CLASS_DEFINE_Execute();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_App()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_App().%n");
        boot3_CLASS_INITIALISE_Algorithms();
        boot3_CLASS_INITIALISE_Data();
        boot3_CLASS_INITIALISE_Execute();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_App().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_App()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_App().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_App().%n");
    }
// private.
    private static void boot1_CLASS_DEFINE_Algorithims()
    {
        System.out.printf("entered boot1_CLASS_DEFINE_Algorithms().%n");
        _stat_CLASS_Algorithims = null;
        System.out.printf("exiting boot1_CLASS_DEFINE_Algorithms().%n");
    }
    private static void boot1_CLASS_DEFINE_Data()
    {
        System.out.printf("entered boot1_CLASS_DEFINE_Data().%n");
        _stat_CLASS_Data = null;
        System.out.printf("exiting boot1_CLASS_DEFINE_Data().%n");
    }
    private static void boot1_CLASS_DEFINE_Execute()
    {
        System.out.printf("entered boot1_CLASS_DEFINE_Execute().%n");
        _stat_CLASS_Execute = null;
        System.out.printf("exiting boot1_CLASS_DEFINE_Execute().%n");
    }

    private static void boot3_CLASS_INITIALISE_Algorithms()
    {
        System.out.printf("entered boot3_CLASS_INITIALISE_Algorithms().%n");
        _stat_CLASS_Algorithims = new Algorithims();
        try {
                stat_CLASS_get_Algorithims();
        } 
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Algorithms().%n");
    }
    private static void boot3_CLASS_INITIALISE_Data()
    {
        System.out.printf("entered boot3_CLASS_INITIALISE_Data().%n");
        _stat_CLASS_Data = new Data();
        try {
                stat_CLASS_get_Data();
        } 
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Data().%n");
    }
    private static void boot3_CLASS_INITIALISE_Execute()
    {
        System.out.printf("entered boot3_CLASS_INITIALISE_Execute().%n");
        _stat_CLASS_Execute = new Execute();
        try {
                stat_CLASS_get_Execute();
        } 
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Execute().%n");
    }

    private static Algorithims stat_CLASS_get_Algorithims()
    {
        return _stat_CLASS_Algorithims;
    }
    private static Data stat_CLASS_get_Data()
    {
        return _stat_CLASS_Data;
    }
    private static Execute stat_CLASS_get_Execute()
    {
        return _stat_CLASS_Execute;
    }

}