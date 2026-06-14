package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class RestrictedComponentContainer implements ComponentContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f31817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f31818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f31819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f31820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f31821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f31822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ComponentContainer f31823g;

    private static class RestrictedPublisher implements Publisher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f31824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Publisher f31825b;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.f31824a = set;
            this.f31825b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(Event<?> event) {
            if (!this.f31824a.contains(event.getType())) {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
            }
            this.f31825b.publish(event);
        }
    }

    RestrictedComponentContainer(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Qualified.unqualified(Publisher.class));
        }
        this.f31817a = DesugarCollections.unmodifiableSet(hashSet);
        this.f31818b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f31819c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f31820d = DesugarCollections.unmodifiableSet(hashSet4);
        this.f31821e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f31822f = component.getPublishedEvents();
        this.f31823g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        if (!this.f31817a.contains(Qualified.unqualified(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f31823g.get(cls);
        return !cls.equals(Publisher.class) ? t10 : (T) new RestrictedPublisher(this.f31822f, (Publisher) t10);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Class<T> cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Class<T> cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        return f.f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        if (this.f31819c.contains(qualified)) {
            return this.f31823g.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Qualified<T> qualified) {
        if (this.f31818b.contains(qualified)) {
            return this.f31823g.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Qualified<T> qualified) {
        if (this.f31820d.contains(qualified)) {
            return this.f31823g.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        if (this.f31821e.contains(qualified)) {
            return this.f31823g.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Qualified<T> qualified) {
        if (this.f31817a.contains(qualified)) {
            return (T) this.f31823g.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }
}
