function test(){
	//	É acessível e visível somente dentro dessa função (escopo)
	//	Sem o var ela vai existir de forma global e imprime na tela
	var x = 10;	//	private
}
function exibirNome(){
	//	Retorna o objeto inteiro, somente a referência
	var elementNome = document.getElementById('txtNome');
	var stringNome = elementNome.value;
	var elementDisplay = document.getElementById('display');
	elementDisplay.innerText = stringNome;

	//	Pode jogar o element
	console.log(stringNome);
}
//	Cria novos elementos
function novoContato(){
	var elementListaContatos = document.getElementById('listaContatos');
	//	<label>Contato: </label>
	var labelContato = document.createElement('label');
	//	<input/>
	var inputContato = document.createElement('input');
	//	<br/>
	var br = document.createElement('br');
	// <input type="button" value="-" />
	var inputRemove = document.createElement('input');
	inputRemove.setAttribute('type', 'button');
	inputRemove.setAttribute('value', '-');
	inputRemove.onclick = function(){
		elementListaContatos.removeChild(divLinha);
	};

	labelContato.innerText = 'Contato: ';
	//	<div> ... </div>
	var divLinha = document.createElement('div');

	divLinha.appendChild(labelContato);
	divLinha.appendChild(inputContato);
	divLinha.appendChild(inputRemove);
	divLinha.appendChild(br);
	elementListaContatos.appendChild(divLinha);
}
//	Imprimir todos os inputs
function imprimirDados(){
	
}
test();
document.write(x);