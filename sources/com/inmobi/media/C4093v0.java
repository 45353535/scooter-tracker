package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4093v0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C4093v0> CREATOR = new C4068u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f39713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39721k;

    public C4093v0(long j10, String str, String str2, String str3) {
        this.f39718h = "";
        this.f39719i = "activity";
        this.f39711a = j10;
        this.f39715e = str2;
        this.f39712b = str;
        this.f39716f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4093v0)) {
            return false;
        }
        C4093v0 c4093v0 = (C4093v0) obj;
        return this.f39711a == c4093v0.f39711a && Intrinsics.areEqual(this.f39719i, c4093v0.f39719i) && Intrinsics.areEqual(this.f39712b, c4093v0.f39712b) && Intrinsics.areEqual(this.f39715e, c4093v0.f39715e);
    }

    public final int hashCode() {
        long j10 = this.f39711a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f39715e;
        return this.f39719i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.f39711a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f39711a);
        dest.writeString(this.f39719i);
        dest.writeString(this.f39715e);
    }

    public C4093v0(Parcel parcel) {
        this.f39718h = "";
        String str = "activity";
        this.f39719i = "activity";
        this.f39711a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !Intrinsics.areEqual(string, "activity") && Intrinsics.areEqual(string, "others")) {
            str = "others";
        }
        this.f39719i = str;
        this.f39715e = parcel.readString();
    }
}
