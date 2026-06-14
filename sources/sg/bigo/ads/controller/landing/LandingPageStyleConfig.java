package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i10) {
            return new LandingPageStyleConfig[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f103724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f103725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f103726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<? extends d> f103727g;

    protected LandingPageStyleConfig(Parcel parcel) {
        this.f103727g = (Class) parcel.readSerializable();
        this.f103723c = parcel.readInt();
        this.f103721a = parcel.readInt();
        this.f103722b = parcel.readInt();
        this.f103724d = parcel.readInt();
        this.f103725e = parcel.readInt();
        this.f103726f = parcel.readFloat();
    }

    public final boolean a() {
        return this.f103727g != null && this.f103724d > 0;
    }

    public final boolean b() {
        int i10 = this.f103721a;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f103727g);
        parcel.writeInt(this.f103723c);
        parcel.writeInt(this.f103721a);
        parcel.writeInt(this.f103722b);
        parcel.writeInt(this.f103724d);
        parcel.writeInt(this.f103725e);
        parcel.writeFloat(this.f103726f);
    }

    public LandingPageStyleConfig(Class<? extends d> cls, int i10, int i11, int i12, int i13, int i14, float f10) {
        this.f103727g = cls;
        this.f103723c = i10;
        this.f103721a = i11;
        this.f103722b = i12;
        this.f103724d = i13;
        this.f103725e = i14;
        this.f103726f = f10;
    }
}
