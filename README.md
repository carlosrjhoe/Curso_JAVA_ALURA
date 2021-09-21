# Curso_JAVA_ALURA
Java JRE e JDK

No dia 14/09/2021

Nessa aula começamos a falar sobre a herança e aprendemos:

quais problemas a herança pode resolver
como usar herança no Java através de palavra chave extends
ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe
conhecemos o primeiro benefício da herança: Reutilização do código

O que aprendemos?

Nessa aula já entramos mais a fundo na herança. Aprendemos:

que classe mãe é chamada de super ou base class
que a classe filha também é chamada de sub class
como aumentar a visibilidade de um membro (atributo, método) através do protected
como acessar ou chamar um membro (atributo, método) através do super
como redefinir um método através da sobrescrita

No dia 15/09/21

Nessa aula aprendemos que:

objetos não mudam de tipo;
a referência pode mudar, e aí entra o polimorfismo;
o polimorfismo permite usar referências mais genéricas para a comunicação com um objeto;
o uso de referências mais genéricas permite desacoplar sistemas.

Nessa aula, vimos:

Conceitos de herança, construtores e polimorfismo
A utilização da anotação @Override
Construtores não são herdados
Um construtor da classe mãe pode ser chamado através do super()

No dia 16/09/21

Nessa aula aprendemos que:

Não existe herança múltipla em Java.
Conceitos de interface.
Diferenças entre classes abstratas e interfaces.
interfaces são uma alternativa a herança referente ao polimorfismo

No dia 17/09/21

Nessa aula, aprendemos:

Mais a fundo sobre o uso de interfaces
Trabalhamos mais a fundo com herança
Vimos outras aplicações de heranças e interfaces

Nessa aula, aprendemos:

O que é, para que serve e como funciona a pilha de execução.
O que é depuração (debug) e para que serve.
Como utilizar o Eclipse e sua perspectiva de debug.
Como alternar entre perspectivas do Eclipse.

No dia 20/09/21

Nessa aula, aprendemos:

O que são exceções, para que servem e porquê utilizá-las.
Como analisar o rastro de exceções, ou stacktrace.
Tratar exceções com os blocos try-catch.
Manipular uma exceção lançada dentro do bloco catch.
Tratar múltiplas exceções com mais de um bloco catch ou usando Multi-Catch utilizando o pipe (|).

Nessa aula, aprendemos:

que existe um bloco finally, útil para o fechamento de recursos (como conexão);
quando há um bloco finally o bloco catch é opcional;
que o bloco finally é sempre executado, sem ou com exceção;
como usar o try-with-resources.

O que aprendemos?

packages servem para organizar o nosso código
packages fazem parte do FQN (Full Qualified Name) da classe
o nome completo da classe (FQN) é composto de: PACKAGE.NOME_SIMPLES_CLASSE
a definição do package deve ser a primeira declaração no código fonte
para facilitar o uso de classes de outros packages podemos importá-los
os imports ficam logo após da declaração do package
a nomenclatura padrão é usar o nome do domínio na web ao contrário junto com o nome do projeto, por exemplo:

Nessa aula falamos novamente sobre visibilidade e aprendemos:

existem 3 palavras chaves relacionado com a visibilidade: private, protected, public
existem 4 níveis de visibilidade (de menor para maior):
private (visível apenas na classe)
<<package private>> (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado de default)
protected (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho)
public (visível em qualquer pacote)
os modificadores podem ser usados na definição da classe, atributo, construtor e método

No dia 21/09/21

Nessa aula mais leve vimos e aprendemos:

quais comentários e tags (anotações) a usar para definir o javadoc
como gerar o javadoc no Eclipse
que javadoc é uma documentação para desenvolvedores
que as classes Java padrão também usam javadoc
como criar nossa própria biblioteca através do JAR (J*ava *ARchive)
como importar a biblioteca no novo projeto
como criar um JAR executável

Nessa aula aprendemos e conhecemos:

o package java.lang é o único pacote que não precisa ser importado
nele tem classes fundamentais que qualquer aplicação precisa, como a classe String e System
objetos da classe String são imutáveis e usamos uma sintaxe literal para criar (object literal)
qualquer método de alteração da classe String devolve uma nova String que representa a alteração
a classe String é uma CharSequence
se precisamos concatenar muitos String devemos usar a classe StringBuilder
vimos vários métodos da classe String como trim, charAt, contains, isEmpty, length, indexOf, replace