package com.framework.authority.config;

import static java.util.Collections.singletonList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * Created by zhang_jian3 on 2016/11/8.
 */
@Configuration
public class MongoDBConfig extends AbstractMongoConfiguration {

    @Override
    public String getDatabaseName() {
        return "authority";
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient(singletonList(new ServerAddress("10.30.10.16", 27017)),
            singletonList(MongoCredential.createCredential("abc", "authority", "123".toCharArray())));
    }

//    @Override
//    @Bean
//    public MappingMongoConverter mappingMongoConverter() throws Exception {
//        DefaultDbRefResolver dbRefResolver = new DefaultDbRefResolver(this.mongoDbFactory());
//        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, this.mongoMappingContext());
//        converter.setCustomConversions(this.cx   ustomConversions());
//        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
//        return converter;
//    }

    // @Bean
    // public MongoClient mongoClient() {
    // MongoClient mongoClient = new MongoClient(new ServerAddress("10.30.10.16", 27017), getConfOptions());
    // return mongoClient;
    // }
    //
    // @Bean
    // public MongoDbFactory mongoDbFactory() {
    // String database = new MongoClientURI("mongodb://abc:123@10.30.10.16:27017/authority").getDatabase();
    // return new SimpleMongoDbFactory(mongoClient(), database);
    // }
    //
    // @Bean
    // public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) throws Exception {
    // return new MongoTemplate(mongoDbFactory);
    // }
    //
    // private MongoClientOptions getConfOptions() {
    // return new MongoClientOptions.Builder().socketKeepAlive(true) // 是否保持长链接
    // .connectTimeout(5000) // 链接超时时间
    // .socketTimeout(5000) // read数据超时时间
    // .readPreference(ReadPreference.primary()) // 最近优先策略
    // .connectionsPerHost(30) // 每个地址最大请求数
    // .maxWaitTime(1000 * 60 * 2) // 长链接的最大等待时间
    // .threadsAllowedToBlockForConnectionMultiplier(50) // 一个socket最大的等待请求数
    // .build();
    // }
}
