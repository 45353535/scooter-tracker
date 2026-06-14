package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iy2 implements w52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112185a;

    public iy2(List list) {
        this.f112185a = list;
    }

    @Override // yads.w52
    public final void a() {
    }

    @Override // yads.w52
    public final void a(yz1 yz1Var) {
    }

    @Override // yads.w52
    public final void a(yz1 yz1Var, pu puVar) {
        List<gi> list = this.f112185a;
        if (list != null) {
            mb mbVar = new mb(yz1Var, puVar);
            for (gi giVar : list) {
                hi hiVarA = yz1Var.a(giVar);
                if (!androidx.activity.s.a(hiVarA)) {
                    hiVarA = null;
                }
                if (hiVarA != null) {
                    hiVarA.c(giVar.f111215c);
                    Intrinsics.checkNotNull(giVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                    hiVarA.a(giVar, mbVar);
                }
            }
        }
    }
}
