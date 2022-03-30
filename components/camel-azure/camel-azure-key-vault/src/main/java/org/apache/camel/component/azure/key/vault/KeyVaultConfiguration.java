/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.azure.key.vault;

import org.apache.camel.RuntimeCamelException;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.camel.spi.UriPath;

@UriParams
public class KeyVaultConfiguration implements Cloneable {

    @UriPath
    private String vaultName;
    @UriParam(label = "security", secret = true)
    @Metadata(required = true)
    private String clientId;
    @UriParam(label = "security", secret = true)
    @Metadata(required = true)
    private String clientSecret;
    @UriParam(label = "security", secret = true)
    @Metadata(required = true)
    private String tenantId;
    @UriParam(label = "producer")
    private KeyVaultOperation operation = KeyVaultOperation.createSecret;

    /**
     * Vault Name to be used
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    /**
     * Client Id to be used
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Client Secret to be used
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * Tenant Id to be used
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * Operation to be performed
     */
    public KeyVaultOperation getOperation() {
        return operation;
    }

    public void setOperation(KeyVaultOperation operation) {
        this.operation = operation;
    }

    // *************************************************
    //
    // *************************************************

    public KeyVaultConfiguration copy() {
        try {
            return (KeyVaultConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeCamelException(e);
        }
    }
}
