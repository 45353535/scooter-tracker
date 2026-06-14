package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class be extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce f108979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ce ceVar, Continuation continuation) {
        super(2, continuation);
        this.f108979b = ceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new be(this.f108979b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new be(this.f108979b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        pf.b.g();
        kotlin.d.b(obj);
        ce ceVar = this.f108979b;
        rd rdVarA = ceVar.f109375b.a();
        rd rdVarA2 = ceVar.f109376c.a();
        fy0 fy0Var = ceVar.f109377d;
        String strC = ((ff1) fy0Var.f110975a).c("google_advertising_id_key");
        String str2 = rdVarA != null ? rdVarA.f115403a : null;
        if (strC == null && str2 != null) {
            ((ff1) fy0Var.f110975a).a("google_advertising_id_key", str2);
        }
        fy0 fy0Var2 = ceVar.f109377d;
        fy0Var2.getClass();
        boolean z10 = false;
        if (rdVarA != null && (str = rdVarA.f115403a) != null) {
            synchronized (fy0.f110974b) {
                String strC2 = ((ff1) fy0Var2.f110975a).c("google_advertising_id_key");
                if (strC2 != null) {
                    if (!Intrinsics.areEqual(str, strC2)) {
                        z10 = true;
                    }
                }
            }
        }
        return (rdVarA == null && rdVarA2 == null) ? de.f109894a : new ee(new td(rdVarA, rdVarA2, z10));
    }
}
