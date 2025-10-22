package designPatterns;

import designPatterns.abstractFactoryPattern.abstractFactoryMain
import designPatterns.factoryPattern.factoryMain
import designPatterns.facade.facadeMain
import designPatterns.observer.observerMain
import designPatterns.singleton.singletonMain
import designPatterns.strategyPattern.strategyMain
import designPatterns.visitor.visitorMain
import designPatterns.proxy.proxyMain
import designPatterns.builder.builderMain


fun main() {
    // Factory Pattern
    factoryMain()

    // Abstract Factory Pattern
    abstractFactoryMain()

    // Facade Pattern
    facadeMain()

    // Singleton Pattern
    singletonMain()

    // Strategy Pattern
    strategyMain()

    // Observer Pattern
    observerMain()

    // Visitor Pattern
    visitorMain()

    // Proxy Main
    proxyMain()

    // Builder Main
    builderMain()
}