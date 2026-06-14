package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class fj0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<fj0> CREATOR = new cj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0[] f110738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110741e;

    public fj0(Parcel parcel) {
        this.f110740d = parcel.readString();
        ej0[] ej0VarArr = (ej0[]) w83.a((ej0[]) parcel.createTypedArray(ej0.CREATOR));
        this.f110738b = ej0VarArr;
        this.f110741e = ej0VarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ej0 ej0Var = (ej0) obj;
        ej0 ej0Var2 = (ej0) obj2;
        UUID uuid = ar.f108751a;
        return uuid.equals(ej0Var.f110384c) ? uuid.equals(ej0Var2.f110384c) ? 0 : 1 : ej0Var.f110384c.compareTo(ej0Var2.f110384c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fj0.class == obj.getClass()) {
            fj0 fj0Var = (fj0) obj;
            if (w83.a(this.f110740d, fj0Var.f110740d) && Arrays.equals(this.f110738b, fj0Var.f110738b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f110739c == 0) {
            String str = this.f110740d;
            this.f110739c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f110738b);
        }
        return this.f110739c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f110740d);
        parcel.writeTypedArray(this.f110738b, 0);
    }

    public fj0(String str, boolean z10, ej0... ej0VarArr) {
        this.f110740d = str;
        ej0VarArr = z10 ? (ej0[]) ej0VarArr.clone() : ej0VarArr;
        this.f110738b = ej0VarArr;
        this.f110741e = ej0VarArr.length;
        Arrays.sort(ej0VarArr, this);
    }
}
