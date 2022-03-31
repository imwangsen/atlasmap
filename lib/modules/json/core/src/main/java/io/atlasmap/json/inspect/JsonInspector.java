/*
 * Copyright (C) 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atlasmap.json.inspect;

import java.io.InputStream;

import io.atlasmap.json.v2.JsonDocument;

/**
 * The JSON inspector.
 * @see JsonInstanceInspector
 * @see JsonSchemaInspector
 */
public interface JsonInspector {

    /**
     * Inspects a JSON schema/instance.
     * @param inspectee inspectee
     * @return inspected
     * @throws JsonInspectionException invalid JSON data
     */
    JsonDocument inspect(InputStream inspectee) throws JsonInspectionException;

}
