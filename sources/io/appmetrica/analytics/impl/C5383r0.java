package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5383r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4974ao f78103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f78104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ia f78105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ja f78106d;

    public C5383r0() {
        this(new C4974ao());
    }

    public final synchronized Ia a(Context context, Z3 z32) {
        try {
            if (this.f78105c == null) {
                if (a(context)) {
                    this.f78105c = new C5433t0();
                } else {
                    this.f78105c = new C5359q0(context, z32);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78105c;
    }

    public C5383r0(C4974ao c4974ao) {
        this.f78103a = c4974ao;
    }

    public final boolean a(Context context) {
        Boolean boolValueOf = this.f78104b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.f78104b;
                    if (boolValueOf == null) {
                        this.f78103a.getClass();
                        boolean zA = C4974ao.a(context);
                        boolValueOf = Boolean.valueOf(!zA);
                        this.f78104b = boolValueOf;
                        if (!zA) {
                            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return boolValueOf.booleanValue();
    }
}
