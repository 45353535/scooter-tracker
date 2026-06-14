package org.bidon.sdk.config.impl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.config.models.ConfigRequestBody;
import org.bidon.sdk.utils.json.JsonObjectBuilder;
import org.bidon.sdk.utils.json.JsonObjectBuilderKt;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lorg/bidon/sdk/config/models/ConfigResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.GetConfigRequestUseCaseImpl$request$2", f = "GetConfigRequestUseCaseImpl.kt", l = {40, 53}, m = "invokeSuspend")
final class GetConfigRequestUseCaseImpl$request$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ ConfigRequestBody $body;
    int label;
    final /* synthetic */ GetConfigRequestUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetConfigRequestUseCaseImpl$request$2(GetConfigRequestUseCaseImpl getConfigRequestUseCaseImpl, ConfigRequestBody configRequestBody, Continuation continuation) {
        super(2, continuation);
        this.this$0 = getConfigRequestUseCaseImpl;
        this.$body = configRequestBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(final ConfigRequestBody configRequestBody, JsonObjectBuilder jsonObjectBuilder) throws JSONException {
        jsonObjectBuilder.hasValue("adapters", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: org.bidon.sdk.config.impl.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GetConfigRequestUseCaseImpl$request$2.invokeSuspend$lambda$2$lambda$1(configRequestBody, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(ConfigRequestBody configRequestBody, JsonObjectBuilder jsonObjectBuilder) throws JSONException {
        for (Map.Entry<String, AdapterInfo> entry : configRequestBody.getAdapters().entrySet()) {
            jsonObjectBuilder.hasValue(entry.getKey(), SerializerKt.serialize(entry.getValue()));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetConfigRequestUseCaseImpl$request$2(this.this$0, this.$body, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r15 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.config.impl.GetConfigRequestUseCaseImpl$request$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GetConfigRequestUseCaseImpl$request$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
