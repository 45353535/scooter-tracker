package com.unity3d.services.ads.offerwall;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {77, 83}, m = "invokeSuspend")
final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z10, OfferwallAdapterBridge offerwallAdapterBridge, String str, Continuation continuation) {
        super(2, continuation);
        this.$placementAvailable = z10;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r12.emit(r4, r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r12.emit(r3, r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L17:
            kotlin.d.b(r12)
            goto L74
        L1b:
            kotlin.d.b(r12)
            boolean r12 = r11.$placementAvailable
            java.lang.String r1 = ""
            if (r12 == 0) goto L46
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            kotlinx.coroutines.flow.MutableSharedFlow r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            java.lang.String r2 = r11.$placementName
            if (r2 != 0) goto L34
            r6 = r1
            goto L35
        L34:
            r6 = r2
        L35:
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r3
            java.lang.Object r12 = r12.emit(r4, r11)
            if (r12 != r0) goto L74
            goto L73
        L46:
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            java.util.HashMap r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$getPlacementsMap$p(r12)
            java.lang.String r3 = r11.$placementName
            if (r3 != 0) goto L51
            r3 = r1
        L51:
            r12.remove(r3)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            kotlinx.coroutines.flow.MutableSharedFlow r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r3 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r4 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED
            java.lang.String r5 = r11.$placementName
            if (r5 != 0) goto L63
            r5 = r1
        L63:
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.label = r2
            java.lang.Object r12 = r12.emit(r3, r11)
            if (r12 != r0) goto L74
        L73:
            return r0
        L74:
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
