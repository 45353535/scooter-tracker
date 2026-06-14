package org.bidon.sdk.config.impl;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.config.models.ConfigResponse;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {140}, m = "invokeSuspend")
final class InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Adapter $adapter;
    final /* synthetic */ ConfigResponse $configResponse;
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InitAndRegisterAdaptersUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1(InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl, Adapter adapter, Context context, ConfigResponse configResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initAndRegisterAdaptersUseCaseImpl;
        this.$adapter = adapter;
        this.$context = context;
        this.$configResponse = configResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1 initAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1 = new InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1(this.this$0, this.$adapter, this.$context, this.$configResponse, continuation);
        initAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1.L$0 = obj;
        return initAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objG = pf.b.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl = this.this$0;
                Adapter adapter = this.$adapter;
                Context context = this.$context;
                ConfigResponse configResponse = this.$configResponse;
                Result.Companion companion = Result.f93230c;
                this.label = 1;
                if (initAndRegisterAdaptersUseCaseImpl.initializeSingleAdapter(adapter, context, configResponse, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl2 = this.this$0;
        Adapter adapter2 = this.$adapter;
        if (Result.j(objB)) {
            initAndRegisterAdaptersUseCaseImpl2.adaptersSource.add(adapter2);
        }
        Adapter adapter3 = this.$adapter;
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logError("InitAndRegisterUserCase", "Adapter not initialized: " + adapter3.getDemandId().getDemandId() + " v" + adapter3.getAdapterInfo().getAdapterVersion() + ": " + thG.getMessage(), thG);
        }
        return Result.a(objB);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
