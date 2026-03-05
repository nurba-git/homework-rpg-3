# UML Diagram

interface Combatant {
+ getName() : String
+ getAttackPower() : int
+ takeDamage(amount:int) : void
+ isAlive() : boolean
  }

interface Hero {
+ getName() : String
+ getPower() : int
+ receiveDamage(amount:int) : void
+ isAlive() : boolean
  }

interface Enemy {
+ getTitle() : String
+ getDamage() : int
+ applyDamage(amount:int) : void
+ isDefeated() : boolean
  }

class HeroCombatantAdapter {
- hero : Hero
+ getName()
+ getAttackPower()
+ takeDamage()
+ isAlive()
  }

class EnemyCombatantAdapter {
- enemy : Enemy
+ getName()
+ getAttackPower()
+ takeDamage()
+ isAlive()
  }

class EncounterResult {
- winner : String
- rounds : int
- battleLog : List<String>
  }

class BattleEngine {
- instance : BattleEngine
- random : Random
+ getInstance()
+ setRandomSeed()
+ runEncounter()
+ reset()
  }

Combatant <|.. HeroCombatantAdapter
Combatant <|.. EnemyCombatantAdapter

HeroCombatantAdapter --> Hero
EnemyCombatantAdapter --> Enemy

BattleEngine --> Combatant
BattleEngine --> EncounterResult