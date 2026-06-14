package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsClient;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.AbstractC3845l1;
import com.inmobi.media.EnumC3571a6;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3845l1 extends AbstractC3686ei implements E2, InterfaceC3889mk, InterfaceC4118w0, ro {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final Lazy B;
    public boolean C;
    public final Lazy D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f38916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f38917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f38918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeoutConfigurations f38919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f38920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4178ya f38921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f38922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3903n9 f38923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f38924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4093v0 f38926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdResponse f38927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3939ok f38928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f38929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f38931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TreeSet f38932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f38933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f38934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C3591b0 f38935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3704fa f38936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3906nc f38937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f38938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f38939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3994r1 f38940z;

    public AbstractC3845l1(Context context, C4093v0 adPlacement, Dk dk) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f38915a = string;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.f38917c = (AdConfig) Y3.f38021a.a(AdConfig.class);
        this.f38921g = (C4178ya) AbstractC4203za.f40039a.getValue();
        this.f38922h = new ArrayList();
        this.f38926l = adPlacement;
        this.f38931q = -1L;
        this.f38932r = new TreeSet();
        this.f38938x = new Handler(Looper.getMainLooper());
        this.f38939y = new LinkedHashMap();
        this.f38940z = new C3994r1(this);
        this.B = lf.i.a(new Function0() { // from class: w3.i9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3845l1.d(this.f107102b);
            }
        });
        this.f38918d = new WeakReference(context);
        this.f38920f = new WeakReference(dk);
        Ab ab2 = Jh.f37148a;
        Jh.a(dk, this.f38923i);
        WeakReference weakReference = this.f38920f;
        String strL = l();
        AdSet adSetR = r();
        this.f38935u = new C3591b0(weakReference, strL, adSetR != null ? adSetR.getIsRewarded() : false);
        L();
        this.D = lf.i.a(new Function0() { // from class: w3.j9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3845l1.e(this.f107126b);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0017, B:10:0x001d, B:13:0x0028, B:12:0x0023), top: B:21:0x0017, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.inmobi.media.AbstractC3845l1 r3) {
        /*
            com.inmobi.media.Cf r0 = com.inmobi.media.Bf.f36629a
            android.content.Context r1 = r3.n()
            com.inmobi.media.core.config.models.AdConfig r3 = r3.f38917c
            r0.getClass()
            boolean r2 = com.iab.omid.library.inmobi.Omid.isActive()     // Catch: java.lang.Exception -> L43
            if (r2 != 0) goto L15
            com.iab.omid.library.inmobi.Omid.activate(r1)     // Catch: java.lang.Exception -> L43
            return
        L15:
            if (r3 == 0) goto L23
            com.inmobi.media.core.config.models.AdConfig$ViewabilityConfig r3 = r3.getViewability()     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L23
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r3 = r3.getOmidConfig()     // Catch: java.lang.Exception -> L37
            if (r3 != 0) goto L28
        L23:
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r3 = new com.inmobi.media.core.config.models.AdConfig$OmidConfig     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
        L28:
            java.lang.String r3 = r3.getPartnerKey()     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r0.a()     // Catch: java.lang.Exception -> L37
            com.iab.omid.library.inmobi.adsession.Partner r3 = com.iab.omid.library.inmobi.adsession.Partner.createPartner(r3, r1)     // Catch: java.lang.Exception -> L37
            r0.f36677b = r3     // Catch: java.lang.Exception -> L37
            return
        L37:
            r3 = move-exception
            kotlin.Lazy r0 = com.inmobi.media.P9.f37527a     // Catch: java.lang.Exception -> L43
            com.inmobi.media.L2 r0 = new com.inmobi.media.L2     // Catch: java.lang.Exception -> L43
            r0.<init>(r3)     // Catch: java.lang.Exception -> L43
            com.inmobi.media.P9.a(r0)     // Catch: java.lang.Exception -> L43
            goto L49
        L43:
            r3 = move-exception
            kotlin.Lazy r0 = com.inmobi.media.P9.f37527a
            com.inmobi.media.AbstractC3779i9.a(r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3845l1.c(com.inmobi.media.l1):void");
    }

    public static final ko d(AbstractC3845l1 abstractC3845l1) {
        return new ko(abstractC3845l1.f38923i);
    }

    public final void A() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "initTelemetry " + this);
        }
        this.f38939y.put("AdImpressionSuccessful", this.f38940z);
    }

    public final boolean B() throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f38916b));
        }
        if (!W6.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (E()) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "Some of the dependency libraries for " + l() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b10 = this.f38916b;
        if (b10 == 1) {
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n93.b("l1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b10 != 7) {
            return false;
        }
        C3903n9 c3903n94 = this.f38923i;
        if (c3903n94 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n94.b("l1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void C() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "load  " + this);
        }
        C3994r1 c3994r1 = this.f38940z;
        c3994r1.getClass();
        c3994r1.f39425c = SystemClock.elapsedRealtime();
        a(new Function0() { // from class: w3.l9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3845l1.a(this.f107168b);
            }
        }, new Function1() { // from class: w3.m9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC3845l1.a(this.f107188b, (EnumC3571a6) obj);
            }
        });
    }

    public final void D() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "makeUnitActive " + this);
        }
        this.f38925k = false;
    }

    public boolean E() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "missingPrerequisitesForAd " + this);
        }
        try {
            kotlin.jvm.internal.v0.b(CustomTabsClient.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void F() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onDidParseAfterFetch " + this);
        }
        c((byte) 2);
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.n9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3845l1.c(this.f107207b);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.Le G() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3845l1.G():com.inmobi.media.Le");
    }

    public final void H() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "printPublisherTestId " + this);
        }
        AbstractC4213zk.b();
    }

    public void I() throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "resetContainersForNextAd " + this);
        }
        int size = this.f38922h.size();
        int i10 = this.f38930p;
        if (size <= i10 || this.f38922h.get(i10) == null) {
            return;
        }
        a(this.f38930p, false);
    }

    public final void J() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void K() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "setMonetizationContext " + this);
        }
        C4093v0 c4093v0 = this.f38926l;
        c4093v0.getClass();
        Intrinsics.checkNotNullParameter("activity", "<set-?>");
        c4093v0.f39719i = "activity";
    }

    public final void L() {
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        this.f38919e = y();
        c((byte) 0);
        this.f38924j = new Handler(Looper.getMainLooper());
        this.f38928n = new C3939ok(this);
    }

    public final boolean M() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null && 4 == this.f38916b && !z()) {
            AbstractC3721g1 abstractC3721g1M = m();
            if (abstractC3721g1M != null) {
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n92.a("l1", "ad is ready - load success");
                }
                d(abstractC3721g1M);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (adB == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n93.b("l1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.f38916b) {
            if (!z()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C3903n9 c3903n94 = this.f38923i;
            if (c3903n94 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n94.b("l1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C3903n9 c3903n95 = this.f38923i;
        if (c3903n95 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n95.b("l1", "ad no longer available. state - " + ((int) this.f38916b));
        }
        return true;
    }

    public final void N() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        int i10;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "startLoadingHTMLAd " + this);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = null;
        try {
            AdSet adSetR = r();
            com.inmobi.media.ads.network.common.model.Ad ad3 = (adSetR == null || (i10 = this.f38929o) < 0 || i10 >= adSetR.getAds().size()) ? null : adSetR.getAds().get(this.f38929o);
            d(this.f38929o);
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                AdSet adSetR2 = r();
                c3903n92.a("l1", "Loading ad with impressionId : " + ((adSetR2 == null || (ads = adSetR2.getAds()) == null || (ad2 = ads.get(this.f38929o)) == null) ? null : ad2.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38929o);
            if (ad3 != null) {
                Gg pubContent = ad3.getPubContent();
                if (pubContent instanceof U7) {
                    C3903n9 c3903n93 = this.f38923i;
                    if (c3903n93 != null) {
                        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                        c3903n93.a("l1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                        gestureDetectorOnGestureListenerC3635ci2.h(((U7) pubContent).f37830a);
                    }
                } else if (pubContent instanceof V7) {
                    C3903n9 c3903n94 = this.f38923i;
                    if (c3903n94 != null) {
                        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                        c3903n94.a("l1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3635ci2 != null) {
                        gestureDetectorOnGestureListenerC3635ci2.j(StringsKt.v1(((V7) pubContent).f37898a).toString());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC3635ci2 == null || !Intrinsics.areEqual(s(), "htmlUrl")) {
                return;
            }
            m(gestureDetectorOnGestureListenerC3635ci2);
        } catch (Exception e10) {
            C3903n9 c3903n95 = this.f38923i;
            if (c3903n95 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n95.a("l1", "Loading ad markup into container encountered an unexpected error: " + e10.getMessage());
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
            int i11 = this.f38929o;
            if (i11 >= 0 && i11 < this.f38922h.size()) {
                gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38929o);
            }
            a(gestureDetectorOnGestureListenerC3635ci, (short) 2135);
        }
    }

    public final void O() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdLoadCalled " + this);
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final void P() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + s() + " " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f38940z.f39425c;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            map.put("retryCount", Integer.valueOf(c3704fa.f38569b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final void Q() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdShowCalled " + this);
        }
        C3994r1 c3994r1 = this.f38940z;
        c3994r1.getClass();
        c3994r1.f39428f = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f38940z.f39431i;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final void R() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdShowSuccess " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f38940z.f39428f;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final void S() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitRenderSuccessEvent ADunit markuptype : " + s() + " " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f38940z.f39429g;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            map.put("retryCount", Integer.valueOf(c3704fa.f38569b));
        }
        map.put("plType", Byte.valueOf(t()));
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("RenderSuccess", map);
    }

    public final long T() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "timeSincePodShow " + this);
        }
        if (this.f38933s) {
            return System.currentTimeMillis() - this.f38931q;
        }
        return -1L;
    }

    public final void U() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.b("l1", "ad unloaded");
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.d("l1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public void a(GestureDetectorOnGestureListenerC3635ci renderView, boolean z10) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onRenderProcessGone didCrash=" + z10 + " state=" + ((int) this.f38916b));
        }
        byte b10 = this.f38916b;
        if (b10 == 0) {
            short s10 = z10 ? (short) 2214 : (short) 2213;
            J();
            renderView.a(z10, s10);
            return;
        }
        if (b10 == 1) {
            short s11 = z10 ? (short) 2216 : (short) 2215;
            J();
            c(s11);
            AbstractC3721g1 abstractC3721g1M = m();
            if (abstractC3721g1M != null) {
                abstractC3721g1M.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 3) {
            renderView.a(z10, z10 ? (short) 2226 : (short) 2225);
            return;
        }
        if (b10 == 2) {
            J();
            c(z10 ? (short) 2218 : (short) 2217);
            AbstractC3721g1 abstractC3721g1M2 = m();
            if (abstractC3721g1M2 != null) {
                abstractC3721g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 4 || b10 == 6 || b10 == 7 || b10 != 8) {
            return;
        }
        renderView.a(z10, z10 ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i10) {
        Iterable iterableEmptyList;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        AdSet adSetR = r();
        if (adSetR == null || (ads3 = adSetR.getAds()) == null || (iterableEmptyList = CollectionsKt.getIndices(ads3)) == null) {
            iterableEmptyList = CollectionsKt.emptyList();
        }
        if (CollectionsKt.contains(iterableEmptyList, Integer.valueOf(i10))) {
            AdSet adSetR2 = r();
            if (adSetR2 == null || (ads2 = adSetR2.getAds()) == null) {
                return null;
            }
            return ads2.get(i10);
        }
        AdSet adSetR3 = r();
        if (adSetR3 == null || (ads = adSetR3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(AbstractC3721g1 abstractC3721g1) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC3721g1);
        this.f38920f = weakReference;
        AdSet adSetR = r();
        C3591b0 c3591b0 = new C3591b0(weakReference, "int", adSetR != null ? adSetR.getIsRewarded() : false);
        this.f38935u = c3591b0;
        C3903n9 logger = this.f38923i;
        if (logger != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3591b0.f38235f = logger;
        }
    }

    public final void f() throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "destroyAllContainer " + this);
        }
        int size = this.f38922h.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(i10, true);
        }
    }

    public final void g() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.d("l1", "AdUnit " + this + " state - LOADING");
            }
            H();
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            if (((RootConfig) Y3.f38021a.a(RootConfig.class)).getMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C3903n9 c3903n93 = this.f38923i;
                if (c3903n93 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n93.b("l1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.f38921g.a(this.f38915a, new C3746h1(this, null));
                C3903n9 c3903n94 = this.f38923i;
                if (c3903n94 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n94.a("l1", "Fresh ad requested");
                }
            }
        } catch (Exception e10) {
            C3903n9 c3903n95 = this.f38923i;
            if (c3903n95 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n95.b("l1", "Load failed with unexpected error: " + e10.getMessage());
            }
            Lazy lazy = P9.f37527a;
            P9.a(new L2(e10));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "fireAdServedBeacon " + this);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciI = i();
        if (gestureDetectorOnGestureListenerC3635ciI == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3635ciI.t();
    }

    public final GestureDetectorOnGestureListenerC3635ci i() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "adMarkupContainer getter " + this);
        }
        byte b10 = this.f38916b;
        String strS = s();
        if (Intrinsics.areEqual(strS, "html")) {
            if (b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
                return null;
            }
            return q();
        }
        if (!Intrinsics.areEqual(strS, "htmlUrl") || b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
            return null;
        }
        return q();
    }

    public final AdMetaInfo j() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null) {
            return new AdMetaInfo(adB.getCreativeId(), adB.getTransaction());
        }
        return null;
    }

    public HashMap k() {
        return new HashMap();
    }

    public abstract String l();

    public final void l(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        int iIndexOf = this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.b("l1", "fireLoadAdTokenUrlFailed : " + iIndexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String url : AbstractC4186yi.a(adB, "load_ad_token_url_failure")) {
                C4121w3 c4121w3 = C4121w3.f39816a;
                C3903n9 c3903n92 = this.f38923i;
                Intrinsics.checkNotNullParameter(url, "url");
                C4121w3.a(url, true, c3903n92);
            }
        }
    }

    public final AbstractC3721g1 m() {
        C3903n9 c3903n9;
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.c("l1", "adUnitEventListener getter " + this);
        }
        AbstractC3721g1 abstractC3721g1 = (AbstractC3721g1) this.f38920f.get();
        if (abstractC3721g1 == null && (c3903n9 = this.f38923i) != null) {
            c3903n9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC3721g1;
    }

    public final Context n() {
        WeakReference weakReference = this.f38918d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad o() {
        return this.f38933s ? b(this.f38929o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.f38933s ? b(this.f38930p) : b(0);
    }

    public abstract GestureDetectorOnGestureListenerC3635ci q();

    public void q(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onAdUnloadedAfterShowSuccess");
        }
        renderView.m();
        b((byte) 4);
    }

    public final AdSet r() {
        List<AdSet> adSets;
        AdResponse adResponse = this.f38927m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) CollectionsKt.firstOrNull((List) adSets);
    }

    public final String s() {
        String markupType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        return (adB == null || (markupType = adB.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte t();

    public final String u() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "getPodAdContext " + this);
        }
        if (this.f38933s) {
            return this.f38934t;
        }
        return null;
    }

    public final JSONArray v() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f38932r.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long w() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "getShowTimeStamp " + this);
        }
        if (this.f38933s) {
            return this.f38931q;
        }
        return -1L;
    }

    public final String x() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        com.inmobi.media.ads.network.common.model.Ad ad2 = (adSetR == null || (ads = adSetR.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull((List) ads);
        return (ad2 == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations y() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.f38917c;
        Intrinsics.checkNotNull(adConfig);
        return adConfig.getTimeouts();
    }

    public final boolean z() {
        AdConfig.CacheConfig cacheConfig;
        C3903n9 c3903n9;
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB == null) {
            return false;
        }
        AdConfig adConfig = this.f38917c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(l())) != null) {
            z = ((adB.getExpiryTimestampInMillis() > (-1L) ? 1 : (adB.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + adB.getInsertionTimestampInMillis() : adB.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (z && (c3903n9 = this.f38923i) != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n9.b("l1", "Top ad has expired, failing show of ad.");
            }
        }
        return z;
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void k(GestureDetectorOnGestureListenerC3635ci renderView) throws JSONException {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        byte b10 = this.f38916b;
        if (b10 == 2) {
            U();
            b((byte) 1);
            AbstractC3721g1 abstractC3721g1M = m();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (abstractC3721g1M != null) {
                abstractC3721g1M.a(this, inMobiAdRequestStatus);
            } else {
                C3903n9 c3903n9 = this.f38923i;
                if (c3903n9 != null) {
                    c3903n9.a();
                }
            }
            c((short) 2238);
            renderView.b();
            return;
        }
        if (b10 == 4) {
            p(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b10 == 6 || b10 == 7) {
                q(renderView);
                return;
            }
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "onUnloadCalled - invalid state - " + ((int) this.f38916b));
            }
        }
    }

    public final int n(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.f38933s) {
            return -1;
        }
        int iIndexOf = this.f38922h.indexOf(renderView);
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.c("l1", "getCurrentRenderingPodAdIndex " + iIndexOf);
        }
        return iIndexOf;
    }

    public final void d(int i10) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "initializeHtmlAdContainer " + this);
        }
        Context contextN = n();
        if (contextN == null) {
            return;
        }
        try {
            if (this.f38922h.get(i10) != null && ((gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(i10)) == null || !gestureDetectorOnGestureListenerC3635ci.M.get())) {
                return;
            }
            com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
            C3919o0 c3919o0A = a(i10);
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = ((ko) this.B.getValue()).a(new Di("adUnit-" + i10, "default"), contextN, (short) 0, c3919o0A, this.f38917c);
            a(gestureDetectorOnGestureListenerC3635ciA, c3919o0A.f39138p);
            this.f38922h.set(i10, gestureDetectorOnGestureListenerC3635ciA);
            gestureDetectorOnGestureListenerC3635ciA.a(this);
            gestureDetectorOnGestureListenerC3635ciA.a(adB);
        } catch (Exception e10) {
            a((GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(this.f38929o), (short) 2136);
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.a("l1", "Exception while initializing WebView", e10);
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void h(final GestureDetectorOnGestureListenerC3635ci renderView) {
        Handler handler;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.f38925k || n() == null || (handler = this.f38924j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: w3.o9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3845l1.a(this.f107226b, renderView);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public void j(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "RenderView visible, for index " + this.f38922h.indexOf(renderView) + " " + this);
        }
    }

    public final void m(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        int iIndexOf = this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String url : AbstractC4186yi.a(adB, "load_ad_token_url")) {
                C4121w3 c4121w3 = C4121w3.f39816a;
                C3903n9 c3903n92 = this.f38923i;
                Intrinsics.checkNotNullParameter(url, "url");
                C4121w3.a(url, true, c3903n92);
            }
        }
    }

    public void o(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        Gh gh2;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "Render view signaled ad ready, for index " + this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci) + " " + this);
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.a("l1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 == null || (gh2 = c3903n93.f39085a) == null) {
            return;
        }
        gh2.a();
    }

    public void p(GestureDetectorOnGestureListenerC3635ci renderView) {
        int iN;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.f38933s && (iN = n(renderView)) > this.f38930p) {
            this.f38932r.remove(Integer.valueOf(iN));
        } else {
            U();
        }
    }

    public final void b(AbstractC3721g1 abstractC3721g1) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC3721g1.b();
    }

    public final void b(InMobiAdRequestStatus requestStatus, short s10) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "onAdFetchFailed " + this);
        }
        if (!this.f38925k && n() != null && this.f38916b != 3) {
            a(requestStatus, s10);
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.b("l1", "callback ignored - isDestroyed - " + this.f38925k + " context - " + n() + " state- " + ((int) this.f38916b));
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void i(final GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.f38925k && n() != null) {
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.g9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3845l1.b(this.f107066b, renderView);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void e() throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "clearAdPods " + this);
        }
        if (this.f38933s) {
            f();
            this.f38922h.clear();
            this.f38929o = 0;
            this.f38930p = 0;
            this.f38932r.clear();
        }
    }

    public final void c(byte b10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.d("l1", "STATE UPDATE: from " + ((int) this.f38916b) + " to " + ((int) b10));
        }
        this.f38916b = b10;
    }

    public final boolean c(int i10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "getAllowAutoRedirectionForIndex " + this + " index - " + i10);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
        return adB != null && adB.getAllowAutoRedirection();
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z10, short s10) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.b("l1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f38916b == 1 && z10) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "load failed - " + ((int) s10));
            }
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n93.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.a(this, requestStatus);
        } else {
            C3903n9 c3903n94 = this.f38923i;
            if (c3903n94 != null) {
                c3903n94.a();
            }
        }
        if (s10 != 0) {
            c(s10);
        }
    }

    public final void c(AbstractC3721g1 listener) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onFetchSuccess " + this);
        }
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f38940z.f39430h;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("metadataBlob", x());
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            map.put("retryCount", Integer.valueOf(c3704fa.f38569b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        c("ParseSuccess", map);
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n93.a("l1", "callback - onAdFetchSuccess");
        }
        listener.b(adMetaInfoJ);
    }

    public final void e(int i10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "resetCurrentRenderingIndex " + this);
        }
        this.f38930p = i10;
    }

    public static final void a(AbstractC3845l1 abstractC3845l1, W w10) {
        abstractC3845l1.getClass();
        if (w10 instanceof C3731gb) {
            C3994r1 c3994r1 = abstractC3845l1.f38940z;
            c3994r1.getClass();
            c3994r1.f39426d = SystemClock.elapsedRealtime();
            return;
        }
        if (w10 instanceof If) {
            C3994r1 c3994r12 = abstractC3845l1.f38940z;
            c3994r12.getClass();
            c3994r12.f39430h = SystemClock.elapsedRealtime();
        } else {
            if (w10 instanceof Oi) {
                Map map = ((Oi) w10).f37504a;
                Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3845l1.f38940z.f39426d)), TuplesKt.to("networkType", C4148x5.m()), TuplesKt.to("plId", Long.valueOf(abstractC3845l1.f38926l.f39711a)));
                mapMutableMapOf.putAll(map);
                String str = abstractC3845l1.f38926l.f39716f;
                if (str != null) {
                    mapMutableMapOf.put("plType", str);
                }
                String str2 = abstractC3845l1.f38926l.f39715e;
                if (str2 != null) {
                    mapMutableMapOf.put("adType", str2);
                }
                abstractC3845l1.b("ServerFill", mapMutableMapOf);
                return;
            }
            throw new lf.m();
        }
    }

    public static final po e(AbstractC3845l1 abstractC3845l1) {
        com.inmobi.media.ads.network.common.model.Ad adB = abstractC3845l1.b(0);
        if (adB == null || abstractC3845l1.z()) {
            adB = null;
        }
        C3903n9 c3903n9 = abstractC3845l1.f38923i;
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        return new po(adB, c3903n9);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void g(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "RenderView completed loading ad content, for index " + this.f38922h.indexOf(renderView) + " " + this);
        }
    }

    public final void d(AbstractC3721g1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "onLoadSuccess " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n93.a("l1", "callback - onAdLoadSucceeded");
        }
        listener.c(adMetaInfoJ);
    }

    public static final void b(AbstractC3845l1 abstractC3845l1, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        abstractC3845l1.o(gestureDetectorOnGestureListenerC3635ci);
    }

    public final void b(String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "setPodAdContext " + this);
        }
        if (this.f38933s) {
            this.f38934t = podAdContext;
        }
    }

    public static final void b(AbstractC3845l1 abstractC3845l1) {
        if (6 == abstractC3845l1.f38916b) {
            abstractC3845l1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void b(HashMap rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onAdRewardActionCompleted " + this);
        }
        if (this.f38925k || n() == null) {
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.a("l1", "Ad reward action completed. Params:" + rewards);
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.b(rewards);
        }
    }

    public void d() throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "clear " + this);
        }
        if (this.f38925k) {
            return;
        }
        this.f38925k = true;
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            c3704fa.f38569b = 0;
        }
        I();
        c((byte) 0);
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.d("l1", "AdUnit " + this + " state - CREATED");
        }
        C4178ya c4178ya = this.f38921g;
        String id2 = this.f38915a;
        c4178ya.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        List list = (List) c4178ya.f39986b.get(id2);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Job.a.a((Job) it.next(), null, 1, null);
            }
        }
        List list2 = (List) c4178ya.f39986b.get(id2);
        if (list2 != null) {
            list2.clear();
        }
        this.f38927m = null;
        this.f38933s = false;
    }

    public final void b(short s10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap map = new HashMap();
        map.put("errorCode", Short.valueOf(s10));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f38940z.f39426d));
        map.put("networkType", C4148x5.m());
        map.put("plId", Long.valueOf(this.f38926l.f39711a));
        AdSet adSetR = r();
        map.put("isRewarded", Boolean.valueOf(adSetR != null ? adSetR.getIsRewarded() : false));
        String str = this.f38926l.f39715e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.f38926l.f39716f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            map.put("retryCount", Integer.valueOf(c3704fa.f38569b));
        }
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(o(), map);
        b("ServerError", map);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void c() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onAdScreenDisplayFailed " + this);
        }
        if (this.f38925k || n() == null) {
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.b("l1", "Ad failed to display");
        }
        Handler handler = this.f38924j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w3.k9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3845l1.b(this.f107146b);
                }
            });
        }
    }

    public final void a(Context context, C4093v0 adPlacement, Dk dk) {
        C4093v0 c4093v0;
        String str;
        String str2;
        C3903n9 c3903n9;
        C3903n9 c3903n92;
        C3903n9 c3903n93;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        toString();
        a(context);
        this.f38920f = new WeakReference(dk);
        Ab ab2 = Jh.f37148a;
        Jh.a(dk, this.f38923i);
        WeakReference weakReference = this.f38920f;
        String strL = l();
        AdSet adSetR = r();
        this.f38935u = new C3591b0(weakReference, strL, adSetR != null ? adSetR.getIsRewarded() : false);
        this.f38926l = adPlacement;
        A();
        C3903n9 c3903n94 = this.f38923i;
        if (c3903n94 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n94.c("l1", "initInternetAvailabilityAdRetry");
        }
        if (this.f38917c == null && (c3903n93 = this.f38923i) != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n93.c("l1", "adConfig is null");
            Unit unit = Unit.f93236a;
        }
        if (this.f38926l.f39716f == null && (c3903n92 = this.f38923i) != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.c("l1", "placement.placementType is null");
            Unit unit2 = Unit.f93236a;
        }
        if (this.f38926l.f39715e == null && (c3903n9 = this.f38923i) != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "placement.adType is null");
            Unit unit3 = Unit.f93236a;
        }
        AdConfig adConfig = this.f38917c;
        if (adConfig != null && (str = (c4093v0 = this.f38926l).f39716f) != null && (str2 = c4093v0.f39715e) != null) {
            C3906nc c3906ncA = AbstractC3881mc.a(adConfig.getTimeouts().X(), str, str2, Ki.f37226b);
            this.f38936v = new C3704fa(c3906ncA);
            this.f38937w = c3906ncA;
        }
        if (J5.f37106h != null) {
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        } else {
            J5.f37106h = Float.valueOf(new TextView(context).getTextSize());
            Intrinsics.checkNotNullExpressionValue("J5", "TAG");
        }
        L();
    }

    public final void c(HashMap map) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "constructTelemetryPayload " + this);
        }
        map.put("adType", l());
        map.put("networkType", C4148x5.m());
        map.put("plId", Long.valueOf(this.f38926l.f39711a));
        String str = this.f38926l.f39716f;
        if (str != null) {
            map.put("plType", str);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void d(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        C3887mi c3887mi = renderView.f38358d0;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            Wj wj = Wj.f37959a;
            Wj.b("AttachedToWindow", mapA, EnumC3585ak.f38215a);
        }
    }

    public final void c(short s10) {
        long j10;
        long jElapsedRealtime;
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdLoadFailedEvent " + this);
        }
        HashMap map = new HashMap();
        if (s10 == 2138 || s10 == 2109) {
            j10 = this.f38940z.f39427e;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s10 == 2139) {
            j10 = this.f38940z.f39429g;
            CoroutineScope coroutineScope2 = AbstractC3790il.f38771a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = this.f38940z.f39425c;
            CoroutineScope coroutineScope3 = AbstractC3790il.f38771a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j10));
        map.put("errorCode", Short.valueOf(s10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            map.put("retryCount", Integer.valueOf(c3704fa.f38569b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(o(), map);
        c("AdLoadFailed", map);
    }

    public final void d(short s10) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitAdShowFailed " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f38940z.f39428f;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("errorCode", Short.valueOf(s10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.getIsRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("AdShowFailed", map);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad adO;
        MetaInfo metaInfo;
        String creativeType;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onTelemetryEvent " + this + " adState=" + ((int) this.f38916b));
        }
        if (this.f38916b != 3) {
            a(str, map);
            if ((Intrinsics.areEqual(str, "ServerFill") || Intrinsics.areEqual(str, "ServerError")) && (adO = o()) != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "updateAd " + this);
        }
        AdSet adSetR = r();
        if (adSetR == null || (ads = adSetR.getAds()) == null) {
            return;
        }
        ads.set(0, ad2);
    }

    public final void b(byte b10) {
        C3939ok c3939ok;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "cancelTimer " + this);
        }
        if (b10 == 1 && (c3939ok = this.f38928n) != null) {
            c3939ok.a((byte) 2);
        }
        C3939ok c3939ok2 = this.f38928n;
        if (c3939ok2 != null) {
            c3939ok2.a(b10);
        }
    }

    public final void b(int i10, boolean z10) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "fireAdPodShowResult " + this);
        }
        ArrayList list = this.f38922h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i10 < 0 || i10 >= list.size() || (gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(i10)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3635ci.b(z10);
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "setContext " + this);
        }
        this.f38918d = new WeakReference(context);
    }

    public final boolean d(byte b10) {
        int iY;
        Integer num;
        long j10;
        Integer num2;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "startTimer " + this);
        }
        if (b10 == 0) {
            C3906nc c3906nc = this.f38937w;
            if (c3906nc != null && (num2 = c3906nc.f39097d) != null) {
                iY = num2.intValue();
                j10 = iY;
            }
            j10 = 15000;
        } else if (b10 == 1) {
            C3906nc c3906nc2 = this.f38937w;
            if (c3906nc2 != null) {
                iY = c3906nc2.f39096c;
                j10 = iY;
            }
            j10 = 15000;
        } else {
            if (b10 == 2) {
                C3906nc c3906nc3 = this.f38937w;
                if (c3906nc3 != null && (num = c3906nc3.f39098e) != null) {
                    iY = num.intValue();
                }
                j10 = 15000;
            } else if (b10 == 4) {
                TimeoutConfigurations timeoutConfigurations = this.f38919e;
                Intrinsics.checkNotNull(timeoutConfigurations);
                iY = timeoutConfigurations.Y();
            } else {
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n92.b("l1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j10 = iY;
        }
        C3939ok c3939ok = this.f38928n;
        return c3939ok != null && c3939ok.a(b10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2, types: [int] */
    /* JADX WARN: Type inference failed for: r37v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.C3919o0 a(int r49) {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3845l1.a(int):com.inmobi.media.o0");
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void b(GestureDetectorOnGestureListenerC3635ci renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "fireClickTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f38922h.indexOf(renderView));
        if (Intrinsics.areEqual((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String url : AbstractC4186yi.a(adB, "click")) {
            C4121w3 c4121w3 = C4121w3.f39816a;
            C3903n9 c3903n92 = this.f38923i;
            Intrinsics.checkNotNullParameter(url, "url");
            C4121w3.a(url, true, c3903n92);
        }
    }

    public final void c(String eventType, Map kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "submitTelemetryEvent " + this);
        }
        Wj wj = Wj.f37959a;
        Wj.b(eventType, kv, EnumC3585ak.f38215a);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void c(GestureDetectorOnGestureListenerC3635ci renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "fireImpressionTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f38922h.indexOf(renderView));
        if (Intrinsics.areEqual((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String url : AbstractC4186yi.a(adB, "impression")) {
            C3740gk telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            Intrinsics.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f38662f = "adResponseTracker";
            C4121w3 c4121w3 = C4121w3.f39816a;
            C3565a0 c3565a0 = new C3565a0(this.f38935u, telemetryOnAdImpression);
            C3903n9 c3903n92 = this.f38923i;
            Intrinsics.checkNotNullParameter(url, "url");
            Dg.a(Ag.f36572a, new C3922o3(url, c3903n92, c3565a0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        Short sh2;
        Pair pair;
        O0 features;
        boolean enableImmersive = this.f38917c.getRendering().getEnableImmersive();
        boolean z10 = J5.f37107i;
        boolean zA = (ad2 == null || (features = ad2.getFeatures()) == null) ? false : features.a(false);
        boolean z11 = enableImmersive && z10 && zA;
        if (!z11) {
            StringBuilder sb2 = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z10) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!zA) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb2.append(CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null));
            Intrinsics.checkNotNullParameter(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh2 = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh2 = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh2 = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh2 = (short) 2201;
            } else if (bitSet.get(0)) {
                sh2 = (short) 2196;
            } else if (bitSet.get(1)) {
                sh2 = (short) 2197;
            } else {
                sh2 = bitSet.get(2) ? (short) 2198 : null;
            }
            short sShortValue = sh2 != null ? sh2.shortValue() : (short) -1;
            if (sShortValue == -1) {
                pair = new Pair("Invalid Reason", (short) -1);
            } else {
                pair = new Pair(sb2.toString(), Short.valueOf(sShortValue));
            }
            String str = (String) pair.component1();
            short sShortValue2 = ((Number) pair.component2()).shortValue();
            HashMap map = new HashMap();
            map.put("reason", str);
            map.put("errorCode", Short.valueOf(sShortValue2));
            c("ImmersiveNotSupported", map);
        }
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "Immersive support - config, device, adResponse - (" + enableImmersive + " " + z10 + " " + zA + ")");
        }
        return z11;
    }

    public final void a(AbstractC3721g1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onAdDisplayed " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(listener);
            return;
        }
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n93.a("l1", "callback - onAdDisplayed");
        }
        listener.a(adMetaInfoJ);
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "handleAdFetchSuccessful " + this);
        }
        if (!this.f38925k && n() != null) {
            if (this.f38916b == 1) {
                this.f38927m = adResponse;
                AdSet adSetR = r();
                int size = 0;
                this.f38933s = adSetR != null ? adSetR.getIsPod() : false;
                AdSet adSetR2 = r();
                if (adSetR2 != null && (ads2 = adSetR2.getAds()) != null) {
                    size = ads2.size();
                }
                this.f38922h = new ArrayList(size);
                AdSet adSetR3 = r();
                if (adSetR3 != null && (ads = adSetR3.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad2 : ads) {
                        this.f38922h.add(null);
                    }
                }
                F();
                return;
            }
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.b("l1", "incorrect state - " + ((int) this.f38916b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n93.b("l1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.f38916b == 1) {
                C3903n9 c3903n92 = this.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n92.b("l1", "Failed to fetch ad for placement id: " + this.f38926l + ", reason - " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
                C3903n9 c3903n93 = this.f38923i;
                if (c3903n93 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n93.b("l1", str);
                }
                C3903n9 c3903n94 = this.f38923i;
                if (c3903n94 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n94.d("l1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s10 != 0) {
                    b(s10);
                }
                AbstractC3721g1 abstractC3721g1M = m();
                if (abstractC3721g1M != null) {
                    abstractC3721g1M.a(inMobiAdRequestStatus);
                    return;
                }
                C3903n9 c3903n95 = this.f38923i;
                if (c3903n95 != null) {
                    c3903n95.a();
                }
            }
        } catch (Exception e10) {
            C3903n9 c3903n96 = this.f38923i;
            if (c3903n96 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n96.a("l1", "onAdFetchFailed with error: ", e10);
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    public final void a(short s10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.b("l1", "handleAdShowFailure " + this + " errorCode - " + ((int) s10));
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.b();
        }
        if (s10 != 0) {
            d(s10);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z10, short s10) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.b("l1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f38916b == 3 && z10) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.a(this, requestStatus);
        }
        if (s10 != 0) {
            b(s10);
        }
    }

    public final void a(Map map) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.f38926l.f39713c = map;
    }

    public static final Unit a(AbstractC3845l1 abstractC3845l1) {
        C3994r1 c3994r1 = abstractC3845l1.f38940z;
        c3994r1.getClass();
        c3994r1.f39427e = SystemClock.elapsedRealtime();
        abstractC3845l1.g();
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(com.inmobi.media.AbstractC3845l1 r2, com.inmobi.media.EnumC3571a6 r3) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE
            r0.<init>(r1)
            java.lang.String r1 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L31
            r1 = 21
            if (r3 == r1) goto L2e
            switch(r3) {
                case 12: goto L2b;
                case 13: goto L28;
                case 14: goto L25;
                case 15: goto L22;
                case 16: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L31
        L1f:
            r3 = 2105(0x839, float:2.95E-42)
            goto L33
        L22:
            r3 = 2104(0x838, float:2.948E-42)
            goto L33
        L25:
            r3 = 2103(0x837, float:2.947E-42)
            goto L33
        L28:
            r3 = 2102(0x836, float:2.946E-42)
            goto L33
        L2b:
            r3 = 2101(0x835, float:2.944E-42)
            goto L33
        L2e:
            r3 = 2228(0x8b4, float:3.122E-42)
            goto L33
        L31:
            r3 = 2100(0x834, float:2.943E-42)
        L33:
            r1 = 1
            r2.a(r0, r1, r3)
            kotlin.Unit r2 = kotlin.Unit.f93236a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3845l1.a(com.inmobi.media.l1, com.inmobi.media.a6):kotlin.Unit");
    }

    public final void a(final Function0 onSuccess, final Function1 onMaxRetryReached) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onMaxRetryReached, "onMaxRetryReached");
        C3903n9 c3903n9 = this.f38923i;
        Object ub2 = null;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            C3704fa c3704fa = this.f38936v;
            c3903n9.c("l1", "loadWithRetry " + (c3704fa != null ? Integer.valueOf(c3704fa.f38569b) : null));
        }
        C3704fa c3704fa2 = this.f38936v;
        if (c3704fa2 != null) {
            EnumC3571a6 enumC3571a6A = Re.a();
            if (enumC3571a6A == null) {
                ub2 = Hf.f37025a;
            } else {
                int i10 = c3704fa2.f38569b + 1;
                c3704fa2.f38569b = i10;
                if (i10 >= c3704fa2.f38568a.f39095b) {
                    ub2 = new Ub(enumC3571a6A);
                } else {
                    ub2 = C3886mh.f39040a;
                }
            }
        }
        if (ub2 instanceof Ub) {
            onMaxRetryReached.invoke(((Ub) ub2).f37844a);
            return;
        }
        if (ub2 instanceof Hf) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.c("l1", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(ub2 instanceof C3886mh)) {
            if (ub2 == null) {
                C3903n9 c3903n93 = this.f38923i;
                if (c3903n93 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n93.c("l1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            throw new lf.m();
        }
        C3903n9 c3903n94 = this.f38923i;
        if (c3903n94 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n94.c("l1", "load failed, retrying");
        }
        this.f38938x.postDelayed(new Runnable() { // from class: w3.p9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3845l1.a(this.f107245b, onSuccess, onMaxRetryReached);
            }
        }, this.f38937w != null ? r8.f39094a : 1000L);
    }

    public static final void a(AbstractC3845l1 abstractC3845l1, Function0 function0, Function1 function1) {
        C3903n9 c3903n9 = abstractC3845l1.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            C3704fa c3704fa = abstractC3845l1.f38936v;
            c3903n9.c("l1", "Loading from retry Handler " + (c3704fa != null ? Integer.valueOf(c3704fa.f38569b) : null));
        }
        abstractC3845l1.a(function0, function1);
    }

    public void a(byte[] bArr) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "load response " + this);
        }
        C3994r1 c3994r1 = this.f38940z;
        c3994r1.getClass();
        c3994r1.f39425c = SystemClock.elapsedRealtime();
        if (B()) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.a("l1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            C3903n9 c3903n93 = this.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n93.d("l1", "AdUnit " + this + " state - LOADING");
            }
            this.f38921g.a(this.f38915a, new C3795j1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        C3903n9 c3903n94 = this.f38923i;
        if (c3903n94 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n94.a("l1", "null response. failing");
        }
    }

    public static final void a(AbstractC3845l1 abstractC3845l1, Y y10) {
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        Objects.toString(y10);
        V v10 = y10.f38018b;
        if (v10 instanceof Pi) {
            abstractC3845l1.getClass();
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3845l1.f38940z.f39426d)), TuplesKt.to("networkType", C4148x5.m()), TuplesKt.to("plId", Long.valueOf(abstractC3845l1.f38926l.f39711a)));
            String str = abstractC3845l1.f38926l.f39716f;
            if (str != null) {
                mapMutableMapOf.put("plType", str);
            }
            String str2 = abstractC3845l1.f38926l.f39715e;
            if (str2 != null) {
                mapMutableMapOf.put("adType", str2);
            }
            abstractC3845l1.b("ServerNoFill", mapMutableMapOf);
            abstractC3845l1.b(y10.f38017a, (short) 0);
            return;
        }
        if (v10 instanceof J6) {
            abstractC3845l1.b(y10.f38017a, ((J6) v10).f37108a);
            return;
        }
        if (v10 instanceof K6) {
            abstractC3845l1.b(MapsKt.mutableMapOf(TuplesKt.to("errorCode", Integer.valueOf(((K6) v10).f37210a))));
            abstractC3845l1.b(y10.f38017a, (short) 2205);
        } else {
            if (v10 instanceof Ni) {
                abstractC3845l1.b(((Ni) v10).f37457a);
                abstractC3845l1.b(y10.f38017a, (short) 0);
                return;
            }
            throw new lf.m();
        }
    }

    public static final void a(AbstractC3845l1 abstractC3845l1, GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        abstractC3845l1.a(gestureDetectorOnGestureListenerC3635ci, (short) 2137);
    }

    public void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, short s10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.b("l1", "Render view signaled ad failed, for index " + this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci) + " " + this);
        }
        if (gestureDetectorOnGestureListenerC3635ci == null || !Intrinsics.areEqual(gestureDetectorOnGestureListenerC3635ci.getMarkupType(), "htmlUrl")) {
            return;
        }
        l(gestureDetectorOnGestureListenerC3635ci);
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onAdInteraction " + this);
        }
        if (this.f38925k || n() == null) {
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.a("l1", "Ad interaction. Params: " + params);
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(final C3740gk telemetryOnAdImpression) {
        C3765hk c3765hk;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onImpressionFiredFromTemplate " + this);
        }
        telemetryOnAdImpression.getClass();
        Intrinsics.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f38662f = "imraid_impressionFired";
        if (!this.f38925k && n() != null) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.a("l1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f38924j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w3.h9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3845l1.a(this.f107084b, telemetryOnAdImpression);
                    }
                });
                return;
            }
            return;
        }
        C3994r1 c3994r1 = telemetryOnAdImpression.f38657a;
        if (c3994r1 == null || (c3765hk = c3994r1.f39424b) == null || (atomicBoolean = c3765hk.f38721a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = telemetryOnAdImpression.a();
            linkedHashMapA.put("networkType", C4148x5.m());
            linkedHashMapA.put("errorCode", (short) 2180);
            String str = telemetryOnAdImpression.f38660d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.f37959a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3585ak.f38215a);
        }
    }

    public static final void a(AbstractC3845l1 abstractC3845l1, C3740gk c3740gk) {
        abstractC3845l1.f38935u.a(c3740gk);
    }

    @Override // com.inmobi.media.AbstractC3686ei, com.inmobi.media.InterfaceC3586al
    public final void a() {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onUserLeaveApplication " + this);
        }
        if (this.f38925k || n() == null) {
            return;
        }
        C3903n9 c3903n92 = this.f38923i;
        if (c3903n92 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n92.a("l1", "User left application");
        }
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, Map map) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad2 != null) {
            map.put("creativeId", ad2.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(String eventType, HashMap kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "onRenderViewRequestedAction " + this);
        }
        c(eventType, kv);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, Map map) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C3704fa c3704fa = this.f38936v;
        if (c3704fa != null) {
            map.put("retryCount", Integer.valueOf(c3704fa.f38569b));
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.f38917c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Bf.f36629a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    C4138wk c4138wk = (C4138wk) it.next();
                    if (3 == c4138wk.f39872a) {
                        try {
                            Intrinsics.checkNotNullParameter("creativeType", C4240b4.i.W);
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj = c4138wk.f39873b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            Intrinsics.checkNotNullParameter("customReferenceData", C4240b4.i.W);
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj2 = c4138wk.f39873b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            Intrinsics.checkNotNullParameter("isolateVerificationScripts", C4240b4.i.W);
                            Intrinsics.checkNotNullParameter(Boolean.class, "classType");
                            Object obj3 = c4138wk.f39873b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            Intrinsics.checkNotNullParameter("impressionType", C4240b4.i.W);
                            Intrinsics.checkNotNullParameter(Byte.class, "classType");
                            Object obj4 = c4138wk.f39873b.get("impressionType");
                            Byte b10 = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C3809jf c3809jfA = (str == null || bool == null || b10 == null) ? null : AbstractC4083uf.a(str, gestureDetectorOnGestureListenerC3635ci, bool.booleanValue(), this.f38926l.f39721k, b10.byteValue(), str2);
                            if (c3809jfA != null) {
                                c4138wk.f39873b.put("omidAdSession", c3809jfA);
                                c4138wk.f39873b.put("deferred", Boolean.TRUE);
                                C3903n9 c3903n92 = this.f38923i;
                                if (c3903n92 != null) {
                                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                    c3903n92.a("l1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C3903n9 c3903n93 = this.f38923i;
                                if (c3903n93 != null) {
                                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                    c3903n93.a("l1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e10) {
                            C3903n9 c3903n94 = this.f38923i;
                            if (c3903n94 != null) {
                                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                                c3903n94.b("l1", "Setting up impression tracking for IAB encountered an unexpected error: " + e10.getMessage());
                            }
                            Lazy lazy = P9.f37527a;
                            AbstractC3779i9.a(e10);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, String str) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "updateAdForBlob " + this);
        }
        ad2.setWebVast(str);
        b(ad2);
    }

    public final void a(String blob, String str) {
        Intrinsics.checkNotNullParameter(blob, "blob");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "saveBlob " + this);
        }
        this.f38921g.a(this.f38915a, new C3820k1(this, str, blob, null));
    }

    public final void a(String jsCallbackNamespace, String callback, F2 receiver, String str) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "getBlob " + this);
        }
        this.f38921g.a(this.f38915a, new C3771i1(this, str, receiver, jsCallbackNamespace, callback, null));
    }

    public void a(int i10, GestureDetectorOnGestureListenerC3635ci renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "Show pod ad with index : " + i10 + " from creative: " + this.f38922h.indexOf(renderView) + " " + this);
        }
        if (i10 >= 0) {
            this.f38930p = i10;
        } else {
            this.f38930p++;
        }
    }

    public void a(GestureDetectorOnGestureListenerC3635ci renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.c("l1", "closeCurrentPodAd " + this);
        }
    }

    public boolean a(GestureDetectorOnGestureListenerC3635ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue("l1", "TAG");
        c3903n9.c("l1", "hasNextAdInAdPod " + this);
        return false;
    }

    public void a(byte b10) {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "onTimeOut " + this);
        }
        if (b10 == 0) {
            C3903n9 c3903n92 = this.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n92.a("l1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.f38916b));
            }
            if (this.f38916b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b10 != 2 && b10 != 1) {
            if (b10 == 4) {
                C3903n9 c3903n93 = this.f38923i;
                if (c3903n93 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                    c3903n93.a("l1", "Show RequestTimeOut by show timer");
                }
                AbstractC3721g1 abstractC3721g1M = m();
                if (abstractC3721g1M != null) {
                    abstractC3721g1M.d();
                    return;
                }
                return;
            }
            C3903n9 c3903n94 = this.f38923i;
            if (c3903n94 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n94.a("l1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        C3903n9 c3903n95 = this.f38923i;
        if (c3903n95 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n95.a("l1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.f38916b));
        }
        if (this.f38916b != 3) {
            this.f38938x.removeCallbacksAndMessages(null);
            C3903n9 c3903n96 = this.f38923i;
            if (c3903n96 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "TAG");
                c3903n96.a("l1", "adUnitEventListener=" + m() + ", Adstate=" + ((int) this.f38916b));
            }
            byte b11 = this.f38916b;
            if (2 == b11) {
                J();
                c(Re.a() == null ? (short) 2139 : (short) 2203);
                AbstractC3721g1 abstractC3721g1M2 = m();
                if (abstractC3721g1M2 != null) {
                    abstractC3721g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b11) {
                J();
                c((short) 2138);
                AbstractC3721g1 abstractC3721g1M3 = m();
                if (abstractC3721g1M3 != null) {
                    abstractC3721g1M3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i10, boolean z10) throws JSONException {
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "Destroying container for index " + i10 + " " + this);
        }
        ArrayList list = this.f38922h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i10 < 0 || i10 >= list.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) this.f38922h.get(i10);
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.I0.set(z10);
            gestureDetectorOnGestureListenerC3635ci.stopLoading();
            gestureDetectorOnGestureListenerC3635ci.b();
        }
        this.f38922h.set(i10, null);
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, Integer num, int i10) {
        int iIntValue;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            iIntValue = this.f38922h.indexOf(gestureDetectorOnGestureListenerC3635ci);
        } else if (num == null) {
            return;
        } else {
            iIntValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIntValue);
        if (adB != null) {
            Iterator it = AbstractC4186yi.a(adB, "pod_abort").iterator();
            while (it.hasNext()) {
                String url = StringsKt.W(StringsKt.W((String) it.next(), "$PODINDEX", String.valueOf(iIntValue), false, 4, null), "$REASON", String.valueOf(i10), false, 4, null);
                C4121w3 c4121w3 = C4121w3.f39816a;
                C3903n9 c3903n9 = this.f38923i;
                Intrinsics.checkNotNullParameter(url, "url");
                C4121w3.a(url, true, c3903n9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(GestureDetectorOnGestureListenerC3635ci renderView, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        C3903n9 c3903n9 = this.f38923i;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n9.a("l1", "fireLandingPageTracker " + trackerName + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f38922h.indexOf(renderView));
        if (adB != null) {
            for (String str : AbstractC4186yi.a(adB, trackerName)) {
                String url = str;
                for (Map.Entry entry : macros.entrySet()) {
                    url = StringsKt.W(url, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                C4121w3 c4121w3 = C4121w3.f39816a;
                C3903n9 c3903n92 = this.f38923i;
                Intrinsics.checkNotNullParameter(url, "url");
                C4121w3.a(url, true, c3903n92);
            }
            return;
        }
        C3903n9 c3903n93 = this.f38923i;
        if (c3903n93 != null) {
            Intrinsics.checkNotNullExpressionValue("l1", "TAG");
            c3903n93.a("l1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC3686ei
    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        AbstractC3721g1 abstractC3721g1M = m();
        if (abstractC3721g1M != null) {
            abstractC3721g1M.a(log);
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return ((ro) this.D.getValue()).a(i10, d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return ((ro) this.D.getValue()).a(d10);
    }
}
