package com.my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.b7;
import com.my.target.common.NavigationType;
import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.ImageData;
import com.my.target.d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class NativePromoBanner extends NativeBanner {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f60277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageData f60278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f60279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f60280t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f60281u;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f60282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f60283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f60285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f60286e = NavigationType.WEB;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f60287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ImageData f60288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f60289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f60290i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f60291j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f60292k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f60293l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ImageData f60294m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f60295n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f60296o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Disclaimer f60297p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f60298q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ImageData f60299r;

        @NonNull
        public static Builder createBuilder() {
            return new Builder();
        }

        @NonNull
        public NativePromoBanner build() {
            return new NativePromoBanner(this.f60289h, this.f60290i, this.f60291j, this.f60292k, this.f60294m, this.f60283b, this.f60295n, this.f60296o, this.f60297p, this.f60284c, this.f60286e, this.f60287f, this.f60285d, this.f60298q, this.f60299r, this.f60282a, this.f60288g, this.f60293l);
        }

        @NonNull
        public Builder setAdChoicesIcon(@Nullable ImageData imageData) {
            this.f60288g = imageData;
            return this;
        }

        @NonNull
        public Builder setAdvertisingLabel(@Nullable String str) {
            this.f60292k = str;
            return this;
        }

        @NonNull
        public Builder setAgeRestrictions(@Nullable String str) {
            this.f60295n = str;
            return this;
        }

        @NonNull
        public Builder setBundleId(@Nullable String str) {
            this.f60293l = str;
            return this;
        }

        @NonNull
        public Builder setCtaText(@Nullable String str) {
            this.f60290i = str;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.f60298q = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimer(@Nullable String str) {
            this.f60296o = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimerInfo(@Nullable Disclaimer disclaimer) {
            this.f60297p = disclaimer;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.f60291j = str;
            return this;
        }

        @NonNull
        public Builder setHasAdChoices(boolean z10) {
            this.f60282a = z10;
            return this;
        }

        @NonNull
        public Builder setHasVideo(boolean z10) {
            this.f60285d = z10;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable ImageData imageData) {
            this.f60294m = imageData;
            return this;
        }

        @NonNull
        public Builder setImage(@Nullable ImageData imageData) {
            this.f60299r = imageData;
            return this;
        }

        @NonNull
        public Builder setNavigationType(@NonNull String str) {
            if (!NavigationType.WEB.equals(str) && !"store".equals(str)) {
                return this;
            }
            this.f60286e = str;
            return this;
        }

        @NonNull
        public Builder setRating(float f10) {
            this.f60283b = f10;
            return this;
        }

        @NonNull
        public Builder setStoreType(@Nullable String str) {
            this.f60287f = str;
            return this;
        }

        @NonNull
        public Builder setTitle(String str) {
            this.f60289h = str;
            return this;
        }

        @NonNull
        public Builder setVotes(int i10) {
            this.f60284c = i10;
            return this;
        }
    }

    public NativePromoBanner(String str, String str2, String str3, String str4, ImageData imageData, float f10, String str5, String str6, Disclaimer disclaimer, int i10, String str7, String str8, boolean z10, String str9, ImageData imageData2, boolean z11, ImageData imageData3, String str10) {
        super(str, str2, str9, str3, str4, imageData, f10, str5, str6, disclaimer, i10, str7, str8, z11, imageData3, str10);
        this.f60279s = new ArrayList();
        this.f60277q = z10;
        this.f60278r = imageData2;
    }

    public static NativePromoBanner b(b7 b7Var) {
        return new NativePromoBanner(b7Var);
    }

    public final void c(b7 b7Var) {
        if (this.f60277q) {
            return;
        }
        List listO = b7Var.O();
        if (listO.isEmpty()) {
            return;
        }
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            this.f60279s.add(NativePromoCard.a((d7) it.next()));
        }
    }

    @NonNull
    public ArrayList<NativePromoCard> getCards() {
        return this.f60279s;
    }

    @Nullable
    public String getCategory() {
        return this.f60280t;
    }

    @Nullable
    public ImageData getImage() {
        return this.f60278r;
    }

    @Nullable
    public String getSubCategory() {
        return this.f60281u;
    }

    public boolean hasVideo() {
        return this.f60277q;
    }

    @Override // com.my.target.nativeads.banners.NativeBanner
    @NonNull
    public String toString() {
        return "NativePromoBanner{hasVideo=" + this.f60277q + ", image=" + this.f60278r + ", nativePromoCards=" + this.f60279s + ", category='" + this.f60280t + "', subCategory='" + this.f60281u + "', navigationType='" + this.f60260a + "', storeType='" + this.f60261b + "', rating=" + this.f60262c + ", votes=" + this.f60263d + ", hasAdChoices=" + this.f60264e + ", title='" + this.f60265f + "', ctaText='" + this.f60266g + "', description='" + this.f60267h + "', disclaimer='" + this.f60268i + "', disclaimerInfo='" + this.f60269j + "', ageRestrictions='" + this.f60270k + "', domain='" + this.f60271l + "', advertisingLabel='" + this.f60272m + "', bundleId='" + this.f60273n + "', icon=" + this.f60274o + ", adChoicesIcon=" + this.f60275p + '}';
    }

    public NativePromoBanner(b7 b7Var) {
        super(b7Var);
        this.f60279s = new ArrayList();
        this.f60277q = b7Var.P() != null;
        String strF = b7Var.f();
        this.f60280t = TextUtils.isEmpty(strF) ? null : strF;
        String strZ = b7Var.z();
        this.f60281u = TextUtils.isEmpty(strZ) ? null : strZ;
        this.f60278r = b7Var.s();
        c(b7Var);
    }
}
