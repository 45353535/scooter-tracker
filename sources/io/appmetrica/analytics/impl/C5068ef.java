package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5068ef extends Fd implements Do {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5043df f77109d = new C5043df("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5043df f77110e = new C5043df("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5043df f77111f = new C5043df("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5043df f77112g = new C5043df("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5043df f77113h = new C5043df("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5043df f77114i = new C5043df("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5043df f77115j = new C5043df("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5043df f77116k = new C5043df("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5043df f77117l = new C5043df("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5043df f77118m = new C5043df("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5043df f77119n = new C5043df("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5043df f77120o = new C5043df("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5043df f77121p = new C5043df("SATELLITE_CLIDS_CHECKED", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5043df f77122q = new C5043df("VITAL_DATA", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5043df f77123r = new C5043df("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5043df f77124s = new C5043df("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C5068ef(Oa oa2) {
        super(oa2);
    }

    public final long a(int i10) {
        return this.f76970a.getLong(f77110e.f77017b, i10);
    }

    public final boolean b(boolean z10) {
        return this.f76970a.getBoolean(f77111f.f77017b, z10);
    }

    public final C5068ef c(boolean z10) {
        return (C5068ef) b(f77112g.f77017b, z10);
    }

    public final C5068ef d(long j10) {
        return (C5068ef) b(f77110e.f77017b, j10);
    }

    public final boolean e() {
        return this.f76970a.getBoolean(f77109d.f77017b, false);
    }

    public final void f(boolean z10) {
        b(f77109d.f77017b, z10).b();
    }

    public final C5068ef g() {
        return (C5068ef) b(f77121p.f77017b, true);
    }

    public final C5068ef h() {
        return (C5068ef) b(f77120o.f77017b, true);
    }

    public final boolean i() {
        return this.f76970a.getBoolean(f77120o.f77017b, false);
    }

    public final boolean j() {
        return this.f76970a.getBoolean(f77121p.f77017b, false);
    }

    public final long a(long j10) {
        return this.f76970a.getLong(f77113h.f77017b, j10);
    }

    public final C5068ef b(long j10) {
        return (C5068ef) b(f77113h.f77017b, j10);
    }

    public final C5068ef c(long j10) {
        return (C5068ef) b(f77123r.f77017b, j10);
    }

    public final C5068ef d(boolean z10) {
        return (C5068ef) b(f77111f.f77017b, z10);
    }

    public final void e(boolean z10) {
        b(f77124s.f77017b, z10).b();
    }

    public final long f() {
        return this.f76970a.getLong(f77123r.f77017b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Do
    @Nullable
    public final String a() {
        return this.f76970a.getString(f77122q.f77017b, null);
    }

    public final C5068ef b(@NonNull EnumC4964ae enumC4964ae, int i10) {
        C5043df c5043df;
        int iOrdinal = enumC4964ae.ordinal();
        if (iOrdinal == 0) {
            c5043df = f77114i;
        } else if (iOrdinal != 1) {
            c5043df = iOrdinal != 2 ? null : f77116k;
        } else {
            c5043df = f77115j;
        }
        return c5043df != null ? (C5068ef) b(c5043df.f77017b, i10) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5017cf
    @NonNull
    public final Set<String> c() {
        return this.f76970a.a();
    }

    @Nullable
    public final Boolean d() {
        C5043df c5043df = f77112g;
        if (!this.f76970a.a(c5043df.f77017b)) {
            return null;
        }
        return Boolean.valueOf(this.f76970a.getBoolean(c5043df.f77017b, true));
    }

    @Override // io.appmetrica.analytics.impl.Fd
    @NonNull
    public final String f(@NonNull String str) {
        return new C5043df(str, null).f77017b;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(@NonNull String str) {
        b(f77122q.f77017b, str).b();
    }

    public final boolean a(boolean z10) {
        return this.f76970a.getBoolean(f77124s.f77017b, z10);
    }

    public final C5068ef b(@NonNull EnumC4964ae enumC4964ae, long j10) {
        C5043df c5043df;
        int iOrdinal = enumC4964ae.ordinal();
        if (iOrdinal == 0) {
            c5043df = f77117l;
        } else if (iOrdinal != 1) {
            c5043df = iOrdinal != 2 ? null : f77119n;
        } else {
            c5043df = f77118m;
        }
        return c5043df != null ? (C5068ef) b(c5043df.f77017b, j10) : this;
    }

    public final int a(@NonNull EnumC4964ae enumC4964ae, int i10) {
        C5043df c5043df;
        int iOrdinal = enumC4964ae.ordinal();
        if (iOrdinal == 0) {
            c5043df = f77114i;
        } else if (iOrdinal != 1) {
            c5043df = iOrdinal != 2 ? null : f77116k;
        } else {
            c5043df = f77115j;
        }
        if (c5043df == null) {
            return i10;
        }
        return this.f76970a.getInt(c5043df.f77017b, i10);
    }

    public final long a(@NonNull EnumC4964ae enumC4964ae, long j10) {
        C5043df c5043df;
        int iOrdinal = enumC4964ae.ordinal();
        if (iOrdinal == 0) {
            c5043df = f77117l;
        } else if (iOrdinal != 1) {
            c5043df = iOrdinal != 2 ? null : f77119n;
        } else {
            c5043df = f77118m;
        }
        if (c5043df == null) {
            return j10;
        }
        return this.f76970a.getLong(c5043df.f77017b, j10);
    }
}
