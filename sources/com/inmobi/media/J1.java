package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class J1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f37089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(M1 m12, Continuation continuation) {
        super(2, continuation);
        this.f37089b = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new J1(this.f37089b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new J1(this.f37089b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37088a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            M1 m12 = this.f37089b;
            ViewGroup viewGroup = m12.f37329b;
            CoroutineScope coroutineScope = m12.f37328a;
            this.f37088a = 1;
            if (M1.a(m12, viewGroup, coroutineScope, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
