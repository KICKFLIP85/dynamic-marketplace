package org.dynamicmarketplace.dynamicmarketplace;

import org.bukkit.entity.Player;

public class InputParser {

    public InputParser () {}

    public int castInt ( String string, Player player ) {

        if ( ! string.matches("[0-9]+" ) ) {
            Interactions.intCastFailed(string, player);
            return -1;
        }

        int number = Integer.parseInt(string);

        if ( number > 1000 ){
            Interactions.intOutOfRange(string, player);
            return -1;
        }
        
        return number;
    }


}