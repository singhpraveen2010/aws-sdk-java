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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a <a>GetTemplate</a> action.
 * </p>
 */
public class GetTemplateRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>Running stacks: You can specify either the stack's name or its unique
     * stack ID.</li>
     * <li>Deleted stacks: You must specify the unique stack ID.</li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>Running stacks: You can specify either the stack's name or its unique
     * stack ID.</li>
     * <li>Deleted stacks: You must specify the unique stack ID.</li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack,
     *        which are not always interchangeable:</p>
     *        <ul>
     *        <li>Running stacks: You can specify either the stack's name or its
     *        unique stack ID.</li>
     *        <li>Deleted stacks: You must specify the unique stack ID.</li>
     *        </ul>
     *        <p>
     *        Default: There is no default value.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>Running stacks: You can specify either the stack's name or its unique
     * stack ID.</li>
     * <li>Deleted stacks: You must specify the unique stack ID.</li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @return The name or the unique stack ID that is associated with the
     *         stack, which are not always interchangeable:</p>
     *         <ul>
     *         <li>Running stacks: You can specify either the stack's name or
     *         its unique stack ID.</li>
     *         <li>Deleted stacks: You must specify the unique stack ID.</li>
     *         </ul>
     *         <p>
     *         Default: There is no default value.
     */
    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>Running stacks: You can specify either the stack's name or its unique
     * stack ID.</li>
     * <li>Deleted stacks: You must specify the unique stack ID.</li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack,
     *        which are not always interchangeable:</p>
     *        <ul>
     *        <li>Running stacks: You can specify either the stack's name or its
     *        unique stack ID.</li>
     *        <li>Deleted stacks: You must specify the unique stack ID.</li>
     *        </ul>
     *        <p>
     *        Default: There is no default value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetTemplateRequest withStackName(String stackName) {
        setStackName(stackName);
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateRequest == false)
            return false;
        GetTemplateRequest other = (GetTemplateRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateRequest clone() {
        return (GetTemplateRequest) super.clone();
    }
}