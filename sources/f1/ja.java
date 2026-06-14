package f1;

import com.taurusx.tax.ui.CircularProgressBar;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f70170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f70171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f70172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f70173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f70175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Job f70176g;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f70177b = new a();

        public a() {
            super(3, xa.class, "createRandomAccessFile", "createRandomAccessFile(Lcom/chartboost/sdk/internal/video/VideoAsset;Lcom/chartboost/sdk/internal/video/TempFileDownloadHelper;Lcom/chartboost/sdk/internal/Libraries/FileCache;)Lcom/chartboost/sdk/internal/utils/RandomAccessFileWrapper;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g8 invoke(c9 p02, s6 p12, m mVar) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return xa.b(p02, p12, mVar);
        }
    }

    public interface b {
        void d();
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70178r;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ja.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70178r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                this.f70178r = 1;
                if (eg.k0.a(CircularProgressBar.E, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            ja.this.d();
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function3 f70180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c9 f70181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ s6 f70182h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ m f70183i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function3 function3, c9 c9Var, s6 s6Var, m mVar) {
            super(0);
            this.f70180f = function3;
            this.f70181g = c9Var;
            this.f70182h = s6Var;
            this.f70183i = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final g8 invoke() {
            return (g8) this.f70180f.invoke(this.f70181g, this.f70182h, this.f70183i);
        }
    }

    public ja(c9 videoAsset, b listener, float f10, s6 tempHelper, m mVar, CoroutineDispatcher coroutineDispatcher, Function3 randomAccessFileFactory) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(randomAccessFileFactory, "randomAccessFileFactory");
        this.f70170a = listener;
        this.f70171b = f10;
        this.f70172c = coroutineDispatcher;
        this.f70173d = lf.i.a(new d(randomAccessFileFactory, videoAsset, tempHelper, mVar));
        this.f70174e = videoAsset.d();
    }

    public final void a() {
        if (this.f70175f == 0) {
            g8 g8VarF = f();
            this.f70175f = g8VarF != null ? g8VarF.c() : 0L;
        }
    }

    public final void b(int i10) {
        long j10 = this.f70174e;
        if (j10 <= 0 || i10 <= 0) {
            return;
        }
        float f10 = j10 / 1000000.0f;
        this.f70171b = ((f10 / 1000.0f) / ((i10 / 60000.0f) * 0.0075f)) / (f10 * 8);
    }

    public final void d() {
        g8 g8VarF = f();
        long jC = g8VarF != null ? g8VarF.c() : 0L;
        long j10 = this.f70174e;
        if (jC == j10) {
            h();
        } else if ((jC - this.f70175f) / j10 > this.f70171b) {
            h();
        } else {
            e();
        }
    }

    public final void e() {
        this.f70176g = eg.i.d(kotlinx.coroutines.i.a(this.f70172c), null, null, new c(null), 3, null);
    }

    public final g8 f() {
        return (g8) this.f70173d.getValue();
    }

    public final void g() {
        Job job = this.f70176g;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f70176g = null;
    }

    public final void h() {
        this.f70175f = 0L;
        g();
        this.f70170a.d();
    }

    public /* synthetic */ ja(c9 c9Var, b bVar, float f10, s6 s6Var, m mVar, CoroutineDispatcher coroutineDispatcher, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c9Var, bVar, (i10 & 4) != 0 ? 0.01f : f10, (i10 & 8) != 0 ? new s6() : s6Var, mVar, (i10 & 32) != 0 ? eg.o0.c() : coroutineDispatcher, (i10 & 64) != 0 ? a.f70177b : function3);
    }
}
