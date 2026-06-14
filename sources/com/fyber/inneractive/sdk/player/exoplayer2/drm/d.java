package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21731c;

    public d(boolean z10, c... cVarArr) {
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        Arrays.sort(cVarArr, this);
        for (int i10 = 1; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10 - 1].f21725b.equals(cVarArr[i10].f21725b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i10].f21725b);
            }
        }
        this.f21729a = cVarArr;
        this.f21731c = cVarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f21704b;
        return uuid.equals(cVar.f21725b) ? uuid.equals(cVar2.f21725b) ? 0 : 1 : cVar.f21725b.compareTo(cVar2.f21725b);
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21729a, ((d) obj).f21729a);
    }

    public final int hashCode() {
        if (this.f21730b == 0) {
            this.f21730b = Arrays.hashCode(this.f21729a);
        }
        return this.f21730b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f21729a, 0);
    }

    public d(Parcel parcel) {
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f21729a = cVarArr;
        this.f21731c = cVarArr.length;
    }
}
