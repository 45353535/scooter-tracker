package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0011\u0010\t\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "", "()V", "continuation", "Lkotlin/coroutines/Continuation;", "", "stateWasLoaded", "", "onStateLoaded", "waitFinalLazyListSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AwaitLazyListStateSet {

    @Nullable
    private Continuation continuation;
    private boolean stateWasLoaded;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.pager.AwaitLazyListStateSet", f = "PagerState.kt", l = {418}, m = "waitFinalLazyListSetting")
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
            return AwaitLazyListStateSet.this.waitFinalLazyListSetting(this);
        }
    }

    public final void onStateLoaded() {
        if (this.stateWasLoaded) {
            return;
        }
        this.stateWasLoaded = true;
        Continuation continuation = this.continuation;
        if (continuation != null) {
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitFinalLazyListSetting(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.pager.AwaitLazyListStateSet.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = new androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.AwaitLazyListStateSet r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet) r0
            kotlin.d.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.d.b(r5)
            boolean r5 = r4.stateWasLoaded
            if (r5 != 0) goto L71
            kotlin.coroutines.Continuation r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            of.e r2 = new of.e
            kotlin.coroutines.Continuation r3 = pf.b.d(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.b()
            java.lang.Object r3 = pf.b.g()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.g.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            kotlin.Result$Companion r5 = kotlin.Result.f93230c
            kotlin.Unit r5 = kotlin.Unit.f93236a
            java.lang.Object r5 = kotlin.Result.b(r5)
            r1.resumeWith(r5)
        L71:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
