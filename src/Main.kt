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
import designPatterns.composite.compositeMain


fun main() {

    factoryMain()
    abstractFactoryMain()
    facadeMain()
    singletonMain()
    strategyMain()
    observerMain()
    visitorMain()
    proxyMain()
    builderMain()
    compositeMain()

}