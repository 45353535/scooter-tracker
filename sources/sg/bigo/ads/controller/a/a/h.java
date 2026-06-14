package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f103200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f103201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f103202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f103203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f103204e;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f103200a);
            parcel.writeLong(this.f103201b);
            parcel.writeLong(this.f103202c);
            parcel.writeLong(this.f103203d);
            parcel.writeLong(this.f103204e);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f103200a = n.a(parcel, 0L);
            this.f103201b = n.a(parcel, 0L);
            this.f103202c = n.a(parcel, 0L);
            this.f103203d = n.a(parcel, 0L);
            this.f103204e = n.a(parcel, 0L);
        }
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
