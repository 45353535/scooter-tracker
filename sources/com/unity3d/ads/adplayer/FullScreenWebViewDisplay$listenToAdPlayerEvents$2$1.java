package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleOwnerKt;
import com.unity3d.ads.adplayer.DisplayMessage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends k implements Function2<FlowCollector, Continuation, Object> {
    final /* synthetic */ CancellableContinuation $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {94}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ CancellableContinuation $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation cancellableContinuation, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = cancellableContinuation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(this.this$0.opportunityId);
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (displayMessages.emit(webViewInstanceRequest, this) == objG) {
                    return objG;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                d.b(obj);
            }
            i.h(coroutineScope);
            CancellableContinuation cancellableContinuation = this.$continuation;
            Result.Companion companion = Result.f93230c;
            Unit unit = Unit.f93236a;
            cancellableContinuation.resumeWith(Result.b(unit));
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        eg.i.d(LifecycleOwnerKt.getLifecycleScope(this.this$0), this.this$0.getDispatchers().getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2, null);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
    }
}
