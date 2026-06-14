package sg.bigo.ads.ad.b.a.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.b.e;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends sg.bigo.ads.ad.b.b implements e {
    public sg.bigo.ads.ad.b.b I;
    public d.a<NativeAd> J;
    public final Object K;
    public final LinkedHashMap<sg.bigo.ads.ad.b.b, a> L;
    public final AtomicInteger O;
    public sg.bigo.ads.ad.b.a.a.a P;
    public boolean Q;
    public boolean R;
    public final int S;
    public final AtomicInteger T;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private d.a<NativeAd> f100175ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private final AtomicInteger f100176ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private final AtomicInteger f100177af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private final AtomicInteger f100178ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private final int f100179ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private boolean f100180ai;
    private final d.a<NativeAd> aj;

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f100185d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f100186e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f100182a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100183b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100184c = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f100187f = false;
    }

    public b(@NonNull f fVar, int i10) {
        super(fVar);
        this.K = new Object();
        LinkedHashMap<sg.bigo.ads.ad.b.b, a> linkedHashMap = new LinkedHashMap<>();
        this.L = linkedHashMap;
        this.f100176ae = new AtomicInteger(0);
        this.O = new AtomicInteger(0);
        this.Q = false;
        this.R = false;
        this.f100177af = new AtomicInteger(0);
        this.f100178ag = new AtomicInteger(0);
        this.T = new AtomicInteger(0);
        this.aj = new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.b.a.a.b.1
            private void b(NativeAd nativeAd) {
                b.this.f100176ae.addAndGet(1);
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    b.this.a(false, (sg.bigo.ads.ad.b.b) nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, int i11, int i12, String str) {
                b((NativeAd) ad2);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, boolean z10, int i11, int i12, String str, boolean z11) {
                NativeAd nativeAd = (NativeAd) ad2;
                if (nativeAd instanceof sg.bigo.ads.ad.b.c) {
                    sg.bigo.ads.ad.b.c cVar = (sg.bigo.ads.ad.b.c) nativeAd;
                    if (((sg.bigo.ads.core.a.a) cVar.f()).bh() != null || z10) {
                        a((NativeAd) cVar);
                    } else if (z11) {
                        b(cVar);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // sg.bigo.ads.api.b.d.a
            public void a(NativeAd nativeAd) {
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    b.this.a(true, (sg.bigo.ads.ad.b.b) nativeAd);
                }
            }
        };
        this.f100179ah = i10;
        sg.bigo.ads.api.core.b bVar = fVar.f102174a;
        int iW = bVar.w();
        if (i10 == 3) {
            HashMap map = new HashMap();
            map.put("video_play_page", "ad1_video_page");
            map.put("endpage", "ad1_end_page");
            bVar.a(bVar.e().a(map));
        }
        if (bVar instanceof n) {
            ((n) bVar).l(1);
        }
        a(iW, fVar.a(bVar));
        List<sg.bigo.ads.api.core.b> listAm = bVar.am();
        if (listAm != null && !listAm.isEmpty()) {
            sg.bigo.ads.api.core.b bVar2 = listAm.get(0);
            if (bVar.e() != null && i10 == 3) {
                HashMap map2 = new HashMap();
                map2.put("video_play_page", "ad2_video_page");
                map2.put("endpage", "ad2_end_page");
                bVar2.a(bVar.e().a(map2));
            }
            int iW2 = bVar2.w();
            if (bVar2 instanceof n) {
                ((n) bVar2).l(2);
            }
            a(iW2, fVar.a(bVar2));
        }
        this.S = linkedHashMap.size();
    }

    public final sg.bigo.ads.ad.b.b G() {
        sg.bigo.ads.ad.b.b key;
        synchronized (this.K) {
            try {
                Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        key = null;
                        break;
                    }
                    Map.Entry<sg.bigo.ads.ad.b.b, a> next = it.next();
                    if (!next.getKey().p() && next.getValue().f100182a) {
                        key = next.getKey();
                        next.getValue().f100187f = true;
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return key;
    }

    public final void H() {
        sg.bigo.ads.ad.b.b bVar = this.I;
        if (bVar == null || bVar.f100342i) {
            return;
        }
        bVar.destroy();
    }

    @Override // sg.bigo.ads.api.b.e
    public final void K() {
        AdInteractionListener adInteractionListener = this.f100334a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.b.e
    public final int L() {
        return this.f100179ah;
    }

    @Override // sg.bigo.ads.api.b.e
    public final int b(sg.bigo.ads.api.b.a aVar) {
        a aVar2;
        if (!(aVar instanceof sg.bigo.ads.ad.b.b) || (aVar2 = this.L.get(aVar)) == null) {
            return 0;
        }
        if (aVar2.f100184c <= 0) {
            aVar2.f100184c = this.f100178ag.incrementAndGet();
        }
        return aVar2.f100184c;
    }

    @Override // sg.bigo.ads.api.b.e
    public final int c(sg.bigo.ads.api.b.a aVar) {
        b(aVar);
        a aVar2 = this.L.get(aVar);
        if (aVar2 == null) {
            return 0;
        }
        if (aVar2.f100183b <= 0) {
            aVar2.f100183b = this.f100177af.incrementAndGet();
        }
        return aVar2.f100183b;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        H();
        Iterator<sg.bigo.ads.ad.b.b> it = this.L.keySet().iterator();
        while (it.hasNext()) {
            sg.bigo.ads.core.player.b.a().a(((sg.bigo.ads.core.a.a) it.next().f()).aJ());
        }
        this.L.clear();
        this.I = null;
        this.J = null;
    }

    public final sg.bigo.ads.ad.b.b e(int i10) {
        sg.bigo.ads.ad.b.b key;
        if (this.O.get() == this.S) {
            return f(i10);
        }
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                key = null;
                break;
            }
            Map.Entry<sg.bigo.ads.ad.b.b, a> next = it.next();
            a value = next.getValue();
            if (!value.f100187f && value.f100182a) {
                value.f100187f = true;
                key = next.getKey();
                break;
            }
        }
        if (key != null) {
            return key;
        }
        for (Map.Entry<sg.bigo.ads.ad.b.b, a> entry : this.L.entrySet()) {
            a value2 = entry.getValue();
            if (!value2.f100187f) {
                value2.f100187f = true;
                return entry.getKey();
            }
        }
        return key;
    }

    public final sg.bigo.ads.ad.b.b f(int i10) {
        if (i10 > this.L.size() - 1) {
            return null;
        }
        int i11 = 0;
        for (sg.bigo.ads.ad.b.b bVar : this.L.keySet()) {
            if (i11 == i10) {
                return bVar;
            }
            i11++;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        sg.bigo.ads.ad.b.b bVarF = f(0);
        if (bVarF != null) {
            return bVarF.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        sg.bigo.ads.ad.b.b bVarF = f(0);
        if (bVarF != null) {
            return bVarF.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.c
    public final boolean p() {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().p()) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().setAdInteractionListener(adInteractionListener);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void u() {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().u();
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        sg.bigo.ads.ad.b.b bVar = this.I;
        return bVar != null ? (ValueType) bVar.b(str, valuetype) : (ValueType) super.b(str, valuetype);
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    @NonNull
    public final /* bridge */ /* synthetic */ sg.bigo.ads.api.core.b f() {
        sg.bigo.ads.ad.b.b bVar = this.I;
        return (sg.bigo.ads.core.a.a) (bVar != null ? bVar.f() : super.f());
    }

    private void a(int i10, f fVar) {
        LinkedHashMap<sg.bigo.ads.ad.b.b, a> linkedHashMap;
        sg.bigo.ads.ad.b.b dVar;
        a aVar;
        if (i10 == 1) {
            linkedHashMap = this.L;
            dVar = new c(fVar, this);
            aVar = new a();
        } else {
            if (i10 != 2) {
                return;
            }
            linkedHashMap = this.L;
            dVar = new d(fVar, this);
            aVar = new a();
        }
        linkedHashMap.put(dVar, aVar);
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b(int i10) {
        sg.bigo.ads.ad.b.b bVar = this.I;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void a(sg.bigo.ads.api.b.a aVar) {
        super.a(aVar);
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(aVar);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void b(Activity activity) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().b(activity);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull d.a<NativeAd> aVar, int i10) {
        this.f100175ad = aVar;
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(this.aj, i10);
        }
    }

    @Override // sg.bigo.ads.ad.b.d
    public final void b(boolean z10) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().b(z10);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(boolean z10) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0014, B:15:0x001d, B:17:0x0025, B:18:0x0029, B:20:0x002d, B:22:0x0036, B:24:0x003a, B:26:0x0043, B:28:0x0047, B:34:0x0068, B:29:0x004b, B:31:0x004f, B:33:0x005d), top: B:38:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r5, sg.bigo.ads.ad.b.b r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.K
            monitor-enter(r0)
            if (r5 == 0) goto L4b
            sg.bigo.ads.api.b.d$a<sg.bigo.ads.api.NativeAd> r5 = r4.f100175ad     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L4b
            java.util.LinkedHashMap<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.b.a.a.b$a> r5 = r4.L     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L1a
            sg.bigo.ads.ad.b.a.a.b$a r5 = (sg.bigo.ads.ad.b.a.a.b.a) r5     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            if (r5 == 0) goto L1c
            boolean r2 = r5.f100182a     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1c
            r2 = r1
            goto L1d
        L1a:
            r5 = move-exception
            goto L6a
        L1c:
            r2 = 0
        L1d:
            java.util.concurrent.atomic.AtomicInteger r3 = r4.O     // Catch: java.lang.Throwable -> L1a
            int r3 = r3.addAndGet(r1)     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L29
            r5.f100182a = r1     // Catch: java.lang.Throwable -> L1a
            r5.f100185d = r3     // Catch: java.lang.Throwable -> L1a
        L29:
            boolean r5 = r4.f100180ai     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L34
            r4.f100180ai = r1     // Catch: java.lang.Throwable -> L1a
            sg.bigo.ads.api.b.d$a<sg.bigo.ads.api.NativeAd> r5 = r4.f100175ad     // Catch: java.lang.Throwable -> L1a
            r5.a(r6)     // Catch: java.lang.Throwable -> L1a
        L34:
            if (r2 != 0) goto L41
            sg.bigo.ads.ad.b.a.a.a r5 = r4.P     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L41
            sg.bigo.ads.api.core.f r1 = r4.f100335b     // Catch: java.lang.Throwable -> L1a
            sg.bigo.ads.api.a.l r1 = r1.f102175b     // Catch: java.lang.Throwable -> L1a
            r5.a(r6, r1)     // Catch: java.lang.Throwable -> L1a
        L41:
            if (r2 != 0) goto L68
            sg.bigo.ads.api.b.d$a<sg.bigo.ads.api.NativeAd> r5 = r4.J     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L68
            r5.a(r6)     // Catch: java.lang.Throwable -> L1a
            goto L68
        L4b:
            sg.bigo.ads.api.b.d$a<sg.bigo.ads.api.NativeAd> r5 = r4.f100175ad     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L68
            java.util.LinkedHashMap<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.b.a.a.b$a> r5 = r4.L     // Catch: java.lang.Throwable -> L1a
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f100176ae     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L1a
            if (r5 != r1) goto L68
            sg.bigo.ads.api.b.d$a<sg.bigo.ads.api.NativeAd> r5 = r4.f100175ad     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Double video empty ads."
            r2 = 1023(0x3ff, float:1.434E-42)
            r3 = 10205(0x27dd, float:1.43E-41)
            r5.a(r6, r2, r3, r1)     // Catch: java.lang.Throwable -> L1a
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.b.a.a.b.a(boolean, sg.bigo.ads.ad.b.b):void");
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z10, boolean z11) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(z10, z11);
        }
    }
}
