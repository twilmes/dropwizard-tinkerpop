package com.experoinc.dropwizard.tinkerpop.serializers;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.tinkerpop.gremlin.driver.MessageSerializer;
import org.apache.tinkerpop.gremlin.driver.ser.GraphSONMessageSerializerV2d0;

/**
 * @author Ted Wilmes
 */
@JsonTypeName("graphSONMessageSerializerV2d0")
public class GraphSONMessageSerializerV2d0Factory implements MessageSerializerFactory {

    @Override
    public MessageSerializer build() {
        GraphSONMessageSerializerV2d0 serializer = new GraphSONMessageSerializerV2d0();
        return serializer;
    }
}