package com.inmobi.media;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3996r3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f39436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f39437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3996r3(S2 s22, InterfaceC3878m9 interfaceC3878m9, Continuation continuation) {
        super(2, continuation);
        this.f39436b = s22;
        this.f39437c = interfaceC3878m9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3996r3(this.f39436b, this.f39437c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3996r3(this.f39436b, this.f39437c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39435a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4121w3 c4121w3 = C4121w3.f39816a;
            SystemClock.elapsedRealtime();
            if (this.f39436b.f37688e) {
                InterfaceC3878m9 interfaceC3878m9 = this.f39437c;
                if (interfaceC3878m9 != null) {
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m9).c("w3", "ping in web view");
                }
                new C3773i3(C4121w3.f39827l).a(this.f39436b);
                return Unit.f93236a;
            }
            InterfaceC3878m9 interfaceC3878m92 = this.f39437c;
            if (interfaceC3878m92 != null) {
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).c("w3", "ping in http executor");
            }
            C3822k3 c3822k3 = new C3822k3();
            S2 s22 = this.f39436b;
            this.f39435a = 1;
            obj = c3822k3.a(s22, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        EnumC3571a6 enumC3571a6 = (EnumC3571a6) obj;
        if (enumC3571a6 != null) {
            C4121w3.f39827l.a(this.f39436b, enumC3571a6);
        } else {
            C4121w3.f39827l.a(this.f39436b);
        }
        return Unit.f93236a;
    }
}
