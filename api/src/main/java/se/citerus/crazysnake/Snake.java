package se.citerus.crazysnake;

/**
 * Represents the incarnation of a Snake's soul (i.e the {@code Brain}). A Snake
 * is positioned in the arena as long as it is still alive. Its {@code Brain}
 * determines how the Snake moves.
 */
public interface Snake {

    /**
     * Returns the current length of the {@code Snake} including, including the
     * head.
     */
    public int getLength();

    /**
     * Returns the {@code Position} of the {@code Snake}'s head on the board.
     */
    public Position getHeadPosition();

    /**
     * Returns the current {@code Direction} of the {@code Snake}.
     */
    public Direction getDirection();

    /**
     * Returns the name of the {@code Snake}.
     */
    public String getName();
    
    /**
    * Returns the brain id of the {@code Snake}.
    */
   public BrainId getId();

    /**
     * Returns the current score of the {@code Snake}.
     */
    public int getScore();
}
