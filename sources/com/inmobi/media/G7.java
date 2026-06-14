package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class G7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f36925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rl f36926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(N7 n72, Rl rl, Continuation continuation) {
        super(2, continuation);
        this.f36925b = n72;
        this.f36926c = rl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new G7(this.f36925b, this.f36926c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new G7(this.f36925b, this.f36926c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36924a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f36925b.f37414m;
            Rl rl = this.f36926c;
            this.f36924a = 1;
            if (mutableSharedFlow.emit(rl, this) == objG) {
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
