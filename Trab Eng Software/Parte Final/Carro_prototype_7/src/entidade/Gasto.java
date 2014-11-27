/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import java.util.Date;

/**
 *
 * @author João Paulo Radd
 */
public class Gasto {
    //- custo : float
    //- dt_pagamento : Date
    private float custo;
    private Date dt_pagamento;
    
    public Gasto(){
        
    }
    
    public Gasto(float custo, Date dt_pagamento){
        this.custo = custo;
        this.dt_pagamento = dt_pagamento;
    }
    
    public float getCusto(){
        return this.custo;
    }
    
    public void setCusto(float custo)
    {
        this.custo = custo;
    }
    
    public Date getDt_pagamento(){
        return this.dt_pagamento;
    }
    
    public void setDt_pagamento(Date dt_pagamento)
    {
        this.dt_pagamento = dt_pagamento;
    }
}
