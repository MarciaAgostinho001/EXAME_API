package marcia.demo.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long ID;
    @Column(name="nomes")
    private String Nome;
    @Column(name="moradas")
    private String Morada;
    @Column(name="senhas")
    private String Senha;
    @Column(name="Data_inscricoes")
    private Date Data_inscricao;
    @Column(name="Telefone")
    private String Telefone;
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getMorada() {
        return Morada;
    }
    public void setMorada(String morada) {
        Morada = morada;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public Date getData_inscricao() {
        return Data_inscricao;
    }
    public void setData_inscricao(Date data_inscricao) {
        Data_inscricao = data_inscricao;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
