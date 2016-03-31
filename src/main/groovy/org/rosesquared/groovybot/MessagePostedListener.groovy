package org.rosesquared.groovybot

import com.ullink.slack.simpleslackapi.*
import com.ullink.slack.simpleslackapi.events.*
import com.ullink.slack.simpleslackapi.listeners.*

class MessagePostedListener implements SlackMessagePostedListener {
    void onEvent(SlackMessagePosted event, SlackSession session) {
        println "onEvent ..."
    }
}