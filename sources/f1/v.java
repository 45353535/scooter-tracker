package f1;

import f1.lg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f71312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg.b f71313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f71314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f71315d;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71316r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f71317s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ v f71318t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, v vVar, Continuation continuation) {
            super(2, continuation);
            this.f71317s = j10;
            this.f71318t = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f71317s, this.f71318t, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f71316r
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.d.b(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
            L1a:
                long r3 = r5.f71317s
                r5.f71316r = r2
                java.lang.Object r6 = eg.k0.a(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                f1.v r6 = r5.f71318t
                f1.n0 r6 = f1.v.a(r6)
                if (r6 == 0) goto L1a
                f1.v r1 = r5.f71318t
                f1.lg$b r1 = f1.v.b(r1)
                long r3 = r1.a()
                r6.a(r3)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public v(n0 n0Var, lg.b videoProgress, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(videoProgress, "videoProgress");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f71312a = n0Var;
        this.f71313b = videoProgress;
        this.f71314c = coroutineDispatcher;
    }

    @Override // f1.lg
    public void a(long j10) {
        eg.e("startProgressUpdate()", null, 2, null);
        if (this.f71315d != null) {
            return;
        }
        this.f71315d = eg.i.d(kotlinx.coroutines.i.a(this.f71314c), null, null, new a(j10, this, null), 3, null);
    }

    public /* synthetic */ v(n0 n0Var, lg.b bVar, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : n0Var, bVar, (i10 & 4) != 0 ? eg.o0.c() : coroutineDispatcher);
    }

    @Override // f1.lg
    public void a() {
        eg.e("stopProgressUpdate()", null, 2, null);
        Job job = this.f71315d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f71315d = null;
    }
}
