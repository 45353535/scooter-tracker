package com.moloco.sdk.acm.db;

import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: com.moloco.sdk.acm.db.d$a$a, reason: collision with other inner class name */
        public static final class C0654a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f53968r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f53969s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f53970t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f53971u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f53972v;

            public C0654a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f53971u = obj;
                this.f53972v |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:32:0x00a4). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object a(com.moloco.sdk.acm.db.d r9, kotlin.coroutines.Continuation r10) {
            /*
                boolean r0 = r10 instanceof com.moloco.sdk.acm.db.d.a.C0654a
                if (r0 == 0) goto L13
                r0 = r10
                com.moloco.sdk.acm.db.d$a$a r0 = (com.moloco.sdk.acm.db.d.a.C0654a) r0
                int r1 = r0.f53972v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53972v = r1
                goto L18
            L13:
                com.moloco.sdk.acm.db.d$a$a r0 = new com.moloco.sdk.acm.db.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f53971u
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f53972v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L48
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r9 = r0.f53968r
                java.util.List r9 = (java.util.List) r9
                kotlin.d.b(r10)
                return r9
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L38:
                java.lang.Object r9 = r0.f53970t
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r2 = r0.f53969s
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r5 = r0.f53968r
                com.moloco.sdk.acm.db.d r5 = (com.moloco.sdk.acm.db.d) r5
                kotlin.d.b(r10)
                goto La4
            L48:
                kotlin.d.b(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                r2 = r10
            L51:
                java.util.List r10 = r9.b()
                boolean r5 = r10.isEmpty()
                if (r5 == 0) goto L6c
                r0.f53968r = r2
                r10 = 0
                r0.f53969s = r10
                r0.f53970t = r10
                r0.f53972v = r3
                java.lang.Object r9 = r9.b(r0)
                if (r9 != r1) goto L6b
                goto La1
            L6b:
                return r2
            L6c:
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r6)
                r5.<init>(r6)
                java.util.Iterator r6 = r10.iterator()
            L7b:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L93
                java.lang.Object r7 = r6.next()
                com.moloco.sdk.acm.db.b r7 = (com.moloco.sdk.acm.db.b) r7
                long r7 = r7.c()
                java.lang.Long r7 = kotlin.coroutines.jvm.internal.b.e(r7)
                r5.add(r7)
                goto L7b
            L93:
                r0.f53968r = r9
                r0.f53969s = r2
                r0.f53970t = r10
                r0.f53972v = r4
                java.lang.Object r5 = r9.d(r5, r0)
                if (r5 != r1) goto La2
            La1:
                return r1
            La2:
                r5 = r9
                r9 = r10
            La4:
                r2.addAll(r9)
                r9 = r5
                goto L51
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.db.d.a.a(com.moloco.sdk.acm.db.d, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    Object a(Continuation continuation);

    Object b(Continuation continuation);

    List b();

    long c(b bVar);

    Object d(List list, Continuation continuation);
}
