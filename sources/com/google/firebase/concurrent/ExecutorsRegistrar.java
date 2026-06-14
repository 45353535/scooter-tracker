package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Lazy f31853a = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.o
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Lazy f31854b = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.p
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Lazy f31855c = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.q
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Lazy f31856d = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.r
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f31854b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f31855c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) f31853a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new CustomThreadFactory(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, (ScheduledExecutorService) f31856d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.g(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.t
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.e(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.u
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.a(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.v
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return UiExecutor.INSTANCE;
            }
        }).build());
    }
}
