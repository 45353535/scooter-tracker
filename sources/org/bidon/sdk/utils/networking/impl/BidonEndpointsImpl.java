package org.bidon.sdk.utils.networking.impl;

import com.ironsource.C4240b4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.networking.BidonEndpoints;
import org.bidon.sdk.utils.networking.NetworkSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/BidonEndpointsImpl;", "Lorg/bidon/sdk/utils/networking/BidonEndpoints;", "<init>", "()V", C4240b4.f42489r, "", "hosts", "Ljava/util/Queue;", "defaultEndpoint", "activeEndpoint", "getActiveEndpoint", "()Ljava/lang/String;", "init", "", "defaultBaseUrl", "loadedUrls", "", "popNextEndpoint", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidonEndpointsImpl implements BidonEndpoints {

    @NotNull
    private final String apiVersion = "v2";

    @NotNull
    private final Queue<String> hosts = new LinkedList();

    @NotNull
    private String defaultEndpoint = NetworkSettings.BidonBaseUrl;

    @Override // org.bidon.sdk.utils.networking.BidonEndpoints
    @NotNull
    public String getActiveEndpoint() {
        String strPeek = this.hosts.peek();
        if (strPeek == null) {
            strPeek = this.defaultEndpoint;
        }
        return strPeek + "/" + this.apiVersion;
    }

    @Override // org.bidon.sdk.utils.networking.BidonEndpoints
    public void init(@NotNull String defaultBaseUrl, @NotNull Set<String> loadedUrls) {
        Intrinsics.checkNotNullParameter(defaultBaseUrl, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(loadedUrls, "loadedUrls");
        this.defaultEndpoint = defaultBaseUrl;
        this.hosts.add(defaultBaseUrl);
        this.hosts.addAll(CollectionsKt.distinct(loadedUrls));
    }

    @Override // org.bidon.sdk.utils.networking.BidonEndpoints
    @Nullable
    public String popNextEndpoint() {
        this.hosts.poll();
        return this.hosts.peek();
    }
}
