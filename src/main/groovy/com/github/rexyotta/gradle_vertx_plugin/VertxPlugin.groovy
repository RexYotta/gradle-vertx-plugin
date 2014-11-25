package com.github.rexyotta.gradle_vertx_plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class VertxPlugin implements Plugin<Project>{

  void apply(Project project) {
    project.extensions.create('vertx', VertxPluginExtension)

    def action = { task ->
      //prepare the task, eg. config"
    }

    project.tasks.create 'vertx', VertxTask.class, action
  }
}
