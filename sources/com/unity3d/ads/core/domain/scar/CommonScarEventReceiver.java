package com.unity3d.ads.core.domain.scar;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import hg.c0;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J9\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "_gmaEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "_versionFlow", "", "gmaEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getGmaEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "versionFlow", "getVersionFlow", "canSend", "", "sendEvent", "eventCategory", "", "eventId", "params", "", "", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonScarEventReceiver implements IEventSender {

    @NotNull
    private final MutableSharedFlow _gmaEventFlow;

    @NotNull
    private final MutableSharedFlow _versionFlow;

    @NotNull
    private final SharedFlow gmaEventFlow;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SharedFlow versionFlow;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, 73}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Enum<?> r12, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, Continuation continuation) {
            super(2, continuation);
            this.$eventId = r12;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r3.emit(r2, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        
            if (r3.emit(r7, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        
            if (r3.emit(r6, r21) == r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        
            if (r2.emit(r11, r21) == r1) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public CommonScarEventReceiver(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this._versionFlow = mutableSharedFlowB;
        this.versionFlow = i.b(mutableSharedFlowB);
        MutableSharedFlow mutableSharedFlowB2 = c0.b(0, 0, null, 7, null);
        this._gmaEventFlow = mutableSharedFlowB2;
        this.gmaEventFlow = i.b(mutableSharedFlowB2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    @NotNull
    public final SharedFlow getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    @NotNull
    public final SharedFlow getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NotNull Enum<?> eventCategory, @NotNull Enum<?> eventId, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!CollectionsKt.contains(SetsKt.setOf((Object[]) new WebViewEventCategory[]{WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER}), eventCategory)) {
            return false;
        }
        eg.i.d(this.scope, null, null, new AnonymousClass1(eventId, params, this, null), 3, null);
        return true;
    }
}
