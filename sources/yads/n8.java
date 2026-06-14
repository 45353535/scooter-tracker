package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class n8 {
    public static AdQualityVerifierAdapter a() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            jk2.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            objB = Result.b(null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            thG.getMessage();
            boolean z10 = lb1.f113032a;
        }
        if (Result.i(objB)) {
            objB = null;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(objB);
        return null;
    }
}
