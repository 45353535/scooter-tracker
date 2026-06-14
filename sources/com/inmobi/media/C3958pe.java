package com.inmobi.media;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3958pe extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4057te f39283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3958pe(C4057te c4057te, Continuation continuation) {
        super(2, continuation);
        this.f39283b = c4057te;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3958pe(this.f39283b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3958pe(this.f39283b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39282a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            InterfaceC3878m9 interfaceC3878m9L = this.f39283b.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            Flow flowB = ((Fd) this.f39283b.f39594b.f39679k.getValue()).f36846a.b();
            C3933oe c3933oe = new C3933oe(null);
            this.f39282a = 1;
            if (hg.i.y(flowB, c3933oe, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        InterfaceC3878m9 interfaceC3878m9L2 = this.f39283b.l();
        if (interfaceC3878m9L2 != null) {
            ((C3903n9) interfaceC3878m9L2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        C4082ue c4082ue = this.f39283b.f39594b;
        c4082ue.f39670b.f39548d = true;
        Map mapA = AbstractC3789ik.a(((Dc) c4082ue.f39675g.f36794f.getValue()).f36723a);
        Wj wj = Wj.f37959a;
        Wj.b("MRCViewable50Rendered", mapA, EnumC3585ak.f38215a);
        this.f39283b.f39594b.f39674f.f37444b.f37283g.a(Te.f37766a);
        ((Fd) this.f39283b.f39594b.f39679k.getValue()).f36846a.a();
        return Unit.f93236a;
    }
}
