package structs.praisesubsets;

public class Algorithim_praise3 
{
    public Algorithim_praise3()
    {

    }
    public double doWork(Input_praise3 subsetIn, Output_praise3 subsetOut)
    {
        subsetOut.dyn_REG_set_output_praise3_value((subsetIn.dyn_REG_get_input_praise3_valueA() / subsetIn.dyn_REG_get_input_praise3_valueB()));
        return subsetOut.dyn_REG_get_output_praise3_value();
    }
}
