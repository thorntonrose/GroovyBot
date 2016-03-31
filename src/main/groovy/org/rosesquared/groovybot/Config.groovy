package org.rosesquared.groovybot

import groovy.util.*

class Config {
    static env = System.getProperty("env") ?: "prod"
    static props = new ConfigSlurper(env).parse(Config.class.classLoader.getResource("app.conf"))

    static {
        def userPropsFile = new File(System.getProperty("user.home") + "/groovybot.conf")

        if (userPropsFile.exists()) {
            props.merge new ConfigSlurper().parse(userPropsFile.text)
        }
    }
}