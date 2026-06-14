package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ry2 implements er1 {
    public static final Parcelable.Creator<ry2> CREATOR = new oy2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115646b;

    public ry2(ArrayList arrayList) {
        this.f115646b = arrayList;
        fi.a(!a(arrayList));
    }

    @Override // yads.er1
    public /* synthetic */ yv0 a() {
        return i6.a(this);
    }

    @Override // yads.er1
    public /* synthetic */ byte[] b() {
        return i6.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ry2.class != obj.getClass()) {
            return false;
        }
        return this.f115646b.equals(((ry2) obj).f115646b);
    }

    public final int hashCode() {
        return this.f115646b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f115646b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f115646b);
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }

    public static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((qy2) arrayList.get(0)).f115218c;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            if (((qy2) arrayList.get(i10)).f115217b < j10) {
                return true;
            }
            j10 = ((qy2) arrayList.get(i10)).f115218c;
        }
        return false;
    }
}
