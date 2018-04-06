package Safety_Plan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author vsant
 */
public class Safety_PlanDocumentController implements Initializable {
    
    @FXML TabPane Principal;
    @FXML Tab tabCadAuno;
    @FXML SplitPane Split1;
    @FXML AnchorPane AncSplit1;
    @FXML TitledPane InfPessoalAluno;
    @FXML GridPane TabelaPessoais;
    @FXML TextField nomeAluno;
    @FXML TextField rgAluno;
    @FXML TextField cpfAluno;
    @FXML TextField telAluno;
    @FXML TextField emailAluno;
    @FXML TextField Instituicao;
    @FXML TextField Curso;
    @FXML TitledPane Aluno;
    @FXML GridPane InfObs;
    @FXML TextArea RespObs;
    @FXML CheckBox situacao;
    @FXML AnchorPane AncSplit2;
    @FXML TitledPane Endereco;
    @FXML GridPane TabelaEndereco;
    @FXML TextField ruaAluno;
    @FXML TextField bairroAluno;
    @FXML TextField cidadeAluno;
    @FXML TextField estadoAluno;
    @FXML TextField cepAluno;
    @FXML TitledPane InfTrasportadora;
    @FXML GridPane TabelaTransp;
    @FXML TextField Transp;
    @FXML Button salvarAluno;
    @FXML Tab tabCadEmpresa;
    @FXML SplitPane Split2;
    @FXML AnchorPane AncSplit3;
    @FXML TitledPane InfPessoalEmpresa;
    @FXML GridPane TabelaEmpresa;
    @FXML TextField nomeFantasia;
    @FXML TextField CNPJ;
    @FXML TextField inscriEstadual;
    @FXML TextField Matriz;
    @FXML TextField RepresLegal;
    @FXML TextField telEmpresa;
    @FXML TextField celEmpresa;
    @FXML TitledPane InfEmpresa;
    @FXML GridPane TabelaLugar;
    @FXML TextField Origem;
    @FXML TextField Destino;
    @FXML TextField Preco;
    @FXML TextField Plano;
    @FXML AnchorPane AncSplit4;
    @FXML TitledPane InfConta;
    @FXML GridPane TabelaConta;
    @FXML TextField tipoConta;
    @FXML TextField Titular;
    @FXML TextField Numero;
    @FXML TextField Agencia;
    @FXML TextField Banco;
    @FXML Button salvarEmpresa;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void onClicksalvarAluno(ActionEvent event){
        String nomealuno, rgaluno, cpfaluno, telaluno, emailaluno, instituicao, curso, respobs;
        String ruaaluno, bairroaluno, cidadealuno, estadoaluno, cepaluno, transp;
        
        nomealuno = nomeAluno.getText();
        rgaluno = rgAluno.getText();
        cpfaluno = cpfAluno.getText();
        telaluno = telAluno.getText();
        emailaluno = emailAluno.getText();
        instituicao = Instituicao.getText();
        curso = Curso.getText();
        respobs = RespObs.getText();
        ruaaluno = ruaAluno.getText();
        bairroaluno = bairroAluno.getText();
        cidadealuno = cidadeAluno.getText();
        estadoaluno = estadoAluno.getText();
        cepaluno = cepAluno.getText();
        transp = Transp.getText();
    }
}
