/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapooo05;

/**
 *
 * @author andreas
 */
public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados
    
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo()) ;
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abriConta(String tipo){
       this.setTipo(tipo);
       this.setStatus(true);
       if (tipo == "CC") {   // Verificar se o tipo é CC ou CP- dependendo do tipo ja ganha um valor de saldo
          this.setSaldo (50);
    }else if (tipo=="CP") {
           this.setSaldo (150);
       }
        System.out.println("Conta Aberta com sucesso!");
    }
    public void fecharConta(){
      if (this.getSaldo()>0) {
          System.out.println("A conta não pode ser fechada pq tem dinheiro nela");
      }else if (this.getSaldo()<0){
          System.out.println("A conta tbm nao pode ser fechada p0q contem debitos");
      }else{ // se a conta nao tenm dinheiro e nao tem debito ela esta zerada, a conta pode ser fechada e o esttatus ser falso
          this.setStatus(false);
          System.out.println(" Conta fechada com sucesso!");
      }
    }
    
    public void depositar(float v){
        if(this.getStatus()){ //Se o status da conta é true, pq a conta esta aberta , entao é possivel depositar
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!");
        }else{ //Se o status da conta for false é impossivel depositar em cinta fechada
            System.out.println("impossivel depositar em uma conta fechada");
        }    
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo( ) >= v){
            this.setSaldo(this.getSaldo()-v); 
                System.out.println("Saque reslizado na conta de : " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para Saque");
            }
            
        }else{
            System.out.println("Impossivel sacar em conta fechada");
        }
    }
    
    public void pagarmensal(){
       int v=0;
       if(this.getTipo() == "CC"){
           v = 12;
           
       }else if (this.getTipo() == "CP"){
           v = 20;
    }
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("mensalidade paga com sucesso");
       }else{
           System.out.println("Impossivel pagar mensalidade de conta Fechada");
       }
    }
    //Metodo Construtor
    public ContaBancaria() {
        this.saldo = 0;
        this.status = false;
    }
    
    
// metodos set e get
    
     public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     
    
}
