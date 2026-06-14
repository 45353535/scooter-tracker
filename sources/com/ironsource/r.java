package com.ironsource;

import com.ironsource.InterfaceC4362i7;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements InterfaceC4362i7, InterfaceC4362i7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<IronSource.a, AtomicBoolean> f44764a = MapsKt.mapOf(TuplesKt.to(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), TuplesKt.to(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), TuplesKt.to(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC4362i7.a
    public void a(@NotNull IronSource.a adFormat, boolean z10) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f44764a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z10);
        }
    }

    @Override // com.ironsource.InterfaceC4362i7
    public boolean a(@NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f44764a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
