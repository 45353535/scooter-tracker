package androidx.room;

import androidx.annotation.GuardedBy;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00130\u0015H\u0080\bø\u0001\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u0013H\u0000¢\u0006\u0002\b J\r\u0010!\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\"R\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Landroidx/room/ObservedTableStates;", "", "size", "", "<init>", "(I)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "tableObserversCount", "", "tableObservedState", "", "needsSync", "", "onSyncLock", "inProgressSync", "onSync", "", "action", "Lkotlin/Function1;", "", "Landroidx/room/ObservedTableStates$ObserveOp;", "onSync$room_runtime", "onObserverAdded", "tableIds", "", "onObserverAdded$room_runtime", "onObserverRemoved", "onObserverRemoved$room_runtime", "resetTriggerState", "resetTriggerState$room_runtime", "forceNeedSync", "forceNeedSync$room_runtime", "ObserveOp", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObservedTableStates {

    @GuardedBy("onSyncLock")
    private volatile boolean inProgressSync;

    @GuardedBy("lock")
    private volatile boolean needsSync;

    @GuardedBy("lock")
    @NotNull
    private final boolean[] tableObservedState;

    @GuardedBy("lock")
    @NotNull
    private final long[] tableObserversCount;

    @NotNull
    private final ReentrantLock lock = new ReentrantLock();

    @NotNull
    private final ReentrantLock onSyncLock = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/ObservedTableStates$ObserveOp;", "", "<init>", "(Ljava/lang/String;I)V", "NO_OP", "ADD", com.taurusx.tax.g.n0.y.f66193b, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ObserveOp {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ObserveOp[] $VALUES;
        public static final ObserveOp NO_OP = new ObserveOp("NO_OP", 0);
        public static final ObserveOp ADD = new ObserveOp("ADD", 1);
        public static final ObserveOp REMOVE = new ObserveOp(com.taurusx.tax.g.n0.y.f66193b, 2);

        private static final /* synthetic */ ObserveOp[] $values() {
            return new ObserveOp[]{NO_OP, ADD, REMOVE};
        }

        static {
            ObserveOp[] observeOpArr$values = $values();
            $VALUES = observeOpArr$values;
            $ENTRIES = qf.a.a(observeOpArr$values);
        }

        private ObserveOp(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) $VALUES.clone();
        }
    }

    public ObservedTableStates(int i10) {
        this.tableObserversCount = new long[i10];
        this.tableObservedState = new boolean[i10];
    }

    public final void forceNeedSync$room_runtime() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            Unit unit = Unit.f93236a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onObserverAdded$room_runtime(@org.jetbrains.annotations.NotNull int[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r12.lock
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L2b
            r6 = r13[r3]     // Catch: java.lang.Throwable -> L26
            long[] r7 = r12.tableObserversCount     // Catch: java.lang.Throwable -> L26
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L26
            r10 = 1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> L26
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L28
            r12.needsSync = r5     // Catch: java.lang.Throwable -> L26
            r4 = r5
            goto L28
        L26:
            r13 = move-exception
            goto L3a
        L28:
            int r3 = r3 + 1
            goto Le
        L2b:
            if (r4 != 0) goto L35
            boolean r13 = r12.needsSync     // Catch: java.lang.Throwable -> L26
            if (r13 != 0) goto L35
            boolean r13 = r12.inProgressSync     // Catch: java.lang.Throwable -> L26
            if (r13 == 0) goto L36
        L35:
            r2 = r5
        L36:
            r0.unlock()
            return r2
        L3a:
            r0.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableStates.onObserverAdded$room_runtime(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onObserverRemoved$room_runtime(@org.jetbrains.annotations.NotNull int[] r15) {
        /*
            r14 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r14.lock
            r0.lock()
            int r1 = r15.length     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L2a
            r6 = r15[r3]     // Catch: java.lang.Throwable -> L25
            long[] r7 = r14.tableObserversCount     // Catch: java.lang.Throwable -> L25
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L25
            r10 = 1
            long r12 = r8 - r10
            r7[r6] = r12     // Catch: java.lang.Throwable -> L25
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L27
            r14.needsSync = r5     // Catch: java.lang.Throwable -> L25
            r4 = r5
            goto L27
        L25:
            r15 = move-exception
            goto L39
        L27:
            int r3 = r3 + 1
            goto Le
        L2a:
            if (r4 != 0) goto L34
            boolean r15 = r14.needsSync     // Catch: java.lang.Throwable -> L25
            if (r15 != 0) goto L34
            boolean r15 = r14.inProgressSync     // Catch: java.lang.Throwable -> L25
            if (r15 == 0) goto L35
        L34:
            r2 = r5
        L35:
            r0.unlock()
            return r2
        L39:
            r0.unlock()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableStates.onObserverRemoved$room_runtime(int[]):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void onSync$room_runtime(@NotNull Function1<? super ObserveOp[], Unit> action) {
        byte b10;
        ObserveOp observeOp;
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantLock reentrantLock = this.onSyncLock;
        reentrantLock.lock();
        try {
            this.inProgressSync = true;
            ReentrantLock reentrantLock2 = this.lock;
            reentrantLock2.lock();
            try {
                ?? r62 = 0;
                r62 = 0;
                if (this.needsSync) {
                    this.needsSync = false;
                    int length = this.tableObserversCount.length;
                    ObserveOp[] observeOpArr = new ObserveOp[length];
                    int i10 = 0;
                    byte b11 = false;
                    while (i10 < length) {
                        boolean z10 = this.tableObserversCount[i10] > 0;
                        if (z10 != this.tableObservedState[i10]) {
                            this.tableObservedState[i10] = z10;
                            observeOp = z10 ? ObserveOp.ADD : ObserveOp.REMOVE;
                            b10 = true;
                        } else {
                            b10 = b11;
                            observeOp = ObserveOp.NO_OP;
                        }
                        observeOpArr[i10] = observeOp;
                        i10++;
                        b11 = b10;
                    }
                    if (b11 != false) {
                        r62 = observeOpArr;
                    }
                }
                if (r62 != 0) {
                    try {
                        if (r62.length != 0) {
                            action.invoke(r62);
                        }
                    } catch (Throwable th2) {
                        kotlin.jvm.internal.z.b(1);
                        this.inProgressSync = false;
                        kotlin.jvm.internal.z.a(1);
                        throw th2;
                    }
                }
                kotlin.jvm.internal.z.b(1);
                this.inProgressSync = false;
                kotlin.jvm.internal.z.a(1);
                Unit unit = Unit.f93236a;
                kotlin.jvm.internal.z.b(1);
                reentrantLock.unlock();
                kotlin.jvm.internal.z.a(1);
            } finally {
                kotlin.jvm.internal.z.b(1);
                reentrantLock2.unlock();
                kotlin.jvm.internal.z.a(1);
            }
        } catch (Throwable th3) {
            kotlin.jvm.internal.z.b(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.z.a(1);
            throw th3;
        }
    }

    public final void resetTriggerState$room_runtime() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ArraysKt.fill$default(this.tableObservedState, false, 0, 0, 6, (Object) null);
            this.needsSync = true;
            Unit unit = Unit.f93236a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
