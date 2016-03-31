package org.rosesquared.groovybot

import groovy.util.*

class Config {
    static env = System.getProperty("env") ?: "prod"
    static props = new ConfigSlurper(env).parse(Config.class.classLoader.getResource("app.conf")) 
}