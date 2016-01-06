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

package com.amazonaws.services.config.model;

/**
 * 
 */
public enum ConfigurationItemStatus {

    Ok("Ok"),
    Failed("Failed"),
    Discovered("Discovered"),
    Deleted("Deleted");

    private String value;

    private ConfigurationItemStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ConfigurationItemStatus corresponding to the value
     */
    public static ConfigurationItemStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Ok".equals(value)) {
            return Ok;
        } else if ("Failed".equals(value)) {
            return Failed;
        } else if ("Discovered".equals(value)) {
            return Discovered;
        } else if ("Deleted".equals(value)) {
            return Deleted;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}