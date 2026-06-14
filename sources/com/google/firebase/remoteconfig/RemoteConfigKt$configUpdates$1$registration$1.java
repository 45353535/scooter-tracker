package com.google.firebase.remoteconfig;

import gg.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onUpdate", "", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "onError", "error", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "com.google.firebase-firebase-config"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseRemoteConfig f32990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f32991b;

    RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, v vVar) {
        this.f32990a = firebaseRemoteConfig;
        this.f32991b = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(v vVar, ConfigUpdate configUpdate) {
        gg.m.b(vVar, configUpdate);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(FirebaseRemoteConfigException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        kotlinx.coroutines.i.c(this.f32991b, "Error listening for config updates.", error);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(final ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        FirebaseRemoteConfig firebaseRemoteConfig = this.f32990a;
        final v vVar = this.f32991b;
        firebaseRemoteConfig.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.p
            @Override // java.lang.Runnable
            public final void run() {
                RemoteConfigKt$configUpdates$1$registration$1.b(vVar, configUpdate);
            }
        });
    }
}
