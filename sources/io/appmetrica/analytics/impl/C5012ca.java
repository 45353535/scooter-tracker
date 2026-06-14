package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5012ca implements Parcelable {

    @NotNull
    public static final C4986ba CREATOR = new C4986ba();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f76960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f76961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76962c;

    public C5012ca(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f76960a = bool;
        this.f76961b = identifierStatus;
        this.f76962c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5012ca)) {
            return false;
        }
        C5012ca c5012ca = (C5012ca) obj;
        return Intrinsics.areEqual(this.f76960a, c5012ca.f76960a) && this.f76961b == c5012ca.f76961b && Intrinsics.areEqual(this.f76962c, c5012ca.f76962c);
    }

    public final int hashCode() {
        Boolean bool = this.f76960a;
        int iHashCode = (this.f76961b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f76962c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f76960a + ", status=" + this.f76961b + ", errorExplanation=" + this.f76962c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f76960a);
        parcel.writeString(this.f76961b.getValue());
        parcel.writeString(this.f76962c);
    }

    public C5012ca() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
