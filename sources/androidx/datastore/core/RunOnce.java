package androidx.datastore.core;

import eg.p;
import eg.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitComplete", "runIfNeeded", "Lkotlinx/coroutines/sync/Mutex;", "runMutex", "Lkotlinx/coroutines/sync/Mutex;", "Leg/p;", "didRun", "Leg/p;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RunOnce {

    @NotNull
    private final Mutex runMutex = f.b(false, 1, null);

    @NotNull
    private final p didRun = r.c(null, 1, null);

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
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
            return RunOnce.this.runIfNeeded(this);
        }
    }

    @Nullable
    public final Object awaitComplete(@NotNull Continuation continuation) {
        Object objAwait = this.didRun.await(continuation);
        return objAwait == b.g() ? objAwait : Unit.f93236a;
    }

    @Nullable
    protected abstract Object doRun(@NotNull Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runIfNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.RunOnce.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.RunOnce r4 = (androidx.datastore.core.RunOnce) r4
            kotlin.d.b(r7)
            r7 = r2
            goto L6a
        L4c:
            kotlin.d.b(r7)
            eg.p r7 = r6.didRun
            boolean r7 = r7.n()
            if (r7 == 0) goto L5a
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L5a:
            kotlinx.coroutines.sync.Mutex r7 = r6.runMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.lock(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            eg.p r2 = r4.didRun     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.n()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L78
            r7.unlock(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L78
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L78
            r0.label = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.doRun(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            eg.p r7 = r0.didRun     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L35
            r7.s(r0)     // Catch: java.lang.Throwable -> L35
            r1.unlock(r5)
            return r0
        L96:
            r1.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
