package br.ufpb.dcx.brito.gustavo.exercicio5;

public class AtendimentoMedico {
    private String codigoAtendimento;
    private String diaAtendimento;
    private String categoriaAtendimento;

    public AtendimentoMedico(String codigoAtendimento, String diaAtendimento, String categoriaAtendimento){
        this.codigoAtendimento = codigoAtendimento;
        this.diaAtendimento = diaAtendimento;
        this.categoriaAtendimento = categoriaAtendimento;
    }
    public String getCodigoAtendimento() {
        return this.codigoAtendimento;
    }

    public void setCodigoAtendimento(String codigoAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
    }

    public String getDiaAtendimento() {
        return this.diaAtendimento;
    }

    public void setDiaAtendimento(String diaAtendimento) {
        this.diaAtendimento = diaAtendimento;
    }

    public String getCategoriaAtendimento() {
        return this.categoriaAtendimento;
    }

    public void setCategoriaAtendimento(String categoriaAtendimento) {
        this.categoriaAtendimento = categoriaAtendimento;
    }

    public String toString(){
        return "Atendimento de código "+this.codigoAtendimento+
                " no dia "+ this.diaAtendimento + " da categoria " +
                this.categoriaAtendimento;
    }

    public static int contaQuantidadeDeAtendimentoCardiologicos ( AtendimentoMedico [] atendimentosMedicos){
        int numCardiologicos = 0;
        for(int k = 0; k < atendimentosMedicos.length ; k++ ){
            if(atendimentosMedicos[k].getCategoriaAtendimento().equalsIgnoreCase("CARDIOLÓGICO")){
                numCardiologicos++;
            }
        }
    return numCardiologicos;
    }

    public static boolean existiramAtendimentosNaData (String data, AtendimentoMedico [] atendimentosMedicos){
        boolean AtendimentoNaData = false;
        for(int k=0; k<atendimentosMedicos.length; k++ ){
            if(atendimentosMedicos[k].getDiaAtendimento().equals(data)){
                return true;
            }
        }
    return false;
    }
}






















