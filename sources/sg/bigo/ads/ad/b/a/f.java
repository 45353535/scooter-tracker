package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.b.d;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends sg.bigo.ads.ad.b.b {
    public f(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull d.a<NativeAd> aVar, int i10) {
        if (this.f100338e || this.f100339f) {
            return;
        }
        String strA = this.f100335b.f102174a.N().a();
        if (!URLUtil.isNetworkUrl(strA)) {
            strA = null;
        }
        if (strA != null) {
            aVar.a(this);
        } else {
            aVar.a(this, 1005, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Illegal Land Url");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.f100350q) {
            return;
        }
        this.f100350q = true;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.f100344k);
    }
}
