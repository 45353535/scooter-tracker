package f1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$drawable;
import com.chartboost.sdk.R$string;
import com.google.android.material.imageview.ShapeableImageView;
import java.net.URL;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class jb extends f1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f70184o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f70185p = R$drawable.f17913f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f70186q = Color.parseColor("#4C6EF5");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Typeface f70187r = Typeface.DEFAULT_BOLD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f70189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineDispatcher f70190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x9 f70191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f70192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f70193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Button f70194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Job f70195n;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70196r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f70197s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ URL f70199u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URL url, Continuation continuation) {
            super(2, continuation);
            this.f70199u = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = jb.this.new b(this.f70199u, continuation);
            bVar.f70197s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            Object objG = pf.b.g();
            int i10 = this.f70196r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f70197s;
                x9 x9Var = jb.this.f70191j;
                String string = this.f70199u.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.f70197s = coroutineScope;
                this.f70196r = 1;
                obj = x9Var.a(string, this);
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
                jb jbVar = jb.this;
                jbVar.getIconView().setImageBitmap(bitmap);
                jbVar.getIconView().setVisibility(0);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                jb.this.getIconView().setVisibility(8);
            }
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(Throwable th2) {
            jb.this.setAppIconDownloadJob(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(Context context, AttributeSet attributeSet, int i10, String persistentCtaContentDescription, String openButtonContentDescription, CoroutineDispatcher dispatcher, x9 cbImageDownloader, final Function0 function0) {
        super(context, attributeSet, i10, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        Intrinsics.checkNotNullParameter(openButtonContentDescription, "openButtonContentDescription");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbImageDownloader, "cbImageDownloader");
        this.f70188g = persistentCtaContentDescription;
        this.f70189h = openButtonContentDescription;
        this.f70190i = dispatcher;
        this.f70191j = cbImageDownloader;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, b(84)));
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setId(View.generateViewId());
        shapeableImageView.setLayoutParams(new ConstraintLayout.LayoutParams(b(48), b(48)));
        shapeableImageView.setImageResource(f70185p);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setImportantForAccessibility(2);
        shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCorners(0, b(12)).build());
        this.f70192k = shapeableImageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.matchConstraintMinWidth = b(100);
        textView.setLayoutParams(layoutParams);
        textView.setText("App Name");
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setTypeface(f70187r);
        textView.setGravity(16);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        this.f70193l = textView;
        Button button = new Button(context);
        button.setId(View.generateViewId());
        button.setLayoutParams(new ConstraintLayout.LayoutParams(-2, b(44)));
        button.setText("Get");
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setGravity(17);
        button.setMinWidth(b(80));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(b(8));
        gradientDrawable.setColor(f70186q);
        button.setBackground(gradientDrawable);
        button.setPadding(b(16), 0, b(16), 0);
        button.setContentDescription(openButtonContentDescription);
        button.setFocusable(true);
        button.setClickable(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: f1.ib
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jb.h(function0, view);
            }
        });
        this.f70194m = button;
        setContentDescription(persistentCtaContentDescription);
        addView(shapeableImageView);
        addView(textView);
        addView(button);
        i();
    }

    public static final void h(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // f1.f1
    public void e(m4 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.a();
        setTitle(null);
        setIcon((URL) null);
        setOpenText(null);
        i();
    }

    @Override // f1.f1
    public void f(d9 tracker, t7 purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f70192k, purpose);
        tracker.a(this.f70193l, purpose);
        tracker.a(this.f70194m, purpose);
    }

    @VisibleForTesting(otherwise = 2)
    @Nullable
    public final Job getAppIconDownloadJob() {
        return this.f70195n;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final ImageView getIconView() {
        return this.f70192k;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final Button getOpenButton() {
        return this.f70194m;
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final TextView getTitleText() {
        return this.f70193l;
    }

    public final void i() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(this.f70194m.getId(), 3);
        constraintSet.clear(this.f70194m.getId(), 4);
        constraintSet.connect(this.f70194m.getId(), 3, 0, 3);
        constraintSet.connect(this.f70194m.getId(), 4, 0, 4);
        constraintSet.clear(this.f70194m.getId(), 1);
        constraintSet.clear(this.f70194m.getId(), 2);
        if (this.f70192k.getVisibility() == 0) {
            constraintSet.clear(this.f70192k.getId(), 3);
            constraintSet.clear(this.f70192k.getId(), 4);
            constraintSet.clear(this.f70192k.getId(), 1);
            constraintSet.clear(this.f70192k.getId(), 2);
            constraintSet.connect(this.f70192k.getId(), 1, 0, 1);
            constraintSet.connect(this.f70192k.getId(), 3, 0, 3);
            constraintSet.connect(this.f70192k.getId(), 4, 0, 4);
        }
        if (this.f70193l.getVisibility() == 0) {
            constraintSet.clear(this.f70193l.getId(), 3);
            constraintSet.clear(this.f70193l.getId(), 4);
            constraintSet.clear(this.f70193l.getId(), 1);
            constraintSet.clear(this.f70193l.getId(), 2);
            constraintSet.connect(this.f70193l.getId(), 1, this.f70192k.getVisibility() == 0 ? this.f70192k.getId() : 0, 2, b(12));
            constraintSet.connect(this.f70193l.getId(), 3, 0, 3);
            constraintSet.connect(this.f70193l.getId(), 4, 0, 4);
        }
        if (this.f70192k.getVisibility() == 0 && this.f70193l.getVisibility() == 0) {
            constraintSet.connect(this.f70194m.getId(), 1, this.f70193l.getId(), 2, b(12));
            constraintSet.connect(this.f70194m.getId(), 2, 0, 2);
            constraintSet.constrainWidth(this.f70194m.getId(), -2);
        } else if (this.f70192k.getVisibility() == 8 && this.f70193l.getVisibility() == 0) {
            constraintSet.connect(this.f70193l.getId(), 1, 0, 1, b(12));
            constraintSet.connect(this.f70194m.getId(), 1, this.f70193l.getId(), 2, b(12));
            constraintSet.connect(this.f70194m.getId(), 2, 0, 2);
            constraintSet.constrainWidth(this.f70194m.getId(), -2);
        } else if (this.f70192k.getVisibility() == 8 && this.f70193l.getVisibility() == 8) {
            constraintSet.connect(this.f70194m.getId(), 1, 0, 1, b(12));
            constraintSet.connect(this.f70194m.getId(), 2, 0, 2, b(12));
            constraintSet.constrainWidth(this.f70194m.getId(), 0);
        }
        constraintSet.applyTo(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        Job job = this.f70195n;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f70195n = null;
        super.onViewRemoved(view);
    }

    public final void setAppIconDownloadJob(@Nullable Job job) {
        this.f70195n = job;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setIcon(int i10) {
        this.f70192k.setImageResource(i10);
        this.f70192k.setVisibility(0);
    }

    public final void setOpenText(@Nullable String str) {
        if (str == null || str.length() == 0) {
            str = "Get";
        }
        this.f70194m.setText(str);
        this.f70194m.setContentDescription(getContext().getString(R$string.f17918d, str, this.f70193l.getText()));
        this.f70194m.requestLayout();
    }

    public final void setTitle(@Nullable String str) {
        if (str == null || str.length() == 0) {
            this.f70193l.setVisibility(8);
            return;
        }
        this.f70193l.setText(str);
        this.f70193l.setVisibility(0);
        setContentDescription(getContext().getString(R$string.f17919e, str));
        this.f70194m.setContentDescription(getContext().getString(R$string.f17917c, str));
    }

    public final void setIcon(@Nullable URL url) {
        if (url != null) {
            Job jobD = eg.i.d(kotlinx.coroutines.i.a(this.f70190i), null, null, new b(url, null), 3, null);
            jobD.q(new c());
            this.f70195n = jobD;
            return;
        }
        this.f70192k.setVisibility(8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jb(Context context, AttributeSet attributeSet, int i10, String str, String str2, CoroutineDispatcher coroutineDispatcher, x9 x9Var, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        String string2;
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        int i12 = (i11 & 4) != 0 ? 0 : i10;
        if ((i11 & 8) != 0) {
            string = context.getString(R$string.f17919e, "App Name");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = str;
        }
        if ((i11 & 16) != 0) {
            string2 = context.getString(R$string.f17917c, "App Name");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        } else {
            string2 = str2;
        }
        this(context, attributeSet, i12, string, string2, (i11 & 32) != 0 ? eg.o0.c() : coroutineDispatcher, (i11 & 64) != 0 ? new x9(null, null, null, 7, null) : x9Var, (i11 & 128) != 0 ? null : function0);
    }
}
