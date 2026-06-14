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
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.factories.NativeViewsFactory;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import com.my.target.r0;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class NativeAdView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconAdView f60352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f60353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f60354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f60355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StarsRatingView f60356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f60357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f60358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f60359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinearLayout f60360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f60361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinearLayout f60362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final NativeAdViewBinder f60363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f60364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f60365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f60366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f60367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f60368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f60369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f60370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MediaAdView f60371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PromoCardRecyclerView f60372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PromoCardRecyclerView.PromoCardAdapter f60373x;

    public class a extends PromoCardRecyclerView.PromoCardAdapter {
        public a() {
        }

        @Override // com.my.target.nativeads.views.PromoCardRecyclerView.PromoCardAdapter
        public PromoCardView getPromoCardView() {
            return NativeViewsFactory.getNativeAdCardView(NativeAdView.this.getContext());
        }
    }

    public static final class b implements NativeAdViewBinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NativeAdView f60375a;

        public b(NativeAdView nativeAdView) {
            this.f60375a = nativeAdView;
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getAdChoicesView() {
            return null;
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getAdvertisingView() {
            return this.f60375a.getAdvertisingTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getAgeRestrictionView() {
            return this.f60375a.getAgeRestrictionTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getDescriptionView() {
            return this.f60375a.getDescriptionTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getDisclaimerView() {
            return this.f60375a.getDisclaimerTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getDomainOrCategoryView() {
            return this.f60375a.getDomainOrCategoryTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public IconAdView getIconView() {
            return this.f60375a.getIconView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public MediaAdView getMediaAdView() {
            return this.f60375a.getMediaAdView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public PromoCardRecyclerView getPromoCardRecyclerView() {
            return this.f60375a.getPromoCardRecyclerView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public ViewGroup getRootAdView() {
            return this.f60375a;
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getTitleView() {
            return this.f60375a.getTitleTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getVotesView() {
            return this.f60375a.getVotesTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public Button getCtaView() {
            return this.f60375a.getCtaButtonView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public StarsRatingView getStarsRatingView() {
            return this.f60375a.getStarsRatingView();
        }
    }

    public NativeAdView(@NonNull Context context) {
        this(context, null);
    }

    public final PromoCardRecyclerView.PromoCardAdapter a(List list) {
        if (this.f60373x == null) {
            this.f60373x = new a();
        }
        this.f60373x.setCards(list);
        return this.f60373x;
    }

    @NonNull
    public TextView getAdvertisingTextView() {
        return this.f60351b;
    }

    @NonNull
    public TextView getAgeRestrictionTextView() {
        return this.f60350a;
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.f60358i;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.f60355f;
    }

    @NonNull
    public TextView getDisclaimerTextView() {
        return this.f60359j;
    }

    @NonNull
    public TextView getDomainOrCategoryTextView() {
        return this.f60354e;
    }

    @NonNull
    @Deprecated
    public IconAdView getIconImageView() {
        return this.f60352c;
    }

    @NonNull
    public IconAdView getIconView() {
        return this.f60352c;
    }

    @Nullable
    public MediaAdView getMediaAdView() {
        return this.f60371v;
    }

    @NonNull
    public NativeAdViewBinder getNativeAdViewBinder() {
        return this.f60363n;
    }

    @Nullable
    public PromoCardRecyclerView getPromoCardRecyclerView() {
        return this.f60372w;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.f60356g;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.f60353d;
    }

    @NonNull
    public TextView getVotesTextView() {
        return this.f60357h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PromoCardRecyclerView promoCardRecyclerView;
        int paddingLeft = getPaddingLeft();
        kb.c(this.f60361l, getPaddingTop(), paddingLeft);
        int iA = kb.a(this.f60352c.getMeasuredHeight(), this.f60360k.getMeasuredHeight());
        int bottom = this.f60361l.getBottom() + this.f60369t;
        kb.c(this.f60352c, ((iA - this.f60352c.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        kb.c(this.f60360k, ((iA - this.f60360k.getMeasuredHeight()) / 2) + bottom, kb.a(this.f60352c.getRight() + this.f60369t, paddingLeft));
        int i14 = bottom + iA;
        int bottom2 = this.f60365p + i14;
        if (this.f60370u && (promoCardRecyclerView = this.f60372w) != null) {
            kb.c(promoCardRecyclerView, i14 + this.f60369t, paddingLeft);
            return;
        }
        kb.c(this.f60371v, bottom2, paddingLeft);
        int iA2 = kb.a(this.f60355f.getMeasuredHeight(), this.f60358i.getMeasuredHeight());
        MediaAdView mediaAdView = this.f60371v;
        if (mediaAdView != null) {
            bottom2 = mediaAdView.getBottom();
        }
        int paddingBottom = bottom2 + getPaddingBottom();
        int measuredHeight = ((iA2 - this.f60355f.getMeasuredHeight()) / 2) + paddingBottom;
        int measuredHeight2 = ((iA2 - this.f60358i.getMeasuredHeight()) / 2) + paddingBottom;
        kb.c(this.f60355f, measuredHeight, paddingLeft);
        kb.b(this.f60358i, measuredHeight2, getMeasuredWidth() - getPaddingRight());
        kb.c(this.f60359j, paddingBottom + iA2 + this.f60365p, paddingLeft);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        int paddingBottom;
        PromoCardRecyclerView promoCardRecyclerView;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        kb.a(this.f60361l, paddingLeft - this.f60367r, paddingTop, Integer.MIN_VALUE);
        this.f60352c.measure(View.MeasureSpec.makeMeasureSpec(this.f60366q, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f60366q, Integer.MIN_VALUE));
        kb.a(this.f60360k, (paddingLeft - this.f60352c.getMeasuredWidth()) - this.f60369t, (paddingTop - this.f60361l.getMeasuredHeight()) - this.f60365p, Integer.MIN_VALUE);
        if (!this.f60370u || (promoCardRecyclerView = this.f60372w) == null) {
            MediaAdView mediaAdView = this.f60371v;
            if (mediaAdView != null) {
                mediaAdView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
                this.f60358i.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f60364o, 1073741824));
                kb.a(this.f60355f, (paddingLeft - this.f60358i.getMeasuredWidth()) - this.f60369t, paddingTop, Integer.MIN_VALUE);
                kb.a(this.f60359j, paddingLeft, paddingTop, Integer.MIN_VALUE);
                size2 = this.f60361l.getMeasuredHeight() + this.f60369t + kb.a(this.f60360k.getMeasuredHeight(), this.f60352c.getMeasuredHeight()) + this.f60371v.getMeasuredHeight() + this.f60365p + getPaddingBottom() + kb.a(this.f60355f.getMeasuredHeight(), this.f60358i.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom();
                int measuredHeight2 = this.f60359j.getVisibility() == 0 ? this.f60359j.getMeasuredHeight() : 0;
                if (measuredHeight2 > 0) {
                    measuredHeight = size2 + measuredHeight2;
                    paddingBottom = this.f60365p;
                }
            }
            setMeasuredDimension(size, size2);
        }
        promoCardRecyclerView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
        measuredHeight = this.f60361l.getMeasuredHeight() + this.f60369t + kb.a(this.f60360k.getMeasuredHeight(), this.f60352c.getMeasuredHeight()) + this.f60372w.getMeasuredHeight() + getPaddingTop();
        paddingBottom = getPaddingBottom();
        size2 = measuredHeight + paddingBottom;
        setMeasuredDimension(size, size2);
    }

    public void setupView(@Nullable NativePromoBanner nativePromoBanner) {
        if (nativePromoBanner == null) {
            return;
        }
        gb.a("NativeAdView: Setup banner");
        if (nativePromoBanner.getIcon() != null) {
            this.f60352c.setVisibility(0);
        } else {
            this.f60352c.setVisibility(8);
        }
        if (!this.f60370u || this.f60372w == null) {
            a(nativePromoBanner.getCtaText(), this.f60358i);
        } else {
            this.f60358i.setVisibility(8);
            this.f60359j.setVisibility(8);
            this.f60372w.setPromoCardAdapter(a(nativePromoBanner.getCards()));
        }
        if (NavigationType.WEB.equals(nativePromoBanner.getNavigationType())) {
            if (!this.f60370u) {
                this.f60356g.setVisibility(8);
                this.f60357h.setVisibility(8);
                a(nativePromoBanner.getDomain(), this.f60354e);
            }
        } else if ("store".equals(nativePromoBanner.getNavigationType())) {
            String category = nativePromoBanner.getCategory();
            String subCategory = nativePromoBanner.getSubCategory();
            String str = "";
            if (!TextUtils.isEmpty(category)) {
                str = "" + category;
                if (!TextUtils.isEmpty(subCategory)) {
                    str = str + ", ";
                }
            }
            if (!TextUtils.isEmpty(subCategory)) {
                str = str + subCategory;
            }
            kb.b(this.f60354e, "category_text");
            a(str, this.f60354e);
            if (nativePromoBanner.getRating() > 0.0f && nativePromoBanner.getRating() <= 5.0f) {
                this.f60356g.setVisibility(0);
                if (nativePromoBanner.getVotes() > 0) {
                    a(String.valueOf(nativePromoBanner.getVotes()), this.f60357h);
                } else {
                    this.f60357h.setVisibility(8);
                }
                this.f60356g.setRating(nativePromoBanner.getRating());
            }
        }
        a(nativePromoBanner.getDisclaimer(), this.f60359j);
        a(nativePromoBanner.getTitle(), this.f60353d);
        a(nativePromoBanner.getDescription(), this.f60355f);
        a(nativePromoBanner.getAdvertisingLabel(), this.f60351b);
        a(nativePromoBanner.getAgeRestrictions(), this.f60350a);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, false, -1.0f, -1);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10, float f10, int i11) {
        super(context, attributeSet, i10);
        this.f60370u = z10;
        r0 r0Var = new r0(context);
        this.f60350a = r0Var;
        TextView textView = new TextView(context);
        this.f60351b = textView;
        IconAdView iconView = NativeViewsFactory.getIconView(context);
        this.f60352c = iconView;
        TextView textView2 = new TextView(context);
        this.f60353d = textView2;
        TextView textView3 = new TextView(context);
        this.f60354e = textView3;
        TextView textView4 = new TextView(context);
        this.f60355f = textView4;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f60356g = starsRatingView;
        TextView textView5 = new TextView(context);
        this.f60357h = textView5;
        TextView textView6 = new TextView(context);
        this.f60359j = textView6;
        Button button = new Button(context);
        this.f60358i = button;
        kb kbVarE = kb.e(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f60360k = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f60361l = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f60362m = linearLayout3;
        setId(R.id.nativeads_ad_view);
        textView.setId(R.id.nativeads_advertising);
        textView2.setId(R.id.nativeads_title);
        textView4.setId(R.id.nativeads_description);
        int i12 = R.id.nativeads_rating;
        starsRatingView.setId(i12);
        textView3.setId(R.id.nativeads_domain);
        textView6.setId(R.id.nativeads_disclaimer);
        button.setId(R.id.nativeads_call_to_action);
        iconView.setId(R.id.nativeads_icon);
        int i13 = R.id.nativeads_age_restrictions;
        r0Var.setId(i13);
        textView5.setId(R.id.nativeads_votes);
        starsRatingView.setId(i12);
        kb.b(textView5, "votes_text");
        int iB = kbVarE.b(4);
        setPadding(iB, iB, iB, kbVarE.b(8));
        this.f60365p = kbVarE.b(8);
        this.f60367r = kbVarE.b(9);
        this.f60366q = kbVarE.b(54);
        this.f60368s = kbVarE.b(12);
        int iB2 = kbVarE.b(10);
        this.f60364o = kbVarE.b(40);
        this.f60369t = kbVarE.b(4);
        r0Var.setId(i13);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -13421773);
        int iB3 = kbVarE.b(2);
        r0Var.setBackgroundDrawable(gradientDrawable);
        r0Var.setGravity(17);
        r0Var.setPadding(iB3, 0, 0, 0);
        button.setPadding(iB2, 0, iB2, 0);
        button.setMaxEms(8);
        button.setLines(1);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setTransformationMethod(null);
        kb.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable2.setStroke(kbVarE.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(kbVarE.b(1));
        GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable3.setStroke(kbVarE.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable3.setCornerRadius(kbVarE.b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable3);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
        button.setBackgroundDrawable(stateListDrawable);
        setClickable(true);
        if (z10) {
            PromoCardRecyclerView promoCardRecyclerView = NativeViewsFactory.getPromoCardRecyclerView(f10, i11, getContext());
            this.f60372w = promoCardRecyclerView;
            promoCardRecyclerView.setId(R.id.nativeads_media_view);
            addView(this.f60372w);
        } else {
            MediaAdView mediaAdView = NativeViewsFactory.getMediaAdView(getContext());
            this.f60371v = mediaAdView;
            mediaAdView.setId(R.id.nativeads_media_view);
            addView(this.f60371v);
        }
        addView(iconView);
        addView(button);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout2.addView(r0Var);
        linearLayout2.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayout.addView(linearLayout3);
        linearLayout3.addView(starsRatingView);
        linearLayout3.addView(textView5);
        addView(textView4);
        addView(textView6);
        a();
        this.f60363n = new b(this);
        ba.e();
    }

    public final void a() {
        this.f60350a.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60350a.setBackgroundColor(0);
        this.f60350a.setLines(1);
        TextView textView = this.f60350a;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f60350a.setTextSize(2, 10.0f);
        this.f60351b.setTextSize(2, 12.0f);
        this.f60351b.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60351b.setLines(1);
        this.f60351b.setEllipsize(truncateAt);
        this.f60351b.setPadding(this.f60367r, 0, 0, 0);
        this.f60353d.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60353d.setTextSize(2, 16.0f);
        this.f60353d.setTypeface(null, 1);
        this.f60353d.setLines(1);
        this.f60353d.setEllipsize(truncateAt);
        this.f60354e.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60354e.setTextSize(2, 14.0f);
        this.f60354e.setLines(1);
        this.f60354e.setIncludeFontPadding(false);
        this.f60354e.setEllipsize(truncateAt);
        this.f60355f.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60355f.setTextSize(2, 15.0f);
        this.f60355f.setMaxLines(3);
        this.f60355f.setEllipsize(truncateAt);
        this.f60357h.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60357h.setTextSize(2, 12.0f);
        this.f60357h.setLines(1);
        this.f60357h.setEllipsize(truncateAt);
        this.f60357h.setPadding(this.f60369t, 0, 0, 0);
        this.f60359j.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60359j.setTextSize(2, 12.0f);
        this.f60359j.setMaxLines(2);
        this.f60359j.setEllipsize(truncateAt);
        this.f60358i.setTextColor(NativeAdColor.STANDARD_BLUE);
        this.f60358i.setLines(1);
        this.f60358i.setTextSize(2, 16.0f);
        this.f60358i.setEllipsize(truncateAt);
        this.f60356g.setStarSize(this.f60368s);
        this.f60360k.setOrientation(1);
        this.f60361l.setOrientation(0);
        this.f60361l.setGravity(16);
        this.f60362m.setOrientation(0);
        this.f60362m.setGravity(16);
    }

    public final void a(String str, TextView textView) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
