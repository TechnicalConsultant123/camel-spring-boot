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
package org.apache.camel.component.netty.http.springboot;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.CamelContext;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

/**
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
public class NettyHttpComponentConverter
        implements
            org.springframework.core.convert.converter.GenericConverter {

    private final CamelContext camelContext;

    public NettyHttpComponentConverter(
            org.apache.camel.CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    public Set<ConvertiblePair> getConvertibleTypes() {
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.NettyConfiguration.class));
        answer.add(new ConvertiblePair(String.class, io.netty.channel.EventLoopGroup.class));
        answer.add(new ConvertiblePair(String.class, io.netty.util.concurrent.EventExecutorGroup.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.NettyServerBootstrapFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.ServerInitializerFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.ClientInitializerFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class));
        answer.add(new ConvertiblePair(String.class, io.netty.channel.group.ChannelGroup.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.spi.HeaderFilterStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.http.NettyHttpBinding.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.support.jsse.SSLContextParameters.class));
        answer.add(new ConvertiblePair(String.class, io.netty.handler.ssl.SslHandler.class));
        return answer;
    }

    public Object convert(
            Object source,
            TypeDescriptor sourceType,
            TypeDescriptor targetType) {
        if (source == null) {
            return null;
        }
        String ref = source.toString();
        if (!ref.startsWith("#")) {
            return null;
        }
        ref = ref.startsWith("#bean:") ? ref.substring(6) : ref.substring(1);
        switch (targetType.getName()) {
            case "org.apache.camel.component.netty.NettyConfiguration": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.NettyConfiguration.class);
            case "io.netty.channel.EventLoopGroup": return camelContext.getRegistry().lookupByNameAndType(ref, io.netty.channel.EventLoopGroup.class);
            case "io.netty.util.concurrent.EventExecutorGroup": return camelContext.getRegistry().lookupByNameAndType(ref, io.netty.util.concurrent.EventExecutorGroup.class);
            case "org.apache.camel.component.netty.NettyServerBootstrapFactory": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.NettyServerBootstrapFactory.class);
            case "org.apache.camel.component.netty.ServerInitializerFactory": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.ServerInitializerFactory.class);
            case "org.apache.camel.component.netty.ClientInitializerFactory": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.ClientInitializerFactory.class);
            case "org.apache.camel.component.netty.NettyCamelStateCorrelationManager": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class);
            case "io.netty.channel.group.ChannelGroup": return camelContext.getRegistry().lookupByNameAndType(ref, io.netty.channel.group.ChannelGroup.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.apache.camel.component.netty.http.NettyHttpBinding": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.http.NettyHttpBinding.class);
            case "org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
            case "org.apache.camel.support.jsse.SSLContextParameters": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.support.jsse.SSLContextParameters.class);
            case "io.netty.handler.ssl.SslHandler": return camelContext.getRegistry().lookupByNameAndType(ref, io.netty.handler.ssl.SslHandler.class);
        }
        return null;
    }
}