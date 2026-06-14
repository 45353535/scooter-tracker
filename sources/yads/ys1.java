package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class ys1 {

    @NotNull
    public static final xs1 Companion = new xs1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KSerializer[] f118366f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f118367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f118370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f118371e;

    static {
        yg.y2 y2Var = yg.y2.f119104a;
        f118366f = new KSerializer[]{null, null, null, new yg.c1(y2Var, vg.a.t(y2Var)), null};
    }

    public /* synthetic */ ys1(int i10, long j10, String str, String str2, Map map, String str3) {
        if (31 != (i10 & 31)) {
            yg.e2.a(i10, 31, ws1.f117552a.getDescriptor());
        }
        this.f118367a = j10;
        this.f118368b = str;
        this.f118369c = str2;
        this.f118370d = map;
        this.f118371e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys1)) {
            return false;
        }
        ys1 ys1Var = (ys1) obj;
        return this.f118367a == ys1Var.f118367a && Intrinsics.areEqual(this.f118368b, ys1Var.f118368b) && Intrinsics.areEqual(this.f118369c, ys1Var.f118369c) && Intrinsics.areEqual(this.f118370d, ys1Var.f118370d) && Intrinsics.areEqual(this.f118371e, ys1Var.f118371e);
    }

    public final int hashCode() {
        int iA = j4.a(this.f118369c, j4.a(this.f118368b, androidx.collection.b.a(this.f118367a) * 31, 31), 31);
        Map map = this.f118370d;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f118371e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkRequestLog(timestamp=" + this.f118367a + ", method=" + this.f118368b + ", url=" + this.f118369c + ", headers=" + this.f118370d + ", body=" + this.f118371e + ")";
    }

    public ys1(long j10, String str, String str2, Map map, String str3) {
        this.f118367a = j10;
        this.f118368b = str;
        this.f118369c = str2;
        this.f118370d = map;
        this.f118371e = str3;
    }
}
