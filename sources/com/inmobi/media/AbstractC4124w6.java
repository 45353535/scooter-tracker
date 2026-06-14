package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4124w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f39831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC3669e1 f39832b;

    public AbstractC4124w6(Ec nativeAdUnitComponent, AbstractC3669e1 adSessionManager) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.f39831a = nativeAdUnitComponent;
        this.f39832b = adSessionManager;
    }

    public final InterfaceC3878m9 a() {
        return this.f39831a.f36789a.f39882a.f39145c;
    }

    public abstract Object a(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r17, kotlin.coroutines.jvm.internal.d r18) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4124w6.a(java.util.List, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
