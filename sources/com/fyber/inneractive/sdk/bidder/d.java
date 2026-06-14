package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public String A;
    public Boolean B;
    public String C;
    public int D;
    public InneractiveUserConfig.Gender E;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final boolean K;
    public Boolean L;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f20181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f20189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f20191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f20192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f20195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f20196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f20197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f20198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f20199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f20200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f20201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f20203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f20204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f20205y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f20206z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.f20181a = cVar;
        if (TextUtils.isEmpty(this.f20182b)) {
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new c(this));
        }
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.1");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        this.f20183c = sb2.toString();
        this.f20184d = com.fyber.inneractive.sdk.util.o.f23888a.getPackageName();
        this.f20185e = com.fyber.inneractive.sdk.util.k.j();
        this.f20186f = com.fyber.inneractive.sdk.util.k.l();
        this.f20193m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f20194n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f23773a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f20195o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.f20198r = (!com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.O.f20311q) ? d0.SECURE : d0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f20308n)) {
            this.H = iAConfigManager.f20306l;
        } else {
            this.H = iAConfigManager.f20306l + "_" + iAConfigManager.f20308n;
        }
        this.K = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.f20200t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.f20203w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.f20204x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.f20205y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f20181a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        this.f20187g = iAConfigManager.f20309o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f20181a.getClass();
            this.f20188h = com.fyber.inneractive.sdk.util.k.i();
            this.f20189i = this.f20181a.a();
            String str = this.f20181a.f23778b;
            this.f20190j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f20181a.f23778b;
            this.f20191k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f20181a.getClass();
            z0 z0VarA = z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            this.f20197q = z0VarA.b();
            int i10 = com.fyber.inneractive.sdk.config.k.f20410a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f20500a.f20508b;
                property = vVar != null ? vVar.f20504a : null;
            }
            this.A = property;
            this.G = iAConfigManager.f20304j.getZipCode();
        }
        this.E = iAConfigManager.f20304j.getGender();
        this.D = iAConfigManager.f20304j.getAge();
        this.f20192l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f20181a.getClass();
        ArrayList arrayList = iAConfigManager.f20310p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f20196p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.f20202v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.f20206z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.F = iAConfigManager.f20305k;
        this.f20199s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (TextUtils.isEmpty(iAConfigManager.f20308n)) {
            this.H = iAConfigManager.f20306l;
        } else {
            this.H = iAConfigManager.f20306l + "_" + iAConfigManager.f20308n;
        }
        this.f20201u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.E.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f21084p;
        this.I = lVar != null ? lVar.f93862a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f21084p;
        this.J = lVar2 != null ? lVar2.f93862a.d() : null;
        this.f20181a.getClass();
        this.f20193m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f20181a.getClass();
        this.f20194n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.L = com.fyber.inneractive.sdk.serverapi.b.j();
        com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
        if (bVar != null && IAConfigManager.f()) {
            this.N = bVar.f23785f;
            this.M = bVar.f23784e;
        }
    }
}
