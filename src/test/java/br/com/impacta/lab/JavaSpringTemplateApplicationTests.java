class JavaSpringTemplateApplicationTests {

	@Test
	//@Test
	public void shouldHaveMontarResumoAsStaticMethod() {

		Produto produto = new Produto();
		produto.codigo = 1;
		//produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;

		String resumo = produto.montarResumo(produto);
		String resumo = produto.montarResumo();

		assertEquals("codigo: 1, descricao: Camisa, valor: 70.0".toUpperCase(), resumo.toUpperCase());

	}

	@Test
	//@Test
	public void shouldMontarResumoWithNewProdutoCodigo15() {

		Produto produto = new Produto();
		produto.codigo = 15;
		//produto.codigo = 15;
		produto.descricao = "Tenis";
		produto.valor = 200.00;

		String resumo = produto.montarResumo(produto);
		String resumo = produto.montarResumo();

		assertEquals("codigo: 15, descricao: Tenis, valor: 200.0".toUpperCase(), resumo.toUpperCase());

	}