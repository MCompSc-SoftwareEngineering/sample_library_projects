package engine;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Global
{
    private static int _stat_REG_numberOfCores;
    private static int _stat_REG_numberOfPraises;
// public.
    public Global() 
    {
            System.out.printf("entering Global()%n");
            stat_CLASS_boot0_DECLAIRE_Global();
            stat_CLASS_boot1_DEFINE_Global();
            stat_CLASS_boot3_INITIALISE_Global();
            stat_REG_boot0_DECLAIRE_Global();
            System.out.printf("exiting Global()%n");
    }
    public void dyn_REG_boot1_DEFINE_Global()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Global().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Global().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Global()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Global().%n");
        stat_REG_boot2_SUBSTANTIATE_numberOfCores();
        stat_REG_boot2_SUBSTANTIATE_numberOfPraises();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Global().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Global()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Global().%n");
        stat_REG_boot3_INITIALISE_numberOfCores();
        stat_REG_boot3_INITIALISE_numberOfPraises();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Global().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Global()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Global().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Global().%n");
    }
    public static int dyn_REG_get_numberOfCores()
    {
        return stat_REG_get_numberOfCores();
    }
    public static int dyn_REG_get_numberOfPraises()
    {
        return stat_REG_get_numberOfPraises();
    }
    public static byte[] stat_CONVERT_MsbByteArray_To_LsbByteArray(byte[] buffer)
    {
        return ByteBuffer.wrap(buffer).order(ByteOrder.LITTLE_ENDIAN).array();
    }
    public static byte[] stat_CONVERT_LsbByteArray_To_MsbByteArray(byte[] buffer)
    {
        byte[] msbArray = new byte[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            msbArray[i] = buffer[buffer.length - 1 - i];
        }
        return msbArray;
    }
    public static byte[] stat_CONVERT_LsbBoolean_To_LsbByteArray(boolean bool)
    {
        byte[] byteArray = new byte[] { (byte) (bool ? 1 : 0) };
        return stat_CONVERT_LsbByteArray_To_MsbByteArray(byteArray);
    }
    public static boolean stat_CONVERT_LsbByteArray_To_LsbBoolean(byte[] bytesBool)
    {
        return (bytesBool[0] != 0);
    }
    public static double stat_CONVERT_LsbByteArray_To_LsbDouble(byte[] byteArray)
    {
        if (byteArray.length != 8) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getDouble();
    }
    public static float stat_CONVERT_LsbByteArray_To_LsbFloat(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }
    public static int stat_CONVERT_LsbByteArray_To_LsbInt(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
    public static byte[] stat_CONVERT_LsbInt_To_LsbByteArray(int value)
    {
        return stat_CONVERT_MsbByteArray_To_LsbByteArray(ByteBuffer.allocate(4).putInt(value).array());
    }
    public static byte[] stat_CONVERT_LsbFloat_To_LsbByteArray(float value)
    {
        return stat_CONVERT_MsbByteArray_To_LsbByteArray(ByteBuffer.allocate(4).putFloat(value).array());
    }
    public static byte[] stat_CONVERT_LsbDouble_To_LsbByteArray(double value)
    {
        return stat_CONVERT_MsbByteArray_To_LsbByteArray(ByteBuffer.allocate(8).putDouble(value).array());
    }
	public static void stat_CLASS_boot0_DECLAIRE_Global()
	{
		System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Global().%n");
		
		System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Global().%n");
	}
	private static void stat_CLASS_boot1_DEFINE_Global()
	{
		System.out.printf("entered stat_CLASS_boot1_DEFINE_Global().%n");
		
		System.out.printf("exiting stat_CLASS_boot1_DEFINE_Global().%n");
	}
	private static void stat_CLASS_boot3_INITIALISE_Global()
	{
		System.out.printf("entered stat_CLASS_boot3_INITIALISE_Global().%n");
		
		System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Global().%n");
	}
	private static void stat_REG_boot0_DECLAIRE_Global()
	{
		System.out.printf("entered stat_REG_boot0_DECLAIRE_Global().%n");
		
		System.out.printf("exiting stat_REG_boot0_DECLAIRE_Global().%n");
	}
// private.
    private static void stat_REG_boot2_SUBSTANTIATE_numberOfCores()
    {
        _stat_REG_numberOfCores = Integer.MAX_VALUE;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = Integer.MAX_VALUE;
    }
    private static void stat_REG_boot3_INITIALISE_numberOfCores()
    {
        _stat_REG_numberOfCores = 1;
    }
    private static void stat_REG_boot3_INITIALISE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = 4;
    }
    private static int stat_REG_get_numberOfCores()
	{
		return _stat_REG_numberOfCores;
	}
    private static int stat_REG_get_numberOfPraises()
	{
		return _stat_REG_numberOfPraises;
	}
}