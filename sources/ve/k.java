package ve;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f106681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f106682c;

    public k(String value, List params) {
        Double d10;
        Object next;
        String strD;
        Double dT;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f106680a = value;
        this.f106681b = params;
        Iterator it = params.iterator();
        while (true) {
            d10 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((l) next).c(), CampaignEx.JSON_KEY_AD_Q)) {
                    break;
                }
            }
        }
        l lVar = (l) next;
        double dDoubleValue = 1.0d;
        if (lVar != null && (strD = lVar.d()) != null && (dT = StringsKt.t(strD)) != null) {
            double dDoubleValue2 = dT.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d10 = dT;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.f106682c = dDoubleValue;
    }

    public final List a() {
        return this.f106681b;
    }

    public final String b() {
        return this.f106680a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f106680a, kVar.f106680a) && Intrinsics.areEqual(this.f106681b, kVar.f106681b);
    }

    public int hashCode() {
        return (this.f106680a.hashCode() * 31) + this.f106681b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f106680a + ", params=" + this.f106681b + ')';
    }
}
