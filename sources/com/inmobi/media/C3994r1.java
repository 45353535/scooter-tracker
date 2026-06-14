package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3994r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3845l1 f39423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3765hk f39424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f39428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f39431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3970q1 f39432j;

    public C3994r1(AbstractC3845l1 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f39423a = adUnit;
        this.f39424b = new C3765hk();
        this.f39432j = new C3970q1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        String telemetryMetadataBlob;
        AdSet adSetR = this.f39423a.r();
        return (adSetR == null || (ads = adSetR.getAds()) == null || (ad2 = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull((List) ads)) == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
