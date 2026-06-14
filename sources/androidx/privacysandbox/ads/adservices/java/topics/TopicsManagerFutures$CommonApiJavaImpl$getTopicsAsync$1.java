package androidx.privacysandbox.ads.adservices.java.topics;

import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {55}, m = "invokeSuspend")
final class TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ GetTopicsRequest $request;
    int label;
    final /* synthetic */ TopicsManagerFutures.CommonApiJavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(TopicsManagerFutures.CommonApiJavaImpl commonApiJavaImpl, GetTopicsRequest getTopicsRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = commonApiJavaImpl;
        this.$request = getTopicsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        TopicsManager topicsManager = this.this$0.mTopicsManager;
        GetTopicsRequest getTopicsRequest = this.$request;
        this.label = 1;
        Object topics = topicsManager.getTopics(getTopicsRequest, this);
        return topics == objG ? objG : topics;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
