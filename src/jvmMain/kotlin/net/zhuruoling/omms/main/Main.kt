package net.zhuruoling.omms.main

import net.zhuruoling.omms.ui.loginWindowMain
import org.slf4j.LoggerFactory
import java.lang.management.ManagementFactory

private val logger = LoggerFactory.getLogger("Main")

fun main(){
    logger.info("Hello World!")
    val os = ManagementFactory.getOperatingSystemMXBean()
    val runtime = ManagementFactory.getRuntimeMXBean()
    logger.info(String.format("OMMS Connect Desktop is running on %s %s %s at pid %d.",os.name, os.arch, os.version, runtime.pid))
    logger.info("Starting OMMS Connect Desktop.")
    loginWindowMain()
}
