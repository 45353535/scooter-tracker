package yads;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class qc implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd f114934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa f114935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu f114936c;

    public qc(gd gdVar, xa xaVar, vu vuVar) {
        this.f114934a = gdVar;
        this.f114935b = xaVar;
        this.f114936c = vuVar;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        pc pcVar = (pc) m0Var;
        Iterator it = pcVar.f114609d.iterator();
        while (it.hasNext()) {
            this.f114935b.a((String) it.next(), x53.f117712b);
        }
        this.f114934a.a(view, pcVar);
        vu vuVar = this.f114936c;
        xl2 xl2Var = xl2.f117873j;
        vuVar.getClass();
        vuVar.f117202d.a(vuVar.a(xl2Var, new HashMap()));
        return new zy0(false);
    }
}
