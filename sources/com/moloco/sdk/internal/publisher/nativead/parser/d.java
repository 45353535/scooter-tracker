package com.moloco.sdk.internal.publisher.nativead.parser;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l;
import eg.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55001r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55002s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f55003t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55002s = obj;
            this.f55003t |= Integer.MIN_VALUE;
            return d.g(null, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f55004r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55005s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55006t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f55007u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55008v;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55007u = obj;
            this.f55008v |= Integer.MIN_VALUE;
            return d.b(null, null, 0L, this);
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55009r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55010s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List f55011t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Lazy f55012u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f55013v;

        public static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f55014r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public int f55015s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0672a f55016t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Lazy f55017u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ long f55018v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.AbstractC0672a abstractC0672a, Lazy lazy, long j10, Continuation continuation) {
                super(2, continuation);
                this.f55016t = abstractC0672a;
                this.f55017u = lazy;
                this.f55018v = j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f55016t, this.f55017u, this.f55018v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a.AbstractC0672a abstractC0672a;
                Object objG = pf.b.g();
                int i10 = this.f55015s;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    a.AbstractC0672a abstractC0672a2 = this.f55016t;
                    Lazy lazy = this.f55017u;
                    long j10 = this.f55018v;
                    this.f55014r = abstractC0672a2;
                    this.f55015s = 1;
                    Object objI = d.i(abstractC0672a2, lazy, j10, this);
                    if (objI == objG) {
                        return objG;
                    }
                    abstractC0672a = abstractC0672a2;
                    obj = objI;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC0672a = (a.AbstractC0672a) this.f55014r;
                    kotlin.d.b(obj);
                }
                return TuplesKt.to(abstractC0672a, obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, Lazy lazy, long j10, Continuation continuation) {
            super(2, continuation);
            this.f55011t = list;
            this.f55012u = lazy;
            this.f55013v = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f55011t, this.f55012u, this.f55013v, continuation);
            cVar.f55010s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55009r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f55010s;
            List list = this.f55011t;
            Lazy lazy = this.f55012u;
            long j10 = this.f55013v;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(i.b(coroutineScope, null, null, new a((a.AbstractC0672a) it.next(), lazy, j10, null), 3, null));
                lazy = lazy;
                j10 = j10;
            }
            this.f55009r = 1;
            Object objA = eg.d.a(arrayList, this);
            return objA == objG ? objG : objA;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.parser.d$d, reason: collision with other inner class name */
    public static final class C0675d extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55019r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55020s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List f55021t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Lazy f55022u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f55023v;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.parser.d$d$a */
        public static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f55024r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC0672a f55025s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Lazy f55026t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f55027u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.AbstractC0672a abstractC0672a, Lazy lazy, long j10, Continuation continuation) {
                super(2, continuation);
                this.f55025s = abstractC0672a;
                this.f55026t = lazy;
                this.f55027u = j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f55025s, this.f55026t, this.f55027u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws com.moloco.sdk.internal.publisher.nativead.parser.b {
                Object objG = pf.b.g();
                int i10 = this.f55024r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    a.AbstractC0672a abstractC0672a = this.f55025s;
                    Lazy lazy = this.f55026t;
                    long j10 = this.f55027u;
                    this.f55024r = 1;
                    obj = d.i(abstractC0672a, lazy, j10, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                h0 h0Var = (h0) obj;
                if (h0Var instanceof h0.b) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully prepared native asset: " + this.f55025s.a(), null, false, 12, null);
                    return TuplesKt.to(this.f55025s, h0Var);
                }
                if (!(h0Var instanceof h0.a)) {
                    throw new m();
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare required native asset: " + this.f55025s.a(), null, false, 12, null);
                throw new com.moloco.sdk.internal.publisher.nativead.parser.b(this.f55025s.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((h0.a) h0Var).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0675d(List list, Lazy lazy, long j10, Continuation continuation) {
            super(2, continuation);
            this.f55021t = list;
            this.f55022u = lazy;
            this.f55023v = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0675d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C0675d c0675d = new C0675d(this.f55021t, this.f55022u, this.f55023v, continuation);
            c0675d.f55020s = obj;
            return c0675d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55019r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f55020s;
            List list = this.f55021t;
            Lazy lazy = this.f55022u;
            long j10 = this.f55023v;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(i.b(coroutineScope, null, null, new a((a.AbstractC0672a) it.next(), lazy, j10, null), 3, null));
                lazy = lazy;
                j10 = j10;
            }
            this.f55019r = 1;
            Object objA = eg.d.a(arrayList, this);
            return objA == objG ? objG : objA;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55028r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55029s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f55030t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f55031u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55032v;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55031u = obj;
            this.f55032v |= Integer.MIN_VALUE;
            return d.h(null, null, 0L, this);
        }
    }

    public static final g a(Context context) {
        return l.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final android.content.Context r16, java.util.List r17, long r18, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.d.b(android.content.Context, java.util.List, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object d(a.AbstractC0672a.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m mVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mVar = b.g.f55823a.a();
        }
        return g(bVar, mVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0672a.b r7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.nativead.parser.d.a
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.nativead.parser.d$a r0 = (com.moloco.sdk.internal.publisher.nativead.parser.d.a) r0
            int r1 = r0.f55003t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55003t = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.parser.d$a r0 = new com.moloco.sdk.internal.publisher.nativead.parser.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f55002s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f55003t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f55001r
            com.moloco.sdk.internal.publisher.nativead.model.a$a$b r7 = (com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0672a.b) r7
            kotlin.d.b(r9)
            goto L47
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.d.b(r9)
            java.lang.String r9 = r7.c()
            r0.f55001r = r7
            r0.f55003t = r3
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m$a r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a) r9
            boolean r8 = r9 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a.b
            if (r8 == 0) goto L96
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Successfully loaded image asset media"
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7e
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m$a$b r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m.a.b) r9     // Catch: java.lang.Exception -> L7e
            java.io.File r8 = r9.a()     // Catch: java.lang.Exception -> L7e
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> L7e
            java.lang.String r9 = "getAbsolutePath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Exception -> L7e
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L7e
            java.lang.String r9 = "parse(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Exception -> L7e
            com.moloco.sdk.internal.h0$b r9 = new com.moloco.sdk.internal.h0$b
            com.moloco.sdk.internal.publisher.nativead.model.b$b r0 = new com.moloco.sdk.internal.publisher.nativead.model.b$b
            r0.<init>(r7, r8)
            r9.<init>(r0)
            return r9
        L7e:
            r0 = move-exception
            r7 = r0
            r3 = r7
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 8
            r6 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to prepare image asset"
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.h0$a r7 = new com.moloco.sdk.internal.h0$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f56042d
            r7.<init>(r8)
            return r7
        L96:
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 12
            r6 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to fetch image asset media"
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.h0$a r7 = new com.moloco.sdk.internal.h0$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f56041c
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.d.g(com.moloco.sdk.internal.publisher.nativead.model.a$a$b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0672a.d r10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g r11, long r12, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.parser.d.h(com.moloco.sdk.internal.publisher.nativead.model.a$a$d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object i(a.AbstractC0672a abstractC0672a, Lazy lazy, long j10, Continuation continuation) {
        if (abstractC0672a instanceof a.AbstractC0672a.C0673a) {
            return new h0.b(new b.a((a.AbstractC0672a.C0673a) abstractC0672a));
        }
        if (abstractC0672a instanceof a.AbstractC0672a.b) {
            return d((a.AbstractC0672a.b) abstractC0672a, null, continuation, 2, null);
        }
        if (abstractC0672a instanceof a.AbstractC0672a.c) {
            return new h0.b(new b.c((a.AbstractC0672a.c) abstractC0672a));
        }
        if (abstractC0672a instanceof a.AbstractC0672a.d) {
            return h((a.AbstractC0672a.d) abstractC0672a, (g) lazy.getValue(), j10, continuation);
        }
        throw new m();
    }
}
