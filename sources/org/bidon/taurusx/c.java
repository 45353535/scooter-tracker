package org.bidon.taurusx;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f97727c;

    public c(String appId, String channel, List placementIds) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        this.f97725a = appId;
        this.f97726b = channel;
        this.f97727c = placementIds;
    }

    public final String a() {
        return this.f97725a;
    }

    public final String b() {
        return this.f97726b;
    }

    public final List c() {
        return this.f97727c;
    }
}
