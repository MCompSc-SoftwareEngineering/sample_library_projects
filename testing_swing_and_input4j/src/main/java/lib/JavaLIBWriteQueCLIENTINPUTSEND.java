package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQueCLIENTINPUTSEND extends Library
{
    JavaLIBWriteQueCLIENTINPUTSEND INSTANCE = (JavaLIBWriteQueCLIENTINPUTSEND) Native.load("LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION", JavaLIBWriteQueCLIENTINPUTSEND.class);
    Pointer app_FUNCT_generate_Program();
    byte[] app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(byte[] bytes);
    void app_FUNCT_write_Start(byte[] bytes);
}