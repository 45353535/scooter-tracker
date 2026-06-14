package com.skydoves.balloon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.e;
import com.skydoves.balloon.f;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.a1;
import kotlin.ranges.IntRange;
import q5.k;
import q5.l;
import q5.m;
import q5.n;
import q5.o;
import q5.p;
import q5.q;
import q5.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002«\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120#2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020 2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010\u0018J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\nJ\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\nJ\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\nJ\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\nJ\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\nJ\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\nJ\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\nJ\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\nJ\u000f\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\nJ\u000f\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010\nJ\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\nJ\u0011\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010\nJ\u000f\u0010C\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\nJ\u0017\u0010D\u001a\u0002082\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010EJ#\u0010H\u001a\u00020\b2\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150F\"\u00020\u0015H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bJ\u0010\u0018J\u001f\u0010N\u001a\u00020\b2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u0015H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bP\u0010\u000eJ\u001f\u0010R\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0015H\u0002¢\u0006\u0004\bR\u0010SJ+\u0010V\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010T\u001a\u00020\u00122\b\b\u0002\u0010U\u001a\u00020\u0012H\u0007¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\b¢\u0006\u0004\bX\u0010\nJ\u0015\u0010[\u001a\u0002082\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\b2\b\u0010^\u001a\u0004\u0018\u00010]¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010a¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\b2\b\u0010f\u001a\u0004\u0018\u00010e¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020\b2\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\b2\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bm\u0010lJ'\u0010q\u001a\u00020\b2\u0018\u0010p\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u0002080n¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020\b2\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00002\u0006\u0010w\u001a\u000208¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020\u0012¢\u0006\u0004\bz\u0010\u0014J\r\u0010{\u001a\u00020\u0012¢\u0006\u0004\b{\u0010\u0014J\u0017\u0010~\u001a\u00020\b2\u0006\u0010}\u001a\u00020|H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010}\u001a\u00020|H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u007fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001d\u0010\u0092\u0001\u001a\u00030\u008d\u00018\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u0095\u0001\u001a\u00030\u008d\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u008f\u0001\u001a\u0006\b\u0094\u0001\u0010\u0091\u0001R(\u0010\u0098\u0001\u001a\u0002082\u0007\u0010\u0096\u0001\u001a\u0002088\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0017\u001a\u0005\b\u0098\u0001\u0010:R\u0018\u0010\u009a\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010\u0017R!\u0010 \u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u009d\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R!\u0010ª\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010\u009d\u0001\u001a\u0006\b¨\u0001\u0010©\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/skydoves/balloon/Balloon;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/skydoves/balloon/Balloon$a;", "builder", "<init>", "(Landroid/content/Context;Lcom/skydoves/balloon/Balloon$a;)V", "", "F", "()V", "Landroid/view/ViewGroup;", "parent", "B", "(Landroid/view/ViewGroup;)V", "", ExifInterface.LONGITUDE_WEST, "()F", "", "R", "()I", "Landroid/view/View;", "anchor", "Z", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "x", "y", "Landroid/graphics/drawable/BitmapDrawable;", "L", "(Landroid/widget/ImageView;FF)Landroid/graphics/drawable/BitmapDrawable;", "imageView", "Landroid/graphics/Bitmap;", "z", "(Landroid/widget/ImageView;FF)Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "Q", "(FF)Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "drawable", "width", "height", "I", "(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "J", "(Landroid/view/View;)F", "K", "b0", "h0", "e0", "g0", "c0", "j0", "k0", "d0", "", "Y", "()Z", "i0", "f0", "C", "D", "Landroid/view/animation/Animation;", "N", "()Landroid/view/animation/Animation;", "D0", "G0", ExifInterface.LONGITUDE_EAST, "(Landroid/view/View;)Z", "", "anchors", "C0", "([Landroid/view/View;)V", "m0", "Landroid/widget/TextView;", "textView", "rootView", "l0", "(Landroid/widget/TextView;Landroid/view/View;)V", "H0", "measuredWidth", "U", "(ILandroid/view/View;)I", "xOff", "yOff", "A0", "(Landroid/view/View;II)V", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "", POBCTAOverlayData.KEY_CTA_DELAY, "H", "(J)Z", "Lq5/n;", "onBalloonClickListener", "o0", "(Lq5/n;)V", "Lq5/o;", "onBalloonDismissListener", "q0", "(Lq5/o;)V", "Lq5/q;", "onBalloonOutsideTouchListener", "s0", "(Lq5/q;)V", "Landroid/view/View$OnTouchListener;", "onTouchListener", "y0", "(Landroid/view/View$OnTouchListener;)V", "v0", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "block", "w0", "(Lkotlin/jvm/functions/Function2;)V", "Lq5/r;", "onBalloonOverlayClickListener", "t0", "(Lq5/r;)V", "value", "n0", "(Z)Lcom/skydoves/balloon/Balloon;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "T", "Landroidx/lifecycle/LifecycleOwner;", "owner", C4240b4.i.f42653t0, "(Landroidx/lifecycle/LifecycleOwner;)V", "onDestroy", "b", "Landroid/content/Context;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/skydoves/balloon/Balloon$a;", "Ls5/a;", "d", "Ls5/a;", "binding", "Ls5/b;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ls5/b;", "overlayBinding", "Landroid/widget/PopupWindow;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/widget/PopupWindow;", "P", "()Landroid/widget/PopupWindow;", "bodyWindow", "g", "X", "overlayWindow", "<set-?>", "h", "isShowing", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "destroyed", "Landroid/os/Handler;", "j", "Lkotlin/Lazy;", ExifInterface.LATITUDE_SOUTH, "()Landroid/os/Handler;", "handler", "Lq5/c;", CampaignEx.JSON_KEY_AD_K, "M", "()Lq5/c;", "autoDismissRunnable", "Lcom/skydoves/balloon/d;", CmcdData.Factory.STREAM_TYPE_LIVE, "O", "()Lcom/skydoves/balloon/d;", "balloonPersistence", "a", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Balloon implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a builder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s5.a binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s5.b overlayBinding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final PopupWindow bodyWindow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final PopupWindow overlayWindow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShowing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean destroyed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy handler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy autoDismissRunnable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy balloonPersistence;

    public static final class a {
        private int A;
        private v5.a A0;
        private int B;
        private long B0;
        private int C;
        private l C0;
        private int D;
        private int D0;
        private float E;
        private long E0;
        private float F;
        private String F0;
        private int G;
        private int G0;
        private Drawable H;
        private Function0 H0;
        private float I;
        private boolean I0;
        private CharSequence J;
        private int J0;
        private int K;
        private boolean K0;
        private boolean L;
        private boolean L0;
        private MovementMethod M;
        private boolean M0;
        private float N;
        private boolean N0;
        private int O;
        private Typeface P;
        private Float Q;
        private int R;
        private com.skydoves.balloon.f S;
        private Drawable T;
        private m U;
        private int V;
        private int W;
        private int X;
        private int Y;
        private com.skydoves.balloon.e Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f63485a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private CharSequence f63486a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f63487b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private float f63488b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f63489c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private float f63490c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f63491d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private View f63492d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f63493e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private Integer f63494e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f63495f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        private boolean f63496f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f63497g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        private int f63498g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f63499h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        private float f63500h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f63501i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        private int f63502i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f63503j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        private Point f63504j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f63505k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private v5.c f63506k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f63507l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        private int f63508l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f63509m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        private View.OnTouchListener f63510m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f63511n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        private View.OnTouchListener f63512n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f63513o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        private boolean f63514o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f63515p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private boolean f63516p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f63517q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        private boolean f63518q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f63519r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private boolean f63520r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f63521s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private boolean f63522s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f63523t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        private boolean f63524t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private float f63525u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        private long f63526u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private q5.b f63527v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private LifecycleOwner f63528v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private q5.a f63529w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private LifecycleObserver f63530w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private com.skydoves.balloon.a f63531x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private int f63532x0;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Drawable f63533y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private int f63534y0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f63535z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private k f63536z0;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f63485a = context;
            this.f63487b = Integer.MIN_VALUE;
            this.f63491d = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            this.f63499h = Integer.MIN_VALUE;
            this.f63517q = true;
            this.f63519r = Integer.MIN_VALUE;
            this.f63523t = zf.a.d(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
            this.f63525u = 0.5f;
            this.f63527v = q5.b.ALIGN_BALLOON;
            this.f63529w = q5.a.ALIGN_ANCHOR;
            this.f63531x = com.skydoves.balloon.a.BOTTOM;
            this.E = 2.5f;
            this.G = ViewCompat.MEASURED_STATE_MASK;
            this.I = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
            a1 a1Var = a1.f93282a;
            this.J = "";
            this.K = -1;
            this.N = 12.0f;
            this.R = 17;
            this.U = m.START;
            float f10 = 28;
            this.V = zf.a.d(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
            this.W = zf.a.d(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
            this.X = zf.a.d(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.Y = Integer.MIN_VALUE;
            this.f63486a0 = "";
            this.f63488b0 = 1.0f;
            this.f63490c0 = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
            this.f63506k0 = v5.b.f105760a;
            this.f63508l0 = 17;
            this.f63514o0 = true;
            this.f63520r0 = true;
            this.f63526u0 = -1L;
            this.f63532x0 = Integer.MIN_VALUE;
            this.f63534y0 = Integer.MIN_VALUE;
            this.f63536z0 = k.FADE;
            this.A0 = v5.a.FADE;
            this.B0 = 500L;
            this.C0 = l.NONE;
            this.D0 = Integer.MIN_VALUE;
            this.G0 = 1;
            boolean z10 = context.getResources().getConfiguration().getLayoutDirection() == 1;
            this.I0 = z10;
            this.J0 = u5.a.b(1, z10);
            this.K0 = true;
            this.L0 = true;
            this.M0 = true;
        }

        public final int A() {
            return this.f63534y0;
        }

        public final int A0() {
            return this.J0;
        }

        public final r5.a B() {
            return null;
        }

        public final CharSequence B0() {
            return this.J;
        }

        public final long C() {
            return this.B0;
        }

        public final int C0() {
            return this.K;
        }

        public final float D() {
            return this.I;
        }

        public final com.skydoves.balloon.f D0() {
            return this.S;
        }

        public final boolean E() {
            return this.f63518q0;
        }

        public final int E0() {
            return this.R;
        }

        public final boolean F() {
            return this.f63522s0;
        }

        public final boolean F0() {
            return this.L;
        }

        public final boolean G() {
            return this.f63520r0;
        }

        public final Float G0() {
            return this.Q;
        }

        public final boolean H() {
            return this.f63516p0;
        }

        public final float H0() {
            return this.N;
        }

        public final boolean I() {
            return this.f63514o0;
        }

        public final int I0() {
            return this.O;
        }

        public final float J() {
            return this.f63490c0;
        }

        public final Typeface J0() {
            return this.P;
        }

        public final int K() {
            return this.f63499h;
        }

        public final int K0() {
            return this.f63487b;
        }

        public final int L() {
            return this.Y;
        }

        public final float L0() {
            return this.f63493e;
        }

        public final Drawable M() {
            return this.T;
        }

        public final boolean M0() {
            return this.M0;
        }

        public final com.skydoves.balloon.e N() {
            return this.Z;
        }

        public final boolean N0() {
            return this.N0;
        }

        public final m O() {
            return this.U;
        }

        public final boolean O0() {
            return this.K0;
        }

        public final int P() {
            return this.W;
        }

        public final boolean P0() {
            return this.I0;
        }

        public final int Q() {
            return this.X;
        }

        public final boolean Q0() {
            return this.L0;
        }

        public final int R() {
            return this.V;
        }

        public final boolean R0() {
            return this.f63517q;
        }

        public final View S() {
            return this.f63492d0;
        }

        public final boolean S0() {
            return this.f63496f0;
        }

        public final Integer T() {
            return this.f63494e0;
        }

        public final a T0(com.skydoves.balloon.a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63531x = value;
            return this;
        }

        public final LifecycleObserver U() {
            return this.f63530w0;
        }

        public final a U0(q5.b value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63527v = value;
            return this;
        }

        public final LifecycleOwner V() {
            return this.f63528v0;
        }

        public final a V0(int i10) {
            this.G = i10;
            return this;
        }

        public final int W() {
            return this.f63515p;
        }

        public final a W0(k value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63536z0 = value;
            if (value == k.CIRCULAR) {
                X0(false);
            }
            return this;
        }

        public final int X() {
            return this.f63511n;
        }

        public final a X0(boolean z10) {
            this.K0 = z10;
            return this;
        }

        public final int Y() {
            return this.f63509m;
        }

        public final a Y0(LifecycleOwner lifecycleOwner) {
            this.f63528v0 = lifecycleOwner;
            return this;
        }

        public final int Z() {
            return this.f63513o;
        }

        public final a Z0(int i10) {
            b1(i10);
            d1(i10);
            c1(i10);
            a1(i10);
            return this;
        }

        public final Balloon a() {
            return new Balloon(this.f63485a, this, null);
        }

        public final int a0() {
            return this.f63491d;
        }

        public final a a1(int i10) {
            this.f63515p = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final float b() {
            return this.f63488b0;
        }

        public final float b0() {
            return this.f63497g;
        }

        public final a b1(int i10) {
            this.f63511n = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final int c() {
            return this.D;
        }

        public final int c0() {
            return this.f63489c;
        }

        public final a c1(int i10) {
            this.f63509m = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final float d() {
            return this.E;
        }

        public final float d0() {
            return this.f63495f;
        }

        public final a d1(int i10) {
            this.f63513o = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final int e() {
            return this.C;
        }

        public final MovementMethod e0() {
            return this.M;
        }

        public final a e1(int i10) {
            g1(i10);
            i1(i10);
            h1(i10);
            f1(i10);
            return this;
        }

        public final int f() {
            return this.f63519r;
        }

        public final n f0() {
            return null;
        }

        public final a f1(int i10) {
            this.f63507l = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final boolean g() {
            return this.f63521s;
        }

        public final o g0() {
            return null;
        }

        public final a g1(int i10) {
            this.f63501i = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final Drawable h() {
            return this.f63533y;
        }

        public final p h0() {
            return null;
        }

        public final a h1(int i10) {
            this.f63505k = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final float i() {
            return this.F;
        }

        public final q i0() {
            return null;
        }

        public final a i1(int i10) {
            this.f63503j = zf.a.d(TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final int j() {
            return this.f63535z;
        }

        public final r j0() {
            return null;
        }

        public final a j1(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.J = value;
            return this;
        }

        public final com.skydoves.balloon.a k() {
            return this.f63531x;
        }

        public final View.OnTouchListener k0() {
            return this.f63512n0;
        }

        public final a k1(int i10) {
            this.K = i10;
            return this;
        }

        public final q5.a l() {
            return this.f63529w;
        }

        public final View.OnTouchListener l0() {
            return this.f63510m0;
        }

        public final a l1(float f10) {
            this.N = f10;
            return this;
        }

        public final float m() {
            return this.f63525u;
        }

        public final int m0() {
            return this.f63498g0;
        }

        public final q5.b n() {
            return this.f63527v;
        }

        public final int n0() {
            return this.f63508l0;
        }

        public final int o() {
            return this.A;
        }

        public final float o0() {
            return this.f63500h0;
        }

        public final int p() {
            return this.f63523t;
        }

        public final int p0() {
            return this.f63502i0;
        }

        public final int q() {
            return this.B;
        }

        public final Point q0() {
            return this.f63504j0;
        }

        public final long r() {
            return this.f63526u0;
        }

        public final v5.c r0() {
            return this.f63506k0;
        }

        public final int s() {
            return this.G;
        }

        public final int s0() {
            return this.f63507l;
        }

        public final Drawable t() {
            return this.H;
        }

        public final int t0() {
            return this.f63501i;
        }

        public final k u() {
            return this.f63536z0;
        }

        public final int u0() {
            return this.f63505k;
        }

        public final int v() {
            return this.f63532x0;
        }

        public final int v0() {
            return this.f63503j;
        }

        public final l w() {
            return this.C0;
        }

        public final boolean w0() {
            return this.f63524t0;
        }

        public final long x() {
            return this.E0;
        }

        public final String x0() {
            return this.F0;
        }

        public final int y() {
            return this.D0;
        }

        public final Function0 y0() {
            return this.H0;
        }

        public final v5.a z() {
            return this.A0;
        }

        public final int z0() {
            return this.G0;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[com.skydoves.balloon.a.values().length];
            try {
                iArr[com.skydoves.balloon.a.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.skydoves.balloon.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.skydoves.balloon.a.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.skydoves.balloon.a.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[q5.b.values().length];
            try {
                iArr2[q5.b.ALIGN_BALLOON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q5.b.ALIGN_ANCHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[k.values().length];
            try {
                iArr3[k.ELASTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[k.CIRCULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[k.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[k.OVERSHOOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[k.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[v5.a.values().length];
            try {
                iArr4[v5.a.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[l.values().length];
            try {
                iArr5[l.HEARTBEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[l.SHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[l.BREATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[l.ROTATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[com.skydoves.balloon.c.values().length];
            try {
                iArr6[com.skydoves.balloon.c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[com.skydoves.balloon.c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[com.skydoves.balloon.c.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[com.skydoves.balloon.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[com.skydoves.balloon.b.values().length];
            try {
                iArr7[com.skydoves.balloon.b.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[com.skydoves.balloon.b.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[com.skydoves.balloon.b.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[com.skydoves.balloon.b.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final q5.c invoke() {
            return new q5.c(Balloon.this);
        }
    }

    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final com.skydoves.balloon.d invoke() {
            return com.skydoves.balloon.d.f63604a.a(Balloon.this.context);
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f63539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f63540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f63541d;

        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f63542b;

            public a(Function0 function0) {
                this.f63542b = function0;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                this.f63542b.invoke();
            }
        }

        public e(View view, long j10, Function0 function0) {
            this.f63539b = view;
            this.f63540c = j10;
            this.f63541d = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f63539b.isAttachedToWindow()) {
                View view = this.f63539b;
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + this.f63539b.getRight()) / 2, (this.f63539b.getTop() + this.f63539b.getBottom()) / 2, Math.max(this.f63539b.getWidth(), this.f63539b.getHeight()), 0.0f);
                animatorCreateCircularReveal.setDuration(this.f63540c);
                animatorCreateCircularReveal.start();
                animatorCreateCircularReveal.addListener(new a(this.f63541d));
            }
        }
    }

    static final class f extends Lambda implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7439invoke();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7439invoke() {
            Balloon.this.isShowing = false;
            Balloon.this.getBodyWindow().dismiss();
            Balloon.this.getOverlayWindow().dismiss();
            Balloon.this.S().removeCallbacks(Balloon.this.M());
        }
    }

    static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f63544f = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class h extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f63545f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(2);
            this.f63545f = view;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(View view, MotionEvent event) {
            boolean z10;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            view.performClick();
            Rect rect = new Rect();
            this.f63545f.getGlobalVisibleRect(rect);
            if (rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                this.f63545f.getRootView().dispatchTouchEvent(event);
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class i implements View.OnTouchListener {
        i(q qVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() != 4) {
                return false;
            }
            if (!Balloon.this.builder.I()) {
                return true;
            }
            Balloon.this.G();
            return true;
        }
    }

    public static final class j implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f63548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View[] f63549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Balloon f63550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f63551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f63552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f63553h;

        public j(View view, View[] viewArr, Balloon balloon, View view2, int i10, int i11) {
            this.f63548c = view;
            this.f63549d = viewArr;
            this.f63550e = balloon;
            this.f63551f = view2;
            this.f63552g = i10;
            this.f63553h = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zE = Balloon.this.E(this.f63548c);
            Boolean boolValueOf = Boolean.valueOf(zE);
            if (!zE) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                String strX0 = Balloon.this.builder.x0();
                if (strX0 != null) {
                    Balloon balloon = Balloon.this;
                    if (!balloon.O().g(strX0, balloon.builder.z0())) {
                        Function0 function0Y0 = balloon.builder.y0();
                        if (function0Y0 != null) {
                            function0Y0.invoke();
                            return;
                        }
                        return;
                    }
                    balloon.O().f(strX0);
                }
                Balloon.this.isShowing = true;
                long jR = Balloon.this.builder.r();
                if (jR != -1) {
                    Balloon.this.H(jR);
                }
                if (Balloon.this.Y()) {
                    Balloon balloon2 = Balloon.this;
                    RadiusLayout radiusLayout = balloon2.binding.f99772d;
                    Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
                    balloon2.H0(radiusLayout);
                } else {
                    Balloon balloon3 = Balloon.this;
                    VectorTextView vectorTextView = balloon3.binding.f99774f;
                    Intrinsics.checkNotNullExpressionValue(vectorTextView, "binding.balloonText");
                    RadiusLayout radiusLayout2 = Balloon.this.binding.f99772d;
                    Intrinsics.checkNotNullExpressionValue(radiusLayout2, "binding.balloonCard");
                    balloon3.l0(vectorTextView, radiusLayout2);
                }
                Balloon.this.binding.getRoot().measure(0, 0);
                if (!Balloon.this.builder.N0()) {
                    Balloon.this.getBodyWindow().setWidth(Balloon.this.V());
                    Balloon.this.getBodyWindow().setHeight(Balloon.this.T());
                }
                Balloon.this.binding.f99774f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                Balloon.this.Z(this.f63548c);
                Balloon.this.c0();
                Balloon.this.D();
                Balloon balloon4 = Balloon.this;
                View[] viewArr = this.f63549d;
                balloon4.C0((View[]) Arrays.copyOf(viewArr, viewArr.length));
                Balloon.this.m0(this.f63548c);
                Balloon.this.C();
                Balloon.this.D0();
                this.f63550e.getBodyWindow().showAsDropDown(this.f63551f, this.f63550e.builder.A0() * (((this.f63551f.getMeasuredWidth() / 2) - (this.f63550e.V() / 2)) + this.f63552g), this.f63553h);
            }
        }
    }

    public /* synthetic */ Balloon(Context context, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar);
    }

    private final void A(View anchor) {
        if (this.builder.l() == q5.a.ALIGN_FIXED) {
            return;
        }
        Rect rect = new Rect();
        anchor.getGlobalVisibleRect(rect);
        int[] iArr = {0, 0};
        this.bodyWindow.getContentView().getLocationOnScreen(iArr);
        com.skydoves.balloon.a aVarK = this.builder.k();
        com.skydoves.balloon.a aVar = com.skydoves.balloon.a.TOP;
        if (aVarK == aVar && iArr[1] < rect.bottom) {
            this.builder.T0(com.skydoves.balloon.a.BOTTOM);
        } else if (this.builder.k() == com.skydoves.balloon.a.BOTTOM && iArr[1] > rect.top) {
            this.builder.T0(aVar);
        }
        com.skydoves.balloon.a aVarK2 = this.builder.k();
        com.skydoves.balloon.a aVar2 = com.skydoves.balloon.a.START;
        if (aVarK2 == aVar2 && iArr[0] < rect.right) {
            this.builder.T0(com.skydoves.balloon.a.END);
        } else if (this.builder.k() == com.skydoves.balloon.a.END && iArr[0] > rect.left) {
            this.builder.T0(aVar2);
        }
        c0();
    }

    private final void B(ViewGroup parent) {
        parent.setFitsSystemWindows(false);
        IntRange intRangeV = kotlin.ranges.g.v(0, parent.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                B((ViewGroup) view);
            }
        }
    }

    public static /* synthetic */ void B0(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.A0(view, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (this.builder.v() != Integer.MIN_VALUE) {
            this.bodyWindow.setAnimationStyle(this.builder.v());
            return;
        }
        int i10 = b.$EnumSwitchMapping$2[this.builder.u().ordinal()];
        if (i10 == 1) {
            this.bodyWindow.setAnimationStyle(R$style.f63571a);
            return;
        }
        if (i10 == 2) {
            View contentView = this.bodyWindow.getContentView();
            Intrinsics.checkNotNullExpressionValue(contentView, "bodyWindow.contentView");
            t5.f.b(contentView, this.builder.C());
            this.bodyWindow.setAnimationStyle(R$style.f63574d);
            return;
        }
        if (i10 == 3) {
            this.bodyWindow.setAnimationStyle(R$style.f63572b);
        } else if (i10 == 4) {
            this.bodyWindow.setAnimationStyle(R$style.f63575e);
        } else {
            if (i10 != 5) {
                return;
            }
            this.bodyWindow.setAnimationStyle(R$style.f63573c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(View... anchors) {
        if (this.builder.S0()) {
            View view = anchors[0];
            if (anchors.length == 1) {
                this.overlayBinding.f99777b.setAnchorView(view);
            } else {
                this.overlayBinding.f99777b.setAnchorViewList(ArraysKt.toList(anchors));
            }
            this.overlayWindow.showAtLocation(view, this.builder.n0(), 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        if (this.builder.A() != Integer.MIN_VALUE) {
            this.overlayWindow.setAnimationStyle(this.builder.v());
            return;
        }
        if (b.$EnumSwitchMapping$3[this.builder.z().ordinal()] == 1) {
            this.overlayWindow.setAnimationStyle(R$style.f63572b);
        } else {
            this.overlayWindow.setAnimationStyle(R$style.f63573c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0() {
        this.binding.f99770b.post(new Runnable() { // from class: q5.f
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.E0(this.f98696b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(View anchor) {
        if (this.isShowing || this.destroyed) {
            return false;
        }
        Context context = this.context;
        return !((context instanceof Activity) && ((Activity) context).isFinishing()) && this.bodyWindow.getContentView().getParent() == null && ViewCompat.isAttachedToWindow(anchor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(final Balloon this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: q5.j
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.F0(this.f98702b);
            }
        }, this$0.builder.x());
    }

    private final void F() {
        Lifecycle lifecycle;
        b0();
        g0();
        h0();
        d0();
        c0();
        f0();
        e0();
        FrameLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        B(root);
        if (this.builder.V() == null) {
            Object obj = this.context;
            if (obj instanceof LifecycleOwner) {
                this.builder.Y0((LifecycleOwner) obj);
                Lifecycle lifecycle2 = ((LifecycleOwner) this.context).getLifecycle();
                LifecycleObserver lifecycleObserverU = this.builder.U();
                if (lifecycleObserverU == null) {
                    lifecycleObserverU = this;
                }
                lifecycle2.addObserver(lifecycleObserverU);
                return;
            }
        }
        LifecycleOwner lifecycleOwnerV = this.builder.V();
        if (lifecycleOwnerV == null || (lifecycle = lifecycleOwnerV.getLifecycle()) == null) {
            return;
        }
        LifecycleObserver lifecycleObserverU2 = this.builder.U();
        if (lifecycleObserverU2 == null) {
            lifecycleObserverU2 = this;
        }
        lifecycle.addObserver(lifecycleObserverU2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(Balloon this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation animationN = this$0.N();
        if (animationN != null) {
            this$0.binding.f99770b.startAnimation(animationN);
        }
    }

    private final void G0() {
        FrameLayout frameLayout = this.binding.f99770b;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            Intrinsics.checkNotNullExpressionValue(animation, "animation");
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(ViewGroup parent) {
        int childCount = parent.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = parent.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof TextView) {
                l0((TextView) childAt, parent);
            } else if (childAt instanceof ViewGroup) {
                H0((ViewGroup) childAt);
            }
        }
    }

    private final Bitmap I(Drawable drawable, int width, int height) {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    private final float J(View anchor) {
        FrameLayout frameLayout = this.binding.f99773e;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i10 = t5.f.e(frameLayout).x;
        int i11 = t5.f.e(anchor).x;
        float fW = W();
        float fV = ((V() - fW) - this.builder.Y()) - this.builder.X();
        int i12 = b.$EnumSwitchMapping$1[this.builder.n().ordinal()];
        if (i12 == 1) {
            return (this.binding.f99775g.getWidth() * this.builder.m()) - (this.builder.p() * 0.5f);
        }
        if (i12 != 2) {
            throw new lf.m();
        }
        if (anchor.getWidth() + i11 >= i10) {
            if (V() + i10 >= i11) {
                float width = (((anchor.getWidth() * this.builder.m()) + i11) - i10) - (this.builder.p() * 0.5f);
                if (width > R()) {
                    if (width <= V() - R()) {
                        return width;
                    }
                }
            }
            return fV;
        }
        return fW;
    }

    private final float K(View anchor) {
        int iD = t5.f.d(anchor, this.builder.Q0());
        FrameLayout frameLayout = this.binding.f99773e;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i10 = t5.f.e(frameLayout).y - iD;
        int i11 = t5.f.e(anchor).y - iD;
        float fW = W();
        float fT = ((T() - fW) - this.builder.Z()) - this.builder.W();
        int iP = this.builder.p() / 2;
        int i12 = b.$EnumSwitchMapping$1[this.builder.n().ordinal()];
        if (i12 == 1) {
            return (this.binding.f99775g.getHeight() * this.builder.m()) - iP;
        }
        if (i12 != 2) {
            throw new lf.m();
        }
        if (anchor.getHeight() + i11 >= i10) {
            if (T() + i10 >= i11) {
                float height = (((anchor.getHeight() * this.builder.m()) + i11) - i10) - iP;
                if (height > R()) {
                    if (height <= T() - R()) {
                        return height;
                    }
                }
            }
            return fT;
        }
        return fW;
    }

    private final BitmapDrawable L(ImageView imageView, float f10, float f11) {
        if (this.builder.g() && t5.b.a()) {
            return new BitmapDrawable(imageView.getResources(), z(imageView, f10, f11));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q5.c M() {
        return (q5.c) this.autoDismissRunnable.getValue();
    }

    private final Animation N() {
        int iY;
        if (this.builder.y() == Integer.MIN_VALUE) {
            int i10 = b.$EnumSwitchMapping$4[this.builder.w().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = b.$EnumSwitchMapping$0[this.builder.k().ordinal()];
                    if (i11 == 1) {
                        iY = R$anim.f63563j;
                    } else if (i11 == 2) {
                        iY = R$anim.f63560g;
                    } else if (i11 == 3) {
                        iY = R$anim.f63562i;
                    } else {
                        if (i11 != 4) {
                            throw new lf.m();
                        }
                        iY = R$anim.f63561h;
                    }
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        this.builder.B();
                        return null;
                    }
                    iY = R$anim.f63554a;
                }
            } else if (this.builder.R0()) {
                int i12 = b.$EnumSwitchMapping$0[this.builder.k().ordinal()];
                if (i12 == 1) {
                    iY = R$anim.f63559f;
                } else if (i12 == 2) {
                    iY = R$anim.f63555b;
                } else if (i12 == 3) {
                    iY = R$anim.f63558e;
                } else {
                    if (i12 != 4) {
                        throw new lf.m();
                    }
                    iY = R$anim.f63557d;
                }
            } else {
                iY = R$anim.f63556c;
            }
        } else {
            iY = this.builder.y();
        }
        return AnimationUtils.loadAnimation(this.context, iY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.skydoves.balloon.d O() {
        return (com.skydoves.balloon.d) this.balloonPersistence.getValue();
    }

    private final Pair Q(float x10, float y10) {
        int pixel;
        int pixel2;
        Drawable background = this.binding.f99772d.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "binding.balloonCard.background");
        Bitmap bitmapI = I(background, this.binding.f99772d.getWidth() + 1, this.binding.f99772d.getHeight() + 1);
        int i10 = b.$EnumSwitchMapping$0[this.builder.k().ordinal()];
        if (i10 == 1 || i10 == 2) {
            int i11 = (int) y10;
            pixel = bitmapI.getPixel((int) ((this.builder.p() * 0.5f) + x10), i11);
            pixel2 = bitmapI.getPixel((int) (x10 - (this.builder.p() * 0.5f)), i11);
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new lf.m();
            }
            int i12 = (int) x10;
            pixel = bitmapI.getPixel(i12, (int) ((this.builder.p() * 0.5f) + y10));
            pixel2 = bitmapI.getPixel(i12, (int) (y10 - (this.builder.p() * 0.5f)));
        }
        return new Pair(Integer.valueOf(pixel), Integer.valueOf(pixel2));
    }

    private final int R() {
        return this.builder.p() * 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler S() {
        return (Handler) this.handler.getValue();
    }

    private final int U(int measuredWidth, View rootView) {
        int iY;
        int iP;
        int i10 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int paddingLeft = rootView.getPaddingLeft() + rootView.getPaddingRight();
        if (this.builder.M() != null) {
            iY = this.builder.R();
            iP = this.builder.Q();
        } else {
            iY = this.builder.Y() + this.builder.X();
            iP = this.builder.p() * 2;
        }
        int i11 = paddingLeft + iY + iP;
        int iA0 = this.builder.a0() - i11;
        if (this.builder.L0() != 0.0f) {
            return ((int) (i10 * this.builder.L0())) - i11;
        }
        if (this.builder.d0() == 0.0f && this.builder.b0() == 0.0f) {
            return (this.builder.K0() == Integer.MIN_VALUE || this.builder.K0() > i10) ? kotlin.ranges.g.j(measuredWidth, iA0) : this.builder.K0() - i11;
        }
        return kotlin.ranges.g.j(measuredWidth, ((int) (i10 * (this.builder.b0() == 0.0f ? 1.0f : this.builder.b0()))) - i11);
    }

    private final float W() {
        return (this.builder.p() * this.builder.d()) + this.builder.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        return (this.builder.T() == null && this.builder.S() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(final View anchor) {
        final ImageView imageView = this.binding.f99771c;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(this.builder.p(), this.builder.p()));
        imageView.setAlpha(this.builder.b());
        Drawable drawableH = this.builder.h();
        if (drawableH != null) {
            imageView.setImageDrawable(drawableH);
        }
        imageView.setPadding(this.builder.j(), this.builder.q(), this.builder.o(), this.builder.e());
        if (this.builder.f() != Integer.MIN_VALUE) {
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(this.builder.f()));
        } else {
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(this.builder.s()));
        }
        imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        this.binding.f99772d.post(new Runnable() { // from class: q5.g
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.a0(this.f98697b, anchor, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(Balloon this$0, View anchor, ImageView this_with) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anchor, "$anchor");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.getClass();
        this$0.A(anchor);
        int i10 = b.$EnumSwitchMapping$0[com.skydoves.balloon.a.f63586b.a(this$0.builder.k(), this$0.builder.P0()).ordinal()];
        if (i10 == 1) {
            this_with.setRotation(180.0f);
            this_with.setX(this$0.J(anchor));
            this_with.setY((this$0.binding.f99772d.getY() + this$0.binding.f99772d.getHeight()) - 1);
            ViewCompat.setElevation(this_with, this$0.builder.i());
            this_with.setForeground(this$0.L(this_with, this_with.getX(), this$0.binding.f99772d.getHeight()));
        } else if (i10 == 2) {
            this_with.setRotation(0.0f);
            this_with.setX(this$0.J(anchor));
            this_with.setY((this$0.binding.f99772d.getY() - this$0.builder.p()) + 1);
            this_with.setForeground(this$0.L(this_with, this_with.getX(), 0.0f));
        } else if (i10 == 3) {
            this_with.setRotation(-90.0f);
            this_with.setX((this$0.binding.f99772d.getX() - this$0.builder.p()) + 1);
            this_with.setY(this$0.K(anchor));
            this_with.setForeground(this$0.L(this_with, 0.0f, this_with.getY()));
        } else if (i10 == 4) {
            this_with.setRotation(90.0f);
            this_with.setX((this$0.binding.f99772d.getX() + this$0.binding.f99772d.getWidth()) - 1);
            this_with.setY(this$0.K(anchor));
            this_with.setForeground(this$0.L(this_with, this$0.binding.f99772d.getWidth(), this_with.getY()));
        }
        t5.f.f(this_with, this$0.builder.R0());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void b0() {
        RadiusLayout radiusLayout = this.binding.f99772d;
        radiusLayout.setAlpha(this.builder.b());
        radiusLayout.setRadius(this.builder.D());
        ViewCompat.setElevation(radiusLayout, this.builder.J());
        Drawable drawableT = this.builder.t();
        Drawable drawable = drawableT;
        if (drawableT == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.builder.s());
            gradientDrawable.setCornerRadius(this.builder.D());
            drawable = gradientDrawable;
        }
        radiusLayout.setBackground(drawable);
        radiusLayout.setPadding(this.builder.t0(), this.builder.v0(), this.builder.u0(), this.builder.s0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        int iP = this.builder.p() - 1;
        int iJ = (int) this.builder.J();
        FrameLayout frameLayout = this.binding.f99773e;
        int i10 = b.$EnumSwitchMapping$0[this.builder.k().ordinal()];
        if (i10 == 1) {
            frameLayout.setPadding(iJ, iP, iJ, kotlin.ranges.g.e(iP, iJ));
            return;
        }
        if (i10 == 2) {
            frameLayout.setPadding(iJ, iP, iJ, kotlin.ranges.g.e(iP, iJ));
        } else if (i10 == 3) {
            frameLayout.setPadding(iP, iJ, iP, iJ);
        } else {
            if (i10 != 4) {
                return;
            }
            frameLayout.setPadding(iP, iJ, iP, iJ);
        }
    }

    private final void d0() {
        if (Y()) {
            i0();
        } else {
            j0();
            k0();
        }
    }

    private final void e0() {
        this.builder.f0();
        o0(null);
        this.builder.g0();
        q0(null);
        this.builder.i0();
        s0(null);
        y0(this.builder.l0());
        this.builder.j0();
        t0(null);
        v0(this.builder.k0());
    }

    private final void f0() {
        if (this.builder.S0()) {
            BalloonAnchorOverlayView balloonAnchorOverlayView = this.overlayBinding.f99777b;
            balloonAnchorOverlayView.setOverlayColor(this.builder.m0());
            balloonAnchorOverlayView.setOverlayPadding(this.builder.o0());
            balloonAnchorOverlayView.setOverlayPosition(this.builder.q0());
            balloonAnchorOverlayView.setBalloonOverlayShape(this.builder.r0());
            balloonAnchorOverlayView.setOverlayPaddingColor(this.builder.p0());
            this.overlayWindow.setClippingEnabled(false);
        }
    }

    private final void g0() {
        ViewGroup.LayoutParams layoutParams = this.binding.f99775g.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(this.builder.X(), this.builder.Z(), this.builder.Y(), this.builder.W());
    }

    private final void h0() {
        PopupWindow popupWindow = this.bodyWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(this.builder.O0());
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(this.builder.J());
        n0(this.builder.M0());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i0() {
        /*
            r4 = this;
            com.skydoves.balloon.Balloon$a r0 = r4.builder
            java.lang.Integer r0 = r0.T()
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            android.content.Context r1 = r4.context
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            s5.a r2 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r2 = r2.f99772d
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r2, r3)
            if (r0 != 0) goto L25
        L1d:
            com.skydoves.balloon.Balloon$a r0 = r4.builder
            android.view.View r0 = r0.S()
            if (r0 == 0) goto L51
        L25:
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L30
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L36
            r1.removeView(r0)
        L36:
            s5.a r1 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r1 = r1.f99772d
            r1.removeAllViews()
            s5.a r1 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r1 = r1.f99772d
            r1.addView(r0)
            s5.a r0 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r0 = r0.f99772d
            java.lang.String r1 = "binding.balloonCard"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r4.H0(r0)
            return
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The custom layout is null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon.i0():void");
    }

    private final void j0() {
        Unit unit;
        VectorTextView initializeIcon$lambda$16 = this.binding.f99774f;
        com.skydoves.balloon.e eVarN = this.builder.N();
        if (eVarN != null) {
            Intrinsics.checkNotNullExpressionValue(initializeIcon$lambda$16, "initializeIcon$lambda$16$lambda$14");
            t5.d.b(initializeIcon$lambda$16, eVarN);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullExpressionValue(initializeIcon$lambda$16, "initializeIcon$lambda$16");
            Context context = initializeIcon$lambda$16.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            e.a aVar = new e.a(context);
            aVar.j(this.builder.M());
            aVar.o(this.builder.R());
            aVar.m(this.builder.P());
            aVar.l(this.builder.L());
            aVar.n(this.builder.Q());
            aVar.k(this.builder.O());
            t5.d.b(initializeIcon$lambda$16, aVar.a());
        }
        initializeIcon$lambda$16.b(this.builder.P0());
    }

    private final void k0() {
        Unit unit;
        VectorTextView initializeText$lambda$19 = this.binding.f99774f;
        com.skydoves.balloon.f fVarD0 = this.builder.D0();
        if (fVarD0 != null) {
            Intrinsics.checkNotNullExpressionValue(initializeText$lambda$19, "initializeText$lambda$19$lambda$17");
            t5.d.c(initializeText$lambda$19, fVarD0);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullExpressionValue(initializeText$lambda$19, "initializeText$lambda$19");
            Context context = initializeText$lambda$19.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            f.a aVar = new f.a(context);
            aVar.k(this.builder.B0());
            aVar.p(this.builder.H0());
            aVar.l(this.builder.C0());
            aVar.n(this.builder.F0());
            aVar.m(this.builder.E0());
            aVar.q(this.builder.I0());
            aVar.r(this.builder.J0());
            aVar.o(this.builder.G0());
            initializeText$lambda$19.setMovementMethod(this.builder.e0());
            t5.d.c(initializeText$lambda$19, aVar.a());
        }
        Intrinsics.checkNotNullExpressionValue(initializeText$lambda$19, "this");
        RadiusLayout radiusLayout = this.binding.f99772d;
        Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
        l0(initializeText$lambda$19, radiusLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(TextView textView, View rootView) {
        int iC;
        int compoundPaddingStart;
        int compoundPaddingEnd;
        int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "compoundDrawablesRelative");
        if (!t5.a.e(compoundDrawablesRelative)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            Intrinsics.checkNotNullExpressionValue(compoundDrawables, "compoundDrawables");
            if (t5.a.e(compoundDrawables)) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables2, "compoundDrawables");
                textView.setMinHeight(t5.a.b(compoundDrawables2));
                Drawable[] compoundDrawables3 = textView.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables3, "compoundDrawables");
                iC = t5.a.c(compoundDrawables3);
                compoundPaddingStart = textView.getCompoundPaddingStart();
                compoundPaddingEnd = textView.getCompoundPaddingEnd();
            }
            textView.setMaxWidth(U(iMeasureText, rootView));
        }
        Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative2, "compoundDrawablesRelative");
        textView.setMinHeight(t5.a.b(compoundDrawablesRelative2));
        Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative3, "compoundDrawablesRelative");
        iC = t5.a.c(compoundDrawablesRelative3);
        compoundPaddingStart = textView.getCompoundPaddingStart();
        compoundPaddingEnd = textView.getCompoundPaddingEnd();
        iMeasureText += iC + compoundPaddingStart + compoundPaddingEnd;
        textView.setMaxWidth(U(iMeasureText, rootView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(View anchor) {
        if (this.builder.w0()) {
            w0(new h(anchor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(n nVar, Balloon this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (nVar != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            nVar.a(it);
        }
        if (this$0.builder.E()) {
            this$0.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Balloon this$0, o oVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G0();
        this$0.G();
        if (oVar != null) {
            oVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(r rVar, Balloon this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (rVar != null) {
            rVar.a();
        }
        if (this$0.builder.G()) {
            this$0.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x0(Function2 tmp0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(view, motionEvent)).booleanValue();
    }

    private final Bitmap z(ImageView imageView, float x10, float y10) {
        LinearGradient linearGradient;
        int iS = this.builder.s();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iS, mode);
        Drawable drawable = imageView.getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "imageView.drawable");
        Bitmap bitmapI = I(drawable, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight());
        try {
            Pair pairQ = Q(x10, y10);
            int iIntValue = ((Number) pairQ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairQ.getSecond()).intValue();
            Bitmap updatedBitmap = Bitmap.createBitmap(bitmapI.getWidth(), bitmapI.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(updatedBitmap);
            canvas.drawBitmap(bitmapI, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint();
            int i10 = b.$EnumSwitchMapping$0[this.builder.k().ordinal()];
            if (i10 == 1) {
                linearGradient = new LinearGradient((bitmapI.getWidth() / 2) - (this.builder.p() * 0.5f), 0.0f, bitmapI.getWidth(), 0.0f, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new lf.m();
                        }
                    }
                    linearGradient = new LinearGradient((bitmapI.getWidth() / 2) - (this.builder.p() * 0.5f), 0.0f, bitmapI.getWidth(), 0.0f, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
                }
                linearGradient = new LinearGradient((bitmapI.getWidth() / 2) + (this.builder.p() * 0.5f), 0.0f, 0.0f, 0.0f, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
            }
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.drawRect(0.0f, 0.0f, bitmapI.getWidth(), bitmapI.getHeight(), paint);
            imageView.setColorFilter(0, mode);
            Intrinsics.checkNotNullExpressionValue(updatedBitmap, "updatedBitmap");
            return updatedBitmap;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Arrow attached outside balloon. Could not get a matching color.");
        }
    }

    public final void A0(View anchor, int xOff, int yOff) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        View[] viewArr = {anchor};
        View view = viewArr[0];
        if (E(view)) {
            view.post(new j(view, viewArr, this, anchor, xOff, yOff));
        } else if (this.builder.H()) {
            G();
        }
    }

    public final void G() {
        if (this.isShowing) {
            f fVar = new f();
            if (this.builder.u() != k.CIRCULAR) {
                fVar.invoke();
                return;
            }
            View contentView = this.bodyWindow.getContentView();
            Intrinsics.checkNotNullExpressionValue(contentView, "this.bodyWindow.contentView");
            contentView.post(new e(contentView, this.builder.C(), fVar));
        }
    }

    public final boolean H(long delay) {
        return S().postDelayed(M(), delay);
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final PopupWindow getBodyWindow() {
        return this.bodyWindow;
    }

    public final int T() {
        return this.builder.K() != Integer.MIN_VALUE ? this.builder.K() : this.binding.getRoot().getMeasuredHeight();
    }

    public final int V() {
        int i10 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        if (this.builder.L0() != 0.0f) {
            return (int) (i10 * this.builder.L0());
        }
        if (this.builder.d0() == 0.0f && this.builder.b0() == 0.0f) {
            return this.builder.K0() != Integer.MIN_VALUE ? kotlin.ranges.g.j(this.builder.K0(), i10) : kotlin.ranges.g.n(this.binding.getRoot().getMeasuredWidth(), this.builder.c0(), this.builder.a0());
        }
        float f10 = i10;
        return kotlin.ranges.g.n(this.binding.getRoot().getMeasuredWidth(), (int) (this.builder.d0() * f10), (int) (f10 * (this.builder.b0() == 0.0f ? 1.0f : this.builder.b0())));
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final PopupWindow getOverlayWindow() {
        return this.overlayWindow;
    }

    public final Balloon n0(boolean value) {
        this.bodyWindow.setAttachedInDecor(value);
        return this;
    }

    public final void o0(final n onBalloonClickListener) {
        if (onBalloonClickListener != null || this.builder.E()) {
            this.binding.f99775g.setOnClickListener(new View.OnClickListener(onBalloonClickListener, this) { // from class: q5.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Balloon f98700b;

                {
                    this.f98700b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Balloon.p0(null, this.f98700b, view);
                }
            });
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        androidx.lifecycle.c.b(this, owner);
        this.destroyed = true;
        this.overlayWindow.dismiss();
        this.bodyWindow.dismiss();
        LifecycleOwner lifecycleOwnerV = this.builder.V();
        if (lifecycleOwnerV == null || (lifecycle = lifecycleOwnerV.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        androidx.lifecycle.c.c(this, owner);
        if (this.builder.F()) {
            G();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }

    public final void q0(final o onBalloonDismissListener) {
        this.bodyWindow.setOnDismissListener(new PopupWindow.OnDismissListener(onBalloonDismissListener) { // from class: q5.i
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Balloon.r0(this.f98701b, null);
            }
        });
    }

    public final void s0(q onBalloonOutsideTouchListener) {
        this.bodyWindow.setTouchInterceptor(new i(onBalloonOutsideTouchListener));
    }

    public final void t0(final r onBalloonOverlayClickListener) {
        this.overlayBinding.getRoot().setOnClickListener(new View.OnClickListener(onBalloonOverlayClickListener, this) { // from class: q5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Balloon f98695b;

            {
                this.f98695b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Balloon.u0(null, this.f98695b, view);
            }
        });
    }

    public final void v0(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.overlayWindow.setTouchInterceptor(onTouchListener);
        }
    }

    public final void w0(final Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        v0(new View.OnTouchListener() { // from class: q5.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Balloon.x0(block, view, motionEvent);
            }
        });
    }

    public final void y0(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.bodyWindow.setTouchInterceptor(onTouchListener);
        }
    }

    public final void z0(View anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        B0(this, anchor, 0, 0, 6, null);
    }

    private Balloon(Context context, a aVar) {
        this.context = context;
        this.builder = aVar;
        s5.a aVarC = s5.a.c(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(LayoutInflater.from(context), null, false)");
        this.binding = aVarC;
        s5.b bVarC = s5.b.c(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(LayoutInflater.from(context), null, false)");
        this.overlayBinding = bVarC;
        this.bodyWindow = new PopupWindow(aVarC.getRoot(), -2, -2);
        this.overlayWindow = new PopupWindow(bVarC.getRoot(), -1, -1);
        aVar.h0();
        lf.l lVar = lf.l.f94211d;
        this.handler = lf.i.b(lVar, g.f63544f);
        this.autoDismissRunnable = lf.i.b(lVar, new c());
        this.balloonPersistence = lf.i.b(lVar, new d());
        F();
    }
}
