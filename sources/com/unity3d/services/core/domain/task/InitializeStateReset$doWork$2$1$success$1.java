package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import eg.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", l = {42}, m = "invokeSuspend")
final class InitializeStateReset$doWork$2$1$success$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebViewApp webViewApp, Continuation continuation) {
            super(2, continuation);
            this.$currentApp = webViewApp;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$currentApp, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            WebView webView = this.$currentApp.getWebView();
            if (webView != null) {
                webView.destroy();
            }
            this.$currentApp.setWebView(null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            CoroutineDispatcher main = this.this$0.dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentApp, null);
            this.label = 1;
            if (g.g(main, anonymousClass1, this) == objG) {
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
        return ((InitializeStateReset$doWork$2$1$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
