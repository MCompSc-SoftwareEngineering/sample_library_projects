package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
public interface JavaLIBWriteQue_InputPerihperalSamples extends Library {
    JavaLIBWriteQue_InputPerihperalSamples INSTANCE = (JavaLIBWriteQue_InputPerihperalSamples) Native.load("libCLIB_WriteQueForThreadsAt_InputPerihperalSamples", JavaLIBWriteQue_InputPerihperalSamples.class);
    Pointer app_FUNCT_generate_Program();
    byte[] app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(byte[] bytes);
    void app_FUNCT_write_Start(byte[] bytes);
}
