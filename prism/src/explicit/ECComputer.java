//==============================================================================
//	
//	Copyright (c) 2002-
//	Authors:
//	* Dave Parker <d.a.parker@cs.bham.ac.uk> (University of Birmingham/Oxford)
//	
//------------------------------------------------------------------------------
//	
//	This file is part of PRISM.
//	
//	PRISM is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//	
//	PRISM is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//	
//	You should have received a copy of the GNU General Public License
//	along with PRISM; if not, write to the Free Software Foundation,
//	Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//	
//==============================================================================

package explicit;

import java.util.BitSet;
import java.util.List;

/**
 * Abstract class for classes that compute (M)ECs, i.e. (maximal) end components,
 * for a nondeterministic model such as an MDP.
 */
public abstract class ECComputer
{
	/**
	 * Static method to create a new ECComputer object.
	 */
	public static ECComputer createECComputer(NondetModel model)
	{
		return new ECComputerDefault(model);
	}

	/**
	 * Compute MECs and store them. They can be retrieved using {@link #getMECs()}.
	 */
	public abstract void computeMECs();

	/**
	 * Get the list of computed MECs.
	 */
	public abstract List<BitSet> getMECs();
}
