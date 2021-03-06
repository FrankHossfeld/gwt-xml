/*
 * Copyright © 2020 The GWT Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.xml.client;

/**
 * This interface represents entity references, such as <code>&amp;foo;</code>. It is unlikely that
 * any will be encountered in practice, because it is a parse error to have an unresolved entity
 * reference in a document, and resolved ones are replaced with their definitions.
 */
public interface EntityReference extends Node {}
