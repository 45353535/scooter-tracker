package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

/* JADX INFO: loaded from: classes9.dex */
public class RemoteConfigDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred f31958a;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.f31958a = deferred;
    }

    public static /* synthetic */ void a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber(RemoteConfigComponent.DEFAULT_NAMESPACE, crashlyticsRemoteConfigListener);
        Logger.getLogger().d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
            this.f31958a.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.d
                @Override // com.google.firebase.inject.Deferred.DeferredHandler
                public final void handle(Provider provider) {
                    RemoteConfigDeferredProxy.a(crashlyticsRemoteConfigListener, provider);
                }
            });
        }
    }
}
