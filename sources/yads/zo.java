package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zo> CREATOR = new yo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f118746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sq1 f118747c;

    public zo(ArrayList arrayList, sq1 sq1Var) {
        this.f118746b = arrayList;
        this.f118747c = sq1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        return Intrinsics.areEqual(this.f118746b, zoVar.f118746b) && Intrinsics.areEqual(this.f118747c, zoVar.f118747c);
    }

    public final int hashCode() {
        int iHashCode = this.f118746b.hashCode() * 31;
        sq1 sq1Var = this.f118747c;
        return iHashCode + (sq1Var == null ? 0 : sq1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.f118746b + ", mediationPrefetchSettings=" + this.f118747c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f118746b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((eb) it.next()).writeToParcel(parcel, i10);
        }
        sq1 sq1Var = this.f118747c;
        if (sq1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sq1Var.writeToParcel(parcel, i10);
        }
    }
}
