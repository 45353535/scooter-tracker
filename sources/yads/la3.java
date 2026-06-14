package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class la3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<la3> CREATOR = new ja3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka3 f113027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f113028c;

    public la3(ka3 ka3Var, float f10) {
        this.f113027b = ka3Var;
        this.f113028c = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ka3 ka3Var = this.f113027b;
        parcel.writeInt(ka3Var != null ? ka3Var.ordinal() : -1);
        parcel.writeFloat(this.f113028c);
    }
}
