package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.ts.TsExtractor;
import com.ironsource.C4240b4;
import com.taurusx.tax.g.n;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import eg.i;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001eH\u0014J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001eH\u0014J\b\u0010.\u001a\u00020\u001eH\u0014J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020(H\u0016J\u001a\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001b2\b\b\u0002\u00103\u001a\u00020(H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;", "Landroidx/activity/ComponentActivity;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "getDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers$delegate", "opportunityId", "", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "showOptions", "", "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "listenToAdPlayerEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWebView", "webView", "Landroid/webkit/WebView;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", C4240b4.i.f42653t0, C4240b4.i.f42655u0, "onWindowFocusChanged", "hasFocus", "openUrl", n.f66171o, HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "unity-ads_defaultRelease", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {

    /* JADX INFO: renamed from: adObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adObject;

    /* JADX INFO: renamed from: dispatchers$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dispatchers;

    @NotNull
    private String opportunityId = "";

    /* JADX INFO: renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDiagnosticEvent;

    @Nullable
    private Map<String, ? extends Object> showOptions;

    @NotNull
    private final ActivityResultLauncher<Intent> startForResult;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ WebView $webView;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
        static final class C08371 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08371(FullScreenWebViewDisplay fullScreenWebViewDisplay, Continuation continuation) {
                super(2, continuation);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C08371(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, this.this$0.showOptions);
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == objG) {
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
                return ((C08371) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", f = "FullScreenWebViewDisplay.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FullScreenWebViewDisplay fullScreenWebViewDisplay, Continuation continuation) {
                super(2, continuation);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.this$0.opportunityId, "WebView failed to attach to FullScreenWebViewDisplay.");
                    this.label = 1;
                    if (displayMessages.emit(displayError, this) == objG) {
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
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, Continuation continuation) {
            super(2, continuation);
            this.$webView = webView;
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$webView, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            try {
                ViewParent parent = this.$webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.$webView);
                }
                this.this$0.setContentView(this.$webView);
                i.d(kotlinx.coroutines.i.a(this.this$0.getDispatchers().getDefault()), null, null, new C08371(this.this$0, null), 3, null);
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    return Unit.f93236a;
                }
                i.d(kotlinx.coroutines.i.a(this.this$0.getDispatchers().getDefault()), null, null, new AnonymousClass2(this.this$0, null), 3, null);
                this.this$0.setResult(0);
                this.this$0.finish();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1", f = "FullScreenWebViewDisplay.kt", l = {57}, m = "invokeSuspend")
    static final class C47451 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C47451(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new C47451(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "Opportunity ID not found");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == objG) {
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
            return ((C47451) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$2", f = "FullScreenWebViewDisplay.kt", l = {67}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(FullScreenWebViewDisplay.this.opportunityId, "AdPlayer is not active. Could be because show was called while the app was in background.");
                this.label = 1;
                if (displayMessages.emit(displayError, this) == objG) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", f = "FullScreenWebViewDisplay.kt", l = {82}, m = "invokeSuspend")
    static final class AnonymousClass6 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                FullScreenWebViewDisplay fullScreenWebViewDisplay = FullScreenWebViewDisplay.this;
                this.label = 1;
                if (fullScreenWebViewDisplay.listenToAdPlayerEvents(this) == objG) {
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
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onDestroy$1", f = "FullScreenWebViewDisplay.kt", l = {178}, m = "invokeSuspend")
    static final class C47461 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C47461(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new C47461(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == objG) {
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
            return ((C47461) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$1", f = "FullScreenWebViewDisplay.kt", l = {165}, m = "invokeSuspend")
    static final class C47471 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C47471(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new C47471(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, false);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == objG) {
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
            return ((C47471) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onPause$2", f = "FullScreenWebViewDisplay.kt", l = {170}, m = "invokeSuspend")
    static final class C47482 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C47482(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new C47482(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.DisplayDestroyed displayDestroyed = new DisplayMessage.DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                this.label = 1;
                if (displayMessages.emit(displayDestroyed, this) == objG) {
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
            return ((C47482) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onResume$1", f = "FullScreenWebViewDisplay.kt", l = {157}, m = "invokeSuspend")
    static final class C47491 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C47491(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new C47491(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.VisibilityChanged visibilityChanged = new DisplayMessage.VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, true);
                this.label = 1;
                if (displayMessages.emit(visibilityChanged, this) == objG) {
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
            return ((C47491) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onWindowFocusChanged$1", f = "FullScreenWebViewDisplay.kt", l = {188}, m = "invokeSuspend")
    static final class C47501 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $hasFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47501(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.$hasFocus = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return FullScreenWebViewDisplay.this.new C47501(this.$hasFocus, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.FocusChanged focusChanged = new DisplayMessage.FocusChanged(FullScreenWebViewDisplay.this.opportunityId, this.$hasFocus);
                this.label = 1;
                if (displayMessages.emit(focusChanged, this) == objG) {
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
            return ((C47501) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public FullScreenWebViewDisplay() {
        final String str = "";
        l lVar = l.f94211d;
        this.sendDiagnosticEvent = lf.i.b(lVar, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(SendDiagnosticEvent.class));
            }
        });
        this.adObject = lf.i.a(new Function0<AdObject>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2
            {
                super(0);
            }

            private static final AdRepository invoke$lambda$0(Lazy lazy) {
                return (AdRepository) lazy.getValue();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AdObject invoke() {
                Object objB;
                final FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
                final String str2 = "";
                Lazy lazyB = lf.i.b(l.f94211d, new Function0<AdRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final AdRepository invoke() {
                        IServiceComponent iServiceComponent = fullScreenWebViewDisplay;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str2, v0.b(AdRepository.class));
                    }
                });
                FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
                try {
                    Result.Companion companion = Result.f93230c;
                    AdRepository adRepositoryInvoke$lambda$0 = invoke$lambda$0(lazyB);
                    UUID uuidFromString = UUID.fromString(fullScreenWebViewDisplay2.opportunityId);
                    Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
                    objB = Result.b(adRepositoryInvoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(uuidFromString)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(d.a(th2));
                }
                if (Result.i(objB)) {
                    objB = null;
                }
                return (AdObject) objB;
            }
        });
        this.dispatchers = lf.i.b(lVar, new Function0<ISDKDispatchers>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ISDKDispatchers invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, v0.b(ISDKDispatchers.class));
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.unity3d.ads.adplayer.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FullScreenWebViewDisplay.startForResult$lambda$6((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…n to this activity.\n    }");
        this.startForResult = activityResultLauncherRegisterForActivityResult;
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        final SharedFlow sharedFlowM = hg.i.M(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, eVar, null));
        hg.i.F(hg.i.K(new Flow() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.d.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = sharedFlowM.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        i.d(kotlinx.coroutines.i.a(getDispatchers().getMain()), null, null, new AnonymousClass1(webView, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(Intent intent, boolean useActivityForResult) {
        if (intent.resolveActivity(getPackageManager()) != null && useActivityForResult) {
            this.startForResult.launch(intent);
        } else {
            intent.setFlags(268435456);
            startActivity(intent);
        }
    }

    static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, Intent intent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fullScreenWebViewDisplay.openUrl(intent, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$6(ActivityResult activityResult) {
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        CoroutineScope scope;
        Object objB;
        Map<String, ? extends Object> map;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        if (Intrinsics.areEqual(stringExtra, "not_provided")) {
            setResult(0);
            i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new C47451(null), 3, null);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        AdPlayer adPlayer = adObject != null ? adObject.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !kotlinx.coroutines.i.i(scope)) {
            setResult(0);
            i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new AnonymousClass2(null), 3, null);
            finish();
            return;
        }
        boolean zHasExtra = getIntent().hasExtra("orientation");
        Boolean boolValueOf = Boolean.valueOf(zHasExtra);
        if (!zHasExtra) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            if (Result.i(objB)) {
                objB = null;
            }
            map = (Map) objB;
        } else {
            map = null;
        }
        this.showOptions = map;
        i.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass6(null), 3, null);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate.7
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OnBackPressedCallback addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return Unit.f93236a;
            }
        }, 2, null);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new C47461(null), 3, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        return keyCode == 4;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new C47471(null), 3, null);
        if (isFinishing()) {
            i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new C47482(null), 3, null);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new C47491(null), 3, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        i.d(kotlinx.coroutines.i.a(getDispatchers().getDefault()), null, null, new C47501(hasFocus, null), 3, null);
    }
}
