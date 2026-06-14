package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class tv2 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f116398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uv2 f116399e;

    public tv2(uv2 uv2Var) {
        this.f116399e = uv2Var;
        this.f116398d = uv2Var.f116791b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.f116398d.hasNext()) {
            Object next = this.f116398d.next();
            if (this.f116399e.f116792c.contains(next)) {
                return next;
            }
        }
        this.f110994b = 3;
        return null;
    }
}
