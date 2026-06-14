package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f31802b;

    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f31802b = list;
    }

    public List<Component<?>> getComponentsInCycle() {
        return this.f31802b;
    }
}
