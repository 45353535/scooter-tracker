package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NativeSessionFileProvider f31946c = new MissingNativeSessionFileProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred f31947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f31948b = new AtomicReference(null);

    private static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getAppFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getBinaryImagesFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getDeviceFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMetadataFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMinidumpFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getOsFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getSessionFile() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.f31947a = deferred;
        deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.a
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                CrashlyticsNativeComponentDeferredProxy.b(this.f31959a, provider);
            }
        });
    }

    public static /* synthetic */ void b(CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, Provider provider) {
        crashlyticsNativeComponentDeferredProxy.getClass();
        Logger.getLogger().d("Crashlytics native component now available.");
        crashlyticsNativeComponentDeferredProxy.f31948b.set((CrashlyticsNativeComponent) provider.get());
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f31948b.get();
        return crashlyticsNativeComponent == null ? f31946c : crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f31948b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f31948b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(@NonNull final String str, @NonNull final String str2, final long j10, @NonNull final StaticSessionData staticSessionData) {
        Logger.getLogger().v("Deferring native open session: " + str);
        this.f31947a.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.b
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession(str, str2, j10, staticSessionData);
            }
        });
    }
}
