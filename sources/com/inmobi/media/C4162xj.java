package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4162xj extends AbstractC4174y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dj f39943b;

    public C4162xj(List imageAssets, Dj staticTelemetryHelper) {
        Intrinsics.checkNotNullParameter(imageAssets, "imageAssets");
        Intrinsics.checkNotNullParameter(staticTelemetryHelper, "staticTelemetryHelper");
        this.f39942a = imageAssets;
        this.f39943b = staticTelemetryHelper;
    }
}
