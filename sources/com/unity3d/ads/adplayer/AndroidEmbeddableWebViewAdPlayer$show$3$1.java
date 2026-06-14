package com.unity3d.ads.adplayer;

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
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {97, 98}, m = "invokeSuspend")
final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L16
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L16:
            kotlin.d.b(r5)
            goto L52
        L1a:
            kotlin.d.b(r5)
            goto L38
        L1e:
            kotlin.d.b(r5)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.ShowOptions r1 = r4.$showOptions
            com.unity3d.ads.adplayer.AndroidShowOptions r1 = (com.unity3d.ads.adplayer.AndroidShowOptions) r1
            java.util.Map r1 = r1.getUnityAdsShowOptions()
            r4.label = r3
            java.lang.Object r5 = r5.requestShow(r1, r4)
            if (r5 != r0) goto L38
            goto L51
        L38:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.core.data.datasource.LifecycleDataSource r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getLifecycleDataSource$p(r5)
            kotlinx.coroutines.flow.StateFlow r5 = r5.getAppActive()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r3 = r4.this$0
            r1.<init>()
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            lf.g r5 = new lf.g
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
