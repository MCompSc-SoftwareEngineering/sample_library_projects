package structs;
import structs.praisesubsets.Output_praise0;
import structs.praisesubsets.Output_praise1;
import structs.praisesubsets.Output_praise2;
import structs.praisesubsets.Output_praise3;
public class User_Output
{
    private static Output_praise0 _stat_CLASS_Subest_praise0;
    private static Output_praise1 _stat_CLASS_Subest_praise1;
    private static Output_praise2 _stat_CLASS_Subest_praise2;
    private static Output_praise3 _stat_CLASS_Subest_praise3;
    private static Object[] _stat_REG_List_Of_OutputSubsets;
// public.
    public User_Output() 
    {
        System.out.printf("entered STRUCT_CLASS User_Output()%n");
        stat_CLASS_boot0_DECLAIRE_User_Output();
        stat_CLASS_boot1_DEFINE_User_Output();
        stat_CLASS_boot3_INITIALISE_User_Output();
        stat_REG_boot0_DECLAIRE_User_Output();
        System.out.printf("exiting STRUCT_CLASS User_Output()%n");
    }
    public void dyn_REG_boot1_DEFINE_User_Output()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_User_Output().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_User_Output().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_User_Output()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_User_Output().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_User_Output().%n");
    }
    public void dyn_REG_boot3_INITIALISE_User_Output()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_User_Output().%n");
        stat_REG_boot3_INITIALISE_List_Of_OutputSubsets();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_User_Output().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_User_Output()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_User_Output().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_User_Output().%n");
    }
    public Object dyn_REG_get_Item_On_List_Of_OutputSubsets(int praiseId)
    {
        return stat_REG_get_List_Of_OutputSubsets()[praiseId];
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_User_Output()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_User_Output().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_User_Output().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_User_Output()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_User_Output().%n");
        stat_CLASS_boot1_DEFINE_Subest_praise0();
        stat_CLASS_boot1_DEFINE_Subest_praise1();
        stat_CLASS_boot1_DEFINE_Subest_praise2();
        stat_CLASS_boot1_DEFINE_Subest_praise3();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_User_Output().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise0()
    {
        _stat_CLASS_Subest_praise0 = null;
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise1()
    {
        _stat_CLASS_Subest_praise1 = null;
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise2()
    {
        _stat_CLASS_Subest_praise2 = null;
    }
    private static void stat_CLASS_boot1_DEFINE_Subest_praise3()
    {
        _stat_CLASS_Subest_praise3 = null;
    }
    private static void stat_CLASS_boot3_INITIALISE_User_Output()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_User_Output().%n");
        stat_CLASS_boot3_INITIALISE_Subest_praise0();
        stat_CLASS_boot3_INITIALISE_Subest_praise1();
        stat_CLASS_boot3_INITIALISE_Subest_praise2();
        stat_CLASS_boot3_INITIALISE_Subest_praise3();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_User_Output().%n");
    }
        private static void stat_CLASS_boot3_INITIALISE_Subest_praise0()
    {
        _stat_CLASS_Subest_praise0 = new Output_praise0();
        while(stat_CLASS_get_Subest_praise0() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise1()
    {
        _stat_CLASS_Subest_praise1 = new Output_praise1();
        while(stat_CLASS_get_Subest_praise1() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise2()
    {
        _stat_CLASS_Subest_praise2 = new Output_praise2();
        while(stat_CLASS_get_Subest_praise2() == null) { }
    }
    private static void stat_CLASS_boot3_INITIALISE_Subest_praise3()
    {
        _stat_CLASS_Subest_praise3 = new Output_praise3();
        while(stat_CLASS_get_Subest_praise3() == null) { }
    }
        private static Output_praise0 stat_CLASS_get_Subest_praise0()
    {
        return _stat_CLASS_Subest_praise0;
    }
    private static Output_praise1 stat_CLASS_get_Subest_praise1()
    {
        return _stat_CLASS_Subest_praise1;
    }
    private static Output_praise2 stat_CLASS_get_Subest_praise2()
    {
        return _stat_CLASS_Subest_praise2;
    }
    private static Output_praise3 stat_CLASS_get_Subest_praise3()
    {
        return _stat_CLASS_Subest_praise3;
    }
    private static void stat_REG_boot0_DECLAIRE_User_Output()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_User_Output().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_User_Output().%n");
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_OutputSubsets()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_User_Output_paiseId().%n");
        _stat_REG_List_Of_OutputSubsets = new Object[4];//NUMBER OF PRAISES.
        while(stat_REG_get_List_Of_OutputSubsets() == null) { }
        _stat_REG_List_Of_OutputSubsets[0] = stat_CLASS_get_Subest_praise0();
        _stat_REG_List_Of_OutputSubsets[1] = stat_CLASS_get_Subest_praise1();
        _stat_REG_List_Of_OutputSubsets[2] = stat_CLASS_get_Subest_praise2();
        _stat_REG_List_Of_OutputSubsets[3] = stat_CLASS_get_Subest_praise3();
        
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_User_Output_paiseId().%n");
    }
    private static Object[] stat_REG_get_List_Of_OutputSubsets()
    {
        return _stat_REG_List_Of_OutputSubsets;
    }
}