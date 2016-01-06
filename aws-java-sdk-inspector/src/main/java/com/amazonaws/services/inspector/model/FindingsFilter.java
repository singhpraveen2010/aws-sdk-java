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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a request parameter in the <a>ListFindings</a>
 * action.
 * </p>
 */
public class FindingsFilter implements Serializable, Cloneable {

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * </p>
     */
    private java.util.List<String> rulesPackageArns;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>ruleName</b>
     * property of the <a>Finding</a> data type.
     * </p>
     */
    private java.util.List<String> ruleNames;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>severity</b>
     * property of the <a>Finding</a> data type.
     * </p>
     */
    private java.util.List<String> severities;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>attributes</b>
     * property of the <a>Finding</a> data type.
     * </p>
     */
    private java.util.List<Attribute> attributes;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>userAttributes</b> property of the <a>Finding</a> data type.
     * </p>
     */
    private java.util.List<Attribute> userAttributes;

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     */
    public java.util.List<String> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param rulesPackageArns
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     */
    public void setRulesPackageArns(
            java.util.Collection<String> rulesPackageArns) {
        if (rulesPackageArns == null) {
            this.rulesPackageArns = null;
            return;
        }

        this.rulesPackageArns = new java.util.ArrayList<String>(
                rulesPackageArns);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRulesPackageArns(java.util.Collection)} or
     * {@link #withRulesPackageArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rulesPackageArns
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withRulesPackageArns(String... rulesPackageArns) {
        if (this.rulesPackageArns == null) {
            setRulesPackageArns(new java.util.ArrayList<String>(
                    rulesPackageArns.length));
        }
        for (String ele : rulesPackageArns) {
            this.rulesPackageArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param rulesPackageArns
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>rulesPackageArn</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withRulesPackageArns(
            java.util.Collection<String> rulesPackageArns) {
        setRulesPackageArns(rulesPackageArns);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>ruleName</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>ruleName</b> property of the <a>Finding</a> data type.
     */
    public java.util.List<String> getRuleNames() {
        return ruleNames;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>ruleName</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param ruleNames
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>ruleName</b> property of the <a>Finding</a> data type.
     */
    public void setRuleNames(java.util.Collection<String> ruleNames) {
        if (ruleNames == null) {
            this.ruleNames = null;
            return;
        }

        this.ruleNames = new java.util.ArrayList<String>(ruleNames);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>ruleName</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRuleNames(java.util.Collection)} or
     * {@link #withRuleNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ruleNames
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>ruleName</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withRuleNames(String... ruleNames) {
        if (this.ruleNames == null) {
            setRuleNames(new java.util.ArrayList<String>(ruleNames.length));
        }
        for (String ele : ruleNames) {
            this.ruleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>ruleName</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param ruleNames
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>ruleName</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withRuleNames(java.util.Collection<String> ruleNames) {
        setRuleNames(ruleNames);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>severity</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>severity</b> property of the <a>Finding</a> data type.
     */
    public java.util.List<String> getSeverities() {
        return severities;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>severity</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param severities
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>severity</b> property of the <a>Finding</a> data type.
     */
    public void setSeverities(java.util.Collection<String> severities) {
        if (severities == null) {
            this.severities = null;
            return;
        }

        this.severities = new java.util.ArrayList<String>(severities);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>severity</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSeverities(java.util.Collection)} or
     * {@link #withSeverities(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param severities
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>severity</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withSeverities(String... severities) {
        if (this.severities == null) {
            setSeverities(new java.util.ArrayList<String>(severities.length));
        }
        for (String ele : severities) {
            this.severities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>severity</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param severities
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>severity</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withSeverities(java.util.Collection<String> severities) {
        setSeverities(severities);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>attributes</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>attributes</b> property of the <a>Finding</a> data type.
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>attributes</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param attributes
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>attributes</b> property of the <a>Finding</a> data type.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>attributes</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttributes(java.util.Collection)} or
     * {@link #withAttributes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param attributes
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>attributes</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>attributes</b>
     * property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param attributes
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>attributes</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withAttributes(
            java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>userAttributes</b> property of the <a>Finding</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>userAttributes</b> property of the <a>Finding</a> data type.
     */
    public java.util.List<Attribute> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>userAttributes</b> property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param userAttributes
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>userAttributes</b> property of the <a>Finding</a> data type.
     */
    public void setUserAttributes(java.util.Collection<Attribute> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<Attribute>(userAttributes);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>userAttributes</b> property of the <a>Finding</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserAttributes(java.util.Collection)} or
     * {@link #withUserAttributes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userAttributes
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>userAttributes</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withUserAttributes(Attribute... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<Attribute>(
                    userAttributes.length));
        }
        for (Attribute ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the
     * <b>userAttributes</b> property of the <a>Finding</a> data type.
     * </p>
     * 
     * @param userAttributes
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>userAttributes</b> property of the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FindingsFilter withUserAttributes(
            java.util.Collection<Attribute> userAttributes) {
        setUserAttributes(userAttributes);
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
        if (getRulesPackageArns() != null)
            sb.append("RulesPackageArns: " + getRulesPackageArns() + ",");
        if (getRuleNames() != null)
            sb.append("RuleNames: " + getRuleNames() + ",");
        if (getSeverities() != null)
            sb.append("Severities: " + getSeverities() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingsFilter == false)
            return false;
        FindingsFilter other = (FindingsFilter) obj;
        if (other.getRulesPackageArns() == null
                ^ this.getRulesPackageArns() == null)
            return false;
        if (other.getRulesPackageArns() != null
                && other.getRulesPackageArns().equals(
                        this.getRulesPackageArns()) == false)
            return false;
        if (other.getRuleNames() == null ^ this.getRuleNames() == null)
            return false;
        if (other.getRuleNames() != null
                && other.getRuleNames().equals(this.getRuleNames()) == false)
            return false;
        if (other.getSeverities() == null ^ this.getSeverities() == null)
            return false;
        if (other.getSeverities() != null
                && other.getSeverities().equals(this.getSeverities()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUserAttributes() == null
                ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRulesPackageArns() == null) ? 0 : getRulesPackageArns()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRuleNames() == null) ? 0 : getRuleNames().hashCode());
        hashCode = prime * hashCode
                + ((getSeverities() == null) ? 0 : getSeverities().hashCode());
        hashCode = prime * hashCode
                + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public FindingsFilter clone() {
        try {
            return (FindingsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}