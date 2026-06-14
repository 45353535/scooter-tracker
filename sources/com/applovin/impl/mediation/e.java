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
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9642b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9643c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9644d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9645e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9646f = DesugarCollections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f9647g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9648h = new Object();

    class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f9649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f9650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f9652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f9653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0175a f9654f;

        a(long j10, Map map, String str, a3 a3Var, Context context, a.InterfaceC0175a interfaceC0175a) {
            this.f9649a = j10;
            this.f9650b = map;
            this.f9651c = str;
            this.f9652d = a3Var;
            this.f9653e = context;
            this.f9654f = interfaceC0175a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f9650b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f9649a));
            this.f9650b.put("calfc", Integer.valueOf(e.this.b(this.f9651c)));
            v5 v5Var = new v5(this.f9652d, jSONArray, this.f9653e, e.this.f9641a, this.f9654f);
            if (((Boolean) e.this.f9641a.a(r3.f10325o8)).booleanValue()) {
                e.this.f9641a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                e.this.f9641a.q0().a(v5Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements a.InterfaceC0175a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f9657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f9658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f9659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f9660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f9661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f9662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f9663h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f9664i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9665j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f9666k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, kVar, context);
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
            this.f9658c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9665j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f9656a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f9666k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && n7.c(this.f9656a) && ((Boolean) this.f9656a.a(x4.A6)).booleanValue();
            if (this.f9656a.a(r3.f10316i8, this.f9660e) && this.f9659d.f9669c < this.f9664i && !z10) {
                c.e(this.f9659d);
                final int iPow = (int) Math.pow(2.0d, this.f9659d.f9669c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9817b.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f9659d.f9669c = 0;
            this.f9659d.f9668b.set(false);
            if (this.f9659d.f9670d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f9659d.f9667a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f9659d.f9670d, str, maxError2);
                this.f9659d.f9670d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f9659d.f9667a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f9665j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9656a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f9666k, y2Var.getRequestLatencyMillis());
            }
            this.f9658c.a(maxAd.getAdUnitId());
            this.f9659d.f9669c = 0;
            if (this.f9659d.f9670d == null) {
                this.f9658c.a(y2Var);
                this.f9659d.f9668b.set(false);
                int iL = y2Var.L();
                synchronized (this.f9658c.f9645e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f9658c.f9644d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iL) {
                    int i10 = sizeSafely + 1;
                    this.f9656a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9656a.O().a("MediationAdLoadManagerV2", "Preloading waterfall " + i10 + " of " + iL);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f9659d.f9670d);
            this.f9659d.f9670d.onAdLoaded(y2Var);
            this.f9658c.f9646f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f9659d.f9670d.onAdRevenuePaid(y2Var);
            }
            this.f9659d.f9670d = null;
            if ((!this.f9656a.c(r3.f10311d8).contains(maxAd.getAdUnitId()) && !this.f9656a.a(r3.f10310c8, maxAd.getFormat())) || this.f9656a.s0().c() || this.f9656a.s0().d()) {
                this.f9659d.f9668b.set(false);
                return;
            }
            int iL2 = y2Var.L();
            this.f9656a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9656a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iL2);
            }
            a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f9656a = kVar;
            this.f9657b = new WeakReference(context);
            this.f9658c = eVar;
            this.f9659d = cVar;
            this.f9660e = maxAdFormat;
            this.f9662g = map2;
            this.f9661f = map;
            this.f9663h = map3;
            this.f9665j = j10;
            this.f9666k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f9664i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f9664i = Math.min(2, ((Integer) kVar.a(r3.f10315h8)).intValue());
            } else {
                this.f9664i = ((Integer) kVar.a(r3.f10315h8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f9657b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f9665j = SystemClock.elapsedRealtime();
            this.f9666k = System.currentTimeMillis();
            this.f9663h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f9658c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9661f, this.f9662g, this.f9663h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f9662g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f9662g.put("retry_attempt", Integer.valueOf(this.f9659d.f9669c));
            Context contextO = (Context) this.f9657b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f9663h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f9663h.put("era", Integer.valueOf(this.f9659d.f9669c));
            this.f9666k = System.currentTimeMillis();
            this.f9658c.a(str, this.f9660e, this.f9661f, this.f9662g, this.f9663h, context, this);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0175a f9670d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f9669c;
            cVar.f9669c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f9668b = new AtomicBoolean();
            this.f9667a = str;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f9641a = kVar;
    }

    private y2 f(String str) {
        synchronized (this.f9645e) {
            try {
                Queue queue = (Queue) this.f9644d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (y2) queue.poll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f9645e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f9644d.get(str));
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

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f9646f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f9643c) {
            try {
                Queue queue = (Queue) this.f9644d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f9648h) {
            try {
                this.f9641a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9641a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f9647g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f9647g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f9648h) {
            try {
                Integer num = (Integer) this.f9647g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0175a interfaceC0175a) {
        y2 y2VarF = (this.f9641a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0175a);
            interfaceC0175a.onAdLoaded(y2VarF);
            this.f9646f.put(str, y2VarF);
            if (y2VarF.O().endsWith("load")) {
                interfaceC0175a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f9668b.compareAndSet(false, true)) {
            if (cVarA.f9670d != null && cVarA.f9670d != interfaceC0175a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f9670d = interfaceC0175a;
            return;
        }
        if (y2VarF == null) {
            cVarA.f9670d = interfaceC0175a;
        }
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f9641a, context, null));
    }

    public void c(String str, String str2) {
        synchronized (this.f9643c) {
            this.f9642b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0175a interfaceC0175a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f9641a.q0().a((i5) new p5(a3Var, context, this.f9641a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0175a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f9641a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f9641a.Y();
            s3 s3Var = s3.f10391e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f9641a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f9645e) {
            try {
                Queue arrayDeque = (Queue) this.f9644d.get(y2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f9644d.put(y2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(y2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f9643c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f9642b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f9642b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9648h) {
            try {
                this.f9641a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9641a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f9647g.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
