package com.appodeal.ads.adapters.admobnative.banner;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appodeal.ads.adapters.admob.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final void a(NativeAdView nativeAdView, NativeAd nativeAd) {
        TextView textView = (TextView) nativeAdView.findViewById(R.id.apd_admob_banner_headline);
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.apd_admob_banner_body);
        Button button = (Button) nativeAdView.findViewById(R.id.apd_admob_banner_cta);
        ((MediaView) nativeAdView.findViewById(R.id.apd_admob_banner_media)).setVisibility(8);
        textView.setText(nativeAd.getHeadline());
        nativeAdView.setHeadlineView(textView);
        textView2.setText(nativeAd.getBody());
        textView2.setSelected(true);
        nativeAdView.setBodyView(textView2);
        button.setText(nativeAd.getCallToAction());
        nativeAdView.setCallToActionView(button);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.apd_admob_banner_icon);
        NativeAd.Image icon = nativeAd.getIcon();
        if (icon != null) {
            imageView.setVisibility(0);
            imageView.setClipToOutline(true);
            imageView.setImageDrawable(icon.getDrawable());
        } else {
            imageView.setVisibility(8);
        }
        nativeAdView.setNativeAd(nativeAd);
    }
}
