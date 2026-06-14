package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $js;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$applySafeAreaInsets$1$1(AndroidWebViewContainer androidWebViewContainer, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, continuation);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        AndroidWebViewContainer androidWebViewContainer = this.this$0;
        String str = this.$js;
        try {
            Result.Companion companion = Result.f93230c;
            androidWebViewContainer.getWebView().evaluateJavascript(str, null);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(d.a(th2));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AndroidWebViewContainer$applySafeAreaInsets$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
