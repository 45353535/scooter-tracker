package io.bidmachine.analytics.internal.q;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.f;
import io.bidmachine.analytics.internal.n.a;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends io.bidmachine.analytics.internal.n.a implements io.bidmachine.analytics.internal.h.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f79857n = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g f79858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function1 f79859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f79860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.bidmachine.analytics.internal.q.b f79861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f79862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f79863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f79864m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79865a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.q.b invoke(Context context) {
            return new io.bidmachine.analytics.internal.q.b(context);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f79867b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f79869d;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f79867b = obj;
            this.f79869d |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    public /* synthetic */ f(g gVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? a.f79865a : function1);
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79864m;
    }

    @Override // io.bidmachine.analytics.internal.n.a
    public boolean c() {
        return this.f79863l;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
        this.f79860i = context;
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        super.e(context);
        io.bidmachine.analytics.internal.q.b bVar = this.f79861j;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        io.bidmachine.analytics.internal.q.b bVar = this.f79861j;
        if (bVar != null) {
            bVar.i();
        }
        super.f(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.bidmachine.analytics.internal.n.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(io.bidmachine.analytics.ReaderConfig.Rule r6, kotlin.coroutines.Continuation r7) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            boolean r6 = r7 instanceof io.bidmachine.analytics.internal.q.f.c
            if (r6 == 0) goto L13
            r6 = r7
            io.bidmachine.analytics.internal.q.f$c r6 = (io.bidmachine.analytics.internal.q.f.c) r6
            int r0 = r6.f79869d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f79869d = r0
            goto L18
        L13:
            io.bidmachine.analytics.internal.q.f$c r6 = new io.bidmachine.analytics.internal.q.f$c
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f79867b
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f79869d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r6 = r6.f79866a
            io.bidmachine.analytics.internal.q.f r6 = (io.bidmachine.analytics.internal.q.f) r6
            kotlin.d.b(r7)
            goto L56
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.d.b(r7)
            io.bidmachine.analytics.internal.q.b r7 = r5.f79861j
            if (r7 == 0) goto L8c
            kotlin.time.b$a r1 = kotlin.time.b.f93560c
            cg.b r1 = cg.b.f6839f
            r3 = 10
            long r3 = kotlin.time.c.s(r3, r1)
            long r3 = kotlin.time.b.q(r3)
            r6.f79866a = r5
            r6.f79869d = r2
            java.lang.Object r7 = r7.a(r3, r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            r6 = r5
        L56:
            io.bidmachine.analytics.internal.q.a r7 = (io.bidmachine.analytics.internal.q.a) r7
            io.bidmachine.analytics.internal.q.g r0 = r6.f79858g
            r0.a(r7)
            io.bidmachine.analytics.internal.q.e r6 = r6.f79862k
            if (r7 == 0) goto L6f
            if (r6 == 0) goto L6f
            r6.a()
            io.bidmachine.analytics.internal.r.b r0 = io.bidmachine.analytics.internal.r.b.f79881a
            java.util.List r0 = r0.a(r7)
            r6.a(r0)
        L6f:
            if (r7 == 0) goto L84
            boolean r6 = r7.f()
            if (r6 != 0) goto L7c
            java.lang.String r6 = r7.b()
            return r6
        L7c:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Data is empty"
            r6.<init>(r7)
            throw r6
        L84:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Data not received yet"
            r6.<init>(r7)
            throw r6
        L8c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Not configured"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.q.f.a(io.bidmachine.analytics.ReaderConfig$Rule, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public f(g gVar, Function1 function1) {
        this.f79858g = gVar;
        this.f79859h = function1;
        this.f79863l = true;
        this.f79864m = "apur";
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(a.C0956a c0956a) {
        super.b(c0956a);
        Context context = this.f79860i;
        if (context != null) {
            if (c0956a.c().size() == 1) {
                ReaderConfig.Rule rule = (ReaderConfig.Rule) CollectionsKt.first(c0956a.c());
                if (rule instanceof ReaderConfig.Rule.PurRule) {
                    ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
                    List listSplit$default = StringsKt.split$default(io.bidmachine.analytics.internal.a.e.b(purRule.getPath()), new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null);
                    if (listSplit$default.size() == 2) {
                        f.a aVar = io.bidmachine.analytics.internal.a.f.f79519d;
                        io.bidmachine.analytics.internal.a.f fVarA = aVar.a(StringsKt.v1((String) listSplit$default.get(0)).toString());
                        if (fVarA != null) {
                            io.bidmachine.analytics.internal.a.f fVarA2 = aVar.a(StringsKt.v1((String) listSplit$default.get(1)).toString());
                            if (fVarA2 != null) {
                                io.bidmachine.analytics.internal.q.b bVar = this.f79861j;
                                if (bVar == null) {
                                    bVar = (io.bidmachine.analytics.internal.q.b) this.f79859h.invoke(context);
                                }
                                this.f79861j = bVar;
                                io.bidmachine.analytics.internal.a.f fVarL = bVar.l();
                                if (fVarL != null) {
                                    if (fVarL.compareTo(fVarA) >= 0 && fVarL.compareTo(fVarA2) <= 0) {
                                        if (bVar.u()) {
                                            if (bVar.t()) {
                                                this.f79863l = purRule.getShouldReport();
                                                e eVar = this.f79862k;
                                                if (eVar != null) {
                                                    Result.a(eVar.b());
                                                }
                                                String query = purRule.getQuery();
                                                this.f79862k = query != null ? e.f79853c.a(query) : null;
                                                return;
                                            }
                                            throw new IllegalStateException("No permission");
                                        }
                                        throw new IllegalStateException("No host found");
                                    }
                                    throw new IllegalStateException(("Version " + fVarL + " not supported by config").toString());
                                }
                                throw new IllegalStateException("Version not found");
                            }
                            throw new IllegalStateException("Max version not found");
                        }
                        throw new IllegalStateException("Min version not found");
                    }
                    throw new IllegalStateException("Path should contains min and max value");
                }
                throw new IllegalStateException(("Reader " + a() + " accept only PurRule").toString());
            }
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + c0956a.c().size()).toString());
        }
        throw new IllegalArgumentException("Context is null");
    }

    @Override // io.bidmachine.analytics.internal.h.a
    public Object a(String str) {
        e eVar;
        if (!Intrinsics.areEqual(str, "iap") || (eVar = this.f79862k) == null) {
            return null;
        }
        Object objC = eVar.c();
        return (Boolean) (Result.i(objC) ? null : objC);
    }
}
