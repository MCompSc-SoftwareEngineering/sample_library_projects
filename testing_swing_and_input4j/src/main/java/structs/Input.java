package structs;

import engine.Framework;
import structs.praisesubsets.Input_praise0;
import structs.praisesubsets.Input_praise1;
import structs.praisesubsets.Input_praise2;
import structs.praisesubsets.Input_praise3;

public class Input
{
    private static int _stat_REG_Input_paiseId;
    private static Object _stat_REG_InputSubset;
// public.
    public Input() 
    {
        System.out.printf("entered STRUCT_CLASS Input()%n");
        stat_CLASS_boot0_DECLAIRE_Input();
        stat_CLASS_boot1_DEFINE_Input();
        stat_CLASS_boot3_INITIALISE_Input();
        stat_REG_boot0_DECLAIRE_Input();
        System.out.printf("exiting STRUCT_CLASS Input()%n");
    }
    public void dyn_REG_boot1_DEFINE_Input()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Input().%n");
        stat_REG_boot1_DEFINE_Input_paiseId();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Input().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Input()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Input().%n");
        stat_REG_boot2_SUBSTANTIATE_Input_paiseId();
        stat_REG_boot2_SUBSTANTIATE_InputSubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Input().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Input(User_Input objUserInput)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Input().%n");
        stat_REG_boot3_INITIALISE_Input_paiseId();
        stat_REG_boot3_INITIALISE_InputSubset(objUserInput);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Input().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Input()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Input().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Input().%n");
    }
    public int dyn_REG_get_Input_praiseId()
    {
        return stat_REG_get_Input_praiseId();
    }
    public Object dyn_REG_get_InputSubset()
    {
        return stat_REG_get_InputSubset();
    }
    public void dyn_REG_set_Input_praiseId(int valuePraiseEventId)
    {
        stat_REG_set_Input_praiseId(valuePraiseEventId);
    }
    public void dyn_REG_set_InputSubset(Framework obj, int praiseId)
    {
        User_Input userInput = obj.dyn_STRUCT_get_User_Input();
        switch(praiseId)
        {
            case 0:
                stat_REG_set_InputSubset((Input_praise0)userInput.dyn_REG_get_Item_On_List_Of_InputSubsets(praiseId));
                break;

            case 1:
                stat_REG_set_InputSubset((Input_praise1)userInput.dyn_REG_get_Item_On_List_Of_InputSubsets(praiseId));
                break;

            case 2:
                stat_REG_set_InputSubset((Input_praise2)userInput.dyn_REG_get_Item_On_List_Of_InputSubsets(praiseId));
                break;

            case 3:
                stat_REG_set_InputSubset((Input_praise3)userInput.dyn_REG_get_Item_On_List_Of_InputSubsets(praiseId));
                break;

        }
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Input()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Input().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Input().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Input()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Input()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Input().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Input().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Input()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Input().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Input().%n");
    }
    private static void stat_REG_boot1_DEFINE_Input_paiseId()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input_paiseId().%n");
        _stat_REG_InputSubset = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Input_paiseId()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_paiseId().%n");
        _stat_REG_Input_paiseId = Integer.MAX_VALUE;
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_InputSubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_InputSubset().%n");
        _stat_REG_InputSubset = new Object();
        try {
            stat_REG_get_InputSubset();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_InputSubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_paiseId()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_paiseId().%n");
        _stat_REG_Input_paiseId = (int)(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_paiseId().%n");
    }
    private static void stat_REG_boot3_INITIALISE_InputSubset(User_Input objUserInput)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_InputSubset().%n");
        _stat_REG_InputSubset = objUserInput.dyn_REG_get_Item_On_List_Of_InputSubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_InputSubset().%n");
    }
    private static int stat_REG_get_Input_praiseId()
    {
        return _stat_REG_Input_paiseId;
    }
    private static Object stat_REG_get_InputSubset()
    {
        return _stat_REG_InputSubset;
    }
    public static void stat_REG_set_Input_praiseId(int valuePraiseEventId)
    {
        _stat_REG_Input_paiseId = valuePraiseEventId;
    }
    private static void stat_REG_set_InputSubset(Object objSubset)
    {
        _stat_REG_InputSubset = objSubset;
    }
}