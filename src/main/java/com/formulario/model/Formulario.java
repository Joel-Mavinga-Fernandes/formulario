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
	
	private String email;
	
	private String dataFiscalizacao;
	
	private String tipoEstacao;
	
	private String nivelTensao;
	
	private String potenciaTransfQdeEntLT;
	
	private String potenciaTransfQdeSaiLT;
	
	private String potenciaTransfNivTensEntrLT;
	
	private String potenciaTransfNivTensSaiLT;
	
	private String verificacaoAtualizacaoDiagramaUnifiliar;
	
	private String descricaoVerificacao;
	
	private String equipNivelCurtCircuit;
	
	private String equipNivelIsolamento;
	
	private String equipVidaUtil;
	
	private String equipTempoInstalacao;
	
	private String paraRaiosTempConexEletrica;
	
	private String paraRaiosMaterial;
	
	private String bobinasBloqueioTempConexEletrica;
	
	private String bobinBloqueioCondiConservaCxaComunicaC;
	
	private String TPsTemperatConexElect;
	
	private String TPsTipo;
	
	private String TCsTemperatConexElect;
	
	private String TCsTipo;
	
	private String chavesTemperatConexElect;
	
	private String chavesTipoAberturA;
	
	private String chavesTipo;
	
	private String chavesCxa;
	
	private String chavesTensNominal;
	
	private String chavesCorrenteNominal;
	
	private String disjuntoresTemperatConexElect;
	
	private String disjuntoresMecanismo;
	
	private String disjuntoresPainel;
	
	private String disjuntorSistemaDisparador;
	
	private String trfo1Tipo;
	
	private String trfo1Ausencia;
	
	private String trfo1Verificacao;
	
	private String trfo1Saturacao;
	
	private String trfo1VerificacaoTemperatura;
	
	private String trfo1NivelRuído;
	
	private String trfo1PotenciaNominal;
	
	private String trfo1TipoIsolação  ;
	
	private String trfo1EstadoConservação ;
	
	private String trfo1AusenciaPontos ;
	
	private String trfo1PlacaInformações  ;
	
	private String trfo1FechamentoEnrolamentos  ;
	
	private String trfo1ExistnciaComutador ;
	
	private String trf2Impedancia;
	
	private String trf2AusenciaVazamento ;
	
	private String trf2Saturacao  ;
	
	private String trf2VerificacaoTemperatura  ;
	
