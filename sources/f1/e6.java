package f1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cc f69701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f69702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f69703c;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f69704r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f69705s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f69706t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f69708v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f69706t = obj;
            this.f69708v |= Integer.MIN_VALUE;
            return e6.this.a(null, null, null, null, null, this);
        }
    }

    public e6(cc networkClient, m1 macroProcessor, z6 applicationComponent) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(macroProcessor, "macroProcessor");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f69701a = networkClient;
        this.f69702b = macroProcessor;
        this.f69703c = applicationComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, f1.t4 r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e6.a(java.lang.String, java.lang.String, java.lang.String, f1.t4, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ e6(cc ccVar, m1 m1Var, z6 z6Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ccVar, m1Var, (i10 & 4) != 0 ? rd.f70996b.a() : z6Var);
    }
}
