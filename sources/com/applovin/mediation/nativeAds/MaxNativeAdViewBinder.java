package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes6.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    protected final int advertiserTextViewId;

    @IdRes
    protected final int bodyTextViewId;

    @IdRes
    protected final int callToActionButtonId;

    @IdRes
    protected final int iconContentViewId;

    @IdRes
    protected final int iconImageViewId;

    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;

    @IdRes
    protected final int mediaContentFrameLayoutId;

    @IdRes
    protected final int mediaContentViewGroupId;

    @IdRes
    protected final int optionsContentFrameLayoutId;

    @IdRes
    protected final int optionsContentViewGroupId;

    @IdRes
    protected final int starRatingContentViewGroupId;
    protected final String templateType;

    @IdRes
    protected final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f11753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f11758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f11760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11761i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f11762j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f11763k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f11764l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11765m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f11766n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f11753a, this.f11754b, this.f11755c, this.f11756d, this.f11757e, this.f11758f, this.f11759g, this.f11762j, this.f11760h, this.f11761i, this.f11763k, this.f11764l, this.f11765m, this.f11766n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i10) {
            this.f11756d = i10;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i10) {
            this.f11757e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i10) {
            this.f11765m = i10;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(@IdRes int i10) {
            this.f11759g = i10;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i10) {
            this.f11758f = i10;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(@IdRes int i10) {
            this.f11764l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i10) {
            this.f11763k = i10;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(@IdRes int i10) {
            this.f11761i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i10) {
            this.f11760h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i10) {
            this.f11762j = i10;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.f11766n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i10) {
            this.f11755c = i10;
            return this;
        }

        public Builder(@LayoutRes int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f11755c = -1;
            this.f11756d = -1;
            this.f11757e = -1;
            this.f11758f = -1;
            this.f11759g = -1;
            this.f11760h = -1;
            this.f11761i = -1;
            this.f11762j = -1;
            this.f11763k = -1;
            this.f11764l = -1;
            this.f11765m = -1;
            this.f11754b = i10;
            this.f11753a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
