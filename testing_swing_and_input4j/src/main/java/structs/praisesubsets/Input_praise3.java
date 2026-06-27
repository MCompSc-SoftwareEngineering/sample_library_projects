package structs.praisesubsets;

import engine.Framework;

public class Input_praise3
{
    private static float _input_praise3_valueA;
    private static float _input_praise3_valueB;
// public.
    public void dyn_REG_boot1_DEFINE_Input_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Input_praise3().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Input_praise3().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Input_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Input_praise3().%n");
        stat_REG_boot2_SUBSTANTIATE_Input_valueA();
        stat_REG_boot2_SUBSTANTIATE_Input_valueB();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Input_praise3().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Input_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Input_praise3().%n");
        stat_REG_boot3_INITIALISE_Input_valueA();
        stat_REG_boot3_INITIALISE_Input_valueB();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Input_praise3().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Input_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Input_praise3().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Input_praise3().%n");
    }
    public float dyn_REG_get_input_praise3_valueA()
    {
        return stat_REG_get_input_praise3_valueA();
    }
    public float dyn_REG_get_input_praise3_valueB()
    {
        return stat_REG_get_input_praise3_valueB();
    }
    public void dyn_REG_set_input_praise3_valueA(float newFloat)
    {
        stat_REG_set_input_praise3_valueA(newFloat);
    }
    public void dyn_REG_set_input_praise3_valueB(float newFloat)
    {
        stat_REG_set_input_praise3_valueB(newFloat);
    }
    public static void stat_CLASS_boot3_DECLAIRE_Input_praise3()
    {
        System.out.printf("entered stat_CLASS_boot3_DECLAIRE_Input_praise3().%n");

        System.out.printf("exiting stat_CLASS_boot3_DECLAIRE_Input_praise3().%n");
    }
    public static void stat_CLASS_boot1_DEFINE_Input_praise3()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input_praise3().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input_praise3().%n");
    }
    public static void stat_CLASS_boot3_INITIALISE_Input_praise3()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Input_praise3().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Input_praise3().%n");
    }
    public static void stat_REG_boot3_DECLAIRE_Input_praise3()
    {
        System.out.printf("entered stat_REG_boot3_DECLAIRE_Input_praise3().%n");

        System.out.printf("exiting stat_REG_boot3_DECLAIRE_Input_praise3().%n");
    }
// private.
    private static void stat_REG_boot2_SUBSTANTIATE_Input_valueA()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praise3_valueA = (float)(Float.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Input_valueB()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praise3_valueB = (float)(Float.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_valueA()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praise3_valueA = (float)(1.2);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_valueB()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praise3_valueB = (float)(2.6);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static float stat_REG_get_input_praise3_valueA()
    {
        return _input_praise3_valueA;
    }
    private static float stat_REG_get_input_praise3_valueB()
    {
        return _input_praise3_valueB;
    }
    private static void stat_REG_set_input_praise3_valueA(float newFloat)
    {
        _input_praise3_valueA = newFloat;
    }
    private static void stat_REG_set_input_praise3_valueB(float newFloat)
    {
        _input_praise3_valueB = newFloat;
    }
}
