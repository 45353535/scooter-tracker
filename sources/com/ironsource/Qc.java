package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final D0 f41651a;

    public Qc(@NotNull D0 eventsWrapper) {
        Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.f41651a = eventsWrapper;
    }

    public final void a() {
        this.f41651a.a(A0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.f41651a.a(A0.PAUSE_AD, null);
    }

    public final void c() {
        this.f41651a.a(A0.RESUME_AD, null);
    }

    public final void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f41651a.a(A0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j10, int i10, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        map.put("reason", reason);
        map.put("duration", Long.valueOf(j10));
        this.f41651a.a(A0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double d10) {
        this.f41651a.a(A0.OPERATIONAL_SET_CONFIGURATIONS, MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10)));
    }
}
