package se.citerus.crazysnake;

import java.util.Set;

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
    protected Set<BrainId> participants;
    
    /**
     * 
     * @param state, the current heat state.
     * @return Returns your opponent in the heat as a Snake.
     */
    protected Snake getOpponent(HeatState state) {
    	BrainId brainId = new BrainId(this);
    	for (BrainId id : participants) {
			if(!id.equals(brainId)) {
				return state.getSnake(id);
			}
		}
    	return null;
    }
    
    /**
     * 
     * @param state, the current heat state.
     * @return Returns your own brains Snake.
     */
    protected Snake getMe(HeatState state) {
    	BrainId brainId = new BrainId(this);
    	for (BrainId id : participants) {
			if(id.equals(brainId)) {
				return state.getSnake(id);
			}
		}
    	return null;
    }
    
    

    /**
     * Default, empty implementation.
     *
     * @param participants Participants in game.
     */
    @Override
    public void init(Set<BrainId> participants, HeatMeta meta) {
        this.meta = meta;
        this.participants = participants;
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

    public abstract Movement getNextMove(HeatState state);
}
