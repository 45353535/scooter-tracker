package com.unity3d.services.core.domain.task;

import androidx.datastore.core.DataStore;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {26}, m = "invokeSuspend")
final class InitializeStateComplete$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, InitializeStateComplete initializeStateComplete, Continuation continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new InitializeStateComplete$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objB;
        Object objG = b.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                d.b(obj);
                InitializeStateComplete.Params params = this.$params;
                InitializeStateComplete initializeStateComplete = this.this$0;
                Result.Companion companion = Result.f93230c;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                Intrinsics.checkNotNullExpressionValue(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        kotlin.coroutines.jvm.internal.b.a(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                DataStore dataStore = initializeStateComplete.dataStore;
                InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                if (dataStore.updateData(initializeStateComplete$doWork$2$1$1, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            objB = Result.b(Unit.f93236a);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.j(objB)) {
            objB = Result.b(objB);
        } else {
            Throwable thG = Result.g(objB);
            if (thG != null) {
                objB = Result.b(d.a(thG));
            }
        }
        return Result.a(objB);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateComplete$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
