package com.inmobi.media;

import com.inmobi.media.C3631ce;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3631ce extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4057te f38337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3631ce(C4057te c4057te, Continuation continuation) {
        super(2, continuation);
        this.f38337a = c4057te;
    }

    public static final Unit a(C4057te c4057te, short s10) {
        InterfaceC3878m9 interfaceC3878m9L = c4057te.l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "onAssetClickEvent " + ((int) s10));
        }
        ((Sc) c4057te.f39594b.f39681m.getValue()).a(s10);
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3631ce(this.f38337a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3631ce(this.f38337a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Ug ug2 = (Ug) this.f38337a.f39594b.f39683o.getValue();
        final C4057te c4057te = this.f38337a;
        Sg sg2 = c4057te.f39594b.f39671c;
        Function1 function1 = new Function1() { // from class: w3.d6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C3631ce.a(c4057te, ((Short) obj2).shortValue());
            }
        };
        ug2.getClass();
        Ug.a(sg2, function1);
        return Unit.f93236a;
    }
}
