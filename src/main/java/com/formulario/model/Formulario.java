package com.formulario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_formulario")
public class Formulario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomeSubestacao;
	
	private String local;
	
	private String dataFiscalizacao;
	
	private String descricao;
	
	private String tipoEstacao;
	
	private String nivelTensao;
	
	private String potenciaTransformacao;
	
	private String verificacaoAtualizacaoDiagramaUnifiliar;
	
	private String equipamentos;
	
	private String paraRaios;
	
	private String bobinasBloqueio;
	
	private String TPs;
	
	private String TCs;
	
	private String chaves;
	
	private String disjuntores;
	
	private String trafo1;
	
	private String trafo2;
	
	private String bancoCapacitores;
	
	private String reatores;
	
	private String tipoDisco;
	
	private String tipoColuna;
	
	private String muflas;
	
	private String cubiculos;
	
	private String paineis;
	
	private String equipamentosServicosAux;
	
	private String cablagem;
	
	private String aterramentoProtecaoConntraDescargasAtmosfericas;
	
	private String arranjoEletromecanico;
	
	private String testes;
	
	private String conservacaoInfraEstrutura;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeSubestacao() {
		return nomeSubestacao;
	}

	public void setNomeSubestacao(String nomeSubestacao) {
		this.nomeSubestacao = nomeSubestacao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDataFiscalizacao() {
		return dataFiscalizacao;
	}

	public void setDataFiscalizacao(String dataFiscalizacao) {
		this.dataFiscalizacao = dataFiscalizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoEstacao() {
		return tipoEstacao;
	}

	public void setTipoEstacao(String tipoEstacao) {
		this.tipoEstacao = tipoEstacao;
	}

	public String getNivelTensao() {
		return nivelTensao;
	}

	public void setNivelTensao(String nivelTensao) {
		this.nivelTensao = nivelTensao;
	}

	public String getPotenciaTransformacao() {
		return potenciaTransformacao;
	}

	public void setPotenciaTransformacao(String potenciaTransformacao) {
		this.potenciaTransformacao = potenciaTransformacao;
	}

	public String getVerificacaoAtualizacaoDiagramaUnifiliar() {
		return verificacaoAtualizacaoDiagramaUnifiliar;
	}

	public void setVerificacaoAtualizacaoDiagramaUnifiliar(String verificacaoAtualizacaoDiagramaUnifiliar) {
		this.verificacaoAtualizacaoDiagramaUnifiliar = verificacaoAtualizacaoDiagramaUnifiliar;
	}

	public String getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos = equipamentos;
	}

	public String getParaRaios() {
		return paraRaios;
	}

	public void setParaRaios(String paraRaios) {
		this.paraRaios = paraRaios;
	}

	public String getBobinasBloqueio() {
		return bobinasBloqueio;
	}

	public void setBobinasBloqueio(String bobinasBloqueio) {
		this.bobinasBloqueio = bobinasBloqueio;
	}

	public String getTPs() {
		return TPs;
	}

	public void setTPs(String tPs) {
		TPs = tPs;
	}

	public String getTCs() {
		return TCs;
	}

	public void setTCs(String tCs) {
		TCs = tCs;
	}

	public String getChaves() {
		return chaves;
	}

	public void setChaves(String chaves) {
		this.chaves = chaves;
	}

	public String getDisjuntores() {
		return disjuntores;
	}

	public void setDisjuntores(String disjuntores) {
		this.disjuntores = disjuntores;
	}

	public String getTrafo1() {
		return trafo1;
	}

	public void setTrafo1(String trafo1) {
		this.trafo1 = trafo1;
	}

	public String getTrafo2() {
		return trafo2;
	}

	public void setTrafo2(String trafo2) {
		this.trafo2 = trafo2;
	}

	public String getBancoCapacitores() {
		return bancoCapacitores;
	}

	public void setBancoCapacitores(String bancoCapacitores) {
		this.bancoCapacitores = bancoCapacitores;
	}

	public String getReatores() {
		return reatores;
	}

	public void setReatores(String reatores) {
		this.reatores = reatores;
	}

	public String getTipoDisco() {
		return tipoDisco;
	}

	public void setTipoDisco(String tipoDisco) {
		this.tipoDisco = tipoDisco;
	}

	public String getTipoColuna() {
		return tipoColuna;
	}

	public void setTipoColuna(String tipoColuna) {
		this.tipoColuna = tipoColuna;
	}

	public String getMuflas() {
		return muflas;
	}

	public void setMuflas(String muflas) {
		this.muflas = muflas;
	}

	public String getCubiculos() {
		return cubiculos;
	}

	public void setCubiculos(String cubiculos) {
		this.cubiculos = cubiculos;
	}

	public String getPaineis() {
		return paineis;
	}

	public void setPaineis(String paineis) {
		this.paineis = paineis;
	}

	public String getEquipamentosServicosAux() {
		return equipamentosServicosAux;
	}

	public void setEquipamentosServicosAux(String equipamentosServicosAux) {
		this.equipamentosServicosAux = equipamentosServicosAux;
	}

	public String getCablagem() {
		return cablagem;
	}

	public void setCablagem(String cablagem) {
		this.cablagem = cablagem;
	}

	public String getAterramentoProtecaoConntraDescargasAtmosfericas() {
		return aterramentoProtecaoConntraDescargasAtmosfericas;
	}

	public void setAterramentoProtecaoConntraDescargasAtmosfericas(String aterramentoProtecaoConntraDescargasAtmosfericas) {
		this.aterramentoProtecaoConntraDescargasAtmosfericas = aterramentoProtecaoConntraDescargasAtmosfericas;
	}

	public String getArranjoEletromecanico() {
		return arranjoEletromecanico;
	}

	public void setArranjoEletromecanico(String arranjoEletromecanico) {
		this.arranjoEletromecanico = arranjoEletromecanico;
	}

	public String getTestes() {
		return testes;
	}

	public void setTestes(String testes) {
		this.testes = testes;
	}

	public String getConservacaoInfraEstrutura() {
		return conservacaoInfraEstrutura;
	}

	public void setConservacaoInfraEstrutura(String conservacaoInfraEstrutura) {
		this.conservacaoInfraEstrutura = conservacaoInfraEstrutura;
	}
	
	
}

