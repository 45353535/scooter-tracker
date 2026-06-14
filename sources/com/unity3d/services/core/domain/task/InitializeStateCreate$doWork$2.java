package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;
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
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
final class InitializeStateCreate$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, Continuation continuation) {
        super(2, continuation);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateCreate$doWork$2(this.$params, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objB;
        Configuration config;
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        InitializeStateCreate.Params params = this.$params;
        try {
            Result.Companion companion = Result.f93230c;
            DeviceLog.debug("Unity Ads init: creating webapp");
            config = params.getConfig();
            config.setWebViewData(params.getWebViewData());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        try {
            ErrorState errorStateCreate = WebViewApp.create(config, false);
            if (errorStateCreate != null) {
                String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                DeviceLog.error(webAppFailureMessage);
                throw new InitializationException(errorStateCreate, new Exception(webAppFailureMessage), config);
            }
            objB = Result.b(config);
            if (Result.j(objB)) {
                objB = Result.b(objB);
            } else {
                Throwable thG = Result.g(objB);
                if (thG != null) {
                    objB = Result.b(d.a(thG));
                }
            }
            return Result.a(objB);
        } catch (IllegalThreadStateException e11) {
            DeviceLog.exception("Illegal Thread", e11);
            throw new InitializationException(ErrorState.CreateWebApp, e11, config);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateCreate$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
