package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class tf extends g11 {
    public static final Parcelable.Creator<tf> CREATOR = new sf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f116221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f116222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f116223f;

    public tf(Parcel parcel) {
        super("APIC");
        this.f116220c = (String) w83.a((Object) parcel.readString());
        this.f116221d = parcel.readString();
        this.f116222e = parcel.readInt();
        this.f116223f = (byte[]) w83.a((Object) parcel.createByteArray());
    }

    @Override // yads.g11, yads.er1
    public final void a(uk1 uk1Var) {
        byte[] bArr = this.f116223f;
        int i10 = this.f116222e;
        if (uk1Var.f116686j == null || w83.a((Object) Integer.valueOf(i10), (Object) 3) || !w83.a((Object) uk1Var.f116687k, (Object) 3)) {
            uk1Var.f116686j = (byte[]) bArr.clone();
            uk1Var.f116687k = Integer.valueOf(i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tf.class == obj.getClass()) {
            tf tfVar = (tf) obj;
            if (this.f116222e == tfVar.f116222e && w83.a(this.f116220c, tfVar.f116220c) && w83.a(this.f116221d, tfVar.f116221d) && Arrays.equals(this.f116223f, tfVar.f116223f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f116222e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f116220c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f116221d;
        return Arrays.hashCode(this.f116223f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": mimeType=" + this.f116220c + ", description=" + this.f116221d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f116220c);
        parcel.writeString(this.f116221d);
        parcel.writeInt(this.f116222e);
        parcel.writeByteArray(this.f116223f);
    }

    public tf(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f116220c = str;
        this.f116221d = str2;
        this.f116222e = i10;
        this.f116223f = bArr;
    }
}
