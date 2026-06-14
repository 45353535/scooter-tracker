package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class nj extends pj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f113920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f113921d;

    public nj(int i10, long j10) {
        super(i10);
        this.f113919b = j10;
        this.f113920c = new ArrayList();
        this.f113921d = new ArrayList();
    }

    public final nj b(int i10) {
        int size = this.f113921d.size();
        for (int i11 = 0; i11 < size; i11++) {
            nj njVar = (nj) this.f113921d.get(i11);
            if (njVar.f114688a == i10) {
                return njVar;
            }
        }
        return null;
    }

    public final oj c(int i10) {
        int size = this.f113920c.size();
        for (int i11 = 0; i11 < size; i11++) {
            oj ojVar = (oj) this.f113920c.get(i11);
            if (ojVar.f114688a == i10) {
                return ojVar;
            }
        }
        return null;
    }

    @Override // yads.pj
    public final String toString() {
        return pj.a(this.f114688a) + " leaves: " + Arrays.toString(this.f113920c.toArray()) + " containers: " + Arrays.toString(this.f113921d.toArray());
    }
}
