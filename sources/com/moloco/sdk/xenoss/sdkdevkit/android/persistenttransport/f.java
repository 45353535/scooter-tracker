package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.util.Patterns;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import ve.c0;
import ve.u;
import ve.y;
import ve.z;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f58944r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58945s;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58944r = obj;
            this.f58945s |= Integer.MIN_VALUE;
            return f.a(null, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58946r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ie.c f58947s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f58948t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ie.c cVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f58947s = cVar;
            this.f58948t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f58947s, this.f58948t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58946r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ie.c cVar = this.f58947s;
                String str = this.f58948t;
                re.d dVar = new re.d();
                re.f.c(dVar, str);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.c.b(dVar, 5000L);
                dVar.o(z.f106771b.b());
                se.g gVar = new se.g(dVar, cVar);
                this.f58946r = 1;
                obj = gVar.b(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            c0 c0VarD = ((se.c) obj).d();
            c0.a aVar = c0.f106561d;
            return kotlin.coroutines.jvm.internal.b.a(c0VarD.compareTo(aVar.B()) >= 0 && c0VarD.compareTo(aVar.d()) < 0);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f58949r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58950s;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58949r = obj;
            this.f58950s |= Integer.MIN_VALUE;
            return f.b(null, null, null, null, null, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58951r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ie.c f58952s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f58953t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f58954u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ byte[] f58955v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ve.g f58956w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ie.c cVar, String str, String str2, byte[] bArr, ve.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f58952s = cVar;
            this.f58953t = str;
            this.f58954u = str2;
            this.f58955v = bArr;
            this.f58956w = gVar;
        }

        public static final Unit c(String str, ve.p pVar) {
            pVar.e(u.f106718a.f(), str);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f58952s, this.f58953t, this.f58954u, this.f58955v, this.f58956w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58951r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ie.c cVar = this.f58952s;
                String str = this.f58953t;
                final String str2 = this.f58954u;
                byte[] bArr = this.f58955v;
                ve.g gVar = this.f58956w;
                re.d dVar = new re.d();
                dVar.o(z.f106771b.e());
                re.f.c(dVar, str);
                if (str2 != null && (!StringsKt.y0(str2))) {
                    re.f.b(dVar, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return f.d.c(str2, (ve.p) obj2);
                        }
                    });
                }
                KType kTypeO = null;
                if (bArr == null) {
                    dVar.j(ye.b.f118925a);
                    KClass kClassB = v0.b(byte[].class);
                    try {
                        kTypeO = v0.o(byte[].class);
                    } catch (Throwable unused) {
                    }
                    dVar.k(new ff.a(kClassB, kTypeO));
                } else if (bArr instanceof ye.c) {
                    dVar.j(bArr);
                    dVar.k(null);
                } else {
                    dVar.j(bArr);
                    KClass kClassB2 = v0.b(byte[].class);
                    try {
                        kTypeO = v0.o(byte[].class);
                    } catch (Throwable unused2) {
                    }
                    dVar.k(new ff.a(kClassB2, kTypeO));
                }
                y.e(dVar, gVar);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.c.b(dVar, 5000L);
                dVar.o(z.f106771b.e());
                se.g gVar2 = new se.g(dVar, cVar);
                this.f58951r = 1;
                obj = gVar2.b(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            c0 c0VarD = ((se.c) obj).d();
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "HttpClient", "Response status: " + c0VarD + " for url: " + this.f58953t, false, 4, null);
            c0.a aVar = c0.f106561d;
            return kotlin.coroutines.jvm.internal.b.a(c0VarD.compareTo(aVar.B()) >= 0 && c0VarD.compareTo(aVar.d()) < 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ie.c r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a) r0
            int r1 = r0.f58945s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58945s = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58944r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58945s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)     // Catch: java.lang.Exception -> L52
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r7)
            com.moloco.sdk.internal.scheduling.a r7 = com.moloco.sdk.internal.scheduling.c.a()     // Catch: java.lang.Exception -> L52
            kotlin.coroutines.CoroutineContext r7 = r7.getIo()     // Catch: java.lang.Exception -> L52
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$b     // Catch: java.lang.Exception -> L52
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L52
            r0.f58945s = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r7 = eg.g.g(r7, r2, r0)     // Catch: java.lang.Exception -> L52
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L52
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Exception -> L52
            goto L53
        L52:
            r5 = 0
        L53:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(ie.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ie.c r12, java.lang.String r13, byte[] r14, ve.g r15, java.lang.String r16, kotlin.coroutines.Continuation r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.c
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$c r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.c) r1
            int r2 = r1.f58950s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f58950s = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$c r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f58949r
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.f58950s
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.d.b(r0)     // Catch: java.lang.Exception -> L5a
            goto L53
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.d.b(r0)
            com.moloco.sdk.internal.scheduling.a r0 = com.moloco.sdk.internal.scheduling.c.a()     // Catch: java.lang.Exception -> L5a
            kotlin.coroutines.CoroutineContext r0 = r0.getIo()     // Catch: java.lang.Exception -> L5a
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$d r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$d     // Catch: java.lang.Exception -> L5a
            r11 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r10 = r15
            r8 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L5a
            r1.f58950s = r4     // Catch: java.lang.Exception -> L5a
            java.lang.Object r0 = eg.g.g(r0, r5, r1)     // Catch: java.lang.Exception -> L5a
            if (r0 != r2) goto L53
            return r2
        L53:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L5a
            boolean r12 = r0.booleanValue()     // Catch: java.lang.Exception -> L5a
            goto L5b
        L5a:
            r12 = 0
        L5b:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.b(ie.c, java.lang.String, byte[], ve.g, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(ie.c cVar, String str, byte[] bArr, ve.g gVar, String str2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return b(cVar, str, bArr, gVar, str2, continuation);
    }

    public static final boolean d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean zMatches = Patterns.WEB_URL.matcher(str).matches();
        if (!zMatches) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpRequestClient", "URL is invalid. " + str, null, false, 12, null);
        }
        return zMatches;
    }
}
