package n9;

import com.vungle.ads.internal.protos.Sdk;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f95432e = new n0(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f95433f = o0.C0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f95434g = o0.C0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f95435h = o0.C0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f95439d;

    public n0(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f95436a == n0Var.f95436a && this.f95437b == n0Var.f95437b && this.f95439d == n0Var.f95439d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f95436a) * 31) + this.f95437b) * 31) + Float.floatToRawIntBits(this.f95439d);
    }

    public n0(int i10, int i11, float f10) {
        this.f95436a = i10;
        this.f95437b = i11;
        this.f95438c = 0;
        this.f95439d = f10;
    }
}
