package com.startapp.sdk.ads.nativead;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.compose.material.TextFieldImplKt;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class NativeAdPreferences extends AdPreferences {
    private static final int DEFAULT_ADS_NUMBER = 1;
    private static final boolean DEFAULT_AUTO_DOWNLOAD_BITMAP = false;
    private static final boolean DEFAULT_IS_CONTENT_AD = false;
    private static final boolean DEFAULT_USE_SIMPLE_TOKEN = true;
    private static final long serialVersionUID = 4908967312868830516L;
    private int adsNumber;
    private boolean autoBitmapDownload;
    private NativeAdBitmapSize bitmapSize;
    private boolean isContentAd;
    private int moreImage;
    private int primaryImage;
    private boolean useSimpleToken;

    @Keep
    public enum NativeAdBitmapSize {
        SIZE72X72(72, 72),
        SIZE100X100(100, 100),
        SIZE150X150(TextFieldImplKt.AnimationDuration, TextFieldImplKt.AnimationDuration),
        SIZE340X340(340, 340);

        final int height;
        final int width;

        NativeAdBitmapSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }
    }

    @Keep
    public NativeAdPreferences() {
        this.adsNumber = 1;
        this.autoBitmapDownload = false;
        this.primaryImage = -1;
        this.moreImage = -1;
        this.isContentAd = false;
        this.useSimpleToken = true;
    }

    @Keep
    public int getAdsNumber() {
        return this.adsNumber;
    }

    @Keep
    public NativeAdBitmapSize getImageSize() {
        return this.bitmapSize;
    }

    @Keep
    public int getPrimaryImageSize() {
        return this.primaryImage;
    }

    @Keep
    public int getSecondaryImageSize() {
        return this.moreImage;
    }

    @Keep
    public boolean isAutoBitmapDownload() {
        return this.autoBitmapDownload;
    }

    @Keep
    public boolean isContentAd() {
        return this.isContentAd;
    }

    @Override // com.startapp.sdk.adsbase.model.AdPreferences
    @Keep
    public boolean isSimpleToken() {
        return this.useSimpleToken;
    }

    @Keep
    public NativeAdPreferences setAdsNumber(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        this.adsNumber = i10;
        return this;
    }

    @Keep
    public NativeAdPreferences setAutoBitmapDownload(boolean z10) {
        this.autoBitmapDownload = z10;
        return this;
    }

    @Keep
    public NativeAdPreferences setContentAd(boolean z10) {
        this.isContentAd = z10;
        return this;
    }

    @Keep
    public NativeAdPreferences setImageSize(NativeAdBitmapSize nativeAdBitmapSize) {
        this.bitmapSize = nativeAdBitmapSize;
        return this;
    }

    @Keep
    public NativeAdPreferences setPrimaryImageSize(int i10) {
        this.primaryImage = i10;
        return this;
    }

    @Keep
    public NativeAdPreferences setSecondaryImageSize(int i10) {
        this.moreImage = i10;
        return this;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @Keep
    public NativeAdPreferences useSimpleToken(boolean z10) {
        this.useSimpleToken = z10;
        return this;
    }

    @Keep
    public NativeAdPreferences(@NonNull NativeAdPreferences nativeAdPreferences) {
        super(nativeAdPreferences);
        this.adsNumber = 1;
        this.autoBitmapDownload = false;
        this.primaryImage = -1;
        this.moreImage = -1;
        this.isContentAd = false;
        this.useSimpleToken = true;
        this.adsNumber = nativeAdPreferences.adsNumber;
        this.autoBitmapDownload = nativeAdPreferences.autoBitmapDownload;
        this.bitmapSize = nativeAdPreferences.bitmapSize;
        this.primaryImage = nativeAdPreferences.primaryImage;
        this.moreImage = nativeAdPreferences.moreImage;
        this.isContentAd = nativeAdPreferences.isContentAd;
        this.useSimpleToken = nativeAdPreferences.useSimpleToken;
    }
}
