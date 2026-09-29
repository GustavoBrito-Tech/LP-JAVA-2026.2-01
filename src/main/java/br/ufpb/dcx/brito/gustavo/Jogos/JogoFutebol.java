package br.ufpb.dcx.brito.gustavo.Jogos;

public class JogoFutebol {
    private String time1;
    private String time2;
    private Integer golsTime1;
    private Integer golsTime2;


    public JogoFutebol(String time1, String time2, Integer golsTime1, Integer golsTime2){
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public JogoFutebol(){
        this(" "," ",0,0);
    }

    public String getTime1(){
        return time1;
    }
    public String getTime2(){
        return time2;
    }
    public Integer getGolsTime1(){
        return golsTime1;
    }
    public Integer getGolsTime2(){
        return golsTime2;
    }

    public void setTime1(String time1){
        this.time1 = time1;
    }
    public void setTime2(String time2){
        this.time2 = time2;
    }
    public void setGolsTime1(Integer golsTime1){
        this.golsTime1 = golsTime1;
    }
    public void setGolsTime2(Integer golsTime2){
        this.golsTime2 = golsTime2;
    }

}.

