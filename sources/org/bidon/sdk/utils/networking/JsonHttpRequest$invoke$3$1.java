package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.config.models.Token;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.json.JSONObject;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.utils.networking.JsonHttpRequest$invoke$3$1", f = "JsonHttpRequest.kt", l = {}, m = "invokeSuspend")
final class JsonHttpRequest$invoke$3$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $jsonString;
    int label;
    final /* synthetic */ JsonHttpRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonHttpRequest$invoke$3$1(String str, JsonHttpRequest jsonHttpRequest, Continuation continuation) {
        super(2, continuation);
        this.$jsonString = str;
        this.this$0 = jsonHttpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsonHttpRequest$invoke$3$1(this.$jsonString, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        String strOptString = new JSONObject(this.$jsonString).optString("token", "");
        if (strOptString == null || StringsKt.y0(strOptString)) {
            strOptString = null;
        }
        if (strOptString != null) {
            JsonHttpRequest jsonHttpRequest = this.this$0;
            LogExtKt.logInfo("JsonHttpRequest", "New token saved: " + strOptString);
            jsonHttpRequest.tokenDataSource.setToken(new Token(strOptString));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((JsonHttpRequest$invoke$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
