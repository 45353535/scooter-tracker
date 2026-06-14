package net.pubnative.lite.sdk.views.endcard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.CountdownStyle;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.views.CustomImageView;
import net.pubnative.lite.sdk.views.endcard.HyBidEndCardView;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.ReplayListener;
import net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer;
import net.pubnative.lite.sdk.vpaid.utils.ImageUtils;
import net.pubnative.lite.sdk.vpaid.widget.CountDownView;
import net.pubnative.lite.sdk.vpaid.widget.CountDownViewFactory;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidEndCardView extends FrameLayout {
    private static final CountdownStyle COUNTDOWN_STYLE_DEFAULT = CountdownStyle.PIE_CHART;
    private String endCardType;
    private EndCardViewListener endcardViewListener;
    private GestureDetector gestureDetector;
    private boolean hasReducedClose;
    private FrameLayout htmlEndCardContainer;
    private Boolean isCustomEndCard;
    private boolean isViewShowingCloseButton;
    private boolean isViewShowingSkipButton;
    private CountDownView mCloseCountdownView;
    private SimpleTimer mCloseEndcardTimer;
    private ImageView mCloseView;
    private MRAIDBanner mHtmlEndCardView;
    private SimpleTimer mSkipEndcardTimer;
    private ImageView mSkipView;
    private MRAIDNativeFeatureListener mraidNativeFeatureListener;
    private final MRAIDViewListener mraidViewListener;
    private ReplayListener replayListener;
    private SkipOffset skipOffset;
    private ImageView staticEndCardView;

    public interface EndCardViewListener {
        void onClick(String str, Boolean bool, String str2);

        void onClose(Boolean bool);

        void onLoadFail(Boolean bool);

        void onLoadSuccess(Boolean bool);

        void onShow(Boolean bool, String str);

        void onSkip();
    }

    public HyBidEndCardView(Context context) {
        super(context);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* JADX INFO: renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC10981 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC10981() {
                }

                public static /* synthetic */ void a(ViewTreeObserverOnDrawListenerC10981 viewTreeObserverOnDrawListenerC10981) {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC10981);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC10981.a(this.f96044b);
                            }
                        });
                    }
                    MRAIDBanner mRAIDBanner = HyBidEndCardView.this.mHtmlEndCardView;
                    if (mRAIDBanner == null || mRAIDBanner.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                hyBidEndCardView.endcardViewListener.onLoadFail(hyBidEndCardView.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onLoadSuccess(hyBidEndCardView.isCustomEndCard);
                    HyBidEndCardView hyBidEndCardView2 = HyBidEndCardView.this;
                    hyBidEndCardView2.endcardViewListener.onShow(hyBidEndCardView2.isCustomEndCard, hyBidEndCardView2.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC10981());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                ReplayListener replayListener = HyBidEndCardView.this.replayListener;
                if (replayListener != null) {
                    replayListener.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onClick(str, hyBidEndCardView.isCustomEndCard, hyBidEndCardView.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        init(context);
    }

    public static /* synthetic */ void a(HyBidEndCardView hyBidEndCardView, View view) {
        EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onClick(null, hyBidEndCardView.isCustomEndCard, hyBidEndCardView.endCardType);
        }
    }

    public static /* synthetic */ void b(HyBidEndCardView hyBidEndCardView, CloseButtonListener closeButtonListener) {
        hyBidEndCardView.mCloseView.setVisibility(0);
        hyBidEndCardView.mCloseView.bringToFront();
        if (closeButtonListener != null) {
            closeButtonListener.onCloseButtonVisible();
        }
    }

    public static /* synthetic */ void c(HyBidEndCardView hyBidEndCardView, View view) {
        EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onSkip();
        }
    }

    private void clearEndCardViews() {
        FrameLayout frameLayout = this.htmlEndCardContainer;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.htmlEndCardContainer = null;
        }
        ImageView imageView = this.staticEndCardView;
        if (imageView != null) {
            removeView(imageView);
            this.staticEndCardView.setImageDrawable(null);
            this.staticEndCardView = null;
            MRAIDBanner mRAIDBanner = this.mHtmlEndCardView;
            if (mRAIDBanner != null) {
                mRAIDBanner.destroy();
            }
        }
    }

    private void configUi(EndCardData endCardData) {
        if (endCardData == null) {
            return;
        }
        if (endCardData.isCustom().booleanValue()) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    private FrameLayout createHtmlEndCardContainer() {
        if (!isValidContext()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setVisibility(8);
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    private ImageView createStaticEndCardView() {
        if (!isValidContext()) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        CustomImageView customImageView = new CustomImageView(getContext());
        customImageView.setLayoutParams(layoutParams);
        customImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        customImageView.setVisibility(8);
        customImageView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.endcard.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyBidEndCardView.a(this.f96043b, view);
            }
        });
        this.endCardType = "static";
        return customImageView;
    }

    public static /* synthetic */ void d(HyBidEndCardView hyBidEndCardView, View view) {
        EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onClose(hyBidEndCardView.isCustomEndCard);
        }
    }

    public static /* synthetic */ void e(HyBidEndCardView hyBidEndCardView) {
        hyBidEndCardView.mSkipView.setVisibility(0);
        hyBidEndCardView.mSkipView.bringToFront();
    }

    private void ensureOverlayOrder() {
        ImageView imageView = this.mSkipView;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.mCloseView;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        CountDownView countDownView = this.mCloseCountdownView;
        if (countDownView != null) {
            countDownView.bringToFront();
        }
        postInvalidateOnAnimation();
    }

    private void init(Context context) {
        initUi();
        initControlViews(context);
    }

    private void initControlViews(Context context) {
        if (!isValidContext()) {
            EndCardViewListener endCardViewListener = this.endcardViewListener;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadFail(this.isCustomEndCard);
                return;
            }
            return;
        }
        int iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
        if (this.hasReducedClose) {
            iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(20.0f, getContext());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iConvertDpToPixel, iConvertDpToPixel);
        layoutParams.gravity = GravityCompat.START;
        int iConvertDpToPixel2 = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
        layoutParams.setMargins(iConvertDpToPixel2, iConvertDpToPixel2, 0, 0);
        ImageView imageView = new ImageView(getContext());
        this.mSkipView = imageView;
        if (this.hasReducedClose) {
            imageView.setId(R.id.end_card_skip_view_small);
        } else {
            imageView.setId(R.id.end_card_skip_view);
        }
        this.mSkipView.setLayoutParams(layoutParams);
        this.mSkipView.setImageResource(R.mipmap.skip);
        this.mSkipView.setVisibility(8);
        this.mSkipView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.endcard.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyBidEndCardView.c(this.f96038b, view);
            }
        });
        ImageView imageView2 = new ImageView(getContext());
        this.mCloseView = imageView2;
        if (this.hasReducedClose) {
            imageView2.setId(R.id.button_fullscreen_close_small);
        } else {
            imageView2.setId(R.id.button_fullscreen_close);
        }
        CountDownView countDownViewCreateCountdownView = new CountDownViewFactory().createCountdownView(context, COUNTDOWN_STYLE_DEFAULT, this);
        this.mCloseCountdownView = countDownViewCreateCountdownView;
        countDownViewCreateCountdownView.setId(R.id.endcard_close_countdown_view);
        int iConvertDpToPixel3 = (int) ViewUtils.convertDpToPixel(this.hasReducedClose ? 60.0f : 80.0f, context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iConvertDpToPixel3, iConvertDpToPixel3);
        layoutParams2.gravity = 8388659;
        layoutParams2.setMargins(iConvertDpToPixel2, iConvertDpToPixel2, iConvertDpToPixel2, iConvertDpToPixel2);
        this.mCloseCountdownView.setLayoutParams(layoutParams2);
        this.mCloseCountdownView.setVisibility(8);
        this.mCloseView.setLayoutParams(layoutParams);
        this.mCloseView.setImageResource(R.mipmap.close);
        this.mCloseView.setVisibility(8);
        this.mCloseView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.endcard.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyBidEndCardView.d(this.f96039b, view);
            }
        });
        addView(this.mSkipView);
        addView(this.mCloseView);
        addView(this.mCloseCountdownView);
    }

    private void initUi() {
        if (isValidContext()) {
            setVisibility(8);
            setBackgroundColor(0);
            try {
                this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.3
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                        return true;
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        EndCardViewListener endCardViewListener = this.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onLoadFail(this.isCustomEndCard);
        }
    }

    private boolean isValidContext() {
        return getContext() != null;
    }

    private void removeExistingEndcardViews() {
        ImageView imageView = this.staticEndCardView;
        if (imageView != null) {
            removeView(imageView);
            this.staticEndCardView = null;
        }
        FrameLayout frameLayout = this.htmlEndCardContainer;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.htmlEndCardContainer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderHtmlEndcard(String str, boolean z10) {
        if (!isValidContext()) {
            this.endcardViewListener.onLoadFail(this.isCustomEndCard);
            return;
        }
        Context context = getContext();
        Boolean bool = Boolean.FALSE;
        MRAIDBanner mRAIDBanner = new MRAIDBanner(context, "", str, bool, bool, new String[0], this.mraidViewListener, this.mraidNativeFeatureListener, null);
        this.mHtmlEndCardView = mRAIDBanner;
        mRAIDBanner.setSkipOffset(Integer.valueOf(this.skipOffset.getOffset()));
        this.mHtmlEndCardView.setUseCustomClose(Boolean.TRUE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.gravity = 16;
        this.mHtmlEndCardView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.htmlEndCardContainer;
        if (frameLayout == null) {
            EndCardViewListener endCardViewListener = this.endcardViewListener;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadFail(this.isCustomEndCard);
                return;
            }
            return;
        }
        frameLayout.addView(this.mHtmlEndCardView);
        ensureOverlayOrder();
        EndCardViewListener endCardViewListener2 = this.endcardViewListener;
        if (endCardViewListener2 != null) {
            endCardViewListener2.onLoadSuccess(this.isCustomEndCard);
            this.endcardViewListener.onShow(this.isCustomEndCard, this.endCardType);
        }
    }

    public void destroy() {
        SimpleTimer simpleTimer = this.mSkipEndcardTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
        }
        SimpleTimer simpleTimer2 = this.mCloseEndcardTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.cancel();
        }
        clearEndCardViews();
    }

    public void hide() {
        clearEndCardViews();
        setVisibility(8);
    }

    public void hideSkipButton() {
        this.mSkipView.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void pause() {
        SimpleTimer simpleTimer = this.mSkipEndcardTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
        }
        SimpleTimer simpleTimer2 = this.mCloseEndcardTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.pause();
        }
        MRAIDBanner mRAIDBanner = this.mHtmlEndCardView;
        if (mRAIDBanner != null) {
            mRAIDBanner.pause();
        }
    }

    public void resume() {
        SimpleTimer simpleTimer = this.mSkipEndcardTimer;
        if (simpleTimer != null) {
            simpleTimer.resume();
        }
        SimpleTimer simpleTimer2 = this.mCloseEndcardTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.resume();
        }
        MRAIDBanner mRAIDBanner = this.mHtmlEndCardView;
        if (mRAIDBanner != null) {
            mRAIDBanner.resume();
        }
    }

    public void setEndCardViewListener(EndCardViewListener endCardViewListener) {
        this.endcardViewListener = endCardViewListener;
    }

    public void setSkipOffset(SkipOffset skipOffset) {
        this.skipOffset = skipOffset;
    }

    public void show(final EndCardData endCardData, String str) {
        EndCardViewListener endCardViewListener;
        removeExistingEndcardViews();
        setVisibility(0);
        if (endCardData != null) {
            this.isCustomEndCard = endCardData.isCustom();
            configUi(endCardData);
            clearEndCardViews();
            if (endCardData.getType() == EndCardData.Type.STATIC_RESOURCE) {
                ImageView imageViewCreateStaticEndCardView = createStaticEndCardView();
                this.staticEndCardView = imageViewCreateStaticEndCardView;
                if (imageViewCreateStaticEndCardView == null) {
                    EndCardViewListener endCardViewListener2 = this.endcardViewListener;
                    if (endCardViewListener2 != null) {
                        endCardViewListener2.onLoadFail(this.isCustomEndCard);
                        return;
                    }
                    return;
                }
                addView(imageViewCreateStaticEndCardView);
                this.staticEndCardView.setVisibility(0);
                ImageUtils.setScaledImage(this.staticEndCardView, str);
                ensureOverlayOrder();
                EndCardViewListener endCardViewListener3 = this.endcardViewListener;
                if (endCardViewListener3 != null) {
                    endCardViewListener3.onLoadSuccess(this.isCustomEndCard);
                    this.endcardViewListener.onShow(endCardData.isCustom(), this.endCardType);
                }
                this.endCardType = "static";
                return;
            }
            if (TextUtils.isEmpty(endCardData.getContent())) {
                return;
            }
            FrameLayout frameLayoutCreateHtmlEndCardContainer = createHtmlEndCardContainer();
            this.htmlEndCardContainer = frameLayoutCreateHtmlEndCardContainer;
            if (frameLayoutCreateHtmlEndCardContainer == null) {
                EndCardViewListener endCardViewListener4 = this.endcardViewListener;
                if (endCardViewListener4 != null) {
                    endCardViewListener4.onLoadFail(this.isCustomEndCard);
                    return;
                }
                return;
            }
            addView(frameLayoutCreateHtmlEndCardContainer);
            this.htmlEndCardContainer.setVisibility(0);
            ensureOverlayOrder();
            if (endCardData.getType() != EndCardData.Type.IFRAME_RESOURCE) {
                this.endCardType = "html";
                renderHtmlEndcard(endCardData.getContent(), endCardData.isCustom().booleanValue());
                return;
            }
            this.endCardType = Reporting.Key.END_CARD_IFRAME;
            if (!isValidContext() && (endCardViewListener = this.endcardViewListener) != null) {
                endCardViewListener.onLoadFail(this.isCustomEndCard);
            }
            PNHttpClient.makeRequest(getContext(), endCardData.getContent(), null, null, true, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.4
                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onFailure(Throwable th2) {
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public /* synthetic */ void onFinally(String str2, int i10) {
                    net.pubnative.lite.sdk.network.e.a(this, str2, i10);
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onSuccess(String str2, Map<String, List<String>> map) {
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    HyBidEndCardView.this.renderHtmlEndcard(str2, endCardData.isCustom().booleanValue());
                }
            });
        }
    }

    public synchronized void showCloseButton(final CloseButtonListener closeButtonListener) {
        if (this.isViewShowingCloseButton) {
            return;
        }
        this.mSkipView.setVisibility(8);
        startCloseTimer(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.c
            @Override // java.lang.Runnable
            public final void run() {
                HyBidEndCardView.b(this.f96040b, closeButtonListener);
            }
        });
        this.isViewShowingCloseButton = true;
    }

    public synchronized void showSkipButton() {
        if (this.isViewShowingSkipButton) {
            return;
        }
        this.mCloseView.setVisibility(4);
        startSkipOffsetTimer(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.d
            @Override // java.lang.Runnable
            public final void run() {
                HyBidEndCardView.e(this.f96042b);
            }
        });
        this.isViewShowingSkipButton = true;
    }

    public synchronized void startCloseTimer(final Runnable runnable) {
        try {
            final int offset = this.skipOffset.getOffset() * 1000;
            if (offset < 0) {
                runnable.run();
                return;
            }
            CountDownView countDownView = this.mCloseCountdownView;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                ensureOverlayOrder();
            }
            SimpleTimer simpleTimer = new SimpleTimer(offset, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.6
                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onFinish() {
                    CountDownView countDownView2 = HyBidEndCardView.this.mCloseCountdownView;
                    if (countDownView2 != null) {
                        countDownView2.setVisibility(8);
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    SimpleTimer simpleTimer2 = HyBidEndCardView.this.mCloseEndcardTimer;
                    if (simpleTimer2 != null) {
                        simpleTimer2.cancel();
                        HyBidEndCardView.this.mCloseEndcardTimer = null;
                    }
                    HyBidEndCardView.this.isViewShowingCloseButton = false;
                }

                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onTick(long j10) {
                    CountDownView countDownView2 = HyBidEndCardView.this.mCloseCountdownView;
                    if (countDownView2 != null) {
                        int i10 = offset;
                        countDownView2.setProgress((int) (((long) i10) - j10), i10);
                    }
                }
            }, 50L);
            this.mCloseEndcardTimer = simpleTimer;
            simpleTimer.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void startSkipOffsetTimer(final Runnable runnable) {
        try {
            final int offset = this.skipOffset.getOffset() * 1000;
            if (offset < 0) {
                runnable.run();
                return;
            }
            CountDownView countDownView = this.mCloseCountdownView;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                ensureOverlayOrder();
            }
            SimpleTimer simpleTimer = new SimpleTimer(offset, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.5
                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onFinish() {
                    CountDownView countDownView2 = HyBidEndCardView.this.mCloseCountdownView;
                    if (countDownView2 != null) {
                        countDownView2.setVisibility(8);
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    SimpleTimer simpleTimer2 = HyBidEndCardView.this.mSkipEndcardTimer;
                    if (simpleTimer2 != null) {
                        simpleTimer2.cancel();
                        HyBidEndCardView.this.mSkipEndcardTimer = null;
                    }
                    HyBidEndCardView.this.isViewShowingSkipButton = false;
                }

                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onTick(long j10) {
                    CountDownView countDownView2 = HyBidEndCardView.this.mCloseCountdownView;
                    if (countDownView2 != null) {
                        int i10 = offset;
                        countDownView2.setProgress((int) (((long) i10) - j10), i10);
                    }
                }
            }, 50L);
            this.mSkipEndcardTimer = simpleTimer;
            simpleTimer.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public HyBidEndCardView(Context context, boolean z10, ReplayListener replayListener) {
        super(context);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* JADX INFO: renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC10981 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC10981() {
                }

                public static /* synthetic */ void a(ViewTreeObserverOnDrawListenerC10981 viewTreeObserverOnDrawListenerC10981) {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC10981);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC10981.a(this.f96044b);
                            }
                        });
                    }
                    MRAIDBanner mRAIDBanner = HyBidEndCardView.this.mHtmlEndCardView;
                    if (mRAIDBanner == null || mRAIDBanner.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                hyBidEndCardView.endcardViewListener.onLoadFail(hyBidEndCardView.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onLoadSuccess(hyBidEndCardView.isCustomEndCard);
                    HyBidEndCardView hyBidEndCardView2 = HyBidEndCardView.this;
                    hyBidEndCardView2.endcardViewListener.onShow(hyBidEndCardView2.isCustomEndCard, hyBidEndCardView2.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC10981());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                ReplayListener replayListener2 = HyBidEndCardView.this.replayListener;
                if (replayListener2 != null) {
                    replayListener2.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onClick(str, hyBidEndCardView.isCustomEndCard, hyBidEndCardView.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        this.hasReducedClose = z10;
        this.replayListener = replayListener;
        init(context);
    }

    public HyBidEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* JADX INFO: renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC10981 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC10981() {
                }

                public static /* synthetic */ void a(ViewTreeObserverOnDrawListenerC10981 viewTreeObserverOnDrawListenerC10981) {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC10981);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC10981.a(this.f96044b);
                            }
                        });
                    }
                    MRAIDBanner mRAIDBanner = HyBidEndCardView.this.mHtmlEndCardView;
                    if (mRAIDBanner == null || mRAIDBanner.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                hyBidEndCardView.endcardViewListener.onLoadFail(hyBidEndCardView.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onLoadSuccess(hyBidEndCardView.isCustomEndCard);
                    HyBidEndCardView hyBidEndCardView2 = HyBidEndCardView.this;
                    hyBidEndCardView2.endcardViewListener.onShow(hyBidEndCardView2.isCustomEndCard, hyBidEndCardView2.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC10981());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                ReplayListener replayListener2 = HyBidEndCardView.this.replayListener;
                if (replayListener2 != null) {
                    replayListener2.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onClick(str, hyBidEndCardView.isCustomEndCard, hyBidEndCardView.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        init(context);
    }

    public HyBidEndCardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* JADX INFO: renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC10981 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC10981() {
                }

                public static /* synthetic */ void a(ViewTreeObserverOnDrawListenerC10981 viewTreeObserverOnDrawListenerC10981) {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC10981);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    FrameLayout frameLayout = HyBidEndCardView.this.htmlEndCardContainer;
                    if (frameLayout != null) {
                        frameLayout.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC10981.a(this.f96044b);
                            }
                        });
                    }
                    MRAIDBanner mRAIDBanner = HyBidEndCardView.this.mHtmlEndCardView;
                    if (mRAIDBanner == null || mRAIDBanner.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                hyBidEndCardView.endcardViewListener.onLoadFail(hyBidEndCardView.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onLoadSuccess(hyBidEndCardView.isCustomEndCard);
                    HyBidEndCardView hyBidEndCardView2 = HyBidEndCardView.this;
                    hyBidEndCardView2.endcardViewListener.onShow(hyBidEndCardView2.isCustomEndCard, hyBidEndCardView2.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC10981());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i102, int i11, int i12, int i13) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                ReplayListener replayListener2 = HyBidEndCardView.this.replayListener;
                if (replayListener2 != null) {
                    replayListener2.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                HyBidEndCardView hyBidEndCardView = HyBidEndCardView.this;
                EndCardViewListener endCardViewListener = hyBidEndCardView.endcardViewListener;
                if (endCardViewListener != null) {
                    endCardViewListener.onClick(str, hyBidEndCardView.isCustomEndCard, hyBidEndCardView.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        init(context);
    }

    public void show(String str) {
        clearEndCardViews();
        ImageView imageViewCreateStaticEndCardView = createStaticEndCardView();
        this.staticEndCardView = imageViewCreateStaticEndCardView;
        if (imageViewCreateStaticEndCardView == null) {
            this.endcardViewListener.onLoadFail(this.isCustomEndCard);
            return;
        }
        addView(imageViewCreateStaticEndCardView);
        this.staticEndCardView.setVisibility(0);
        ImageUtils.setScaledImage(this.staticEndCardView, str);
    }
}
