package se.citerus.crazysnake;

/**
 * Basic implementation of a Brain that stores the participants and the metadata for the
 * heat in protected fields for access by extending classes.
 * <p/>
 * BaseBrain provides the simple class name as the name of the Brain. This may be overridden.
 * <p/>
 * All extending classes must implement #getNextMove().
 */
public abstract class BaseBrain implements Brain {

    protected HeatMeta meta;
    protected String opponent;

    /**
     * Default, empty implementation.
     *
     * @param opponent Name of opponent in this heat.
     */
    @Override
    public void init(String opponent, HeatMeta meta) {
        this.meta = meta;
        this.opponent = opponent;
    }

    /**
     * Default implementation.
     *
     * @return Simple class name
     */
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    public abstract Movement getNextMove(GameState state);
}
