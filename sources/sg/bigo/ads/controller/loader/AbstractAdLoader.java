package sg.bigo.ads.controller.loader;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ad.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.e.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractAdLoader<U extends Ad, T extends sg.bigo.ads.api.b> implements AdLoader<T>, d.a<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f103811a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, List<a>> f103812b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final e<U> f103813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103814d;

    abstract class a implements sg.bigo.ads.controller.d<U> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        sg.bigo.ads.api.core.b[] f103860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        sg.bigo.ads.api.core.b[] f103861f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f103863h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        a.C1280a<sg.bigo.ads.api.b> f103865j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        sg.bigo.ads.api.b f103866k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AbstractAdLoader f103867l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f103858c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f103859d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f103862g = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f103857a = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Runnable f103868m = new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request is timeout.");
                a aVar = a.this;
                a.C1280a<sg.bigo.ads.api.b> c1280a = aVar.f103865j;
                if (c1280a == null || aVar.f103862g) {
                    return;
                }
                aVar.f103858c = true;
                c1280a.f103582c = true;
                if (c1280a.f103585f == 0) {
                    c1280a.f103585f = c1280a.f103584e;
                }
                if (k.a(aVar.f103860e)) {
                    a aVar2 = a.this;
                    sg.bigo.ads.controller.loader.a.a(aVar2.f103860e, aVar2.f103865j.f103585f);
                    a aVar3 = a.this;
                    int i10 = aVar3.f103858c ? 2 : aVar3.f103859d ? 4 : 1;
                    a.C1280a<sg.bigo.ads.api.b> c1280a2 = aVar3.f103865j;
                    sg.bigo.ads.controller.loader.a.a(aVar3.f103860e, i10, c1280a2 == null ? 1 : c1280a2.f103585f, true);
                }
                AbstractAdLoader<U, T>.a aVar4 = a.this;
                AbstractAdLoader.this.a(aVar4, 1011, 10206, "Ad request is timeout due to bad network.", new Pair<>(aVar4.f103865j.f103580a, null));
            }
        };

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f103864i = SystemClock.elapsedRealtime();

        protected a(AbstractAdLoader abstractAdLoader, sg.bigo.ads.api.b bVar, String str) {
            this.f103863h = str;
            this.f103867l = abstractAdLoader;
            this.f103866k = bVar;
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.f103868m);
            if (this.f103857a) {
                return;
            }
            this.f103857a = true;
            StringBuilder sb2 = new StringBuilder("Remove timeout task for session id: ");
            a.C1280a<sg.bigo.ads.api.b> c1280a = this.f103865j;
            sb2.append(c1280a == null ? "unknown" : c1280a.f103580a.f102124h.f102126b);
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", sb2.toString());
        }

        public final String b() {
            a.C1280a<sg.bigo.ads.api.b> c1280a = this.f103865j;
            String str = c1280a == null ? null : c1280a.f103580a.f102117a;
            return TextUtils.isEmpty(str) ? this.f103863h : str;
        }
    }

    public interface b<U extends Ad, T extends sg.bigo.ads.api.b> extends d.a<U> {
        AbstractAdLoader<U, T> a();
    }

    public AbstractAdLoader(AdLoadListener<U> adLoadListener, String str) {
        if (adLoadListener == null) {
            this.f103813c = new e<>();
        } else {
            this.f103813c = new e<>(adLoadListener);
        }
        this.f103814d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, AbstractAdLoader<U, T>.a aVar) {
        List<a> list;
        if (TextUtils.isEmpty(str) || (list = f103812b.get(str)) == null || list.size() <= 0) {
            return;
        }
        list.remove(aVar);
    }

    private boolean b(final T t10) {
        String[] strArrSplit;
        String str;
        boolean zIsInitialized = BigoAdSdk.isInitialized();
        boolean z10 = !zIsInitialized;
        if (!zIsInitialized) {
            Activity activityB = sg.bigo.ads.common.f.b.b();
            applicationContext = activityB != null ? activityB.getApplicationContext() : null;
            if (applicationContext == null) {
                applicationContext = sg.bigo.ads.common.f.b.a();
            }
            z10 = applicationContext != null;
        }
        String str2 = "";
        if (z10) {
            String str3 = t10.f102117a;
            if (str3 != null && !str3.isEmpty() && (strArrSplit = str3.split(TokenBuilder.TOKEN_DELIMITER)) != null && strArrSplit.length >= 2 && (str = strArrSplit[0]) != null && !str.isEmpty()) {
                str2 = strArrSplit[0];
            }
            z10 = (str2 == null || str2.isEmpty()) ? false : true;
        }
        if (z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Initialize bigo sdk before requesting ad.");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        AbstractAdLoader.this.a(t10);
                    }
                }
            }, 1000L);
            try {
                AdConfig.Builder builder = new AdConfig.Builder();
                builder.setAppId(str2);
                BigoAdSdk.initialize(applicationContext.getApplicationContext(), builder.build(), new BigoAdSdk.InitListener() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.3
                    @Override // sg.bigo.ads.BigoAdSdk.InitListener
                    public final void onInitialized() {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Bigo ads sdk initialized before ad load.");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            AbstractAdLoader.this.a(t10);
                        }
                    }
                });
                return z10;
            } catch (Exception unused) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    a(t10);
                }
            }
        }
        return z10;
    }

    protected U a(@NonNull sg.bigo.ads.api.b bVar, f... fVarArr) {
        return null;
    }

    @Keep
    @CallSuper
    public void loadAd(T t10) {
        if (b(t10)) {
            return;
        }
        a(t10);
    }

    protected U a(f fVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, AbstractAdLoader<U, T>.a aVar, U u10, int i10, int i11, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f103811a.remove(str);
        }
        aVar.a();
        aVar.f103862g = true;
        b(aVar.b(), aVar);
        if (aVar.f103858c || aVar.f103859d) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(str, aVar, sg.bigo.ads.controller.loader.a.a(u10), 0, i10, i11, str2, false, u10);
            a(u10, i10, i11, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final AbstractAdLoader<U, T>.a aVar, final sg.bigo.ads.api.core.b[] bVarArr, final int i10, final int i11, final int i12, final String str2, final boolean z10, final Ad ad2) {
        boolean zC;
        String strD;
        h hVar;
        if (TextUtils.isEmpty(str)) {
            str = aVar.b();
        }
        final String str3 = str;
        if (TextUtils.isEmpty(str3) || (hVar = i.f102116a) == null) {
            zC = false;
            strD = null;
        } else {
            sg.bigo.ads.api.a.b bVarQ = hVar.q();
            zC = bVarQ.c(str3);
            strD = bVarQ.d(str3);
        }
        final String str4 = strD;
        final boolean z11 = zC;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0178  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 405
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.loader.AbstractAdLoader.AnonymousClass7.run():void");
            }
        });
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10) {
        a((Ad) u10, true);
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10, int i10, int i11, String str) {
        if (u10 instanceof sg.bigo.ads.api.b.a) {
            ((sg.bigo.ads.api.b.a) u10).a(i10, i11, str);
        }
        sg.bigo.ads.common.t.a.a(2, 5, "", "Failed to load ads: (" + i10 + ") " + str);
        this.f103813c.onError(new AdError(i10, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Ad ad2, boolean z10) {
        boolean z11 = ad2 instanceof sg.bigo.ads.api.b.a;
        if (z11) {
            ((sg.bigo.ads.api.b.a) ad2).b();
        }
        if (z10) {
            if (z11) {
                ((sg.bigo.ads.api.b.a) ad2).c();
            }
            this.f103813c.onAdLoaded(ad2);
        }
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10, boolean z10, int i10, int i11, String str, boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final l lVar, final String str, @NonNull final AbstractAdLoader<U, T>.a aVar, final Ad ad2) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4
            @Override // java.lang.Runnable
            public final void run() {
                if (aVar.f103858c) {
                    b.a.f100151a.a(lVar, ad2);
                    a.C1280a<sg.bigo.ads.api.b> c1280a = aVar.f103865j;
                    sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request has been timeout before get ad from cache for session id: " + (c1280a == null ? "unknown" : c1280a.f103580a.f102124h.f102126b) + ", ad: " + String.valueOf(ad2));
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractAdLoader.f103811a.remove(str);
                }
                a.C1280a<sg.bigo.ads.api.b> c1280a2 = aVar.f103865j;
                sg.bigo.ads.controller.loader.a.a(ad2, c1280a2 == null ? "0" : c1280a2.f103580a.f102124h.f102126b);
                a aVar2 = aVar;
                a.C1280a<sg.bigo.ads.api.b> c1280a3 = aVar2.f103865j;
                if (c1280a3 != null) {
                    c1280a3.f103583d = true;
                    if (c1280a3.f103585f == 0) {
                        c1280a3.f103585f = c1280a3.f103584e;
                    }
                }
                aVar2.f103862g = true;
                AbstractAdLoader.b(str, aVar2);
                aVar.a();
                aVar.f103859d = true;
                sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
                a aVar3 = aVar;
                aVar3.f103861f = bVarArrA;
                a.C1280a<sg.bigo.ads.api.b> c1280a4 = aVar3.f103865j;
                sg.bigo.ads.controller.loader.a.a(bVarArrA, 4, c1280a4 == null ? 1 : c1280a4.f103585f, true);
                AbstractAdLoader.this.a(str, aVar, bVarArrA, 1, 0, 0, null, true, ad2);
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        aVar.f103867l.a(ad2, true);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r14) {
        /*
            r13 = this;
            r0 = 0
            r14.f102119c = r0
            java.lang.String r1 = r13.f103814d
            r14.a(r1)
            java.lang.String r6 = r14.f102117a
            sg.bigo.ads.controller.loader.AbstractAdLoader$1 r2 = new sg.bigo.ads.controller.loader.AbstractAdLoader$1
            r4 = r13
            r7 = r6
            r3 = r13
            r5 = r14
            r2.<init>(r4, r5, r6)
            boolean r14 = a(r6)
            if (r14 == 0) goto L2b
            android.util.Pair r12 = new android.util.Pair
            r14 = 0
            r12.<init>(r5, r14)
            r9 = 1012(0x3f4, float:1.418E-42)
            r10 = 10213(0x27e5, float:1.4311E-41)
            java.lang.String r11 = "The ad is loading"
            r7 = r13
            r8 = r2
            r7.a(r8, r9, r10, r11, r12)
            return
        L2b:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            if (r14 != 0) goto L3e
            java.util.Map<java.lang.String, java.lang.Long> r14 = sg.bigo.ads.controller.loader.AbstractAdLoader.f103811a
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r14.put(r6, r1)
        L3e:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            r1 = 3
            java.lang.String r3 = "AbstractAdLoader"
            r7 = -1
            if (r14 != 0) goto L76
            sg.bigo.ads.api.a.h r14 = sg.bigo.ads.api.a.i.f102116a
            if (r14 == 0) goto L76
            sg.bigo.ads.api.a.b r14 = r14.q()
            boolean r4 = r14.b(r6)
            if (r4 == 0) goto L76
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<sg.bigo.ads.controller.loader.AbstractAdLoader$a>> r4 = sg.bigo.ads.controller.loader.AbstractAdLoader.f103812b
            java.lang.Object r9 = r4.get(r6)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L69
            java.util.concurrent.CopyOnWriteArrayList r9 = new java.util.concurrent.CopyOnWriteArrayList
            r9.<init>()
            r4.put(r6, r9)
        L69:
            r9.add(r0, r2)
            long r9 = r14.e(r6)
            java.lang.String r14 = "Prepare for ad load, the tmax switch is on."
            sg.bigo.ads.common.t.a.a(r0, r1, r3, r14)
            goto L77
        L76:
            r9 = r7
        L77:
            sg.bigo.ads.controller.e.a$a r14 = sg.bigo.ads.BigoAdSdk.a(r5, r2)
            if (r14 == 0) goto L9c
            r2.f103865j = r14
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 <= 0) goto L9c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r4 = "Start timeout task for "
            r14.<init>(r4)
            r14.append(r9)
            java.lang.String r4 = "s"
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            sg.bigo.ads.common.t.a.a(r0, r1, r3, r14)
            a(r2, r9)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.loader.AbstractAdLoader.a(sg.bigo.ads.api.b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(AbstractAdLoader<U, T>.a aVar, int i10, int i11, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, l> pair) {
        l lVar;
        sg.bigo.ads.api.b bVar;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        String str2;
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        if (pair != null) {
            bVar = (sg.bigo.ads.api.b) pair.first;
            lVar = (l) pair.second;
        } else {
            lVar = null;
            bVar = null;
        }
        if (bVar != null) {
            bVar.f102124h.a();
        }
        String strL = lVar != null ? lVar.l() : null;
        if (TextUtils.isEmpty(strL) && bVar != null) {
            strL = bVar.f102117a;
        }
        if (TextUtils.isEmpty(strL)) {
            strL = aVar.f103863h;
        }
        boolean z11 = i11 == 10213;
        if (!z11 && !TextUtils.isEmpty(strL)) {
            f103811a.remove(strL);
        }
        boolean z12 = i10 == 1011;
        boolean z13 = i11 == 10206;
        if (z13) {
            i12 = 3;
        } else {
            if (z11) {
                i13 = 3;
            } else if (aVar.f103858c) {
                i13 = 2;
            } else {
                i13 = aVar.f103859d ? 4 : 1;
            }
            a.C1280a<sg.bigo.ads.api.b> c1280a = aVar.f103865j;
            int i18 = c1280a != null ? c1280a.f103585f : 0;
            int i19 = (c1280a == null || (pVar4 = c1280a.f103586g) == null) ? 3 : pVar4.f102213a ? 1 : 0;
            if (c1280a == null || (pVar3 = c1280a.f103586g) == null || !pVar3.f102214b) {
                i14 = 4;
                i15 = i18;
                z10 = false;
            } else {
                i14 = 4;
                i15 = i18;
                z10 = true;
            }
            if (c1280a != null && (pVar2 = c1280a.f103586g) != null) {
                i14 = pVar2.f102215c;
            }
            if (c1280a == null || (pVar = c1280a.f103586g) == null) {
                i16 = i19;
                i17 = i14;
                str2 = null;
            } else {
                i16 = i19;
                i17 = i14;
                str2 = pVar.f102216d;
            }
            i12 = 3;
            sg.bigo.ads.core.d.b.a(lVar, bVar, i10, i11, str, i13, i15, i16, z10, i17, str2);
        }
        aVar.a();
        aVar.f103862g = true;
        b(aVar.b(), aVar);
        if (!z13 && (aVar.f103858c || aVar.f103859d || z12)) {
            sg.bigo.ads.common.t.a.a(0, i12, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(strL, aVar, null, 0, i10, i11, str, false, null);
            this.f103813c.onError(new AdError(i10, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public final void a(final AbstractAdLoader<U, T>.a aVar, final int i10, final l lVar, @NonNull sg.bigo.ads.api.b bVar, @NonNull f... fVarArr) {
        Ad adA = bVar.e() ? a(bVar, fVarArr) : a((f) k.b(fVarArr));
        if (adA == null) {
            a(aVar.b(), (AbstractAdLoader<U, T>.a) aVar, (Ad) null, 1005, 1009, "Unmatched ad type.");
            return;
        }
        if (!(adA instanceof d)) {
            a(lVar == null ? null : lVar.l(), (AbstractAdLoader<U, T>.a) aVar, adA, 1024, 1010, "Unknown ad.");
            return;
        }
        a.C1280a<sg.bigo.ads.api.b> c1280a = aVar.f103865j;
        if (c1280a != null) {
            c1280a.f103584e = 3;
        }
        sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(adA);
        int i11 = aVar.f103858c ? 2 : aVar.f103859d ? 4 : 1;
        a.C1280a<sg.bigo.ads.api.b> c1280a2 = aVar.f103865j;
        sg.bigo.ads.controller.loader.a.a(bVarArrA, i11, c1280a2 == null ? 0 : c1280a2.f103585f, false);
        ((d) adA).a(new b<U, T>() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.5
            @Override // sg.bigo.ads.controller.loader.AbstractAdLoader.b
            public final AbstractAdLoader<U, T> a() {
                return AbstractAdLoader.this;
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(final U u10) {
                final AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                final a aVar2 = aVar;
                final int i12 = i10;
                final l lVar2 = lVar;
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar3 = lVar2;
                        String strL = lVar3 == null ? null : lVar3.l();
                        if (!TextUtils.isEmpty(strL)) {
                            AbstractAdLoader.f103811a.remove(strL);
                        }
                        a aVar3 = aVar2;
                        aVar3.f103862g = true;
                        AbstractAdLoader.b(strL, aVar3);
                        aVar2.a();
                        AbstractAdLoader<U, T>.a aVar4 = aVar2;
                        if (aVar4.f103858c) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u10, 1);
                        } else if (aVar4.f103859d) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u10, 2);
                        } else {
                            AbstractAdLoader.this.a(strL, aVar4, sg.bigo.ads.controller.loader.a.a(u10), 1, 0, 0, null, true, u10);
                            AbstractAdLoader.this.a(u10);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u10, int i12, int i13, String str) {
                AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                l lVar2 = lVar;
                abstractAdLoader.a(lVar2 == null ? null : lVar2.l(), aVar, u10, i12, i13, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u10, boolean z10, int i12, int i13, String str, boolean z11) {
            }
        });
    }

    private static void a(AbstractAdLoader<U, T>.a aVar, long j10) {
        sg.bigo.ads.common.n.d.a(3, aVar.f103868m, j10 * 1000);
    }

    @CallSuper
    public final void a(AbstractAdLoader<U, T>.a aVar, l lVar, @NonNull Ad ad2, int i10) {
        List<a> list;
        a.C1280a<sg.bigo.ads.api.b> c1280a = aVar.f103865j;
        String str = c1280a == null ? "unknown" : c1280a.f103580a.f102124h.f102126b;
        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The ad timeout for session id: ".concat(String.valueOf(str)));
        if (lVar != null) {
            String strL = lVar.l();
            if (TextUtils.isEmpty(strL)) {
                strL = aVar.b();
            }
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
            for (int i11 = 0; bVarArrA != null && i11 < bVarArrA.length; i11++) {
                sg.bigo.ads.api.core.b bVar = bVarArrA[i11];
                bVar.T();
                bVar.c(i10);
                bVar.S();
            }
            a aVarRemove = (TextUtils.isEmpty(strL) || (list = f103812b.get(strL)) == null || list.size() <= 0) ? null : list.remove(0);
            if (aVarRemove != null) {
                a(lVar, strL, aVarRemove, ad2);
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The timeout ad fill to another request for session id: ".concat(String.valueOf(str)));
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The timeout ad put in cache for session id: " + str + ", ad: " + String.valueOf(ad2));
            a(ad2, false);
            b.a.f100151a.a(lVar, ad2);
        }
    }

    private static boolean a(String str) {
        h hVar;
        if (!TextUtils.isEmpty(str) && (hVar = i.f102116a) != null && hVar.q().i(str)) {
            long j10 = i.f102116a.q().j(str);
            if (j10 < 0) {
                return false;
            }
            if (j10 == 0 && f103811a.containsKey(str)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
            long j11 = j10 * 1000;
            Long l10 = f103811a.get(str);
            if (l10 != null && SystemClock.elapsedRealtime() - l10.longValue() < j11) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
        }
        return false;
    }
}
