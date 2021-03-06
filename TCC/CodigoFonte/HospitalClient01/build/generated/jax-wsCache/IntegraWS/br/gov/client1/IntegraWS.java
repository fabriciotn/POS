
package br.gov.client1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IntegraWS", targetNamespace = "http://Integrador.gov.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IntegraWS {


    /**
     * 
     * @param numeroBolsa
     * @return
     *     returns br.gov.client1.Hemocomponente
     */
    @WebMethod(operationName = "RecebeDadosHemocomponente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RecebeDadosHemocomponente", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.RecebeDadosHemocomponente")
    @ResponseWrapper(localName = "RecebeDadosHemocomponenteResponse", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.RecebeDadosHemocomponenteResponse")
    @Action(input = "http://Integrador.gov.br/IntegraWS/RecebeDadosHemocomponenteRequest", output = "http://Integrador.gov.br/IntegraWS/RecebeDadosHemocomponenteResponse")
    public Hemocomponente recebeDadosHemocomponente(
        @WebParam(name = "numeroBolsa", targetNamespace = "")
        String numeroBolsa);

    /**
     * 
     * @param rhPac
     * @param enderco
     * @param mae
     * @param pai
     * @param rg
     * @param cpf
     * @param nome
     * @param aboPac
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "GravaPaciente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GravaPaciente", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.GravaPaciente")
    @ResponseWrapper(localName = "GravaPacienteResponse", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.GravaPacienteResponse")
    @Action(input = "http://Integrador.gov.br/IntegraWS/GravaPacienteRequest", output = "http://Integrador.gov.br/IntegraWS/GravaPacienteResponse")
    public boolean gravaPaciente(
        @WebParam(name = "nome", targetNamespace = "")
        String nome,
        @WebParam(name = "cpf", targetNamespace = "")
        String cpf,
        @WebParam(name = "rg", targetNamespace = "")
        String rg,
        @WebParam(name = "pai", targetNamespace = "")
        String pai,
        @WebParam(name = "mae", targetNamespace = "")
        String mae,
        @WebParam(name = "aboPac", targetNamespace = "")
        String aboPac,
        @WebParam(name = "rhPac", targetNamespace = "")
        String rhPac,
        @WebParam(name = "enderco", targetNamespace = "")
        String enderco);

    /**
     * 
     * @param obs
     * @param motivo
     * @param codInstituicao
     * @param data
     * @param responsavel
     * @param codHemocomponente
     * @param codPaciente
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "GravaUtilizacao")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GravaUtilizacao", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.GravaUtilizacao")
    @ResponseWrapper(localName = "GravaUtilizacaoResponse", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.GravaUtilizacaoResponse")
    @Action(input = "http://Integrador.gov.br/IntegraWS/GravaUtilizacaoRequest", output = "http://Integrador.gov.br/IntegraWS/GravaUtilizacaoResponse")
    public boolean gravaUtilizacao(
        @WebParam(name = "codPaciente", targetNamespace = "")
        int codPaciente,
        @WebParam(name = "codHemocomponente", targetNamespace = "")
        String codHemocomponente,
        @WebParam(name = "data", targetNamespace = "")
        String data,
        @WebParam(name = "motivo", targetNamespace = "")
        String motivo,
        @WebParam(name = "responsavel", targetNamespace = "")
        String responsavel,
        @WebParam(name = "obs", targetNamespace = "")
        String obs,
        @WebParam(name = "codInstituicao", targetNamespace = "")
        int codInstituicao);

    /**
     * 
     * @param id
     * @return
     *     returns br.gov.client1.Paciente
     */
    @WebMethod(operationName = "RecebeDadosPaciente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RecebeDadosPaciente", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.RecebeDadosPaciente")
    @ResponseWrapper(localName = "RecebeDadosPacienteResponse", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.RecebeDadosPacienteResponse")
    @Action(input = "http://Integrador.gov.br/IntegraWS/RecebeDadosPacienteRequest", output = "http://Integrador.gov.br/IntegraWS/RecebeDadosPacienteResponse")
    public Paciente recebeDadosPaciente(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param nomePaciente
     * @return
     *     returns java.util.List<br.gov.client1.Reacoes>
     */
    @WebMethod(operationName = "ListarReacoes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListarReacoes", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.ListarReacoes")
    @ResponseWrapper(localName = "ListarReacoesResponse", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.ListarReacoesResponse")
    @Action(input = "http://Integrador.gov.br/IntegraWS/ListarReacoesRequest", output = "http://Integrador.gov.br/IntegraWS/ListarReacoesResponse")
    public List<Reacoes> listarReacoes(
        @WebParam(name = "nomePaciente", targetNamespace = "")
        String nomePaciente);

    /**
     * 
     * @param reacao
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "GravarReacoes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GravarReacoes", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.GravarReacoes")
    @ResponseWrapper(localName = "GravarReacoesResponse", targetNamespace = "http://Integrador.gov.br/", className = "br.gov.client1.GravarReacoesResponse")
    @Action(input = "http://Integrador.gov.br/IntegraWS/GravarReacoesRequest", output = "http://Integrador.gov.br/IntegraWS/GravarReacoesResponse")
    public boolean gravarReacoes(
        @WebParam(name = "reacao", targetNamespace = "")
        Reacoes reacao);

}