private String trfo2NivelRuído;
	
	private String trfo2PotenciaNominal;
	
	private String trfo2TipoIsolação  ;
	
	private String trfo2EstadoConservação ;
	
	private String trfo2AusenciaPontos ;
	
	private String trfo2PlacaInformações  ;
	
	private String trfo2FechamentoEnrolamentos  ;
	
	private String trfo2ExistnciaComutador ;
	
	private String bancoCapacitoresNivelTensao;
	
	private String bancoCapacitoresPotnciaCelula;
	
	private String bancoCapacitoresPotenciaBanco;
	
	private String bancoCapacitoresTipoMaterIsolante;
	
	private String TipoLigBancoCapacitores;
	
	private String reatores;
	
	private String tipoDiscoQtdIsoladores;
	
	private String tipoDiscoMaterial;
	
	private String tipoColunaQtdIsoladores;
	
	private String tipoColunaMaterial;
	
	private String muflas;
	
	private String cubiculos;
	
	private String paineisComandControle;
	
	private String paineisProtec;
	
	private String paineisSoftware;
	
	private String paineisComunicacProtec;
	
	private String paineisComunicaRemota;
	
	private String paineisEstadoConserva;
	
	private String paineisConexAdequada ;
	
	private String equipamentosServicosAuxTransformadores ;
	
	private String equipamentosServicosAuxPainel;
	
	private String equipamentosServicosAuxSalaConjunto;
	
	private String equipamentosServicosAuxLavaolhos;
	
	private String equipamentosServicosAuxVentilacao;
	
	private String equipamentosServicosAuxCarregador;
	
	private String equipamentosServicosAuxAusencia;
	
	private String equipamentosServicosAuxGerador;
	
	private String cablagemVerificacaoConservacao;
	
	private String cablagemVerificacaoSuficiente;
	
	private String aterramentoProtecaoConntraDescargasAtmosfericas;
	
	private String arranjoEletromecanico;
	
	private String arranjoEletromecanicoTipoManobra;
	
	private String arranjoEletromecanicoVL1;
	
	private String arranjoEletromecanicoVL2;
	
	private String arranjoEletromecanicoVerificarCondicoes;
	
	private String arranjoEletromecanicoPintura;
	
	private String arranjoEletromecanicoAusenciaCorrosao;
	
	private String arranjoEletromecanicoETD;
	
	private String arranjoEletromecanicoRelatos;
	
	private String arranjoEletromecanicoVerificacaoConexoseltricas;
	
	private String arranjoEletromecanicoQtdPontos;
	
	private String arranjoEletromecanicoMaiortemperatura;
	
	private String arranjoEletromecanicoVerificarEstado;
	
	private String arranjoEletromecanicoDisponibilidade;
	
	private String arjoEletromecanicoVerificEstadConserva;
	
	private String arranjoEletromecanicoVerifOcorrencia;
	
	private String arranjoEletromecanicoAusenciaTampa;
	
	private String arranjoEletromecanicoIstadoConserva;
	
	private String arranjoEletroVerifAdequacao;
	
	private String arranjoEletroVerificDistancias;
	
	private String arranjoEletroExistencia;
	
	private String arranjoEletroCaixa;
	
	private String testFuncionamento;
	
	private String testManobra;
	
	private String testManobraDisjuntores;
	
	private String testPartida;
	
	private String testComissionamento;
	
	private String testRel;
	
	private String testRuido;
	
	private String testTemperatura;
	
	private String consInfraMuro;
	
	private String consInfraConcertina;
	
	private String consInfraPlacaETD;
	
	private String consInfraPlacasinalizacao;
	
	private String consInfraEntorno;
	
	private String consInfraAterramento;
	
	private String consInfraValidade;
	
	private String consInfraDisponibilidade;
	
	private String consInfraAusencia;
	
	private String consInfraFuncionalidade;
	
	private String consInfraAdequacaoAcomodacoes;
	
	private String consInfraExistenciaEPCs;
	
	private String consInfraPintura;
	
	private String consInfraAusenciaMaFormac;
	
	private String consInfraIluminacao;
	
	private String consInfraAusnciaVegetação;
	
	private String consInfraAusnciaMaterialInservivel;
	
	private String consInfraMonitoramento;
	
	private String consInfraNivelRuido;
	
	private String consInfraAusnciaEquipament;
	
	private String consInfraEquipamentOperando;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataFiscalizacao() {
		return dataFiscalizacao;
	}

	public void setDataFiscalizacao(String dataFiscalizacao) {
		this.dataFiscalizacao = dataFiscalizacao;
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

	public String getPotenciaTransfQdeEntLT() {
		return potenciaTransfQdeEntLT;
	}

	public void setPotenciaTransfQdeEntLT(String potenciaTransfQdeEntLT) {
		this.potenciaTransfQdeEntLT = potenciaTransfQdeEntLT;
	}

	public String getPotenciaTransfQdeSaiLT() {
		return potenciaTransfQdeSaiLT;
	}

	public void setPotenciaTransfQdeSaiLT(String potenciaTransfQdeSaiLT) {
		this.potenciaTransfQdeSaiLT = potenciaTransfQdeSaiLT;
	}

	public String getPotenciaTransfNivTensEntrLT() {
		return potenciaTransfNivTensEntrLT;
	}

	public void setPotenciaTransfNivTensEntrLT(String potenciaTransfNivTensEntrLT) {
		this.potenciaTransfNivTensEntrLT = potenciaTransfNivTensEntrLT;
	}

	public String getPotenciaTransfNivTensSaiLT() {
		return potenciaTransfNivTensSaiLT;
	}

	public void setPotenciaTransfNivTensSaiLT(String potenciaTransfNivTensSaiLT) {
		this.potenciaTransfNivTensSaiLT = potenciaTransfNivTensSaiLT;
	}

	public String getVerificacaoAtualizacaoDiagramaUnifiliar() {
		return verificacaoAtualizacaoDiagramaUnifiliar;
	}

	public void setVerificacaoAtualizacaoDiagramaUnifiliar(String verificacaoAtualizacaoDiagramaUnifiliar) {
		this.verificacaoAtualizacaoDiagramaUnifiliar = verificacaoAtualizacaoDiagramaUnifiliar;
	}

	public String getDescricaoVerificacao() {
		return descricaoVerificacao;
	}

	public void setDescricaoVerificacao(String descricaoVerificacao) {
		this.descricaoVerificacao = descricaoVerificacao;
	}

	public String getEquipNivelCurtCircuit() {
		return equipNivelCurtCircuit;
	}

	public void setEquipNivelCurtCircuit(String equipNivelCurtCircuit) {
		this.equipNivelCurtCircuit = equipNivelCurtCircuit;
	}

	public String getEquipNivelIsolamento() {
		return equipNivelIsolamento;
	}

	public void setEquipNivelIsolamento(String equipNivelIsolamento) {
		this.equipNivelIsolamento = equipNivelIsolamento;
	}

	public String getEquipVidaUtil() {
		return equipVidaUtil;
	}

	public void setEquipVidaUtil(String equipVidaUtil) {
		this.equipVidaUtil = equipVidaUtil;
	}

	public String getEquipTempoInstalacao() {
		return equipTempoInstalacao;
	}

	public void setEquipTempoInstalacao(String equipTempoInstalacao) {
		this.equipTempoInstalacao = equipTempoInstalacao;
	}

	public String getParaRaiosTempConexEletrica() {
		return paraRaiosTempConexEletrica;
	}

	public void setParaRaiosTempConexEletrica(String paraRaiosTempConexEletrica) {
		this.paraRaiosTempConexEletrica = paraRaiosTempConexEletrica;
	}

	public String getParaRaiosMaterial() {
		return paraRaiosMaterial;
	}

	public void setParaRaiosMaterial(String paraRaiosMaterial) {
		this.paraRaiosMaterial = paraRaiosMaterial;
	}

	public String getBobinasBloqueioTempConexEletrica() {
		return bobinasBloqueioTempConexEletrica;
	}

	public void setBobinasBloqueioTempConexEletrica(String bobinasBloqueioTempConexEletrica) {
		this.bobinasBloqueioTempConexEletrica = bobinasBloqueioTempConexEletrica;
	}

	public String getBobinBloqueioCondiConservaCxaComunicaC() {
		return bobinBloqueioCondiConservaCxaComunicaC;
	}

	public void setBobinBloqueioCondiConservaCxaComunicaC(String bobinBloqueioCondiConservaCxaComunicaC) {
		this.bobinBloqueioCondiConservaCxaComunicaC = bobinBloqueioCondiConservaCxaComunicaC;
	}

	public String getTPsTemperatConexElect() {
		return TPsTemperatConexElect;
	}

	public void setTPsTemperatConexElect(String tPsTemperatConexElect) {
		TPsTemperatConexElect = tPsTemperatConexElect;
	}

	public String getTPsTipo() {
		return TPsTipo;
	}

	public void setTPsTipo(String tPsTipo) {
		TPsTipo = tPsTipo;
	}

	public String getTCsTemperatConexElect() {
		return TCsTemperatConexElect;
	}

	public void setTCsTemperatConexElect(String tCsTemperatConexElect) {
		TCsTemperatConexElect = tCsTemperatConexElect;
	}

	public String getTCsTipo() {
		return TCsTipo;
	}

	public void setTCsTipo(String tCsTipo) {
		TCsTipo = tCsTipo;
	}

	public String getChavesTemperatConexElect() {
		return chavesTemperatConexElect;
	}

	public void setChavesTemperatConexElect(String chavesTemperatConexElect) {
		this.chavesTemperatConexElect = chavesTemperatConexElect;
	}

	public String getChavesTipoAberturA() {
		return chavesTipoAberturA;
	}

	public void setChavesTipoAberturA(String chavesTipoAberturA) {
		this.chavesTipoAberturA = chavesTipoAberturA;
	}

	public String getChavesTipo() {
		return chavesTipo;
	}

	public void setChavesTipo(String chavesTipo) {
		this.chavesTipo = chavesTipo;
	}

	public String getChavesCxa() {
		return chavesCxa;
	}

	public void setChavesCxa(String chavesCxa) {
		this.chavesCxa = chavesCxa;
	}

	public String getChavesTensNominal() {
		return chavesTensNominal;
	}

	public void setChavesTensNominal(String chavesTensNominal) {
		this.chavesTensNominal = chavesTensNominal;
	}

	public String getChavesCorrenteNominal() {
		return chavesCorrenteNominal;
	}

	public void setChavesCorrenteNominal(String chavesCorrenteNominal) {
		this.chavesCorrenteNominal = chavesCorrenteNominal;
	}

	public String getDisjuntoresTemperatConexElect() {
		return disjuntoresTemperatConexElect;
	}

	public void setDisjuntoresTemperatConexElect(String disjuntoresTemperatConexElect) {
		this.disjuntoresTemperatConexElect = disjuntoresTemperatConexElect;
	}

	public String getDisjuntoresMecanismo() {
		return disjuntoresMecanismo;
	}

	public void setDisjuntoresMecanismo(String disjuntoresMecanismo) {
		this.disjuntoresMecanismo = disjuntoresMecanismo;
	}

	public String getDisjuntoresPainel() {
		return disjuntoresPainel;
	}

	public void setDisjuntoresPainel(String disjuntoresPainel) {
		this.disjuntoresPainel = disjuntoresPainel;
	}

	public String getDisjuntorSistemaDisparador() {
		return disjuntorSistemaDisparador;
	}

	public void setDisjuntorSistemaDisparador(String disjuntorSistemaDisparador) {
		this.disjuntorSistemaDisparador = disjuntorSistemaDisparador;
	}

	public String getTrfo1Tipo() {
		return trfo1Tipo;
	}

	public void setTrfo1Tipo(String trfo1Tipo) {
		this.trfo1Tipo = trfo1Tipo;
	}

	public String getTrfo1Ausencia() {
		return trfo1Ausencia;
	}

	public void setTrfo1Ausencia(String trfo1Ausencia) {
		this.trfo1Ausencia = trfo1Ausencia;
	}

	public String getTrfo1Verificacao() {
		return trfo1Verificacao;
	}

	public void setTrfo1Verificacao(String trfo1Verificacao) {
		this.trfo1Verificacao = trfo1Verificacao;
	}

	public String getTrfo1Saturacao() {
		return trfo1Saturacao;
	}

	public void setTrfo1Saturacao(String trfo1Saturacao) {
		this.trfo1Saturacao = trfo1Saturacao;
	}

	public String getTrfo1VerificacaoTemperatura() {
		return trfo1VerificacaoTemperatura;
	}

	public void setTrfo1VerificacaoTemperatura(String trfo1VerificacaoTemperatura) {
		this.trfo1VerificacaoTemperatura = trfo1VerificacaoTemperatura;
	}

	public String getTrfo1NivelRuído() {
		return trfo1NivelRuído;
	}

	public void setTrfo1NivelRuído(String trfo1NivelRuído) {
		this.trfo1NivelRuído = trfo1NivelRuído;
	}

	public String getTrfo1PotenciaNominal() {
		return trfo1PotenciaNominal;
	}

	public void setTrfo1PotenciaNominal(String trfo1PotenciaNominal) {
		this.trfo1PotenciaNominal = trfo1PotenciaNominal;
	}

	public String getTrfo1TipoIsolação() {
		return trfo1TipoIsolação;
	}

	public void setTrfo1TipoIsolação(String trfo1TipoIsolação) {
		this.trfo1TipoIsolação = trfo1TipoIsolação;
	}

	public String getTrfo1EstadoConservação() {
		return trfo1EstadoConservação;
	}

	public void setTrfo1EstadoConservação(String trfo1EstadoConservação) {
		this.trfo1EstadoConservação = trfo1EstadoConservação;
	}

	public String getTrfo1AusenciaPontos() {
		return trfo1AusenciaPontos;
	}

	public void setTrfo1AusenciaPontos(String trfo1AusenciaPontos) {
		this.trfo1AusenciaPontos = trfo1AusenciaPontos;
	}

	public String getTrfo1PlacaInformações() {
		return trfo1PlacaInformações;
	}

	public void setTrfo1PlacaInformações(String trfo1PlacaInformações) {
		this.trfo1PlacaInformações = trfo1PlacaInformações;
	}

	public String getTrfo1FechamentoEnrolamentos() {
		return trfo1FechamentoEnrolamentos;
	}

	public void setTrfo1FechamentoEnrolamentos(String trfo1FechamentoEnrolamentos) {
		this.trfo1FechamentoEnrolamentos = trfo1FechamentoEnrolamentos;
	}

	public String getTrfo1ExistnciaComutador() {
		return trfo1ExistnciaComutador;
	}

	public void setTrfo1ExistnciaComutador(String trfo1ExistnciaComutador) {
		this.trfo1ExistnciaComutador = trfo1ExistnciaComutador;
	}

	public String getTrf2Impedancia() {
		return trf2Impedancia;
	}

	public void setTrf2Impedancia(String trf2Impedancia) {
		this.trf2Impedancia = trf2Impedancia;
	}

	public String getTrf2AusenciaVazamento() {
		return trf2AusenciaVazamento;
	}

	public void setTrf2AusenciaVazamento(String trf2AusenciaVazamento) {
		this.trf2AusenciaVazamento = trf2AusenciaVazamento;
	}

	public String getTrf2Saturacao() {
		return trf2Saturacao;
	}

	public void setTrf2Saturacao(String trf2Saturacao) {
		this.trf2Saturacao = trf2Saturacao;
	}

	public String getTrf2VerificacaoTemperatura() {
		return trf2VerificacaoTemperatura;
	}

	public void setTrf2VerificacaoTemperatura(String trf2VerificacaoTemperatura) {
		this.trf2VerificacaoTemperatura = trf2VerificacaoTemperatura;
	}

	public String getTrfo2NivelRuído() {
		return trfo2NivelRuído;
	}

	public void setTrfo2NivelRuído(String trfo2NivelRuído) {
		this.trfo2NivelRuído = trfo2NivelRuído;
	}

	public String getTrfo2PotenciaNominal() {
		return trfo2PotenciaNominal;
	}

	public void setTrfo2PotenciaNominal(String trfo2PotenciaNominal) {
		this.trfo2PotenciaNominal = trfo2PotenciaNominal;
	}

	public String getTrfo2TipoIsolação() {
		return trfo2TipoIsolação;
	}

	public void setTrfo2TipoIsolação(String trfo2TipoIsolação) {
		this.trfo2TipoIsolação = trfo2TipoIsolação;
	}

	public String getTrfo2EstadoConservação() {
		return trfo2EstadoConservação;
	}

	public void setTrfo2EstadoConservação(String trfo2EstadoConservação) {
		this.trfo2EstadoConservação = trfo2EstadoConservação;
	}

	public String getTrfo2AusenciaPontos() {
		return trfo2AusenciaPontos;
	}

	public void setTrfo2AusenciaPontos(String trfo2AusenciaPontos) {
		this.trfo2AusenciaPontos = trfo2AusenciaPontos;
	}

	public String getTrfo2PlacaInformações() {
		return trfo2PlacaInformações;
	}

	public void setTrfo2PlacaInformações(String trfo2PlacaInformações) {
		this.trfo2PlacaInformações = trfo2PlacaInformações;
	}

	public String getTrfo2FechamentoEnrolamentos() {
		return trfo2FechamentoEnrolamentos;
	}

	public void setTrfo2FechamentoEnrolamentos(String trfo2FechamentoEnrolamentos) {
		this.trfo2FechamentoEnrolamentos = trfo2FechamentoEnrolamentos;
	}

	public String getTrfo2ExistnciaComutador() {
		return trfo2ExistnciaComutador;
	}

	public void setTrfo2ExistnciaComutador(String trfo2ExistnciaComutador) {
		this.trfo2ExistnciaComutador = trfo2ExistnciaComutador;
	}

	public String getBancoCapacitoresNivelTensao() {
		return bancoCapacitoresNivelTensao;
	}

	public void setBancoCapacitoresNivelTensao(String bancoCapacitoresNivelTensao) {
		this.bancoCapacitoresNivelTensao = bancoCapacitoresNivelTensao;
	}

	public String getBancoCapacitoresPotnciaCelula() {
		return bancoCapacitoresPotnciaCelula;
	}

	public void setBancoCapacitoresPotnciaCelula(String bancoCapacitoresPotnciaCelula) {
		this.bancoCapacitoresPotnciaCelula = bancoCapacitoresPotnciaCelula;
	}

	public String getBancoCapacitoresPotenciaBanco() {
		return bancoCapacitoresPotenciaBanco;
	}

	public void setBancoCapacitoresPotenciaBanco(String bancoCapacitoresPotenciaBanco) {
		this.bancoCapacitoresPotenciaBanco = bancoCapacitoresPotenciaBanco;
	}

	public String getBancoCapacitoresTipoMaterIsolante() {
		return bancoCapacitoresTipoMaterIsolante;
	}

	public void setBancoCapacitoresTipoMaterIsolante(String bancoCapacitoresTipoMaterIsolante) {
		this.bancoCapacitoresTipoMaterIsolante = bancoCapacitoresTipoMaterIsolante;
	}

	public String getTipoLigBancoCapacitores() {
		return TipoLigBancoCapacitores;
	}

	public void setTipoLigBancoCapacitores(String tipoLigBancoCapacitores) {
		TipoLigBancoCapacitores = tipoLigBancoCapacitores;
	}

	public String getReatores() {
		return reatores;
	}

	public void setReatores(String reatores) {
		this.reatores = reatores;
	}

	public String getTipoDiscoQtdIsoladores() {
		return tipoDiscoQtdIsoladores;
	}

	public void setTipoDiscoQtdIsoladores(String tipoDiscoQtdIsoladores) {
		this.tipoDiscoQtdIsoladores = tipoDiscoQtdIsoladores;
	}

	public String getTipoDiscoMaterial() {
		return tipoDiscoMaterial;
	}

	public void setTipoDiscoMaterial(String tipoDiscoMaterial) {
		this.tipoDiscoMaterial = tipoDiscoMaterial;
	}

	public String getTipoColunaQtdIsoladores() {
		return tipoColunaQtdIsoladores;
	}

	public void setTipoColunaQtdIsoladores(String tipoColunaQtdIsoladores) {
		this.tipoColunaQtdIsoladores = tipoColunaQtdIsoladores;
	}

	public String getTipoColunaMaterial() {
		return tipoColunaMaterial;
	}

	public void setTipoColunaMaterial(String tipoColunaMaterial) {
		this.tipoColunaMaterial = tipoColunaMaterial;
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

	public String getPaineisComandControle() {
		return paineisComandControle;
	}

	public void setPaineisComandControle(String paineisComandControle) {
		this.paineisComandControle = paineisComandControle;
	}

	public String getPaineisProtec() {
		return paineisProtec;
	}

	public void setPaineisProtec(String paineisProtec) {
		this.paineisProtec = paineisProtec;
	}

	public String getPaineisSoftware() {
		return paineisSoftware;
	}

	public void setPaineisSoftware(String paineisSoftware) {
		this.paineisSoftware = paineisSoftware;
	}

	public String getPaineisComunicacProtec() {
		return paineisComunicacProtec;
	}

	public void setPaineisComunicacProtec(String paineisComunicacProtec) {
		this.paineisComunicacProtec = paineisComunicacProtec;
	}

	public String getPaineisComunicaRemota() {
		return paineisComunicaRemota;
	}

	public void setPaineisComunicaRemota(String paineisComunicaRemota) {
		this.paineisComunicaRemota = paineisComunicaRemota;
	}

	public String getPaineisEstadoConserva() {
		return paineisEstadoConserva;
	}

	public void setPaineisEstadoConserva(String paineisEstadoConserva) {
		this.paineisEstadoConserva = paineisEstadoConserva;
	}

	public String getPaineisConexAdequada() {
		return paineisConexAdequada;
	}

	public void setPaineisConexAdequada(String paineisConexAdequada) {
		this.paineisConexAdequada = paineisConexAdequada;
	}

	public String getEquipamentosServicosAuxTransformadores() {
		return equipamentosServicosAuxTransformadores;
	}

	public void setEquipamentosServicosAuxTransformadores(String equipamentosServicosAuxTransformadores) {
		this.equipamentosServicosAuxTransformadores = equipamentosServicosAuxTransformadores;
	}

	public String getEquipamentosServicosAuxPainel() {
		return equipamentosServicosAuxPainel;
	}

	public void setEquipamentosServicosAuxPainel(String equipamentosServicosAuxPainel) {
		this.equipamentosServicosAuxPainel = equipamentosServicosAuxPainel;
	}

	public String getEquipamentosServicosAuxSalaConjunto() {
		return equipamentosServicosAuxSalaConjunto;
	}

	public void setEquipamentosServicosAuxSalaConjunto(String equipamentosServicosAuxSalaConjunto) {
		this.equipamentosServicosAuxSalaConjunto = equipamentosServicosAuxSalaConjunto;
	}

	public String getEquipamentosServicosAuxLavaolhos() {
		return equipamentosServicosAuxLavaolhos;
	}

	public void setEquipamentosServicosAuxLavaolhos(String equipamentosServicosAuxLavaolhos) {
		this.equipamentosServicosAuxLavaolhos = equipamentosServicosAuxLavaolhos;
	}

	public String getEquipamentosServicosAuxVentilacao() {
		return equipamentosServicosAuxVentilacao;
	}

	public void setEquipamentosServicosAuxVentilacao(String equipamentosServicosAuxVentilacao) {
		this.equipamentosServicosAuxVentilacao = equipamentosServicosAuxVentilacao;
	}

	public String getEquipamentosServicosAuxCarregador() {
		return equipamentosServicosAuxCarregador;
	}

	public void setEquipamentosServicosAuxCarregador(String equipamentosServicosAuxCarregador) {
		this.equipamentosServicosAuxCarregador = equipamentosServicosAuxCarregador;
	}

	public String getEquipamentosServicosAuxAusencia() {
		return equipamentosServicosAuxAusencia;
	}

	public void setEquipamentosServicosAuxAusencia(String equipamentosServicosAuxAusencia) {
		this.equipamentosServicosAuxAusencia = equipamentosServicosAuxAusencia;
	}

	public String getEquipamentosServicosAuxGerador() {
		return equipamentosServicosAuxGerador;
	}

	public void setEquipamentosServicosAuxGerador(String equipamentosServicosAuxGerador) {
		this.equipamentosServicosAuxGerador = equipamentosServicosAuxGerador;
	}

	public String getCablagemVerificacaoConservacao() {
		return cablagemVerificacaoConservacao;
	}

	public void setCablagemVerificacaoConservacao(String cablagemVerificacaoConservacao) {
		this.cablagemVerificacaoConservacao = cablagemVerificacaoConservacao;
	}

	public String getCablagemVerificacaoSuficiente() {
		return cablagemVerificacaoSuficiente;
	}

	public void setCablagemVerificacaoSuficiente(String cablagemVerificacaoSuficiente) {
		this.cablagemVerificacaoSuficiente = cablagemVerificacaoSuficiente;
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

	public String getArranjoEletromecanicoTipoManobra() {
		return arranjoEletromecanicoTipoManobra;
	}

	public void setArranjoEletromecanicoTipoManobra(String arranjoEletromecanicoTipoManobra) {
		this.arranjoEletromecanicoTipoManobra = arranjoEletromecanicoTipoManobra;
	}

	public String getArranjoEletromecanicoVL1() {
		return arranjoEletromecanicoVL1;
	}

	public void setArranjoEletromecanicoVL1(String arranjoEletromecanicoVL1) {
		this.arranjoEletromecanicoVL1 = arranjoEletromecanicoVL1;
	}

	public String getArranjoEletromecanicoVL2() {
		return arranjoEletromecanicoVL2;
	}

	public void setArranjoEletromecanicoVL2(String arranjoEletromecanicoVL2) {
		this.arranjoEletromecanicoVL2 = arranjoEletromecanicoVL2;
	}

	public String getArranjoEletromecanicoVerificarCondicoes() {
		return arranjoEletromecanicoVerificarCondicoes;
	}

	public void setArranjoEletromecanicoVerificarCondicoes(String arranjoEletromecanicoVerificarCondicoes) {
		this.arranjoEletromecanicoVerificarCondicoes = arranjoEletromecanicoVerificarCondicoes;
	}

	public String getArranjoEletromecanicoPintura() {
		return arranjoEletromecanicoPintura;
	}

	public void setArranjoEletromecanicoPintura(String arranjoEletromecanicoPintura) {
		this.arranjoEletromecanicoPintura = arranjoEletromecanicoPintura;
	}

	public String getArranjoEletromecanicoAusenciaCorrosao() {
		return arranjoEletromecanicoAusenciaCorrosao;
	}

	public void setArranjoEletromecanicoAusenciaCorrosao(String arranjoEletromecanicoAusenciaCorrosao) {
		this.arranjoEletromecanicoAusenciaCorrosao = arranjoEletromecanicoAusenciaCorrosao;
	}

	public String getArranjoEletromecanicoETD() {
		return arranjoEletromecanicoETD;
	}

	public void setArranjoEletromecanicoETD(String arranjoEletromecanicoETD) {
		this.arranjoEletromecanicoETD = arranjoEletromecanicoETD;
	}

	public String getArranjoEletromecanicoRelatos() {
		return arranjoEletromecanicoRelatos;
	}

	public void setArranjoEletromecanicoRelatos(String arranjoEletromecanicoRelatos) {
		this.arranjoEletromecanicoRelatos = arranjoEletromecanicoRelatos;
	}

	public String getArranjoEletromecanicoVerificacaoConexoseltricas() {
		return arranjoEletromecanicoVerificacaoConexoseltricas;
	}

	public void setArranjoEletromecanicoVerificacaoConexoseltricas(String arranjoEletromecanicoVerificacaoConexoseltricas) {
		this.arranjoEletromecanicoVerificacaoConexoseltricas = arranjoEletromecanicoVerificacaoConexoseltricas;
	}

	public String getArranjoEletromecanicoQtdPontos() {
		return arranjoEletromecanicoQtdPontos;
	}

	public void setArranjoEletromecanicoQtdPontos(String arranjoEletromecanicoQtdPontos) {
		this.arranjoEletromecanicoQtdPontos = arranjoEletromecanicoQtdPontos;
	}

	public String getArranjoEletromecanicoMaiortemperatura() {
		return arranjoEletromecanicoMaiortemperatura;
	}

	public void setArranjoEletromecanicoMaiortemperatura(String arranjoEletromecanicoMaiortemperatura) {
		this.arranjoEletromecanicoMaiortemperatura = arranjoEletromecanicoMaiortemperatura;
	}

	public String getArranjoEletromecanicoVerificarEstado() {
		return arranjoEletromecanicoVerificarEstado;
	}

	public void setArranjoEletromecanicoVerificarEstado(String arranjoEletromecanicoVerificarEstado) {
		this.arranjoEletromecanicoVerificarEstado = arranjoEletromecanicoVerificarEstado;
	}

	public String getArranjoEletromecanicoDisponibilidade() {
		return arranjoEletromecanicoDisponibilidade;
	}

	public void setArranjoEletromecanicoDisponibilidade(String arranjoEletromecanicoDisponibilidade) {
		this.arranjoEletromecanicoDisponibilidade = arranjoEletromecanicoDisponibilidade;
	}

	public String getArjoEletromecanicoVerificEstadConserva() {
		return arjoEletromecanicoVerificEstadConserva;
	}

	public void setArjoEletromecanicoVerificEstadConserva(String arjoEletromecanicoVerificEstadConserva) {
		this.arjoEletromecanicoVerificEstadConserva = arjoEletromecanicoVerificEstadConserva;
	}

	public String getArranjoEletromecanicoVerifOcorrencia() {
		return arranjoEletromecanicoVerifOcorrencia;
	}

	public void setArranjoEletromecanicoVerifOcorrencia(String arranjoEletromecanicoVerifOcorrencia) {
		this.arranjoEletromecanicoVerifOcorrencia = arranjoEletromecanicoVerifOcorrencia;
	}

	public String getArranjoEletromecanicoAusenciaTampa() {
		return arranjoEletromecanicoAusenciaTampa;
	}

	public void setArranjoEletromecanicoAusenciaTampa(String arranjoEletromecanicoAusenciaTampa) {
		this.arranjoEletromecanicoAusenciaTampa = arranjoEletromecanicoAusenciaTampa;
	}

	public String getArranjoEletromecanicoIstadoConserva() {
		return arranjoEletromecanicoIstadoConserva;
	}

	public void setArranjoEletromecanicoIstadoConserva(String arranjoEletromecanicoIstadoConserva) {
		this.arranjoEletromecanicoIstadoConserva = arranjoEletromecanicoIstadoConserva;
	}

	public String getArranjoEletroVerifAdequacao() {
		return arranjoEletroVerifAdequacao;
	}

	public void setArranjoEletroVerifAdequacao(String arranjoEletroVerifAdequacao) {
		this.arranjoEletroVerifAdequacao = arranjoEletroVerifAdequacao;
	}

	public String getArranjoEletroVerificDistancias() {
		return arranjoEletroVerificDistancias;
	}

	public void setArranjoEletroVerificDistancias(String arranjoEletroVerificDistancias) {
		this.arranjoEletroVerificDistancias = arranjoEletroVerificDistancias;
	}

	public String getArranjoEletroExistencia() {
		return arranjoEletroExistencia;
	}

	public void setArranjoEletroExistencia(String arranjoEletroExistencia) {
		this.arranjoEletroExistencia = arranjoEletroExistencia;
	}

	public String getArranjoEletroCaixa() {
		return arranjoEletroCaixa;
	}

	public void setArranjoEletroCaixa(String arranjoEletroCaixa) {
		this.arranjoEletroCaixa = arranjoEletroCaixa;
	}

	public String getTestFuncionamento() {
		return testFuncionamento;
	}

	public void setTestFuncionamento(String testFuncionamento) {
		this.testFuncionamento = testFuncionamento;
	}

	public String getTestManobra() {
		return testManobra;
	}

	public void setTestManobra(String testManobra) {
		this.testManobra = testManobra;
	}

	public String getTestManobraDisjuntores() {
		return testManobraDisjuntores;
	}

	public void setTestManobraDisjuntores(String testManobraDisjuntores) {
		this.testManobraDisjuntores = testManobraDisjuntores;
	}

	public String getTestPartida() {
		return testPartida;
	}

	public void setTestPartida(String testPartida) {
		this.testPartida = testPartida;
	}

	public String getTestComissionamento() {
		return testComissionamento;
	}

	public void setTestComissionamento(String testComissionamento) {
		this.testComissionamento = testComissionamento;
	}

	public String getTestRel() {
		return testRel;
	}

	public void setTestRel(String testRel) {
		this.testRel = testRel;
	}

	public String getTestRuido() {
		return testRuido;
	}

	public void setTestRuido(String testRuido) {
		this.testRuido = testRuido;
	}

	public String getTestTemperatura() {
		return testTemperatura;
	}

	public void setTestTemperatura(String testTemperatura) {
		this.testTemperatura = testTemperatura;
	}

	public String getConsInfraMuro() {
		return consInfraMuro;
	}

	public void setConsInfraMuro(String consInfraMuro) {
		this.consInfraMuro = consInfraMuro;
	}

	public String getConsInfraConcertina() {
		return consInfraConcertina;
	}

	public void setConsInfraConcertina(String consInfraConcertina) {
		this.consInfraConcertina = consInfraConcertina;
	}

	public String getConsInfraPlacaETD() {
		return consInfraPlacaETD;
	}

	public void setConsInfraPlacaETD(String consInfraPlacaETD) {
		this.consInfraPlacaETD = consInfraPlacaETD;
	}

	public String getConsInfraPlacasinalizacao() {
		return consInfraPlacasinalizacao;
	}

	public void setConsInfraPlacasinalizacao(String consInfraPlacasinalizacao) {
		this.consInfraPlacasinalizacao = consInfraPlacasinalizacao;
	}

	public String getConsInfraEntorno() {
		return consInfraEntorno;
	}

	public void setConsInfraEntorno(String consInfraEntorno) {
		this.consInfraEntorno = consInfraEntorno;
	}

	public String getConsInfraAterramento() {
		return consInfraAterramento;
	}

	public void setConsInfraAterramento(String consInfraAterramento) {
		this.consInfraAterramento = consInfraAterramento;
	}

	public String getConsInfraValidade() {
		return consInfraValidade;
	}

	public void setConsInfraValidade(String consInfraValidade) {
		this.consInfraValidade = consInfraValidade;
	}

	public String getConsInfraDisponibilidade() {
		return consInfraDisponibilidade;
	}

	public void setConsInfraDisponibilidade(String consInfraDisponibilidade) {
		this.consInfraDisponibilidade = consInfraDisponibilidade;
	}

	public String getConsInfraAusencia() {
		return consInfraAusencia;
	}

	public void setConsInfraAusencia(String consInfraAusencia) {
		this.consInfraAusencia = consInfraAusencia;
	}

	public String getConsInfraFuncionalidade() {
		return consInfraFuncionalidade;
	}

	public void setConsInfraFuncionalidade(String consInfraFuncionalidade) {
		this.consInfraFuncionalidade = consInfraFuncionalidade;
	}

	public String getConsInfraAdequacaoAcomodacoes() {
		return consInfraAdequacaoAcomodacoes;
	}

	public void setConsInfraAdequacaoAcomodacoes(String consInfraAdequacaoAcomodacoes) {
		this.consInfraAdequacaoAcomodacoes = consInfraAdequacaoAcomodacoes;
	}

	public String getConsInfraExistenciaEPCs() {
		return consInfraExistenciaEPCs;
	}

	public void setConsInfraExistenciaEPCs(String consInfraExistenciaEPCs) {
		this.consInfraExistenciaEPCs = consInfraExistenciaEPCs;
	}

	public String getConsInfraPintura() {
		return consInfraPintura;
	}

	public void setConsInfraPintura(String consInfraPintura) {
		this.consInfraPintura = consInfraPintura;
	}

	public String getConsInfraAusenciaMaFormac() {
		return consInfraAusenciaMaFormac;
	}

	public void setConsInfraAusenciaMaFormac(String consInfraAusenciaMaFormac) {
		this.consInfraAusenciaMaFormac = consInfraAusenciaMaFormac;
	}

	public String getConsInfraIluminacao() {
		return consInfraIluminacao;
	}

	public void setConsInfraIluminacao(String consInfraIluminacao) {
		this.consInfraIluminacao = consInfraIluminacao;
	}

	public String getConsInfraAusnciaVegetação() {
		return consInfraAusnciaVegetação;
	}

	public void setConsInfraAusnciaVegetação(String consInfraAusnciaVegetação) {
		this.consInfraAusnciaVegetação = consInfraAusnciaVegetação;
	}

	public String getConsInfraAusnciaMaterialInservivel() {
		return consInfraAusnciaMaterialInservivel;
	}

	public void setConsInfraAusnciaMaterialInservivel(String consInfraAusnciaMaterialInservivel) {
		this.consInfraAusnciaMaterialInservivel = consInfraAusnciaMaterialInservivel;
	}

	public String getConsInfraMonitoramento() {
		return consInfraMonitoramento;
	}

	public void setConsInfraMonitoramento(String consInfraMonitoramento) {
		this.consInfraMonitoramento = consInfraMonitoramento;
	}

	public String getConsInfraNivelRuido() {
		return consInfraNivelRuido;
	}

	public void setConsInfraNivelRuido(String consInfraNivelRuido) {
		this.consInfraNivelRuido = consInfraNivelRuido;
	}

	public String getConsInfraAusnciaEquipament() {
		return consInfraAusnciaEquipament;
	}

	public void setConsInfraAusnciaEquipament(String consInfraAusnciaEquipament) {
		this.consInfraAusnciaEquipament = consInfraAusnciaEquipament;
	}

	public String getConsInfraEquipamentOperando() {
		return consInfraEquipamentOperando;
	}

	public void setConsInfraEquipamentOperando(String consInfraEquipamentOperando) {
		this.consInfraEquipamentOperando = consInfraEquipamentOperando;
	}
	
	

	
	
}

