package io;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBWriteQueCLIENTOUTPUTRECIEVE;

public class WriteQueCLIENTINPUTSEND
{
    public WriteQueCLIENTINPUTSEND()
    {

    }
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBWriteQueCLIENTOUTPUTRECIEVE.INSTANCE.app_FUNCT_generate_Program();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return (Pointer)null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            return (Pointer)null;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static Boolean app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        byte[] temp;
        temp = new byte[1];
        temp[0] = Byte.MAX_VALUE;
        try {
            temp = JavaLIBWriteQueCLIENTOUTPUTRECIEVE.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED();
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
    public static void app_FUNCT_terminate_Program()
    {
        try {
            JavaLIBWriteQueCLIENTOUTPUTRECIEVE.INSTANCE.app_FUNCT_terminate_Program();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_write_End(int threadId)
    {
        try {
            JavaLIBWriteQueCLIENTOUTPUTRECIEVE.INSTANCE.app_FUNCT_write_End(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_write_Start(int threadId)
    {
        try {
            JavaLIBWriteQueCLIENTOUTPUTRECIEVE.INSTANCE.app_FUNCT_write_Start(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
}
