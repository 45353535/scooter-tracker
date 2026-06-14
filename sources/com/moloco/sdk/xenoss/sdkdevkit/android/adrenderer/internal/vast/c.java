package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f57404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f57405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f57406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f57407e;

    public c(double d10, Long l10, Integer num, Integer num2) {
        this.f57404b = d10;
        this.f57405c = l10;
        this.f57406d = num;
        this.f57407e = num2;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s mf1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s mf2) {
        Intrinsics.checkNotNullParameter(mf1, "mf1");
        Intrinsics.checkNotNullParameter(mf2, "mf2");
        Pair pairU = r.u(mf1, mf2, this.f57404b, this.f57405c, this.f57406d, this.f57407e);
        return Intrinsics.compare(((Number) pairU.component2()).intValue(), ((Number) pairU.component1()).intValue());
    }
}
