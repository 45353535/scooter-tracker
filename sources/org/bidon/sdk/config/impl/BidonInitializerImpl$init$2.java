package org.bidon.sdk.config.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.BidonInitializerImpl$init$2", f = "BidonInitializerImpl.kt", l = {}, m = "invokeSuspend")
final class BidonInitializerImpl$init$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $appKey;
    int label;
    final /* synthetic */ BidonInitializerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BidonInitializerImpl$init$2(BidonInitializerImpl bidonInitializerImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bidonInitializerImpl;
        this.$appKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidonInitializerImpl$init$2(this.this$0, this.$appKey, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        this.this$0.getKeyValueStorage().setAppKey(this.$appKey);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BidonInitializerImpl$init$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
