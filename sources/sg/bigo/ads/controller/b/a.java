package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class a implements sg.bigo.ads.api.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f103306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f103307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f103308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f103309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f103310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f103311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f103312g;

    a() {
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f103306a);
        parcel.writeString(this.f103307b);
        parcel.writeString(this.f103308c);
        parcel.writeString(this.f103309d);
        parcel.writeString(this.f103310e);
        parcel.writeString(this.f103311f);
        parcel.writeString(this.f103312g);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f103306a = parcel.readLong();
        this.f103307b = parcel.readString();
        this.f103308c = parcel.readString();
        this.f103309d = parcel.readString();
        this.f103310e = parcel.readString();
        this.f103311f = parcel.readString();
        this.f103312g = parcel.readString();
    }

    @NonNull
    public final String toString() {
        return "{expressId=" + this.f103306a + ", name='" + this.f103307b + "', url='" + this.f103308c + "', md5='" + this.f103309d + "', style='" + this.f103310e + "', adTypes='" + this.f103311f + "', fileId='" + this.f103312g + "'}";
    }
}
