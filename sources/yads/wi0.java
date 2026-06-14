package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wi0 implements Parcelable {
    public static final Parcelable.Creator<wi0> CREATOR = new vi0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f117460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f117462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f117463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f117464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f117465h;

    public wi0(Parcel parcel) {
        this.f117459b = (String) w83.a((Object) parcel.readString());
        this.f117460c = Uri.parse((String) w83.a((Object) parcel.readString()));
        this.f117461d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((h13) parcel.readParcelable(h13.class.getClassLoader()));
        }
        this.f117462e = DesugarCollections.unmodifiableList(arrayList);
        this.f117463f = parcel.createByteArray();
        this.f117464g = parcel.readString();
        this.f117465h = (byte[]) w83.a((Object) parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) obj;
        return this.f117459b.equals(wi0Var.f117459b) && this.f117460c.equals(wi0Var.f117460c) && w83.a(this.f117461d, wi0Var.f117461d) && this.f117462e.equals(wi0Var.f117462e) && Arrays.equals(this.f117463f, wi0Var.f117463f) && w83.a(this.f117464g, wi0Var.f117464g) && Arrays.equals(this.f117465h, wi0Var.f117465h);
    }

    public final int hashCode() {
        int iHashCode = (this.f117460c.hashCode() + (this.f117459b.hashCode() * 961)) * 31;
        String str = this.f117461d;
        int iHashCode2 = (Arrays.hashCode(this.f117463f) + ((this.f117462e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f117464g;
        return Arrays.hashCode(this.f117465h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f117461d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f117459b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f117459b);
        parcel.writeString(this.f117460c.toString());
        parcel.writeString(this.f117461d);
        parcel.writeInt(this.f117462e.size());
        for (int i11 = 0; i11 < this.f117462e.size(); i11++) {
            parcel.writeParcelable((Parcelable) this.f117462e.get(i11), 0);
        }
        parcel.writeByteArray(this.f117463f);
        parcel.writeString(this.f117464g);
        parcel.writeByteArray(this.f117465h);
    }

    public wi0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = w83.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            fi.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f117459b = str;
        this.f117460c = uri;
        this.f117461d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f117462e = DesugarCollections.unmodifiableList(arrayList);
        this.f117463f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f117464g = str3;
        this.f117465h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : w83.f117346f;
    }
}
