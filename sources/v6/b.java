package v6;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import m6.d;
import n6.c;
import n6.e;
import n6.f;

/* JADX INFO: loaded from: classes11.dex */
public class b extends e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t6.a f105763a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f105764a;

        static {
            int[] iArr = new int[d.values().length];
            f105764a = iArr;
            try {
                iArr[d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105764a[d.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(t6.a aVar) {
        this.f105763a = aVar;
    }

    @Override // n6.c
    public void d(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, g(dVar), this.f105763a.a(), new v6.a(str, new n6.d(aVar, fVar)));
    }

    @Override // n6.c
    public void e(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(dVar), dVar, aVar, fVar);
    }

    public AdFormat g(d dVar) {
        int i10 = a.f105764a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED : AdFormat.BANNER;
    }
}
