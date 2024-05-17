package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.uglytrivia.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    void can_create_player_with_name() {
        String name = new Player("jim").toName();
        Assertions.assertEquals("jim", name);
    }

    @Test
    void should_start_at_position_0() {
        Assertions.assertEquals(0, new Player("jim").getPlace());
    }
}
