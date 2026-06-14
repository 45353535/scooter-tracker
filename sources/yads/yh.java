package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh f118181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(zh zhVar, Continuation continuation) {
        super(2, continuation);
        this.f118181b = zhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new yh(this.f118181b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yh(this.f118181b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            long jB = ((ff1) this.f118181b.f118679e.f109902a).b("ExitInfoAnrLastReportedTimestamp");
            zh zhVar = this.f118181b;
            wh whVar = zhVar.f118677c;
            pf pfVar = zhVar.f118675a;
            List listA = whVar.a(pfVar.f114652b, pfVar.f114653c, jB);
            if (listA.isEmpty()) {
                return Unit.f93236a;
            }
            this.f118181b.f118681g.getClass();
            ArrayList arrayListA = ff.a(listA);
            if (arrayListA.isEmpty()) {
                return Unit.f93236a;
            }
            ArrayList arrayListA2 = this.f118181b.f118681g.a(arrayListA);
            if (arrayListA2.isEmpty()) {
                return Unit.f93236a;
            }
            this.f118181b.f118678d.a(arrayListA2);
            zh.a(this.f118181b, arrayListA2);
            this.f118181b.f118682h.set(false);
            return Unit.f93236a;
        } finally {
            this.f118181b.f118682h.set(false);
        }
    }
}
