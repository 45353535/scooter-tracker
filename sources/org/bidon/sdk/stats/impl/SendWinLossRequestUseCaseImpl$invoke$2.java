package org.bidon.sdk.stats.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.stats.usecases.WinLossRequestData;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$2", f = "SendWinLossRequestUseCaseImpl.kt", l = {43, 60}, m = "invokeSuspend")
final class SendWinLossRequestUseCaseImpl$invoke$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ WinLossRequestData $data;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SendWinLossRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendWinLossRequestUseCaseImpl$invoke$2(WinLossRequestData winLossRequestData, SendWinLossRequestUseCaseImpl sendWinLossRequestUseCaseImpl, Continuation continuation) {
        super(2, continuation);
        this.$data = winLossRequestData;
        this.this$0 = sendWinLossRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new SendWinLossRequestUseCaseImpl$invoke$2(this.$data, this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if (r2 == r9) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.stats.impl.SendWinLossRequestUseCaseImpl$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SendWinLossRequestUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
