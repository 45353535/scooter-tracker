package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5325og implements InterfaceC5224kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bi f77904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4965af f77905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R7 f77906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5524wg f77907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f77908f;

    public C5325og(Bi bi2, C4965af c4965af, @NonNull Handler handler) {
        this(bi2, c4965af, handler, c4965af.s());
    }

    public final void a() {
        if (this.f77903a) {
            return;
        }
        Bi bi2 = this.f77904b;
        ResultReceiverC5574yg resultReceiverC5574yg = new ResultReceiverC5574yg(this.f77908f, this);
        bi2.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC5574yg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", "", InputDeviceCompat.SOURCE_TOUCHSCREEN, 0, anonymousInstance);
        u32.f76626m = bundle;
        M4 m42 = bi2.f75592a;
        bi2.a(Bi.a(u32, m42), m42, 1, (Map) null);
    }

    public C5325og(Bi bi2, C4965af c4965af, Handler handler, boolean z10) {
        this(bi2, c4965af, handler, z10, new R7(z10), new C5524wg());
    }

    public C5325og(Bi bi2, C4965af c4965af, Handler handler, boolean z10, R7 r72, C5524wg c5524wg) {
        this.f77904b = bi2;
        this.f77905c = c4965af;
        this.f77903a = z10;
        this.f77906d = r72;
        this.f77907e = c5524wg;
        this.f77908f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5224kg
    public final void a(@Nullable C5424sg c5424sg) {
        String str = c5424sg == null ? null : c5424sg.f78236a;
        if (this.f77903a) {
            return;
        }
        synchronized (this) {
            R7 r72 = this.f77906d;
            this.f77907e.getClass();
            r72.f76341d = C5524wg.a(str);
            r72.a();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            R7 r72 = this.f77906d;
            r72.f76340c = deferredDeeplinkParametersListener;
            if (r72.f76338a) {
                r72.a(1);
            } else {
                r72.a();
            }
            this.f77905c.u();
        } catch (Throwable th2) {
            this.f77905c.u();
            throw th2;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            R7 r72 = this.f77906d;
            r72.f76339b = deferredDeeplinkListener;
            if (r72.f76338a) {
                r72.a(1);
            } else {
                r72.a();
            }
            this.f77905c.u();
        } catch (Throwable th2) {
            this.f77905c.u();
            throw th2;
        }
    }
}
