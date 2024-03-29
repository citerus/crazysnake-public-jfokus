package se.citerus.crazysnake;

import java.util.Set;

/**
 * The brain of the snake.
 * <p/>
 * Implementing classes should provide the following:
 * <ol>
 * <li> A static name via getName()</li>
 * <li> A unique fully qualified package + class name, this is the identity of your brain. If to teams use the same package + class name, there will be a conflict.</li> 
 * <li> Its next movement via getNextMove(), based on the current GameState. getNextMove() must finish within a given
 * time span or the results will be ignored and the snake will continue its next move forward.</li>
 * </ol>
 * init() is called once when the game starts. This can be used to keep track of other participants in the game and
 * to get some metadata about the current game.
 */
public interface Brain {

    /**
     * Will be called once by the game engine before the game is started.
     *
     * @param participants All participants in this heat.
     * @param meta     Meta data.
     */
    void init(Set<BrainId> participants, HeatMeta meta);

    /**
     * @param state Game state.
     * @return The snake's desired next move.
     */
    Movement getNextMove(HeatState state);

    /**
     * @return Name, for display purposes only. This name is what will be shown on in the GUI during the game.
     * You can change this name if you detects someone else is using the same name as you or want to reflect an update.
     * Do not use getClass().getName() here since that would reveal your identity.
     */
    String getName();
}
