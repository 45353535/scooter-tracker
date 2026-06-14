package io.bidmachine.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import n9.f;
import n9.w;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SchemeData[] f80507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f80508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80510e;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f80511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f80512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f80513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f80514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f80515f;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return c() && !schemeData.c() && d(schemeData.f80512c);
        }

        public SchemeData b(byte[] bArr) {
            return new SchemeData(this.f80512c, this.f80513d, this.f80514e, bArr);
        }

        public boolean c() {
            return this.f80515f != null;
        }

        public boolean d(UUID uuid) {
            return f.f95287a.equals(this.f80512c) || uuid.equals(this.f80512c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f80513d, schemeData.f80513d) && Objects.equals(this.f80514e, schemeData.f80514e) && Objects.equals(this.f80512c, schemeData.f80512c) && Arrays.equals(this.f80515f, schemeData.f80515f);
        }

        public int hashCode() {
            if (this.f80511b == 0) {
                int iHashCode = this.f80512c.hashCode() * 31;
                String str = this.f80513d;
                this.f80511b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f80514e.hashCode()) * 31) + Arrays.hashCode(this.f80515f);
            }
            return this.f80511b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f80512c.getMostSignificantBits());
            parcel.writeLong(this.f80512c.getLeastSignificantBits());
            parcel.writeString(this.f80513d);
            parcel.writeString(this.f80514e);
            parcel.writeByteArray(this.f80515f);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f80512c = (UUID) q9.a.e(uuid);
            this.f80513d = str;
            this.f80514e = w.u((String) q9.a.e(str2));
            this.f80515f = bArr;
        }

        SchemeData(Parcel parcel) {
            this.f80512c = new UUID(parcel.readLong(), parcel.readLong());
            this.f80513d = parcel.readString();
            this.f80514e = (String) o0.i(parcel.readString());
            this.f80515f = parcel.createByteArray();
        }
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    private static boolean b(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((SchemeData) arrayList.get(i11)).f80512c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData d(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f80509d;
            for (SchemeData schemeData : drmInitData.f80507b) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f80509d;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f80507b) {
                if (schemeData2.c() && !b(arrayList, size, schemeData2.f80512c)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = f.f95287a;
        return uuid.equals(schemeData.f80512c) ? uuid.equals(schemeData2.f80512c) ? 0 : 1 : schemeData.f80512c.compareTo(schemeData2.f80512c);
    }

    public DrmInitData c(String str) {
        return Objects.equals(this.f80509d, str) ? this : new DrmInitData(str, false, this.f80507b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SchemeData e(int i10) {
        return this.f80507b[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.f80509d, drmInitData.f80509d) && Arrays.equals(this.f80507b, drmInitData.f80507b)) {
                return true;
            }
        }
        return false;
    }

    public DrmInitData f(DrmInitData drmInitData) {
        String str;
        String str2 = this.f80509d;
        q9.a.g(str2 == null || (str = drmInitData.f80509d) == null || TextUtils.equals(str2, str));
        String str3 = this.f80509d;
        if (str3 == null) {
            str3 = drmInitData.f80509d;
        }
        return new DrmInitData(str3, (SchemeData[]) o0.U0(this.f80507b, drmInitData.f80507b));
    }

    public int hashCode() {
        if (this.f80508c == 0) {
            String str = this.f80509d;
            this.f80508c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f80507b);
        }
        return this.f80508c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f80509d);
        parcel.writeTypedArray(this.f80507b, 0);
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f80509d = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f80507b = schemeDataArr;
        this.f80510e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f80509d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) o0.i((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f80507b = schemeDataArr;
        this.f80510e = schemeDataArr.length;
    }
}
