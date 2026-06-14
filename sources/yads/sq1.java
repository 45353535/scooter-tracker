package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class sq1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115900c;

    @NotNull
    public static final qq1 Companion = new qq1();

    @NotNull
    public static final Parcelable.Creator<sq1> CREATOR = new rq1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f115898d = {null, new yg.f(gq1.f111300a)};

    public /* synthetic */ sq1(int i10, long j10, List list) {
        this.f115899b = (i10 & 1) == 0 ? 30000L : j10;
        if ((i10 & 2) == 0) {
            this.f115900c = CollectionsKt.emptyList();
        } else {
            this.f115900c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq1)) {
            return false;
        }
        sq1 sq1Var = (sq1) obj;
        return this.f115899b == sq1Var.f115899b && Intrinsics.areEqual(this.f115900c, sq1Var.f115900c);
    }

    public final int hashCode() {
        return this.f115900c.hashCode() + (androidx.collection.b.a(this.f115899b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f115899b + ", mediationPrefetchAdUnits=" + this.f115900c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f115899b);
        List list = this.f115900c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((jq1) it.next()).writeToParcel(parcel, i10);
        }
    }

    public sq1(long j10, ArrayList arrayList) {
        this.f115899b = j10;
        this.f115900c = arrayList;
    }
}
