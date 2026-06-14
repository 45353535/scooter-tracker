package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.my.target.kb;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.PromoCardView;

/* JADX INFO: loaded from: classes11.dex */
public class NativeAdCardView extends LinearLayout implements PromoCardView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f60339j = kb.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaAdView f60340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f60343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb f60344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RelativeLayout f60345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f60346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f60347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f60348i;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeAdCardView nativeAdCardView = NativeAdCardView.this;
            View.OnClickListener onClickListener = nativeAdCardView.f60347h;
            if (onClickListener != null) {
                onClickListener.onClick(nativeAdCardView);
            }
        }
    }

    public NativeAdCardView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        setOrientation(1);
        setPadding(0, this.f60344e.b(8), 0, this.f60344e.b(8));
        setClickable(true);
        kb.a(this, 0, NativeAdColor.BACKGROUND_TOUCH);
        kb.a(this.f60345f, 0, NativeAdColor.BACKGROUND_TOUCH, -3355444, this.f60344e.b(1), 0);
        Button button = this.f60343d;
        int i10 = f60339j;
        button.setId(i10);
        this.f60343d.setMaxEms(10);
        this.f60343d.setLines(1);
        Button button2 = this.f60343d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button2.setEllipsize(truncateAt);
        this.f60343d.setPadding(this.f60344e.b(10), 0, this.f60344e.b(10), 0);
        this.f60343d.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.f60344e.b(30));
        layoutParams.addRule(11, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(this.f60344e.b(12), this.f60344e.b(12), this.f60344e.b(12), this.f60344e.b(12));
        this.f60343d.setLayoutParams(layoutParams);
        this.f60343d.setTransformationMethod(null);
        this.f60343d.setStateListAnimator(null);
        this.f60343d.setTextColor(NativeAdColor.STANDARD_BLUE);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setStroke(this.f60344e.b(1), NativeAdColor.STANDARD_BLUE);
        gradientDrawable.setCornerRadius(this.f60344e.b(1));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable2.setStroke(this.f60344e.b(1), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(this.f60344e.b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        this.f60343d.setBackgroundDrawable(stateListDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(0, i10);
        this.f60346g.setLayoutParams(layoutParams2);
        this.f60346g.setGravity(16);
        this.f60346g.setOrientation(1);
        this.f60341b.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60341b.setTextSize(2, 14.0f);
        this.f60341b.setTypeface(null, 1);
        this.f60341b.setLines(2);
        this.f60341b.setEllipsize(truncateAt);
        this.f60341b.setPadding(this.f60344e.b(12), this.f60344e.b(6), this.f60344e.b(1), this.f60344e.b(1));
        this.f60342c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60342c.setTextSize(2, 12.0f);
        this.f60342c.setLines(1);
        this.f60342c.setEllipsize(truncateAt);
        this.f60342c.setPadding(this.f60344e.b(12), this.f60344e.b(1), this.f60344e.b(1), this.f60344e.b(12));
        addView(this.f60340a);
        addView(this.f60345f);
        this.f60345f.addView(this.f60343d);
        this.f60345f.addView(this.f60346g);
        this.f60346g.addView(this.f60341b);
        this.f60346g.addView(this.f60342c);
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    @NonNull
    public MediaAdView getMediaAdView() {
        return this.f60340a;
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    @NonNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return x10 > ((float) this.f60340a.getLeft()) && x10 < ((float) this.f60340a.getRight()) && y10 > ((float) this.f60340a.getTop()) && y10 < ((float) this.f60340a.getBottom());
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    public void setCard(@NonNull PromoCardView.Card card) {
        this.f60341b.setText(card.getTitle());
        this.f60342c.setText(card.getDescription());
        this.f60343d.setText(card.getCtaButtonText());
        this.f60343d.setContentDescription(card.getCtaButtonText());
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    public void setCtaOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f60343d.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f60347h = onClickListener;
        super.setOnClickListener(onClickListener);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setOnClickListener(this.f60348i);
        }
    }

    public NativeAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f60348i = new a();
        MediaAdView mediaAdView = new MediaAdView(context);
        this.f60340a = mediaAdView;
        TextView textView = new TextView(context);
        this.f60341b = textView;
        TextView textView2 = new TextView(context);
        this.f60342c = textView2;
        this.f60345f = new RelativeLayout(context);
        Button button = new Button(context);
        this.f60343d = button;
        this.f60344e = kb.e(context);
        this.f60346g = new LinearLayout(context);
        kb.b(this, "card_view");
        kb.b(mediaAdView, "card_media_view");
        kb.b(textView, "card_title_text");
        kb.b(textView2, "card_description_text");
        kb.b(button, "card_cta_text");
        a();
    }
}
