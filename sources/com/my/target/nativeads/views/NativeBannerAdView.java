package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.my.target.R;
import com.my.target.ba;
import com.my.target.common.NavigationType;
import com.my.target.common.views.StarsRatingView;
import com.my.target.gb;
import com.my.target.kb;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.r0;

/* JADX INFO: loaded from: classes11.dex */
public class NativeBannerAdView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconAdView f60378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f60379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f60380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StarsRatingView f60381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f60382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f60383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f60384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f60385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinearLayout f60386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NativeBannerAdViewBinder f60387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f60388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f60389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f60390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f60391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f60392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f60393r;

    public static final class a implements NativeBannerAdViewBinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NativeBannerAdView f60394a;

        public a(NativeBannerAdView nativeBannerAdView) {
            this.f60394a = nativeBannerAdView;
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getAdChoicesView() {
            return null;
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getAdvertisingView() {
            return this.f60394a.getAdvertisingTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getAgeRestrictionView() {
            return this.f60394a.getAgeRestrictionTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getDisclaimerView() {
            return this.f60394a.getDisclaimerTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getDomainView() {
            return this.f60394a.getDomainTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public IconAdView getIconView() {
            return this.f60394a.getIconView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public ViewGroup getRootAdBannerView() {
            return this.f60394a;
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getTitleView() {
            return this.f60394a.getTitleTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getVotesView() {
            return this.f60394a.getVotesTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public Button getCtaView() {
            return this.f60394a.getCtaButtonView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public StarsRatingView getStarsRatingView() {
            return this.f60394a.getStarsRatingView();
        }
    }

    public NativeBannerAdView(@NonNull Context context) {
        this(context, null);
    }

    public final void a(String str, TextView textView) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @NonNull
    public TextView getAdvertisingTextView() {
        return this.f60377b;
    }

    @NonNull
    public TextView getAgeRestrictionTextView() {
        return this.f60376a;
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.f60383h;
    }

    @NonNull
    public TextView getDisclaimerTextView() {
        return this.f60384i;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.f60380e;
    }

    @NonNull
    @Deprecated
    public IconAdView getIconImageView() {
        return this.f60378c;
    }

    @NonNull
    public IconAdView getIconView() {
        return this.f60378c;
    }

    @NonNull
    public NativeBannerAdViewBinder getNativeBannerAdViewBinder() {
        return this.f60387l;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.f60381f;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.f60379d;
    }

    @NonNull
    public TextView getVotesTextView() {
        return this.f60382g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        kb.c(this.f60386k, paddingTop, paddingLeft);
        int iA = kb.a(this.f60378c.getMeasuredHeight(), this.f60385j.getMeasuredHeight(), this.f60383h.getMeasuredHeight());
        int bottom = this.f60386k.getBottom() + this.f60390o;
        int iA2 = ((kb.a(this.f60378c.getMeasuredHeight(), this.f60385j.getMeasuredHeight()) - this.f60383h.getMeasuredHeight()) / 2) + this.f60386k.getMeasuredHeight();
        int i14 = this.f60393r;
        if (iA2 < i14) {
            bottom = paddingTop + i14;
        }
        kb.c(this.f60378c, ((iA - this.f60378c.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        kb.b(this.f60383h, ((iA - this.f60383h.getMeasuredHeight()) / 2) + bottom, getMeasuredWidth() - getPaddingRight());
        kb.c(this.f60385j, bottom + ((iA - this.f60385j.getMeasuredHeight()) / 2), kb.a(this.f60378c.getRight() + this.f60390o, paddingLeft));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        kb.a(this.f60386k, paddingLeft - this.f60392q, paddingTop, Integer.MIN_VALUE);
        this.f60378c.measure(View.MeasureSpec.makeMeasureSpec(this.f60391p, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f60391p, Integer.MIN_VALUE));
        this.f60383h.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f60388m, 1073741824));
        kb.a(this.f60385j, ((paddingLeft - this.f60378c.getMeasuredWidth()) - this.f60383h.getMeasuredWidth()) - (this.f60390o * 2), (paddingTop - this.f60386k.getMeasuredHeight()) - this.f60389n, Integer.MIN_VALUE);
        int measuredHeight = this.f60386k.getMeasuredHeight() + this.f60390o;
        int iA = ((kb.a(this.f60378c.getMeasuredHeight(), this.f60385j.getMeasuredHeight()) - this.f60383h.getMeasuredHeight()) / 2) + this.f60386k.getMeasuredHeight();
        int i12 = this.f60393r;
        if (iA < i12) {
            measuredHeight = i12;
        }
        setMeasuredDimension(size, measuredHeight + kb.a(this.f60385j.getMeasuredHeight(), this.f60378c.getMeasuredHeight(), this.f60383h.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom());
    }

    public void setupView(@Nullable NativeBanner nativeBanner) {
        if (nativeBanner == null) {
            return;
        }
        gb.a("NativeBannerAdView: Setup banner");
        if (nativeBanner.getIcon() != null) {
            this.f60378c.setVisibility(0);
        } else {
            this.f60378c.setVisibility(8);
        }
        if (NavigationType.WEB.equals(nativeBanner.getNavigationType())) {
            a(nativeBanner.getDomain(), this.f60380e);
            this.f60381f.setVisibility(8);
            this.f60382g.setVisibility(8);
        } else if ("store".equals(nativeBanner.getNavigationType())) {
            if (nativeBanner.getRating() <= 0.0f || nativeBanner.getRating() > 5.0f) {
                this.f60381f.setVisibility(8);
            } else {
                this.f60381f.setRating(nativeBanner.getRating());
                this.f60381f.setVisibility(0);
                a(String.valueOf(nativeBanner.getVotes()), this.f60382g);
                this.f60380e.setVisibility(8);
                if (nativeBanner.getVotes() > 0) {
                    this.f60382g.setVisibility(0);
                } else {
                    this.f60382g.setVisibility(8);
                }
                kb.b(this.f60382g, "votes_text");
            }
        }
        a(nativeBanner.getTitle(), this.f60379d);
        a(nativeBanner.getAdvertisingLabel(), this.f60377b);
        a(nativeBanner.getCtaText(), this.f60383h);
        a(nativeBanner.getAgeRestrictions(), this.f60376a);
        a(nativeBanner.getDisclaimer(), this.f60384i);
    }

    public NativeBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0 r0Var = new r0(context);
        this.f60376a = r0Var;
        TextView textView = new TextView(context);
        this.f60377b = textView;
        IconAdView iconAdView = new IconAdView(context);
        this.f60378c = iconAdView;
        TextView textView2 = new TextView(context);
        this.f60379d = textView2;
        TextView textView3 = new TextView(context);
        this.f60380e = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f60381f = starsRatingView;
        TextView textView4 = new TextView(context);
        this.f60382g = textView4;
        TextView textView5 = new TextView(context);
        this.f60384i = textView5;
        Button button = new Button(context);
        this.f60383h = button;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f60385j = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f60386k = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        kb kbVarE = kb.e(context);
        setId(R.id.nativeads_ad_view);
        r0Var.setId(R.id.nativeads_age_restrictions);
        textView.setId(R.id.nativeads_advertising);
        iconAdView.setId(R.id.nativeads_icon);
        textView2.setId(R.id.nativeads_title);
        textView3.setId(R.id.nativeads_domain);
        starsRatingView.setId(R.id.nativeads_rating);
        textView4.setId(R.id.nativeads_votes);
        textView5.setId(R.id.nativeads_disclaimer);
        button.setId(R.id.nativeads_call_to_action);
        kb.b(textView4, "votes_text");
        int iB = kbVarE.b(4);
        setPadding(iB, iB, iB, iB);
        this.f60389n = kbVarE.b(2);
        int iB2 = kbVarE.b(4);
        this.f60392q = iB2;
        this.f60391p = kbVarE.b(54);
        this.f60393r = kbVarE.b(20);
        int iB3 = kbVarE.b(12);
        int iB4 = kbVarE.b(10);
        this.f60388m = kbVarE.b(40);
        this.f60390o = kbVarE.b(4);
        button.setPadding(iB4, 0, iB4, 0);
        button.setTransformationMethod(null);
        button.setMaxEms(8);
        button.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setTextColor(NativeAdColor.STANDARD_BLUE);
        button.setTextSize(2, 16.0f);
        kb.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setStroke(kbVarE.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable.setCornerRadius(kbVarE.b(2));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable2.setStroke(kbVarE.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(kbVarE.b(2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        button.setBackground(stateListDrawable);
        setClickable(true);
        r0Var.setTextColor(NativeAdColor.STANDARD_GREY);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        gradientDrawable3.setStroke(1, -13421773);
        int iB5 = kbVarE.b(2);
        r0Var.setBackgroundDrawable(gradientDrawable3);
        r0Var.setGravity(17);
        r0Var.setPadding(iB5, 0, 0, 0);
        r0Var.setBackgroundColor(0);
        r0Var.setMaxEms(10);
        r0Var.setLines(1);
        r0Var.setTextSize(2, 10.0f);
        textView.setTextSize(2, 10.0f);
        textView.setTextColor(NativeAdColor.STANDARD_GREY);
        textView.setLines(1);
        textView.setEllipsize(truncateAt);
        textView.setPadding(iB2, 0, 0, 0);
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(2, 16.0f);
        textView2.setTypeface(null, 1);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView3.setTextColor(NativeAdColor.STANDARD_GREY);
        textView3.setTextSize(2, 14.0f);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setIncludeFontPadding(false);
        textView4.setTextColor(NativeAdColor.STANDARD_GREY);
        textView4.setTextSize(2, 12.0f);
        textView4.setLines(1);
        textView4.setEllipsize(truncateAt);
        textView4.setPadding(kbVarE.b(4), 0, 0, 0);
        textView5.setTextColor(NativeAdColor.STANDARD_GREY);
        textView5.setTextSize(2, 12.0f);
        textView5.setMaxLines(2);
        textView5.setEllipsize(truncateAt);
        starsRatingView.setStarSize(iB3);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        addView(iconAdView);
        addView(button);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout2.addView(r0Var);
        linearLayout2.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(linearLayout3);
        linearLayout.addView(textView5);
        linearLayout3.addView(textView3);
        linearLayout3.addView(starsRatingView);
        linearLayout3.addView(textView4);
        this.f60387l = new a(this);
        ba.f();
    }
}
