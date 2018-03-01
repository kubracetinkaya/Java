
package kesirli.sayı;


public class kesirli 
{
    int pay,payda;

    kesirli(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void kesirli(int pay,int payda)
    {
        this.pay=pay;
        this.payda=payda;
    }
    public kesirli()
    {
        pay=0;
        payda=1;  
    }
    public void yaz()
    {
        System.out.println(+pay+"/"+payda);
    }
    public void carp(kesirli a)
    {
        pay*=a.pay;
        payda*=a.payda; 
        sadelestir();
    }
    public void carp(int a)
    {
       pay*=a;
      // sadelestir();
    }
    public void sadelestir() 
    {
        int ust = Math.min(Math.abs(pay), Math.abs(payda));
        for (int i = 2; i <= ust; i++) 
        {
            if (pay % i == 0 && payda % i == 0) 
            {
                pay /= i;
                payda /= i;
            }
        }
    }
    public void ekle(kesirli a) 
    {
        if (payda == a.payda) 
        {
            pay += a.pay;
        } else 
        {
            pay = pay * a.payda + payda * a.pay;
            payda = payda * a.payda;
        }
        sadelestir();
    }  
    public String toString() 
    {
        return pay + "/" + payda;
    }
}
