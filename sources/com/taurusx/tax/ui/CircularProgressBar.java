package com.taurusx.tax.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.R;
import com.taurusx.tax.ui.CircularProgressBar;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0006\u009f\u0001 \u0001¡\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\nJ\u000f\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010\nJ;\u0010/\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020(*\u00020(H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00105\u001a\u000204*\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020(*\u00020(H\u0002¢\u0006\u0004\b7\u00102J\u0013\u00108\u001a\u000203*\u000203H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u001f*\u00020\u000bH\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u000203*\u00020\u000bH\u0002¢\u0006\u0004\b<\u0010=R$\u0010?\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bC\u0010@\"\u0004\bD\u0010BR*\u0010)\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010@\u001a\u0004\bE\u0010F\"\u0004\bG\u0010BR*\u0010H\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010BR*\u0010K\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010F\"\u0004\bM\u0010BR*\u0010N\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010F\"\u0004\bP\u0010BR*\u0010Q\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0018R.\u0010V\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R.\u0010\\\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010Y\"\u0004\b^\u0010[R*\u0010_\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010R\u001a\u0004\b`\u0010T\"\u0004\ba\u0010\u0018R.\u0010b\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010W\u001a\u0004\bc\u0010Y\"\u0004\bd\u0010[R.\u0010e\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010W\u001a\u0004\bf\u0010Y\"\u0004\bg\u0010[R*\u0010h\u001a\u0002042\u0006\u0010>\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR*\u0010n\u001a\u00020(2\u0006\u0010>\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010@\u001a\u0004\bo\u0010F\"\u0004\bp\u0010BR*\u0010q\u001a\u0002042\u0006\u0010>\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010i\u001a\u0004\br\u0010k\"\u0004\bs\u0010mR0\u0010u\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR0\u0010{\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010v\u001a\u0004\b|\u0010x\"\u0004\b}\u0010zR\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R1\u0010\u0081\u0001\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0080\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R1\u0010\u0091\u0001\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0082\u0001\u001a\u0006\b\u0092\u0001\u0010\u0084\u0001\"\u0006\b\u0093\u0001\u0010\u0086\u0001R1\u0010\u0094\u0001\u001a\u0002032\u0006\u0010>\u001a\u0002038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010\u009a\u0001\u001a\u0002032\u0006\u0010>\u001a\u0002038\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0095\u0001\"\u0006\b\u009b\u0001\u0010\u0099\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/taurusx/tax/ui/CircularProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onDetachedFromWindow", "()V", "", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "backgroundColor", "setBackgroundColor", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "startColor", "endColor", "Lcom/taurusx/tax/ui/CircularProgressBar$GradientDirection;", "gradientDirection", "Landroid/graphics/LinearGradient;", "createLinearGradient", "(IILcom/taurusx/tax/ui/CircularProgressBar$GradientDirection;)Landroid/graphics/LinearGradient;", "init", "manageBackgroundProgressBarColor", "manageColor", "postIndeterminateModeHandler", "", "progress", "", "duration", "Landroid/animation/TimeInterpolator;", "interpolator", "startDelay", "setProgressWithAnimation", "(FLjava/lang/Long;Landroid/animation/TimeInterpolator;Ljava/lang/Long;)V", "dpToPx", "(F)F", "Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;", "", "isToRight", "(Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;)Z", "pxToDp", "reverse", "(Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;)Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;", "toGradientDirection", "(I)Lcom/taurusx/tax/ui/CircularProgressBar$GradientDirection;", "toProgressDirection", "(I)Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;", "value", "progressIndeterminateMode", "F", "setProgressIndeterminateMode", "(F)V", "startAngleIndeterminateMode", "setStartAngleIndeterminateMode", "getProgress", "()F", "setProgress", "progressMax", "getProgressMax", "setProgressMax", "progressBarWidth", "getProgressBarWidth", "setProgressBarWidth", "backgroundProgressBarWidth", "getBackgroundProgressBarWidth", "setBackgroundProgressBarWidth", "progressBarColor", "I", "getProgressBarColor", "()I", "setProgressBarColor", "progressBarColorStart", "Ljava/lang/Integer;", "getProgressBarColorStart", "()Ljava/lang/Integer;", "setProgressBarColorStart", "(Ljava/lang/Integer;)V", "progressBarColorEnd", "getProgressBarColorEnd", "setProgressBarColorEnd", "backgroundProgressBarColor", "getBackgroundProgressBarColor", "setBackgroundProgressBarColor", "backgroundProgressBarColorStart", "getBackgroundProgressBarColorStart", "setBackgroundProgressBarColorStart", "backgroundProgressBarColorEnd", "getBackgroundProgressBarColorEnd", "setBackgroundProgressBarColorEnd", "roundBorder", "Z", "getRoundBorder", "()Z", "setRoundBorder", "(Z)V", "startAngle", "getStartAngle", "setStartAngle", "indeterminateMode", "getIndeterminateMode", "setIndeterminateMode", "Lkotlin/Function1;", "onProgressChangeListener", "Lkotlin/jvm/functions/Function1;", "getOnProgressChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnProgressChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onIndeterminateModeChangeListener", "getOnIndeterminateModeChangeListener", "setOnIndeterminateModeChangeListener", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundProgressBarColorDirection", "Lcom/taurusx/tax/ui/CircularProgressBar$GradientDirection;", "getBackgroundProgressBarColorDirection", "()Lcom/taurusx/tax/ui/CircularProgressBar$GradientDirection;", "setBackgroundProgressBarColorDirection", "(Lcom/taurusx/tax/ui/CircularProgressBar$GradientDirection;)V", "foregroundPaint", "Landroid/os/Handler;", "indeterminateModeHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "indeterminateModeRunnable", "Ljava/lang/Runnable;", "Landroid/animation/ValueAnimator;", "progressAnimator", "Landroid/animation/ValueAnimator;", "progressBarColorDirection", "getProgressBarColorDirection", "setProgressBarColorDirection", "progressDirection", "Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;", "getProgressDirection", "()Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;", "setProgressDirection", "(Lcom/taurusx/tax/ui/CircularProgressBar$ProgressDirection;)V", "progressDirectionIndeterminateMode", "setProgressDirectionIndeterminateMode", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", com.taurusx.tax.f.y.f66058y, "GradientDirection", "ProgressDirection", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CircularProgressBar extends View {

    @NotNull
    public static final z B = new z(null);
    public static final float C = 100.0f;
    public static final float D = 270.0f;
    public static final long E = 1500;

    @NotNull
    public final Runnable A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f66698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f66699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Paint f66700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public y f66701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public w f66702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f66703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Function1<? super Float, Unit> f66705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f66707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f66708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f66709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Integer f66710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f66711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public Paint f66712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public w f66713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f66714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f66715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f66716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f66717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f66718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Integer f66719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Handler f66720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public y f66721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public RectF f66722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public ValueAnimator f66723z;

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f66724z;

        static {
            int[] iArr = new int[w.valuesCustom().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f66724z = iArr;
        }
    }

    public enum w {
        LEFT_TO_RIGHT(1),
        RIGHT_TO_LEFT(2),
        TOP_TO_BOTTOM(3),
        BOTTOM_TO_END(4);


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final int f66726z;

        w(int i10) {
            this.f66726z = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static w[] valuesCustom() {
            w[] wVarArrValuesCustom = values();
            return (w[]) Arrays.copyOf(wVarArrValuesCustom, wVarArrValuesCustom.length);
        }

        public final int getValue() {
            return this.f66726z;
        }
    }

    public enum y {
        TO_RIGHT(1),
        TO_LEFT(2);


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final int f66728z;

        y(int i10) {
            this.f66728z = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static y[] valuesCustom() {
            y[] yVarArrValuesCustom = values();
            return (y[]) Arrays.copyOf(yVarArrValuesCustom, yVarArrValuesCustom.length);
        }

        public final int getValue() {
            return this.f66728z;
        }
    }

    public static final class z {
        public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public z() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66722y = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f66700c = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.f66712o = paint2;
        this.f66698a = 100.0f;
        this.f66711n = getResources().getDimension(R.dimen.default_stroke_width);
        this.f66717t = getResources().getDimension(R.dimen.default_background_stroke_width);
        this.f66704g = ViewCompat.MEASURED_STATE_MASK;
        w wVar = w.LEFT_TO_RIGHT;
        this.f66713p = wVar;
        this.f66706i = -7829368;
        this.f66702e = wVar;
        this.f66718u = 270.0f;
        y yVar = y.TO_RIGHT;
        this.f66721x = yVar;
        this.f66701d = yVar;
        this.f66714q = 270.0f;
        this.A = new Runnable() { // from class: a6.b
            @Override // java.lang.Runnable
            public final void run() {
                CircularProgressBar.z(this.f4135b);
            }
        };
        z(context, attributeSet);
    }

    private final void setProgressDirectionIndeterminateMode(y yVar) {
        this.f66701d = yVar;
        invalidate();
    }

    private final void setProgressIndeterminateMode(float f10) {
        this.f66699b = f10;
        invalidate();
    }

    private final void setStartAngleIndeterminateMode(float f10) {
        this.f66714q = f10;
        invalidate();
    }

    private final void w() {
        Paint paint = this.f66712o;
        Integer num = this.f66703f;
        int iIntValue = num == null ? this.f66704g : num.intValue();
        Integer num2 = this.f66710m;
        paint.setShader(z(iIntValue, num2 == null ? this.f66704g : num2.intValue(), this.f66713p));
    }

    private final void y() {
        Handler handler = this.f66720w;
        if (handler == null) {
            return;
        }
        handler.postDelayed(this.A, E);
    }

    /* JADX INFO: renamed from: getBackgroundProgressBarColor, reason: from getter */
    public final int getF66706i() {
        return this.f66706i;
    }

    @NotNull
    /* JADX INFO: renamed from: getBackgroundProgressBarColorDirection, reason: from getter */
    public final w getF66702e() {
        return this.f66702e;
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundProgressBarColorEnd, reason: from getter */
    public final Integer getF66709l() {
        return this.f66709l;
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundProgressBarColorStart, reason: from getter */
    public final Integer getF66719v() {
        return this.f66719v;
    }

    /* JADX INFO: renamed from: getBackgroundProgressBarWidth, reason: from getter */
    public final float getF66717t() {
        return this.f66717t;
    }

    /* JADX INFO: renamed from: getIndeterminateMode, reason: from getter */
    public final boolean getF66715r() {
        return this.f66715r;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnIndeterminateModeChangeListener() {
        return this.f66707j;
    }

    @Nullable
    public final Function1<Float, Unit> getOnProgressChangeListener() {
        return this.f66705h;
    }

    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final float getF66716s() {
        return this.f66716s;
    }

    /* JADX INFO: renamed from: getProgressBarColor, reason: from getter */
    public final int getF66704g() {
        return this.f66704g;
    }

    @NotNull
    /* JADX INFO: renamed from: getProgressBarColorDirection, reason: from getter */
    public final w getF66713p() {
        return this.f66713p;
    }

    @Nullable
    /* JADX INFO: renamed from: getProgressBarColorEnd, reason: from getter */
    public final Integer getF66710m() {
        return this.f66710m;
    }

    @Nullable
    /* JADX INFO: renamed from: getProgressBarColorStart, reason: from getter */
    public final Integer getF66703f() {
        return this.f66703f;
    }

    /* JADX INFO: renamed from: getProgressBarWidth, reason: from getter */
    public final float getF66711n() {
        return this.f66711n;
    }

    @NotNull
    /* JADX INFO: renamed from: getProgressDirection, reason: from getter */
    public final y getF66721x() {
        return this.f66721x;
    }

    /* JADX INFO: renamed from: getProgressMax, reason: from getter */
    public final float getF66698a() {
        return this.f66698a;
    }

    /* JADX INFO: renamed from: getRoundBorder, reason: from getter */
    public final boolean getF66708k() {
        return this.f66708k;
    }

    /* JADX INFO: renamed from: getStartAngle, reason: from getter */
    public final float getF66718u() {
        return this.f66718u;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f66723z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler = this.f66720w;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.A);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.f66722y, this.f66700c);
        boolean z10 = this.f66715r;
        float f10 = ((z10 ? this.f66699b : this.f66716s) * 100.0f) / this.f66698a;
        boolean z11 = false;
        boolean z12 = z10 && z(this.f66701d);
        if (!this.f66715r && z(this.f66721x)) {
            z11 = true;
        }
        canvas.drawArc(this.f66722y, this.f66715r ? this.f66714q : this.f66718u, (((z12 || z11) ? 360 : -360) * f10) / 100, false, this.f66712o);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec));
        setMeasuredDimension(iMin, iMin);
        float f10 = this.f66711n;
        float f11 = this.f66717t;
        if (f10 <= f11) {
            f10 = f11;
        }
        float f12 = f10 / 2;
        float f13 = 0 + f12;
        float f14 = iMin - f12;
        this.f66722y.set(f13, f13, f14, f14);
    }

    @Override // android.view.View
    public void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        w();
        z();
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        setBackgroundProgressBarColor(backgroundColor);
    }

    public final void setBackgroundProgressBarColor(int i10) {
        this.f66706i = i10;
        z();
        invalidate();
    }

    public final void setBackgroundProgressBarColorDirection(@NotNull w value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66702e = value;
        z();
        invalidate();
    }

    public final void setBackgroundProgressBarColorEnd(@Nullable Integer num) {
        this.f66709l = num;
        z();
        invalidate();
    }

    public final void setBackgroundProgressBarColorStart(@Nullable Integer num) {
        this.f66719v = num;
        z();
        invalidate();
    }

    public final void setBackgroundProgressBarWidth(float f10) {
        float fZ = z(f10);
        this.f66717t = fZ;
        this.f66700c.setStrokeWidth(fZ);
        requestLayout();
        invalidate();
    }

    public final void setIndeterminateMode(boolean z10) {
        this.f66715r = z10;
        Function1<? super Boolean, Unit> function1 = this.f66707j;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
        setProgressIndeterminateMode(0.0f);
        setProgressDirectionIndeterminateMode(y.TO_RIGHT);
        setStartAngleIndeterminateMode(270.0f);
        Handler handler = this.f66720w;
        if (handler != null) {
            handler.removeCallbacks(this.A);
        }
        ValueAnimator valueAnimator = this.f66723z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler2 = new Handler();
        this.f66720w = handler2;
        if (this.f66715r) {
            handler2.post(this.A);
        }
    }

    public final void setOnIndeterminateModeChangeListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f66707j = function1;
    }

    public final void setOnProgressChangeListener(@Nullable Function1<? super Float, Unit> function1) {
        this.f66705h = function1;
    }

    public final void setProgress(float f10) {
        float f11 = this.f66716s;
        float f12 = this.f66698a;
        if (f11 > f12) {
            f10 = f12;
        }
        this.f66716s = f10;
        Function1<? super Float, Unit> function1 = this.f66705h;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f10));
        }
        invalidate();
    }

    public final void setProgressBarColor(int i10) {
        this.f66704g = i10;
        w();
        invalidate();
    }

    public final void setProgressBarColorDirection(@NotNull w value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66713p = value;
        w();
        invalidate();
    }

    public final void setProgressBarColorEnd(@Nullable Integer num) {
        this.f66710m = num;
        w();
        invalidate();
    }

    public final void setProgressBarColorStart(@Nullable Integer num) {
        this.f66703f = num;
        w();
        invalidate();
    }

    public final void setProgressBarWidth(float f10) {
        float fZ = z(f10);
        this.f66711n = fZ;
        this.f66712o.setStrokeWidth(fZ);
        requestLayout();
        invalidate();
    }

    public final void setProgressDirection(@NotNull y value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66721x = value;
        invalidate();
    }

    public final void setProgressMax(float f10) {
        if (this.f66698a < 0.0f) {
            f10 = 100.0f;
        }
        this.f66698a = f10;
        invalidate();
    }

    public final void setProgressWithAnimation(float f10) {
        z(this, f10, null, null, null, 14, null);
    }

    public final void setRoundBorder(boolean z10) {
        this.f66708k = z10;
        this.f66712o.setStrokeCap(z10 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        invalidate();
    }

    public final void setStartAngle(float f10) {
        float f11 = f10 + 270.0f;
        while (f11 > 360.0f) {
            f11 -= 360;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 360.0f) {
            f11 = 360.0f;
        }
        this.f66718u = f11;
        invalidate();
    }

    public final void z(float f10, @Nullable Long l10) {
        z(this, f10, l10, null, null, 12, null);
    }

    public final void z(float f10, @Nullable Long l10, @Nullable TimeInterpolator timeInterpolator) {
        z(this, f10, l10, timeInterpolator, null, 8, null);
    }

    public static final void z(CircularProgressBar this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getF66715r()) {
            this$0.y();
            this$0.setProgressDirectionIndeterminateMode(this$0.w(this$0.f66701d));
            if (this$0.z(this$0.f66701d)) {
                z(this$0, 0.0f, Long.valueOf(E), null, null, 12, null);
            } else {
                z(this$0, this$0.getF66698a(), Long.valueOf(E), null, null, 12, null);
            }
        }
    }

    private final float w(float f10) {
        return f10 / Resources.getSystem().getDisplayMetrics().density;
    }

    private final y w(int i10) {
        if (i10 == 1) {
            return y.TO_RIGHT;
        }
        if (i10 == 2) {
            return y.TO_LEFT;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("This value is not supported for ProgressDirection: ", Integer.valueOf(i10)));
    }

    private final y w(y yVar) {
        return z(yVar) ? y.TO_LEFT : y.TO_RIGHT;
    }

    private final void z(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircularProgressBar, 0, 0);
        setProgress(typedArrayObtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_progress, this.f66716s));
        setProgressMax(typedArrayObtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_progress_max, this.f66698a));
        setProgressBarWidth(w(typedArrayObtainStyledAttributes.getDimension(R.styleable.CircularProgressBar_cpb_progressbar_width, this.f66711n)));
        setBackgroundProgressBarWidth(w(typedArrayObtainStyledAttributes.getDimension(R.styleable.CircularProgressBar_cpb_background_progressbar_width, this.f66717t)));
        setProgressBarColor(typedArrayObtainStyledAttributes.getInt(R.styleable.CircularProgressBar_cpb_progressbar_color, this.f66704g));
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.CircularProgressBar_cpb_progressbar_color_start, 0);
        if (color != 0) {
            setProgressBarColorStart(Integer.valueOf(color));
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.CircularProgressBar_cpb_progressbar_color_end, 0);
        if (color2 != 0) {
            setProgressBarColorEnd(Integer.valueOf(color2));
        }
        setProgressBarColorDirection(z(typedArrayObtainStyledAttributes.getInteger(R.styleable.CircularProgressBar_cpb_progressbar_color_direction, this.f66713p.getValue())));
        setBackgroundProgressBarColor(typedArrayObtainStyledAttributes.getInt(R.styleable.CircularProgressBar_cpb_background_progressbar_color, this.f66706i));
        int color3 = typedArrayObtainStyledAttributes.getColor(R.styleable.CircularProgressBar_cpb_background_progressbar_color_start, 0);
        if (color3 != 0) {
            setBackgroundProgressBarColorStart(Integer.valueOf(color3));
        }
        int color4 = typedArrayObtainStyledAttributes.getColor(R.styleable.CircularProgressBar_cpb_background_progressbar_color_end, 0);
        if (color4 != 0) {
            setBackgroundProgressBarColorEnd(Integer.valueOf(color4));
        }
        setBackgroundProgressBarColorDirection(z(typedArrayObtainStyledAttributes.getInteger(R.styleable.CircularProgressBar_cpb_background_progressbar_color_direction, this.f66702e.getValue())));
        setProgressDirection(w(typedArrayObtainStyledAttributes.getInteger(R.styleable.CircularProgressBar_cpb_progress_direction, this.f66721x.getValue())));
        setRoundBorder(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircularProgressBar_cpb_round_border, this.f66708k));
        setStartAngle(typedArrayObtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_start_angle, 0.0f));
        setIndeterminateMode(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircularProgressBar_cpb_indeterminate_mode, this.f66715r));
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ CircularProgressBar(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void z() {
        Paint paint = this.f66700c;
        Integer num = this.f66719v;
        int iIntValue = num == null ? this.f66706i : num.intValue();
        Integer num2 = this.f66709l;
        paint.setShader(z(iIntValue, num2 == null ? this.f66706i : num2.intValue(), this.f66702e));
    }

    private final LinearGradient z(int i10, int i11, w wVar) {
        float width;
        float width2;
        float height;
        float height2;
        int iOrdinal = wVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                width2 = getWidth();
                height = 0.0f;
            } else if (iOrdinal == 2) {
                height2 = getHeight();
                width2 = 0.0f;
                height = 0.0f;
                width = 0.0f;
            } else if (iOrdinal != 3) {
                width2 = 0.0f;
                height = 0.0f;
            } else {
                height = getHeight();
                width2 = 0.0f;
                width = 0.0f;
                height2 = width;
            }
            width = height;
            height2 = width;
        } else {
            width = getWidth();
            width2 = 0.0f;
            height = 0.0f;
            height2 = 0.0f;
        }
        return new LinearGradient(width2, height, width, height2, i10, i11, Shader.TileMode.CLAMP);
    }

    public static /* synthetic */ void z(CircularProgressBar circularProgressBar, float f10, Long l10, TimeInterpolator timeInterpolator, Long l11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            timeInterpolator = null;
        }
        if ((i10 & 8) != 0) {
            l11 = null;
        }
        circularProgressBar.z(f10, l10, timeInterpolator, l11);
    }

    public final void z(float f10, @Nullable Long l10, @Nullable TimeInterpolator timeInterpolator, @Nullable Long l11) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f66723z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f66723z = ValueAnimator.ofFloat(this.f66715r ? this.f66699b : this.f66716s, f10);
        if (l10 != null) {
            long jLongValue = l10.longValue();
            ValueAnimator valueAnimator3 = this.f66723z;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(jLongValue);
            }
        }
        if (timeInterpolator != null && (valueAnimator = this.f66723z) != null) {
            valueAnimator.setInterpolator(timeInterpolator);
        }
        if (l11 != null) {
            long jLongValue2 = l11.longValue();
            ValueAnimator valueAnimator4 = this.f66723z;
            if (valueAnimator4 != null) {
                valueAnimator4.setStartDelay(jLongValue2);
            }
        }
        ValueAnimator valueAnimator5 = this.f66723z;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a6.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator6) {
                    CircularProgressBar.z(this.f4134b, valueAnimator6);
                }
            });
        }
        ValueAnimator valueAnimator6 = this.f66723z;
        if (valueAnimator6 == null) {
            return;
        }
        valueAnimator6.start();
    }

    public static final void z(CircularProgressBar this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 == null) {
            return;
        }
        float fFloatValue = f10.floatValue();
        if (this$0.getF66715r()) {
            this$0.setProgressIndeterminateMode(fFloatValue);
        } else {
            this$0.setProgress(fFloatValue);
        }
        if (this$0.getF66715r()) {
            float f11 = (fFloatValue * 360) / 100;
            if (!this$0.z(this$0.f66701d)) {
                f11 = -f11;
            }
            this$0.setStartAngleIndeterminateMode(f11 + 270.0f);
        }
    }

    private final float z(float f10) {
        return f10 * Resources.getSystem().getDisplayMetrics().density;
    }

    private final boolean z(y yVar) {
        return yVar == y.TO_RIGHT;
    }

    private final w z(int i10) {
        if (i10 == 1) {
            return w.LEFT_TO_RIGHT;
        }
        if (i10 == 2) {
            return w.RIGHT_TO_LEFT;
        }
        if (i10 == 3) {
            return w.TOP_TO_BOTTOM;
        }
        if (i10 == 4) {
            return w.BOTTOM_TO_END;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("This value is not supported for GradientDirection: ", Integer.valueOf(i10)));
    }
}
