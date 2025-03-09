public class CombatSystem {

    public void playerAttack(Player player, Enemy enemy) {
        int damage = player.getAttackPower();
        enemy.takeDamage(damage);
        System.out.println("Il giocatore ha inflitto " + damage + " danni a " + enemy.getName());
    }

    public void enemyAttack(Enemy enemy, Player player) {
        int damage = enemy.getAttackPower();
        player.takeDamage(damage);
        System.out.println(enemy.getName() + " ha inflitto " + damage + " danni al giocatore");
    }

    public void battle(Player player, Enemy enemy) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            playerAttack(player, enemy);
            if (enemy.getHealth() <= 0) {
                System.out.println("Il nemico è stato sconfitto!");
                break;
            }

            enemyAttack(enemy, player);
            if (player.getHealth() <= 0) {
                System.out.println("Il giocatore è stato sconfitto!");
                break;
            }
        }
    }
}

class Player {
    private int health = 100;
    private int attackPower = 10;

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}

class Enemy {
    private String name;
    private int health = 50;
    private int attackPower = 8;

    public Enemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
