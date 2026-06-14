package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f57402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57403c;

    public b(Integer num, Integer num2) {
        this.f57402b = num;
        this.f57403c = num2;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g c12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g c22) {
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        Pair pairY = r.y(c12, c22, this.f57402b, this.f57403c);
        return Intrinsics.compare(((Number) pairY.component2()).intValue(), ((Number) pairY.component1()).intValue());
    }
}
