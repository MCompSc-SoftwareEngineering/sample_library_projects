package engine;
//import main.io.LaunchQue_Client;
import io.WriteQue_InputPerihperalSamples;
import com.sun.jna.Pointer;
import io.WriteQueCLIENTOUTPUTRECIEVE;
import menu.MenuMain;
import threads.EventListener_XBoxController;

import javax.swing.*;


public class Execute
{
    private static Execute_Control _stat_CLASS_Execute_Control;
    private static MenuMain _stat_CLASS_MenuMain;
    private static Thread[] _stat_REG_List_Of_Threads;
    //private static Pointer _stat_PGM_LaunchQue_Client;
    private static Pointer _stat_PGM_WriteQueForThreadsAt_InputPerihperalSamples;
    private static Pointer _stat_PGM_WriteQue_Client_OutputRecieve;
    private static EventListener_XBoxController _stat_THREAD_EventListener_XBoxController;
// public.
    public Execute() {
        System.out.printf("entered CLASS Execute()%n");
        stat_CLASS_boot0_DECLAIRE_Execute();
        stat_CLASS_boot1_DEFINE_Execute();
        stat_CLASS_boot3_INITIALISE_Execute();
        stat_REG_boot0_DECLAIRE_Execute();
        System.out.printf("exiting CLASS Execute()%n");
    }
    public Execute_Control dyn_CLASS_get_Execute_Control()
    {
        return stat_CLASS_get_Execute_Control();
    }
    public void dyn_REG_boot1_DEFINE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");
        stat_REG_boot1_DEFINE_List_Of_Threads();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
        stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");
        stat_REG_boot3_INITIALISE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Execute().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Execute() {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
        int intPrimeDEFAULT = Integer.MAX_VALUE;
        boolean booleanPrimeDEFAULT = true;

        System.out.printf("entered CHECK member function WriteQue_SERVERINPUTRECIEVE().%n");
        //WriteQue_SERVERINPUTRECIEVE.app_FUNCT_generate_Program();
        Boolean tempA0 = WriteQue_InputPerihperalSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_InputPerihperalSamples.app_FUNCT_terminate_Program();
        WriteQue_InputPerihperalSamples.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_InputPerihperalSamples.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_SERVERINPUTRECIEVE().%n");
/*
        System.out.printf("entered CHECK member function LaunchQue_Server().%n");
        //LaunchQue_Server.app_FUNCT_generate_Program();
        LaunchQue_Client.app_FUNCT_request_Wait_launch(intPrimeDEFAULT);
        LaunchQue_Client.app_FUNCT_terminate_Progaram();
        LaunchQue_Client.app_FUNCT_thread_End(intPrimeDEFAULT);
        int tempB0 = LaunchQue_Client.app_REG_get_coreId_To_launch();
        boolean tempB1 = LaunchQue_Client.app_REG_get_Flag_Active();
        boolean tempB2 = LaunchQue_Client.app_REG_get_Flag_ConcurrentCoreState(intPrimeDEFAULT);
        boolean tempB3 = LaunchQue_Client.app_REG_get_Flag_Idle();
        boolean tempB4 = LaunchQue_Client.app_REG_get_State_launchBit();
        LaunchQue_Client.app_REG_set_Flag_ConcurrentCoreState(intPrimeDEFAULT, booleanPrimeDEFAULT);
        System.out.printf("done CHECK member function LaunchQue_Server().%n");
*/

        System.out.printf("entered CHECK member function WriteQue_SERVERINPUTRECIEVE().%n");
        //WriteQue_SERVERINPUTRECIEVE.app_FUNCT_generate_Program();
        Boolean tempC0 = WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_terminate_Program();
        WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_SERVERINPUTRECIEVE().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }
    public Pointer dyn_PGM_get_LaunchQue_Client()
    {
        return stat_PGM_get_LaunchQue_Client();
    }
    public Pointer dyn_PGM_get_WriteQueForThreadsAt_InputPerihperalSamples()
    {
        return stat_PGM_get_WriteQueForThreadsAt_InputPerihperalSamples();
    }
    public Pointer dyn_PGM_get_WriteQue_Client_OutputRecieve()
    {
        return stat_PGM_get_WriteQue_Client_OutputRecieve();
    }

