package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qualified f31935a = Qualified.qualified(Background.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qualified f31936b = Qualified.qualified(Blocking.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Qualified f31937c = Qualified.qualified(Lightweight.class, ExecutorService.class);

    static {
        FirebaseSessionsDependencies.addDependency(SessionSubscriber.Name.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics b(ComponentContainer componentContainer) {
        CrashlyticsWorkers.setEnforcement(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsB = FirebaseCrashlytics.b((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getDeferred(CrashlyticsNativeComponent.class), componentContainer.getDeferred(AnalyticsConnector.class), componentContainer.getDeferred(FirebaseRemoteConfigInterop.class), (ExecutorService) componentContainer.get(this.f31935a), (ExecutorService) componentContainer.get(this.f31936b), (ExecutorService) componentContainer.get(this.f31937c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            Logger.getLogger().d("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsB;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseCrashlytics.class).name("fire-cls").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.required((Qualified<?>) this.f31935a)).add(Dependency.required((Qualified<?>) this.f31936b)).add(Dependency.required((Qualified<?>) this.f31937c)).add(Dependency.deferred((Class<?>) CrashlyticsNativeComponent.class)).add(Dependency.deferred((Class<?>) AnalyticsConnector.class)).add(Dependency.deferred((Class<?>) FirebaseRemoteConfigInterop.class)).factory(new ComponentFactory() { // from class: com.google.firebase.crashlytics.d
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return this.f31945a.b(componentContainer);
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-cls", BuildConfig.VERSION_NAME));
    }
}
