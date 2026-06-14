package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.timepicker.TimeModel;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.kb;
import com.my.target.ma;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class AppwallAdTeaserView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb f60308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma f60310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ma f60311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ma f60312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f60313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f60314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShapeDrawable f60315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f60316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StarsRatingView f60317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f60318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ma f60319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f60320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ma f60321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public NativeAppwallBanner f60322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f60323p;

    public AppwallAdTeaserView(Context context) {
        super(context);
        this.f60309b = Color.rgb(36, 36, 36);
        this.f60323p = false;
        this.f60312e = new ma(context);
        this.f60314g = new LinearLayout(context);
        this.f60313f = new TextView(context);
        this.f60321n = new ma(context);
        this.f60311d = new ma(context);
        this.f60319l = new ma(context);
        this.f60320m = new TextView(context);
        this.f60316i = new TextView(context);
        this.f60317j = new StarsRatingView(context);
        this.f60318k = new TextView(context);
        this.f60310c = new ma(context);
        kb kbVarE = kb.e(context);
        this.f60308a = kbVarE;
        float fB = kbVarE.b(6);
        this.f60315h = new ShapeDrawable(new RoundRectShape(new float[]{fB, fB, fB, fB, fB, fB, fB, fB}, null, null));
        a();
    }

    public final void a() {
        int iB = this.f60308a.b(18);
        int iB2 = this.f60308a.b(14);
        int iB3 = this.f60308a.b(53);
        int iC = kb.c();
        int iC2 = kb.c();
        int iC3 = kb.c();
        setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB3 + iB2 + iB2, iB3 + iB + iB);
        this.f60312e.setPadding(iB2, iB, iB2, iB);
        addView(this.f60312e, layoutParams);
        int iB4 = this.f60308a.b(20);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iB4, iB4);
        layoutParams2.leftMargin = this.f60308a.b(57);
        layoutParams2.topMargin = this.f60308a.b(10);
        this.f60310c.setLayoutParams(layoutParams2);
        addView(this.f60310c);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iB3, iB3);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = iB2;
        layoutParams3.topMargin = iB;
        this.f60314g.setBackgroundDrawable(this.f60315h);
        this.f60314g.setOrientation(1);
        addView(this.f60314g, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = this.f60313f;
        Typeface typeface = Typeface.SANS_SERIF;
        textView.setTypeface(typeface);
        this.f60313f.setPadding(0, this.f60308a.b(10), 0, this.f60308a.b(2));
        this.f60313f.setTextSize(2, 13.0f);
        this.f60313f.setGravity(49);
        this.f60314g.addView(this.f60313f, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.f60308a.b(20), this.f60308a.b(20));
        layoutParams5.gravity = 1;
        this.f60314g.addView(this.f60321n, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(this.f60308a.b(19), -2);
        layoutParams6.addRule(15);
        layoutParams6.addRule(11);
        layoutParams6.rightMargin = this.f60308a.b(30);
        addView(this.f60311d, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(iB3, iB3);
        layoutParams7.addRule(10);
        layoutParams7.addRule(11);
        addView(this.f60319l, layoutParams7);
        this.f60320m.setTypeface(typeface);
        this.f60320m.setTextSize(2, 18.0f);
        this.f60320m.setTextColor(this.f60309b);
        this.f60320m.setPadding(0, 0, this.f60308a.b(67), 0);
        this.f60320m.setId(iC3);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = this.f60308a.b(91);
        layoutParams8.rightMargin = this.f60308a.b(15);
        layoutParams8.topMargin = this.f60308a.b(13);
        this.f60320m.setLayoutParams(layoutParams8);
        addView(this.f60320m);
        this.f60316i.setTypeface(typeface);
        this.f60316i.setTextSize(2, 13.0f);
        this.f60316i.setTextColor(this.f60309b);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.leftMargin = this.f60308a.b(91);
        layoutParams9.addRule(3, iC3);
        this.f60316i.setId(iC);
        this.f60316i.setLayoutParams(layoutParams9);
        addView(this.f60316i);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(3, iC);
        layoutParams10.leftMargin = this.f60308a.b(91);
        layoutParams10.topMargin = this.f60308a.b(5);
        this.f60317j.setPadding(0, 0, 0, this.f60308a.b(20));
        this.f60317j.setStarsPadding(this.f60308a.b(2));
        this.f60317j.setStarSize(this.f60308a.b(12));
        this.f60317j.setId(iC2);
        addView(this.f60317j, layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(1, iC2);
        layoutParams11.addRule(3, iC);
        layoutParams11.leftMargin = this.f60308a.b(9);
        this.f60318k.setTypeface(typeface);
        this.f60318k.setPadding(0, this.f60308a.b(2), 0, 0);
        this.f60318k.setTextSize(2, 13.0f);
        this.f60318k.setTextColor(this.f60309b);
        this.f60318k.setGravity(16);
        addView(this.f60318k, layoutParams11);
    }

    @Nullable
    public NativeAppwallBanner getBanner() {
        return this.f60322o;
    }

    @NonNull
    public ImageView getBannerIconImageView() {
        return this.f60312e;
    }

    @NonNull
    public TextView getCoinsCountTextView() {
        return this.f60313f;
    }

    @NonNull
    public ImageView getCoinsIconImageView() {
        return this.f60321n;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.f60316i;
    }

    @NonNull
    public ImageView getNotificationImageView() {
        return this.f60310c;
    }

    @NonNull
    public ImageView getOpenImageView() {
        return this.f60311d;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.f60317j;
    }

    @NonNull
    public ImageView getStatusIconImageView() {
        return this.f60319l;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.f60320m;
    }

    @NonNull
    public TextView getVotesCountTextView() {
        return this.f60318k;
    }

    public boolean isViewed() {
        return this.f60323p;
    }

    public void removeNotification() {
        removeView(this.f60310c);
    }

    public void setNativeAppwallBanner(NativeAppwallBanner nativeAppwallBanner) {
        this.f60322o = nativeAppwallBanner;
        this.f60312e.setImageData(nativeAppwallBanner.getIcon());
        ImageData bubbleIcon = nativeAppwallBanner.getBubbleIcon();
        this.f60310c.setImageData(bubbleIcon);
        String description = nativeAppwallBanner.getDescription();
        this.f60320m.setText(nativeAppwallBanner.getTitle());
        this.f60316i.setText(description);
        if (nativeAppwallBanner.isHasNotification()) {
            this.f60310c.setVisibility(0);
            this.f60310c.setImageData(bubbleIcon);
        } else {
            this.f60310c.setVisibility(8);
        }
        if (nativeAppwallBanner.getCoins() > 0) {
            this.f60314g.setVisibility(0);
            this.f60321n.setImageData(nativeAppwallBanner.getCoinsIcon());
            this.f60313f.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(nativeAppwallBanner.getCoins())));
            this.f60313f.setTextColor(nativeAppwallBanner.getCoinsIconTextColor());
            this.f60315h.getPaint().setColor(nativeAppwallBanner.getCoinsIconBgColor());
            this.f60311d.setVisibility(8);
        } else if (nativeAppwallBanner.isAppInstalled()) {
            this.f60314g.setVisibility(8);
            this.f60311d.setVisibility(0);
            this.f60311d.setImageData(nativeAppwallBanner.getGotoAppIcon());
        } else {
            this.f60314g.setVisibility(8);
            this.f60311d.setVisibility(8);
        }
        ImageData statusIcon = nativeAppwallBanner.getStatusIcon();
        if (statusIcon != null) {
            this.f60319l.setVisibility(0);
            this.f60319l.setImageData(statusIcon);
        } else {
            this.f60319l.setVisibility(8);
        }
        if (nativeAppwallBanner.getCoins() != 0 || nativeAppwallBanner.isAppInstalled()) {
            this.f60316i.setPadding(0, 0, this.f60308a.b(70), 0);
        } else if (statusIcon != null) {
            this.f60316i.setPadding(0, 0, this.f60308a.b(20), 0);
        }
        if (nativeAppwallBanner.getRating() <= 0.0f) {
            this.f60317j.setVisibility(8);
            this.f60318k.setVisibility(8);
            TextView textView = this.f60316i;
            textView.setPadding(textView.getPaddingLeft(), this.f60316i.getPaddingTop(), this.f60316i.getPaddingRight(), this.f60308a.b(20));
            return;
        }
        this.f60317j.setRating(nativeAppwallBanner.getRating());
        this.f60317j.setVisibility(0);
        if (nativeAppwallBanner.getVotes() <= 0) {
            this.f60318k.setVisibility(8);
        } else {
            this.f60318k.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(nativeAppwallBanner.getVotes())));
            this.f60318k.setVisibility(0);
        }
    }

    public void setViewed(boolean z10) {
        this.f60323p = z10;
    }
}
