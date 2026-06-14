package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3945p1 f36898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f36899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetaInfo f36901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f36903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f36904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ContextData f36905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f36906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f36907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f36908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JSONObject f36909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f36910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E f36911n;

    public G(D adSetContext, String markupType, MetaInfo metaInfo, String creativeId, String tracking, List trackers, List trackingInfo, ContextData contextData, String str, long j10, long j11, JSONObject transactionInfo, F viewability, E mrc50, C3945p1 adManagerContext) {
        Intrinsics.checkNotNullParameter(adSetContext, "adSetContext");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        Intrinsics.checkNotNullParameter(mrc50, "mrc50");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.f36898a = adManagerContext;
        this.f36899b = adSetContext;
        this.f36900c = markupType;
        this.f36901d = metaInfo;
        this.f36902e = creativeId;
        this.f36903f = trackers;
        this.f36904g = trackingInfo;
        this.f36905h = contextData;
        this.f36906i = str;
        this.f36907j = j10;
        this.f36908k = j11;
        this.f36909l = transactionInfo;
        this.f36910m = viewability;
        this.f36911n = mrc50;
    }
}
