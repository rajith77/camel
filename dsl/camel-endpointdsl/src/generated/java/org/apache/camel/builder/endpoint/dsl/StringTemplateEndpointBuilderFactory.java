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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transform messages using StringTemplate engine.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StringTemplateEndpointBuilderFactory {


    /**
     * Builder for endpoint for the String Template component.
     */
    public interface StringTemplateEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder allowContextMapAll(
                boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowContextMapAll the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder allowContextMapAll(
                String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder allowTemplateFromHeader(
                boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowTemplateFromHeader the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder allowTemplateFromHeader(
                String allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * The variable start delimiter.
         * 
         * The option is a: &lt;code&gt;char&lt;/code&gt; type.
         * 
         * Default: &amp;lt;
         * Group: producer
         * 
         * @param delimiterStart the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder delimiterStart(char delimiterStart) {
            doSetProperty("delimiterStart", delimiterStart);
            return this;
        }
        /**
         * The variable start delimiter.
         * 
         * The option will be converted to a &lt;code&gt;char&lt;/code&gt; type.
         * 
         * Default: &amp;lt;
         * Group: producer
         * 
         * @param delimiterStart the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder delimiterStart(
                String delimiterStart) {
            doSetProperty("delimiterStart", delimiterStart);
            return this;
        }
        /**
         * The variable end delimiter.
         * 
         * The option is a: &lt;code&gt;char&lt;/code&gt; type.
         * 
         * Default: &amp;gt;
         * Group: producer
         * 
         * @param delimiterStop the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder delimiterStop(char delimiterStop) {
            doSetProperty("delimiterStop", delimiterStop);
            return this;
        }
        /**
         * The variable end delimiter.
         * 
         * The option will be converted to a &lt;code&gt;char&lt;/code&gt; type.
         * 
         * Default: &amp;gt;
         * Group: producer
         * 
         * @param delimiterStop the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder delimiterStop(String delimiterStop) {
            doSetProperty("delimiterStop", delimiterStop);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface StringTemplateBuilders {
        /**
         * String Template (camel-stringtemplate)
         * Transform messages using StringTemplate engine.
         * 
         * Category: transformation,script
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-stringtemplate
         * 
         * Syntax: <code>string-template:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder stringTemplate(String path) {
            return StringTemplateEndpointBuilderFactory.endpointBuilder("string-template", path);
        }
        /**
         * String Template (camel-stringtemplate)
         * Transform messages using StringTemplate engine.
         * 
         * Category: transformation,script
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-stringtemplate
         * 
         * Syntax: <code>string-template:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default StringTemplateEndpointBuilder stringTemplate(
                String componentName,
                String path) {
            return StringTemplateEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static StringTemplateEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class StringTemplateEndpointBuilderImpl extends AbstractEndpointBuilder implements StringTemplateEndpointBuilder {
            public StringTemplateEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new StringTemplateEndpointBuilderImpl(path);
    }
}