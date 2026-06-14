package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class oq1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f114389d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f114391c;

    @NotNull
    public static final mq1 Companion = new mq1();

    @NotNull
    public static final Parcelable.Creator<oq1> CREATOR = new nq1();

    static {
        yg.y2 y2Var = yg.y2.f119104a;
        f114389d = new KSerializer[]{null, new yg.c1(y2Var, vg.a.t(y2Var))};
    }

    public /* synthetic */ oq1(int i10, String str, Map map) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, lq1.f113188a.getDescriptor());
        }
        this.f114390b = str;
        this.f114391c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq1)) {
            return false;
        }
        oq1 oq1Var = (oq1) obj;
        return Intrinsics.areEqual(this.f114390b, oq1Var.f114390b) && Intrinsics.areEqual(this.f114391c, oq1Var.f114391c);
    }

    public final int hashCode() {
        return this.f114391c.hashCode() + (this.f114390b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f114390b + ", networkData=" + this.f114391c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f114390b);
        Map map = this.f114391c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public oq1(String str, LinkedHashMap linkedHashMap) {
        this.f114390b = str;
        this.f114391c = linkedHashMap;
    }
}
