package com.my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.b7;
import com.my.target.c;
import com.my.target.common.NavigationType;
import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public class NativeBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f60260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f60261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f60262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f60265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f60266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f60267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f60268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Disclaimer f60269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f60270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f60271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f60272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f60273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageData f60274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageData f60275p;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NativeBanner f60276a = new NativeBanner();

        @NonNull
        public static Builder createBuilder() {
            return new Builder();
        }

        public NativeBanner build() {
            return this.f60276a;
        }

        @NonNull
        public Builder setAdChoicesIcon(@Nullable ImageData imageData) {
            this.f60276a.f60275p = imageData;
            return this;
        }

        @NonNull
        public Builder setAdvertisingLabel(@Nullable String str) {
            this.f60276a.f60272m = str;
            return this;
        }

        @NonNull
        public Builder setAgeRestrictions(@Nullable String str) {
            this.f60276a.f60270k = str;
            return this;
        }

        @NonNull
        public Builder setBundleId(@Nullable String str) {
            this.f60276a.f60273n = str;
            return this;
        }

        @NonNull
        public Builder setCtaText(@Nullable String str) {
            this.f60276a.f60266g = str;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.f60276a.f60267h = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimer(@Nullable String str) {
            this.f60276a.f60268i = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimerInfo(@Nullable Disclaimer disclaimer) {
            this.f60276a.f60269j = disclaimer;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.f60276a.f60271l = str;
            return this;
        }

        @NonNull
        public Builder setHasAdChoices(boolean z10) {
            this.f60276a.f60264e = z10;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable ImageData imageData) {
            this.f60276a.f60274o = imageData;
            return this;
        }

        @NonNull
        public Builder setNavigationType(@NonNull String str) {
            if (!NavigationType.WEB.equals(str) && !"store".equals(str)) {
                return this;
            }
            this.f60276a.f60260a = str;
            return this;
        }

        @NonNull
        public Builder setRating(float f10) {
            this.f60276a.f60262c = f10;
            return this;
        }

        @NonNull
        public Builder setStoreType(@Nullable String str) {
            this.f60276a.f60261b = str;
            return this;
        }

        @NonNull
        public Builder setTitle(String str) {
            this.f60276a.f60265f = str;
            return this;
        }

        @NonNull
        public Builder setVotes(int i10) {
            this.f60276a.f60263d = i10;
            return this;
        }
    }

    public NativeBanner(b7 b7Var) {
        this.f60260a = NavigationType.WEB;
        this.f60260a = b7Var.t();
        this.f60261b = b7Var.y();
        this.f60262c = b7Var.w();
        this.f60263d = b7Var.F();
        String strA = b7Var.A();
        this.f60265f = TextUtils.isEmpty(strA) ? null : strA;
        String strI = b7Var.i();
        this.f60266g = TextUtils.isEmpty(strI) ? null : strI;
        String strK = b7Var.k();
        this.f60267h = TextUtils.isEmpty(strK) ? null : strK;
        String strL = b7Var.l();
        this.f60268i = !TextUtils.isEmpty(strL) ? strL : null;
        this.f60269j = !TextUtils.isEmpty(strL) ? new Disclaimer(b7Var.m(), strL) : null;
        String strC = b7Var.c();
        this.f60270k = TextUtils.isEmpty(strC) ? null : strC;
        String strN = b7Var.n();
        this.f60271l = TextUtils.isEmpty(strN) ? null : strN;
        String strB = b7Var.b();
        this.f60272m = TextUtils.isEmpty(strB) ? null : strB;
        this.f60274o = b7Var.q();
        String strE = b7Var.e();
        this.f60273n = TextUtils.isEmpty(strE) ? null : strE;
        c cVarA = b7Var.a();
        if (cVarA == null) {
            this.f60264e = false;
            this.f60275p = null;
        } else {
            this.f60264e = true;
            this.f60275p = cVarA.c();
        }
    }

    public static NativeBanner a(b7 b7Var) {
        return new NativeBanner(b7Var);
    }

    @Nullable
    public ImageData getAdChoicesIcon() {
        return this.f60275p;
    }

    @Nullable
    public String getAdvertisingLabel() {
        return this.f60272m;
    }

    @Nullable
    public String getAgeRestrictions() {
        return this.f60270k;
    }

    @Nullable
    public String getBundleId() {
        return this.f60273n;
    }

    @Nullable
    public String getCtaText() {
        return this.f60266g;
    }

    @Nullable
    public String getDescription() {
        return this.f60267h;
    }

    @Nullable
    @Deprecated
    public String getDisclaimer() {
        return this.f60268i;
    }

    @Nullable
    public Disclaimer getDisclaimerInfo() {
        return this.f60269j;
    }

    @Nullable
    public String getDomain() {
        return this.f60271l;
    }

    @Nullable
    public ImageData getIcon() {
        return this.f60274o;
    }

    @NonNull
    public String getNavigationType() {
        return this.f60260a;
    }

    public float getRating() {
        return this.f60262c;
    }

    @Nullable
    public String getStoreType() {
        return this.f60261b;
    }

    @Nullable
    public String getTitle() {
        return this.f60265f;
    }

    public int getVotes() {
        return this.f60263d;
    }

    public boolean hasAdChoices() {
        return this.f60264e;
    }

    @NonNull
    public String toString() {
        return "NativeBanner{navigationType='" + this.f60260a + "', storeType='" + this.f60261b + "', rating=" + this.f60262c + ", votes=" + this.f60263d + ", hasAdChoices=" + this.f60264e + ", title='" + this.f60265f + "', ctaText='" + this.f60266g + "', description='" + this.f60267h + "', disclaimer='" + this.f60268i + "', disclaimerInfo=" + this.f60269j + ", ageRestrictions='" + this.f60270k + "', domain='" + this.f60271l + "', advertisingLabel='" + this.f60272m + "', bundleId='" + this.f60273n + "', icon=" + this.f60274o + ", adChoicesIcon=" + this.f60275p + '}';
    }

    public NativeBanner(String str, String str2, String str3, String str4, String str5, ImageData imageData, float f10, String str6, String str7, Disclaimer disclaimer, int i10, String str8, String str9, boolean z10, ImageData imageData2, String str10) {
        this.f60265f = str;
        this.f60266g = str2;
        this.f60267h = str3;
        this.f60271l = str4;
        this.f60272m = str5;
        this.f60274o = imageData;
        this.f60262c = f10;
        this.f60270k = str6;
        this.f60268i = str7;
        this.f60269j = disclaimer;
        this.f60263d = i10;
        this.f60260a = str8;
        this.f60261b = str9;
        this.f60264e = z10;
        this.f60275p = imageData2;
        this.f60273n = str10;
    }

    public NativeBanner() {
        this.f60260a = NavigationType.WEB;
    }
}
