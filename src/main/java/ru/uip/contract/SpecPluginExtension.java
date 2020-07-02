package ru.uip.contract;

import lombok.*;
import org.gradle.api.file.ConfigurableFileCollection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class SpecPluginExtension {
    private String apiSpec = "src/main/api/api.yaml";
    private Map<String, List<String>> operationContracts = new HashMap<>();
}
