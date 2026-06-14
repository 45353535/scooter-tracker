package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3912ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4 f39109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kl f39110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f39111c;

    public C3912ni(D4 contextualDataHandler, Kl videoAdEventsInterface, Ec nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(videoAdEventsInterface, "videoAdEventsInterface");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f39109a = contextualDataHandler;
        this.f39110b = videoAdEventsInterface;
        this.f39111c = nativeAdUnitComponent;
    }
}
