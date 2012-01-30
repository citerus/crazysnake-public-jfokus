package se.citerus.crazysnake;

/**
 * This class is used to identify a Brain. In particular it may be used to distinguish your own brain from your opponent.
 *
 */
public class BrainId {
	
	private final String id;

	/**
	 * Create brainId from an arbitrary string.
	 * @param id
	 */
	public BrainId(String id) {
		this.id = id;
		
	}
	
	/**
	 * Create BrainId from a Brain using its implementations class name.
	 * @param brain
	 */
	public BrainId(Brain brain) {
		this.id = brain.getClass().getName();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrainId other = (BrainId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
