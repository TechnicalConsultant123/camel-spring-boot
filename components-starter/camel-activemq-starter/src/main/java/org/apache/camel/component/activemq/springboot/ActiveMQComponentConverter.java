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
package org.apache.camel.component.activemq.springboot;

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
public class ActiveMQComponentConverter
        implements
            org.springframework.core.convert.converter.GenericConverter {

    private final CamelContext camelContext;

    public ActiveMQComponentConverter(org.apache.camel.CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    public Set<ConvertiblePair> getConvertibleTypes() {
        Set<ConvertiblePair> answer = new LinkedHashSet<>();
        answer.add(new ConvertiblePair(String.class, javax.jms.ConnectionFactory.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.core.task.TaskExecutor.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.JmsConfiguration.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.jms.support.destination.DestinationResolver.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.util.ErrorHandler.class));
        answer.add(new ConvertiblePair(String.class, javax.jms.ExceptionListener.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.jms.support.converter.MessageConverter.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.MessageCreatedStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.MessageListenerContainerFactory.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.component.jms.QueueBrowseStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.apache.camel.spi.HeaderFilterStrategy.class));
        answer.add(new ConvertiblePair(String.class, org.springframework.transaction.PlatformTransactionManager.class));
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
            case "javax.jms.ConnectionFactory": return camelContext.getRegistry().lookupByNameAndType(ref, javax.jms.ConnectionFactory.class);
            case "org.springframework.core.task.TaskExecutor": return camelContext.getRegistry().lookupByNameAndType(ref, org.springframework.core.task.TaskExecutor.class);
            case "org.apache.camel.component.jms.JmsConfiguration": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.jms.JmsConfiguration.class);
            case "org.springframework.jms.support.destination.DestinationResolver": return camelContext.getRegistry().lookupByNameAndType(ref, org.springframework.jms.support.destination.DestinationResolver.class);
            case "org.springframework.util.ErrorHandler": return camelContext.getRegistry().lookupByNameAndType(ref, org.springframework.util.ErrorHandler.class);
            case "javax.jms.ExceptionListener": return camelContext.getRegistry().lookupByNameAndType(ref, javax.jms.ExceptionListener.class);
            case "org.springframework.jms.support.converter.MessageConverter": return camelContext.getRegistry().lookupByNameAndType(ref, org.springframework.jms.support.converter.MessageConverter.class);
            case "org.apache.camel.component.jms.MessageCreatedStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.jms.MessageCreatedStrategy.class);
            case "org.apache.camel.component.jms.MessageListenerContainerFactory": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.jms.MessageListenerContainerFactory.class);
            case "org.apache.camel.component.jms.QueueBrowseStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.component.jms.QueueBrowseStrategy.class);
            case "org.apache.camel.spi.HeaderFilterStrategy": return camelContext.getRegistry().lookupByNameAndType(ref, org.apache.camel.spi.HeaderFilterStrategy.class);
            case "org.springframework.transaction.PlatformTransactionManager": return camelContext.getRegistry().lookupByNameAndType(ref, org.springframework.transaction.PlatformTransactionManager.class);
        }
        return null;
    }
}