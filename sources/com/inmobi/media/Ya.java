package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Ya implements Parcelable {

    @NotNull
    public static final Xa CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Za f38037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38042f;

    public Ya(Za landingPageTelemetryMetaData, String urlType, int i10, long j10) {
        Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        this.f38037a = landingPageTelemetryMetaData;
        this.f38038b = urlType;
        this.f38039c = i10;
        this.f38040d = j10;
        this.f38041e = -1;
    }

    public static Ya a(Ya ya2) {
        Za landingPageTelemetryMetaData = ya2.f38037a;
        String urlType = ya2.f38038b;
        int i10 = ya2.f38039c;
        long j10 = ya2.f38040d;
        Intrinsics.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        Intrinsics.checkNotNullParameter(urlType, "urlType");
        return new Ya(landingPageTelemetryMetaData, urlType, i10, j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya2 = (Ya) obj;
        return Intrinsics.areEqual(this.f38037a, ya2.f38037a) && Intrinsics.areEqual(this.f38038b, ya2.f38038b) && this.f38039c == ya2.f38039c && this.f38040d == ya2.f38040d;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f38040d) + AbstractC3712fi.a(this.f38039c, (this.f38038b.hashCode() + (this.f38037a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f38037a + ", urlType=" + this.f38038b + ", counter=" + this.f38039c + ", startTime=" + this.f38040d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.f38037a.f38106a);
        parcel.writeString(this.f38037a.f38107b);
        parcel.writeString(this.f38037a.f38108c);
        parcel.writeString(this.f38037a.f38109d);
        parcel.writeString(this.f38037a.f38110e);
        parcel.writeString(this.f38037a.f38111f);
        parcel.writeString(this.f38037a.f38112g);
        parcel.writeByte(this.f38037a.f38113h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f38037a.f38114i);
        parcel.writeString(this.f38038b);
        parcel.writeInt(this.f38039c);
        parcel.writeLong(this.f38040d);
        parcel.writeInt(this.f38041e);
        parcel.writeString(this.f38042f);
    }
}
