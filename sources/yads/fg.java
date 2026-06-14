package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class fg implements er1 {
    public static final Parcelable.Creator<fg> CREATOR = new eg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110710c;

    public fg(int i10, String str) {
        this.f110709b = i10;
        this.f110710c = str;
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

    public final String toString() {
        return "Ait(controlCode=" + this.f110709b + ",url=" + this.f110710c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f110710c);
        parcel.writeInt(this.f110709b);
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }
}
