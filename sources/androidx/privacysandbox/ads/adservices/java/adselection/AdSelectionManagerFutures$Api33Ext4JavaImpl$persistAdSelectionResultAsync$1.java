package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1", f = "AdSelectionManagerFutures.kt", l = {373}, m = "invokeSuspend")
final class AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ PersistAdSelectionResultRequest $persistAdSelectionResultRequest;
    int label;
    final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$persistAdSelectionResultRequest = persistAdSelectionResultRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1(this.this$0, this.$persistAdSelectionResultRequest, continuation);
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
        AdSelectionManager adSelectionManager = this.this$0.mAdSelectionManager;
        Intrinsics.checkNotNull(adSelectionManager);
        PersistAdSelectionResultRequest persistAdSelectionResultRequest = this.$persistAdSelectionResultRequest;
        this.label = 1;
        Object objPersistAdSelectionResult = adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequest, this);
        return objPersistAdSelectionResult == objG ? objG : objPersistAdSelectionResult;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
