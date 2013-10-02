package com.lonepulse.robozombie.request;

/*
 * #%L
 * RoboZombie
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.lonepulse.robozombie.ProxyInvocationConfiguration;
import com.lonepulse.robozombie.annotation.Entity;

/**
 * <p>This runtime exception is thrown when an @{@link Entity} annotation failed to be discovered on the 
 * argument list of an endpoint method.</p>
 * 
 * <p>It is not imperative that you handle recovery from these failures. This {@link RuntimeException} may 
 * be used in scenarios where an entity is optionally required.</p>
 * 
 * @version 1.1.0
 * <br><br>
 * @since 1.2.4
 * <br><br>
 * @author <a href="mailto:sahan@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
class MissingEntityException extends RequestProcessorException {
	

	private static final long serialVersionUID = 8019567518599766350L;
	
	
	/**
	 * <p>Displays a detailed description along with the stacktrace.
	 * 
	 * @param config
	 * 			the {@link ProxyInvocationConfiguration} for which an @{@link Entity} failed to be discovered
	 * 
	 * @since 1.2.4
	 */
	public MissingEntityException(ProxyInvocationConfiguration config) {
	
		this("An entity annotated with @" + Entity.class.getSimpleName() + 
			 " was not found on the request named [" + config.getRequest().getName() + 
			 "] for the URI [" + config.getUri().toString() + "] ");
	}
	
	/**
	 * <p>Displays a detailed description along with the stacktrace.
	 * 
	 * @param config
	 * 			the {@link ProxyInvocationConfiguration} for which an @{@link Entity} failed to be discovered
	 * 
	 * @param rootCause
	 * 			the root cause which resulted in a failure to discover an entity
	 * 
	 * @since 1.2.4
	 */
	public MissingEntityException(ProxyInvocationConfiguration config, Throwable rootCause) {
		
		this("An entity annotated with @" + Entity.class.getSimpleName() + 
			 " was not found on the request named [" + config.getRequest().getName() + 
			 "] for the URI [" + config.getUri().toString() + "] ", rootCause);
	}
	
	/**
	 * See {@link RequestPopulatorException#RequestPopulatorException()}.
	 */
	public MissingEntityException() {
	}

	/**
	 * See {@link RequestPopulatorException#RequestPopulatorException(String)}.
	 */
	public MissingEntityException(String detailMessage) {
		
		super(detailMessage);
	}

	/**
	 * See {@link RequestPopulatorException#RequestPopulatorException(Throwable)}.
	 */
	public MissingEntityException(Throwable throwable) {
		
		super(throwable);
	}

	/**
	 * See {@link RequestPopulatorException#RequestPopulatorException(String, Throwable)}.
	 */
	public MissingEntityException(String detailMessage, Throwable throwable) {

		super(detailMessage, throwable);
	}
}
