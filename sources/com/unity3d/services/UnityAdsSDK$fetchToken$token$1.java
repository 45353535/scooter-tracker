package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {177}, m = "invokeSuspend")
final class UnityAdsSDK$fetchToken$token$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Lazy $getHeaderBiddingToken$delegate;
    final /* synthetic */ Lazy $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$fetchToken$token$1(Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.$getHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
        GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$10 = UnityAdsSDK.fetchToken$lambda$10(this.$getHeaderBiddingToken$delegate);
        int iInvoke = UnityAdsSDK.fetchToken$lambda$9(this.$tokenNumberProvider$delegate).invoke();
        this.label = 1;
        Object objInvoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$10, iInvoke, null, this, 2, null);
        return objInvoke$default == objG ? objG : objInvoke$default;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((UnityAdsSDK$fetchToken$token$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
