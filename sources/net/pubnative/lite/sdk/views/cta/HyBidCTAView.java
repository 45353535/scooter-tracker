package net.pubnative.lite.sdk.views.cta;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.utils.PNBitmapDownloader;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.views.helpers.ImageHelper;
import net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidCTAView extends FrameLayout {
    private static final long ANIMATION_DURATION = 1500;
    private static final int COLOR_BACKGROUND = Color.argb(102, 0, 0, 0);
    private static final int COLOR_BUTTON = Color.argb(255, 0, 122, 255);
    private static final float CORNER_RADIUS = 18.0f;
    private TextView button;
    private ImageView icon;
    private Boolean isLoaded;
    private CTAViewListener listener;
    private SimpleTimer mShowTimer;
    private Boolean showImmediately;

    public interface CTAViewListener {
        void onClick();

        void onFail();

        void onInvalidCTAIconUrl();

        void onShow();
    }

    public HyBidCTAView(Context context) {
        super(context);
        this.isLoaded = null;
        this.showImmediately = Boolean.FALSE;
        initUi();
        initViews();
    }

    private Drawable getRoundedDrawable(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadii(new float[]{f10, f10, f10, f10, f10, f10, f10, f10});
        return gradientDrawable;
    }

    private void initUi() {
        setVisibility(4);
        setBackground(getRoundedDrawable(COLOR_BACKGROUND, CORNER_RADIUS));
    }

    private void initViews() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(20, 20, 20, 20);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(getContext());
        this.icon = imageView;
        imageView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.asIntPixels(40.0f, getContext()), ViewUtils.asIntPixels(40.0f, getContext()));
        layoutParams.setMarginEnd(5);
        this.icon.setLayoutParams(layoutParams);
        this.icon.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.cta.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96034b.invokeClick();
            }
        });
        this.icon.setContentDescription("ctaIcon");
        TextView textView = new TextView(getContext());
        this.button = textView;
        textView.setId(View.generateViewId());
        int dimension = (int) (getResources().getDimension(R.dimen.cta_font_size) / getResources().getDisplayMetrics().density);
        this.button.setPadding(40, 0, 40, 0);
        this.button.setTextSize(dimension);
        this.button.setTextColor(-1);
        this.button.setGravity(17);
        this.button.setAllCaps(true);
        this.button.setTypeface(null, 1);
        this.button.setBackground(getRoundedDrawable(COLOR_BUTTON, CORNER_RADIUS));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, ViewUtils.asIntPixels(40.0f, getContext()));
        layoutParams2.setMarginStart(5);
        this.button.setLayoutParams(layoutParams2);
        this.button.setContentDescription("ctaButton");
        linearLayout.addView(this.icon);
        linearLayout.addView(this.button);
        setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.cta.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96035b.invokeClick();
            }
        });
        addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeClick() {
        CTAViewListener cTAViewListener = this.listener;
        if (cTAViewListener != null) {
            cTAViewListener.onClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeFail() {
        CTAViewListener cTAViewListener = this.listener;
        if (cTAViewListener != null) {
            cTAViewListener.onFail();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeInvalidCTAUrl() {
        CTAViewListener cTAViewListener = this.listener;
        if (cTAViewListener != null) {
            cTAViewListener.onInvalidCTAIconUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeShow() {
        CTAViewListener cTAViewListener = this.listener;
        if (cTAViewListener != null) {
            cTAViewListener.onShow();
        }
    }

    private void resetAll() {
        setVisibility(4);
        this.isLoaded = null;
        this.showImmediately = Boolean.FALSE;
    }

    private void setButton(String str) {
        this.button.setText(str);
    }

    private void setIconUrl(String str) {
        new PNBitmapDownloader().download(str, this.icon.getWidth(), this.icon.getHeight(), new PNBitmapDownloader.DownloadListener() { // from class: net.pubnative.lite.sdk.views.cta.HyBidCTAView.3
            @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
            public void onDownloadFailed(String str2, Exception exc) {
                HyBidCTAView hyBidCTAView = HyBidCTAView.this;
                hyBidCTAView.isLoaded = Boolean.FALSE;
                hyBidCTAView.invokeFail();
            }

            @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
            public void onDownloadFinish(String str2, Bitmap bitmap) {
                if (bitmap == null) {
                    HyBidCTAView.this.invokeFail();
                    HyBidCTAView.this.invokeInvalidCTAUrl();
                    HyBidCTAView.this.isLoaded = Boolean.FALSE;
                    return;
                }
                HyBidCTAView hyBidCTAView = HyBidCTAView.this;
                hyBidCTAView.icon.setImageBitmap(ImageHelper.getRoundedCornerBitmap(bitmap, 20, ViewUtils.asIntPixels(40.0f, hyBidCTAView.getContext()), ViewUtils.asIntPixels(40.0f, HyBidCTAView.this.getContext())));
                HyBidCTAView hyBidCTAView2 = HyBidCTAView.this;
                hyBidCTAView2.isLoaded = Boolean.TRUE;
                if (hyBidCTAView2.showImmediately.booleanValue()) {
                    HyBidCTAView.this.show();
                }
            }
        });
    }

    private void showWithDelay(Integer num) {
        if (num.intValue() <= 0) {
            show();
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(num.intValue() * 1000, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.views.cta.HyBidCTAView.1
            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onFinish() {
                HyBidCTAView hyBidCTAView = HyBidCTAView.this;
                hyBidCTAView.mShowTimer = null;
                Boolean bool = hyBidCTAView.isLoaded;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                HyBidCTAView.this.show();
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onTick(long j10) {
            }
        });
        this.mShowTimer = simpleTimer;
        simpleTimer.start();
    }

    public void destroy() {
        SimpleTimer simpleTimer = this.mShowTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.mShowTimer = null;
        }
    }

    public void hide() {
        SimpleTimer simpleTimer = this.mShowTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.mShowTimer = null;
        }
        setVisibility(4);
    }

    public boolean isLoaded() {
        Boolean bool = this.isLoaded;
        return bool != null && bool.booleanValue();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void killTimer() {
        SimpleTimer simpleTimer = this.mShowTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
            this.mShowTimer.cancel();
        }
    }

    public void pause() {
        SimpleTimer simpleTimer = this.mShowTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
        }
    }

    public void resume() {
        SimpleTimer simpleTimer = this.mShowTimer;
        if (simpleTimer != null) {
            simpleTimer.resume();
        }
    }

    public void setListener(CTAViewListener cTAViewListener) {
        this.listener = cTAViewListener;
    }

    public void show(Bitmap bitmap, String str, Integer num) {
        resetAll();
        if (num == null || num.intValue() == 0) {
            this.showImmediately = Boolean.TRUE;
        }
        if (bitmap != null) {
            this.icon.setImageBitmap(ImageHelper.getRoundedCornerBitmap(bitmap, 18, ViewUtils.asIntPixels(40.0f, getContext()), ViewUtils.asIntPixels(40.0f, getContext())));
            this.isLoaded = Boolean.TRUE;
            if (this.showImmediately.booleanValue()) {
                show();
            }
        }
        setButton(str);
        if (num != null && num.intValue() > 0) {
            showWithDelay(num);
            return;
        }
        Boolean bool = this.isLoaded;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        show();
    }

    public void showWithoutIcon(String str, Integer num) {
        resetAll();
        if (num == null || num.intValue() == 0) {
            this.showImmediately = Boolean.TRUE;
        }
        this.icon.setVisibility(8);
        this.button.setTextSize((int) (getResources().getDimension(R.dimen.big_cta_font_size) / getResources().getDisplayMetrics().density));
        this.button.setPadding(90, 0, 90, 0);
        setButton(str);
        this.isLoaded = Boolean.TRUE;
        if (num == null || num.intValue() <= 0) {
            show();
        } else {
            showWithDelay(num);
        }
    }

    public HyBidCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLoaded = null;
        this.showImmediately = Boolean.FALSE;
        initUi();
        initViews();
    }

    public HyBidCTAView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isLoaded = null;
        this.showImmediately = Boolean.FALSE;
        initUi();
        initViews();
    }

    public void show(String str, String str2, Integer num) {
        resetAll();
        if (num == null || num.intValue() == 0) {
            this.showImmediately = Boolean.TRUE;
        }
        setIconUrl(str);
        setButton(str2);
        if (num != null && num.intValue() > 0) {
            showWithDelay(num);
            return;
        }
        Boolean bool = this.isLoaded;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        show();
    }

    public void show(String str, String str2) {
        setVisibility(4);
        show(str, str2, (Integer) null);
    }

    public void show() {
        Boolean bool = this.isLoaded;
        if (bool == null || !bool.booleanValue() || isVisible() || this.mShowTimer != null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(1500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: net.pubnative.lite.sdk.views.cta.HyBidCTAView.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                HyBidCTAView.this.invokeShow();
                HyBidCTAView.this.clearAnimation();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        setVisibility(0);
        startAnimation(translateAnimation);
    }
}
