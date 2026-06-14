package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class SubscriberRegistry {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LoadingCache f30543c = CacheBuilder.newBuilder().weakKeys().build(new CacheLoader<Class<?>, ImmutableList<Method>>() { // from class: com.google.common.eventbus.SubscriberRegistry.1
        @Override // com.google.common.cache.CacheLoader
        public ImmutableList<Method> load(Class<?> cls) throws Exception {
            return SubscriberRegistry.e(cls);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final LoadingCache f30544d = CacheBuilder.newBuilder().weakKeys().build(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() { // from class: com.google.common.eventbus.SubscriberRegistry.2
        @Override // com.google.common.cache.CacheLoader
        public ImmutableSet<Class<?>> load(Class<?> cls) {
            return ImmutableSet.copyOf((Collection) TypeToken.of((Class) cls).getTypes().rawTypes());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f30545a = Maps.newConcurrentMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f30546b;

    private static final class MethodIdentifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f30548b;

        MethodIdentifier(Method method) {
            this.f30547a = method.getName();
            this.f30548b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(Object obj) {
            if (obj instanceof MethodIdentifier) {
                MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
                if (this.f30547a.equals(methodIdentifier.f30547a) && this.f30548b.equals(methodIdentifier.f30548b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f30547a, this.f30548b);
        }
    }

    SubscriberRegistry(EventBus eventBus) {
        this.f30546b = (EventBus) Preconditions.checkNotNull(eventBus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Multimap b(Object obj) {
        HashMultimap hashMultimapCreate = HashMultimap.create();
        UnmodifiableIterator it = d(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method method = (Method) it.next();
            hashMultimapCreate.put(method.getParameterTypes()[0], Subscriber.c(this.f30546b, obj, method));
        }
        return hashMultimapCreate;
    }

    static ImmutableSet c(Class cls) {
        try {
            return (ImmutableSet) f30544d.getUnchecked(cls);
        } catch (UncheckedExecutionException e10) {
            throw Throwables.propagate(e10.getCause());
        }
    }

    private static ImmutableList d(Class cls) {
        try {
            return (ImmutableList) f30543c.getUnchecked(cls);
        } catch (UncheckedExecutionException e10) {
            Throwables.throwIfUnchecked(e10.getCause());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList e(Class cls) {
        Set setRawTypes = TypeToken.of(cls).getTypes().rawTypes();
        HashMap mapNewHashMap = Maps.newHashMap();
        Iterator it = setRawTypes.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Preconditions.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (Object) method, parameterTypes.length);
                    Preconditions.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), Primitives.wrap(parameterTypes[0]).getSimpleName());
                    MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                    if (!mapNewHashMap.containsKey(methodIdentifier)) {
                        mapNewHashMap.put(methodIdentifier, method);
                    }
                }
            }
        }
        return ImmutableList.copyOf(mapNewHashMap.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    Iterator f(Object obj) {
        ImmutableSet immutableSetC = c(obj.getClass());
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(immutableSetC.size());
        UnmodifiableIterator it = immutableSetC.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f30545a.get((Class) it.next());
            if (copyOnWriteArraySet != null) {
                arrayListNewArrayListWithCapacity.add(copyOnWriteArraySet.iterator());
            }
        }
        return Iterators.concat(arrayListNewArrayListWithCapacity.iterator());
    }

    void g(Object obj) {
        for (Map.Entry entry : b(obj).asMap().entrySet()) {
            Class cls = (Class) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f30545a.get(cls);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
                copyOnWriteArraySet = (CopyOnWriteArraySet) MoreObjects.firstNonNull((CopyOnWriteArraySet) this.f30545a.putIfAbsent(cls, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(collection);
        }
    }

    void h(Object obj) {
        for (Map.Entry entry : b(obj).asMap().entrySet()) {
            Class cls = (Class) entry.getKey();
            Collection<?> collection = (Collection) entry.getValue();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f30545a.get(cls);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(collection)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + obj + " registered?");
            }
        }
    }
}
