package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pf f118675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f118676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wh f118677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xh f118678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final df f118679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k10 f118680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ff f118681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f118682h = new AtomicBoolean(false);

    public zh(pf pfVar, CoroutineScope coroutineScope, wh whVar, xh xhVar, df dfVar, dm2 dm2Var) {
        this.f118675a = pfVar;
        this.f118676b = coroutineScope;
        this.f118677c = whVar;
        this.f118678d = xhVar;
        this.f118679e = dfVar;
        this.f118680f = new k10(dm2Var);
        this.f118681g = new ff(pfVar.a());
    }

    public static final void a(zh zhVar, ArrayList arrayList) {
        Long l10;
        zhVar.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((aa2) it.next()).f108615a.f110353a);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((aa2) it.next()).f108615a.f110353a);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long jB = ((ff1) zhVar.f118679e.f109902a).b("ExitInfoAnrLastReportedTimestamp");
            df dfVar = zhVar.f118679e;
            ((ff1) dfVar.f109902a).a("ExitInfoAnrLastReportedTimestamp", Math.max(jB, jLongValue));
        }
    }
}
