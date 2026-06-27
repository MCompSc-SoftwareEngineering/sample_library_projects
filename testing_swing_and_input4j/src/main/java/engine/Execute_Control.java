package engine;

public class Execute_Control
{
    private static boolean _stat_REG_ptr_Flag_isSystemInitialised;
    private static boolean _stat_REG_ptr_Flag_array_ThreadInitialised;
// public.
    public Execute_Control()
    {
        stat_CLASS_boot0_DECLAIRE_Execute_Control();
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_REG_boot0_DECLAIRE_Execute_Control();
    }
    public void dyn_REG_boot1_DEFINE_Execute_Control()
    {

    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute_Control()
    {
        stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised();
        stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised();
    }
    public void dyn_REG_boot3_INITIALISE_Execute_Control()
    {
        stat_REG_boot3_INITIALISE_Flag_isSystemInitialised();
        stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised();
    }
    public boolean dyn_REG_get_Flag_is_SystemInitialised()
    {
        return stat_REG_get_ptr_Flag_is_SystemInitialised();
    }
    public boolean dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised()
    {
        return stat_get_ptr_list_Of_flag_ThreadInitialised();
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Execute_Control()
    {

    }
    private static void stat_CLASS_boot1_DEFINE_Execute_Control()
    {

    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control()
    {

    }
    private static void stat_REG_boot0_DECLAIRE_Execute_Control()
    {

    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised()
    {
        _stat_REG_ptr_Flag_isSystemInitialised = true;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised()
    {
        _stat_REG_ptr_Flag_array_ThreadInitialised = true;
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isSystemInitialised()
    {
        _stat_REG_ptr_Flag_isSystemInitialised = true;
    }
    private static void stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised()
    {
        _stat_REG_ptr_Flag_array_ThreadInitialised = true;
    }
    private static boolean stat_REG_get_ptr_Flag_is_SystemInitialised()
    {
        return _stat_REG_ptr_Flag_isSystemInitialised;
    }
    private static boolean stat_get_ptr_list_Of_flag_ThreadInitialised()
    {
        return _stat_REG_ptr_Flag_array_ThreadInitialised;
    }
    private static void stat_REG_set_Flag_is_SystemInitialised(boolean newFlag)
    {

    }
}
