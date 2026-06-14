package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes11.dex */
public final class tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f65306h = R.id.io_start_list3d_photo;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f65307i = R.id.io_start_list3d_title;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f65308j = R.id.io_start_list3d_description;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f65309k = R.id.io_start_list3d_download;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f65310l = R.id.io_start_list3d_rating;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f65311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f65312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f65313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f65314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f65315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RatingBar f65316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MetaDataStyle f65317g = null;

    public tb(Context context) {
        context.setTheme(android.R.style.Theme);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f65311a = relativeLayout;
        relativeLayout.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        relativeLayout.setLayoutParams(layoutParams);
        int iRound = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        int iRound2 = Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int iRound3 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int iRound4 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int iRound5 = Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int iRound6 = Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        relativeLayout.setPadding(iRound5, iRound, iRound5, iRound);
        relativeLayout.setTag(this);
        ImageView imageView = new ImageView(context);
        this.f65312b = imageView;
        int i10 = f65306h;
        imageView.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound6, iRound6);
        layoutParams2.addRule(15);
        imageView.setLayoutParams(layoutParams2);
        imageView.setPadding(0, 0, iRound4, 0);
        TextView textView = new TextView(context);
        this.f65313c = textView;
        int i11 = f65307i;
        textView.setId(i11);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i10);
        layoutParams3.addRule(6, i10);
        textView.setLayoutParams(layoutParams3);
        textView.setPadding(0, 0, 0, iRound3);
        textView.setTextColor(AdsCommonMetaData.k().q().intValue());
        textView.setTextSize(AdsCommonMetaData.k().s().intValue());
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        li.a(textView, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f65314d = textView2;
        textView2.setId(f65308j);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(17, i10);
        layoutParams4.addRule(3, i11);
        layoutParams4.setMargins(0, 0, 0, iRound3);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(AdsCommonMetaData.k().l().intValue());
        textView2.setTextSize(AdsCommonMetaData.k().n().intValue());
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        li.a(textView2, AdsCommonMetaData.k().m());
        RatingBar ratingBar = new RatingBar(context);
        this.f65316f = ratingBar;
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(17, i10);
        layoutParams5.addRule(8, i10);
        layoutParams5.setMargins(0, 0, 0, -iRound3);
        ratingBar.setLayoutParams(layoutParams5);
        ratingBar.setPadding(0, 0, 0, iRound2);
        ratingBar.setId(f65310l);
        TextView textView3 = new TextView(context);
        this.f65315e = textView3;
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(21);
        layoutParams6.addRule(8, i10);
        textView3.setLayoutParams(layoutParams6);
        textView3.setText("Download");
        textView3.setTextColor(-1);
        textView3.setTextSize(12.0f);
        textView3.setTypeface(null, 1);
        textView3.setPadding(iRound5, iRound4, iRound5, iRound4);
        textView3.setId(f65309k);
        textView3.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        textView3.setBackgroundDrawable(new sb(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        relativeLayout.addView(imageView);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        relativeLayout.addView(ratingBar);
        relativeLayout.addView(textView3);
    }
}
