package structs.praisesubsets;

public class Algorithim_praise0 
{
    public Algorithim_praise0()
    {

    }
    public double doWork(Input_praise0 subsetIn, Output_praise0 subsetOut)
    {
        subsetOut.dyn_REG_set_output_praise0_value((subsetIn.dyn_REG_get_input_praise0_valueA() + subsetIn.dyn_REG_get_input_praise0_valueB()));
        return subsetOut.dyn_REG_get_output_praise0_value();
    }
}
