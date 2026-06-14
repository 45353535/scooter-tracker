package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3932od extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3957pd f39199a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3932od(C3957pd c3957pd, Continuation continuation) {
        super(2, continuation);
        this.f39199a = c3957pd;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3932od(this.f39199a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3932od(this.f39199a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        InterfaceC3878m9 interfaceC3878m9L = this.f39199a.l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        C3957pd c3957pd = this.f39199a;
        Hc hc2 = c3957pd.f39280i;
        C3605be c3605be = c3957pd.f39277f;
        G g10 = c3957pd.f39960a.f39883b;
        hc2.a(c3605be, new AdMetaInfo(g10.f36902e, g10.f36909l));
        return Unit.f93236a;
    }
}
