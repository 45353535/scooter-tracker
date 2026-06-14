package org.bidon.sdk.config.impl;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import hg.l0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.m;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.config.AdapterInstanceCreator;
import org.bidon.sdk.config.BidonInitializer;
import org.bidon.sdk.config.InitializationCallback;
import org.bidon.sdk.config.SdkState;
import org.bidon.sdk.config.usecases.GetConfigRequestUseCase;
import org.bidon.sdk.config.usecases.InitAndRegisterAdaptersUseCase;
import org.bidon.sdk.databinders.session.SessionTracker;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.segment.SegmentSynchronizer;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.DI;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage;
import org.bidon.sdk.utils.networking.BidonEndpoints;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010?\u001a\u00020@H\u0016J!\u0010A\u001a\u00020@2\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130C\"\u00020\u0013H\u0016¢\u0006\u0002\u0010DJ\u0010\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020\u0016H\u0016J\u0010\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020\u0019H\u0016J\u0010\u0010I\u001a\u00020@2\u0006\u0010J\u001a\u00020\u0016H\u0016J\u0018\u0010K\u001a\u00020@2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0016H\u0016J\u000e\u0010O\u001a\u00020@H\u0082@¢\u0006\u0002\u0010PJ.\u0010Q\u001a\b\u0012\u0004\u0012\u00020@0R2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00162\u0006\u0010S\u001a\u00020TH\u0082@¢\u0006\u0004\bU\u0010VJ\b\u0010W\u001a\u00020@H\u0002J\b\u0010X\u001a\u00020@H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00108\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006Y"}, d2 = {"Lorg/bidon/sdk/config/impl/BidonInitializerImpl;", "Lorg/bidon/sdk/config/BidonInitializer;", "<init>", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "useDefaultAdapters", "", "publisherAdapters", "", "Ljava/lang/Class;", "Lorg/bidon/sdk/adapter/Adapter;", "publisherAdapterClasses", "", "", "initializationCallbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lorg/bidon/sdk/config/InitializationCallback;", "initAndRegisterAdapters", "Lorg/bidon/sdk/config/usecases/InitAndRegisterAdaptersUseCase;", "getInitAndRegisterAdapters", "()Lorg/bidon/sdk/config/usecases/InitAndRegisterAdaptersUseCase;", "getConfigRequest", "Lorg/bidon/sdk/config/usecases/GetConfigRequestUseCase;", "getGetConfigRequest", "()Lorg/bidon/sdk/config/usecases/GetConfigRequestUseCase;", "adapterInstanceCreator", "Lorg/bidon/sdk/config/AdapterInstanceCreator;", "getAdapterInstanceCreator", "()Lorg/bidon/sdk/config/AdapterInstanceCreator;", "keyValueStorage", "Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "getKeyValueStorage", "()Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "bidOnEndpoints", "Lorg/bidon/sdk/utils/networking/BidonEndpoints;", "getBidOnEndpoints", "()Lorg/bidon/sdk/utils/networking/BidonEndpoints;", "segmentSynchronizer", "Lorg/bidon/sdk/segment/SegmentSynchronizer;", "getSegmentSynchronizer", "()Lorg/bidon/sdk/segment/SegmentSynchronizer;", "initializationState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/config/SdkState;", "getInitializationState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isInitialized", "()Z", "isTestMode", "setTestMode", "(Z)V", "baseUrl", "getBaseUrl", "()Ljava/lang/String;", "registerDefaultAdapters", "", "registerAdapters", "adapters", "", "([Lorg/bidon/sdk/adapter/Adapter;)V", "registerAdapter", "adaptersClassName", "setInitializationCallback", "initializationCallback", "setBaseUrl", "host", MobileAdsBridgeBase.initializeMethodName, POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "appKey", "obtainSegmentUid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "Lkotlin/Result;", "timeStart", "", "init-BWLJW6A", "(Landroid/content/Context;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", "notifyInitialized", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidonInitializerImpl implements BidonInitializer {

    /* JADX INFO: renamed from: dispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dispatcher;

    @NotNull
    private final CopyOnWriteArraySet<InitializationCallback> initializationCallbacks;

    @NotNull
    private final MutableStateFlow initializationState;
    private boolean isTestMode;

    @NotNull
    private Set<String> publisherAdapterClasses;

    @NotNull
    private Map<Class<? extends Adapter>, Adapter> publisherAdapters;
    private boolean useDefaultAdapters;

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.BidonInitializerImpl$initialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.BidonInitializerImpl$initialize$1", f = "BidonInitializerImpl.kt", l = {105, 107}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $appKey;
        final /* synthetic */ Context $context;
        final /* synthetic */ long $timeStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$appKey = str;
            this.$timeStart = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = BidonInitializerImpl.this.new AnonymousClass1(this.$context, this.$appKey, this.$timeStart, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(10:41|6|7|22|29|(1:31)|32|(1:34)|35|36)(2:10|11))(1:12))(3:13|(1:15)|21)|16|39|17|18|37|19) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            if (r10 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            r10 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        
            r8 = r9;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L19
                kotlin.Result r10 = (kotlin.Result) r10     // Catch: java.lang.Throwable -> L19
                java.lang.Object r10 = r10.l()     // Catch: java.lang.Throwable -> L19
                r8 = r9
                goto L59
            L19:
                r0 = move-exception
                r10 = r0
                r8 = r9
                goto L68
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.d.b(r10)
                goto L42
            L2d:
                kotlin.d.b(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                org.bidon.sdk.config.impl.BidonInitializerImpl r1 = org.bidon.sdk.config.impl.BidonInitializerImpl.this
                r9.L$0 = r10
                r9.label = r3
                java.lang.Object r10 = org.bidon.sdk.config.impl.BidonInitializerImpl.access$obtainSegmentUid(r1, r9)
                if (r10 != r0) goto L42
                r8 = r9
                goto L58
            L42:
                org.bidon.sdk.config.impl.BidonInitializerImpl r3 = org.bidon.sdk.config.impl.BidonInitializerImpl.this
                android.content.Context r4 = r9.$context
                java.lang.String r5 = r9.$appKey
                long r6 = r9.$timeStart
                kotlin.Result$Companion r10 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L65
                r10 = 0
                r9.L$0 = r10     // Catch: java.lang.Throwable -> L65
                r9.label = r2     // Catch: java.lang.Throwable -> L65
                r8 = r9
                java.lang.Object r10 = org.bidon.sdk.config.impl.BidonInitializerImpl.m8672access$initBWLJW6A(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L62
                if (r10 != r0) goto L59
            L58:
                return r0
            L59:
                kotlin.Result r10 = kotlin.Result.a(r10)     // Catch: java.lang.Throwable -> L62
                java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L62
                goto L72
            L62:
                r0 = move-exception
            L63:
                r10 = r0
                goto L68
            L65:
                r0 = move-exception
                r8 = r9
                goto L63
            L68:
                kotlin.Result$Companion r0 = kotlin.Result.f93230c
                java.lang.Object r10 = kotlin.d.a(r10)
                java.lang.Object r10 = kotlin.Result.b(r10)
            L72:
                org.bidon.sdk.config.impl.BidonInitializerImpl r0 = org.bidon.sdk.config.impl.BidonInitializerImpl.this
                java.lang.Throwable r1 = kotlin.Result.g(r10)
                java.lang.String r2 = "BidonInitializer"
                if (r1 == 0) goto L8a
                java.lang.String r3 = "Error while initialization"
                org.bidon.sdk.logs.logging.impl.LogExtKt.logError(r2, r3, r1)
                kotlinx.coroutines.flow.MutableStateFlow r0 = r0.getInitializationState()
                org.bidon.sdk.config.SdkState r1 = org.bidon.sdk.config.SdkState.InitializationFailed
                r0.setValue(r1)
            L8a:
                long r0 = r8.$timeStart
                org.bidon.sdk.config.impl.BidonInitializerImpl r3 = org.bidon.sdk.config.impl.BidonInitializerImpl.this
                boolean r4 = kotlin.Result.j(r10)
                if (r4 == 0) goto Lc0
                kotlin.Result r10 = (kotlin.Result) r10
                r10.l()
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "Initialized in "
                r10.append(r0)
                r10.append(r4)
                java.lang.String r0 = " ms."
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r2, r10)
                kotlinx.coroutines.flow.MutableStateFlow r10 = r3.getInitializationState()
                org.bidon.sdk.config.SdkState r0 = org.bidon.sdk.config.SdkState.Initialized
                r10.setValue(r0)
            Lc0:
                org.bidon.sdk.config.impl.BidonInitializerImpl r10 = org.bidon.sdk.config.impl.BidonInitializerImpl.this
                org.bidon.sdk.config.impl.BidonInitializerImpl.access$notifyInitialized(r10)
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.config.impl.BidonInitializerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.config.impl.BidonInitializerImpl$obtainSegmentUid$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.config.impl.BidonInitializerImpl$obtainSegmentUid$2", f = "BidonInitializerImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BidonInitializerImpl.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            String segmentUid = BidonInitializerImpl.this.getKeyValueStorage().getSegmentUid();
            if (segmentUid == null) {
                return null;
            }
            BidonInitializerImpl.this.getSegmentSynchronizer().setSegmentUid(segmentUid);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public BidonInitializerImpl() {
        DI.INSTANCE.setFactories();
        this.dispatcher = lf.i.a(new Function0() { // from class: org.bidon.sdk.config.impl.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BidonInitializerImpl.dispatcher_delegate$lambda$0();
            }
        });
        this.publisherAdapters = new LinkedHashMap();
        this.publisherAdapterClasses = new LinkedHashSet();
        this.initializationCallbacks = new CopyOnWriteArraySet<>();
        this.initializationState = l0.a(SdkState.NotInitialized);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineDispatcher dispatcher_delegate$lambda$0() {
        return SdkDispatchers.INSTANCE.getBidon();
    }

    private final AdapterInstanceCreator getAdapterInstanceCreator() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(AdapterInstanceCreator.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (AdapterInstanceCreator) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.config.AdapterInstanceCreator");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (AdapterInstanceCreator) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.config.AdapterInstanceCreator");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + AdapterInstanceCreator.class).toString());
    }

    private final BidonEndpoints getBidOnEndpoints() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(BidonEndpoints.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (BidonEndpoints) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.BidonEndpoints");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (BidonEndpoints) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.networking.BidonEndpoints");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + BidonEndpoints.class).toString());
    }

    private final CoroutineDispatcher getDispatcher() {
        return (CoroutineDispatcher) this.dispatcher.getValue();
    }

    private final GetConfigRequestUseCase getGetConfigRequest() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(GetConfigRequestUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (GetConfigRequestUseCase) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.config.usecases.GetConfigRequestUseCase");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (GetConfigRequestUseCase) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.config.usecases.GetConfigRequestUseCase");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + GetConfigRequestUseCase.class).toString());
    }

    private final InitAndRegisterAdaptersUseCase getInitAndRegisterAdapters() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(InitAndRegisterAdaptersUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (InitAndRegisterAdaptersUseCase) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.config.usecases.InitAndRegisterAdaptersUseCase");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (InitAndRegisterAdaptersUseCase) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.config.usecases.InitAndRegisterAdaptersUseCase");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + InitAndRegisterAdaptersUseCase.class).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyValueStorage getKeyValueStorage() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(KeyValueStorage.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (KeyValueStorage) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (KeyValueStorage) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + KeyValueStorage.class).toString());
    }

    private final CoroutineScope getScope() {
        return kotlinx.coroutines.i.a(getDispatcher());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SegmentSynchronizer getSegmentSynchronizer() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(SegmentSynchronizer.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (SegmentSynchronizer) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (SegmentSynchronizer) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.segment.SegmentSynchronizer");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + SegmentSynchronizer.class).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a8, code lost:
    
        if (r3.invoke(r10, r5, r1, r6, r8) == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: init-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8673initBWLJW6A(android.content.Context r19, java.lang.String r20, long r21, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.config.impl.BidonInitializerImpl.m8673initBWLJW6A(android.content.Context, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInitialized() {
        for (InitializationCallback initializationCallback : this.initializationCallbacks) {
            LogExtKt.logInfo("BidonInitializer", "notifyInitialized: notified callback: " + initializationCallback);
            initializationCallback.onFinished();
        }
        this.publisherAdapters.clear();
        this.initializationCallbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object obtainSegmentUid(Continuation continuation) {
        return eg.g.g(SdkDispatchers.INSTANCE.getIO(), new AnonymousClass2(null), continuation);
    }

    private final void startSession() {
        SessionTracker sessionTracker;
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(SessionTracker.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.session.SessionTracker");
            }
            sessionTracker = (SessionTracker) singleton;
        } else {
            if (!(instanceType instanceof InstanceType.Factory)) {
                if (instanceType instanceof InstanceType.ParamFactory) {
                    new InstanceType.ParamFactory.Params();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (instanceType != null) {
                    throw new m();
                }
                throw new IllegalStateException(("No factory provided for class: " + SessionTracker.class).toString());
            }
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.databinders.session.SessionTracker");
            }
            sessionTracker = (SessionTracker) objBuild;
        }
        LogExtKt.logInfo("BidonInitializer", "Session started with sessionId=" + sessionTracker.getSessionId());
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    @NotNull
    public String getBaseUrl() {
        return getBidOnEndpoints().getActiveEndpoint();
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void initialize(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (getInitializationState().getValue() == SdkState.Initialized) {
            notifyInitialized();
        } else if (getInitializationState().b(SdkState.NotInitialized, SdkState.Initializing)) {
            DI.INSTANCE.init(context);
            eg.i.d(getScope(), null, null, new AnonymousClass1(context, appKey, jCurrentTimeMillis, null), 3, null);
        }
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public boolean isInitialized() {
        return getInitializationState().getValue() == SdkState.Initialized;
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    /* JADX INFO: renamed from: isTestMode, reason: from getter */
    public boolean getIsTestMode() {
        return this.isTestMode;
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void registerAdapter(@NotNull String adaptersClassName) {
        Intrinsics.checkNotNullParameter(adaptersClassName, "adaptersClassName");
        this.publisherAdapterClasses.add(adaptersClassName);
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void registerAdapters(@NotNull Adapter... adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        for (Adapter adapter : adapters) {
            this.publisherAdapters.put((Class<? extends Adapter>) adapter.getClass(), adapter);
        }
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void registerDefaultAdapters() {
        this.useDefaultAdapters = true;
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void setBaseUrl(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        getBidOnEndpoints().init(host, SetsKt.emptySet());
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void setInitializationCallback(@NotNull InitializationCallback initializationCallback) {
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        if (!isInitialized()) {
            this.initializationCallbacks.add(initializationCallback);
        } else {
            LogExtKt.logInfo("BidonInitializer", "setInitializationCallback: already initialized");
            initializationCallback.onFinished();
        }
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    public void setTestMode(boolean z10) {
        this.isTestMode = z10;
    }

    @Override // org.bidon.sdk.config.BidonInitializer
    @NotNull
    public MutableStateFlow getInitializationState() {
        return this.initializationState;
    }
}
