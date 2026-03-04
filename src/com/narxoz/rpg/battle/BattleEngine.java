package com.narxoz.rpg.battle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class BattleEngine {

    private static BattleEngine instance;
    private Random random = new Random(1L);

    private BattleEngine() {}

    public static BattleEngine getInstance() {
        if (instance == null) {
            instance = new BattleEngine();
        }
        return instance;
    }

    public BattleEngine setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public void reset() {
        this.random = new Random(1L);
    }

    public EncounterResult runEncounter(List<Combatant> teamA, List<Combatant> teamB) {
        EncounterResult result = new EncounterResult();

        if (teamA == null || teamB == null) {
            result.setWinner("None");
            result.setRounds(0);
            result.addLog("Invalid input: one of the teams is null.");
            return result;
        }

        if (teamA.isEmpty() || teamB.isEmpty()) {
            result.setWinner("None");
            result.setRounds(0);
            result.addLog("Invalid input: one of the teams is empty.");
            return result;
        }


        List<Combatant> a = new ArrayList<>(teamA);
        List<Combatant> b = new ArrayList<>(teamB);

        result.addLog("Battle started");
        result.addLog("Team A: " + names(a));
        result.addLog("Team B: " + names(b));

        result.setWinner("TBD");
        result.setRounds(0);
        result.addLog("TODO: implement battle simulation");
        return result;
    }

    private String names(List<Combatant> team) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < team.size(); i++) {
            sb.append(team.get(i).getName());
            if (i < team.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}