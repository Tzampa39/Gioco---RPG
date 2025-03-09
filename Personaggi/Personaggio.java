package Personaggi;

//Classe base Personaggio
public abstract class Personaggio {
 protected String nome;
 protected int salute;
 protected int mana;
 protected int forza;
 protected int agilita;
 protected int intelligenza;

 public Personaggio(String nome, int salute, int mana, int forza, int agilita, int intelligenza) {
     this.nome = nome;
     this.salute = salute;
     this.mana = mana;
     this.forza = forza;
     this.agilita = agilita;
     this.intelligenza = intelligenza;
 }

 public void attacca() {
     System.out.println(nome + " attacca il nemico!");
 }

 public void schiva() {
     System.out.println(nome + " esegue una schivata!");
 }

 public abstract void usaAbilitaSpeciale();

 public void mostraStatistiche() {
     System.out.println("Nome: " + nome);
     System.out.println("Salute: " + salute);
     System.out.println("Mana: " + mana);
     System.out.println("Forza: " + forza);
     System.out.println("Agilità: " + agilita);
     System.out.println("Intelligenza: " + intelligenza);
 }
}
