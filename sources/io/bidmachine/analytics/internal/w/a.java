package io.bidmachine.analytics.internal.w;

import eg.g;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.internal.a.d;
import io.bidmachine.analytics.internal.b.AbstractC5634b;
import io.bidmachine.analytics.internal.b.C5633a;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0972a f79969e = new C0972a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.w.c f79970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f79972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5633a f79973d;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.w.a$a, reason: collision with other inner class name */
    public static final class C0972a {
        public /* synthetic */ C0972a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0972a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f79974a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f79976c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f79974a = obj;
            this.f79976c |= Integer.MIN_VALUE;
            Object objA = a.this.a(this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79977a;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.w.a$c$a, reason: collision with other inner class name */
        static final class C0973a extends k implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f79979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f79980b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0973a(a aVar, Continuation continuation) {
                super(2, continuation);
                this.f79980b = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0973a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0973a(this.f79980b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f79979a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                a aVar = this.f79980b;
                return aVar.a(aVar.f79973d, this.f79980b.b());
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f79977a;
            try {
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        if (a.this.f79973d == null) {
                            Result.Companion companion = Result.f93230c;
                            return Result.a(Result.b(a.this.a()));
                        }
                        CoroutineDispatcher coroutineDispatcherB = a.this.f79972c.b();
                        C0973a c0973a = new C0973a(a.this, null);
                        this.f79977a = 1;
                        obj = g.g(coroutineDispatcherB, c0973a, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    byte[] bArr = (byte[]) obj;
                    a aVar = a.this;
                    aVar.a(aVar.f79971b, bArr);
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(a.this.a());
                } catch (Throwable unused) {
                    Result.Companion companion3 = Result.f93230c;
                    return Result.a(Result.b(a.this.a()));
                }
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            return Result.a(objB);
        }
    }

    public a(io.bidmachine.analytics.internal.w.c cVar, String str, d dVar, C5633a c5633a) {
        this.f79970a = cVar;
        this.f79971b = str;
        this.f79972c = dVar;
        this.f79973d = c5633a;
    }

    public abstract a a();

    public abstract byte[] b();

    private final int b(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.bidmachine.analytics.internal.w.a.b
            if (r0 == 0) goto L13
            r0 = r6
            io.bidmachine.analytics.internal.w.a$b r0 = (io.bidmachine.analytics.internal.w.a.b) r0
            int r1 = r0.f79976c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79976c = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.w.a$b r0 = new io.bidmachine.analytics.internal.w.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79974a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f79976c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.d.b(r6)
            io.bidmachine.analytics.internal.a.d r6 = r5.f79972c
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.c()
            io.bidmachine.analytics.internal.w.a$c r2 = new io.bidmachine.analytics.internal.w.a$c
            r4 = 0
            r2.<init>(r4)
            r0.f79976c = r3
            java.lang.Object r6 = eg.g.g(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.w.a.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(C5633a c5633a, byte[] bArr) {
        if (bArr != null) {
            return AbstractC5634b.a(bArr, c5633a);
        }
        return null;
    }

    public /* synthetic */ a(io.bidmachine.analytics.internal.w.c cVar, String str, d dVar, C5633a c5633a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, dVar, (i10 & 8) != 0 ? BidMachineAnalytics.INSTANCE.getEncryptionManager$bidmachine_android_sdk_bg_3_5_0() : c5633a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:4:0x0011, B:6:0x0027, B:10:0x0040, B:13:0x0044, B:16:0x0054, B:21:0x0061, B:23:0x006a, B:24:0x0071, B:25:0x0072, B:35:0x008a, B:44:0x00a3, B:45:0x00bd, B:37:0x008e, B:39:0x0096, B:41:0x009c), top: B:53:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r5, byte[] r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.w.a.a(java.lang.String, byte[]):void");
    }

    private final Object a(URLConnection uRLConnection) {
        try {
            Result.Companion companion = Result.f93230c;
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }
}
