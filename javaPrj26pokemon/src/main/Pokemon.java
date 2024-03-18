package main;

public class Pokemon {
   
   public Pokemon(String name, int hp, int atk, int def) {
      this.name = name;
      this.hp = hp;
      this.atk = atk;
      this.def = def;
   }

   String name;
   int hp;
   int atk;
   int def;
   
   public void bodyAttack() {
      System.out.println(name + " 의 몸통 박치기 ~ !");
   }

}