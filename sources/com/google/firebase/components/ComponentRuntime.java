package com.google.firebase.components;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Provider f31781i = new Provider() { // from class: com.google.firebase.components.j
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f31784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f31785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f31786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EventBus f31787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f31788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ComponentRegistrarProcessor f31789h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f31790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f31791b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f31792c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ComponentRegistrarProcessor f31793d = ComponentRegistrarProcessor.NOOP;

        Builder(Executor executor) {
            this.f31790a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @CanIgnoreReturnValue
        public Builder addComponent(Component<?> component) {
            this.f31792c.add(component);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.f31791b.add(new Provider() { // from class: com.google.firebase.components.n
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.Builder.a(componentRegistrar);
                }
            });
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.f31791b.addAll(collection);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.f31790a, this.f31791b, this.f31792c, this.f31793d);
        }

        @CanIgnoreReturnValue
        public Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.f31793d = componentRegistrarProcessor;
            return this;
        }
    }

    public static /* synthetic */ Object a(ComponentRuntime componentRuntime, Component component) {
        componentRuntime.getClass();
        return component.getFactory().create(new RestrictedComponentContainer(component, componentRuntime));
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    public static /* synthetic */ ComponentRegistrar c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    private void e(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f31785d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f31789h.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((Component) it2.next()).getProvidedInterfaces().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f31786e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f31786e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f31782a.isEmpty()) {
                CycleDetector.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f31782a.keySet());
                arrayList2.addAll(list);
                CycleDetector.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final Component component = (Component) it3.next();
                this.f31782a.put(component, new Lazy(new Provider() { // from class: com.google.firebase.components.k
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return ComponentRuntime.a(this.f31833a, component);
                    }
                }));
            }
            arrayList.addAll(j(list));
            arrayList.addAll(k());
            i();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        h();
    }

    private void f(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            if (component.isAlwaysEager() || (component.isEagerInDefaultApp() && z10)) {
                provider.get();
            }
        }
        this.f31787f.b();
    }

    private static List g(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void h() {
        Boolean bool = (Boolean) this.f31788g.get();
        if (bool != null) {
            f(this.f31782a, bool.booleanValue());
        }
    }

    private void i() {
        for (Component component : this.f31782a.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.f31784c.containsKey(dependency.getInterface())) {
                    this.f31784c.put(dependency.getInterface(), LazySet.b(Collections.EMPTY_SET));
                } else if (this.f31783b.containsKey(dependency.getInterface())) {
                    continue;
                } else {
                    if (dependency.isRequired()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                    }
                    if (!dependency.isSet()) {
                        this.f31783b.put(dependency.getInterface(), OptionalProvider.d());
                    }
                }
            }
        }
    }

    private List j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.isValue()) {
                final Provider provider = (Provider) this.f31782a.get(component);
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (this.f31783b.containsKey(qualified)) {
                        final OptionalProvider optionalProvider = (OptionalProvider) ((Provider) this.f31783b.get(qualified));
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                optionalProvider.f(provider);
                            }
                        });
                    } else {
                        this.f31783b.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList;
    }

    private List k() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f31782a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (!component.isValue()) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new HashSet());
                    }
                    ((Set) map.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f31784c.containsKey(entry2.getKey())) {
                final LazySet lazySet = (LazySet) this.f31784c.get(entry2.getKey());
                for (final Provider provider2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            lazySet.a(provider2);
                        }
                    });
                }
            } else {
                this.f31784c.put((Qualified) entry2.getKey(), LazySet.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private static Iterable l(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            final ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next();
            arrayList.add(new Provider() { // from class: com.google.firebase.components.i
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.c(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            try {
                if (this.f31785d.isEmpty()) {
                    return;
                }
                e(new ArrayList());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Qualified qualified) {
        return f.a(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Deferred getDeferred(Class cls) {
        return f.c(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider getProvider(Class cls) {
        return f.d(this, cls);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponentsForTests() {
        Iterator it = this.f31782a.values().iterator();
        while (it.hasNext()) {
            ((Provider) it.next()).get();
        }
    }

    public void initializeEagerComponents(boolean z10) {
        HashMap map;
        if (androidx.compose.animation.core.c.a(this.f31788g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f31782a);
            }
            f(map, z10);
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Qualified qualified) {
        return f.e(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider setOfProvider(Class cls) {
        return f.g(this, cls);
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, l(iterable), Arrays.asList(componentArr), ComponentRegistrarProcessor.NOOP);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Class cls) {
        return f.b(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        Provider<T> provider = getProvider(qualified);
        return provider == null ? OptionalProvider.d() : provider instanceof OptionalProvider ? (OptionalProvider) provider : OptionalProvider.e(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> getProvider(Qualified<T> qualified) {
        Preconditions.checkNotNull(qualified, "Null interface requested.");
        return (Provider) this.f31783b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        return f.f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        LazySet lazySet = (LazySet) this.f31784c.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return f31781i;
    }

    private ComponentRuntime(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.f31782a = new HashMap();
        this.f31783b = new HashMap();
        this.f31784c = new HashMap();
        this.f31786e = new HashSet();
        this.f31788g = new AtomicReference();
        EventBus eventBus = new EventBus(executor);
        this.f31787f = eventBus;
        this.f31789h = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(eventBus, (Class<EventBus>) EventBus.class, (Class<? super EventBus>[]) new Class[]{Subscriber.class, Publisher.class}));
        arrayList.add(Component.of(this, (Class<ComponentRuntime>) ComponentLoader.class, (Class<? super ComponentRuntime>[]) new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.f31785d = g(iterable);
        e(arrayList);
    }
}
