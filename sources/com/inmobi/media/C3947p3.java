package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3947p3 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f39242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3947p3(String str, boolean z10, InterfaceC3878m9 interfaceC3878m9, Continuation continuation) {
        super(1, continuation);
        this.f39240b = str;
        this.f39241c = z10;
        this.f39242d = interfaceC3878m9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3947p3(this.f39240b, this.f39241c, this.f39242d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3947p3) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39239a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C4121w3 c4121w3 = C4121w3.f39816a;
                if (C4121w3.e()) {
                    int maxRetries = C4121w3.c().getMaxRetries();
                    String str = this.f39240b;
                    S2 s22 = new S2(str, this.f39241c, true, maxRetries + 1, 197);
                    InterfaceC3878m9 interfaceC3878m9 = this.f39242d;
                    if (interfaceC3878m9 != null) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        ((C3903n9) interfaceC3878m9).c("w3", "Received click (" + str + ") for pinging in WebView");
                    }
                    InterfaceC3878m9 interfaceC3878m92 = this.f39242d;
                    this.f39239a = 1;
                    if (c4121w3.a(s22, null, interfaceC3878m92, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f39242d;
            if (interfaceC3878m93 != null) {
                C4121w3 c4121w32 = C4121w3.f39816a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b("w3", "SDK encountered unexpected error in pinging click over WebView; " + e10.getMessage());
            }
        }
        return Unit.f93236a;
    }
}
