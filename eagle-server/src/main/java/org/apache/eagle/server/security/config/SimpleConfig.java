/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.eagle.server.security.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SimpleConfig {
    private List<UserAccount> accounts;

    @JsonProperty("accounts")
    public List<UserAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<UserAccount> accounts) {
        this.accounts = accounts;
    }

//    private String username = null;
//    private String password = null;
//
//    @JsonProperty
//    public String getUsername() {
//        return username;
//    }
//
//    @JsonProperty
//    public SimpleConfig setUsername(String username) {
//        this.username = username;
//        return this;
//    }
//
//    @JsonProperty
//    public String getPassword() {
//        return password;
//    }
//
//    @JsonProperty
//    public SimpleConfig setPassword(String password) {
//        this.password = password;
//        return this;
//    }
}