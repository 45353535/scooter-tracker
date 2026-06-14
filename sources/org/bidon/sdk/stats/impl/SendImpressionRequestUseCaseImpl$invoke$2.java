package org.bidon.sdk.stats.impl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.stats.models.ImpressionRequestBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$2", f = "SendImpressionRequestUseCaseImpl.kt", l = {41, 49}, m = "invokeSuspend")
final class SendImpressionRequestUseCaseImpl$invoke$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ ImpressionRequestBody $body;
    final /* synthetic */ String $bodyKey;
    final /* synthetic */ Map<String, Object> $extras;
    final /* synthetic */ String $urlPath;
    int label;
    final /* synthetic */ SendImpressionRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendImpressionRequestUseCaseImpl$invoke$2(SendImpressionRequestUseCaseImpl sendImpressionRequestUseCaseImpl, String str, ImpressionRequestBody impressionRequestBody, Map<String, ? extends Object> map, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sendImpressionRequestUseCaseImpl;
        this.$bodyKey = str;
        this.$body = impressionRequestBody;
        this.$extras = map;
        this.$urlPath = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new SendImpressionRequestUseCaseImpl$invoke$2(this.this$0, this.$bodyKey, this.$body, this.$extras, this.$urlPath, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (r0 == r9) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.stats.impl.SendImpressionRequestUseCaseImpl$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SendImpressionRequestUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
