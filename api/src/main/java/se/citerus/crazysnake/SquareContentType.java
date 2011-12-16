package se.citerus.crazysnake;

/**
 * Describes types of content that exist on a Square.
 */
public enum SquareContentType {

    EMPTY(false), SNAKE_HEAD(true), SNAKE_TAIL(true), WALL(true), CHERRY(false), APPLE(false), STRAWBERRY(false);

    private final boolean solid;

    private SquareContentType(boolean solid) {
        this.solid = solid;
    }

    /**
     * Tells whether this SquareContentType will be lethal to collide with for a snake.
     */
    public boolean isSolid() {
        return solid;
    }
}
