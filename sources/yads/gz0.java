package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class gz0 extends mj2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nq f111407e = new nq() { // from class: yads.w7
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return gz0.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111409d;

    public gz0() {
        this.f111408c = false;
        this.f111409d = false;
    }

    public static gz0 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new gz0(bundle.getBoolean(Integer.toString(2, 36), false)) : new gz0();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gz0)) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        return this.f111409d == gz0Var.f111409d && this.f111408c == gz0Var.f111408c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f111408c), Boolean.valueOf(this.f111409d)});
    }

    public gz0(boolean z10) {
        this.f111408c = true;
        this.f111409d = z10;
    }
}
