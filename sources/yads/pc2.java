package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class pc2 implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f114610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rk1 f114612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f114613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f114614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f114615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f114616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f114617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f114618j;

    static {
        new nq() { // from class: yads.v00
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return pc2.a(bundle);
            }
        };
    }

    public pc2(Object obj, int i10, rk1 rk1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f114610b = obj;
        this.f114611c = i10;
        this.f114612d = rk1Var;
        this.f114613e = obj2;
        this.f114614f = i11;
        this.f114615g = j10;
        this.f114616h = j11;
        this.f114617i = i12;
        this.f114618j = i13;
    }

    public static pc2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        return new pc2(null, i10, bundle2 == null ? null : (rk1) rk1.f115473h.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pc2.class == obj.getClass()) {
            pc2 pc2Var = (pc2) obj;
            if (this.f114611c == pc2Var.f114611c && this.f114614f == pc2Var.f114614f && this.f114615g == pc2Var.f114615g && this.f114616h == pc2Var.f114616h && this.f114617i == pc2Var.f114617i && this.f114618j == pc2Var.f114618j && y72.a(this.f114610b, pc2Var.f114610b) && y72.a(this.f114613e, pc2Var.f114613e) && y72.a(this.f114612d, pc2Var.f114612d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f114610b, Integer.valueOf(this.f114611c), this.f114612d, this.f114613e, Integer.valueOf(this.f114614f), Long.valueOf(this.f114615g), Long.valueOf(this.f114616h), Integer.valueOf(this.f114617i), Integer.valueOf(this.f114618j)});
    }
}
