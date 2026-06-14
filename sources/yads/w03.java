package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class w03 extends mj2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nq f117264e = new nq() { // from class: yads.vs0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return w03.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f117266d;

    public w03(int i10) {
        fi.a("maxStars must be a positive integer", i10 > 0);
        this.f117265c = i10;
        this.f117266d = -1.0f;
    }

    public static w03 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i10 = bundle.getInt(Integer.toString(1, 36), 5);
        float f10 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f10 == -1.0f ? new w03(i10) : new w03(i10, f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w03)) {
            return false;
        }
        w03 w03Var = (w03) obj;
        return this.f117265c == w03Var.f117265c && this.f117266d == w03Var.f117266d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f117265c), Float.valueOf(this.f117266d)});
    }

    public w03(int i10, float f10) {
        boolean z10 = false;
        fi.a("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        fi.a("starRating is out of range [0, maxStars]", z10);
        this.f117265c = i10;
        this.f117266d = f10;
    }
}
