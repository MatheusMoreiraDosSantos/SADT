/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author maikon.rosa
 */
public class Model {
    private String matricula;
    private String est;
    private String rg;
    private String dc;
    private String seq;
    private String data_nasc;
    private String n_ordem;
    private String codigo_unidade;
    private String nome ;
    private String munucipio;
    private String sexo;
    private String codigo_municipal;
    private String suspeita;
    private String data_sintomas;
    private String uso_de;
    private String outro;
    private String caso;
    private String comunicante;
    private String codigo;/**/private String sadt;
    private String diagnostico;/**/ private String controle;
    private String n_sessoes;/**/private String material;
    private String data_requisicao;/**/private String  encaminhar;/**/ private String Endereco;/**/
    private String codigo_unidade2;/**/private String telefone;/**/private String cr;
 public Model(){}
    public Model(String matricula, String est, String rg, String dc, String seq, 
            String data_nasc, String n_ordem, String codigo_unidade, String nome, String munucipio, 
            String sexo, String codigo_municipal, String suspeita, String data_sintomas, String uso_de, String outro,
            String caso, String comunicante, String codigo, String sadt, String diagnostico, String controle, String n_sessoes, 
            String material, String data_requisicao, String encaminhar, String Endereco, String codigo_unidade2, String telefone, String cr) {
        this.matricula = matricula;
        this.est = est;
        this.rg = rg;
        this.dc = dc;
        this.seq = seq;
        this.data_nasc = data_nasc;
        this.n_ordem = n_ordem;
        this.codigo_unidade = codigo_unidade;
        this.nome = nome;
        this.munucipio = munucipio;
        this.sexo = sexo;
        this.codigo_municipal = codigo_municipal;
        this.suspeita = suspeita;
        this.data_sintomas = data_sintomas;
        this.uso_de = uso_de;  this.outro = outro;  this.caso = caso;  this.comunicante = comunicante;
        this.codigo = codigo; this.sadt = sadt; this.diagnostico = diagnostico;
        this.controle = controle; this.n_sessoes = n_sessoes; this.material = material;
        this.data_requisicao = data_requisicao; this.encaminhar = encaminhar;
        this.Endereco = Endereco;  this.codigo_unidade2 = codigo_unidade2;  this.telefone = telefone;  this.cr = cr;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getN_ordem() {
        return n_ordem;
    }

    public void setN_ordem(String n_ordem) {
        this.n_ordem = n_ordem;
    }

    public String getCodigo_unidade() {
        return codigo_unidade;
    }

    public void setCodigo_unidade(String codigo_unidade) {
        this.codigo_unidade = codigo_unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunucipio() {
        return munucipio;
    }

    public void setMunucipio(String munucipio) {
        this.munucipio = munucipio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodigo_municipal() {
        return codigo_municipal;
    }

    public void setCodigo_municipal(String codigo_municipal) {
        this.codigo_municipal = codigo_municipal;
    }

    public String getSuspeita() {
        return suspeita;
    }

    public void setSuspeita(String suspeita) {
        this.suspeita = suspeita;
    }

    public String getData_sintomas() {
        return data_sintomas;
    }

    public void setData_sintomas(String data_sintomas) {
        this.data_sintomas = data_sintomas;
    }

    public String getUso_de() {
        return uso_de;
    }

    public void setUso_de(String uso_de) {
        this.uso_de = uso_de;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getComunicante() {
        return comunicante;
    }

    public void setComunicante(String comunicante) {
        this.comunicante = comunicante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSadt() {
        return sadt;
    }

    public void setSadt(String sadt) {
        this.sadt = sadt;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getN_sessoes() {
        return n_sessoes;
    }

    public void setN_sessoes(String n_sessoes) {
        this.n_sessoes = n_sessoes;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getData_requisicao() {
        return data_requisicao;
    }

    public void setData_requisicao(String data_requisicao) {
        this.data_requisicao = data_requisicao;
    }

    public String getEncaminhar() {
        return encaminhar;
    }

    public void setEncaminhar(String encaminhar) {
        this.encaminhar = encaminhar;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCodigo_unidade2() {
        return codigo_unidade2;
    }

    public void setCodigo_unidade2(String codigo_unidade2) {
        this.codigo_unidade2 = codigo_unidade2;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }
    
}
