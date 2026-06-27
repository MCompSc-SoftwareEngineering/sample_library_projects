package structs;
import structs.praisesubsets.Algorithim_praise0;
import structs.praisesubsets.Algorithim_praise1;
import structs.praisesubsets.Algorithim_praise2;
import structs.praisesubsets.Algorithim_praise3;
public class Algorithim
{
    private static Algorithim_Control _stat_CLASS_Algorithim_Control;
    private static Object _stat_REG_AlgorithimSubset;
// public.
    public Algorithim() 
    {
        System.out.printf("entered STRUCT_CLASS Algorithim()%n");
        stat_CLASS_boot0_DECLAIRE_Algorithim();
        stat_CLASS_boot1_DEFINE_Algorithim();
        stat_CLASS_boot3_INITIALISE_Algorithim();
        stat_REG_boot0_DECLAIRE_Algorithim();
        System.out.printf("exiting STRUCT_CLASS Algorithim()%n");
    }
    public Algorithim_Control dyn_CLASS_get_Algorithim_Control()
    {
        return stat_CLASS_get_Algorithim_Control();
    }
    public void dyn_REG_boot1_DEFINE_Algorithim()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Algorithim().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Algorithim().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Algorithim()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Algorithim().%n");
        stat_REG_boot2_SUBSTANTIATE_AlgorithimSubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Algorithim().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Algorithim(User_Algorithim objUserAlgorithim)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Algorithim().%n");
        stat_REG_boot3_INITIALISE_AlgorithimSubset(objUserAlgorithim);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Algorithim().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Algorithim()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Algorithim().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Algorithim().%n");
    }
    public Object dyn_REG_get_AlgorithimSubset()
    {
        return stat_REG_get_AlgorithimSubset();
    }
    public void dyn_REG_set_AlgorithimSubset(Algorithim_praise0 objAlgorithimPraise0)
    {
        stat_REG_set_AlgorithimSubset((Object)objAlgorithimPraise0);
    }
    public void dyn_REG_set_AlgorithimSubset(Algorithim_praise1 objAlgorithimPraise1)
    {
        stat_REG_set_AlgorithimSubset((Object)objAlgorithimPraise1);
    }
    public void dyn_REG_set_AlgorithimSubset(Algorithim_praise2 objAlgorithimPraise2)
    {
        stat_REG_set_AlgorithimSubset((Object)objAlgorithimPraise2);
    }
    public void dyn_REG_set_AlgorithimSubset(Algorithim_praise3 objAlgorithimPraise3)
    {
        stat_REG_set_AlgorithimSubset((Object)objAlgorithimPraise3);
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Algorithim()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Algorithim().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Algorithim().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithim()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithim().%n");
        stat_CLASS_boot1_DEFINE_Algorithim_Control();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithim().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Algorithim_Control()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Algorithim_Control().%n");
        _stat_CLASS_Algorithim_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Algorithim_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithim()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithim().%n");
        stat_CLASS_boot3_INITIALISE_Algorithim_Control();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithim().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Algorithim_Control()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Algorithim_Control().%n");
        _stat_CLASS_Algorithim_Control = new Algorithim_Control();
        while(stat_CLASS_get_Algorithim_Control() == null) { }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Algorithim_Control().%n");
    }
    private static Algorithim_Control stat_CLASS_get_Algorithim_Control()
    {
        return _stat_CLASS_Algorithim_Control;
    }
    private static void stat_REG_boot0_DECLAIRE_Algorithim()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Algorithim().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Algorithim().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_AlgorithimSubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_AlgorithimSubset().%n");
        _stat_REG_AlgorithimSubset = new Object();
        while(stat_REG_get_AlgorithimSubset() == null) { }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_AlgorithimSubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_AlgorithimSubset(User_Algorithim objUserAlgorithim)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_AlgorithimSubset().%n");
        _stat_REG_AlgorithimSubset = objUserAlgorithim.dyn_REG_get_Item_On_List_Of_AlgorithimSubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_AlgorithimSubset().%n");
    }
    private static Object stat_REG_get_AlgorithimSubset()
    {
        return _stat_REG_AlgorithimSubset;
    }
    private static void stat_REG_set_AlgorithimSubset(Object objSubset)
    {
        _stat_REG_AlgorithimSubset = objSubset;
    }
}