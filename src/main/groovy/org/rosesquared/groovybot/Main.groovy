package org.rosesquared.groovybot

import com.ullink.slack.simpleslackapi.*
import com.ullink.slack.simpleslackapi.impl.*
import org.slf4j.LoggerFactory

class Main {
    private static final log = LoggerFactory.getLogger(Main)

    static void main(String[] args) {
        log.debug "main ..."
        def slackSession = SlackSessionFactory.createWebSocketSlackSession(Config.props.slackToken)
        slackSession.addMessagePostedListener new MessagePostedListener()
        slackSession.connect()
        log.debug "main: connected"
        println "Connected."
    }
} 