package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public class dk3 implements er1 {
    public static final Parcelable.Creator<dk3> CREATOR = new bk3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109956c;

    public dk3(Parcel parcel) {
        this.f109955b = (String) w83.a((Object) parcel.readString());
        this.f109956c = (String) w83.a((Object) parcel.readString());
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
        if (obj != null && getClass() == obj.getClass()) {
            dk3 dk3Var = (dk3) obj;
            if (this.f109955b.equals(dk3Var.f109955b) && this.f109956c.equals(dk3Var.f109956c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f109956c.hashCode() + j4.a(this.f109955b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f109955b + C4240b4.j.f42668b + this.f109956c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f109955b);
        parcel.writeString(this.f109956c);
    }

    @Override // yads.er1
    public final void a(uk1 uk1Var) {
        String str = this.f109955b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                uk1Var.f116679c = this.f109956c;
                break;
            case "TITLE":
                uk1Var.f116677a = this.f109956c;
                break;
            case "DESCRIPTION":
                uk1Var.f116683g = this.f109956c;
                break;
            case "ALBUMARTIST":
                uk1Var.f116680d = this.f109956c;
                break;
            case "ARTIST":
                uk1Var.f116678b = this.f109956c;
                break;
        }
    }

    public dk3(String str, String str2) {
        this.f109955b = str;
        this.f109956c = str2;
    }
}
