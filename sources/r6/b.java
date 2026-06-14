package r6;

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
    private p6.a f99222a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99223a;

        static {
            int[] iArr = new int[d.values().length];
            f99223a = iArr;
            try {
                iArr[d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99223a[d.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99223a[d.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(p6.a aVar) {
        this.f99222a = aVar;
    }

    @Override // n6.c
    public void d(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, g(dVar), this.f99222a.a(), new r6.a(str, new n6.d(aVar, fVar)));
    }

    @Override // n6.c
    public void e(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(dVar), dVar, aVar, fVar);
    }

    public AdFormat g(d dVar) {
        int i10 = a.f99223a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? AdFormat.UNKNOWN : AdFormat.REWARDED : AdFormat.INTERSTITIAL : AdFormat.BANNER;
    }
}
