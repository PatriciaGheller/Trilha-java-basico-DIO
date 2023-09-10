package atendimento.cozinha;

public class Cozinheiro {
//pode ser default
    void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
	}
	//pode ser default
	void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	//pode ser default
    void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, LEITE, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMNINA LIQUIDIFICADOR");
	}
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
	
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	public void pedirParaTrocarGas(Almoxarife almoxarife) {
		almoxarife.trocarGas();
		
	}
}
