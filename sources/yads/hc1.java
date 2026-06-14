package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class hc1 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f111552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2 f111553e;

    public hc1(Iterator it, je2 je2Var) {
        this.f111552d = it;
        this.f111553e = je2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.f111552d.hasNext()) {
            Object next = this.f111552d.next();
            if (this.f111553e.apply(next)) {
                return next;
            }
        }
        this.f110994b = 3;
        return null;
    }
}
