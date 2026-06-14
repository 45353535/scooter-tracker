package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4038sk extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f39557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4038sk(long j10, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f39556b = j10;
        this.f39557c = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4038sk(this.f39556b, this.f39557c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4038sk(this.f39556b, this.f39557c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39555a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                long j10 = this.f39556b;
                this.f39555a = 1;
                if (eg.k0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.f39557c.invoke();
        } catch (CancellationException unused) {
        }
        return Unit.f93236a;
    }
}
