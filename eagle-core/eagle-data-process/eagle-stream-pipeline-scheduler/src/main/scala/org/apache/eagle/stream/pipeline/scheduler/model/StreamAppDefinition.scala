/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.eagle.stream.pipeline.scheduler.model

import org.apache.eagle.stream.scheduler.entity.AppDefinitionEntity

case class StreamAppDefinition(site: String, name: String, definition: String, configuration: String, description: String,
  creator: String, executionStatus: String, executionCluster: Seq[String], updateTimestamp: Long, createTimestamp: Long)
  extends EntityConversion[AppDefinitionEntity]{
  override def toEntity: AppDefinitionEntity = AppDefinitionEntity.fromModel(this)
  override def fromEntity(m: AppDefinitionEntity): Unit = AppDefinitionEntity.toModel(m)
}