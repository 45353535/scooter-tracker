package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5306nm {
    public final Map A;
    public final I9 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f77847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f77848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f77849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f77850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f77851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f77853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f77854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C5412s4 f77855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f77856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f77857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f77858p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f77859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Km f77860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final De f77861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f77862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f77863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f77864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f77865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C5237l3 f77866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C5460u2 f77867y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Gm f77868z;

    public C5306nm(C5281mm c5281mm) {
        this.f77843a = c5281mm.f77770a;
        List list = c5281mm.f77771b;
        this.f77844b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f77845c = c5281mm.f77772c;
        this.f77846d = c5281mm.f77773d;
        this.f77847e = c5281mm.f77774e;
        List list2 = c5281mm.f77775f;
        this.f77848f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c5281mm.f77776g;
        this.f77849g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c5281mm.f77777h;
        this.f77850h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c5281mm.f77778i;
        this.f77851i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f77852j = c5281mm.f77779j;
        this.f77853k = c5281mm.f77780k;
        this.f77855m = c5281mm.f77782m;
        this.f77861s = c5281mm.f77783n;
        this.f77856n = c5281mm.f77784o;
        this.f77857o = c5281mm.f77785p;
        this.f77854l = c5281mm.f77781l;
        this.f77858p = c5281mm.f77786q;
        this.f77859q = c5281mm.f77787r;
        this.f77860r = c5281mm.f77788s;
        this.f77863u = c5281mm.f77789t;
        this.f77864v = c5281mm.f77790u;
        this.f77865w = c5281mm.f77791v;
        RetryPolicyConfig retryPolicyConfig = c5281mm.f77792w;
        if (retryPolicyConfig == null) {
            Am am = new Am();
            this.f77862t = new RetryPolicyConfig(am.f75555w, am.f75556x);
        } else {
            this.f77862t = retryPolicyConfig;
        }
        this.f77866x = c5281mm.f77793x;
        this.f77867y = c5281mm.f77794y;
        this.f77868z = c5281mm.f77795z == null ? new Gm(O7.f76191b.f78587a) : c5281mm.f77795z;
        this.A = c5281mm.A == null ? Collections.EMPTY_MAP : c5281mm.A;
        this.B = c5281mm.B;
    }

    public final C5281mm a(C5412s4 c5412s4) {
        C5281mm c5281mm = new C5281mm(c5412s4);
        c5281mm.f77770a = this.f77843a;
        c5281mm.f77775f = this.f77848f;
        c5281mm.f77776g = this.f77849g;
        c5281mm.f77779j = this.f77852j;
        c5281mm.f77771b = this.f77844b;
        c5281mm.f77772c = this.f77845c;
        c5281mm.f77773d = this.f77846d;
        c5281mm.f77774e = this.f77847e;
        c5281mm.f77777h = this.f77850h;
        c5281mm.f77778i = this.f77851i;
        c5281mm.f77780k = this.f77853k;
        c5281mm.f77781l = this.f77854l;
        c5281mm.f77786q = this.f77858p;
        c5281mm.f77784o = this.f77856n;
        c5281mm.f77785p = this.f77857o;
        c5281mm.f77787r = this.f77859q;
        c5281mm.f77783n = this.f77861s;
        c5281mm.f77789t = this.f77863u;
        c5281mm.f77790u = this.f77864v;
        c5281mm.f77788s = this.f77860r;
        c5281mm.f77791v = this.f77865w;
        c5281mm.f77792w = this.f77862t;
        c5281mm.f77793x = this.f77866x;
        c5281mm.f77794y = this.f77867y;
        c5281mm.f77795z = this.f77868z;
        c5281mm.A = this.A;
        c5281mm.B = this.B;
        return c5281mm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f77843a + "', reportUrls=" + this.f77844b + ", getAdUrl='" + this.f77845c + "', reportAdUrl='" + this.f77846d + "', certificateUrl='" + this.f77847e + "', hostUrlsFromStartup=" + this.f77848f + ", hostUrlsFromClient=" + this.f77849g + ", diagnosticUrls=" + this.f77850h + ", customSdkHosts=" + this.f77851i + ", encodedClidsFromResponse='" + this.f77852j + "', lastClientClidsForStartupRequest='" + this.f77853k + "', lastChosenForRequestClids='" + this.f77854l + "', collectingFlags=" + this.f77855m + ", obtainTime=" + this.f77856n + ", hadFirstStartup=" + this.f77857o + ", startupDidNotOverrideClids=" + this.f77858p + ", countryInit='" + this.f77859q + "', statSending=" + this.f77860r + ", permissionsCollectingConfig=" + this.f77861s + ", retryPolicyConfig=" + this.f77862t + ", obtainServerTime=" + this.f77863u + ", firstStartupServerTime=" + this.f77864v + ", outdated=" + this.f77865w + ", cacheControl=" + this.f77866x + ", attributionConfig=" + this.f77867y + ", startupUpdateConfig=" + this.f77868z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
