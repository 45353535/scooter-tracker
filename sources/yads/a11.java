package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a11 implements er1 {
    public static final Parcelable.Creator<a11> CREATOR = new z01();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f108511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f108512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f108513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f108514g;

    public a11(int i10, String str, String str2, String str3, boolean z10, int i11) {
        fi.a(i11 == -1 || i11 > 0);
        this.f108509b = i10;
        this.f108510c = str;
        this.f108511d = str2;
        this.f108512e = str3;
        this.f108513f = z10;
        this.f108514g = i11;
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
        if (obj != null && a11.class == obj.getClass()) {
            a11 a11Var = (a11) obj;
            if (this.f108509b == a11Var.f108509b && w83.a(this.f108510c, a11Var.f108510c) && w83.a(this.f108511d, a11Var.f108511d) && w83.a(this.f108512e, a11Var.f108512e) && this.f108513f == a11Var.f108513f && this.f108514g == a11Var.f108514g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f108509b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f108510c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f108511d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f108512e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f108513f ? 1 : 0)) * 31) + this.f108514g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f108511d + "\", genre=\"" + this.f108510c + "\", bitrate=" + this.f108509b + ", metadataInterval=" + this.f108514g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f108509b);
        parcel.writeString(this.f108510c);
        parcel.writeString(this.f108511d);
        parcel.writeString(this.f108512e);
        boolean z10 = this.f108513f;
        int i11 = w83.f117341a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f108514g);
    }

    public static a11 a(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        int i12;
        int i13;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i14 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i13 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i13 = -1;
            }
            if (i13 > 0) {
                z10 = true;
                i10 = i13;
            } else {
                try {
                    uf1.d("IcyHeaders", "Invalid bitrate: " + str4);
                    z10 = false;
                    i10 = -1;
                } catch (NumberFormatException unused2) {
                    bj1.a("Invalid bitrate header: ", str4, "IcyHeaders");
                    z10 = false;
                    i10 = i13;
                }
            }
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                i12 = Integer.parseInt(str5);
            } catch (NumberFormatException unused3) {
            }
            if (i12 > 0) {
                i11 = i12;
            } else {
                try {
                    uf1.d("IcyHeaders", "Invalid metadata interval: " + str5);
                } catch (NumberFormatException unused4) {
                    i14 = i12;
                    bj1.a("Invalid metadata interval: ", str5, "IcyHeaders");
                }
                z11 = z10;
                i11 = i14;
            }
        } else {
            z11 = z10;
            i11 = i14;
        }
        if (z11) {
            return new a11(i10, str, str2, str3, zEquals, i11);
        }
        return null;
    }

    public a11(Parcel parcel) {
        this.f108509b = parcel.readInt();
        this.f108510c = parcel.readString();
        this.f108511d = parcel.readString();
        this.f108512e = parcel.readString();
        this.f108513f = w83.a(parcel);
        this.f108514g = parcel.readInt();
    }

    @Override // yads.er1
    public final void a(uk1 uk1Var) {
        String str = this.f108511d;
        if (str != null) {
            uk1Var.D = str;
        }
        String str2 = this.f108510c;
        if (str2 != null) {
            uk1Var.B = str2;
        }
    }
}
