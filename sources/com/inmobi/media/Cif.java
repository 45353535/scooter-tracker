package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.if, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4077u9 f38763a;

    public Cif(AdConfig.PingsV2Config pingsConfig) {
        Intrinsics.checkNotNullParameter(pingsConfig, "pingsConfig");
        hh.p pVar = new hh.p();
        pVar.j(pingsConfig.getMaxBatchSize().getHigh());
        Unit unit = Unit.f93236a;
        this.f38763a = C4027s9.a(null, pVar, null, new C3964pk(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout()), 5);
    }
}
