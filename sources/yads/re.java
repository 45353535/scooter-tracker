package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f43 f115411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kl1 f115413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f115414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f43 f115415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f115416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kl1 f115417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f115418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f115419j;

    public re(long j10, f43 f43Var, int i10, kl1 kl1Var, long j11, f43 f43Var2, int i11, kl1 kl1Var2, long j12, long j13) {
        this.f115410a = j10;
        this.f115411b = f43Var;
        this.f115412c = i10;
        this.f115413d = kl1Var;
        this.f115414e = j11;
        this.f115415f = f43Var2;
        this.f115416g = i11;
        this.f115417h = kl1Var2;
        this.f115418i = j12;
        this.f115419j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && re.class == obj.getClass()) {
            re reVar = (re) obj;
            if (this.f115410a == reVar.f115410a && this.f115412c == reVar.f115412c && this.f115414e == reVar.f115414e && this.f115416g == reVar.f115416g && this.f115418i == reVar.f115418i && this.f115419j == reVar.f115419j && y72.a(this.f115411b, reVar.f115411b) && y72.a(this.f115413d, reVar.f115413d) && y72.a(this.f115415f, reVar.f115415f) && y72.a(this.f115417h, reVar.f115417h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f115410a), this.f115411b, Integer.valueOf(this.f115412c), this.f115413d, Long.valueOf(this.f115414e), this.f115415f, Integer.valueOf(this.f115416g), this.f115417h, Long.valueOf(this.f115418i), Long.valueOf(this.f115419j)});
    }
}
