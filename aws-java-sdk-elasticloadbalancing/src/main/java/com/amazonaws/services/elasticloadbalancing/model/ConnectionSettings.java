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
 * Information about the <code>ConnectionSettings</code> attribute.
 * </p>
 */
public class ConnectionSettings implements Serializable, Cloneable {

    /**
     * The time, in seconds, that the connection is allowed to be idle (no
     * data has been sent over the connection) before it is closed by the
     * load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     */
    private Integer idleTimeout;

    /**
     * The time, in seconds, that the connection is allowed to be idle (no
     * data has been sent over the connection) before it is closed by the
     * load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @return The time, in seconds, that the connection is allowed to be idle (no
     *         data has been sent over the connection) before it is closed by the
     *         load balancer.
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }
    
    /**
     * The time, in seconds, that the connection is allowed to be idle (no
     * data has been sent over the connection) before it is closed by the
     * load balancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @param idleTimeout The time, in seconds, that the connection is allowed to be idle (no
     *         data has been sent over the connection) before it is closed by the
     *         load balancer.
     */
    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }
    
    /**
     * The time, in seconds, that the connection is allowed to be idle (no
     * data has been sent over the connection) before it is closed by the
     * load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @param idleTimeout The time, in seconds, that the connection is allowed to be idle (no
     *         data has been sent over the connection) before it is closed by the
     *         load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectionSettings withIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
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
        if (getIdleTimeout() != null) sb.append("IdleTimeout: " + getIdleTimeout() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdleTimeout() == null) ? 0 : getIdleTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConnectionSettings == false) return false;
        ConnectionSettings other = (ConnectionSettings)obj;
        
        if (other.getIdleTimeout() == null ^ this.getIdleTimeout() == null) return false;
        if (other.getIdleTimeout() != null && other.getIdleTimeout().equals(this.getIdleTimeout()) == false) return false; 
        return true;
    }
    
    @Override
    public ConnectionSettings clone() {
        try {
            return (ConnectionSettings) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    