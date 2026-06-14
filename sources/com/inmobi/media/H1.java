package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class H1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f36974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(I1 i12, Continuation continuation) {
        super(2, continuation);
        this.f36974a = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new H1(this.f36974a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H1(this.f36974a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        I1 i12;
        pf.b.g();
        kotlin.d.b(obj);
        boolean z10 = 0;
        z10 = 0;
        try {
            try {
                I1 i13 = this.f36974a;
                i13.f37042c = i13.f37040a.invoke();
                i12 = this.f36974a;
            } catch (Exception e10) {
                e10.getMessage();
                i12 = this.f36974a;
            }
            i12.f37043d.set(false);
            z10 = Unit.f93236a;
            return z10;
        } catch (Throwable th2) {
            this.f36974a.f37043d.set(z10);
            throw th2;
        }
    }
}
