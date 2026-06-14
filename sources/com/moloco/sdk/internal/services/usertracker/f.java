package com.moloco.sdk.internal.services.usertracker;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f55725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f55726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mutex f55727c;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55728r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55729s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f55730t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55732v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55730t = obj;
            this.f55732v |= Integer.MIN_VALUE;
            return f.this.b(this);
        }
    }

    public f(d idGenerator, b idRepository) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(idRepository, "idRepository");
        this.f55725a = idGenerator;
        this.f55726b = idRepository;
        this.f55727c = ng.f.b(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r4.a(r9, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:34:0x0085, B:36:0x0089), top: B:47:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.usertracker.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.services.usertracker.f.a
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.services.usertracker.f$a r0 = (com.moloco.sdk.internal.services.usertracker.f.a) r0
            int r1 = r0.f55732v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55732v = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.usertracker.f$a r0 = new com.moloco.sdk.internal.services.usertracker.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f55730t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f55732v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L52
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f55729s
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f55728r
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L39
            goto La0
        L39:
            r9 = move-exception
            goto La8
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L44:
            java.lang.Object r2 = r0.f55729s
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.f55728r
            com.moloco.sdk.internal.services.usertracker.f r4 = (com.moloco.sdk.internal.services.usertracker.f) r4
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L50
            goto L85
        L50:
            r9 = move-exception
            goto La9
        L52:
            java.lang.Object r2 = r0.f55729s
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r5 = r0.f55728r
            com.moloco.sdk.internal.services.usertracker.f r5 = (com.moloco.sdk.internal.services.usertracker.f) r5
            kotlin.d.b(r9)
            r9 = r2
            goto L72
        L5f:
            kotlin.d.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r8.f55727c
            r0.f55728r = r8
            r0.f55729s = r9
            r0.f55732v = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L71
            goto L9d
        L71:
            r5 = r8
        L72:
            com.moloco.sdk.internal.services.usertracker.b r2 = r5.f55726b     // Catch: java.lang.Throwable -> La4
            r0.f55728r = r5     // Catch: java.lang.Throwable -> La4
            r0.f55729s = r9     // Catch: java.lang.Throwable -> La4
            r0.f55732v = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r2 = r2.b(r0)     // Catch: java.lang.Throwable -> La4
            if (r2 != r1) goto L81
            goto L9d
        L81:
            r4 = r2
            r2 = r9
            r9 = r4
            r4 = r5
        L85:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L9e
            com.moloco.sdk.internal.services.usertracker.d r9 = r4.f55725a     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.a()     // Catch: java.lang.Throwable -> L50
            com.moloco.sdk.internal.services.usertracker.b r4 = r4.f55726b     // Catch: java.lang.Throwable -> L50
            r0.f55728r = r2     // Catch: java.lang.Throwable -> L50
            r0.f55729s = r9     // Catch: java.lang.Throwable -> L50
            r0.f55732v = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r4.a(r9, r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != r1) goto L9e
        L9d:
            return r1
        L9e:
            r1 = r9
            r0 = r2
        La0:
            r0.unlock(r6)
            return r1
        La4:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        La8:
            r2 = r0
        La9:
            r2.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.usertracker.f.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
