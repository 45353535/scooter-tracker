package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class bt1 {

    @NotNull
    public static final at1 Companion = new at1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KSerializer[] f109096e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f109097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f109098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f109099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f109100d;

    static {
        yg.y2 y2Var = yg.y2.f119104a;
        f109096e = new KSerializer[]{null, null, new yg.c1(y2Var, vg.a.t(y2Var)), null};
    }

    public /* synthetic */ bt1(int i10, long j10, Integer num, Map map, String str) {
        if (15 != (i10 & 15)) {
            yg.e2.a(i10, 15, zs1.f118796a.getDescriptor());
        }
        this.f109097a = j10;
        this.f109098b = num;
        this.f109099c = map;
        this.f109100d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1Var = (bt1) obj;
        return this.f109097a == bt1Var.f109097a && Intrinsics.areEqual(this.f109098b, bt1Var.f109098b) && Intrinsics.areEqual(this.f109099c, bt1Var.f109099c) && Intrinsics.areEqual(this.f109100d, bt1Var.f109100d);
    }

    public final int hashCode() {
        int iA = androidx.collection.b.a(this.f109097a) * 31;
        Integer num = this.f109098b;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.f109099c;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f109100d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.f109097a + ", statusCode=" + this.f109098b + ", headers=" + this.f109099c + ", body=" + this.f109100d + ")";
    }

    public bt1(long j10, Integer num, Map map, String str) {
        this.f109097a = j10;
        this.f109098b = num;
        this.f109099c = map;
        this.f109100d = str;
    }
}
