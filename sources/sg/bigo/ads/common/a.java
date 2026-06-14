package sg.bigo.ads.common;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102252a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f102253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102255d;

    private a() {
        this.f102253b = "";
        this.f102254c = true;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f102253b);
        parcel.writeInt(this.f102254c ? 1 : 0);
        parcel.writeLong(this.f102255d);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f102253b = parcel.readString();
        this.f102254c = parcel.readInt() != 0;
        this.f102255d = parcel.readLong();
    }

    public final String toString() {
        return "{advertisingId='" + this.f102253b + "', isLimitAdTrackingEnabled=" + this.f102254c + ", lastUpdateTime=" + this.f102255d + '}';
    }

    public a(@NonNull Parcel parcel) {
        b(parcel);
    }

    public final boolean a() {
        return Math.abs(r.b() - this.f102255d) > r.f102831d.a(1);
    }

    public a(@NonNull String str, boolean z10) {
        this.f102253b = str;
        this.f102254c = z10;
        this.f102255d = r.b();
    }
}
