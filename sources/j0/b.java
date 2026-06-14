package j0;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f85420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f85421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f85423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f85424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f85427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f85429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f85430m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f85418a = str;
        this.f85419b = str2;
        this.f85420c = f10;
        this.f85421d = aVar;
        this.f85422e = i10;
        this.f85423f = f11;
        this.f85424g = f12;
        this.f85425h = i11;
        this.f85426i = i12;
        this.f85427j = f13;
        this.f85428k = z10;
        this.f85429l = pointF;
        this.f85430m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f85418a.hashCode() * 31) + this.f85419b.hashCode()) * 31) + this.f85420c)) * 31) + this.f85421d.ordinal()) * 31) + this.f85422e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f85423f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f85425h;
    }

    public b() {
    }
}
