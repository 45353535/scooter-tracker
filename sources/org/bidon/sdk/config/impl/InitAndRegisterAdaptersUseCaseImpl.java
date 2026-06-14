package org.bidon.sdk.config.impl;

import android.content.Context;
import com.ironsource.N6;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.k0;
import eg.m1;
import eg.x1;
import hg.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterParameters;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl;
import org.bidon.sdk.config.models.ConfigResponse;
import org.bidon.sdk.config.usecases.InitAndRegisterAdaptersUseCase;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u0004\u0012\u00020\r0\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J6\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0096B¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lorg/bidon/sdk/config/impl/InitAndRegisterAdaptersUseCaseImpl;", "Lorg/bidon/sdk/config/usecases/InitAndRegisterAdaptersUseCase;", "Lorg/bidon/sdk/adapter/AdaptersSource;", "adaptersSource", "<init>", "(Lorg/bidon/sdk/adapter/AdaptersSource;)V", "", "Lorg/bidon/sdk/adapter/Adapter;", "adapters", "Lorg/bidon/sdk/config/models/ConfigResponse;", "configResponse", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "initializeAdapters", "(Ljava/util/List;Lorg/bidon/sdk/config/models/ConfigResponse;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", "", "Lorg/json/JSONObject;", "adaptersInfo", "", "Lkotlin/Function1;", "onAdapterInitializationStarted", "initializeAdapterGroup", "(Landroid/content/Context;Ljava/util/List;Ljava/util/Set;Lorg/bidon/sdk/config/models/ConfigResponse;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", N6.G1, "initializeSingleAdapter", "(Lorg/bidon/sdk/adapter/Adapter;Landroid/content/Context;Lorg/bidon/sdk/config/models/ConfigResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/sdk/adapter/AdapterParameters;", "Lkotlin/Result;", "parseAdapterParameters-gIAlu-s", "(Lorg/bidon/sdk/config/models/ConfigResponse;Lorg/bidon/sdk/adapter/Initializable;)Ljava/lang/Object;", "parseAdapterParameters", "", "isTestMode", "invoke", "(Landroid/content/Context;Ljava/util/List;Lorg/bidon/sdk/config/models/ConfigResponse;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/adapter/AdaptersSource;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "canContinueFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitAndRegisterAdaptersUseCaseImpl implements InitAndRegisterAdaptersUseCase {

    @NotNull
    private final AdaptersSource adaptersSource;

    @NotNull
    private final MutableStateFlow canContinueFlow;

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$2", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {152}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ List<Deferred> $deferredList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<? extends Deferred> list, Continuation continuation) {
            super(2, continuation);
            this.$deferredList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$deferredList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            List<Deferred> list = this.$deferredList;
            this.label = 1;
            Object objA = eg.d.a(list, this);
            return objA == objG ? objG : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeAdapters$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {103}, m = "initializeAdapters")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitAndRegisterAdaptersUseCaseImpl.this.initializeAdapters(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeSingleAdapter$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {167}, m = "initializeSingleAdapter")
    static final class C58181 extends kotlin.coroutines.jvm.internal.d {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C58181(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitAndRegisterAdaptersUseCaseImpl.this.initializeSingleAdapter(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {72}, m = "invoke")
    static final class C58191 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C58191(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitAndRegisterAdaptersUseCaseImpl.this.invoke(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ List<Adapter> $adapters;
        final /* synthetic */ ConfigResponse $configResponse;
        final /* synthetic */ Context $context;
        int label;

        /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3$1", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {53}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ ConfigResponse $configResponse;
            int label;
            final /* synthetic */ InitAndRegisterAdaptersUseCaseImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConfigResponse configResponse, InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl, Continuation continuation) {
                super(2, continuation);
                this.$configResponse = configResponse;
                this.this$0 = initAndRegisterAdaptersUseCaseImpl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence invokeSuspend$lambda$1$lambda$0(Adapter adapter) {
                return adapter.getDemandId().getDemandId();
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.$configResponse, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    long initializationTimeout = this.$configResponse.getInitializationTimeout();
                    this.label = 1;
                    if (k0.a(initializationTimeout, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                MutableStateFlow mutableStateFlow = this.this$0.canContinueFlow;
                InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl = this.this$0;
                do {
                    value = mutableStateFlow.getValue();
                    if (!((Boolean) value).booleanValue()) {
                        LogExtKt.logError("InitAndRegisterUserCase", "Timeout reached. Available adapters: " + CollectionsKt.joinToString$default(initAndRegisterAdaptersUseCaseImpl.adaptersSource.getAdapters(), null, null, null, 0, null, new Function1() { // from class: org.bidon.sdk.config.impl.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return InitAndRegisterAdaptersUseCaseImpl.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$1$lambda$0((Adapter) obj2);
                            }
                        }, 31, null), null);
                    }
                } while (!mutableStateFlow.b(value, kotlin.coroutines.jvm.internal.b.a(true)));
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3$2", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {70}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ List<Adapter> $adapters;
            final /* synthetic */ ConfigResponse $configResponse;
            final /* synthetic */ Context $context;
            int label;
            final /* synthetic */ InitAndRegisterAdaptersUseCaseImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl, List<? extends Adapter> list, ConfigResponse configResponse, Context context, Continuation continuation) {
                super(2, continuation);
                this.this$0 = initAndRegisterAdaptersUseCaseImpl;
                this.$adapters = list;
                this.$configResponse = configResponse;
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.this$0, this.$adapters, this.$configResponse, this.$context, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    InitAndRegisterAdaptersUseCaseImpl initAndRegisterAdaptersUseCaseImpl = this.this$0;
                    List<Adapter> list = this.$adapters;
                    ConfigResponse configResponse = this.$configResponse;
                    Context context = this.$context;
                    this.label = 1;
                    if (initAndRegisterAdaptersUseCaseImpl.initializeAdapters(list, configResponse, context, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(ConfigResponse configResponse, List<? extends Adapter> list, Context context, Continuation continuation) {
            super(2, continuation);
            this.$configResponse = configResponse;
            this.$adapters = list;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return InitAndRegisterAdaptersUseCaseImpl.this.new AnonymousClass3(this.$configResponse, this.$adapters, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            eg.i.d(InitAndRegisterAdaptersUseCaseImpl.this.getScope(), null, null, new AnonymousClass1(this.$configResponse, InitAndRegisterAdaptersUseCaseImpl.this, null), 3, null);
            eg.i.d(InitAndRegisterAdaptersUseCaseImpl.this.getScope(), null, null, new AnonymousClass2(InitAndRegisterAdaptersUseCaseImpl.this, this.$adapters, this.$configResponse, this.$context, null), 3, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((AnonymousClass3) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "canContinue"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$4", f = "InitAndRegisterAdaptersUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass4 extends k implements Function2<Boolean, Continuation, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.Z$0);
        }

        public final Object invoke(boolean z10, Continuation continuation) {
            return ((AnonymousClass4) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public InitAndRegisterAdaptersUseCaseImpl(@NotNull AdaptersSource adaptersSource) {
        Intrinsics.checkNotNullParameter(adaptersSource, "adaptersSource");
        this.adaptersSource = adaptersSource;
        this.canContinueFlow = l0.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getScope() {
        return kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getBidon().plus(m1.b(null, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializeAdapterGroup(Context context, List<? extends Pair<String, ? extends JSONObject>> list, Set<? extends Adapter> set, ConfigResponse configResponse, Function1<? super Set<? extends Adapter>, Unit> function1, Continuation continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) ((Pair) it.next()).component1();
            Iterator<T> it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((Adapter) next).getDemandId().getDemandId(), str)) {
                    obj = next;
                    break;
                }
            }
            Adapter adapter = (Adapter) obj;
            if (adapter != null) {
                arrayList.add(adapter);
            }
        }
        function1.invoke(CollectionsKt.toSet(arrayList));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(eg.i.b(getScope(), null, null, new InitAndRegisterAdaptersUseCaseImpl$initializeAdapterGroup$deferredList$1$1(this, (Adapter) it3.next(), context, configResponse, null), 3, null));
        }
        Object objE = x1.e(configResponse.getInitializationTimeout(), new AnonymousClass2(arrayList2, null), continuation);
        return objE == pf.b.g() ? objE : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015a A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x0049, B:42:0x01dc, B:43:0x01de, B:45:0x01eb, B:48:0x020e, B:31:0x0154, B:33:0x015a, B:37:0x0178, B:54:0x0224, B:19:0x0062, B:20:0x00a8, B:22:0x00ae, B:24:0x00cc, B:25:0x00d4, B:26:0x00da, B:27:0x00e6, B:29:0x00ec, B:30:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x0049, B:42:0x01dc, B:43:0x01de, B:45:0x01eb, B:48:0x020e, B:31:0x0154, B:33:0x015a, B:37:0x0178, B:54:0x0224, B:19:0x0062, B:20:0x00a8, B:22:0x00ae, B:24:0x00cc, B:25:0x00d4, B:26:0x00da, B:27:0x00e6, B:29:0x00ec, B:30:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x0049, B:42:0x01dc, B:43:0x01de, B:45:0x01eb, B:48:0x020e, B:31:0x0154, B:33:0x015a, B:37:0x0178, B:54:0x0224, B:19:0x0062, B:20:0x00a8, B:22:0x00ae, B:24:0x00cc, B:25:0x00d4, B:26:0x00da, B:27:0x00e6, B:29:0x00ec, B:30:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01d9 -> B:41:0x01da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializeAdapters(java.util.List<? extends org.bidon.sdk.adapter.Adapter> r26, org.bidon.sdk.config.models.ConfigResponse r27, android.content.Context r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.initializeAdapters(java.util.List, org.bidon.sdk.config.models.ConfigResponse, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence initializeAdapters$lambda$10$lambda$2(Adapter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDemandId().getDemandId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence initializeAdapters$lambda$10$lambda$5$lambda$4(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CharSequence) it.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence initializeAdapters$lambda$10$lambda$9$lambda$6(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CharSequence) it.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeAdapters$lambda$10$lambda$9$lambda$7(Set set, Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        set.removeAll(it);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializeSingleAdapter(org.bidon.sdk.adapter.Adapter r7, android.content.Context r8, org.bidon.sdk.config.models.ConfigResponse r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.C58181
            if (r0 == 0) goto L13
            r0 = r10
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeSingleAdapter$1 r0 = (org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.C58181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeSingleAdapter$1 r0 = new org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$initializeSingleAdapter$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.J$0
            java.lang.Object r9 = r0.L$0
            org.bidon.sdk.adapter.Adapter r9 = (org.bidon.sdk.adapter.Adapter) r9
            kotlin.d.b(r10)
            goto L64
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.d.b(r10)
            boolean r10 = r7 instanceof org.bidon.sdk.adapter.Initializable
            if (r10 == 0) goto L42
            r10 = r7
            org.bidon.sdk.adapter.Initializable r10 = (org.bidon.sdk.adapter.Initializable) r10
            goto L43
        L42:
            r10 = 0
        L43:
            if (r10 == 0) goto La4
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r9 = r6.m8675parseAdapterParametersgIAlus(r9, r10)
            kotlin.d.b(r9)
            org.bidon.sdk.adapter.AdapterParameters r9 = (org.bidon.sdk.adapter.AdapterParameters) r9
            r10 = r7
            org.bidon.sdk.adapter.Initializable r10 = (org.bidon.sdk.adapter.Initializable) r10
            r0.L$0 = r7
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r8 = r10.init(r8, r9, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r9 = r7
            r7 = r4
        L64:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r7
            org.bidon.sdk.adapter.DemandId r7 = r9.getDemandId()
            java.lang.String r7 = r7.getDemandId()
            org.bidon.sdk.adapter.AdapterInfo r8 = r9.getAdapterInfo()
            java.lang.String r8 = r8.getAdapterVersion()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Adapter "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = " v"
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = " initialized in "
            r9.append(r7)
            r9.append(r0)
            java.lang.String r7 = " ms."
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r8 = "InitAndRegisterUserCase"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r8, r7)
        La4:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.initializeSingleAdapter(org.bidon.sdk.adapter.Adapter, android.content.Context, org.bidon.sdk.config.models.ConfigResponse, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invoke$lambda$1(Adapter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: parseAdapterParameters-gIAlu-s, reason: not valid java name */
    private final Object m8675parseAdapterParametersgIAlus(ConfigResponse configResponse, Initializable<AdapterParameters> adapter) {
        try {
            Result.Companion companion = Result.f93230c;
            Map<String, JSONObject> adapters = configResponse.getAdapters();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.bidon.sdk.adapter.Adapter");
            JSONObject jSONObject = adapters.get(((Adapter) adapter).getDemandId().getDemandId());
            if (jSONObject != null) {
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return Result.b(adapter.parseConfigParam(string));
            }
            throw new IllegalArgumentException(("No config found for Adapter(" + adapter + "). Adapter not initialized.").toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // org.bidon.sdk.config.usecases.InitAndRegisterAdaptersUseCase
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull android.content.Context r12, @org.jetbrains.annotations.NotNull java.util.List<? extends org.bidon.sdk.adapter.Adapter> r13, @org.jetbrains.annotations.NotNull org.bidon.sdk.config.models.ConfigResponse r14, boolean r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r2 = r0 instanceof org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.C58191
            if (r2 == 0) goto L16
            r2 = r0
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$1 r2 = (org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.C58191) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$1 r2 = new org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = pf.b.g()
            int r2 = r6.label
            r8 = 1
            if (r2 == 0) goto L39
            if (r2 != r8) goto L31
            java.lang.Object r2 = r6.L$0
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl r2 = (org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl) r2
            kotlin.d.b(r0)
            goto L7e
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            kotlin.d.b(r0)
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r2 = r0.hasNext()
            r9 = 0
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r0.next()
            org.bidon.sdk.adapter.Adapter r2 = (org.bidon.sdk.adapter.Adapter) r2
            boolean r3 = r2 instanceof org.bidon.sdk.adapter.SupportsTestMode
            if (r3 == 0) goto L57
            r9 = r2
            org.bidon.sdk.adapter.SupportsTestMode r9 = (org.bidon.sdk.adapter.SupportsTestMode) r9
        L57:
            if (r9 == 0) goto L43
            r9.setTestMode(r15)
            goto L43
        L5d:
            kotlinx.coroutines.flow.MutableStateFlow r10 = r11.canContinueFlow
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3 r0 = new org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$3
            r5 = 0
            r1 = r11
            r4 = r12
            r3 = r13
            r2 = r14
            r0.<init>(r2, r3, r4, r5)
            kotlinx.coroutines.flow.SharedFlow r0 = hg.i.M(r10, r0)
            org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$4 r2 = new org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl$invoke$4
            r2.<init>(r9)
            r6.L$0 = r11
            r6.label = r8
            java.lang.Object r0 = hg.i.y(r0, r2, r6)
            if (r0 != r7) goto L7d
            return r7
        L7d:
            r2 = r11
        L7e:
            org.bidon.sdk.adapter.AdaptersSource r0 = r2.adaptersSource
            java.util.Set r0 = r0.getAdapters()
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            org.bidon.sdk.config.impl.e r8 = new org.bidon.sdk.config.impl.e
            r8.<init>()
            r9 = 31
            r10 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Registered adapters: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "InitAndRegisterUserCase"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.f93236a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.config.impl.InitAndRegisterAdaptersUseCaseImpl.invoke(android.content.Context, java.util.List, org.bidon.sdk.config.models.ConfigResponse, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
