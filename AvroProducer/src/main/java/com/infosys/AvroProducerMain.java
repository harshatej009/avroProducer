package com.infosys;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;


public class AvroProducerMain {

	public static void main(String[] args) {

		String TOPIC = "topicL";
	    //int TOTAL_RECORDS = 1000;
	    String BOOTSTRAP_SERVERS = "127.0.0.1:9092";
	    String SCHEMA_REGISTRY_URL = "http://127.0.0.1:8081";
		
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
		props.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);
		props.put(ProducerConfig.ACKS_CONFIG, "1");
		
		Employee employee=Employee.newBuilder().setEmployeeID(55).setName("David")
				.setSurname("D").setDesignation("Engineer").build();
		
		KafkaProducer<String, Employee> producer = new KafkaProducer<String, Employee>(props);
		ProducerRecord<String, Employee> record=new ProducerRecord<String, Employee>(TOPIC,employee);
		producer.send(record,new Callback() {

			@Override
			public void onCompletion(RecordMetadata metadata, Exception exception) {
				if(exception==null)
				{
					System.err.println("Message Sent");
				}
				else {
					System.err.println(exception.getMessage());
				}
				
			}});
		producer.flush();
		producer.close();
	}

}
