package w4;

import android.content.Context;
import android.location.Location;
import androidx.exifinterface.media.ExifInterface;
import com.ktwapps.speedometer.R;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;
import x4.l;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f107421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f107422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f107423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f107424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f107425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f107426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f107427g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f107429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f107430j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f107428h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Location f107431k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Location f107432l = null;

    public void A(int i10) {
        this.f107426f = i10;
        this.f107430j = new Date().getTime();
    }

    public void B(boolean z10) {
        this.f107421a = z10;
    }

    public void C(boolean z10) {
        this.f107425e = z10;
    }

    public void D(boolean z10) {
        this.f107424d = z10;
    }

    public void E(boolean z10) {
        this.f107423c = z10;
    }

    public String a(Context context) {
        if (h() == null || !h().hasAltitude()) {
            return "–";
        }
        double dMax = Math.max(h().getAltitude(), 0.0d);
        String str = new DecimalFormat("##").format(dMax / 0.3084d);
        return new DecimalFormat("##.#").format(dMax) + " " + context.getString(R.string.m) + "(" + str + " " + context.getString(R.string.ft) + ")";
    }

    public String b() {
        if (h() == null) {
            return "–";
        }
        double latitude = h().getLatitude();
        return String.format(Locale.US, "%.6f° %s", Double.valueOf(Math.abs(latitude)), latitude >= 0.0d ? "N" : ExifInterface.LATITUDE_SOUTH);
    }

    public String c() {
        if (h() == null) {
            return "–";
        }
        double longitude = h().getLongitude();
        return String.format(Locale.US, "%.6f° %s", Double.valueOf(Math.abs(longitude)), longitude >= 0.0d ? ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST);
    }

    public String d(Context context) {
        return (this.f107431k == null || o()) ? "0" : String.valueOf(l.y(x.u(context), this.f107431k.getSpeed()));
    }

    public long e() {
        return this.f107428h;
    }

    public long f() {
        return this.f107430j;
    }

    public long g() {
        return this.f107429i;
    }

    public Location h() {
        Location location = this.f107431k;
        return location == null ? this.f107432l : location;
    }

    public int i() {
        return this.f107427g;
    }

    public int j() {
        return this.f107426f;
    }

    public String k() {
        if (q()) {
            return "0/0";
        }
        return this.f107427g + "/" + this.f107426f;
    }

    public int l() {
        if (this.f107427g == 0 || q()) {
            return 0;
        }
        int i10 = this.f107427g;
        if (i10 >= 7) {
            return 3;
        }
        return i10 >= 4 ? 2 : 1;
    }

    public float m() {
        if (this.f107431k == null || o()) {
            return 0.0f;
        }
        return this.f107431k.getSpeed();
    }

    public boolean n() {
        return this.f107422b;
    }

    public boolean o() {
        return this.f107429i != 0 && new Date().getTime() - this.f107429i > 5000;
    }

    public boolean p() {
        return this.f107421a;
    }

    public boolean q() {
        return this.f107430j != 0 && new Date().getTime() - this.f107430j > 10000;
    }

    public boolean r(Context context) {
        int iY = l.y(x.u(context), m());
        int iS = x.s(context);
        return iS > 0 && iY > iS;
    }

    public boolean s() {
        return this.f107425e;
    }

    public boolean t() {
        return this.f107424d;
    }

    public boolean u() {
        return this.f107423c;
    }

    public void v(boolean z10) {
        this.f107422b = z10;
    }

    public void w(Location location) {
        this.f107432l = location;
    }

    public void x(Location location) {
        this.f107431k = location;
        this.f107429i = new Date().getTime();
    }

    public void y(long j10) {
        this.f107428h = j10;
    }

    public void z(int i10) {
        this.f107427g = i10;
    }
}
