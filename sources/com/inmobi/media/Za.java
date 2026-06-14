package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f38112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f38114i;

    public Za(long j10, String impressionId, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z10, String landingScheme) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(metaDataBlob, "metaDataBlob");
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f38106a = j10;
        this.f38107b = impressionId;
        this.f38108c = placementType;
        this.f38109d = adType;
        this.f38110e = markupType;
        this.f38111f = creativeType;
        this.f38112g = metaDataBlob;
        this.f38113h = z10;
        this.f38114i = landingScheme;
    }
}
