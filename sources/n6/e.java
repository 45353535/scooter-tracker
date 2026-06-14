package n6;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95114a;

        static {
            int[] iArr = new int[m6.d.values().length];
            f95114a = iArr;
            try {
                iArr[m6.d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95114a[m6.d.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95114a[m6.d.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n6.b f95115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f95116c;

        public b(n6.b bVar, f fVar) {
            this.f95115b = bVar;
            this.f95116c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map mapC = this.f95116c.c();
            if (mapC.size() > 0) {
                this.f95115b.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f95116c.b() == null) {
                this.f95115b.onSignalsCollected("");
            } else {
                this.f95115b.onSignalsCollectionFailed(this.f95116c.b());
            }
        }
    }

    @Override // n6.c
    public void a(Context context, List list, n6.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m6.d dVar = (m6.d) it.next();
            aVar.a();
            e(context, dVar, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // n6.c
    public void b(Context context, boolean z10, n6.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        e(context, m6.d.INTERSTITIAL, aVar, fVar);
        aVar.a();
        e(context, m6.d.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            e(context, m6.d.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // n6.c
    public void c(Context context, String str, m6.d dVar, n6.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        d(context, str, dVar, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    public String f(m6.d dVar) {
        int i10 = a.f95114a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal" : "gmaScarBiddingBannerSignal";
    }
}
