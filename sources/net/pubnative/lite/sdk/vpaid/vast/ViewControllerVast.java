package net.pubnative.lite.sdk.vpaid.vast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import net.pubnative.lite.sdk.CountdownStyle;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.InterstitialActionBehaviour;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.models.CustomCTAData;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.LearnMoreData;
import net.pubnative.lite.sdk.models.LearnMoreLocation;
import net.pubnative.lite.sdk.models.LearnMoreSize;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.ScreenDimensionsUtils;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.cta.HyBidCTAView;
import net.pubnative.lite.sdk.views.endcard.HyBidEndCardView;
import net.pubnative.lite.sdk.vpaid.AdCloseButtonListener;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.HyBidActivityInteractor;
import net.pubnative.lite.sdk.vpaid.InvalidCTAUrlListener;
import net.pubnative.lite.sdk.vpaid.ReplayListener;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.VideoVisibilityManager;
import net.pubnative.lite.sdk.vpaid.helpers.BitmapHelper;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.utils.UrlClickSource;
import net.pubnative.lite.sdk.vpaid.utils.Utils;
import net.pubnative.lite.sdk.vpaid.widget.CountDownView;
import net.pubnative.lite.sdk.vpaid.widget.CountDownViewFactory;
import net.pubnative.lite.sdk.vpaid.widget.LinearCountDownView;

/* JADX INFO: loaded from: classes3.dex */
public class ViewControllerVast implements View.OnClickListener {
    private static final CountdownStyle COUNTDOWN_STYLE_DEFAULT = CountdownStyle.PIE_CHART;
    private static final InterstitialActionBehaviour INTERSTITIAL_CLICK_BEHAVIOUR_DEFAULT = InterstitialActionBehaviour.HB_CREATIVE;
    private static final String LOG_TAG = "ViewControllerVast";
    private PNAPIContentInfoView contentInfoView;
    private HyBidCTAView ctaView;
    HyBidActivityInteractor interactor;
    private final VideoAdController mAdController;
    private VideoAdView mBannerView;
    private FrameLayout mControlsLayout;
    private CustomCTAData mCustomCTAData;
    private Integer mCustomCTADelay;
    private HyBidEndCardView mEndCardView;
    private final boolean mHasHiddenUx;
    private boolean mHasReducedCloseButton;
    private final boolean mIsBrandAd;
    private final boolean mIsFullscreen;
    private HyBidEndCardView mLastCustomEndCardView;
    private final LearnMoreData mLearnMoreData;
    private LinearCountDownView mLinearCountdownView;
    private boolean mMuteState;
    private ImageView mMuteView;
    private View mOpenUrlLayout;
    private final Integer mRemoteEndCardCloseDelay;
    private final ReplayListener mReplayListener;
    private CountDownView mSkipCountdownView;
    private View mSkipView;
    private Surface mSurface;
    private FrameLayout mUxLayout;
    private FrameLayout mVideoPlayerLayout;
    private TextureView mVideoPlayerLayoutTexture;
    AdCloseButtonListener mcloseButtonListener;
    private InterstitialActionBehaviour remoteConfigInterstitialClickBehaviour;
    private boolean mIsCustomCTA = false;
    private final VideoAdView.VisibilityListener mCreateVisibilityListener = new VideoAdView.VisibilityListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.1
        @Override // net.pubnative.lite.sdk.vpaid.VideoAdView.VisibilityListener
        public void onVisibilityChanged(int i10) {
            try {
                if (i10 == 0) {
                    ViewControllerVast.this.mAdController.setVideoVisible(true);
                    ViewControllerVast.this.videoVisibilityManager.reportChange(VideoVisibilityManager.VideoAdStatus.RESUMED);
                } else {
                    ViewControllerVast.this.mAdController.setVideoVisible(false);
                    ViewControllerVast.this.videoVisibilityManager.reportChange(VideoVisibilityManager.VideoAdStatus.PAUSED);
                }
            } catch (Exception e10) {
                HyBid.reportException(e10);
                Logger.e(ViewControllerVast.LOG_TAG, "ViewControllerVast.createVisibilityListener: Log: " + Log.getStackTraceString(e10));
            }
        }
    };
    private final TextureView.SurfaceTextureListener mCreateTextureListener = new TextureView.SurfaceTextureListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.2
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            ViewControllerVast.this.mSurface = new Surface(surfaceTexture);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    };
    VideoVisibilityManager videoVisibilityManager = VideoVisibilityManager.getInstance();

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize;

        static {
            int[] iArr = new int[LearnMoreSize.values().length];
            $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize = iArr;
            try {
                iArr[LearnMoreSize.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize[LearnMoreSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LearnMoreLocation.values().length];
            $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation = iArr2;
            try {
                iArr2[LearnMoreLocation.BOTTOM_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation[LearnMoreLocation.BOTTOM_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ViewControllerVast(VideoAdController videoAdController, boolean z10, Integer num, Boolean bool, boolean z11, AdCloseButtonListener adCloseButtonListener, ReplayListener replayListener, CustomCTAData customCTAData, Integer num2, boolean z12, boolean z13, LearnMoreData learnMoreData) {
        this.remoteConfigInterstitialClickBehaviour = null;
        this.mHasReducedCloseButton = false;
        this.mCustomCTAData = null;
        this.mCustomCTADelay = 0;
        this.mAdController = videoAdController;
        this.mIsFullscreen = z10;
        this.mcloseButtonListener = adCloseButtonListener;
        this.mCustomCTAData = customCTAData;
        this.mCustomCTADelay = num2;
        this.mIsBrandAd = z12;
        this.mHasHiddenUx = z13;
        this.mLearnMoreData = learnMoreData;
        this.mRemoteEndCardCloseDelay = num;
        if (bool == null || bool.booleanValue()) {
            this.remoteConfigInterstitialClickBehaviour = InterstitialActionBehaviour.HB_CREATIVE;
        } else {
            this.remoteConfigInterstitialClickBehaviour = InterstitialActionBehaviour.HB_ACTION_BUTTON;
        }
        this.mHasReducedCloseButton = z11;
        this.interactor = HyBidActivityInteractor.getInstance();
        this.mReplayListener = replayListener;
    }

    public static /* synthetic */ void c(ViewControllerVast viewControllerVast, View view) {
        viewControllerVast.getClass();
        viewControllerVast.validateOpenURLClicked(null, UrlClickSource.VAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeUxVisibility() {
        FrameLayout frameLayout = this.mUxLayout;
        if (frameLayout != null) {
            hideUx(frameLayout.getVisibility() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSelf() {
        this.mAdController.closeSelf();
    }

    private void configLearnMore(Context context) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        float dimension;
        if (this.mIsFullscreen && this.mIsBrandAd) {
            TextView textView = (TextView) this.mOpenUrlLayout.findViewById(R.id.openURL);
            ImageView imageView = (ImageView) this.mOpenUrlLayout.findViewById(R.id.openURLIcon);
            ImageView imageView2 = (ImageView) this.mOpenUrlLayout.findViewById(R.id.openURLOldIcon);
            LinearLayout linearLayout = (LinearLayout) this.mOpenUrlLayout.findViewById(R.id.openUrlLayout);
            Resources resources = context.getResources();
            LearnMoreLocation location = this.mLearnMoreData.getLocation();
            if (location != LearnMoreLocation.DEFAULT) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                int i10 = AnonymousClass6.$SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation[location.ordinal()];
                if (i10 == 1) {
                    layoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.learn_more_bottom_down_margin_bottom);
                    layoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.learn_more_bottom_down_margin_end));
                } else if (i10 == 2) {
                    int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.learn_more_bottom_up_margin_end);
                    layoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.learn_more_bottom_up_margin_bottom);
                    layoutParams.setMarginEnd(dimensionPixelSize5);
                }
                linearLayout.setLayoutParams(layoutParams);
            }
            LearnMoreSize size = this.mLearnMoreData.getSize();
            if (size != LearnMoreSize.DEFAULT) {
                int i11 = AnonymousClass6.$SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize[size.ordinal()];
                if (i11 == 1) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_start);
                    dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_top);
                    dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_end);
                    dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_bottom);
                    dimension = resources.getDimension(R.dimen.learn_more_medium_text_size);
                } else if (i11 != 2) {
                    dimension = 0.0f;
                    dimensionPixelSize = 0;
                    dimensionPixelSize2 = 0;
                    dimensionPixelSize3 = 0;
                    dimensionPixelSize4 = 0;
                } else {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_start);
                    dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_top);
                    dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_end);
                    dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_bottom);
                    float dimension2 = resources.getDimension(R.dimen.learn_more_large_text_size);
                    imageView.setPadding(resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_start), resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_top), resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_end), resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_bottom));
                    dimension = dimension2;
                }
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
                linearLayout.setBackground(resources.getDrawable(R.drawable.learn_more_background));
                textView.setTextColor(resources.getColor(R.color.learn_more_black));
                textView.setContentDescription(size.getSizeName() + TokenBuilder.TOKEN_DELIMITER + location.getLocationName());
                textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
                textView.setTextSize(0, dimension);
                imageView.setContentDescription(size.getSizeName());
            }
        }
    }

    private SkipOffset getEndCardCloseDelay() {
        Integer num = this.mRemoteEndCardCloseDelay;
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? new SkipOffset(SkipOffsetManager.getMaximumEndcardCloseDelay().intValue(), true) : new SkipOffset(this.mRemoteEndCardCloseDelay.intValue(), true) : new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
    }

    private boolean hasCTAExtension(AdParams adParams) {
        return (adParams == null || TextUtils.isEmpty(adParams.getCtaExtensionHtml())) ? false : true;
    }

    private void hideCountdown(boolean z10) {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView == null || countDownView.getVisibility() == 8) {
            return;
        }
        if (z10) {
            this.mSkipCountdownView.setVisibility(4);
        } else {
            this.mSkipCountdownView.setVisibility(0);
        }
    }

    private void hideMute(boolean z10) {
        ImageView imageView = this.mMuteView;
        if (imageView == null || imageView.getVisibility() == 8) {
            return;
        }
        if (z10) {
            this.mMuteView.setVisibility(4);
        } else {
            this.mMuteView.setVisibility(0);
        }
    }

    private void hideSkip(boolean z10) {
        View view = this.mSkipView;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        if (z10) {
            this.mSkipView.setVisibility(4);
            this.mSkipView.setClickable(false);
        } else {
            this.mSkipView.setVisibility(0);
            this.mSkipView.setClickable(true);
        }
    }

    private void initCustomCta(Context context) {
        this.ctaView = new HyBidCTAView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int iAsIntPixels = ViewUtils.asIntPixels(6.0f, context);
        int i10 = (new ScreenDimensionsUtils().getScreenDimensionsToPoint(context).y * 10) / 100;
        layoutParams.setMargins(iAsIntPixels, i10, iAsIntPixels, i10);
        layoutParams.gravity = 85;
        this.ctaView.setLayoutParams(layoutParams);
        this.ctaView.setContentDescription("ctaView");
    }

    public static /* synthetic */ void j(ViewControllerVast viewControllerVast, View view) {
        viewControllerVast.getClass();
        viewControllerVast.validateOpenURLClicked(null, UrlClickSource.VAST);
    }

    private void makeParentsVisible(View view, ViewGroup viewGroup) {
        Object parent = view.getParent();
        while ((parent instanceof View) && parent != viewGroup) {
            View view2 = (View) parent;
            if (view2.getVisibility() != 0) {
                view2.setVisibility(0);
            }
            parent = view2.getParent();
        }
    }

    private void setContentInfoVisible(boolean z10) {
        if (this.contentInfoView == null) {
            ViewParent parent = this.mBannerView.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof FrameLayout) {
                        FrameLayout frameLayout = (FrameLayout) childAt;
                        int i11 = 0;
                        while (true) {
                            if (i11 < frameLayout.getChildCount()) {
                                View childAt2 = frameLayout.getChildAt(i11);
                                if (childAt2 instanceof PNAPIContentInfoView) {
                                    PNAPIContentInfoView pNAPIContentInfoView = (PNAPIContentInfoView) childAt2;
                                    this.contentInfoView = pNAPIContentInfoView;
                                    if (!this.mIsFullscreen) {
                                        makeParentsVisible(pNAPIContentInfoView, viewGroup);
                                    }
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                }
            }
        }
        PNAPIContentInfoView pNAPIContentInfoView2 = this.contentInfoView;
        if (pNAPIContentInfoView2 != null) {
            pNAPIContentInfoView2.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showHideLearnMore(InterstitialActionBehaviour interstitialActionBehaviour) {
        if (interstitialActionBehaviour != InterstitialActionBehaviour.HB_CREATIVE) {
            View view = this.mOpenUrlLayout;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        this.mBannerView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewControllerVast.j(this.f96107b, view2);
            }
        });
        View view2 = this.mOpenUrlLayout;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skipEndCard() {
        this.mAdController.skipEndCard();
    }

    private void skipVideo() {
        this.mAdController.skipVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateOpenURLClicked(String str, UrlClickSource urlClickSource) {
        if (urlClickSource == UrlClickSource.VAST || urlClickSource == UrlClickSource.CUSTOM_CTA) {
            this.mAdController.getViewabilityAdSession().fireClick();
        }
        this.mAdController.openUrl(str, urlClickSource);
    }

    public void adjustLayoutParams(final int i10, final int i11) {
        if (this.mControlsLayout == null) {
            Logger.e(LOG_TAG, "ViewControllerVast.adjustLayoutParams: Log: mControlsLayout is null");
            return;
        }
        this.mVideoPlayerLayout.setLayoutParams(Utils.calculateNewLayoutParams((FrameLayout.LayoutParams) this.mVideoPlayerLayout.getLayoutParams(), i10, i11, this.mBannerView.getWidth(), this.mBannerView.getHeight(), Utils.StretchOption.NO_STRETCH));
        this.mVideoPlayerLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.k
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                ViewControllerVast viewControllerVast = this.f96109b;
                viewControllerVast.mVideoPlayerLayout.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.vast.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewControllerVast viewControllerVast2 = this.f96103b;
                        viewControllerVast2.mVideoPlayerLayout.setLayoutParams(Utils.calculateNewLayoutParams((FrameLayout.LayoutParams) viewControllerVast2.mVideoPlayerLayout.getLayoutParams(), i, i, viewControllerVast2.mBannerView.getWidth(), viewControllerVast2.mBannerView.getHeight(), Utils.StretchOption.NO_STRETCH));
                    }
                });
            }
        });
    }

    public void buildVideoAdView(VideoAdView videoAdView) {
        Context context = videoAdView.getContext();
        this.mBannerView = videoAdView;
        videoAdView.setVisibilityListener(this.mCreateVisibilityListener);
        videoAdView.removeAllViews();
        this.mControlsLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.controls, (ViewGroup) videoAdView, false);
        this.mOpenUrlLayout = LayoutInflater.from(context).inflate(R.layout.open_url, (ViewGroup) videoAdView, false);
        configLearnMore(context);
        this.mUxLayout = (FrameLayout) this.mControlsLayout.findViewById(R.id.uxLayout);
        initCustomCta(context);
        boolean z10 = this.mIsFullscreen;
        if (z10 && this.mIsBrandAd) {
            View view = this.mOpenUrlLayout;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.mHasHiddenUx) {
                this.mBannerView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f96097b.changeUxVisibility();
                    }
                });
                this.mUxLayout.setVisibility(4);
            }
        } else {
            final InterstitialActionBehaviour interstitialActionBehaviour = this.remoteConfigInterstitialClickBehaviour;
            if (interstitialActionBehaviour == null) {
                interstitialActionBehaviour = INTERSTITIAL_CLICK_BEHAVIOUR_DEFAULT;
            }
            if (this.mCustomCTAData == null || !z10) {
                showHideLearnMore(interstitialActionBehaviour);
            } else {
                View view2 = this.mOpenUrlLayout;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.mBannerView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ViewControllerVast.c(this.f96098b, view3);
                    }
                });
                showCTAButton(this.mCustomCTAData, this.mCustomCTADelay, new InvalidCTAUrlListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.d
                    @Override // net.pubnative.lite.sdk.vpaid.InvalidCTAUrlListener
                    public final void invalidCTAUrl() {
                        this.f96099a.showHideLearnMore(interstitialActionBehaviour);
                    }
                });
            }
        }
        this.mVideoPlayerLayout = (FrameLayout) this.mControlsLayout.findViewById(R.id.videoPlayerLayout);
        if (hasCTAExtension(this.mAdController.getAdParams())) {
            RelativeLayout relativeLayout = new RelativeLayout(this.mVideoPlayerLayout.getContext());
            TextureView textureView = new TextureView(relativeLayout.getContext());
            this.mVideoPlayerLayoutTexture = textureView;
            textureView.setId(R.id.textureView);
            relativeLayout.addView(this.mVideoPlayerLayoutTexture, new RelativeLayout.LayoutParams(-1, -1));
            this.mVideoPlayerLayout.addView(relativeLayout, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            TextureView textureView2 = new TextureView(this.mVideoPlayerLayout.getContext());
            this.mVideoPlayerLayoutTexture = textureView2;
            textureView2.setId(R.id.textureView);
            this.mVideoPlayerLayout.addView(this.mVideoPlayerLayoutTexture, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        HyBidEndCardView hyBidEndCardView = new HyBidEndCardView(context, this.mHasReducedCloseButton, this.mReplayListener);
        this.mEndCardView = hyBidEndCardView;
        hyBidEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mEndCardView.setVisibility(8);
        HyBidEndCardView hyBidEndCardView2 = new HyBidEndCardView(context, this.mHasReducedCloseButton, this.mReplayListener);
        this.mLastCustomEndCardView = hyBidEndCardView2;
        hyBidEndCardView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mLastCustomEndCardView.setVisibility(8);
        this.mOpenUrlLayout.findViewById(R.id.openURL).setOnClickListener(this);
        this.mOpenUrlLayout.findViewById(R.id.openURLIcon).setOnClickListener(this);
        this.mOpenUrlLayout.findViewById(R.id.openURLOldIcon).setOnClickListener(this);
        CountDownView countDownViewCreateCountdownView = new CountDownViewFactory().createCountdownView(context, COUNTDOWN_STYLE_DEFAULT, this.mControlsLayout);
        this.mSkipCountdownView = countDownViewCreateCountdownView;
        this.mControlsLayout.addView(countDownViewCreateCountdownView);
        this.mLinearCountdownView = new LinearCountDownView(this.mControlsLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        this.mLinearCountdownView.setLayoutParams(layoutParams);
        this.mUxLayout.addView(this.mLinearCountdownView);
        TextureView textureView3 = this.mVideoPlayerLayoutTexture;
        if (textureView3 != null) {
            textureView3.setSurfaceTextureListener(this.mCreateTextureListener);
        }
        ImageView imageView = (ImageView) this.mControlsLayout.findViewById(R.id.muteView);
        this.mMuteView = imageView;
        imageView.setOnClickListener(this);
        if (this.mIsBrandAd && this.mHasHiddenUx) {
            hideCountdown(true);
            hideMute(true);
        }
        this.mSkipView = this.mControlsLayout.findViewById(R.id.skipView);
        if (this.mHasReducedCloseButton) {
            int iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(20.0f, context);
            int iConvertDpToPixel2 = (int) ViewUtils.convertDpToPixel(8.0f, context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iConvertDpToPixel, iConvertDpToPixel);
            layoutParams2.setMargins(iConvertDpToPixel2, iConvertDpToPixel2, 0, 0);
            this.mSkipView.setId(R.id.skipView_small);
            this.mSkipView.setLayoutParams(layoutParams2);
            this.mSkipView.setPadding(0, 0, 0, 0);
            this.mSkipView.requestLayout();
        }
        Context context2 = this.mSkipView.getContext();
        Integer skipXmlResource = HyBid.getSkipXmlResource();
        int i10 = R.mipmap.skip;
        Bitmap bitmap = BitmapHelper.toBitmap(context2, skipXmlResource, Integer.valueOf(i10));
        if (bitmap != null) {
            ((ImageView) this.mSkipView).setImageBitmap(bitmap);
        } else {
            View view3 = this.mSkipView;
            ((ImageView) view3).setImageBitmap(BitmapHelper.decodeResource(view3.getContext(), Integer.valueOf(i10)));
        }
        this.mSkipView.setOnClickListener(this);
        this.mAdController.addViewabilityFriendlyObstruction(this.mControlsLayout, BaseFriendlyObstructionPurpose.VIDEO_CONTROLS, "Video controls");
        videoAdView.addView(this.mControlsLayout);
        videoAdView.addView(this.mEndCardView);
        videoAdView.addView(this.mLastCustomEndCardView);
        videoAdView.addView(this.ctaView);
        videoAdView.addView(this.mOpenUrlLayout);
    }

    public void destroy() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.destroy();
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.destroy();
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.destroy();
        }
    }

    public void dismiss() {
        VideoAdView videoAdView = this.mBannerView;
        if (videoAdView != null) {
            videoAdView.removeAllViews();
        }
    }

    public void endSkip(Boolean bool, Boolean bool2) {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(8);
            if (bool.booleanValue()) {
                showCloseButton();
            } else if (bool2.booleanValue()) {
                showSkipButton();
            } else {
                showCloseButton();
            }
        }
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public TextureView getTexture() {
        return this.mVideoPlayerLayoutTexture;
    }

    public void hideEndcards() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setVisibility(8);
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.setVisibility(8);
        }
        View view = this.mOpenUrlLayout;
        boolean z10 = false;
        if (view != null && (this.remoteConfigInterstitialClickBehaviour != InterstitialActionBehaviour.HB_CREATIVE || this.mIsBrandAd)) {
            view.setVisibility(0);
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null && this.mIsCustomCTA) {
            hyBidCTAView.setVisibility(0);
        }
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(0);
        }
        setTimerVisible(true);
        if (this.mHasHiddenUx && this.mIsBrandAd) {
            z10 = true;
        }
        hideUx(z10);
        setContentInfoVisible(true);
    }

    public void hideMuteButton() {
        ImageView imageView = this.mMuteView;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public void hideSkipButton() {
        View view = this.mSkipView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideUx(boolean z10) {
        FrameLayout frameLayout = this.mUxLayout;
        if (frameLayout != null) {
            if (z10) {
                frameLayout.setVisibility(4);
                hideCountdown(true);
                hideMute(true);
                hideSkip(true);
                return;
            }
            frameLayout.setVisibility(0);
            hideCountdown(false);
            hideMute(false);
            hideSkip(false);
        }
    }

    public boolean isEndCard() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        return (hyBidEndCardView == null || hyBidEndCardView.getVisibility() == 8) ? false : true;
    }

    public boolean isMute() {
        return this.mMuteState;
    }

    public void muteVideo() {
        boolean z10 = !this.mMuteState;
        this.mMuteState = z10;
        this.mAdController.setVolume(z10);
        ImageView imageView = this.mMuteView;
        if (imageView != null) {
            if (this.mMuteState) {
                imageView.setImageResource(R.mipmap.mute);
                this.mMuteView.setContentDescription("muteButton");
            } else {
                imageView.setImageResource(R.mipmap.unmute);
                this.mMuteView.setContentDescription("unmuteButton");
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.close_view) {
            closeSelf();
            return;
        }
        if (view.getId() == R.id.skipView || view.getId() == R.id.progressSkipView || view.getId() == R.id.skipView_small) {
            skipVideo();
            return;
        }
        if (view.getId() == R.id.muteView) {
            muteVideo();
        } else if (view.getId() == R.id.openURL || view.getId() == R.id.openURLIcon || view.getId() == R.id.openURLOldIcon) {
            validateOpenURLClicked(null, UrlClickSource.VAST);
        }
    }

    public void pause() {
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.pause();
        }
    }

    public void pauseEndCardCloseButtonTimer() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.pause();
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.pause();
        }
    }

    public void postDelayed(Runnable runnable, long j10) {
        VideoAdView videoAdView = this.mBannerView;
        if (videoAdView != null) {
            videoAdView.postDelayed(runnable, j10);
        }
    }

    public void recoverGoneCountdownView() {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
    }

    public void resetProgress() {
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.reset();
        }
    }

    public void resume() {
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.resume();
        }
    }

    public void resumeEndCardCloseButtonTimer() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.resume();
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.resume();
        }
    }

    public void setProgress(int i10, int i11) {
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setProgress(i11 - i10, i11);
        }
    }

    public void setSkipProgress(int i10, int i11) {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setProgress(i11 - i10, i11);
        }
    }

    public void setTimerVisible(boolean z10) {
        int i10 = z10 ? 0 : 4;
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(i10);
        }
    }

    public void showCTAButton(CustomCTAData customCTAData, Integer num, final InvalidCTAUrlListener invalidCTAUrlListener) {
        if (this.ctaView == null || TextUtils.isEmpty(customCTAData.getIconURL())) {
            VideoAdController videoAdController = this.mAdController;
            if (videoAdController != null) {
                videoAdController.onCustomCTALoadFail();
                return;
            }
            return;
        }
        this.ctaView.setListener(new HyBidCTAView.CTAViewListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.5
            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onClick() {
                ViewControllerVast viewControllerVast = ViewControllerVast.this;
                VideoAdController videoAdController2 = viewControllerVast.mAdController;
                if (videoAdController2 != null) {
                    videoAdController2.onCustomCTAClick(viewControllerVast.isEndCard());
                }
                ViewControllerVast viewControllerVast2 = ViewControllerVast.this;
                if (viewControllerVast2.mAdController != null) {
                    viewControllerVast2.validateOpenURLClicked(null, UrlClickSource.CUSTOM_CTA);
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onFail() {
                VideoAdController videoAdController2 = ViewControllerVast.this.mAdController;
                if (videoAdController2 != null) {
                    videoAdController2.onCustomCTALoadFail();
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onInvalidCTAIconUrl() {
                VideoAdController videoAdController2 = ViewControllerVast.this.mAdController;
                if (videoAdController2 != null) {
                    videoAdController2.onCustomCTALoadFail();
                }
                InvalidCTAUrlListener invalidCTAUrlListener2 = invalidCTAUrlListener;
                if (invalidCTAUrlListener2 != null) {
                    invalidCTAUrlListener2.invalidCTAUrl();
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onShow() {
                VideoAdController videoAdController2 = ViewControllerVast.this.mAdController;
                if (videoAdController2 != null) {
                    videoAdController2.onCustomCTAShow();
                    ViewControllerVast.this.mIsCustomCTA = true;
                }
            }
        });
        if (customCTAData.getBitmap() != null) {
            this.ctaView.show(customCTAData.getBitmap(), customCTAData.getLabel(), num);
        } else {
            this.ctaView.show(customCTAData.getIconURL(), customCTAData.getLabel(), num);
        }
    }

    public void showCloseButton() {
        AdCloseButtonListener adCloseButtonListener = this.mcloseButtonListener;
        if (adCloseButtonListener != null) {
            adCloseButtonListener.showButton();
        }
    }

    public void showCountdownTimer() {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(0);
        }
    }

    public void showEndCard(EndCardData endCardData, String str, Boolean bool, CloseButtonListener closeButtonListener) {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setEndCardViewListener(new HyBidEndCardView.EndCardViewListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.3
                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClick(String str2, Boolean bool2, String str3) {
                    if (bool2.booleanValue()) {
                        ViewControllerVast.this.validateOpenURLClicked(null, UrlClickSource.CUSTOM_END_CARD);
                        ViewControllerVast.this.mAdController.onCustomEndCardClick(str3);
                    } else {
                        ViewControllerVast.this.validateOpenURLClicked(str2, UrlClickSource.DEFAULT_END_CARD);
                        ViewControllerVast.this.mAdController.onDefaultEndCardClick(str3);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClose(Boolean bool2) {
                    VideoAdController videoAdController = ViewControllerVast.this.mAdController;
                    if (videoAdController != null) {
                        videoAdController.onEndCardClosed(bool2);
                    }
                    ViewControllerVast.this.closeSelf();
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadFail(Boolean bool2) {
                    VideoAdController videoAdController = ViewControllerVast.this.mAdController;
                    if (videoAdController != null) {
                        videoAdController.onEndCardLoadFail(bool2);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadSuccess(Boolean bool2) {
                    VideoAdController videoAdController = ViewControllerVast.this.mAdController;
                    if (videoAdController != null) {
                        videoAdController.onEndCardLoadSuccess(bool2);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onShow(Boolean bool2, String str2) {
                    View view = ViewControllerVast.this.mOpenUrlLayout;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (!bool2.booleanValue()) {
                        ViewControllerVast.this.mAdController.onDefaultEndCardShow(str2);
                        HyBidCTAView hyBidCTAView = ViewControllerVast.this.ctaView;
                        if (hyBidCTAView != null) {
                            hyBidCTAView.show();
                            return;
                        }
                        return;
                    }
                    ViewControllerVast.this.mAdController.onCustomEndCardShow(str2);
                    ViewControllerVast.this.mEndCardView.bringToFront();
                    HyBidCTAView hyBidCTAView2 = ViewControllerVast.this.ctaView;
                    if (hyBidCTAView2 != null) {
                        hyBidCTAView2.hide();
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onSkip() {
                    ViewControllerVast.this.skipEndCard();
                }
            });
            this.mEndCardView.setSkipOffset(getEndCardCloseDelay());
            this.mEndCardView.show(endCardData, str);
            this.mEndCardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.f
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    ViewControllerVast viewControllerVast = this.f96102b;
                    viewControllerVast.mEndCardView.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.vast.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            viewControllerVast.mEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        }
                    });
                }
            });
            if (this.mIsFullscreen) {
                if (bool.booleanValue()) {
                    this.mEndCardView.showCloseButton(closeButtonListener);
                } else {
                    this.mEndCardView.showSkipButton();
                }
            }
        }
    }

    public void showEndcards() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setVisibility(0);
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.setVisibility(0);
        }
        View view = this.mOpenUrlLayout;
        if (view != null) {
            view.setVisibility(8);
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null && this.mIsCustomCTA) {
            hyBidCTAView.setVisibility(8);
        }
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(8);
            resetProgress();
        }
        setTimerVisible(false);
        hideUx(true);
        setContentInfoVisible(false);
    }

    public void showLastCustomEndCard(EndCardData endCardData, String str, CloseButtonListener closeButtonListener) {
        HyBidEndCardView hyBidEndCardView = this.mLastCustomEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setEndCardViewListener(new HyBidEndCardView.EndCardViewListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.4
                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClick(String str2, Boolean bool, String str3) {
                    if (bool.booleanValue()) {
                        ViewControllerVast.this.validateOpenURLClicked(null, UrlClickSource.CUSTOM_END_CARD);
                        ViewControllerVast.this.mAdController.onCustomEndCardClick(str3);
                    } else {
                        ViewControllerVast.this.validateOpenURLClicked(str2, UrlClickSource.DEFAULT_END_CARD);
                        ViewControllerVast.this.mAdController.onDefaultEndCardClick(str3);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClose(Boolean bool) {
                    VideoAdController videoAdController = ViewControllerVast.this.mAdController;
                    if (videoAdController != null) {
                        videoAdController.onEndCardClosed(bool);
                    }
                    ViewControllerVast.this.closeSelf();
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadFail(Boolean bool) {
                    VideoAdController videoAdController = ViewControllerVast.this.mAdController;
                    if (videoAdController != null) {
                        videoAdController.onEndCardLoadFail(bool);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadSuccess(Boolean bool) {
                    VideoAdController videoAdController = ViewControllerVast.this.mAdController;
                    if (videoAdController != null) {
                        videoAdController.onEndCardLoadSuccess(bool);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onShow(Boolean bool, String str2) {
                    View view = ViewControllerVast.this.mOpenUrlLayout;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (!bool.booleanValue()) {
                        ViewControllerVast.this.mAdController.onDefaultEndCardShow(str2);
                        HyBidCTAView hyBidCTAView = ViewControllerVast.this.ctaView;
                        if (hyBidCTAView != null) {
                            hyBidCTAView.show();
                            return;
                        }
                        return;
                    }
                    ViewControllerVast.this.mAdController.onCustomEndCardShow(str2);
                    ViewControllerVast.this.mLastCustomEndCardView.bringToFront();
                    HyBidCTAView hyBidCTAView2 = ViewControllerVast.this.ctaView;
                    if (hyBidCTAView2 != null) {
                        hyBidCTAView2.hide();
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onSkip() {
                    ViewControllerVast.this.skipEndCard();
                }
            });
            this.mLastCustomEndCardView.setSkipOffset(getEndCardCloseDelay());
            this.mEndCardView.hideSkipButton();
            this.mLastCustomEndCardView.show(endCardData, str);
            this.mLastCustomEndCardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.e
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    ViewControllerVast viewControllerVast = this.f96101b;
                    viewControllerVast.mLastCustomEndCardView.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.vast.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            viewControllerVast.mLastCustomEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        }
                    });
                }
            });
            if (this.mIsFullscreen) {
                this.mLastCustomEndCardView.showCloseButton(closeButtonListener);
            }
        }
    }

    public void showSkipButton() {
        View view = this.mSkipView;
        if (view != null) {
            if (!this.mIsBrandAd) {
                view.setVisibility(0);
                this.mSkipView.setClickable(true);
            } else if (this.mUxLayout.getVisibility() == 0) {
                this.mSkipView.setVisibility(0);
                this.mSkipView.setClickable(true);
            } else {
                this.mSkipView.setVisibility(4);
                this.mSkipView.setClickable(false);
            }
        }
    }
}
