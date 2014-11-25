package com.github.rexyotta.gradle_vertx_plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class VertxTask extends DefaultTask{
  @TaskAction
  def vertx(){
    println '=>>>>>>>>>>>>>>>>>> vertx'
  }
}
