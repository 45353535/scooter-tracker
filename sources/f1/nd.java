package f1;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import eg.c0;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class nd {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f70659r = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f70660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f70661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f70664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f70665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f70666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f70667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f70668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Job f70669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f70670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f70671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f70672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Long f70673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f70674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Long f70675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f70676q;

    public static final class a {
        public a() {
        }

        public final View a(Context context, View view) {
            View rootView;
            Window window;
            View decorView;
            View viewFindViewById;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.content)) != null) {
                return viewFindViewById;
            }
            View viewFindViewById2 = (view == null || (rootView = view.getRootView()) == null) ? null : rootView.findViewById(R.id.content);
            if (viewFindViewById2 != null) {
                return viewFindViewById2;
            }
            if (view != null) {
                return view.getRootView();
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface b {
        void a();
    }

    public static final class c extends kotlin.coroutines.a implements eg.c0 {
        public c(c0.b bVar) {
            super(bVar);
        }

        @Override // eg.c0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            eg.e("Visibility check ran into a problem: " + th2, null, 2, null);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70677r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f70678s;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f70680r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ nd f70681s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(nd ndVar, Continuation continuation) {
                super(2, continuation);
                this.f70681s = ndVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f70681s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f70680r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    long j10 = this.f70681s.f70664e;
                    this.f70680r = 1;
                    if (eg.k0.a(j10, this) == objG) {
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

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = nd.this.new d(continuation);
            dVar.f70678s = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineDispatcher coroutineDispatcherB;
            a aVar;
            Object objG = pf.b.g();
            int i10 = this.f70677r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                coroutineScope = (CoroutineScope) this.f70678s;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f70678s;
                kotlin.d.b(obj);
            }
            do {
                if (kotlinx.coroutines.i.i(coroutineScope) && (!nd.this.f70672m || (nd.this.f70666g && !nd.this.f70674o))) {
                    if (!nd.this.f70672m && nd.this.q()) {
                        nd ndVar = nd.this;
                        Long lE = ndVar.f70673n;
                        if (lE == null) {
                            lE = kotlin.coroutines.jvm.internal.b.e(SystemClock.uptimeMillis());
                        }
                        ndVar.f70673n = lE;
                        if (nd.this.m()) {
                            nd.this.f70672m = true;
                            if (!nd.this.f70666g || nd.this.f70674o) {
                                b bVarL = nd.this.l();
                                if (bVarL != null) {
                                    bVarL.a();
                                }
                            }
                        }
                    } else if (!nd.this.f70672m) {
                        nd.this.f70673n = null;
                    }
                    if (nd.this.f70666g && !nd.this.f70674o) {
                        if (!nd.this.o()) {
                            nd.this.f70675p = null;
                        } else if (nd.this.f70675p == null) {
                            nd.this.f70675p = kotlin.coroutines.jvm.internal.b.e(SystemClock.uptimeMillis());
                        } else {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Long l10 = nd.this.f70675p;
                            Intrinsics.checkNotNull(l10);
                            if (jUptimeMillis - l10.longValue() >= 2000) {
                                nd.this.f70674o = true;
                                if (nd.this.f70672m) {
                                    b bVarL2 = nd.this.l();
                                    if (bVarL2 != null) {
                                        bVarL2.a();
                                    }
                                }
                            }
                        }
                    }
                    coroutineDispatcherB = eg.o0.b();
                    aVar = new a(nd.this, null);
                    this.f70678s = coroutineScope;
                    this.f70677r = 1;
                }
                return Unit.f93236a;
            } while (eg.g.g(coroutineDispatcherB, aVar, this) != objG);
            return objG;
        }
    }

    public nd(Context context, View trackedView, View rootView, int i10, int i11, long j10, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f70660a = trackedView;
        this.f70661b = rootView;
        this.f70662c = i10;
        this.f70663d = i11;
        this.f70664e = j10;
        this.f70665f = i12;
        this.f70666g = z10;
        this.f70668i = new WeakReference(context instanceof Activity ? (Activity) context : null);
        this.f70670k = new WeakReference(null);
        this.f70671l = new ViewTreeObserver.OnPreDrawListener() { // from class: f1.md
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return nd.y(this.f70492b);
            }
        };
        this.f70676q = new Rect();
    }

    public static final boolean y(nd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s();
        return true;
    }

    public final int a(int i10, Context context) {
        return zf.a.d(i10 * context.getResources().getDisplayMetrics().density);
    }

    public final void c() {
        Job job = this.f70669j;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f70669j = null;
    }

    public final void d(b bVar) {
        this.f70667h = bVar;
    }

    public final void h() {
        c();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f70670k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f70671l);
        }
        this.f70670k.clear();
        this.f70667h = null;
    }

    public final b l() {
        return this.f70667h;
    }

    public final boolean m() {
        Long l10 = this.f70673n;
        if (l10 != null) {
            return SystemClock.uptimeMillis() - l10.longValue() >= ((long) this.f70663d);
        }
        return false;
    }

    public final boolean o() {
        if (this.f70660a.getVisibility() != 0 || this.f70661b.getParent() == null || this.f70660a.getWidth() <= 0 || this.f70660a.getHeight() <= 0 || !this.f70660a.getGlobalVisibleRect(this.f70676q)) {
            return false;
        }
        return ((float) (this.f70676q.width() * this.f70676q.height())) / ((float) (this.f70660a.getWidth() * this.f70660a.getHeight())) >= 0.5f;
    }

    public final boolean q() {
        if (this.f70660a.getVisibility() == 0 && this.f70661b.getParent() != null && this.f70660a.getWidth() > 0 && this.f70660a.getHeight() > 0) {
            int i10 = 0;
            for (ViewParent parent = this.f70660a.getParent(); parent != null && i10 < this.f70665f; parent = parent.getParent()) {
                if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                    return false;
                }
                i10++;
            }
            if (!this.f70660a.getGlobalVisibleRect(this.f70676q)) {
                return false;
            }
            int iWidth = this.f70676q.width();
            Context context = this.f70660a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iA = a(iWidth, context);
            int iHeight = this.f70676q.height();
            Context context2 = this.f70660a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (iA * a(iHeight, context2) >= this.f70662c) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        if (this.f70669j != null) {
            return;
        }
        this.f70669j = eg.i.d(kotlinx.coroutines.i.a(eg.o0.c()), new c(eg.c0.J8), null, new d(null), 2, null);
    }

    public final void u() {
        try {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f70670k.get();
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    return;
                }
            }
        } catch (Exception unused) {
            eg.e("Exception when accessing view tree observer.", null, 2, null);
        }
        View viewA = f70659r.a((Context) this.f70668i.get(), this.f70660a);
        ViewTreeObserver viewTreeObserver2 = viewA != null ? viewA.getViewTreeObserver() : null;
        if (viewTreeObserver2 == null) {
            return;
        }
        if (!viewTreeObserver2.isAlive()) {
            eg.j("Unable to set ViewTreeObserver since it is not alive", null, 2, null);
        } else {
            this.f70670k = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.f70671l);
        }
    }

    public final void w() {
        u();
    }

    public /* synthetic */ nd(Context context, View view, View view2, int i10, int i11, long j10, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view, view2, i10, i11, j10, i12, (i13 & 128) != 0 ? false : z10);
    }
}
