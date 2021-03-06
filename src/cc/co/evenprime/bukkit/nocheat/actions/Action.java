package cc.co.evenprime.bukkit.nocheat.actions;

/**
 * 
 * @author Evenprime
 *
 */

public abstract class Action {

	public final int firstAfter;
	public final boolean repeat;

	public Action(int firstAfter, boolean repeat) {
		this.firstAfter = firstAfter;
		this.repeat = repeat;
	}

	public abstract String getName();
}