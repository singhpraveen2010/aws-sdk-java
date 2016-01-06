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

package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>DeletePipelineRequest</code> structure.
 * </p>
 */
public class DeletePipelineRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the pipeline that you want to delete.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The identifier of the pipeline that you want to delete.
     * </p>
     * 
     * @param id
     *        The identifier of the pipeline that you want to delete.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the pipeline that you want to delete.
     * </p>
     * 
     * @return The identifier of the pipeline that you want to delete.
     */
    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the pipeline that you want to delete.
     * </p>
     * 
     * @param id
     *        The identifier of the pipeline that you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeletePipelineRequest withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePipelineRequest == false)
            return false;
        DeletePipelineRequest other = (DeletePipelineRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePipelineRequest clone() {
        return (DeletePipelineRequest) super.clone();
    }
}