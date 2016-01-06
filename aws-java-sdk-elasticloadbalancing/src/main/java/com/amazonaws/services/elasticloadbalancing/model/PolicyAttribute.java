/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a policy attribute.
 * </p>
 */
public class PolicyAttribute implements Serializable, Cloneable {

    /**
     * The name of the attribute.
     */
    private String attributeName;

    /**
     * The value of the attribute.
     */
    private String attributeValue;

    /**
     * Default constructor for a new PolicyAttribute object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PolicyAttribute() {}
    
    /**
     * Constructs a new PolicyAttribute object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName The name of the attribute.
     * @param attributeValue The value of the attribute.
     */
    public PolicyAttribute(String attributeName, String attributeValue) {
        setAttributeName(attributeName);
        setAttributeValue(attributeValue);
    }

    /**
     * The name of the attribute.
     *
     * @return The name of the attribute.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The name of the attribute.
     *
     * @param attributeName The name of the attribute.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The name of the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The name of the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyAttribute withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * The value of the attribute.
     *
     * @return The value of the attribute.
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    
    /**
     * The value of the attribute.
     *
     * @param attributeValue The value of the attribute.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    /**
     * The value of the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValue The value of the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyAttribute withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null) sb.append("AttributeValue: " + getAttributeValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PolicyAttribute == false) return false;
        PolicyAttribute other = (PolicyAttribute)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null) return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false) return false; 
        return true;
    }
    
    @Override
    public PolicyAttribute clone() {
        try {
            return (PolicyAttribute) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    