package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u6 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f65333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f65334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f65335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f65336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f65337e;

    public u6() {
        this.f65335c = Float.MAX_VALUE;
        this.f65336d = -3.4028235E38f;
        this.f65337e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f65333a);
        parcel.writeFloat(this.f65334b);
        parcel.writeFloat(this.f65335c);
        parcel.writeFloat(this.f65336d);
    }

    public u6(Parcel parcel) {
        this.f65335c = Float.MAX_VALUE;
        this.f65336d = -3.4028235E38f;
        this.f65337e = 0L;
        this.f65333a = parcel.readFloat();
        this.f65334b = parcel.readFloat();
        this.f65335c = parcel.readFloat();
        this.f65336d = parcel.readFloat();
        this.f65337e = AnimationUtils.currentAnimationTimeMillis();
    }
}
