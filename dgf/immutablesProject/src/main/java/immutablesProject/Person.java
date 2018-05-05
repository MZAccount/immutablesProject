package main.java.immutablesProject;

import org.immutables.value.Value;
@Value.Immutable
public abstract class Person {
 
    abstract String getName();
 
    @Value.Default
    Integer getAge() {
        return 42;
    }
}