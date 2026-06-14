package d0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f68388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f68389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f68390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f68391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f68392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f68393f;

    public v(int i10, int i11, String str, String str2, String str3) {
        this.f68388a = i10;
        this.f68389b = i11;
        this.f68390c = str;
        this.f68391d = str2;
        this.f68392e = str3;
    }

    public v a(float f10) {
        v vVar = new v((int) (this.f68388a * f10), (int) (this.f68389b * f10), this.f68390c, this.f68391d, this.f68392e);
        Bitmap bitmap = this.f68393f;
        if (bitmap != null) {
            vVar.g(Bitmap.createScaledBitmap(bitmap, vVar.f68388a, vVar.f68389b, true));
        }
        return vVar;
    }

    public Bitmap b() {
        return this.f68393f;
    }

    public String c() {
        return this.f68391d;
    }

    public int d() {
        return this.f68389b;
    }

    public String e() {
        return this.f68390c;
    }

    public int f() {
        return this.f68388a;
    }

    public void g(Bitmap bitmap) {
        this.f68393f = bitmap;
    }
}
