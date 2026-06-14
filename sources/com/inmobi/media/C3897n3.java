package com.inmobi.media;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3897n3 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3903n9 f39080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3897n3(String str, C3903n9 c3903n9, Continuation continuation) {
        super(1, continuation);
        this.f39079b = str;
        this.f39080c = c3903n9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3897n3(this.f39079b, this.f39080c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3897n3(this.f39079b, this.f39080c, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39078a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C4121w3 c4121w3 = C4121w3.f39816a;
                if (C4121w3.e()) {
                    int maxRetries = C4121w3.c().getMaxRetries();
                    String str = this.f39079b;
                    S2 s22 = new S2(str, true, false, maxRetries + 1, 193);
                    C3903n9 c3903n9 = this.f39080c;
                    if (c3903n9 != null) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        c3903n9.a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C3903n9 c3903n92 = this.f39080c;
                    this.f39078a = 1;
                    if (c4121w3.a(s22, null, c3903n92, this) == objG) {
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
            C3903n9 c3903n93 = this.f39080c;
            if (c3903n93 != null) {
                C4121w3 c4121w32 = C4121w3.f39816a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                c3903n93.b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        return Unit.f93236a;
    }
}
