package structs;
import structs.praisesubsets.Algorithim_praise0;
import structs.praisesubsets.Algorithim_praise1;
import structs.praisesubsets.Algorithim_praise2;
import structs.praisesubsets.Algorithim_praise3;
public class Algorithim_Control 
{
    public Algorithim_Control()
    {
        //todo remove this class.
    }
    public void SelectSetAlgorithimSubset(Algorithim objAlgorithim, User_Algorithim objUserAlgorithim, int praiseId)
    {
        switch(praiseId)
        {
        case 0:
            Algorithim_praise0 inputPraise0 = (Algorithim_praise0)objAlgorithim.dyn_REG_get_AlgorithimSubset();
            objAlgorithim.dyn_REG_set_AlgorithimSubset(inputPraise0);
             break;

        case 1:
            Algorithim_praise1 inputPraise1 = (Algorithim_praise1)objAlgorithim.dyn_REG_get_AlgorithimSubset();
            objAlgorithim.dyn_REG_set_AlgorithimSubset(inputPraise1);
            break;

        case 2:
            Algorithim_praise2 inputPraise2 = (Algorithim_praise2)objAlgorithim.dyn_REG_get_AlgorithimSubset();
            objAlgorithim.dyn_REG_set_AlgorithimSubset(inputPraise2);
            break;

        case 3:
            Algorithim_praise3 inputPraise3 = (Algorithim_praise3)objAlgorithim.dyn_REG_get_AlgorithimSubset();
            objAlgorithim.dyn_REG_set_AlgorithimSubset(inputPraise3);
            break;
        }
    }
}
