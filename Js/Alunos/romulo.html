//Criado por Rômulo Maciel de Moraes Filho - Graduando em Análise de Sistemas (Faculdade Imaculada Conceição do Recife) - email: romulommfilho@yahoo.com.br
/*----------------------------------------------------------------------------------------*/
//Variáveis INPUT - PODE ALTERAR PARA VER COMO O RESULTADO VARIA

//seta o numero de individuos da simulação (mais do que 200 fica muito apertado)
var numIndividuos = 200;

//Simula o distanciamento social (quarentena)
//0 = Sem isolamento; 5 = isolamento parcial;
//10 = quarentena obrigatoria */
var socialDistance = 0;

//representa a redução da movimentação de pessoas (valor entre 3 e 6) 
//(3 simularia uma capital, 4-5 uma cidade mediana, 6 uma cidade de interior)
var limitMovement = 3;

//representa o padrão de movimento(quanto maior o valor, mais errático)
var movProbability = 1;

//virulência em porcentagem (probabilidade de infectar outra pessoa)
var virulencia = 70; 

//mortalidade em porcentagem
var mortalidade = 4; 

//Tempo em que a pessoa fica curada ou morre e para de transmitir
var diasRemocao = 10;

/*----------------------------------------------------------------------------------------*/
//OUTPUT -  NÃO ALTERAR

//depois de um período após a infecção o individuo é considerado removido, ou devido à ter se recuperado ou ter ficado imune, e perdido a capacidade de espalhar, ou por ter morrido.
var numRemovidos = 0; 

//Número de mortos calculado probabilisticamente com base na mortalidade e no número de removidos, portanto esse numero vai variar a cada simulação
var numMortos = 0; 

/*-----------------------------PROGRAMA EM SI---------------------------------------------*/

var time = millis();
var starttime = millis();
var totalnormal = numIndividuos;
var saudaveis = [];

var Individuo = function() {
    //posição inicial de cada individuo
    this.position = new PVector(random(15,380), random(25,380));
    //velocidade de movimento inicial
    this.velocity = new PVector(cos(millis()/limitMovement), cos(millis())/limitMovement);
    this.infectado = false;
    this.diazero = false;
    this.color = 0;
    this.size = 0;
};

var Saudavel = function(position, velocity, infectado, diazero) {
    Individuo.call(this, position, velocity, infectado, diazero);
    this.color = 0;
    this.size = 3;
};

Saudavel.prototype.update = function() {
    this.position.add(this.velocity);
};


Saudavel.prototype.display = function() {
  noStroke();
  fill(this.color, 0, 0);
  ellipse(this.position.x, this.position.y, this.size, this.size);
};

Saudavel.prototype.calculateDistance = function(outro) {
    //Calcula a direção da força
    var force = PVector.sub(this.position, outro.position);
    // Distance between objects
    var distance = floor(force.mag());
    return distance;
    

}; 

Saudavel.prototype.infect = function() {
    this.color = 252;
    this.infectado = true;
    this.diazero = floor(millis()/1000);
    
};

Saudavel.prototype.kill = function() {
    this.color = 100;
    this.diazero = floor(millis()/1000);
};

Saudavel.prototype.calctempoinf = function(mover, i) {
    var diazero = this.diazero;
    return diazero;
};

Saudavel.prototype.verestado = function(mover, i) {
    var estado = this.infectado;
    return estado;
};



Saudavel.prototype.applyForce = function() {
    this.velocity.mult(-0.99);
};

//cria repulsão dos individuos em relação às paredes
Saudavel.prototype.checkEdges = function() {

      if ((this.position.x > 395) || (this.position.x < 5)) {
        this.velocity.x = this.velocity.x * -1;
    }
    if ((this.position.y > 395) || (this.position.y < 21)) {
        this.velocity.y = this.velocity.y * -1;
    }
};

