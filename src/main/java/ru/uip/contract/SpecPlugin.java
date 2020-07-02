package ru.uip.contract;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SpecPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project
                .task("generate-api-spec")
                .doLast(task -> System.out.println("Hello Gradle!"));
    }
}