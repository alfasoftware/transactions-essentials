/**
 * Copyright (C) 2000-2022 Atomikos <info@atomikos.com>
 *
 * LICENSE CONDITIONS
 *
 * See http://www.atomikos.com/Main/WhichLicenseApplies for details.
 */

package com.atomikos.finitestates;

import com.atomikos.recovery.TxState;


public interface Stateful{
	/**
	*@return The object representing the state.
	*/
	public TxState getState();
}

