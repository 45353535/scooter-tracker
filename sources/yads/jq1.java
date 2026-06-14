package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class jq1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f112434c;

    @NotNull
    public static final hq1 Companion = new hq1();

    @NotNull
    public static final Parcelable.Creator<jq1> CREATOR = new iq1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f112432d = {null, new yg.f(lq1.f113188a)};

    public /* synthetic */ jq1(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, gq1.f111300a.getDescriptor());
        }
        this.f112433b = str;
        this.f112434c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq1)) {
            return false;
        }
        jq1 jq1Var = (jq1) obj;
        return Intrinsics.areEqual(this.f112433b, jq1Var.f112433b) && Intrinsics.areEqual(this.f112434c, jq1Var.f112434c);
    }

    public final int hashCode() {
        return this.f112434c.hashCode() + (this.f112433b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f112433b + ", networks=" + this.f112434c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f112433b);
        List list = this.f112434c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((oq1) it.next()).writeToParcel(parcel, i10);
        }
    }

    public jq1(String str, ArrayList arrayList) {
        this.f112433b = str;
        this.f112434c = arrayList;
    }
}
