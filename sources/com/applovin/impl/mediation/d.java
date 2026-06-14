package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.p5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v5;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9571b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9572c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9573d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9574e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9575f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9576g = new Object();

    class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f9577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f9578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f9580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f9581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0175a f9582f;

        a(long j10, Map map, String str, a3 a3Var, Context context, a.InterfaceC0175a interfaceC0175a) {
            this.f9577a = j10;
            this.f9578b = map;
            this.f9579c = str;
            this.f9580d = a3Var;
            this.f9581e = context;
            this.f9582f = interfaceC0175a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f9578b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f9577a));
            this.f9578b.put("calfc", Integer.valueOf(d.this.b(this.f9579c)));
            v5 v5Var = new v5(this.f9580d, jSONArray, this.f9581e, d.this.f9570a, this.f9582f);
            if (((Boolean) d.this.f9570a.a(r3.f10325o8)).booleanValue()) {
                d.this.f9570a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                d.this.f9570a.q0().a(v5Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements a.InterfaceC0175a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f9585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f9586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f9587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f9588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f9589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f9590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f9591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f9592i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9593j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f9594k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            MaxError maxError2;
            this.f9586c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9593j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f9584a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f9594k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && n7.c(this.f9584a) && ((Boolean) this.f9584a.a(x4.A6)).booleanValue();
            if (this.f9584a.a(r3.f10316i8, this.f9588e) && this.f9587d.f9597c < this.f9592i && !z10) {
                c.e(this.f9587d);
                final int iPow = (int) Math.pow(2.0d, this.f9587d.f9597c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9810b.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f9587d.f9597c = 0;
            this.f9587d.f9596b.set(false);
            if (this.f9587d.f9598d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f9587d.f9595a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f9587d.f9598d, str, maxError2);
                this.f9587d.f9598d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f9587d.f9595a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f9593j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9584a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f9594k, y2Var.getRequestLatencyMillis());
            }
            this.f9586c.a(maxAd.getAdUnitId());
            this.f9587d.f9597c = 0;
            if (this.f9587d.f9598d == null) {
                this.f9586c.a(y2Var);
                this.f9587d.f9596b.set(false);
                return;
            }
            y2Var.A().c().a(this.f9587d.f9598d);
            this.f9587d.f9598d.onAdLoaded(y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f9587d.f9598d.onAdRevenuePaid(y2Var);
            }
            this.f9587d.f9598d = null;
            if (((Boolean) this.f9584a.a(r3.f10313f8)).booleanValue() || !this.f9586c.a(maxAd)) {
                this.f9587d.f9596b.set(false);
                return;
            }
            Context contextO = (Context) this.f9585b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f9593j = SystemClock.elapsedRealtime();
            this.f9594k = System.currentTimeMillis();
            this.f9591h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f9586c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9589f, this.f9590g, this.f9591h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f9584a = kVar;
            this.f9585b = new WeakReference(context);
            this.f9586c = dVar;
            this.f9587d = cVar;
            this.f9588e = maxAdFormat;
            this.f9590g = map2;
            this.f9589f = map;
            this.f9591h = map3;
            this.f9593j = j10;
            this.f9594k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f9592i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f9592i = Math.min(2, ((Integer) kVar.a(r3.f10315h8)).intValue());
            } else {
                this.f9592i = ((Integer) kVar.a(r3.f10315h8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f9590g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f9590g.put("retry_attempt", Integer.valueOf(this.f9587d.f9597c));
            Context contextO = (Context) this.f9585b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f9591h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f9591h.put("era", Integer.valueOf(this.f9587d.f9597c));
            this.f9594k = System.currentTimeMillis();
            this.f9586c.a(str, this.f9588e, this.f9589f, this.f9590g, this.f9591h, context, this);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0175a f9598d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f9597c;
            cVar.f9597c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f9596b = new AtomicBoolean();
            this.f9595a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f9570a = kVar;
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f9574e) {
            y2Var = (y2) this.f9573d.get(str);
            this.f9573d.remove(str);
        }
        return y2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f9572c) {
            this.f9571b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f9574e) {
            z10 = this.f9573d.get(str) != null;
        }
        return z10;
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            str3 = TokenBuilder.TOKEN_DELIMITER + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f9576g) {
            try {
                Integer num = (Integer) this.f9575f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0175a interfaceC0175a) {
        y2 y2VarE = (this.f9570a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0175a);
            interfaceC0175a.onAdLoaded(y2VarE);
            if (y2VarE.O().endsWith("load")) {
                interfaceC0175a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f9570a.a(r3.f10313f8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f9596b.compareAndSet(false, true)) {
            if (cVarA.f9598d != null && cVarA.f9598d != interfaceC0175a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f9598d = interfaceC0175a;
            return;
        }
        if (y2VarE == null) {
            cVarA.f9598d = interfaceC0175a;
        }
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f9570a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f9576g) {
            try {
                this.f9570a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9570a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f9575f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f9575f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0175a interfaceC0175a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f9570a.q0().a((i5) new p5(a3Var, context, this.f9570a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0175a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f9570a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f9570a.Y();
            s3 s3Var = s3.f10391e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f9570a.Y().a(s3Var, t3.a(maxAdFormat));
            return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, s3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f9574e) {
            try {
                if (this.f9573d.containsKey(y2Var.getAdUnitId())) {
                    com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
                }
                this.f9573d.put(y2Var.getAdUnitId(), y2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f9572c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f9571b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f9571b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9576g) {
            try {
                this.f9570a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9570a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f9575f.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f9570a.c(r3.f10311d8).contains(maxAd.getAdUnitId()) && !this.f9570a.a(r3.f10310c8, maxAd.getFormat())) || this.f9570a.s0().c() || this.f9570a.s0().d()) ? false : true;
    }
}
