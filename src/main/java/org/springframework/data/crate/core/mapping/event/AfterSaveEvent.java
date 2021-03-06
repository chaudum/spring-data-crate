/*
 * Copyright 2002-2014 the original author or authors.
 *
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
 */
package org.springframework.data.crate.core.mapping.event;

import org.springframework.data.crate.core.mapping.CrateDocument;

/**
 * @author Jon Brisbin <jbrisbin@vmware.com>
 * @author Hasnain Javed
 * @since 1.0.0
 *  
 */
public class AfterSaveEvent<E> extends CrateMappingEvent<E> {
	
	private static final long serialVersionUID = -6804703727714229097L;

	public AfterSaveEvent(E source, CrateDocument document) {
		super(source, document);
	}
}