//função para gerar movimento aleatório.
// é possivel mudar a frequencia que os individuos mudam de direção de movimento mudando a probabilidade da condicional e é possivel mudar a intensidade da mudança de movimento modificando o valor de Cosseno. Dessa forma é possivel reduzir ou aumentar a movimentação dos indivíduos modificando o denominador ou mudando para um multiplicador.
Saudavel.prototype.mov = function() {
    if (movProbability > floor(random(0,100))){this.velocity.x = cos(millis())/limitMovement;}
    if (movProbability > floor(random(0,100))){this.velocity.y = cos(millis())/limitMovement;}
};


for (var i = 0; i < numIndividuos; i++) {
    saudaveis[i] = new Saudavel(); 
}

var starinf = millis()/1000;

draw = function() {
    background(255, 255, 255);
    fill(255,255,255);
    stroke(255, 0, 0);
    rect(0, 17, 399, 382);
    var time = millis()/1000;// timer
    var i = starttime/1000;
    fill(0, 0, 0);
    text("Nº Pessoas",5, 15);
    text(numIndividuos+"|",70, 15);
    text("Social Dist.",95, 15);
    text(socialDistance+"|",154, 15);
    text("Movimento",170, 15);
    text(limitMovement+"|",231, 15);
    text("Mortos",243, 15);
    text(numMortos+"|",285, 15);
    text("Dia",360, 15);
    var dias = floor(time) - floor(i);
    text(dias,380, 15);// timer
    if (dias === 1){saudaveis[0].infect();}
    
    //tem q ter um loop unico pro splice
    for (var i = 0; i < saudaveis.length; i++){
        var estado = saudaveis[i].verestado(saudaveis[i]); 
        var diazero = saudaveis[i].calctempoinf(saudaveis[i]); 
        if (floor(millis()/1000) - floor(diazero) === diasRemocao && estado === true){
        saudaveis.splice(i, 1);
        numIndividuos--;
        numRemovidos++;
        var morts = floor(random(0, 100));
        if (morts <= mortalidade){numMortos++;}
        }
    }
    
    for (var i = 0; i < saudaveis.length; i++) {
            for (var j = 0; j < saudaveis.length; j++) {
                if (i !== j) {
                    //distancia social
                    var distance = saudaveis[j].calculateDistance(saudaveis[i]); 
                    var estado = saudaveis[j].verestado(saudaveis[i]); 
                    if (distance <= socialDistance) {
                    saudaveis[i].applyForce();}
                    var distInfec = floor(random(0,12));
                    //infecção
                    var infects = floor(random(0, 100));
                    if(distance <= distInfec && estado === true && infects < virulencia)
                    {saudaveis[i].infect();}

                }
                
            }
        saudaveis[i].update();
        saudaveis[i].mov();
        saudaveis[i].checkEdges();
        saudaveis[i].display();
        
    }

  
};


//- DAQUI PRA BAIXO SÃO RESTOS DE UMA TENTATIVA DE IMPLEMENTAR INDIVIDUOS SAUDAVEIS INFECTADOS COMO ENTIDADES SEPARADAS, MAS NÃO CONSEGUI POR NÃO TER TANTA PRATICA AINDA EM JS. IMAGINO QUE SEJA POSSIVEL, E VAI FACILITAR NAS ESTATÍSTICAS.
/*
var Infected = function() {
};

Infected.prototype.update = function() {
    this.position.add(this.velocity);
    
};

Infected.prototype.checkEdges = function() {

      if ((this.position.x > 385) || (this.position.x < 15)) {
        this.velocity.x = this.velocity.x * -1;
    }
    if ((this.position.y > 385) || (this.position.y < 25)) {
        this.velocity.y = this.velocity.y * -1;
    }
};

Infected.prototype.mov = function() {
    if (movProbability > floor(random(0,100))){this.velocity.x = cos(millis())/limitMovement;}
    if (movProbability > floor(random(0,100))){this.velocity.y = cos(millis())/limitMovement;}
};


Infected.prototype.display = function() {
  stroke(0);
  strokeWeight(1);
  fill(this.color, this.color, 0);
  ///fill(this.color);
  ellipse(this.position.x, this.position.y, this.size, this.size);
};





*/


            //infecteds.push(saudaveis[i]);
            //saudaveis[i].kill(); 
            //saudaveis[i] = new Infected();
