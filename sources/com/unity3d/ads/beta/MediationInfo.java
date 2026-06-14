package com.unity3d.ads.beta;

import com.ironsource.C4574uf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/beta/MediationInfo;", "", "name", "", "version", C4574uf.f45563b, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdapterVersion", "()Ljava/lang/String;", "getName", "getVersion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediationInfo {

    @NotNull
    private final String adapterVersion;

    @NotNull
    private final String name;

    @NotNull
    private final String version;

    public MediationInfo(@NotNull String name, @NotNull String version, @NotNull String adapterVersion) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.name = name;
        this.version = version;
        this.adapterVersion = adapterVersion;
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }
}
