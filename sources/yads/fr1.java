package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fr1 implements Parcelable {
    public static final Parcelable.Creator<fr1> CREATOR = new dr1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er1[] f110835b;

    public fr1(Parcel parcel) {
        this.f110835b = new er1[parcel.readInt()];
        int i10 = 0;
        while (true) {
            er1[] er1VarArr = this.f110835b;
            if (i10 >= er1VarArr.length) {
                return;
            }
            er1VarArr[i10] = (er1) parcel.readParcelable(er1.class.getClassLoader());
            i10++;
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
        if (obj == null || fr1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f110835b, ((fr1) obj).f110835b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f110835b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f110835b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f110835b.length);
        for (er1 er1Var : this.f110835b) {
            parcel.writeParcelable(er1Var, 0);
        }
    }

    public fr1(List list) {
        this.f110835b = (er1[]) list.toArray(new er1[0]);
    }

    public fr1(er1... er1VarArr) {
        this.f110835b = er1VarArr;
    }
}
