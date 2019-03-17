package com.yao.serialization;

import com.google.protobuf.InvalidProtocolBufferException;

public class TestProtoBuf {

    public static void main(String[]args) throws InvalidProtocolBufferException {

        PersonProtos.Person.Builder personBuilder =  PersonProtos.Person.newBuilder();
        personBuilder.setId(111);
        personBuilder.setEmail("xx@xx");
        personBuilder.setName("wanger");

        PersonProtos.Person person = personBuilder.build();

        byte[] bytes = person.toByteArray();
        PersonProtos.Person result = PersonProtos.Person.parseFrom(bytes);
        System.out.println(result.getId());
        System.out.println(result.getEmail());
        System.out.println(result.getName());

    }

}
