/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.xerces.xs;

import java.util.Vector;

/**
 * Describes a multi-value constraining facets: pattern and enumeration.
 */
public interface XSMultiValueFacet extends XSObject {
    /**
     * The name of the facet, i.e. <code>FACET_ENUMERATION</code> and 
     * <code>FACET_PATTERN</code> (see <code>XSSimpleTypeDefinition</code>). 
     */
    public int getFacetKind();

    /**
     * Values of this facet. 
     */
    public StringList getLexicalFacetValues();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
    public XSObjectList getAnnotations();
    
    /*
     * Added for XML Schema 1.1, assertions
     */
    public Vector getAsserts();

}
