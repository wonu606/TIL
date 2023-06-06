package com.wonu606.strategypattern.actionadventuregame;

import com.wonu606.strategypattern.actionadventuregame.character.Character;
import com.wonu606.strategypattern.actionadventuregame.character.King;
import com.wonu606.strategypattern.actionadventuregame.character.Knight;
import com.wonu606.strategypattern.actionadventuregame.character.Queen;
import com.wonu606.strategypattern.actionadventuregame.character.Troll;
import java.util.ArrayList;

public class MiniActionAdventureGame {

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new King());
        characters.add(new Knight());
        characters.add(new Queen());
        characters.add(new Troll());

        for (Character character : characters) {
            character.fight();
        }
    }
}
