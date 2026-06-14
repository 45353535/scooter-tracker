package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f103164d = r.f102830c.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f103165e = r.f102829b.a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f103166f = r.f102828a.a(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f103167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f103168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f103169i;

    public c(@NonNull String str) {
        super(str, "");
        this.f103169i = f103164d;
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        super.a(parcel);
        parcel.writeLong(this.f103169i);
        parcel.writeLong(this.f103167g);
        parcel.writeLong(this.f103168h);
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        super.b(parcel);
        this.f103169i = n.a(parcel, f103164d);
        this.f103167g = n.a(parcel, 0L);
        this.f103168h = n.a(parcel, 0L);
    }

    @Override // sg.bigo.ads.controller.a.a.b
    public final void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        super.a(jSONObject, z10, str, i10);
        this.f103169i = Math.max(jSONObject.optLong("interval", f103164d / 1000) * 1000, f103166f);
    }

    public final boolean b() {
        long j10 = this.f103167g;
        long j11 = this.f103168h;
        if (j10 == j11) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j10 > j11 ? Math.abs(jCurrentTimeMillis - this.f103167g) > f103165e : Math.abs(jCurrentTimeMillis - this.f103168h) > this.f103169i;
    }
}
