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

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateStageResult JSON Unmarshaller
 */
public class CreateStageResultJsonUnmarshaller implements
        Unmarshaller<CreateStageResult, JsonUnmarshallerContext> {

    public CreateStageResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateStageResult createStageResult = new CreateStageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("deploymentId", targetDepth)) {
                    context.nextToken();
                    createStageResult.setDeploymentId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("clientCertificateId", targetDepth)) {
                    context.nextToken();
                    createStageResult
                            .setClientCertificateId(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("stageName", targetDepth)) {
                    context.nextToken();
                    createStageResult.setStageName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createStageResult.setDescription(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("cacheClusterEnabled", targetDepth)) {
                    context.nextToken();
                    createStageResult
                            .setCacheClusterEnabled(BooleanJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("cacheClusterSize", targetDepth)) {
                    context.nextToken();
                    createStageResult
                            .setCacheClusterSize(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("cacheClusterStatus", targetDepth)) {
                    context.nextToken();
                    createStageResult
                            .setCacheClusterStatus(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("methodSettings", targetDepth)) {
                    context.nextToken();
                    createStageResult
                            .setMethodSettings(new MapUnmarshaller<String, MethodSetting>(
                                    StringJsonUnmarshaller.getInstance(),
                                    MethodSettingJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("variables", targetDepth)) {
                    context.nextToken();
                    createStageResult
                            .setVariables(new MapUnmarshaller<String, String>(
                                    StringJsonUnmarshaller.getInstance(),
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    createStageResult.setCreatedDate(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    createStageResult.setLastUpdatedDate(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createStageResult;
    }

    private static CreateStageResultJsonUnmarshaller instance;

    public static CreateStageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateStageResultJsonUnmarshaller();
        return instance;
    }
}
