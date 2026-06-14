package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class gc2 implements oq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gc2 f111140e = new gc2(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f111141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f111142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111143d;

    static {
        new nq() { // from class: yads.v6
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return gc2.a(bundle);
            }
        };
    }

    public gc2(float f10, float f11) {
        fi.a(f10 > 0.0f);
        fi.a(f11 > 0.0f);
        this.f111141b = f10;
        this.f111142c = f11;
        this.f111143d = Math.round(f10 * 1000.0f);
    }

    public static gc2 a(Bundle bundle) {
        return new gc2(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gc2.class == obj.getClass()) {
            gc2 gc2Var = (gc2) obj;
            if (this.f111141b == gc2Var.f111141b && this.f111142c == gc2Var.f111142c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f111142c) + ((Float.floatToRawIntBits(this.f111141b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f111141b), Float.valueOf(this.f111142c)};
        int i10 = w83.f117341a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
