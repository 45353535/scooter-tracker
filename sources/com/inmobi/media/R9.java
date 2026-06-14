package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gi f37647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gi f37648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gi f37649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gi f37650d;

    public R9(CrashConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f37647a = new Gi(config.getCrashConfig().getSamplingPercent());
        this.f37648b = new Gi(config.getCatchConfig().getSamplingPercent());
        this.f37649c = new Gi(config.getAnr().getWatchdog().getSamplingPercent());
        this.f37650d = new Gi(config.getAnr().getAppExitReason().getSamplingPercent());
    }
}
