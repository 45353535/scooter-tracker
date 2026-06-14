package coil.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Lifecycles {

    /* JADX INFO: renamed from: coil.util.-Lifecycles$a */
    static final class a extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6970r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6971s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6972t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f6973u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6972t = obj;
            this.f6973u |= Integer.MIN_VALUE;
            return Lifecycles.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles.a
            if (r0 == 0) goto L13
            r0 = r7
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.a) r0
            int r1 = r0.f6973u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6973u = r1
            goto L18
        L13:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6972t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6973u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f6971s
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f6970r
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L8c
        L31:
            r7 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.d.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4d
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L4d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f6970r = r6     // Catch: java.lang.Throwable -> L81
            r0.f6971s = r7     // Catch: java.lang.Throwable -> L81
            r0.f6973u = r3     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.e r2 = new kotlinx.coroutines.e     // Catch: java.lang.Throwable -> L81
            kotlin.coroutines.Continuation r4 = pf.b.d(r0)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L81
            r2.I()     // Catch: java.lang.Throwable -> L81
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch: java.lang.Throwable -> L81
            r3.<init>()     // Catch: java.lang.Throwable -> L81
            r7.f93280b = r3     // Catch: java.lang.Throwable -> L81
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L81
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3     // Catch: java.lang.Throwable -> L81
            r6.addObserver(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.C()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = pf.b.g()     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L87
            kotlin.coroutines.jvm.internal.g.c(r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L98
        L87:
            if (r2 != r1) goto L8a
            return r1
        L8a:
            r0 = r6
            r6 = r7
        L8c:
            java.lang.Object r6 = r6.f93280b
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L95
            r0.removeObserver(r6)
        L95:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L98:
            java.lang.Object r6 = r6.f93280b
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto La1
            r0.removeObserver(r6)
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.Lifecycle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
