package com.pubmatic.sdk.common.ctaoverlay;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.MainThread;
import androidx.cardview.widget.CardView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4424m2;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.common.R$dimen;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBImageDownloadManager;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.view.cta.POBCTAOverlayAnimationHandler;
import com.pubmatic.sdk.common.view.cta.POBCTAOverlayView;
import com.pubmatic.sdk.common.view.cta.POBFullscreenCTAOverlayView;
import com.pubmatic.sdk.common.view.cta.POBMrecCTAOverlayView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\u00020\u0001:\u0003BC\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000b\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\fJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0014\u0010/\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler;", "", "Landroid/view/ViewGroup;", "parentView", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "ctaOverlayData", "", "isMrec", "<init>", "(Landroid/view/ViewGroup;Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;Z)V", "", "a", "()V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "", "iconUrl", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)V", "b", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$POBCTAOverlayListener;", "ctaOverlayListener", "setCTAOverlayListener", "(Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$POBCTAOverlayListener;)V", "", POBCTAOverlayData.KEY_CTA_DELAY, "showWithDelay", "(I)V", C4424m2.f43623v, MenuActionType.HIDE, "invalidateTimer", "cleanUp", "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", "getOverlayView", "()Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", "isShowWithDelayInitiated", "()Z", "Landroid/view/ViewGroup;", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "Z", "Landroid/content/Context;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", "ctaOverlayView", "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayAnimationHandler;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayAnimationHandler;", "ctaOverlayAnimationHandler", "g", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$POBCTAOverlayListener;", "Lcom/pubmatic/sdk/common/utility/POBTimeoutHandler;", "h", "Lcom/pubmatic/sdk/common/utility/POBTimeoutHandler;", "timeOutHandler", "Lcom/pubmatic/sdk/common/utility/POBImageDownloadManager;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/pubmatic/sdk/common/utility/POBImageDownloadManager;", "imageDownloadManager", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$a;", "j", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$a;", "state", y.f66058y, "POBCTAOverlayListener", "common_release"}, k = 1, mv = {1, 7, 1})
@MainThread
public final class POBCTAOverlayHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup parentView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final POBCTAOverlayData ctaOverlayData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isMrec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final POBCTAOverlayView ctaOverlayView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final POBCTAOverlayAnimationHandler ctaOverlayAnimationHandler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private POBCTAOverlayListener ctaOverlayListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private POBTimeoutHandler timeOutHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private POBImageDownloadManager imageDownloadManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$Companion;", "", "()V", "SECONDS_TO_MILLIS_FACTOR", "", "TAG", "", "isCTAOverlayValid", "", "ctaOverlayData", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isCTAOverlayValid(@Nullable POBCTAOverlayData ctaOverlayData) {
            String title;
            String clickUrl;
            return (ctaOverlayData == null || (title = ctaOverlayData.getTitle()) == null || title.length() == 0 || (clickUrl = ctaOverlayData.getClickUrl()) == null || clickUrl.length() == 0) ? false : true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayHandler$POBCTAOverlayListener;", "", "onClick", "", "onDismiss", "onShow", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface POBCTAOverlayListener {
        void onClick();

        void onDismiss();

        void onShow();
    }

    private enum a {
        DEFAULT,
        SHOW_DELAY_INITIATED,
        SHOWN,
        HIDDEN,
        INVALIDATED_DELAY_TIMER
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        public final void a() {
            POBCTAOverlayListener pOBCTAOverlayListener;
            if (POBCTAOverlayHandler.this.ctaOverlayData.isDismissible() == 0 || (pOBCTAOverlayListener = POBCTAOverlayHandler.this.ctaOverlayListener) == null) {
                return;
            }
            pOBCTAOverlayListener.onDismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f62331a = new c();

        c() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public POBCTAOverlayHandler(@NotNull ViewGroup parentView, @NotNull POBCTAOverlayData ctaOverlayData, boolean z10) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(ctaOverlayData, "ctaOverlayData");
        this.parentView = parentView;
        this.ctaOverlayData = ctaOverlayData;
        this.isMrec = z10;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parentView.context");
        this.context = context;
        POBCTAOverlayView pOBMrecCTAOverlayView = z10 ? new POBMrecCTAOverlayView(context) : new POBFullscreenCTAOverlayView(context);
        this.ctaOverlayView = pOBMrecCTAOverlayView;
        this.ctaOverlayAnimationHandler = new POBCTAOverlayAnimationHandler(pOBMrecCTAOverlayView);
        this.state = a.DEFAULT;
        c();
        pOBMrecCTAOverlayView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
                POBCTAOverlayHandler.this.invalidateTimer();
                POBCTAOverlayHandler.this.ctaOverlayView.removeOnAttachStateChangeListener(this);
            }
        });
        POBLog.debug("POBCTAOverlayHandler", "Created new CTA overlay view", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBCTAOverlayHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.show();
        this$0.ctaOverlayAnimationHandler.startEntranceAnimation(c.f62331a);
    }

    public static final boolean isCTAOverlayValid(@Nullable POBCTAOverlayData pOBCTAOverlayData) {
        return INSTANCE.isCTAOverlayValid(pOBCTAOverlayData);
    }

    public final void cleanUp() {
        invalidateTimer();
        POBImageDownloadManager pOBImageDownloadManager = this.imageDownloadManager;
        if (pOBImageDownloadManager != null) {
            pOBImageDownloadManager.cancel();
        }
        this.parentView.removeView(this.ctaOverlayView);
    }

    @NotNull
    /* JADX INFO: renamed from: getOverlayView, reason: from getter */
    public final POBCTAOverlayView getCtaOverlayView() {
        return this.ctaOverlayView;
    }

    public final void hide() {
        this.state = a.HIDDEN;
        this.ctaOverlayView.setVisibility(8);
    }

    public final void invalidateTimer() {
        this.state = a.INVALIDATED_DELAY_TIMER;
        POBTimeoutHandler pOBTimeoutHandler = this.timeOutHandler;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
    }

    public final boolean isShowWithDelayInitiated() {
        return this.state == a.SHOW_DELAY_INITIATED;
    }

    public final void setCTAOverlayListener(@NotNull POBCTAOverlayListener ctaOverlayListener) {
        Intrinsics.checkNotNullParameter(ctaOverlayListener, "ctaOverlayListener");
        this.ctaOverlayListener = ctaOverlayListener;
    }

    public final void show() {
        if (this.ctaOverlayView.getParent() == null) {
            a();
        }
        this.ctaOverlayView.setVisibility(0);
        this.ctaOverlayView.bringToFront();
        this.state = a.SHOWN;
        POBCTAOverlayListener pOBCTAOverlayListener = this.ctaOverlayListener;
        if (pOBCTAOverlayListener != null) {
            pOBCTAOverlayListener.onShow();
        }
    }

    public final void showWithDelay(int delay) {
        this.state = a.SHOW_DELAY_INITIATED;
        long jMax = Math.max(0L, ((long) delay) * 1000);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new POBTimeoutHandler.POBTimeoutHandlerListener() { // from class: com.pubmatic.sdk.common.ctaoverlay.b
            @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
            public final void onTimeout() {
                POBCTAOverlayHandler.a(this.f62334a);
            }
        });
        this.timeOutHandler = pOBTimeoutHandler;
        pOBTimeoutHandler.start(jMax);
    }

    private final void b() {
        ImageView icon = this.ctaOverlayView.getIcon();
        icon.setVisibility(8);
        ViewParent parent = icon.getParent();
        CardView cardView = parent instanceof CardView ? (CardView) parent : null;
        if (cardView != null) {
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = 0;
            }
        }
    }

    private final void c() {
        POBCTAOverlayView pOBCTAOverlayView = this.ctaOverlayView;
        pOBCTAOverlayView.getTitle().setText(this.ctaOverlayData.getTitle());
        pOBCTAOverlayView.getCtaButton().setText(this.ctaOverlayData.getCtaText());
        try {
            pOBCTAOverlayView.getCtaButton().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this.ctaOverlayData.getCtaButtonBgColor())));
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
        try {
            pOBCTAOverlayView.getCtaButton().setTextColor(Color.parseColor(this.ctaOverlayData.getCtaTextColor()));
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
        }
        pOBCTAOverlayView.getCtaButton().setOnClickListener(new View.OnClickListener() { // from class: com.pubmatic.sdk.common.ctaoverlay.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                POBCTAOverlayHandler.a(this.f62335b, view);
            }
        });
        if (!this.isMrec) {
            POBCTAOverlayView pOBCTAOverlayView2 = this.ctaOverlayView;
            if (pOBCTAOverlayView2 instanceof POBFullscreenCTAOverlayView) {
                ((POBFullscreenCTAOverlayView) pOBCTAOverlayView2).getHeader().setText(this.ctaOverlayData.getHeader());
                ((POBFullscreenCTAOverlayView) this.ctaOverlayView).getDescription().setText(this.ctaOverlayData.getDescription());
            }
        }
        d();
    }

    private final void d() {
        Unit unit;
        String iconImageUrl = this.ctaOverlayData.getIconImageUrl();
        if (iconImageUrl != null) {
            a(iconImageUrl);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            b();
        }
    }

    private final void a() {
        int i10;
        int dimensionPixelOffset;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelOffset2 = this.context.getResources().getDimensionPixelOffset(R$dimen.pob_dimen_12dp);
        if (this.isMrec) {
            dimensionPixelOffset = this.context.getResources().getDimensionPixelOffset(R$dimen.pob_cta_overlay_mrec_bottom_position);
        } else {
            Resources resources = this.context.getResources();
            if (this.ctaOverlayData.getPosition() == 1) {
                i10 = R$dimen.pob_cta_overlay_bottom_raised_position;
            } else {
                i10 = R$dimen.pob_cta_overlay_bottom_position;
            }
            dimensionPixelOffset = resources.getDimensionPixelOffset(i10);
        }
        layoutParams.setMargins(dimensionPixelOffset2, 0, dimensionPixelOffset2, dimensionPixelOffset);
        layoutParams.gravity = 81;
        this.ctaOverlayAnimationHandler.applyDragAnimator(layoutParams.bottomMargin, new b());
        this.parentView.addView(this.ctaOverlayView, layoutParams);
        this.ctaOverlayView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBCTAOverlayHandler this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        POBCTAOverlayListener pOBCTAOverlayListener = this$0.ctaOverlayListener;
        if (pOBCTAOverlayListener != null) {
            pOBCTAOverlayListener.onClick();
        }
    }

    private final void a(final String iconUrl) {
        POBImageDownloadManager pOBImageDownloadManager = new POBImageDownloadManager(this.context, SetsKt.hashSetOf(iconUrl));
        pOBImageDownloadManager.setListener(new POBImageDownloadManager.POBImageDownloadListener() { // from class: com.pubmatic.sdk.common.ctaoverlay.a
            @Override // com.pubmatic.sdk.common.utility.POBImageDownloadManager.POBImageDownloadListener
            public final void onComplete(Map map) {
                POBCTAOverlayHandler.a(iconUrl, this, map);
            }
        });
        pOBImageDownloadManager.start();
        this.imageDownloadManager = pOBImageDownloadManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String iconUrl, POBCTAOverlayHandler this$0, Map downloadedImages) {
        Intrinsics.checkNotNullParameter(iconUrl, "$iconUrl");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadedImages, "downloadedImages");
        Bitmap bitmap = (Bitmap) downloadedImages.get(iconUrl);
        if (bitmap != null) {
            this$0.a(bitmap);
        } else {
            this$0.b();
        }
    }

    private final void a(Bitmap bitmap) {
        this.ctaOverlayView.getIcon().setImageDrawable(new BitmapDrawable(this.context.getResources(), bitmap));
    }
}
