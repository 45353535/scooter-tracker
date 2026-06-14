package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ra2 extends mj2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nq f115390d = new nq() { // from class: yads.yj0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return ra2.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f115391c;

    public ra2() {
        this.f115391c = -1.0f;
    }

    public static ra2 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f10 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f10 == -1.0f ? new ra2() : new ra2(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ra2) && this.f115391c == ((ra2) obj).f115391c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f115391c)});
    }

    public ra2(float f10) {
        fi.a("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.f115391c = f10;
    }
}
