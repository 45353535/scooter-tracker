package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;
import com.ironsource.mediationsdk.l;

/* JADX INFO: loaded from: classes7.dex */
public final class zzz {
    private final AdSize[] zza;
    private final String zzb;

    public zzz(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.zza = zzc(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.zza = zzc(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        this.zzb = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static AdSize[] zzc(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    String str2 = strArrSplit2[0];
                    int i11 = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = strArrSplit2[1];
                    adSizeArr[i10] = new AdSize(i11, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.FULL_BANNER;
            } else if (l.f44064d.equals(strTrim)) {
                adSizeArr[i10] = AdSize.LEADERBOARD;
            } else if (l.f44067g.equals(strTrim)) {
                adSizeArr[i10] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(strTrim)) {
                adSizeArr[i10] = AdSize.FLUID;
            } else {
                if (!NativeAdContent.ViewTag.AD_ICON.equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                adSizeArr[i10] = AdSize.zza;
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final AdSize[] zza(boolean z10) {
        if (z10 || this.zza.length == 1) {
            return this.zza;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String zzb() {
        return this.zzb;
    }
}
