package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3840kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f38905d;

    public C3840kl(String universalAdId, String adServingId, int i10, ArrayList trackers) {
        Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f38902a = universalAdId;
        this.f38903b = adServingId;
        this.f38904c = i10;
        this.f38905d = trackers;
    }
}
