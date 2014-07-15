/**
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
package org.apache.camel.component.rest;

import org.apache.camel.CamelContext;
import org.apache.camel.model.TransformDefinition;
import org.apache.camel.model.rest.PathDefinition;
import org.apache.camel.model.rest.RestDefinition;

import static org.apache.camel.spring.processor.SpringTestHelper.createSpringCamelContext;

public class SpringFromRestGetEmbeddedRouteTest extends FromRestGetTest {

    @Override
    protected int getExpectedNumberOfRoutes() {
        return 3;
    }

    public void testFromRestModel() throws Exception {
        assertEquals(getExpectedNumberOfRoutes(), context.getRoutes().size());

        RestDefinition rest = context.getRestDefinitions().get(0);
        assertNotNull(rest);

        // we should have a hello and bye route
        assertNotNull(context.getRouteDefinition("hello"));
        assertNotNull(context.getRouteDefinition("bye"));

        PathDefinition path = rest.getPaths().get(0);
        assertNotNull(0);
        assertEquals("/say", path.getUri());

        assertEquals("/hello", path.getVerbs().get(0).getUri());
        assertIsInstanceOf(TransformDefinition.class, path.getVerbs().get(1).getOutputs().get(0));

        assertEquals("/bye", path.getVerbs().get(1).getUri());
        assertEquals("application/json", path.getVerbs().get(1).getAccept());

        assertEquals(null, path.getVerbs().get(2).getUri());

        // the rest becomes routes and the input is a seda endpoint created by the DummyRestConsumerFactory

        getMockEndpoint("mock:update").expectedMessageCount(1);
        template.sendBody("seda:post-say", "I was here");
        assertMockEndpointsSatisfied();

        String out = template.requestBody("seda:get-say-hello", "Me", String.class);
        assertEquals("Hello World", out);
        String out2 = template.requestBody("seda:get-say-bye", "Me", String.class);
        assertEquals("Bye World", out2);
    }

    protected CamelContext createCamelContext() throws Exception {
        return createSpringCamelContext(this, "org/apache/camel/component/rest/SpringFromRestGetEmbeddedRouteTest.xml");
    }

}
