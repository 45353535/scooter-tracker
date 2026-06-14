package com.unity3d.services.ads.offerwall;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$5", f = "OfferwallAdapterBridge.kt", l = {140}, m = "invokeSuspend")
final class OfferwallAdapterBridge$tapjoyPlacementListener$1$5 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferwallAdapterBridge$tapjoyPlacementListener$1$5(OfferwallAdapterBridge offerwallAdapterBridge, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this.this$0, this.$placementName, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0._offerwallEventFlow;
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_DISMISS;
            String str = this.$placementName;
            if (str == null) {
                str = "";
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            if (mutableSharedFlow.emit(offerwallEventData, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$5) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
