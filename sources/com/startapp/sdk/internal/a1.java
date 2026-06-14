package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.model.AdDetails;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 extends View.BaseSavedState {
    public static final Parcelable.Creator<a1> CREATOR = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdDetails[] f64231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f64232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdInformationOverrides f64239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BannerOptions f64240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AdRulesResult f64241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d1[] f64243m;

    public a1(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        if (!this.f64242l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.f64235e);
        parcel.writeFloat(this.f64232b);
        parcel.writeInt(this.f64233c);
        parcel.writeInt(this.f64234d);
        parcel.writeParcelableArray(this.f64231a, i10);
        parcel.writeInt(this.f64236f ? 1 : 0);
        parcel.writeInt(this.f64237g ? 1 : 0);
        parcel.writeInt(this.f64238h ? 1 : 0);
        d1[] d1VarArr = this.f64243m;
        if (d1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(d1VarArr.length);
            for (d1 d1Var : this.f64243m) {
                parcel.writeParcelable(d1Var, i10);
            }
        }
        parcel.writeSerializable(this.f64239i);
        parcel.writeSerializable(this.f64240j);
        parcel.writeSerializable(this.f64241k);
    }

    public a1(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.f64242l = false;
            return;
        }
        this.f64242l = true;
        this.f64235e = parcel.readInt();
        this.f64232b = parcel.readFloat();
        this.f64233c = parcel.readInt();
        this.f64234d = parcel.readInt();
        Parcelable[] parcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (parcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[parcelableArray.length];
            this.f64231a = adDetailsArr;
            System.arraycopy(parcelableArray, 0, adDetailsArr, 0, parcelableArray.length);
        }
        int i10 = parcel.readInt();
        this.f64236f = false;
        if (i10 == 1) {
            this.f64236f = true;
        }
        int i11 = parcel.readInt();
        this.f64237g = false;
        if (i11 == 1) {
            this.f64237g = true;
        }
        int i12 = parcel.readInt();
        this.f64238h = false;
        if (i12 == 1) {
            this.f64238h = true;
        }
        int i13 = parcel.readInt();
        if (i13 > 0) {
            this.f64243m = new d1[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                this.f64243m[i14] = (d1) parcel.readParcelable(d1.class.getClassLoader());
            }
        }
        this.f64239i = (AdInformationOverrides) parcel.readSerializable();
        this.f64240j = (BannerOptions) parcel.readSerializable();
        this.f64241k = (AdRulesResult) parcel.readSerializable();
    }
}
