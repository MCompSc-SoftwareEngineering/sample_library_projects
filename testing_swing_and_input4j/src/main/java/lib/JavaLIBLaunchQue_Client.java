package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBLaunchQue_Client extends Library
{
    JavaLIBLaunchQue_Client INSTANCE = (JavaLIBLaunchQue_Client) Native.load("LIB_LaunchEnableForConcurrentThreadsAt_CLIENT", JavaLIBLaunchQue_Client.class);
    Pointer app_FUNCT_generate_Program();
    byte[] app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_request_Wait_launch(byte[] bytes);
    void app_FUNCT_terminate_Progaram();
    void app_FUNCT_thread_End(byte[] bytes);
    byte[] app_REG_get_coreId_To_launch();
    byte[] app_REG_get_Flag_Active();
    byte[] app_REG_get_Flag_ConcurrentCoreState(byte[] bytes);
    byte[] app_REG_get_Flag_Idle();
    byte[] app_REG_get_State_launchBit();
    void app_REG_set_Flag_ConcurrentCoreState(byte[] bytesThreadId, byte[] bytesBool);
}
