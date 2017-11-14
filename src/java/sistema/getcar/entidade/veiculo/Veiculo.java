
package sistema.getcar.entidade.veiculo;

import java.sql.Date;

/**
 *
 * @author Carlos Antonio
 */
public class Veiculo {
    
    private Integer IDveiculo;
    private String modelo;
    private String fabricante;
    private String cor;
    private Integer quilometragem;
    private String estilo;
    private String potencia;
    private String placa;
    private Date ano;
    private Integer valorDiaria;
    private String descricao;
    private boolean alugado;

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    

    public Integer getIDveiculo() {
        return IDveiculo;
    }

    public void setIDveiculo(Integer IDveiculo) {
        this.IDveiculo = IDveiculo;
    }

    public Integer getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Integer valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }
    
    
    
    
    
    
}
