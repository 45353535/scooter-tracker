package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class dt extends i23 implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f110049k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        dt dtVar = (dt) obj;
        if (b(4) != dtVar.b(4)) {
            return b(4) ? 1 : -1;
        }
        long j10 = this.f110672f - dtVar.f110672f;
        if (j10 == 0) {
            j10 = this.f110049k - dtVar.f110049k;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
