package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes4.dex */
public final class c43 implements oq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final nq f109213i = new nq() { // from class: yads.t4
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return c43.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f109214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f109215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f109217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f109218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f109219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d6 f109220h = d6.f109796h;

    public static c43 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), 0);
        long j10 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z10 = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        d6 d6Var = bundle2 != null ? (d6) d6.f109798j.fromBundle(bundle2) : d6.f109796h;
        c43 c43Var = new c43();
        c43Var.a(null, null, i10, j10, j11, d6Var, z10);
        return c43Var;
    }

    public final int b(long j10) {
        d6 d6Var = this.f109220h;
        long j11 = this.f109217e;
        int i10 = d6Var.f109800c - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = d6Var.a(i10).f109253b;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i10--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            c6 c6VarA = d6Var.a(i10);
            if (c6VarA.f109254c != -1) {
                for (int i11 = 0; i11 < c6VarA.f109254c; i11++) {
                    int i12 = c6VarA.f109256e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c43.class.equals(obj.getClass())) {
            c43 c43Var = (c43) obj;
            if (w83.a(this.f109214b, c43Var.f109214b) && w83.a(this.f109215c, c43Var.f109215c) && this.f109216d == c43Var.f109216d && this.f109217e == c43Var.f109217e && this.f109218f == c43Var.f109218f && this.f109219g == c43Var.f109219g && w83.a(this.f109220h, c43Var.f109220h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f109214b;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31;
        Object obj2 = this.f109215c;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f109216d) * 31;
        long j10 = this.f109217e;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f109218f;
        return this.f109220h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f109219g ? 1 : 0)) * 31);
    }

    public final long a(int i10, int i11) {
        c6 c6VarA = this.f109220h.a(i10);
        if (c6VarA.f109254c != -1) {
            return c6VarA.f109257f[i11];
        }
        return -9223372036854775807L;
    }

    public final int a(long j10) {
        d6 d6Var = this.f109220h;
        long j11 = this.f109217e;
        d6Var.getClass();
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = d6Var.f109803f;
            while (i10 < d6Var.f109800c) {
                if (d6Var.a(i10).f109253b == Long.MIN_VALUE || d6Var.a(i10).f109253b > j10) {
                    c6 c6VarA = d6Var.a(i10);
                    if (c6VarA.f109254c == -1 || c6VarA.a(-1) < c6VarA.f109254c) {
                        break;
                    }
                }
                i10++;
            }
            if (i10 < d6Var.f109800c) {
                return i10;
            }
        }
        return -1;
    }

    public final int a(int i10) {
        return this.f109220h.a(i10).a(-1);
    }

    public final long a() {
        return this.f109218f;
    }

    public final c43 a(Object obj, Object obj2, int i10, long j10, long j11, d6 d6Var, boolean z10) {
        this.f109214b = obj;
        this.f109215c = obj2;
        this.f109216d = i10;
        this.f109217e = j10;
        this.f109218f = j11;
        this.f109220h = d6Var;
        this.f109219g = z10;
        return this;
    }
}