    static private void stat_CLASS_boot0_DECLAIRE_Execute() {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_PGM_boot1_DEFINE_LaunchQue_Client();
        stat_PGM_boot1_DEFINE_WriteQueForThreadsAt_InputPerihperalSamples();
        stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve();
        stat_CLASS_boot1_DEFINE_MenuMain();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_PGM_boot3_INITIALISE_LaunchQue_Client();
        stat_PGM_boot3_INITIALISE_WriteQueForThreadsAt_InputPerihperalSamples();
        stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute() {
            System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

            System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }
// private.
    private void dyn_APP_Draw_2D_Menu() {
        stat_CLASS_boot3_INITIALISE_MenuMain();
    }
    static void stat_CLASS_boot1_DEFINE_Execute_Control() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute_Control().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_MenuMain() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute_Control().%n");
        _stat_CLASS_MenuMain = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = new Execute_Control();
        try {
            stat_CLASS_get_Execute_Control();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_MenuMain() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
        _stat_CLASS_MenuMain = new MenuMain();
        try {
            SwingUtilities.invokeLater(() -> {
                stat_CLASS_get_MenuMain().createAndShowGUI_MenuMain();
            });
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
    }
    private static Execute_Control stat_CLASS_get_Execute_Control() {
        return _stat_CLASS_Execute_Control;
    }
    private static MenuMain stat_CLASS_get_MenuMain() {
        return _stat_CLASS_MenuMain;
    }
    private static void stat_REG_boot1_DEFINE_List_Of_Threads() {
        _stat_REG_List_Of_Threads = null;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(Framework obj) {
        _stat_REG_List_Of_Threads = new Thread[obj.dyn_CLASS_get_Global().dyn_REG_get_numberOfCores()];
        try {
            stat_REG_get_ptr_List_Of_Threads();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++)
        {
            _stat_REG_List_Of_Threads[threadId] = null;
        }
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_Threads(Framework obj)
    {
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++)
        {
            int finalThreadId = threadId;
            _stat_REG_List_Of_Threads[threadId] = new Thread(() -> obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_APP_Draw_2D_Menu());
            _stat_REG_List_Of_Threads[threadId].start();

            finalThreadId++;
            _stat_REG_List_Of_Threads[threadId] = new Thread(() -> obj.dyn_THREAD_get_EventListener_XBoxController().doScanOfXBoxControllers(obj));
            _stat_REG_List_Of_Threads[threadId].start();
        }
    }
    private static Thread[] stat_REG_get_ptr_List_Of_Threads() {
        return _stat_REG_List_Of_Threads;
    }
    private static EventListener_XBoxController stat_REG_get_ptr_EventListener_XBoxController() {
        return _stat_THREAD_EventListener_XBoxController;
    }
    private static void stat_PGM_boot1_DEFINE_LaunchQue_Client() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_LaunchQue_Client().%n");
        //_stat_PGM_LaunchQue_Client = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_LaunchQue_Client().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQueForThreadsAt_InputPerihperalSamples() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQueForThreadsAt_InputPerihperalSamples().%n");
        _stat_PGM_WriteQueForThreadsAt_InputPerihperalSamples = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQueForThreadsAt_InputPerihperalSamples().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve().%n");
        _stat_PGM_WriteQue_Client_OutputRecieve = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_LaunchQue_Client() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_LaunchQue_Client().%n");
        //_stat_PGM_LaunchQue_Client = LaunchQue_Client.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_LaunchQue_Client().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQueForThreadsAt_InputPerihperalSamples() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQueForThreadsAt_InputPerihperalSamples().%n");
        _stat_PGM_WriteQueForThreadsAt_InputPerihperalSamples = WriteQue_InputPerihperalSamples.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQueForThreadsAt_InputPerihperalSamples().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve().%n");
        _stat_PGM_WriteQue_Client_OutputRecieve = WriteQueCLIENTOUTPUTRECIEVE.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve().%n");
    }
    private static Pointer stat_PGM_get_LaunchQue_Client()
    {
        return null;//_stat_PGM_LaunchQue_Client;
    }
    private static Pointer stat_PGM_get_WriteQueForThreadsAt_InputPerihperalSamples()
    {
        return _stat_PGM_WriteQueForThreadsAt_InputPerihperalSamples;
    }
    private static Pointer stat_PGM_get_WriteQue_Client_OutputRecieve() {
        return _stat_PGM_WriteQue_Client_OutputRecieve;
    }
}