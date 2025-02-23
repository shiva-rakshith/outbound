package com.uci.outbound.consumers;

import com.uci.adapter.provider.factory.ProviderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RestController
public class OutboundMessageConsumer {

    @Autowired
    private ProviderFactory factoryProvider;

//    @KafkaListener(id = "gsbmb", topics = "outbound")
//    public void consumeMessage(String message) throws Exception {
//        log.info("Outbound Message rec: {}", message);
//        XMessage currentXmsg = XMessageParser.parse(new ByteArrayInputStream(message.getBytes()));
//
//        String channel = currentXmsg.getChannelURI();
//        String provider = currentXmsg.getProviderURI();
//
//        log.info("next msg {}", currentXmsg.getPayload().getText());
//        IProvider iprovider = factoryProvider.getProvider(provider, channel);
//        iprovider.processOutBoundMessage(currentXmsg);
//    }
//
//    @KafkaListener(id = "broadcast", topics = "broadcast")
//    public void consumeMessageBroadcast(String message) throws Exception {
//        log.info("Broadcast Message rec: {}", message);
//        XMessage currentXmsg = XMessageParser.parse(new ByteArrayInputStream(message.getBytes()));
//
//        String channel = currentXmsg.getChannelURI();
//        String provider = currentXmsg.getProviderURI();
//
//        log.info("next msg {}", currentXmsg.getPayload().getText());
//        IProvider iprovider = factoryProvider.getProvider(provider, channel);
//        iprovider.processOutBoundMessage(currentXmsg);
//    }
}
