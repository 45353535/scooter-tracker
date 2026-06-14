package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes4.dex */
public final class tg3 implements oq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f116239f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f116242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f116243e;

    static {
        new nq() { // from class: yads.tq0
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return tg3.a(bundle);
            }
        };
    }

    public tg3(int i10, int i11, int i12, float f10) {
        this.f116240b = i10;
        this.f116241c = i11;
        this.f116242d = i12;
        this.f116243e = f10;
    }

    public static tg3 a(Bundle bundle) {
        return new tg3(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tg3) {
            tg3 tg3Var = (tg3) obj;
            if (this.f116240b == tg3Var.f116240b && this.f116241c == tg3Var.f116241c && this.f116242d == tg3Var.f116242d && this.f116243e == tg3Var.f116243e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f116243e) + ((((((this.f116240b + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.f116241c) * 31) + this.f116242d) * 31);
    }
}
