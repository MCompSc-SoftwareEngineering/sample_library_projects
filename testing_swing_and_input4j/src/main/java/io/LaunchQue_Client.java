package io;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBLaunchQue_Client;
public class LaunchQue_Client 
{
    // public.
    public LaunchQue_Client()
    {

    }
    public static Pointer app_FUNCT_generate_Program()
    {
        Pointer temp;
        temp = (Pointer)null;
        try {
            temp = JavaLIBLaunchQue_Client.INSTANCE.app_FUNCT_generate_Program();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return temp;
    }
    public static boolean app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            temp = JavaLIBLaunchQue_Client.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static void app_FUNCT_request_Wait_launch(int threadId)
    {
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_FUNCT_request_Wait_launch(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_terminate_Progaram()
    {
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_FUNCT_terminate_Progaram();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_thread_End(int threadId)
    {
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_FUNCT_thread_End(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static int app_REG_get_coreId_To_launch()
    {
        byte[] temp;
        temp = new byte[4];
        try {
            temp = JavaLIBLaunchQue_Client.INSTANCE.app_REG_get_coreId_To_launch();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbInt(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static boolean app_REG_get_Flag_Active()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_REG_get_Flag_Active();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static boolean app_REG_get_Flag_ConcurrentCoreState(int threadId)
    {
        byte[] temp;
        temp = new byte[1];
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_REG_get_Flag_ConcurrentCoreState(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static boolean app_REG_get_Flag_Idle()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_REG_get_Flag_Idle();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            return true;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static boolean app_REG_get_State_launchBit()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            temp = JavaLIBLaunchQue_Client.INSTANCE.app_REG_get_State_launchBit();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            return true;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static void app_REG_set_Flag_ConcurrentCoreState(int concurrentThreadId, boolean state)
    {
        try {
            JavaLIBLaunchQue_Client.INSTANCE.app_REG_set_Flag_ConcurrentCoreState(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(concurrentThreadId)), Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbBoolean_To_LsbByteArray(state)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
}
