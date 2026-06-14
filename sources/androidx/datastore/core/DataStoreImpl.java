package androidx.datastore.core;

import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.ironsource.C4240b4;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.protos.Sdk;
import eg.g;
import eg.m1;
import eg.p;
import eg.r;
import hg.i;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 ]*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002]^Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0014\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001e\u0010\u0013J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00028\u0000H\u0082@¢\u0006\u0004\b \u0010\u0013J<\u0010$\u001a\u00028\u00002\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010&\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b(\u0010\u0019JI\u0010,\u001a\u00028\u0001\"\u0004\b\u0001\u0010)2\u0006\u0010&\u001a\u00020\u00152\u001c\u0010+\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n0*H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b,\u0010-J4\u0010.\u001a\u00028\u00002\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b.\u0010/J \u00105\u001a\u0002022\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R \u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010J\u001a\f0IR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\bR\u0010SR \u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR!\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000M8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bX\u0010Y*\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", C4240b4.a.f42506k, "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "incrementCollector", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementCollector", "", "requireLock", "Landroidx/datastore/core/State;", "readState", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "readDataFromFileOrDefault", "transform", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "transformAndWrite", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "Landroidx/datastore/core/Data;", "readDataOrHandleCorruption", "R", "Lkotlin/Function1;", "block", "doWithWriteFileLock", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "updateCache", "", "writeData$datastore_core_release", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/sync/Mutex;", "collectorMutex", "Lkotlinx/coroutines/sync/Mutex;", "collectorCounter", "I", "Lkotlinx/coroutines/Job;", "collectorJob", "Lkotlinx/coroutines/Job;", "Landroidx/datastore/core/DataStoreInMemoryCache;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Lkotlin/Lazy;", "Landroidx/datastore/core/StorageConnection;", "storageConnectionDelegate", "Lkotlin/Lazy;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Landroidx/datastore/core/SimpleActor;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", y.f66058y, "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl<T> implements DataStore<T> {

    @NotNull
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    private int collectorCounter;

    @Nullable
    private Job collectorJob;

    @NotNull
    private final Mutex collectorMutex;

    /* JADX INFO: renamed from: coordinator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coordinator;

    @NotNull
    private final CorruptionHandler<T> corruptionHandler;

    @NotNull
    private final Flow data;

    @NotNull
    private final DataStoreInMemoryCache<T> inMemoryCache;

    @NotNull
    private final DataStoreImpl<T>.InitDataStore readAndInit;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Storage<T> storage;

    @NotNull
    private final Lazy storageConnectionDelegate;

    @NotNull
    private final SimpleActor<Message.Update<T>> writeActor;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\r\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "<init>", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTasks", "Ljava/util/List;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class InitDataStore extends RunOnce {

        @Nullable
        private List<? extends Function2<? super InitializerApi<T>, ? super Continuation, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(@NotNull DataStoreImpl dataStoreImpl, List<? extends Function2<? super InitializerApi<T>, ? super Continuation, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected java.lang.Object doRun(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) throws androidx.datastore.core.CorruptionException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.d.b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.d.b(r7)
                goto L7d
            L40:
                kotlin.d.b(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7f
            L6e:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7f:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
            super(1, continuation);
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new AnonymousClass3(this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            Function1<Continuation, Object> function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objG ? objG : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    static final class C16281 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16281(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    static final class C16291 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16291(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    static final class C16301 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16301(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {MBSupportMuteAdType.INTERSTITIAL_VIDEO, 296, 304}, m = "readDataAndUpdateCache")
    static final class C16311 extends d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16311(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
    static final class C16323 extends k implements Function1<Continuation, Object> {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16323(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new C16323(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            State readException;
            Object objG = b.g();
            int i10 = this.label;
            try {
            } catch (Throwable th3) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th3;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != objG) {
                    th2 = th3;
                    obj = version;
                }
                return objG;
            }
            if (i10 == 0) {
                kotlin.d.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.L$0;
                    kotlin.d.b(obj);
                    readException = new ReadException(th2, ((Number) obj).intValue());
                    return TuplesKt.to(readException, kotlin.coroutines.jvm.internal.b.a(true));
                }
                kotlin.d.b(obj);
            }
            readException = (State) obj;
            return TuplesKt.to(readException, kotlin.coroutines.jvm.internal.b.a(true));
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((C16323) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", "", "locked"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    static final class AnonymousClass4 extends k implements Function2<Boolean, Continuation, Object> {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(DataStoreImpl<T> dataStoreImpl, int i10, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$cachedVersion, continuation);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r02;
            ?? r03;
            State state;
            ?? r12;
            Object objG = b.g();
            ?? r13 = this.label;
            try {
            } catch (Throwable th3) {
                if (r13 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th3;
                    this.Z$0 = r13;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != objG) {
                        r03 = r13;
                        th2 = th3;
                        obj = version;
                    }
                    return objG;
                }
                ?? r42 = r13;
                th2 = th3;
                iIntValue = this.$cachedVersion;
                r02 = r42 == true ? 1 : 0;
            }
            if (r13 == 0) {
                kotlin.d.b(obj);
                boolean z10 = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z10;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(z10, this);
                r13 = z10;
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (r13 != 1) {
                    if (r13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z11 = this.Z$0;
                    th2 = (Throwable) this.L$0;
                    kotlin.d.b(obj);
                    r03 = z11;
                    iIntValue = ((Number) obj).intValue();
                    r02 = r03;
                    ReadException readException = new ReadException(th2, iIntValue);
                    r12 = r02;
                    state = readException;
                    return TuplesKt.to(state, kotlin.coroutines.jvm.internal.b.a(r12));
                }
                boolean z12 = this.Z$0;
                kotlin.d.b(obj);
                r13 = z12;
            }
            state = (State) obj;
            r12 = r13;
            return TuplesKt.to(state, kotlin.coroutines.jvm.internal.b.a(r12));
        }

        @Nullable
        public final Object invoke(boolean z10, @Nullable Continuation continuation) {
            return ((AnonymousClass4) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    static final class C16331 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16331(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T", "locked", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<Boolean, Continuation, Object> {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DataStoreImpl<T> dataStoreImpl, int i10, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$preLockVersion, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.L$0
                kotlin.d.b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.Z$0
                kotlin.d.b(r6)
                goto L34
            L22:
                kotlin.d.b(r6)
                boolean r1 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                r5.Z$0 = r1
                r5.label = r3
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.$preLockVersion
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Nullable
        public final Object invoke(boolean z10, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    static final class C16343 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ Ref$ObjectRef $newData;
        final /* synthetic */ t0 $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16343(Ref$ObjectRef ref$ObjectRef, DataStoreImpl<T> dataStoreImpl, t0 t0Var, Continuation continuation) {
            super(1, continuation);
            this.$newData = ref$ObjectRef;
            this.this$0 = dataStoreImpl;
            this.$version = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new C16343(this.$newData, this.this$0, this.$version, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            t0 t0Var;
            Ref$ObjectRef ref$ObjectRef;
            t0 t0Var2;
            Object objG = b.g();
            int i10 = this.label;
            try {
            } catch (CorruptionException unused) {
                t0 t0Var3 = this.$version;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                Object obj2 = this.$newData.f93280b;
                this.L$0 = t0Var3;
                this.label = 3;
                Object objWriteData$datastore_core_release = dataStoreImpl.writeData$datastore_core_release((T) obj2, true, this);
                if (objWriteData$datastore_core_release != objG) {
                    t0Var = t0Var3;
                    obj = objWriteData$datastore_core_release;
                }
                return objG;
            }
            if (i10 == 0) {
                kotlin.d.b(obj);
                ref$ObjectRef = this.$newData;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                this.L$0 = ref$ObjectRef;
                this.label = 1;
                obj = dataStoreImpl2.readDataFromFileOrDefault(this);
                if (obj == objG) {
                }
                return objG;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    t0Var2 = (t0) this.L$0;
                    kotlin.d.b(obj);
                    t0Var2.f93331b = ((Number) obj).intValue();
                    return Unit.f93236a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0Var = (t0) this.L$0;
                kotlin.d.b(obj);
                t0Var.f93331b = ((Number) obj).intValue();
                return Unit.f93236a;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.d.b(obj);
            ref$ObjectRef.f93280b = obj;
            t0Var2 = this.$version;
            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
            this.L$0 = t0Var2;
            this.label = 2;
            obj = coordinator.getVersion(this);
            if (obj == objG) {
                return objG;
            }
            t0Var2.f93331b = ((Number) obj).intValue();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((C16343) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/State;", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend")
    static final class C16352 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16352(DataStoreImpl<T> dataStoreImpl, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C16352(this.this$0, this.$requireLock, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.d.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                kotlin.d.b(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                if (r5 == 0) goto L3c
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L3c:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1e
                r4.label = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r1 = r4.$requireLock
                r4.label = r2
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L57:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C16352.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C16352) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    static final class C16362 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ CoroutineContext $callerContext;
        final /* synthetic */ Function2<T, Continuation, Object> $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16362(DataStoreImpl<T> dataStoreImpl, CoroutineContext coroutineContext, Function2<? super T, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
            this.$callerContext = coroutineContext;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new C16362(this.this$0, this.$callerContext, this.$transform, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws androidx.datastore.core.CorruptionException {
            /*
                r8 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.L$0
                kotlin.d.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.d.b(r9)
                goto L51
            L27:
                kotlin.d.b(r9)
                goto L39
            L2b:
                kotlin.d.b(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r4
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.coroutines.CoroutineContext r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation, java.lang.Object> r6 = r8.$transform
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = eg.g.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
                if (r1 != 0) goto L6b
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                r8.L$0 = r9
                r8.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C16362.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((C16362) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    static final class C16372 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<T, Continuation, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16372(DataStoreImpl<T> dataStoreImpl, Function2<? super T, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C16372 c16372 = new C16372(this.this$0, this.$transform, continuation);
            c16372.L$0 = obj;
            return c16372;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            p pVarC = r.c(null, 1, null);
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, pVarC, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), coroutineScope.getCoroutineContext()));
            this.label = 1;
            Object objAwait = pVarC.await(this);
            return objAwait == objG ? objG : objAwait;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C16372) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public DataStoreImpl(@NotNull Storage<T> storage, @NotNull List<? extends Function2<? super InitializerApi<T>, ? super Continuation, ? extends Object>> initTasksList, @NotNull CorruptionHandler<T> corruptionHandler, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = i.B(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = f.b(false, 1, null);
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = lf.i.a(new Function0<StorageConnection<T>>(this) { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StorageConnection<T> invoke() {
                return ((DataStoreImpl) this.this$0).storage.createConnection();
            }
        });
        this.coordinator = lf.i.a(new Function0<InterProcessCoordinator>(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InterProcessCoordinator invoke() {
                return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
            }
        });
        this.writeActor = new SimpleActor<>(scope, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                if (th2 != null) {
                    ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th2));
                }
                if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
                    this.this$0.getStorageConnection$datastore_core_release().close();
                }
            }
        }, new Function2<Message.Update<T>, Throwable, Unit>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
                invoke((Message.Update) obj, th2);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull Message.Update<T> msg, @Nullable Throwable th2) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                p ack = msg.getAck();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.d(th2);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object decrementCollector(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.d.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            kotlinx.coroutines.Job r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            kotlinx.coroutines.Job.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5e
            r1.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L6a:
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z10, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
        return z10 ? function1.invoke(continuation) : getCoordinator().lock(new AnonymousClass3(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.Message$Update, androidx.datastore.core.Message$Update<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.datastore.core.Message$Update] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [eg.p] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object incrementCollector(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl.C16291
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C16291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.d.b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.d.b(r12)
            kotlinx.coroutines.sync.Mutex r12 = r11.collectorMutex
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.collectorCounter     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.collectorCounter = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L6a
            kotlinx.coroutines.CoroutineScope r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r8 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Job r12 = eg.g.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L72
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L67
            r1.unlock(r4)
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        L72:
            r1.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C16301
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C16301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.d.b(r6)
            goto L57
        L44:
            kotlin.d.b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6f
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(Continuation continuation) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r10, kotlin.coroutines.Continuation r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z10, Continuation continuation) {
        return g.g(this.scope.getCoroutineContext(), new C16352(this, z10, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation, ? extends Object> function2, CoroutineContext coroutineContext, Continuation continuation) {
        return getCoordinator().lock(new C16362(this, coroutineContext, function2, null), continuation);
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public Flow getData() {
        return this.data;
    }

    @NotNull
    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return g.g(new UpdatingDataContextElement(updatingDataContextElement, this), new C16372(this, function2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object writeData$datastore_core_release(T r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.L$0
            kotlin.jvm.internal.t0 r11 = (kotlin.jvm.internal.t0) r11
            kotlin.d.b(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.d.b(r13)
            kotlin.jvm.internal.t0 r5 = new kotlin.jvm.internal.t0
            r5.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f93331b
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.b.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i10 & 8) != 0 ? kotlinx.coroutines.i.a(Actual_jvmKt.ioDispatcher().plus(m1.b(null, 1, null))) : coroutineScope);
    }
}
