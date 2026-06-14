package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class hk implements oq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hk f111607h = new hk(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f111611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f111612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gk f111613g;

    static {
        new nq() { // from class: yads.a8
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return hk.a(bundle);
            }
        };
    }

    public hk(int i10, int i11, int i12, int i13, int i14) {
        this.f111608b = i10;
        this.f111609c = i11;
        this.f111610d = i12;
        this.f111611e = i13;
        this.f111612f = i14;
    }

    public static hk a(Bundle bundle) {
        return new hk(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk.class == obj.getClass()) {
            hk hkVar = (hk) obj;
            if (this.f111608b == hkVar.f111608b && this.f111609c == hkVar.f111609c && this.f111610d == hkVar.f111610d && this.f111611e == hkVar.f111611e && this.f111612f == hkVar.f111612f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f111608b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f111609c) * 31) + this.f111610d) * 31) + this.f111611e) * 31) + this.f111612f;
    }
}
