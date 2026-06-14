package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cp1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<cp1> CREATOR = new zo1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f109505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f109506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f109507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f109508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i5 f109509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f109510h;

    public cp1(String str, Map map, List list, List list2, List list3, i5 i5Var, Map map2) {
        this.f109504b = str;
        this.f109505c = map;
        this.f109506d = list;
        this.f109507e = list2;
        this.f109508f = list3;
        this.f109509g = i5Var;
        this.f109510h = map2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp1)) {
            return false;
        }
        cp1 cp1Var = (cp1) obj;
        return Intrinsics.areEqual(this.f109504b, cp1Var.f109504b) && Intrinsics.areEqual(this.f109505c, cp1Var.f109505c) && Intrinsics.areEqual(this.f109506d, cp1Var.f109506d) && Intrinsics.areEqual(this.f109507e, cp1Var.f109507e) && Intrinsics.areEqual(this.f109508f, cp1Var.f109508f) && Intrinsics.areEqual(this.f109509g, cp1Var.f109509g) && Intrinsics.areEqual(this.f109510h, cp1Var.f109510h);
    }

    public final int hashCode() {
        int iHashCode = (this.f109505c.hashCode() + (this.f109504b.hashCode() * 31)) * 31;
        List list = this.f109506d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f109507e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f109508f;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        i5 i5Var = this.f109509g;
        int iHashCode5 = (iHashCode4 + (i5Var == null ? 0 : i5Var.f111860b.hashCode())) * 31;
        Map map = this.f109510h;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.f109504b + ", networkData=" + this.f109505c + ", impressionTrackingUrls=" + this.f109506d + ", clickTrackingUrls=" + this.f109507e + ", adResponseTrackingUrls=" + this.f109508f + ", adImpressionData=" + this.f109509g + ", biddingInfo=" + this.f109510h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f109504b);
        Map map = this.f109505c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.f109506d);
        parcel.writeStringList(this.f109507e);
        parcel.writeStringList(this.f109508f);
        i5 i5Var = this.f109509g;
        if (i5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(i5Var.f111860b);
        }
        Map map2 = this.f109510h;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
