package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5603zk implements ModuleRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f78658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f78659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f78660c;

    public C5603zk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f78658a = sdkIdentifiers;
        this.f78659b = remoteConfigMetaInfo;
        this.f78660c = obj;
    }

    @NotNull
    public final C5603zk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C5603zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.f78659b;
    }

    public final Object c() {
        return this.f78660c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5603zk)) {
            return false;
        }
        C5603zk c5603zk = (C5603zk) obj;
        return Intrinsics.areEqual(this.f78658a, c5603zk.f78658a) && Intrinsics.areEqual(this.f78659b, c5603zk.f78659b) && Intrinsics.areEqual(this.f78660c, c5603zk.f78660c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f78660c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f78658a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f78659b;
    }

    public final int hashCode() {
        int iHashCode = (this.f78659b.hashCode() + (this.f78658a.hashCode() * 31)) * 31;
        Object obj = this.f78660c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f78658a + ", remoteConfigMetaInfo=" + this.f78659b + ", featuresConfig=" + this.f78660c + ')';
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f78658a;
    }

    public static C5603zk a(C5603zk c5603zk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            sdkIdentifiers = c5603zk.f78658a;
        }
        if ((i10 & 2) != 0) {
            remoteConfigMetaInfo = c5603zk.f78659b;
        }
        if ((i10 & 4) != 0) {
            obj = c5603zk.f78660c;
        }
        c5603zk.getClass();
        return new C5603zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
