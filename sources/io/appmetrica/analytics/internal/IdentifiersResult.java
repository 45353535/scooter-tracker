package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.C5090fb;

/* JADX INFO: loaded from: classes12.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new C5090fb();

    @Nullable
    public final String errorExplanation;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f78675id;

    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(@Nullable String str, @NonNull IdentifierStatus identifierStatus, @Nullable String str2) {
        this.f78675id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdentifiersResult identifiersResult = (IdentifiersResult) obj;
            String str = this.f78675id;
            if (str == null ? identifiersResult.f78675id != null : !str.equals(identifiersResult.f78675id)) {
                return false;
            }
            if (this.status != identifiersResult.status) {
                return false;
            }
            String str2 = this.errorExplanation;
            if (str2 != null) {
                return str2.equals(identifiersResult.errorExplanation);
            }
            if (identifiersResult.errorExplanation == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f78675id;
        int iHashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IdentifiersResult{id='" + this.f78675id + "', status=" + this.status + ", errorExplanation='" + this.errorExplanation + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f78675id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
