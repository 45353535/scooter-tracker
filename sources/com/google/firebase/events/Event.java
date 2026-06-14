package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public class Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f32801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f32802b;

    public Event(Class<T> cls, T t10) {
        this.f32801a = (Class) Preconditions.checkNotNull(cls);
        this.f32802b = Preconditions.checkNotNull(t10);
    }

    public T getPayload() {
        return (T) this.f32802b;
    }

    public Class<T> getType() {
        return this.f32801a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f32801a, this.f32802b);
    }
}
