package structs.praisesubsets;

import engine.Framework;

public class Output_praise3
{
    private static double _output_praise3_value;
// public.
    public void dyn_REG_boot1_DEFINE_Output_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Output_praise3().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Output_praise3().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Output_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Output_praise3().%n");
        stat_REG_boot2_SUBSTANTIATE_Output_value();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Output_praise3().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Output_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Output_praise3().%n");
        stat_REG_boot3_INITIALISE_Output_value();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Output_praise3().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Output_praise3(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Output_praise3().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Output_praise3().%n");
    }
    public double dyn_REG_get_output_praise3_value()
    {
        return stat_REG_get_output_praise3_value();
    }
    public void dyn_REG_set_output_praise3_value(double newFloat)
    {
        stat_REG_set_output_praise3_value(newFloat);
    }

    public static void stat_CLASS_boot3_DECLAIRE_Output_praise3()
    {
        System.out.printf("entered stat_CLASS_boot3_DECLAIRE_Output_praise3().%n");

        System.out.printf("exiting stat_CLASS_boot3_DECLAIRE_Output_praise3().%n");
    }
    public static void stat_CLASS_boot1_DEFINE_Output_praise3()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Output_praise3().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Output_praise3().%n");
    }
    public static void stat_CLASS_boot3_INITIALISE_Output_praise3()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Output_praise3().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Output_praise3().%n");
    }
    public static void stat_REG_boot3_DECLAIRE_Output_praise3()
    {
        System.out.printf("entered stat_REG_boot3_DECLAIRE_Output_praise3().%n");

        System.out.printf("exiting stat_REG_boot3_DECLAIRE_Output_praise3().%n");
    }
// private.
    private static void stat_REG_boot2_SUBSTANTIATE_Output_value()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Output_valueA().%n");
        _output_praise3_value = (double)(Double.MAX_VALUE);
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Output_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Output_value()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Output_valueA().%n");
        _output_praise3_value = (double)(3.3);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Output_valueA().%n");
    }
    private static double stat_REG_get_output_praise3_value()
    {
        return _output_praise3_value;
    }
    private static void stat_REG_set_output_praise3_value(double newFloat)
    {
        _output_praise3_value = newFloat;
    }
}
