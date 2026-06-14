package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class eb implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<eb> CREATOR = new db();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f110275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110276d;

    public eb(String str, String str2, ArrayList arrayList) {
        this.f110274b = str;
        this.f110275c = arrayList;
        this.f110276d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return Intrinsics.areEqual(this.f110274b, ebVar.f110274b) && Intrinsics.areEqual(this.f110275c, ebVar.f110275c) && Intrinsics.areEqual(this.f110276d, ebVar.f110276d);
    }

    public final int hashCode() {
        return this.f110276d.hashCode() + cb.a(this.f110275c, this.f110274b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.f110274b + ", mediationNetworks=" + this.f110275c + ", rawData=" + this.f110276d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f110274b);
        List list = this.f110275c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cp1) it.next()).writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f110276d);
    }
}
