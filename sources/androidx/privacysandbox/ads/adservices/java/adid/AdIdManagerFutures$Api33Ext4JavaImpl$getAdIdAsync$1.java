package androidx.privacysandbox.ads.adservices.java.adid;

import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", l = {54}, m = "invokeSuspend")
final class AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ AdIdManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(AdIdManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this.this$0, continuation);
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
        AdIdManager adIdManager = this.this$0.mAdIdManager;
        this.label = 1;
        Object adId = adIdManager.getAdId(this);
        return adId == objG ? objG : adId;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
