package sg.bigo.ads.common.s;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f102694a = r.f102830c.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f102695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f102697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f102698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f102699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f102700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f102701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f102702i;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeDouble(this.f102697d);
        parcel.writeDouble(this.f102698e);
        parcel.writeString(this.f102699f);
        parcel.writeString(this.f102700g);
        parcel.writeString(this.f102701h);
        parcel.writeLong(this.f102702i);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f102697d = parcel.readDouble();
        this.f102698e = parcel.readDouble();
        this.f102699f = parcel.readString();
        this.f102700g = parcel.readString();
        this.f102701h = parcel.readString();
        this.f102702i = parcel.readLong();
    }

    public final String toString() {
        return "{longitude=" + this.f102697d + ", latitude=" + this.f102698e + ", countryCode='" + this.f102699f + "', state='" + this.f102700g + "', city='" + this.f102701h + "', updateTime='" + this.f102702i + "'}";
    }

    private a(@NonNull Context context, byte b10) {
        this.f102696c = false;
        this.f102695b = context;
        this.f102702i = 0L;
    }

    public a(@NonNull Context context, @NonNull Parcel parcel) {
        this.f102696c = false;
        this.f102695b = context;
        b(parcel);
    }
}
