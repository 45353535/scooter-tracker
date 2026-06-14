package f1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.chartboost.sdk.R$drawable;
import f1.d2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class i7 extends k6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d2 f70092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v5 f70093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zb f70094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineDispatcher f70095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x9 f70096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Job f70097k;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70098f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b7 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b7(it);
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ zb f70099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f70100g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zb zbVar, Context context) {
            super(2);
            this.f70099f = zbVar;
            this.f70100g = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b5 invoke(v5 cb2, Cif et) {
            Intrinsics.checkNotNullParameter(cb2, "cb");
            Intrinsics.checkNotNullParameter(et, "et");
            return new w7(this.f70099f, new ig(this.f70100g), cb2, et);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70101a;

        static {
            int[] iArr = new int[d2.b.values().length];
            try {
                iArr[d2.b.f69572d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d2.b.f69573e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d2.b.f69574f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d2.b.f69575g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f70101a = iArr;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70102r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ImageView f70104t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView imageView, Continuation continuation) {
            super(2, continuation);
            this.f70104t = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return i7.this.new d(this.f70104t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70102r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                x9 x9Var = i7.this.f70096j;
                String strB = i7.this.f70092f.b();
                this.f70102r = 1;
                obj = x9Var.a(strB, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f70104t.setImageBitmap(bitmap);
            }
            this.f70104t.setVisibility(0);
            return Unit.f93236a;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(Throwable th2) {
            i7.this.f70097k = null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(Context context, String baseUrl, String html, d2 infoIcon, Cif eventTracker, v5 callback, zb impressionInterface, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory, x9 cbImageDownloader) {
        super(context, html, callback, impressionInterface, baseUrl, eventTracker, cbWebViewFactory, null, new b(impressionInterface, context), 128, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.f70092f = infoIcon;
        this.f70093g = callback;
        this.f70094h = impressionInterface;
        this.f70095i = dispatcher;
        this.f70096j = cbImageDownloader;
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    public static final void e(i7 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f70094h.h(new n2(this$0.f70092f.a(), Boolean.FALSE));
    }

    @Override // f1.v4
    public void a() {
        Job job = this.f70097k;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f70097k = null;
        super.a();
    }

    public final int b(double d10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            d10 *= (double) displayMetrics.density;
        }
        return zf.a.c(d10);
    }

    public final void d(RelativeLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b(this.f70092f.e().b()), b(this.f70092f.e().a()));
        int i10 = c.f70101a[this.f70092f.d().ordinal()];
        if (i10 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else if (i10 == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else if (i10 == 4) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        layoutParams.setMargins(b(this.f70092f.c().b()), b(this.f70092f.c().a()), b(this.f70092f.c().b()), b(this.f70092f.c().a()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R$drawable.f17909b);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: f1.h7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i7.e(this.f70005b, view);
            }
        });
        imageView.setVisibility(8);
        Job jobD = eg.i.d(kotlinx.coroutines.i.a(this.f70095i), null, null, new d(imageView, null), 3, null);
        jobD.q(new e());
        this.f70097k = jobD;
        container.addView(imageView, layoutParams);
        this.f70093g.a(imageView);
    }

    public /* synthetic */ i7(Context context, String str, String str2, d2 d2Var, Cif cif, v5 v5Var, zb zbVar, CoroutineDispatcher coroutineDispatcher, Function1 function1, x9 x9Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, d2Var, cif, v5Var, zbVar, (i10 & 128) != 0 ? eg.o0.c() : coroutineDispatcher, (i10 & 256) != 0 ? a.f70098f : function1, (i10 & 512) != 0 ? new x9(null, null, null, 7, null) : x9Var);
    }
}
