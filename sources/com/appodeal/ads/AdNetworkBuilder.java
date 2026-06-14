package com.appodeal.ads;

import com.ironsource.C4574uf;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/AdNetworkBuilder;", "", "adapterName", "", C4574uf.f45563b, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdapterName", "()Ljava/lang/String;", "getAdapterVersion", "adActivities", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/AdNetwork;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AdNetworkBuilder {

    @NotNull
    private final String adapterName;

    @NotNull
    private final String adapterVersion;

    public AdNetworkBuilder(@NotNull String adapterName, @NotNull String adapterVersion) {
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.adapterName = adapterName;
        this.adapterVersion = adapterVersion;
    }

    @NotNull
    public abstract AdNetwork<?, ?> build();

    @NotNull
    public List<String> getAdActivities() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final String getAdapterName() {
        return this.adapterName;
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }
}
