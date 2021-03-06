/******************************************************************************
 * Copyright (c) 2006, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at 
 * http://www.eclipse.org/legal/epl-v10.html and the Apache License v2.0
 * is available at http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses. 
 * 
 * Contributors:
 *   VMware Inc.
 *****************************************************************************/

package org.eclipse.gemini.blueprint.iandt.jdkproxy.internal;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Simple private class that dispatches a method.
 * 
 * @author Costin Leau
 * 
 */
class PrivateExecutor {

	/** logger */
	private static final Log log = LogFactory.getLog(PrivateExecutor.class);


	Object dispatchMethod(Method method) {
		log.info("about to invoke " + method);
		return "method invoked by a private class at " + new Date();
	}
}
