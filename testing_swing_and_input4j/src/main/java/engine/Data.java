package engine;

import structs.Game_Instance;
import structs.Input;
import structs.Output;

import java.util.ArrayList;
import java.util.List;

public class Data
{
	static private Data_Control _stat_CLASS_data_Control;
	static private Game_Instance _stat_INSTANCE_Game;
	static private Output[] _stat_REG_Buffer_Reference_For_Core_Of_Output;
	static private Input[] _stat_REG_doublebuffer_Client_InputSend;
	static private Output[] _stat_REG_doublebuffer_Client_OutputRecieve;
	static private List<Input> _stat_REG_Stack_At_Client_InputSend_List_Of_Input;
	static private List<Output> _stat_REG_Stack_At_Client_OutputRecieve_List_Of_Output;
	// public.
	public Data()
	{
		System.out.printf("entered CLASS Data()%n");
		stat_CLASS_boot0_DECLAIRE_Data();
		stat_CLASS_boot1_DEFINE_Data();
		stat_CLASS_boot3_INITIALISE_Data();
		stat_REG_boot0_DECLAIRE_Data();
		System.out.printf("exiting CLASS Data()%n");
	}
	public Data_Control dyn_CLASS_get_data_Control()
	{
		return stat_CLASS_get_data_Control();
	}
	public Game_Instance dyn_CLASS_get_INSTANCE_Game()
	{
		return stat_CLASS_get_Game_Instance();
	}
	public void dyn_REG_boot1_DEFINE_Data()
	{
		System.out.printf("entered dyn_REG_boot1_DEFINE_Data().%n");

		System.out.printf("exiting dyn_REG_boot1_DEFINE_Data().%n");
	}
	public void dyn_REG_boot2_SUBSTANTIATE_Data(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Data().%n");
		stat_REG_boot2_SUBSTANTIATE_Buffer_Reference_For_Core_Of_Output(obj.dyn_CLASS_get_Global());
		stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend();
		stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve();
		stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_InputSend_List_Of_Input();
		stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_OutputRecieve_List_Of_Output();
		System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Data().%n");
	}
	public void dyn_REG_boot3_INITIALISE_Data(Framework obj)
	{
		System.out.printf("entered dyn_REG_boot3_INITIALISE_Data().%n");
		stat_REG_boot3_INITIALISE_Buffer_Reference_For_Core_Of_Output(obj.dyn_STRUCT_get_Output());
		stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend(obj.dyn_STRUCT_get_Input());
		stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve(obj.dyn_STRUCT_get_Output());
		stat_REG_boot3_INITIALISE_Stack_At_Client_InputSend_List_Of_Input(obj.dyn_STRUCT_get_Input());
		stat_REG_boot3_INITIALISE_Stack_At_Client_OutputRecieve_List_Of_Output(obj.dyn_STRUCT_get_Output());
		System.out.printf("exiting dyn_REG_boot3_INITIALISE_Data().%n");
	}
	public Output dyn_REG_get_Item_On_Array_Of_Buffer_Reference_For_Core_Of_Output(byte concurrentThreadId)
	{
		return stat_REG_get_Item_On_Array_Of_Buffer_Reference_For_Core_Of_Output()[concurrentThreadId];
	}
	public Input dyn_REG_get_doublebuffer_Client_InputSend_READ(Framework obj)
	{
		return stat_REG_get_doublebuffer_Client_InputSend()[stat_CONVERT_boolean_To_byte(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_StateWRITE_doublebuffer_Client_InputSend())];
	}
	public Input dyn_REG_get_doublebuffer_Client_InputSend_WRITE(Framework obj)
	{
		return stat_REG_get_doublebuffer_Client_InputSend()[stat_CONVERT_boolean_To_byte(obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_StateWRITE_doublebuffer_Client_InputSend())];
	}
	public Output dyn_REG_get_doublebuffer_Client_OutputRecieve_READ(Framework obj)
	{
		return stat_REG_get_doublebuffer_Client_OutputRecieve()[stat_CONVERT_boolean_To_byte(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve())];
	}
	public Output dyn_REG_get_doublebuffer_Client_OutputRecieve_WRITE(Framework obj)
	{
		return stat_REG_get_doublebuffer_Client_OutputRecieve()[stat_CONVERT_boolean_To_byte(obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve())];
	}
	public List<Input> dyn_REG_get_Stack_At_Client_InputSend_List_Of_Input()
	{
		return stat_REG_get_Stack_At_Client_InputSend_List_Of_Input();
	}
	public List<Output> dyn_REG_get_Stack_At_Client_OutputRecieve_List_Of_Output()
	{
		return stat_REG_get_Stack_At_Client_OutputRecieve_List_Of_Output();
	}
	public void stat_CLASS_boot0_DECLAIRE_Data()
	{
		System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Data().%n");

		System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Data().%n");
	}
	private static void stat_CLASS_boot1_DEFINE_Data()
	{
		System.out.printf("entered stat_CLASS_boot1_DEFINE_Data().%n");
		stat_CLASS_boot1_DEFINE_data_Control();
		stat_CLASS_boot1_DEFINE_INSTANCE_Game();
		System.out.printf("exiting stat_CLASS_boot1_DEFINE_Data().%n");
	}
	private static void stat_CLASS_boot3_INITIALISE_Data()
	{
		System.out.printf("entered stat_CLASS_boot3_INITIALISE_Data().%n");
		stat_CLASS_boot3_INITIALISE_data_Control();
		stat_CLASS_boot3_INITIALISE_Game_Instance();
		System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Data().%n");
	}
	private static void stat_REG_boot0_DECLAIRE_Data()
	{
		System.out.printf("entered stat_REG_boot0_DECLAIRE_Data().%n");

		System.out.printf("exiting stat_REG_boot0_DECLAIRE_Data().%n");
	}
	// private.
	static private void stat_CLASS_boot1_DEFINE_data_Control()
	{
		_stat_CLASS_data_Control = null;
	}
	static private void stat_CLASS_boot1_DEFINE_INSTANCE_Game()
	{
		_stat_INSTANCE_Game = null;
	}
	static private void stat_CLASS_boot3_INITIALISE_data_Control()
	{
		_stat_CLASS_data_Control = new Data_Control();
		try {
			stat_CLASS_get_data_Control();
		}
		catch(NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	static private void stat_CLASS_boot3_INITIALISE_Game_Instance()
	{
		_stat_INSTANCE_Game = new Game_Instance();
		try {
			stat_CLASS_get_Game_Instance();
		}
		catch(NullPointerException e) {
			System.out.printf("NullPointerException.%n");
		}
	}
	static private Data_Control stat_CLASS_get_data_Control()
	{
		return _stat_CLASS_data_Control;
	}
	static private Game_Instance stat_CLASS_get_Game_Instance()
	{
	     return _stat_INSTANCE_Game;
	}
	static private byte stat_CONVERT_boolean_To_byte(boolean value)
	{
		byte temp = -1;
		if (value)
		{
			temp = (byte)1;
		}
		else if (!value)
		{
			temp = (byte)0;
		}
		return temp;
	}
	static private void stat_REG_boot2_SUBSTANTIATE_Buffer_Reference_For_Core_Of_Output(Global objGlobal)
	{
		System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Buffer_Reference_For_Core_Of_Output().  *** " + (objGlobal.dyn_REG_get_numberOfCores() - 1));//TESTBENCH
		_stat_REG_Buffer_Reference_For_Core_Of_Output = new Output[(objGlobal.dyn_REG_get_numberOfCores() - 1)];
		while (stat_REG_get_Item_On_Array_Of_Buffer_Reference_For_Core_Of_Output() == null) { }
		System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Buffer_Reference_For_Core_Of_Output().%n");//TESTBENCH
	}
	static private void stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend()
	{
		System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend().%n");//TESTBENCH
		_stat_REG_doublebuffer_Client_InputSend = new Input[(byte)(2)];
		while (stat_REG_get_doublebuffer_Client_InputSend() == null) { }
		System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend().%n");//TESTBENCH
	}
	static private void stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve()
	{
		System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve().%n");//TESTBENCH
		_stat_REG_doublebuffer_Client_OutputRecieve = new Output[(byte)(2)];
		while (stat_REG_get_doublebuffer_Client_InputSend() == null) { }
		System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve().%n");//TESTBENCH
	}
	static private void stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_InputSend_List_Of_Input()
	{
		System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_InputSend_List_Of_Input().%n");//TESTBENCH
		_stat_REG_Stack_At_Client_InputSend_List_Of_Input = new ArrayList<Input>();
		while (stat_REG_get_doublebuffer_Client_InputSend() == null) { }
		System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_InputSend_List_Of_Input().%n");//TESTBENCH
	}
	static private void stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_OutputRecieve_List_Of_Output()
	{
		System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_OutputRecieve_List_Of_Output().%n");//TESTBENCH
		_stat_REG_Stack_At_Client_OutputRecieve_List_Of_Output = new ArrayList<Output>();
		while (stat_REG_get_doublebuffer_Client_InputSend() == null) { }
		System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Stack_At_Client_OutputRecieve_List_Of_Output().%n");//TESTBENCH
	}
	static private void stat_REG_boot3_INITIALISE_Buffer_Reference_For_Core_Of_Output(Output objOutput)
	{
		System.out.printf("entered stat_REG_boot3_INITIALISE_Buffer_Reference_For_Core_Of_Output().%n");//TESTBENCH
		for (byte concurrentThreadId = 0; concurrentThreadId < _stat_REG_Buffer_Reference_For_Core_Of_Output.length; concurrentThreadId++)
		{
			_stat_REG_Buffer_Reference_For_Core_Of_Output[concurrentThreadId] = objOutput;
		}
		System.out.printf("exiting stat_REG_boot3_INITIALISE_Buffer_Reference_For_Core_Of_Output().%n");//TESTBENCH
	}
	static private void stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend(Input objInput)
	{
		System.out.printf("entered stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend().%n");//TESTBENCH
		for (byte concurrentThreadId = 0; concurrentThreadId < _stat_REG_doublebuffer_Client_InputSend.length; concurrentThreadId++)
		{
			_stat_REG_doublebuffer_Client_InputSend[concurrentThreadId] = objInput;
		}
		System.out.printf("exiting stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend().%n");//TESTBENCH
	}
	static private void stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve(Output objOutput)
	{
		System.out.printf("entered stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve().%n");//TESTBENCH
		for (byte concurrentThreadId = 0; concurrentThreadId < _stat_REG_doublebuffer_Client_OutputRecieve.length; concurrentThreadId++)
		{
			_stat_REG_doublebuffer_Client_OutputRecieve[concurrentThreadId] = objOutput;
		}
		System.out.printf("exiting stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve().%n");//TESTBENCH
	}
	static private void stat_REG_boot3_INITIALISE_Stack_At_Client_InputSend_List_Of_Input(Input objInput)
	{
		System.out.printf("entered stat_REG_boot3_INITIALISE_Stack_At_Client_InputSend_List_Of_Input().%n");//TESTBENCH
		stat_REG_get_Stack_At_Client_InputSend_List_Of_Input().add(objInput);
		System.out.printf("exiting stat_REG_boot3_INITIALISE_Stack_At_Client_InputSend_List_Of_Input().%n");//TESTBENCH
	}
	static private void stat_REG_boot3_INITIALISE_Stack_At_Client_OutputRecieve_List_Of_Output(Output objOutput)
	{
		System.out.printf("entered stat_REG_boot3_INITIALISE_Stack_At_Client_OutputRecieve_List_Of_Output().%n");//TESTBENCH
		stat_REG_get_Stack_At_Client_OutputRecieve_List_Of_Output().add(objOutput);
		System.out.printf("exiting stat_REG_boot3_INITIALISE_Stack_At_Client_OutputRecieve_List_Of_Output().%n");//TESTBENCH
	}
	static private Output[] stat_REG_get_Item_On_Array_Of_Buffer_Reference_For_Core_Of_Output()	{
		return _stat_REG_Buffer_Reference_For_Core_Of_Output;
	}
	static private Input[] stat_REG_get_doublebuffer_Client_InputSend()
	{
		return _stat_REG_doublebuffer_Client_InputSend;
	}
	static private Output[] stat_REG_get_doublebuffer_Client_OutputRecieve() {
		return _stat_REG_doublebuffer_Client_OutputRecieve;
	}
	static private List<Input> stat_REG_get_Stack_At_Client_InputSend_List_Of_Input()	{
		return _stat_REG_Stack_At_Client_InputSend_List_Of_Input;
	}
	static private List<Output> stat_REG_get_Stack_At_Client_OutputRecieve_List_Of_Output()	{
		return _stat_REG_Stack_At_Client_OutputRecieve_List_Of_Output;
	}
}