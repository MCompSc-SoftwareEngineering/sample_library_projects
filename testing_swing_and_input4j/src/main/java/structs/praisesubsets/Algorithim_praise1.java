package structs.praisesubsets;

public class Algorithim_praise1 
{
    public Algorithim_praise1()
    {

    }
    public double doWork(Input_praise1 subsetIn, Output_praise1 subsetOut)
    {
        subsetOut.dyn_REG_set_output_praise1_value((subsetIn.dyn_REG_get_input_praise1_valueA() - subsetIn.dyn_REG_get_input_praise1_valueB()));
        return subsetOut.dyn_REG_get_output_praise1_value();
    }
}
