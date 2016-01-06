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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricGranularityType StAX Unmarshaller
 */
public class MetricGranularityTypeStaxUnmarshaller implements
        Unmarshaller<MetricGranularityType, StaxUnmarshallerContext> {

    public MetricGranularityType unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        MetricGranularityType metricGranularityType = new MetricGranularityType();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricGranularityType;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Granularity", targetDepth)) {
                    metricGranularityType.setGranularity(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricGranularityType;
                }
            }
        }
    }

    private static MetricGranularityTypeStaxUnmarshaller instance;

    public static MetricGranularityTypeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricGranularityTypeStaxUnmarshaller();
        return instance;
    }
}
