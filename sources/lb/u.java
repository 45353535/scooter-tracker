package lb;

import android.util.SparseArray;
import lb.t;
import oa.m0;
import oa.s0;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements oa.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oa.t f94123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t.a f94124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f94125d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f94126e;

    public u(oa.t tVar, t.a aVar) {
        this.f94123b = tVar;
        this.f94124c = aVar;
    }

    @Override // oa.t
    public void e(m0 m0Var) {
        this.f94123b.e(m0Var);
    }

    @Override // oa.t
    public void endTracks() {
        this.f94123b.endTracks();
        if (this.f94126e) {
            for (int i10 = 0; i10 < this.f94125d.size(); i10++) {
                ((w) this.f94125d.valueAt(i10)).k(true);
            }
        }
    }

    @Override // oa.t
    public s0 track(int i10, int i11) {
        if (i11 != 3) {
            this.f94126e = true;
            return this.f94123b.track(i10, i11);
        }
        w wVar = (w) this.f94125d.get(i10);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f94123b.track(i10, i11), this.f94124c);
        this.f94125d.put(i10, wVar2);
        return wVar2;
    }
}
