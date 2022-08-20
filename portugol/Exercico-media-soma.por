programa
{
	real valor, somaValores, mediaValores, totaldValores
	funcao inicio()
	{
		escreva("Digite um valor:")
		leia(valor)
		somaValores = 0 
		totaldValores = 0
	enquanto (valor>=0)	{
		somaValores = somaValores + valor
		totaldValores++
		escreva("digite um valor:")
		leia(valor)		
	}

		mediaValores = (somaValores / totaldValores)
		escreva("O total de valores inserido foi: ", totaldValores, "\nA soma total dos valores foi: ", somaValores, "\nA média de valores é: ", mediaValores) 
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */