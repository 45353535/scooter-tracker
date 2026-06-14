package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.impl.d3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f11738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f11739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f11740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f11741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f11742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f11743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f11744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f11745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f11746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f11747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f11748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.applovin.impl.mediation.ads.b f11749m;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f11750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f11751b;

        a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f11750a = weakReference;
            this.f11751b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f11750a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.C0.O();
                if (o.a()) {
                    k.C0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f11750a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11751b.getLayoutParams();
            layoutParams.height = ((View) this.f11751b.getParent()).getWidth();
            this.f11751b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    @Nullable
    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.f11749m;
    }

    public TextView getAdvertiserTextView() {
        return this.f11739c;
    }

    public TextView getBodyTextView() {
        return this.f11740d;
    }

    public Button getCallToActionButton() {
        return this.f11741e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f11738b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f11739c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f11740d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f11741e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f11742f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f11743g;
    }

    public ImageView getIconImageView() {
        return this.f11742f;
    }

    public View getMainView() {
        return this.f11737a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f11748l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f11747k;
        return viewGroup != null ? viewGroup : this.f11748l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f11745i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f11744h;
        return viewGroup != null ? viewGroup : this.f11745i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f11746j;
    }

    public TextView getTitleTextView() {
        return this.f11738b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.mediation.ads.b bVar = this.f11749m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        com.applovin.impl.mediation.ads.b bVar = this.f11749m;
        if (bVar != null) {
            bVar.a();
            this.f11749m = null;
        }
        View view = this.f11737a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f11737a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f11737a);
    }

    public void render(d3 d3Var, a.InterfaceC0175a interfaceC0175a, k kVar) {
        recycle();
        if (!d3Var.v0().get() || !d3Var.u0().get()) {
            this.f11749m = new com.applovin.impl.mediation.ads.b(d3Var, this, interfaceC0175a, kVar);
        }
        final MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (d3Var.w0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid template: " + str);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f11738b.setText(maxNativeAd.getTitle());
        } else {
            this.f11738b.setVisibility(8);
        }
        if (this.f11739c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f11739c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f11739c.setVisibility(8);
            }
        }
        if (this.f11740d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f11740d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f11740d.setVisibility(8);
            } else {
                this.f11740d.setVisibility(4);
            }
        }
        if (this.f11741e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f11741e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f11741e.setVisibility(8);
            } else {
                this.f11741e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f11743g;
        if (frameLayout != null) {
            if (icon == null || this.f11742f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f11743g.removeAllViews();
                    this.f11743g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f11742f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f11743g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f11742f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f11745i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f11745i.addView(optionsView);
            this.f11745i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f11748l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11748l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f11748l.setVisibility(8);
            }
        }
        if (this.f11746j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f11746j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11746j.addView(appLovinStarRatingView);
            } else {
                this.f11746j.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f11767b.a();
            }
        }, 2000L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i10 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i10).setOptionsContentFrameLayoutId(i10).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i11 = R.id.applovin_native_media_content_view;
        this(maxNativeAd, starRatingContentViewGroupId.setMediaContentViewGroupId(i11).setMediaContentFrameLayoutId(i11).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f11737a = view;
        } else {
            if (z10) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f11737a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f11737a);
        this.f11738b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f11739c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f11740d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f11741e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f11742f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f11743g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f11744h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f11745i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f11746j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f11747k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f11748l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f11738b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f11740d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f11739c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f11741e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f11742f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f11742f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f11742f, icon.getUri());
                } else {
                    this.f11742f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f11747k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11747k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f11744h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11744h.addView(optionsView);
                this.f11744h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f11746j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f11746j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}
