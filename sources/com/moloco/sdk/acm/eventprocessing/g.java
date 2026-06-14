package com.moloco.sdk.acm.eventprocessing;

import eg.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f54007e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.d f54008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.f f54009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f54010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.b f54011d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54012r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.c f54014t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.acm.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f54014t = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new b(this.f54014t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54012r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                g gVar = g.this;
                String strC = this.f54014t.c();
                com.moloco.sdk.acm.db.c cVar = com.moloco.sdk.acm.db.c.f53965c;
                long jA = this.f54014t.a();
                List listB = this.f54014t.b();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.moloco.sdk.acm.i.a((com.moloco.sdk.acm.d) it.next()));
                }
                this.f54012r = 1;
                if (gVar.e(strC, cVar, jA, arrayList, this) == objG) {
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
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54015r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f54016s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f54017t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.db.c f54018u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f54019v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List f54020w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, g gVar, com.moloco.sdk.acm.db.c cVar, long j10, List list, Continuation continuation) {
            super(2, continuation);
            this.f54016s = str;
            this.f54017t = gVar;
            this.f54018u = cVar;
            this.f54019v = j10;
            this.f54020w = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f54016s, this.f54017t, this.f54018u, this.f54019v, this.f54020w, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r2.a(r16) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = pf.b.g()
                int r2 = r1.f54015r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                kotlin.d.b(r17)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                goto Lae
            L15:
                r0 = move-exception
                goto L6f
            L17:
                r0 = move-exception
                goto L8f
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L22:
                kotlin.d.b(r17)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                goto L60
            L26:
                kotlin.d.b(r17)
                com.moloco.sdk.acm.db.b r5 = new com.moloco.sdk.acm.db.b     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                java.lang.String r8 = r1.f54016s     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.eventprocessing.g r2 = r1.f54017t     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.services.f r2 = com.moloco.sdk.acm.eventprocessing.g.h(r2)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                long r9 = r2.invoke()     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.db.c r11 = r1.f54018u     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                long r6 = r1.f54019v     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                java.lang.Long r12 = kotlin.coroutines.jvm.internal.b.e(r6)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                java.util.List r13 = r1.f54020w     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                r14 = 1
                r15 = 0
                r6 = 0
                r5.<init>(r6, r8, r9, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.eventprocessing.g r2 = r1.f54017t     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.db.d r2 = com.moloco.sdk.acm.eventprocessing.g.f(r2)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                r2.c(r5)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.eventprocessing.g r2 = r1.f54017t     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.eventprocessing.i r2 = com.moloco.sdk.acm.eventprocessing.g.g(r2)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                r1.f54015r = r4     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                java.lang.Object r2 = r2.b(r1)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                if (r2 != r0) goto L60
                goto L6e
            L60:
                com.moloco.sdk.acm.eventprocessing.g r2 = r1.f54017t     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                com.moloco.sdk.acm.services.b r2 = com.moloco.sdk.acm.eventprocessing.g.c(r2)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                r1.f54015r = r3     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                java.lang.Object r2 = r2.a(r1)     // Catch: java.lang.Exception -> L15 android.database.sqlite.SQLiteException -> L17
                if (r2 != r0) goto Lae
            L6e:
                return r0
            L6f:
                com.moloco.sdk.acm.services.d r2 = com.moloco.sdk.acm.services.d.f54105a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected error while processing event: "
                r3.append(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r4 = r3.toString()
                r6 = 4
                r7 = 0
                java.lang.String r3 = "EventProcessor"
                r5 = 0
                com.moloco.sdk.acm.services.d.f(r2, r3, r4, r5, r6, r7)
                goto Lae
            L8f:
                com.moloco.sdk.acm.services.d r2 = com.moloco.sdk.acm.services.d.f54105a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Database error: "
                r3.append(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r4 = r3.toString()
                r6 = 4
                r7 = 0
                java.lang.String r3 = "EventProcessor"
                r5 = 0
                com.moloco.sdk.acm.services.d.f(r2, r3, r4, r5, r6, r7)
            Lae:
                kotlin.Unit r0 = kotlin.Unit.f93236a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54021r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.f f54022s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f54023t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.f fVar, g gVar, Continuation continuation) {
            super(2, continuation);
            this.f54022s = fVar;
            this.f54023t = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f54022s, this.f54023t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
        
            if (r4.e(r5, r6, r7, r9, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
        
            if (r1.e(r3, r3, r5, r6, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(com.moloco.sdk.acm.db.d metricsDAO, com.moloco.sdk.acm.services.f timeProviderService, i requestScheduler, com.moloco.sdk.acm.services.b applicationLifecycle) {
        Intrinsics.checkNotNullParameter(metricsDAO, "metricsDAO");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(requestScheduler, "requestScheduler");
        Intrinsics.checkNotNullParameter(applicationLifecycle, "applicationLifecycle");
        this.f54008a = metricsDAO;
        this.f54009b = timeProviderService;
        this.f54010c = requestScheduler;
        this.f54011d = applicationLifecycle;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.f
    public Object a(com.moloco.sdk.acm.f fVar, Continuation continuation) {
        Object objG = eg.g.g(o0.b(), new d(fVar, this, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.f
    public Object b(com.moloco.sdk.acm.c cVar, Continuation continuation) {
        Object objG = eg.g.g(o0.b(), new b(cVar, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final Object e(String str, com.moloco.sdk.acm.db.c cVar, long j10, List list, Continuation continuation) {
        Object objG = eg.g.g(o0.b(), new c(str, this, cVar, j10, list, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
