package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$client$1", f = "AndroidHttpClientProvider.kt", l = {63}, m = "invokeSuspend")
final class AndroidHttpClientProvider$invoke$client$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ HttpClientSelection $selectedHttpClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpClientSelection.values().length];
            try {
                iArr[HttpClientSelection.OKHTTP3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpClientSelection.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHttpClientProvider$invoke$client$1(HttpClientSelection httpClientSelection, AndroidHttpClientProvider androidHttpClientProvider, Continuation continuation) {
        super(2, continuation);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new AndroidHttpClientProvider$invoke$client$1(this.$selectedHttpClient, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.$selectedHttpClient.ordinal()];
            if (i11 == 1) {
                return this.this$0.getOkHttp3Client();
            }
            if (i11 == 2) {
                return new LegacyHttpClient(this.this$0.dispatchers);
            }
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            Context context = androidHttpClientProvider.context;
            ISDKDispatchers iSDKDispatchers = this.this$0.dispatchers;
            HttpClientSelection httpClientSelection = this.$selectedHttpClient;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, httpClientSelection, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return (HttpClient) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AndroidHttpClientProvider$invoke$client$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
