package com.unity3d.ads.core.domain.events;

import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import eg.g;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import hg.i;
import hg.l0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventObserver {

    @NotNull
    private final BackgroundWorker backgroundWorker;

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final MutableStateFlow isRunning;

    @NotNull
    private final OperativeEventRepository operativeEventRepository;

    @NotNull
    private final UniversalRequestDataSource universalRequestDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "operativeEventRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {40, 43}, m = "invokeSuspend")
        static final class C08402 extends k implements Function2<OperativeEventRequestOuterClass.OperativeEventRequest, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08402(OperativeEventObserver operativeEventObserver, Continuation continuation) {
                super(2, continuation);
                this.this$0 = operativeEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C08402 c08402 = new C08402(this.this$0, continuation);
                c08402.L$0 = obj;
                return c08402;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, @Nullable Continuation continuation) {
                return ((C08402) create(operativeEventRequest, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                String str;
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setOperativeEvent(operativeEventRequest);
                    UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                    this.label = 1;
                    obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj != objG) {
                    }
                    return objG;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    d.b(obj);
                    UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                    OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) OperativeEventJob.class).setInputData(universalRequestWorkerData.invoke()).addTag(BackgroundWorker.TAG).build();
                    Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                    return Unit.f93236a;
                }
                d.b(obj);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "fullRequest.toByteArray()");
                ByteString byteString = ByteStringsKt.toByteString(byteArray);
                this.L$0 = string;
                this.label = 2;
                if (universalRequestDataSource.set(string, byteString, this) != objG) {
                    str = string;
                    UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                    OneTimeWorkRequest oneTimeWorkRequestBuild2 = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) OperativeEventJob.class).setInputData(universalRequestWorkerData2.invoke()).addTag(BackgroundWorker.TAG).build();
                    Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                    return Unit.f93236a;
                }
                return objG;
            }
        }

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return OperativeEventObserver.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object value;
            Boolean bool;
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            MutableStateFlow mutableStateFlow = OperativeEventObserver.this.isRunning;
            do {
                value = mutableStateFlow.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!mutableStateFlow.b(value, kotlin.coroutines.jvm.internal.b.a(true)));
            if (bool.booleanValue()) {
                return Unit.f93236a;
            }
            i.F(i.K(OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new C08402(OperativeEventObserver.this, null)), kotlinx.coroutines.i.a(OperativeEventObserver.this.defaultDispatcher));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public OperativeEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull CoroutineDispatcher defaultDispatcher, @NotNull OperativeEventRepository operativeEventRepository, @NotNull UniversalRequestDataSource universalRequestDataSource, @NotNull BackgroundWorker backgroundWorker) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = l0.a(Boolean.FALSE);
    }

    @Nullable
    public final Object invoke(@NotNull Continuation continuation) {
        Object objG = g.g(this.defaultDispatcher, new AnonymousClass2(null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }
}
