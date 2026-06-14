package w4;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import com.ktwapps.speedometer.R;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.l;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f107437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f107438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f107439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f107440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f107441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f107442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f107443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f107444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Location f107445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Location f107446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Location f107447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f107448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f107449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f107450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f107451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f107452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f107453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f107454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f107455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f107456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f107457u;

    public c() {
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Context context, double d10, double d11) {
        List<Address> fromLocation;
        try {
            fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(d10, d11, 1);
        } catch (IOException unused) {
            fromLocation = null;
        }
        O((fromLocation == null || fromLocation.isEmpty()) ? "" : fromLocation.get(0).getAddressLine(0));
    }

    private void W(String str) {
        this.f107453q = str;
    }

    private boolean X() {
        long time = new Date().getTime();
        long j10 = this.f107454r;
        if (j10 == 0) {
            this.f107454r = time;
            return true;
        }
        if (time - j10 <= 10000) {
            return false;
        }
        this.f107454r = time;
        return true;
    }

    public float A() {
        return this.f107444h;
    }

    public String B() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (List list : this.f107450n) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((Float) it.next());
                }
                jSONArray.put(jSONArray2);
            }
            return jSONArray.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public int C() {
        return this.f107451o;
    }

    public List D() {
        return this.f107450n;
    }

    public String E() {
        return this.f107453q;
    }

    public long F() {
        return this.f107439c;
    }

    public void G(boolean z10) {
        long time = new Date().getTime();
        if (this.f107438b != 0 && (!z10 || A() >= 0.0f)) {
            this.f107437a += time - this.f107438b;
        }
        this.f107438b = time;
    }

    public void H() {
        this.f107446j = null;
        if (!this.f107449m.isEmpty()) {
            if (((List) this.f107449m.get(r0.size() - 1)).isEmpty()) {
                return;
            }
        }
        this.f107449m.add(new ArrayList());
        this.f107450n.add(new ArrayList());
    }

    public boolean I() {
        return this.f107440d != 0 && new Date().getTime() - this.f107440d > 5000;
    }

    public boolean J() {
        return this.f107441e != 0 && new Date().getTime() - this.f107441e > 10000;
    }

    public boolean K(Context context) {
        int iY = l.y(x.u(context), this.f107444h);
        int iS = x.s(context);
        return iS > 0 && iY > iS;
    }

    public void M() {
        this.f107438b = 0L;
    }

    public void N() {
        ArrayList arrayList = new ArrayList();
        this.f107449m = arrayList;
        arrayList.add(new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        this.f107450n = arrayList2;
        arrayList2.add(new ArrayList());
        this.f107448l = new ArrayList();
        this.f107439c = System.currentTimeMillis();
        this.f107437a = 0L;
        this.f107438b = 0L;
        this.f107442f = 0.0f;
        this.f107443g = 0.0f;
        this.f107444h = 0.0f;
        this.f107451o = 0;
        this.f107456t = 0;
        this.f107457u = 0;
        this.f107453q = null;
        this.f107452p = null;
        this.f107455s = 0L;
        this.f107440d = 0L;
    }

    public void O(String str) {
        String str2 = this.f107453q;
        if (str2 == null || str2.isEmpty()) {
            W(str);
        }
        this.f107452p = str;
    }

    public void P(Location location) {
        this.f107447k = location;
    }

    public void Q(long j10) {
        this.f107441e = j10;
    }

    public void R(long j10) {
        this.f107440d = j10;
    }

    public void S(Location location) {
        this.f107445i = location;
    }

    public void T(int i10) {
        this.f107457u = i10;
    }

    public void U(int i10) {
        this.f107456t = i10;
        this.f107441e = new Date().getTime();
    }

    public void V(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f107444h = f10;
    }

    public void Y(Context context, Location location, boolean z10, boolean z11) {
        if (!z11) {
            Location location2 = this.f107446j;
            if (location2 == null || z10) {
                location2 = location;
            }
            if (location2.getSpeed() * 3.6f >= 1.0f || location.getSpeed() * 3.6f >= 1.0f) {
                float fDistanceTo = location2.distanceTo(location) / 1000.0f;
                this.f107442f += fDistanceTo;
                x.U(context, x.m(context) + fDistanceTo);
            }
        }
        this.f107446j = location;
    }

    public void Z() {
        this.f107443g = Math.max(this.f107444h, this.f107443g);
    }

    public void a0(Context context) {
        long time = new Date().getTime();
        long j10 = this.f107455s;
        if (j10 == 0 || time - j10 > 10000) {
            x.a0(context, r(), w(), B());
            this.f107455s = time;
        }
    }

    public void b(float f10) {
        if (3.6f * f10 >= 1.0f) {
            this.f107448l.add(Float.valueOf(f10));
        }
    }

    public void b0() {
        this.f107451o++;
    }

    public void c(Location location) {
        if (location.hasSpeed()) {
            List list = this.f107449m;
            List list2 = (List) list.get(list.size() - 1);
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            if (list2.size() < 2) {
                List list3 = this.f107449m;
                ((List) list3.get(list3.size() - 1)).add(latLng);
                List list4 = this.f107450n;
                ((List) list4.get(list4.size() - 1)).add(Float.valueOf(location.getSpeed()));
                return;
            }
            LatLng latLng2 = (LatLng) list2.get(list2.size() - 1);
            LatLng latLng3 = (LatLng) list2.get(list2.size() - 2);
            float[] fArr = new float[1];
            Location.distanceBetween(latLng2.latitude, latLng2.longitude, latLng3.latitude, latLng3.longitude, fArr);
            if (fArr[0] >= 5.0f) {
                List list5 = this.f107449m;
                ((List) list5.get(list5.size() - 1)).add(latLng);
                List list6 = this.f107450n;
                ((List) list6.get(list6.size() - 1)).add(Float.valueOf(location.getSpeed()));
                return;
            }
            List list7 = this.f107449m;
            ((List) list7.get(list7.size() - 1)).set(list2.size() - 1, latLng);
            List list8 = this.f107450n;
            ((List) list8.get(list8.size() - 1)).set(list2.size() - 1, Float.valueOf(location.getSpeed()));
        }
    }

    public void d(final Context context, final double d10, final double d11) {
        if (X()) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: w4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107433b.L(context, d10, d11);
                }
            });
        }
    }

    public float e() {
        if (!this.f107448l.isEmpty()) {
            try {
                Iterator it = this.f107448l.iterator();
                float fFloatValue = 0.0f;
                while (it.hasNext()) {
                    fFloatValue += ((Float) it.next()).floatValue();
                }
                return fFloatValue / this.f107448l.size();
            } catch (ConcurrentModificationException unused) {
            }
        }
        return 0.0f;
    }

    public String f() {
        String str = this.f107452p;
        return str == null ? "" : str;
    }

    public float g() {
        return this.f107442f;
    }

    public long h() {
        return this.f107437a;
    }

    public String i(Context context) {
        if (u() == null || !u().hasAltitude()) {
            return "–";
        }
        double dMax = Math.max(u().getAltitude(), 0.0d);
        String str = new DecimalFormat("##").format(dMax / 0.3084d);
        return new DecimalFormat("##.#").format(dMax) + " " + context.getString(R.string.m) + "(" + str + " " + context.getString(R.string.ft) + ")";
    }

    public String j(Context context) {
        return l.o(context, e());
    }

    public String k(Context context) {
        return String.valueOf(l.y(x.u(context), this.f107444h));
    }

    public String l(Context context) {
        return l.i(context, this.f107442f);
    }

    public String m() {
        return l.j(this.f107437a);
    }

    public String n() {
        if (u() == null) {
            return "–";
        }
        double latitude = u().getLatitude();
        return String.format(Locale.US, "%.6f° %s", Double.valueOf(Math.abs(latitude)), latitude >= 0.0d ? "N" : ExifInterface.LATITUDE_SOUTH);
    }

    public String o() {
        if (u() == null) {
            return "–";
        }
        double longitude = u().getLongitude();
        return String.format(Locale.US, "%.6f° %s", Double.valueOf(Math.abs(longitude)), longitude >= 0.0d ? ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST);
    }

    public String p(Context context) {
        return l.o(context, this.f107443g);
    }

    public String q(Context context) {
        int iU = x.u(context);
        float f10 = this.f107444h;
        if (I()) {
            f10 = 0.0f;
        }
        return l.y(iU, f10) + " " + l.z(context, iU);
    }

    public String r() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", h());
            jSONObject.put("startDate", F());
            jSONObject.put("endDate", System.currentTimeMillis());
            jSONObject.put("distance", g());
            jSONObject.put("maximum", v());
            jSONObject.put("average", e());
            jSONObject.put("speeding", C());
            String strF = "";
            jSONObject.put("startAddress", E() == null ? "" : E());
            if (f() != null) {
                strF = f();
            }
            jSONObject.put("endAddress", strF);
            return jSONObject.toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public long s() {
        return new Date().getTime() - this.f107440d;
    }

    public List t() {
        if (this.f107449m.isEmpty()) {
            return new ArrayList();
        }
        return (List) this.f107449m.get(r0.size() - 1);
    }

    public Location u() {
        Location location = this.f107445i;
        return location == null ? this.f107447k : location;
    }

    public float v() {
        return this.f107443g;
    }

    public String w() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f107449m.iterator();
            while (it.hasNext()) {
                jSONArray.put(PolyUtil.encode((List) it.next()));
            }
            return jSONArray.length() > 0 ? jSONArray.toString() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public List x() {
        return this.f107449m;
    }

    public String y() {
        if (J()) {
            return "0/0";
        }
        return this.f107457u + "/" + this.f107456t;
    }

    public int z() {
        if (this.f107457u == 0 || J()) {
            return 0;
        }
        int i10 = this.f107457u;
        if (i10 >= 7) {
            return 3;
        }
        return i10 >= 4 ? 2 : 1;
    }
}
