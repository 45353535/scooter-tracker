package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A5;
import com.ironsource.AbstractC4511r3;
import com.ironsource.Ac;
import com.ironsource.C4231ad;
import com.ironsource.C4246ba;
import com.ironsource.C4249bd;
import com.ironsource.C4279d9;
import com.ironsource.C4283dd;
import com.ironsource.C4295e8;
import com.ironsource.C4311f7;
import com.ironsource.C4313f9;
import com.ironsource.C4324g3;
import com.ironsource.C4338h0;
import com.ironsource.C4351hd;
import com.ironsource.C4371j0;
import com.ironsource.C4410l5;
import com.ironsource.C4420lf;
import com.ironsource.C4427m5;
import com.ironsource.C4432ma;
import com.ironsource.C4462o4;
import com.ironsource.C4540sf;
import com.ironsource.C4557tf;
import com.ironsource.C4573ue;
import com.ironsource.C4604wb;
import com.ironsource.C4606wd;
import com.ironsource.C4649z5;
import com.ironsource.C4653z9;
import com.ironsource.D3;
import com.ironsource.E9;
import com.ironsource.Ee;
import com.ironsource.EnumC4556te;
import com.ironsource.F2;
import com.ironsource.G1;
import com.ironsource.G9;
import com.ironsource.Ge;
import com.ironsource.Ib;
import com.ironsource.Ic;
import com.ironsource.InterfaceC4298eb;
import com.ironsource.InterfaceC4412l7;
import com.ironsource.InterfaceC4486pb;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.J1;
import com.ironsource.J8;
import com.ironsource.J9;
import com.ironsource.Jb;
import com.ironsource.K9;
import com.ironsource.L6;
import com.ironsource.M7;
import com.ironsource.Nb;
import com.ironsource.O7;
import com.ironsource.Od;
import com.ironsource.P5;
import com.ironsource.Q4;
import com.ironsource.Q7;
import com.ironsource.Qf;
import com.ironsource.R3;
import com.ironsource.R4;
import com.ironsource.Rd;
import com.ironsource.Rf;
import com.ironsource.S3;
import com.ironsource.S6;
import com.ironsource.T2;
import com.ironsource.T9;
import com.ironsource.Td;
import com.ironsource.U9;
import com.ironsource.Wb;
import com.ironsource.X4;
import com.ironsource.Y7;
import com.ironsource.Yb;
import com.ironsource.Z3;
import com.ironsource.Z9;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.u;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.FeaturesManager;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class r implements T9, Ic, Q4, Q4.b, Q4.c, Q4.a {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static boolean f44151m0;
    private C4246ba A;
    private final String B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private Boolean J;
    private q K;
    private String L;
    private Boolean M;
    private O7 N;
    private y O;
    private C4653z9 P;
    private Od Q;
    private F2 R;
    private Ac S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private final ConcurrentHashMap<String, h.d> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44152a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.b> f44153a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44154b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f44155b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4634y7 f44156c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.f f44157c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4634y7.a f44158d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.k f44159d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M7 f44160e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.c f44161e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4412l7 f44162f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private P5 f44163f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final J8.a f44164g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private U9 f44165g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IronSourceLoggerManager f44166h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private S6 f44167h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4604wb f44168i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f44169i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f44170j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private AdQualityBridge f44171j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f44172k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    Y7<ISDemandOnlyInterstitialListener> f44173k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Ee f44174l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    Y7<ISDemandOnlyRewardedVideoListener> f44175l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f44176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f44177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f44178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, String> f44179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f44180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AtomicBoolean f44181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<IronSource.a> f44183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f44184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f44185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f44186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<IronSource.a> f44187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Set<IronSource.a> f44188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f44189z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44191b;

        static {
            int[] iArr = new int[u.d.values().length];
            f44191b = iArr;
            try {
                iArr[u.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44191b[u.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44191b[u.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44191b[u.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f44190a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44190a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44190a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44190a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface b {
        void a(String str);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile r f44192a = new r();

        private c() {
        }
    }

    private boolean A() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.k() == null || this.f44174l.k().a() == null || this.f44174l.k().a().size() <= 0) ? false : true;
    }

    private synchronized boolean C() {
        return this.f44182s;
    }

    private boolean D() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.c() == null || this.f44174l.c().d() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.k() == null || this.f44174l.k().b() == null || this.f44174l.k().b().size() <= 0) ? false : true;
    }

    private boolean H() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.c() == null || this.f44174l.c().e() == null) ? false : true;
    }

    private boolean I() {
        return H() && J();
    }

    private boolean J() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.k() == null || this.f44174l.k().c() == null || this.f44174l.k().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.c() == null || this.f44174l.c().f() == null) ? false : true;
    }

    private boolean M() {
        return L() && N();
    }

    private boolean N() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.k() == null || this.f44174l.k().d() == null || this.f44174l.k().d().size() <= 0) ? false : true;
    }

    private void T() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4432ma.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f44104c)) {
            if (TextUtils.isEmpty(concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f44104c).get(0))) {
                return;
            }
            X4.f42026a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private void U() {
        if (this.F) {
            W();
            return;
        }
        boolean zH = this.f44174l.c().c().d().h();
        this.X = zH;
        if (zH) {
            V();
        } else {
            c0();
        }
    }

    private void V() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f44174l.k().a());
        if (listA.size() > 0) {
            this.R = new F2(listA, this.f44174l.c().c(), IronSourceUtils.f(), C4432ma.b(), this.A);
            u();
        } else {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            a(A5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
        }
    }

    private void W() {
        this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f44174l.k().a().size(); i10++) {
            String str = this.f44174l.k().a().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f44174l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            a(A5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.f44153a0) {
            try {
                T2 t2C = this.f44174l.c().c();
                R4.a aVar = new R4.a("Mediation");
                if (t2C.k()) {
                    aVar.a("isOneFlow", 1);
                }
                this.f44161e0 = new com.ironsource.mediationsdk.demandOnly.c(arrayList, t2C, n(), o(), new R4.b(G9.i(), aVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (h.b bVar : this.f44153a0.values()) {
            this.f44161e0.a(bVar.g(), bVar.e());
        }
        this.f44153a0.clear();
    }

    private void X() {
        this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f44174l.k().b().size(); i10++) {
            String str = this.f44174l.k().b().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f44174l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            a(A5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.Z) {
            this.f44157c0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.Z.values().iterator();
        while (it.hasNext()) {
            this.f44157c0.a(it.next());
        }
        this.Z.clear();
    }

    private void Y() {
        this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f44174l.k().d().size(); i10++) {
            String str = this.f44174l.k().d().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f44174l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f44155b0) {
            this.f44159d0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.f44155b0.values().iterator();
        while (it.hasNext()) {
            this.f44159d0.a(it.next());
        }
        this.f44155b0.clear();
    }

    private void Z() {
        if (this.E) {
            X();
        } else {
            a0();
        }
    }

    private void a0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f44174l.k().b());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            a(A5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        C4653z9 c4653z9 = new C4653z9(listA, this.f44174l.c().d(), IronSourceUtils.f(), C4432ma.b(), this.A);
        this.P = c4653z9;
        Boolean bool = this.f44186w;
        if (bool != null) {
            c4653z9.a(this.f44185v, bool.booleanValue());
        }
        if (this.W) {
            this.W = false;
            this.P.A();
        }
    }

    private boolean b(List<IronSource.a> list, boolean z10, S3 s32) {
        IronLog.INTERNAL.verbose();
        try {
            this.f44183t = list;
            c(true);
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.i("init success");
            if (z10) {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                try {
                    jSONObjectB.put("revived", true);
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
                Ib.U().q().a(new C4649z5(A5.FIRST_INSTANCE_RESULT, jSONObjectB));
            }
            int iB = s32.b().f().b();
            if (iB >= 0) {
                Z3 z32 = new Z3();
                z32.a(iB);
                z32.a(iB, this.f44174l.l().d());
            }
            G9.i().h();
            Td.i().h();
            Ib.U().q().h();
            com.ironsource.mediationsdk.c.b().b(n(), o());
            for (IronSource.a aVar : IronSource.a.values()) {
                if (this.f44187x.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            Ac acQ = q();
            if (acQ != null) {
                acQ.a(this.f44174l);
            }
            return true;
        } catch (Exception e11) {
            C4462o4.d().a(e11);
            IronLog.INTERNAL.error(e11.toString());
            Ac acQ2 = q();
            if (acQ2 != null) {
                acQ2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private void b0() {
        this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listA = a(this.f44174l.k().d());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, this.Y);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            b(A5.TROUBLESHOOTING_RV_INIT_FAILED, jSONObjectA);
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        s sVar = new s(listA, this.f44174l.c().f(), n(), IronSourceUtils.f(), C4432ma.b().a(), this.A);
        this.N = sVar;
        Boolean bool = this.f44186w;
        if (bool != null) {
            sVar.a(this.f44185v, bool.booleanValue());
        }
    }

    private synchronized void c(boolean z10) {
        this.f44182s = z10;
    }

    private void c0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f44174l.k().a());
        if (listA.size() > 0) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.O = new y(listA, new k(n(), IronSourceUtils.f(), this.f44174l.c().c()), C4432ma.b().a(), this.A);
            u();
        } else {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            a(A5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
        }
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.f44170j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C4420lf.a().a(new L6(context));
        Ib.U().q().a(context, this.A);
        G9.i().a(context, this.A);
        Td.i().a(context, this.A);
        C4231ad.P.a(context, this.A);
    }

    private void d0() {
        if (this.D) {
            Y();
            return;
        }
        Rd rdF = this.f44174l.c().f();
        this.V = rdF.k().h();
        this.Y = a(rdF);
        if (this.T || this.V) {
            e0();
        } else {
            b0();
        }
    }

    private void e(Activity activity, String str) {
        C4283dd c4283ddN;
        try {
            c4283ddN = n(str);
            if (c4283ddN == null) {
                try {
                    c4283ddN = j();
                } catch (Exception e10) {
                    e = e10;
                    C4462o4.d().a(e);
                    this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                }
            }
            if (c4283ddN == null) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                C4606wd.a().a(new IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"), (AdInfo) null);
                return;
            }
        } catch (Exception e11) {
            e = e11;
            c4283ddN = null;
        }
        if (activity != null) {
            e(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showRewardedVideo when initializing SDK with context", 3);
            C4606wd.a().a(ErrorBuilder.buildInitFailedError("Activity must be provided in showRewardedVideo when initializing SDK with context", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            return;
        }
        Od od2 = this.Q;
        if (od2 != null && (this.T || this.V)) {
            od2.a(activity, c4283ddN);
            return;
        }
        O7 o72 = this.N;
        if (o72 != null) {
            o72.a(activity, c4283ddN);
            return;
        }
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        C4606wd.a().a(new IronSourceError(1023, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (AdInfo) null);
    }

    private void e0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f44174l.k().d());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, this.Y);
            a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
            b(A5.TROUBLESHOOTING_RV_INIT_FAILED, jSONObjectA);
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Od od2 = new Od(listA, this.f44174l.c().f(), IronSourceUtils.f(), this.T, C4432ma.b(), this.A);
        this.Q = od2;
        Boolean bool = this.f44186w;
        if (bool != null) {
            od2.a(this.f44185v, bool.booleanValue());
        }
        if (this.U && this.T) {
            this.U = false;
            this.Q.A();
        }
    }

    private J9 i() {
        E9 e9D = this.f44174l.c().d();
        if (e9D != null) {
            return e9D.a();
        }
        return null;
    }

    private C4283dd j() {
        Rd rdF = this.f44174l.c().f();
        if (rdF != null) {
            return rdF.a();
        }
        return null;
    }

    private C4324g3 k(String str) {
        T2 t2C = this.f44174l.c().c();
        if (t2C == null) {
            return new C4410l5();
        }
        if (TextUtils.isEmpty(str)) {
            return t2C.i();
        }
        C4324g3 c4324g3A = t2C.a(str);
        return c4324g3A != null ? c4324g3A : t2C.i();
    }

    public static r m() {
        return c.f44192a;
    }

    private C4283dd n(String str) {
        Rd rdF = this.f44174l.c().f();
        if (rdF != null) {
            return rdF.a(str);
        }
        return null;
    }

    private synchronized Ac q() {
        return this.S;
    }

    private void u() {
        if (this.J.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.J = Boolean.FALSE;
            a(this.K, this.L);
            this.K = null;
            this.L = null;
        }
    }

    private void v() {
        this.f44166h = IronSourceLoggerManager.getLogger(0);
        this.f44168i = new C4604wb();
    }

    private boolean w() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + IronSourceAdQuality.class.getName());
            return true;
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean x() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.c() == null || this.f44174l.c().b() == null || this.f44174l.c().b().b() == null) ? false : true;
    }

    private boolean y() {
        Ee ee2 = this.f44174l;
        return (ee2 == null || ee2.c() == null || this.f44174l.c().c() == null) ? false : true;
    }

    private boolean z() {
        return y() && A();
    }

    boolean B() {
        return this.D || this.E || this.F;
    }

    public boolean F() {
        boolean z10;
        try {
            if (this.E) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            C4653z9 c4653z9 = this.P;
            boolean z11 = c4653z9 != null && c4653z9.u();
            try {
                G9.i().a(new C4649z5(z11 ? A5.IS_CHECK_READY_TRUE : A5.IS_CHECK_READY_FALSE, IronSourceUtils.a(false, true, 1)));
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z11, 1);
                return z11;
            } catch (Throwable th2) {
                z10 = z11;
                th = th2;
                C4462o4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z10, 1);
                this.f44166h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public boolean K() {
        boolean z10;
        boolean z11;
        try {
            if (this.D) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.T || this.V) {
                Od od2 = this.Q;
                z11 = od2 != null && od2.u();
            } else {
                O7 o72 = this.N;
                if (o72 != null && o72.d()) {
                }
            }
            try {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                a(jSONObjectB, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.Y)}});
                Td.i().a(new C4649z5(z11 ? A5.RV_API_HAS_AVAILABILITY_TRUE : A5.RV_API_HAS_AVAILABILITY_FALSE, jSONObjectB));
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z11, 1);
                return z11;
            } catch (Throwable th2) {
                z10 = z11;
                th = th2;
                C4462o4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z10, 1);
                this.f44166h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public boolean O() {
        return C();
    }

    public void P() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.E) {
                this.f44166h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!this.H) {
                this.f44166h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f44166h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (!u.c().d()) {
                    this.W = true;
                    return;
                } else {
                    this.f44166h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
            }
            if (!E()) {
                this.f44166h.log(ironSourceTag, "No interstitial configurations found", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            C4653z9 c4653z9 = this.P;
            if (c4653z9 == null) {
                this.W = true;
            } else {
                c4653z9.A();
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th2);
            n.a().b(IronSource.a.INTERSTITIAL, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void Q() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.D) {
                this.f44166h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!this.T && !this.f44169i0) {
                this.f44166h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!this.G) {
                this.f44166h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f44166h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (!u.c().d()) {
                    this.U = true;
                    return;
                } else {
                    this.f44166h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
            }
            if (!M()) {
                this.f44166h.log(ironSourceTag, "No rewarded video configurations found", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            Od od2 = this.Q;
            if (od2 == null) {
                this.U = true;
            } else {
                od2.A();
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th2);
            n.a().b(IronSource.a.REWARDED_VIDEO, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void R() {
        this.f44169i0 = false;
    }

    public void S() {
        if (f44151m0) {
            return;
        }
        f44151m0 = true;
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put("status", "false");
            jSONObjectB.put("errorCode", 1);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Ib.U().q().a(new C4649z5(A5.FIRST_INSTANCE_RESULT, jSONObjectB));
    }

    public void a(long j10, Ee.a aVar) {
        JSONObject jSONObjectB = IronSourceUtils.b(B());
        try {
            jSONObjectB.put("duration", j10);
            jSONObjectB.put("sessionDepth", this.C);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Ib.U().q().a(new C4649z5(A5.INIT_COMPLETE, jSONObjectB));
    }

    public Wb f() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f44174l.k().c());
        if (listA.size() > 0) {
            return new Wb(listA, this.f44174l.c().e(), IronSourceUtils.f(), C4432ma.b(), this.A);
        }
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        a(jSONObjectA, new Object[][]{new Object[]{"errorCode", 1010}});
        a(A5.TROUBLESHOOTING_NT_INIT_FAILED, jSONObjectA);
        return null;
    }

    @Override // com.ironsource.T9
    public void g(String str) {
        try {
            String str2 = this.f44152a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!a(str, 1, 64) || !p(str)) {
                this.f44166h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f44180q = str;
                this.f44165g0.f(str);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, this.f44152a + ":setMediationType(mediationType:" + str + ")", e10);
        }
    }

    @Override // com.ironsource.Ic
    public void h(String str) {
        try {
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.i("Mediation init failed");
            if (this.f44168i != null) {
                Iterator<IronSource.a> it = this.f44187x.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            Ac acQ = q();
            if (acQ != null) {
                acQ.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String l() {
        return this.f44178o;
    }

    public void o(String str) {
        IronLog.API.verbose("userId = " + str);
        this.f44177n = str;
        Ib.U().q().a(new C4649z5(A5.SET_USER_ID, IronSourceUtils.a(false)));
        AdQualityBridge adQualityBridge = this.f44171j0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String p() {
        return this.f44180q;
    }

    public Map<String, String> r() {
        return this.f44179p;
    }

    public C4246ba s() {
        return this.A;
    }

    public String t() {
        return this.f44184u;
    }

    private r() {
        this(Ib.U().i(), Ib.O().b(), Ib.U().w(), Ib.U().k(), Ib.O().C());
    }

    private J9 l(String str) {
        E9 e9D = this.f44174l.c().d();
        if (e9D != null) {
            return e9D.a(str);
        }
        return null;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private R3 q(String str) {
        R3 r32 = new R3();
        if (str == null) {
            r32.a(new IronSourceError(506, "Init Fail - appKey is missing"));
            return r32;
        }
        if (!a(str, 5, 10)) {
            r32.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
            return r32;
        }
        if (!p(str)) {
            r32.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return r32;
    }

    @Override // com.ironsource.T9
    public void c() {
        this.f44179p = null;
    }

    public Yb m(String str) {
        Nb nbE = this.f44174l.c().e();
        if (nbE == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return nbE.e();
        }
        Yb ybA = nbE.a(str);
        return ybA != null ? ybA : nbE.e();
    }

    public void c(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.E) {
                this.f44166h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C4295e8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else {
                if (!D()) {
                    C4295e8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
                    return;
                }
                J9 j9I = i();
                if (j9I != null) {
                    c(activity, j9I.c());
                } else {
                    C4295e8.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e10);
            C4295e8.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.T9
    public C4283dd i(String str) {
        C4283dd c4283ddN;
        try {
            c4283ddN = n(str);
            if (c4283ddN == null) {
                try {
                    this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    c4283ddN = j();
                } catch (Exception e10) {
                    e = e10;
                    C4462o4.d().a(e);
                    return c4283ddN;
                }
            }
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + c4283ddN, 1);
            return c4283ddN;
        } catch (Exception e11) {
            e = e11;
            c4283ddN = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // com.ironsource.Q4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean j(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.k r0 = r1.f44159d0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r2 = r0.a(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.j(java.lang.String):boolean");
    }

    public String n() {
        return this.f44176m;
    }

    public void d(Activity activity) {
        if (!L()) {
            C4606wd.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        C4283dd c4283ddJ = j();
        if (c4283ddJ == null) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            C4606wd.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        f(activity, c4283ddJ.c());
    }

    r(InterfaceC4634y7 interfaceC4634y7, InterfaceC4634y7.a aVar, M7 m72, InterfaceC4412l7 interfaceC4412l7, J8.a aVar2) {
        this.f44152a = getClass().getName();
        this.f44154b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.1.0";
        this.f44172k = new Object();
        this.f44174l = null;
        this.f44176m = null;
        this.f44177n = "";
        this.f44178o = null;
        this.f44179p = null;
        this.f44180q = null;
        this.f44182s = false;
        this.f44186w = null;
        this.f44189z = true;
        this.B = "sessionDepth";
        this.M = null;
        this.f44169i0 = false;
        this.f44156c = interfaceC4634y7;
        this.f44158d = aVar;
        this.f44160e = m72;
        this.f44162f = interfaceC4412l7;
        this.f44164g = aVar2;
        v();
        this.f44170j = new AtomicBoolean();
        this.f44187x = new HashSet();
        this.f44188y = new HashSet();
        this.E = false;
        this.D = false;
        this.F = false;
        this.f44181r = new AtomicBoolean(true);
        this.C = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f44184u = IronSourceUtils.d();
        this.J = Boolean.FALSE;
        this.W = false;
        this.L = null;
        this.N = null;
        this.S = null;
        this.O = null;
        this.T = false;
        this.Z = new ConcurrentHashMap<>();
        this.f44155b0 = new ConcurrentHashMap<>();
        this.f44153a0 = new ConcurrentHashMap<>();
        this.f44157c0 = null;
        this.f44159d0 = null;
        this.f44161e0 = null;
        this.Y = 1;
        this.f44163f0 = new P5();
        U9 u92 = new U9();
        this.f44165g0 = u92;
        this.f44167h0 = new S6(u92);
        this.f44171j0 = null;
        this.f44173k0 = new Y7.a();
        this.f44175l0 = new Y7.b();
    }

    private R4 k() {
        return new R4.b(Ib.U().q(), new R4.a("IronSource"));
    }

    public String o() {
        return this.f44177n;
    }

    public synchronized IronSourceError a(Context context, String str, boolean z10, Ac ac2, IronSource.a... aVarArr) throws Throwable {
        Throwable th2;
        boolean z11;
        r rVar;
        boolean z12;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 59440d7");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (!Z9.a((Object) context, "Init Failed - provided context is null")) {
                h("Provided context is null");
                return new IronSourceError(2000, "Provided context is null");
            }
            this.f44164g.a(context);
            boolean z13 = context instanceof Activity;
            if (z13) {
                e((Activity) context);
            }
            AtomicBoolean atomicBoolean = this.f44181r;
            if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                C4573ue.f45559a.a(ac2 == null);
                if ((aVarArr == null || aVarArr.length == 0) && ac2 == null) {
                    for (IronSource.a aVar : IronSource.a.values()) {
                        this.f44187x.add(aVar);
                    }
                    this.G = true;
                    this.H = true;
                    this.I = true;
                } else {
                    for (IronSource.a aVar2 : aVarArr) {
                        this.f44187x.add(aVar2);
                        this.f44188y.add(aVar2);
                        if (aVar2.equals(IronSource.a.INTERSTITIAL)) {
                            this.H = true;
                        }
                        if (aVar2.equals(IronSource.a.BANNER)) {
                            this.I = true;
                        }
                        if (aVar2.equals(IronSource.a.REWARDED_VIDEO)) {
                            this.G = true;
                        }
                    }
                }
                IronLog.API.info("init(appKey:" + str + ")");
                R3 r3Q = q(str);
                if (r3Q.b()) {
                    this.f44176m = str;
                }
                Ee eeA = a(context, this.f44176m);
                if (eeA != null) {
                    IronLog.INTERNAL.verbose("init cache exists");
                    a(eeA.c().b().f());
                } else {
                    IronLog.INTERNAL.verbose("init cache does not exist");
                }
                ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                this.f44158d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(X4.f42026a.d()));
                this.f44165g0.g(LevelPlay.getSdkVersion());
                this.f44165g0.a(Q7.a());
                this.f44165g0.b(IronSourceUtils.f(context));
                this.f44165g0.a(C4371j0.a());
                T();
                d(context);
                if (this.f44176m == null) {
                    u.c().f();
                    if (this.f44187x.contains(IronSource.a.REWARDED_VIDEO)) {
                        C4606wd.a().a(false, (AdInfo) null);
                    }
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, r3Q.a().toString(), 1);
                    return new IronSourceError(2010, "App key is null");
                }
                this.f44165g0.a(context);
                this.f44165g0.c(this.f44176m);
                this.f44165g0.h(this.f44184u);
                if (this.f44189z) {
                    JSONObject jSONObjectB = IronSourceUtils.b(z10);
                    if (aVarArr != null) {
                        for (IronSource.a aVar3 : aVarArr) {
                            try {
                                jSONObjectB.put(aVar3.toString(), true);
                            } catch (Exception e10) {
                                C4462o4.d().a(e10);
                            }
                        }
                    }
                    int i10 = this.C + 1;
                    this.C = i10;
                    if (ac2 != null) {
                        z11 = true;
                        z12 = z10;
                        rVar = this;
                    } else {
                        z11 = false;
                        rVar = this;
                        z12 = z10;
                    }
                    try {
                        rVar.a(z13, z12, i10, jSONObjectB, z11);
                        rVar.f44189z = false;
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        throw th2;
                    }
                }
                return null;
            }
            if (aVarArr != null) {
                a(z13, z10, ac2 != null, aVarArr);
            } else {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
            }
            EnumC4556te enumC4556teB = C4573ue.f45559a.b();
            if (C()) {
                a(this.f44174l);
                return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
            }
            if (enumC4556teB == EnumC4556te.INIT_FAILED) {
                return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
            }
            if (enumC4556teB != EnumC4556te.NOT_INIT) {
                if (ac2 != null) {
                    a(ac2);
                }
                return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
            }
            return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
        } catch (Throwable th6) {
            th2 = th6;
            throw th2;
        }
    }

    Boolean g() {
        return this.M;
    }

    public Ee h() {
        return this.f44174l;
    }

    public void f(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.D) {
                this.f44166h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                C4606wd.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!L()) {
                C4606wd.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else {
                e(activity, str);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            C4606wd.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    private void d(Activity activity, String str) {
        try {
            J9 j9L = l(str);
            if (j9L == null) {
                j9L = i();
            }
            if (j9L == null) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                C4295e8.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                C4295e8.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.P.a(activity, new C4283dd(j9L));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e10);
        }
    }

    public void c(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.E) {
                this.f44166h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C4295e8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!D()) {
                C4295e8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            } else {
                d(activity, str);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            C4295e8.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.Q4.a
    public void e(String str) {
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.f44161e0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th2);
        }
    }

    public String e() {
        u uVarC = u.c();
        int i10 = a.f44191b[uVarC.a().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? i10 != 3 ? (i10 == 4 && !I()) ? "No Native Ad configurations found" : "" : uVarC.d() ? "init() had failed" : "init() not finished yet" : "init() had failed";
        }
        return "init() must be called first";
    }

    @Override // com.ironsource.T9
    public J9 f(String str) {
        J9 j9L;
        try {
            j9L = l(str);
            if (j9L == null) {
                try {
                    this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    j9L = i();
                } catch (Exception e10) {
                    e = e10;
                    C4462o4.d().a(e);
                    return j9L;
                }
            }
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + j9L, 1);
            return j9L;
        } catch (Exception e11) {
            e = e11;
            j9L = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // com.ironsource.Q4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean d(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.f r0 = r1.f44157c0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r2 = r0.b(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.d(java.lang.String):boolean");
    }

    @Override // com.ironsource.T9
    public void d() {
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        C4295e8.a().a((InterfaceC4298eb) null);
    }

    private void b(IronSource.a aVar) {
        int i10 = a.f44190a[aVar.ordinal()];
        if (i10 == 1) {
            d0();
        } else if (i10 == 2) {
            Z();
        } else {
            if (i10 != 3) {
                return;
            }
            U();
        }
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private boolean d(Ee ee2) {
        com.ironsource.mediationsdk.adquality.a aVarA = ee2.c().a();
        return this.f44171j0 == null && aVarA != null && aVarA.b() && AdQualityBridge.adQualityAvailable();
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        Rd rdF = this.f44174l.c().f();
        R4.a aVar = new R4.a("Mediation");
        if (rdF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, rdF, com.ironsource.mediationsdk.c.b(), this.f44175l0, n(), o(), new R4.b(Td.i(), aVar));
    }

    @Override // com.ironsource.Q4.b
    public void c(String str) {
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.f44173k0.a(str);
        try {
            if (!this.E) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.f44157c0;
            if (fVar == null) {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ironLog.info("onResume() is disabled");
                return;
            }
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th2) {
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th2);
            C4462o4.d().a(th2);
        }
    }

    public void c(@NotNull Context context) {
        C4540sf c4540sf = C4540sf.f45416a;
        c4540sf.b();
        if (!C()) {
            c4540sf.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.f44174l)) {
            c4540sf.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.g(context)) {
            c4540sf.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        C4653z9 c4653z9 = this.P;
        if (c4653z9 != null) {
            c4653z9.J();
        }
        Od od2 = this.Q;
        if (od2 != null) {
            od2.J();
        }
        F2 f22 = this.R;
        if (f22 != null) {
            f22.J();
            this.R.T();
        }
        new C4557tf().a(context, n(), this.f44174l.j(), LevelPlay.getSdkVersion(), this.f44174l.c().g().b(), g(), this.T);
        this.f44169i0 = true;
        c4540sf.c();
    }

    @Override // com.ironsource.T9
    public boolean b(String str) {
        try {
            R3 r32 = new R3();
            a(str, r32);
            if (r32.b()) {
                this.f44178o = str;
                Ib.U().q().a(new C4649z5(A5.SET_USER_ID, IronSourceUtils.a(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, r32.a().toString(), 2);
            return false;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, this.f44152a + ":setDynamicUserId(dynamicUserId:" + str + ")", e10);
            return false;
        }
    }

    @Override // com.ironsource.Q4.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.REWARDED_VIDEO).b(), this.f44175l0.a(str));
    }

    @Override // com.ironsource.Q4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).a(true).a(str2).b(), this.f44173k0.a(str));
    }

    private boolean c(Ee ee2) {
        return ee2 != null && ee2.p();
    }

    private void a(J1 j12) {
        X4 x42 = X4.f42026a;
        x42.c(j12.g());
        x42.a(j12.f());
        x42.a(j12.j());
        this.f44162f.a(j12);
    }

    public q b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f44166h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new q(activity, iSBannerSize);
    }

    public void b(q qVar) {
        a(qVar, "");
    }

    private boolean b(h.b bVar) {
        synchronized (this.f44153a0) {
            try {
                if (this.f44161e0 != null) {
                    return false;
                }
                this.f44153a0.put(bVar.e(), bVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.ironsource.mediationsdk.IronSource.a> a(android.content.Context r5, java.lang.String r6, boolean r7, com.ironsource.mediationsdk.IronSource.a... r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r6.<init>()     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r8 == 0) goto L10
            int r1 = r8.length     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L46
            goto L10
        Ld:
            r5 = move-exception
            goto Lb9
        L10:
            if (r7 == 0) goto L46
            boolean r7 = r4.G     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L1c
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            r4.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L23
        L1c:
            r4.D = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
        L23:
            boolean r7 = r4.H     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L2d
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL     // Catch: java.lang.Throwable -> Ld
            r4.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L34
        L2d:
            r4.E = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
        L34:
            boolean r7 = r4.I     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L3e
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.BANNER     // Catch: java.lang.Throwable -> Ld
            r4.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto La0
        L3e:
            r4.F = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.BANNER     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
            goto La0
        L46:
            int r7 = r8.length     // Catch: java.lang.Throwable -> Ld
            r1 = 0
        L48:
            if (r1 >= r7) goto La0
            r2 = r8[r1]     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r3 = com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L67
            boolean r3 = r4.H     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L5c
            r4.a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L67
        L5c:
            r4.E = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L67
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L67:
            com.ironsource.mediationsdk.IronSource$a r3 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L82
            boolean r3 = r4.G     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L77
            r4.a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L82
        L77:
            r4.D = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L82
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L82:
            com.ironsource.mediationsdk.IronSource$a r3 = com.ironsource.mediationsdk.IronSource.a.BANNER     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L9d
            boolean r3 = r4.I     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L92
            r4.a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L9d
        L92:
            r4.F = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L9d
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L9d:
            int r1 = r1 + 1
            goto L48
        La0:
            if (r5 == 0) goto Lb7
            boolean r7 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto Lac
            r7 = r5
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> Ld
            r4.e(r7)     // Catch: java.lang.Throwable -> Ld
        Lac:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            r7.updateAppContext(r5)     // Catch: java.lang.Throwable -> Ld
        Lb7:
            monitor-exit(r4)
            return r6
        Lb9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.IronSource$a[]):java.util.List");
    }

    Ee b(Context context, String str, b bVar) {
        synchronized (this.f44172k) {
            try {
                Ee ee2 = this.f44174l;
                if (ee2 != null) {
                    return new Ee(ee2);
                }
                Ee eeA = a(context, str, bVar);
                if (eeA == null || !eeA.q()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    eeA = a(context, n());
                    if (eeA != null) {
                        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(n(), str);
                        this.f44166h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + eeA.toString(), 1);
                        Ib.U().q().a(new C4649z5(A5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
                    }
                }
                if (eeA != null) {
                    this.f44174l = eeA;
                    IronSourceUtils.e(context, eeA.toString());
                    b(this.f44174l, context);
                    G9.i().c(true);
                    Td.i().c(true);
                    C4231ad.P.c(true);
                    Ib.U().q().c(true);
                }
                return eeA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Ee ee2, Context context) {
        b(ee2);
        a(ee2, context);
    }

    private void b(Ee ee2) {
        this.f44166h.setLoggerDebugLevel("console", ee2.c().b().h().a());
    }

    @Override // com.ironsource.T9
    public void b() {
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        C4606wd.a().a((InterfaceC4486pb) null);
    }

    private void a(IronSource.a aVar) {
        String str = aVar + " ad unit has already been initialized";
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.i(str);
    }

    @Override // com.ironsource.T9
    public String b(Context context) {
        String strI = this.f44156c.I(context);
        Ib.U().q().a(new C4649z5(A5.GET_ADVERTISING_ID, IronSourceUtils.b(false)));
        return !TextUtils.isEmpty(strI) ? strI : "";
    }

    private synchronized void a(boolean z10, boolean z11, boolean z12, IronSource.a... aVarArr) throws Throwable {
        Throwable th2;
        int i10;
        try {
            try {
                i10 = 0;
                for (IronSource.a aVar : aVarArr) {
                    try {
                        if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                            this.H = true;
                        } else if (aVar.equals(IronSource.a.BANNER)) {
                            this.I = true;
                        } else if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                            this.G = true;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (u.c().a() == u.d.INIT_FAILED) {
            try {
                if (this.f44168i != null) {
                    int length = aVarArr.length;
                    while (i10 < length) {
                        IronSource.a aVar2 = aVarArr[i10];
                        if (!this.f44187x.contains(aVar2)) {
                            a(aVar2, true);
                        }
                        i10++;
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        } else if (!C()) {
            JSONObject jSONObjectB = IronSourceUtils.b(z11);
            int length2 = aVarArr.length;
            while (i10 < length2) {
                IronSource.a aVar3 = aVarArr[i10];
                if (!this.f44187x.contains(aVar3)) {
                    this.f44187x.add(aVar3);
                    this.f44188y.add(aVar3);
                    try {
                        jSONObjectB.put(aVar3.toString(), true);
                    } catch (Exception e11) {
                        C4462o4.d().a(e11);
                        IronLog.INTERNAL.error(e11.toString());
                    }
                } else {
                    this.f44166h.log(IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                }
                i10++;
            }
            int i11 = this.C + 1;
            this.C = i11;
            a(z10, z11, i11, jSONObjectB, z12);
        } else {
            if (this.f44183t == null) {
                return;
            }
            try {
                new Jb().a(this.f44174l.c().b().e().b(), B());
            } catch (Exception e12) {
                C4462o4.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
            JSONObject jSONObjectB2 = IronSourceUtils.b(z11);
            for (IronSource.a aVar4 : aVarArr) {
                if (!this.f44187x.contains(aVar4)) {
                    this.f44187x.add(aVar4);
                    this.f44188y.add(aVar4);
                    try {
                        jSONObjectB2.put(aVar4.toString(), true);
                    } catch (Exception e13) {
                        C4462o4.d().a(e13);
                        IronLog.INTERNAL.error(e13.toString());
                    }
                    List<IronSource.a> list = this.f44183t;
                    if (list != null && list.contains(aVar4)) {
                        b(aVar4);
                    } else {
                        a(aVar4, false);
                    }
                } else {
                    a(aVar4);
                }
            }
            int i12 = this.C + 1;
            this.C = i12;
            try {
                a(z10, z11, i12, jSONObjectB2, z12);
            } catch (Throwable th6) {
                th = th6;
            }
            th2 = th;
            throw th2;
        }
    }

    private void b(A5 a52, JSONObject jSONObject) {
        Td.i().a(new C4649z5(a52, jSONObject));
    }

    public void b(boolean z10) {
        this.M = Boolean.valueOf(z10);
        com.ironsource.mediationsdk.c.b().b(z10);
        this.f44165g0.a(z10);
        Ib.U().q().a(new C4649z5(z10 ? A5.CONSENT_TRUE_CODE : A5.CONSENT_FALSE_CODE, IronSourceUtils.b(false)));
    }

    public void b(@NotNull String str, @NotNull JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.b().b(new x(str, jSONObject));
    }

    @Override // com.ironsource.V8
    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        if (Z9.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C4432ma.b().a(impressionDataListener);
            O7 o72 = this.N;
            if (o72 != null) {
                o72.b(impressionDataListener);
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    private void a(boolean z10, boolean z11, int i10, JSONObject jSONObject, boolean z12) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                sb2.append(String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z10) {
                sb2.append(StringUtils.COMMA);
                sb2.append(IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
            }
            sb2.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.f44156c.n())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
            jSONObject.put("sessionDepth", i10);
            if (z12) {
                if (z11) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Ib.U().q().a(new C4649z5(A5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(Ac ac2) {
        this.S = ac2;
    }

    public boolean a(boolean z10, Ee ee2) {
        a(ee2);
        if (C()) {
            return true;
        }
        synchronized (this.f44172k) {
            this.f44174l = ee2;
        }
        return b(ee2.h(), z10, ee2.c());
    }

    @Override // com.ironsource.Ic
    public void a(List<IronSource.a> list, boolean z10, S3 s32) {
        a(this.f44174l);
        b(list, z10, s32);
    }

    private void a(Ee ee2) {
        if (w() && d(ee2)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), n(), o(), new C4338h0(), ee2.c().b().h().a());
            this.f44171j0 = adQualityBridge;
            C4246ba c4246ba = this.A;
            if (c4246ba != null) {
                adQualityBridge.setSegment(c4246ba);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        E9 e9D = this.f44174l.c().d();
        R4.a aVar = new R4.a("Mediation");
        if (e9D.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, e9D, com.ironsource.mediationsdk.c.b(), this.f44173k0, n(), o(), new R4.b(G9.i(), aVar));
    }

    private int a(Rd rd2) {
        return (this.V || this.T || !rd2.k().e()) ? 1 : 2;
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f44174l.l().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Ic
    public void a() {
        if (this.J.booleanValue()) {
            this.J = Boolean.FALSE;
            n.a().b(IronSource.a.BANNER, new IronSourceError(603, "init() had failed"));
            this.K = null;
            this.L = null;
        }
        if (this.W) {
            this.W = false;
            n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.U) {
            this.U = false;
            n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.Z) {
            try {
                Iterator<h.d> it = this.Z.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.f44173k0.a(strE).onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.Z.clear();
            } finally {
            }
        }
        synchronized (this.f44155b0) {
            try {
                Iterator<h.d> it2 = this.f44155b0.values().iterator();
                while (it2.hasNext()) {
                    String strE2 = it2.next().e();
                    this.f44175l0.a(strE2).onRewardedVideoAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f44155b0.clear();
            } finally {
            }
        }
        synchronized (this.f44153a0) {
            try {
                for (h.b bVar : this.f44153a0.values()) {
                    ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                    if (iSDemandOnlyBannerLayoutG != null) {
                        iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.f44153a0.clear();
            } finally {
            }
        }
    }

    private void a(IronSource.a aVar, boolean z10) {
        int i10 = a.f44190a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.D) {
                Iterator<h.d> it = this.f44155b0.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.f44175l0.a(strE).onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f44155b0.clear();
                return;
            }
            if (this.T) {
                if (this.U) {
                    this.U = false;
                    n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z10 || L() || this.f44188y.contains(aVar)) {
                C4606wd.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (this.E) {
                Iterator<h.d> it2 = this.Z.values().iterator();
                while (it2.hasNext()) {
                    String strE2 = it2.next().e();
                    this.f44173k0.a(strE2).onInterstitialAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
                }
                this.Z.clear();
                return;
            }
            if (this.W) {
                this.W = false;
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        if (this.F) {
            for (h.b bVar : this.f44153a0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
            }
            this.f44153a0.clear();
            return;
        }
        if (this.J.booleanValue()) {
            this.J = Boolean.FALSE;
            n.a().b(IronSource.a.BANNER, new IronSourceError(602, "init() had failed"));
            this.K = null;
            this.L = null;
        }
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th2);
        }
    }

    public void a(C4246ba c4246ba) {
        this.A = c4246ba;
        Od od2 = this.Q;
        if (od2 != null) {
            od2.a(c4246ba);
        }
        O7 o72 = this.N;
        if (o72 != null) {
            o72.a(c4246ba);
        }
        C4653z9 c4653z9 = this.P;
        if (c4653z9 != null) {
            c4653z9.a(c4246ba);
        }
        y yVar = this.O;
        if (yVar != null) {
            yVar.a(c4246ba);
        }
        F2 f22 = this.R;
        if (f22 != null) {
            f22.a(c4246ba);
        }
        AdQualityBridge adQualityBridge = this.f44171j0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c4246ba);
        }
        G9.i().a(this.A);
        Td.i().a(this.A);
        C4231ad.P.a(this.A);
        Ib.U().q().a(this.A);
    }

    @Override // com.ironsource.T9
    public void a(boolean z10) {
        com.ironsource.mediationsdk.c.b().a(z10);
    }

    @Override // com.ironsource.T9
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, this.f44152a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.f44179p = new HashMap(map);
                C4649z5 c4649z5 = new C4649z5(A5.SET_RV_SERVER_PARAMS, IronSourceUtils.b(false));
                c4649z5.a(IronSourceConstants.EVENTS_EXT1, map.toString());
                Td.i().a(c4649z5);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                this.f44166h.logException(IronSourceLogger.IronSourceTag.API, this.f44152a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e10);
            }
        }
    }

    @Override // com.ironsource.Q4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.a.REWARDED_VIDEO).b(), this.f44175l0.a(str));
    }

    void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
        }
        if (!this.G) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.D) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        u.d dVarA = u.c().a();
        if (dVarA == u.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError ironSourceErrorA = dVar.a();
        if (ironSourceErrorA != null) {
            if (ironSourceErrorA.getErrorCode() == 1060) {
                b(A5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(ironSourceErrorA.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ironSourceErrorA);
            return;
        }
        e(dVar.d());
        if (dVarA == u.d.INIT_IN_PROGRESS) {
            if (u.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f44155b0) {
                this.f44155b0.put(strE, dVar);
            }
            if (TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(A5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!M()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.f44155b0) {
            try {
                com.ironsource.mediationsdk.demandOnly.k kVar = this.f44159d0;
                if (kVar == null) {
                    this.f44155b0.put(strE, dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        b(A5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                kVar.a(dVar);
                return;
            } finally {
            }
        }
        C4462o4.d().a(th2);
        IronLog.API.error(th2.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
    }

    @Override // com.ironsource.Q4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.f44175l0.a(str);
        try {
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e10.getMessage()));
            }
        }
        if (!this.D) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f44159d0;
        if (kVar == null) {
            ironLog.error("Rewarded video was not initiated");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was not initiated"));
        } else {
            kVar.b(str);
        }
    }

    @Override // com.ironsource.Q4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f44175l0.a(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.Q4.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).b(), this.f44173k0.a(str));
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
            if (!this.H) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.E) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(A5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ironSourceErrorA);
                return;
            }
            e(dVar.d());
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (u.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.Z) {
                        this.Z.put(dVar.e(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.e())) {
                        a(A5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                }
                return;
            }
            if (!E()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.Z) {
                try {
                    com.ironsource.mediationsdk.demandOnly.f fVar = this.f44157c0;
                    if (fVar == null) {
                        this.Z.put(dVar.e(), dVar);
                        if (!TextUtils.isEmpty(dVar.b())) {
                            a(A5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                        }
                        return;
                    }
                    fVar.a(dVar);
                } finally {
                }
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
        }
    }

    @Override // com.ironsource.Q4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f44173k0.a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.Q4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f44166h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f44166h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public void a(q qVar, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.F) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.a.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (qVar != null && !qVar.b()) {
            if (!this.I) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
                n.a().b(IronSource.a.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
                return;
            }
            if (qVar.getSize().getDescription().equals("CUSTOM") && (qVar.getSize().getWidth() <= 0 || qVar.getSize().getHeight() <= 0)) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
                n.a().b(IronSource.a.BANNER, ErrorBuilder.unsupportedBannerSize(""));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.a.BANNER, new IronSourceError(600, "Init() had failed"));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (u.c().d()) {
                    this.f44166h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    n.a().b(IronSource.a.BANNER, new IronSourceError(601, "Init() had failed"));
                    return;
                } else {
                    this.K = qVar;
                    this.J = Boolean.TRUE;
                    this.L = str;
                    return;
                }
            }
            if (!z()) {
                this.f44166h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                n.a().b(IronSource.a.BANNER, new IronSourceError(615, "the server response does not contain banner data"));
                return;
            }
            y yVar = this.O;
            if (yVar == null && this.R == null) {
                this.K = qVar;
                this.J = Boolean.TRUE;
                this.L = str;
                return;
            } else if (this.X) {
                this.R.a(qVar, new C4283dd(k(str)));
                return;
            } else {
                yVar.a(qVar, k(str));
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadBanner can't be called - ");
        sb2.append(qVar == null ? "banner layout is null " : "banner layout is destroyed");
        String string = sb2.toString();
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, string, 3);
        n.a().b(IronSource.a.BANNER, ErrorBuilder.buildLoadFailedError(string));
    }

    public void a(q qVar) {
        F2 f22;
        this.f44166h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (this.X && (f22 = this.R) != null) {
                f22.a(qVar);
                return;
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.a(qVar);
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            this.f44166h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th2);
        }
    }

    @Override // com.ironsource.Q4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b bVarA = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.a.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(u.c().a());
        if (ironSourceErrorA2 != null) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!z()) {
            this.f44166h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.f44161e0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(h.b bVar) {
        if (u.c().a() != u.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f44153a0) {
            this.f44153a0.put(bVar.e(), bVar);
        }
        return true;
    }

    @Nullable
    private IronSourceError a(u.d dVar) {
        if (!this.I) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.F) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == u.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == u.d.INIT_IN_PROGRESS && u.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public Ee a(Context context, String str) {
        if (!C4313f9.a(context)) {
            return null;
        }
        D3 d3C = C4313f9.c(context);
        String strD = d3C.d();
        String strF = d3C.f();
        String strE = d3C.e();
        if (!strD.equals(str)) {
            return null;
        }
        Ee ee2 = new Ee(context, strD, strF, strE);
        ee2.a(Ee.a.CACHE);
        return ee2;
    }

    private Ee a(Context context, String str, b bVar) {
        Exception exc;
        Ee ee2 = null;
        if (!IronSourceUtils.g(context)) {
            return null;
        }
        try {
            String strB = b(context);
            if (TextUtils.isEmpty(strB)) {
                strB = this.f44156c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strB;
            C4246ba c4246ba = this.A;
            String strA = C4311f7.a(Ge.a(context, n(), str, str2, p(), this.T, c4246ba != null ? c4246ba.f() : null, B()), C4279d9.a().toString(), bVar);
            if (strA == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strA);
                String strOptString = jSONObject.optString("response", null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strA = a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strA)) {
                    ironLog.warning("encoded response invalid - return null");
                    S();
                    return null;
                }
            }
            Ee ee3 = new Ee(context, n(), str, strA);
            try {
                ee3.a(Ee.a.SERVER);
                if (ee3.q()) {
                    return ee3;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e10) {
                exc = e10;
                ee2 = ee3;
                C4462o4.d().a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return ee2;
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    private String a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return K9.d(C4427m5.b().c(), str);
        }
        return K9.b(C4427m5.b().c(), str);
    }

    private void a(Ee ee2, Context context) {
        boolean zL = x() ? ee2.c().b().b().l() : false;
        boolean zL2 = L() ? ee2.c().f().m().l() : false;
        boolean zL3 = D() ? ee2.c().d().i().l() : false;
        boolean zL4 = y() ? ee2.c().c().g().l() : false;
        boolean zL5 = H() ? ee2.c().e().g().l() : false;
        C4249bd c4249bdI = ee2.c().b().i();
        boolean zI = c4249bdI.i();
        if (zL) {
            a((AbstractC4511r3) Ib.U().q(), ee2.c().b().b(), context, ee2, true);
        }
        if (zL2) {
            a((AbstractC4511r3) Td.i(), ee2.c().f().m(), context, ee2, true);
        } else {
            Td.i().a(false);
        }
        if (zL3) {
            a((AbstractC4511r3) G9.i(), ee2.c().d().i(), context, ee2, true);
        } else if (zL4) {
            a((AbstractC4511r3) G9.i(), ee2.c().c().g(), context, ee2, true);
        } else if (zL5) {
            a((AbstractC4511r3) G9.i(), ee2.c().e().g(), context, ee2, true);
        } else {
            G9.i().a(false);
        }
        C4231ad c4231ad = C4231ad.P;
        c4231ad.a(zI);
        if (zI) {
            c4231ad.b(c4249bdI.j(), context);
            c4231ad.b(c4249bdI.l(), context);
            c4231ad.c(c4249bdI.k(), context);
            c4231ad.b(c4249bdI.g());
            c4231ad.c(c4249bdI.h());
        }
    }

    private void a(AbstractC4511r3 abstractC4511r3, G1 g12, Context context, Ee ee2, boolean z10) {
        abstractC4511r3.a(z10);
        abstractC4511r3.a(g12.c(), context);
        abstractC4511r3.b(g12.d(), context);
        abstractC4511r3.a(g12.f());
        abstractC4511r3.d(g12.e());
        abstractC4511r3.b(g12.a());
        abstractC4511r3.b(g12.i(), context);
        abstractC4511r3.c(g12.h(), context);
        abstractC4511r3.a(g12.j(), context);
        abstractC4511r3.d(g12.g(), context);
        abstractC4511r3.a(ee2.c().b().j());
        abstractC4511r3.b(g12.k());
        abstractC4511r3.c(g12.b());
    }

    private void a(String str, R3 r32) {
        if (a(str, 1, 128)) {
            return;
        }
        r32.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    @Override // com.ironsource.T9
    public void a(Context context, boolean z10) {
        this.f44185v = context;
        this.f44186w = Boolean.valueOf(z10);
        C4653z9 c4653z9 = this.P;
        if (c4653z9 != null) {
            c4653z9.a(context, z10);
        }
        if (this.V) {
            Od od2 = this.Q;
            if (od2 != null) {
                od2.a(context, z10);
            }
        } else {
            O7 o72 = this.N;
            if (o72 != null) {
                o72.a(context, z10);
            }
        }
        Ib.U().q().a(new C4649z5(A5.SHOULD_TRACK_NETWORK_STATE, IronSourceUtils.b(false)));
    }

    boolean a(C4324g3 c4324g3) {
        return this.f44160e.c(ContextProvider.getInstance().getApplicationContext(), c4324g3, IronSource.a.BANNER);
    }

    C4351hd.b a(C4283dd c4283dd) {
        return this.f44160e.a(ContextProvider.getInstance().getApplicationContext(), c4283dd, IronSource.a.REWARDED_VIDEO);
    }

    private void a(A5 a52, JSONObject jSONObject) {
        G9.i().a(new C4649z5(a52, jSONObject));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
            }
        }
    }

    public void a(String str, List<String> list) {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (C() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C4432ma.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapD = com.ironsource.mediationsdk.c.b().d();
            concurrentHashMapD.putAll(C4432ma.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapD.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.f44167h0.a(jSONObject);
            this.f44165g0.a(jSONObject);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("got the following error " + e10.getMessage());
        }
        Ib.U().q().a(new C4649z5(C() ? A5.SET_META_DATA_AFTER_INIT : A5.SET_META_DATA, IronSourceUtils.a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.Q4
    @Nullable
    public String a(@NotNull Context context) {
        String str;
        EnumC4556te enumC4556teA;
        String strC;
        Rf rfK;
        R4 r4K = k();
        EnumC4556te enumC4556te = null;
        try {
            enumC4556teA = C4573ue.f45559a.a();
        } catch (Exception unused) {
            str = null;
        }
        try {
            r4K.a(A5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, enumC4556teA);
        } catch (Exception unused2) {
            str = null;
            enumC4556te = enumC4556teA;
            r4K.a(A5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, enumC4556te);
            enumC4556teA = enumC4556te;
            strC = str;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            r4K.a(A5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (EnumC4556te) null);
            return null;
        }
        if (enumC4556teA == EnumC4556te.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            r4K.a(A5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (EnumC4556te) null);
            return null;
        }
        u.c().g();
        Ee ee2 = this.f44174l;
        boolean zE = (ee2 == null || (rfK = ee2.c().b().k()) == null) ? true : rfK.e();
        this.f44165g0.b(context);
        JSONObject jSONObjectA = new Qf().a(context);
        d.b().a(jSONObjectA, true);
        if (zE) {
            strC = K9.a(jSONObjectA.toString());
        } else {
            strC = K9.c(jSONObjectA.toString());
        }
        if (enumC4556teA == EnumC4556te.INITIATED) {
            IronLog.INTERNAL.verbose("external token parameters: " + jSONObjectA);
        }
        if (TextUtils.isEmpty(strC)) {
            r4K.a(A5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, enumC4556teA);
        }
        r4K.a(A5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, enumC4556teA);
        return strC;
    }

    @Override // com.ironsource.V8
    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        if (Z9.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C4432ma.b().b(impressionDataListener);
            O7 o72 = this.N;
            if (o72 != null) {
                o72.a(impressionDataListener);
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.a(impressionDataListener);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (Z9.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && Z9.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f44163f0.a(str, jSONObject);
        }
    }
}
