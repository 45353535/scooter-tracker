package io.bidmachine.analytics.internal.v;

import com.explorestack.protobuf.Struct;
import eg.e0;
import eg.m1;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.y.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f79945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.D.c f79946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f79947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineScope f79948d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReaderConfig f79949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Struct f79951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a.InterfaceC0974a f79952d;

        public a(ReaderConfig readerConfig, String str, Struct struct, a.InterfaceC0974a interfaceC0974a) {
            this.f79949a = readerConfig;
            this.f79950b = str;
            this.f79951c = struct;
            this.f79952d = interfaceC0974a;
        }

        public final a.InterfaceC0974a a() {
            return this.f79952d;
        }

        public final Struct b() {
            return this.f79951c;
        }

        public final ReaderConfig c() {
            return this.f79949a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f79954b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f79956d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f79954b = obj;
            this.f79956d |= Integer.MIN_VALUE;
            Object objA = c.this.a((String) null, this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.c$c, reason: collision with other inner class name */
    static final class C0971c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f79958b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f79960d;

        C0971c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f79958b = obj;
            this.f79960d |= Integer.MIN_VALUE;
            return c.this.a((List) null, this);
        }
    }

    static final class d extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79961a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f79963c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, Continuation continuation) {
            super(2, continuation);
            this.f79963c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new d(this.f79963c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objG = pf.b.g();
            int i10 = this.f79961a;
            if (i10 == 0) {
                kotlin.d.b(obj);
                io.bidmachine.analytics.internal.y.a aVar = new io.bidmachine.analytics.internal.y.a(c.this.f79945a.c().getUrl(), c.this.f79945a.c().getName(), c.this.f79945a.b(), this.f79963c, c.this.f79945a.a(), null, 32, null);
                this.f79961a = 1;
                objA = aVar.a(this);
                if (objA == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objA = ((Result) obj).l();
            }
            c cVar = c.this;
            List list = this.f79963c;
            if (Result.j(objA)) {
                io.bidmachine.analytics.internal.D.c cVar2 = cVar.f79946b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((io.bidmachine.analytics.internal.g.c) obj2).b() != null) {
                        arrayList.add(obj2);
                    }
                }
                cVar2.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((io.bidmachine.analytics.internal.g.c) obj3).b() == null) {
                        arrayList2.add(obj3);
                    }
                }
                cVar.f79946b.c(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    cVar.a((io.bidmachine.analytics.internal.g.c) it.next());
                }
            }
            c cVar3 = c.this;
            List list2 = this.f79963c;
            if (Result.g(objA) != null) {
                cVar3.f79946b.c(list2);
            }
            return Result.a(objA);
        }
    }

    static final class e extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f79965b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f79967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f79968e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, List list, Continuation continuation) {
            super(2, continuation);
            this.f79967d = str;
            this.f79968e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new e(this.f79967d, this.f79968e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        
            if (r10.a(r1, r9) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r9.f79965b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.d.b(r10)
                goto L9e
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                java.lang.Object r1 = r9.f79964a
                java.util.List r1 = (java.util.List) r1
                kotlin.d.b(r10)
                kotlin.Result r10 = (kotlin.Result) r10
                r10.l()
                goto L8a
            L28:
                kotlin.d.b(r10)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                io.bidmachine.analytics.internal.v.c r10 = io.bidmachine.analytics.internal.v.c.this
                java.lang.String r4 = r9.f79967d
                java.util.List r5 = r9.f79968e
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L3f:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L56
                java.lang.Object r7 = r5.next()
                r8 = r7
                io.bidmachine.analytics.internal.g.c r8 = (io.bidmachine.analytics.internal.g.c) r8
                io.bidmachine.analytics.internal.g.e r8 = r8.b()
                if (r8 == 0) goto L3f
                r6.add(r7)
                goto L3f
            L56:
                io.bidmachine.analytics.internal.v.c.a(r10, r4, r6)
                java.util.List r10 = r9.f79968e
                io.bidmachine.analytics.internal.v.c r4 = io.bidmachine.analytics.internal.v.c.this
                java.util.Iterator r10 = r10.iterator()
            L61:
                boolean r5 = r10.hasNext()
                if (r5 == 0) goto L7b
                java.lang.Object r5 = r10.next()
                io.bidmachine.analytics.internal.g.c r5 = (io.bidmachine.analytics.internal.g.c) r5
                java.lang.Object r6 = io.bidmachine.analytics.internal.v.c.a(r4, r5)
                boolean r6 = kotlin.Result.i(r6)
                if (r6 == 0) goto L61
                r1.add(r5)
                goto L61
            L7b:
                io.bidmachine.analytics.internal.v.c r10 = io.bidmachine.analytics.internal.v.c.this
                java.lang.String r4 = r9.f79967d
                r9.f79964a = r1
                r9.f79965b = r3
                java.lang.Object r10 = io.bidmachine.analytics.internal.v.c.a(r10, r4, r9)
                if (r10 != r0) goto L8a
                goto L9d
            L8a:
                boolean r10 = r1.isEmpty()
                if (r10 != 0) goto L9e
                io.bidmachine.analytics.internal.v.c r10 = io.bidmachine.analytics.internal.v.c.this
                r3 = 0
                r9.f79964a = r3
                r9.f79965b = r2
                java.lang.Object r10 = io.bidmachine.analytics.internal.v.c.a(r10, r1, r9)
                if (r10 != r0) goto L9e
            L9d:
                return r0
            L9e:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(io.bidmachine.analytics.internal.a.d dVar, a aVar, io.bidmachine.analytics.internal.D.c cVar) {
        this.f79945a = aVar;
        this.f79946b = cVar;
        this.f79947c = aVar.c().getName();
        this.f79948d = i.a(new e0("AnalyticsMonitor: " + aVar.c().getName()).plus(m1.b(null, 1, null)).plus(dVar.c()));
    }

    public final void b(String str, List list) {
        eg.i.d(this.f79948d, null, null, new e(str, list, null), 3, null);
    }

    public final String a() {
        return this.f79947c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, List list) {
        try {
            Result.Companion companion = Result.f93230c;
            io.bidmachine.analytics.internal.D.c cVar = this.f79946b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((io.bidmachine.analytics.internal.g.c) it.next()).e());
            }
            return Result.b(Result.a(cVar.a(str, arrayList)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.bidmachine.analytics.internal.v.c.b
            if (r0 == 0) goto L13
            r0 = r6
            io.bidmachine.analytics.internal.v.c$b r0 = (io.bidmachine.analytics.internal.v.c.b) r0
            int r1 = r0.f79956d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79956d = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.v.c$b r0 = new io.bidmachine.analytics.internal.v.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79954b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f79956d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f79953a
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L2b:
            r5 = move-exception
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L2b
            io.bidmachine.analytics.internal.D.c r6 = r4.f79946b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L2b
            boolean r6 = kotlin.Result.j(r5)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L5a
            r6 = r5
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L5a
            r0.f79953a = r5     // Catch: java.lang.Throwable -> L2b
            r0.f79956d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r4.a(r6, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L5a
            return r1
        L5a:
            kotlin.Result r5 = kotlin.Result.a(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L2b
            return r5
        L63:
            kotlin.Result$Companion r6 = kotlin.Result.f93230c
            java.lang.Object r5 = kotlin.d.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.c.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.analytics.internal.g.c cVar) {
        try {
            Result.Companion companion = Result.f93230c;
            if (cVar.b() != null) {
                return this.f79946b.a(cVar);
            }
            Object objA = this.f79946b.a(cVar.d(), cVar.e());
            if (Result.i(objA)) {
                objA = null;
            }
            io.bidmachine.analytics.internal.g.c cVar2 = (io.bidmachine.analytics.internal.g.c) objA;
            if (cVar2 == null) {
                return this.f79946b.a(cVar);
            }
            return this.f79946b.b(io.bidmachine.analytics.internal.g.c.a(cVar, cVar2.c(), null, 0L, null, null, null, (this.f79945a.c().getUniqueOnly() && Intrinsics.areEqual(cVar.a(), cVar2.a())) ? false : true, 62, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.bidmachine.analytics.internal.v.c.C0971c
            if (r0 == 0) goto L13
            r0 = r12
            io.bidmachine.analytics.internal.v.c$c r0 = (io.bidmachine.analytics.internal.v.c.C0971c) r0
            int r1 = r0.f79960d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79960d = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.v.c$c r0 = new io.bidmachine.analytics.internal.v.c$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f79958b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f79960d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r12)
            goto L5e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.d.b(r12)
            io.bidmachine.analytics.internal.D.c r12 = r10.f79946b
            java.lang.Object r12 = r12.a(r11)
            boolean r2 = kotlin.Result.j(r12)
            if (r2 == 0) goto L5e
            r2 = r12
            kotlin.Unit r2 = (kotlin.Unit) r2
            kotlinx.coroutines.CoroutineScope r4 = r10.f79948d
            io.bidmachine.analytics.internal.v.c$d r7 = new io.bidmachine.analytics.internal.v.c$d
            r2 = 0
            r7.<init>(r11, r2)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.Deferred r11 = eg.g.b(r4, r5, r6, r7, r8, r9)
            r0.f79957a = r12
            r0.f79960d = r3
            java.lang.Object r11 = r11.await(r0)
            if (r11 != r1) goto L5e
            return r1
        L5e:
            kotlin.Unit r11 = kotlin.Unit.f93236a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.c.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
