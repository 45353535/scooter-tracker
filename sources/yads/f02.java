package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class f02 implements w52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw1 f110569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yz1 f110570b;

    public f02(rw1 rw1Var) {
        this.f110569a = rw1Var;
    }

    @Override // yads.w52
    public final void a(yz1 yz1Var) {
        yz1Var.a();
    }

    @Override // yads.w52
    public final void a(yz1 yz1Var, pu puVar) {
        this.f110570b = yz1Var;
        rw1 rw1Var = this.f110569a;
        tb tbVar = new tb(yz1Var, puVar, rw1Var.f115627e, new ni3());
        for (gi giVar : rw1Var.f115624b) {
            hi hiVarA = yz1Var.a(giVar);
            if (!androidx.activity.s.a(hiVarA)) {
                hiVarA = null;
            }
            if (hiVarA != null) {
                hiVarA.c(giVar.f111215c);
                Intrinsics.checkNotNull(giVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                hiVarA.a(giVar, tbVar);
            }
        }
        gk2 gk2Var = yz1Var.f118468b.f112907e;
        KProperty kProperty = l02.f112902g[4];
        List list = (List) gk2Var.f111244a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // yads.w52
    public final void a() {
        yz1 yz1Var = this.f110570b;
        if (yz1Var != null) {
            for (gi giVar : this.f110569a.f115624b) {
                hi hiVarA = yz1Var.a(giVar);
                if (hiVarA instanceof ye0) {
                    ((ye0) hiVarA).b(giVar.f111215c);
                }
            }
        }
    }
}
