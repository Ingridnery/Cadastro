package br.edu.scl.ifsp.ads.cadastro;

public class Formulario {

    private String nome;
    private String telefone;
    private String email;
    private Boolean ingressarLista;
    private Sexo sexo;
    private String cidade;
    private String UF;

    public Formulario(String nome, String telefone, String email, Boolean ingressarLista, Sexo sexo, String cidade, String UF) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ingressarLista = ingressarLista;
        this.sexo = sexo;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIngressarLista() {
        return ingressarLista;
    }

    public void setIngressarLista(Boolean ingressarLista) {
        this.ingressarLista = ingressarLista;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        String ingressar;
        if(ingressarLista)
            ingressar= "Ingressar na lista";
        else
            ingressar = "Nao ingressar na lista";

        return  nome +", "+
                telefone+", "+
                email +", "+
                ingressar+", "+
                 sexo +", "+
                 cidade+"- "+
                 UF +
                '}';
    }
}
