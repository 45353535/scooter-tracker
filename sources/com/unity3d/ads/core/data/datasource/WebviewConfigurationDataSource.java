package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "", "webviewConfigurationStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "(Landroidx/datastore/core/DataStore;)V", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "data", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebviewConfigurationDataSource {

    @NotNull
    private final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "exception", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function3<FlowCollector, Throwable, Continuation, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (!(th2 instanceof CorruptionException)) {
                    throw th2;
                }
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(defaultInstance, this) == objG) {
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

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull Throwable th2, @Nullable Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    static final class C47692 extends k implements Function2<WebviewConfigurationStore.WebViewConfigurationStore, Continuation, Object> {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47692(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, Continuation continuation) {
            super(2, continuation);
            this.$data = webViewConfigurationStore;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C47692(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @Nullable Continuation continuation) {
            return ((C47692) create(webViewConfigurationStore, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(@NotNull DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore) {
        Intrinsics.checkNotNullParameter(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    @Nullable
    public final Object get(@NotNull Continuation continuation) {
        return i.x(i.h(this.webviewConfigurationStore.getData(), new AnonymousClass2(null)), continuation);
    }

    @Nullable
    public final Object set(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @NotNull Continuation continuation) {
        Object objUpdateData = this.webviewConfigurationStore.updateData(new C47692(webViewConfigurationStore, null), continuation);
        return objUpdateData == pf.b.g() ? objUpdateData : Unit.f93236a;
    }
}
