package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3922o3 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3903n9 f39155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3565a0 f39156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3922o3(String str, C3903n9 c3903n9, C3565a0 c3565a0, Continuation continuation) {
        super(1, continuation);
        this.f39154b = str;
        this.f39155c = c3903n9;
        this.f39156d = c3565a0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3922o3(this.f39154b, this.f39155c, this.f39156d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3922o3) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39153a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C4121w3 c4121w3 = C4121w3.f39816a;
                if (C4121w3.e()) {
                    int maxRetries = C4121w3.c().getMaxRetries();
                    String str = this.f39154b;
                    S2 s22 = new S2(str, true, false, maxRetries + 1, 197);
                    C3903n9 c3903n9 = this.f39155c;
                    if (c3903n9 != null) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        c3903n9.a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C3565a0 c3565a0 = this.f39156d;
                    C3903n9 c3903n92 = this.f39155c;
                    this.f39153a = 1;
                    if (c4121w3.a(s22, c3565a0, c3903n92, this) == objG) {
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
            C3903n9 c3903n93 = this.f39155c;
            if (c3903n93 != null) {
                C4121w3 c4121w32 = C4121w3.f39816a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                c3903n93.b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
        }
        return Unit.f93236a;
    }
}
