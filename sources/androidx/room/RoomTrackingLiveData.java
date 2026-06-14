package androidx.room;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001a\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001bH\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001f\u001a\u00020\u001bH\u0014J\b\u0010 \u001a\u00020\u001bH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002!\"¨\u0006#"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "database", "Landroidx/room/RoomDatabase;", "container", "Landroidx/room/InvalidationLiveDataContainer;", "inTransaction", "", "tableNames", "", "", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;)V", "getDatabase", "()Landroidx/room/RoomDatabase;", "getInTransaction", "()Z", "observer", "Landroidx/room/InvalidationTracker$Observer;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "registeredObserver", "launchContext", "Lkotlin/coroutines/CoroutineContext;", ToolBar.REFRESH, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidated", "compute", "onActive", "onInactive", "Landroidx/room/RoomCallableTrackingLiveData;", "Landroidx/room/RoomLambdaTrackingLiveData;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {

    @NotNull
    private final AtomicBoolean computing;

    @NotNull
    private final InvalidationLiveDataContainer container;

    @NotNull
    private final RoomDatabase database;
    private final boolean inTransaction;

    @NotNull
    private final AtomicBoolean invalid;

    @NotNull
    private final CoroutineContext launchContext;

    @NotNull
    private final InvalidationTracker.Observer observer;

    @NotNull
    private final AtomicBoolean registeredObserver;

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$invalidated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomTrackingLiveData$invalidated$1", f = "RoomTrackingLiveData.android.kt", l = {113}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation continuation) {
            super(2, continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                RoomTrackingLiveData<T> roomTrackingLiveData = this.this$0;
                this.label = 1;
                if (roomTrackingLiveData.refresh(this) == objG) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$onActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomTrackingLiveData$onActive$1", f = "RoomTrackingLiveData.android.kt", l = {123}, m = "invokeSuspend")
    static final class C16631 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16631(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation continuation) {
            super(2, continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C16631(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                RoomTrackingLiveData<T> roomTrackingLiveData = this.this$0;
                this.label = 1;
                if (roomTrackingLiveData.refresh(this) == objG) {
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
            return ((C16631) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$refresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", l = {82}, m = ToolBar.REFRESH)
    static final class C16641 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16641(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation continuation) {
            super(continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.refresh(this);
        }
    }

    public /* synthetic */ RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z10, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(roomDatabase, invalidationLiveDataContainer, z10, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void invalidated() {
        boolean zHasActiveObservers = hasActiveObservers();
        if (this.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            eg.i.d(this.database.getCoroutineScope(), this.launchContext, null, new AnonymousClass1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060 A[Catch: all -> 0x002c, Exception -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0028, B:28:0x0060), top: B:45:0x0028, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:12:0x0028, B:26:0x0058, B:28:0x0060, B:35:0x0077, B:32:0x006d, B:33:0x0074), top: B:45:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object refresh(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.room.RoomTrackingLiveData.C16641
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = (androidx.room.RoomTrackingLiveData.C16641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = new androidx.room.RoomTrackingLiveData$refresh$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r2 = r0.I$0
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L58
        L2c:
            r7 = move-exception
            goto L80
        L2e:
            r7 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.d.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.registeredObserver
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L4e
            androidx.room.RoomDatabase r7 = r6.database
            androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
            androidx.room.InvalidationTracker$Observer r2 = r6.observer
            r7.addWeakObserver(r2)
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.computing
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L86
            r7 = 0
            r2 = r3
        L58:
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.invalid     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L75
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r0.label = r4     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Object r7 = r6.compute(r0)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r2 = r4
            goto L58
        L6d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Exception while computing database live data."
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L75:
            if (r2 == 0) goto L7a
            r6.postValue(r7)     // Catch: java.lang.Throwable -> L2c
        L7a:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.computing
            r7.set(r3)
            goto L87
        L80:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.computing
            r0.set(r3)
            throw r7
        L86:
            r2 = r3
        L87:
            if (r2 == 0) goto L91
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.invalid
            boolean r7 = r7.get()
            if (r7 != 0) goto L4e
        L91:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomTrackingLiveData.refresh(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public abstract Object compute(@NotNull Continuation continuation);

    @NotNull
    protected final RoomDatabase getDatabase() {
        return this.database;
    }

    protected final boolean getInTransaction() {
        return this.inTransaction;
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        this.container.onActive(this);
        eg.i.d(this.database.getCoroutineScope(), this.launchContext, null, new C16631(this, null), 2, null);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        this.container.onInactive(this);
    }

    private RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z10, String[] strArr) {
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z10;
        this.observer = new RoomTrackingLiveData$observer$1(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.launchContext = roomDatabase.inCompatibilityMode() ? z10 ? roomDatabase.getTransactionContext$room_runtime() : roomDatabase.getQueryContext() : kotlin.coroutines.e.f93267b;
    }
}
