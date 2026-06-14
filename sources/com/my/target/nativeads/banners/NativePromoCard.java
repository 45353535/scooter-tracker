package com.my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.d7;

/* JADX INFO: loaded from: classes11.dex */
public class NativePromoCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageData f60303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f60304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f60305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60307h;

    public NativePromoCard(d7 d7Var) {
        if (TextUtils.isEmpty(d7Var.A())) {
            this.f60300a = null;
        } else {
            this.f60300a = d7Var.A();
        }
        if (TextUtils.isEmpty(d7Var.k())) {
            this.f60301b = null;
        } else {
            this.f60301b = d7Var.k();
        }
        if (TextUtils.isEmpty(d7Var.i())) {
            this.f60302c = null;
        } else {
            this.f60302c = d7Var.i();
        }
        this.f60304e = d7Var.M();
        this.f60305f = d7Var.O();
        this.f60306g = d7Var.N();
        this.f60307h = d7Var.L();
        this.f60303d = d7Var.s();
    }

    public static NativePromoCard a(d7 d7Var) {
        return new NativePromoCard(d7Var);
    }

    @Nullable
    public String getCtaText() {
        return this.f60302c;
    }

    @Nullable
    public String getCurrency() {
        return this.f60307h;
    }

    @Nullable
    public String getDescription() {
        return this.f60301b;
    }

    @Nullable
    public String getDiscount() {
        return this.f60304e;
    }

    @Nullable
    public ImageData getImage() {
        return this.f60303d;
    }

    @Nullable
    public String getOldPrice() {
        return this.f60306g;
    }

    @Nullable
    public String getPrice() {
        return this.f60305f;
    }

    @Nullable
    public String getTitle() {
        return this.f60300a;
    }
}
