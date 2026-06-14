package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5520wc extends C5058e5 implements Ta, Sa {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C5375qg f78501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C5474ug f78502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final L6 f78503y;

    public C5520wc(@NonNull Context context, @NonNull C5204jm c5204jm, @NonNull X4 x42, @NonNull C5487v4 c5487v4, @NonNull C5375qg c5375qg, @NonNull L6 l62, @NonNull AbstractC5007c5 abstractC5007c5) {
        this(context, x42, c5487v4, new C5208k0(), new TimePassedChecker(), new C5570yc(context, x42, c5487v4, abstractC5007c5, c5204jm, new C5395rc(l62), C5468ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5468ua.k().x(), C5468ua.k().l(), new C5246lc()), c5375qg, l62);
    }

    @Override // io.appmetrica.analytics.impl.C5058e5
    public final void C() {
        this.f78501w.a(this.f78502x);
    }

    public final boolean D() {
        boolean zOptBoolean;
        zo zoVar = this.f77081t;
        synchronized (zoVar) {
            zOptBoolean = zoVar.f78664a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C5058e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(@NonNull C5487v4 c5487v4) {
        super.a(c5487v4);
        this.f78503y.a(c5487v4.f78417i);
    }

    @Override // io.appmetrica.analytics.impl.C5058e5, io.appmetrica.analytics.impl.La
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a() {
        zo zoVar = this.f77081t;
        synchronized (zoVar) {
            Ao ao = zoVar.f78664a;
            ao.a(ao.a().put("referrer_handled", true));
        }
    }

    public C5520wc(Context context, X4 x42, C5487v4 c5487v4, C5208k0 c5208k0, TimePassedChecker timePassedChecker, C5570yc c5570yc, C5375qg c5375qg, L6 l62) {
        super(context, x42, c5208k0, timePassedChecker, c5570yc, c5487v4);
        this.f78501w = c5375qg;
        C5062e9 c5062e9K = k();
        c5062e9K.a(EnumC5168ib.EVENT_TYPE_REGULAR, new Mg(c5062e9K.b()));
        this.f78502x = c5570yc.a(this);
        this.f78503y = l62;
        C5468ua.k().y().onMainReporterCreated(new Ak(this, c5487v4));
    }
}
