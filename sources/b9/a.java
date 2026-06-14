package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5837a = Color.parseColor("#B4FFFFFF");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5838b = Color.parseColor("#5c000000");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5839c = Color.parseColor("#52000000");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f5840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f5841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f5842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f5843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f5844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f5845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f5846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f5847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f5848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f5849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f5850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f5851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f5852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f5853q;

    static {
        k kVar = new k();
        f5840d = kVar;
        kVar.T(5);
        kVar.d0(48);
        Float fValueOf = Float.valueOf(2.0f);
        kVar.b0(fValueOf);
        kVar.c0("cross");
        kVar.U(8, 8, 8, 8);
        Float fValueOf2 = Float.valueOf(30.0f);
        kVar.f0(fValueOf2);
        kVar.Q(fValueOf2);
        Float fValueOf3 = Float.valueOf(3.0f);
        kVar.S(fValueOf3);
        k kVar2 = new k();
        f5841e = kVar2;
        kVar2.T(5);
        kVar2.d0(48);
        kVar2.b0(fValueOf);
        kVar2.c0("skip");
        kVar2.U(8, 8, 8, 8);
        kVar2.f0(fValueOf2);
        kVar2.Q(fValueOf2);
        kVar2.S(fValueOf3);
        k kVar3 = new k();
        f5844h = kVar3;
        kVar3.T(5);
        kVar3.d0(48);
        kVar3.b0(fValueOf);
        kVar3.c0("circular");
        kVar3.U(8, 8, 8, 8);
        kVar3.f0(fValueOf2);
        kVar3.Q(fValueOf2);
        kVar3.P(1);
        kVar3.S(fValueOf3);
        k kVar4 = new k();
        f5845i = kVar4;
        kVar4.T(5);
        kVar4.d0(48);
        Float fValueOf4 = Float.valueOf(16.0f);
        kVar4.O(fValueOf4);
        kVar4.b0(fValueOf);
        kVar4.Y(12, 2, 12, 2);
        kVar4.M("%1.0f%");
        kVar4.c0("text");
        kVar4.U(8, 8, 8, 8);
        kVar4.P(1);
        kVar4.S(fValueOf3);
        k kVar5 = new k();
        f5843g = kVar5;
        kVar5.T(3);
        kVar5.d0(48);
        kVar5.b0(fValueOf);
        kVar5.U(8, 8, 8, 8);
        kVar5.f0(fValueOf2);
        kVar5.Q(fValueOf2);
        kVar5.S(fValueOf3);
        k kVar6 = new k();
        f5842f = kVar6;
        kVar6.T(17);
        kVar6.d0(48);
        kVar6.b0(fValueOf);
        kVar6.U(8, 8, 8, 8);
        kVar6.f0(fValueOf2);
        kVar6.Q(fValueOf2);
        kVar6.e0(Boolean.FALSE);
        kVar6.S(fValueOf3);
        k kVar7 = new k();
        f5850n = kVar7;
        kVar7.T(17);
        kVar7.d0(80);
        kVar7.N(0);
        kVar7.b0(fValueOf3);
        kVar7.f0(-1);
        kVar7.Q(3);
        kVar7.c0("linear");
        kVar7.S(fValueOf3);
        k kVar8 = new k();
        f5849m = kVar8;
        kVar8.T(17);
        kVar8.d0(80);
        kVar8.O(fValueOf4);
        kVar8.b0(fValueOf);
        kVar8.Y(12, 2, 12, 2);
        kVar8.M("%1.0f%");
        kVar8.c0("text");
        kVar8.U(3, 3, 3, 3);
        kVar8.P(1);
        kVar8.S(fValueOf3);
        k kVar9 = new k();
        f5851o = kVar9;
        kVar9.T(17);
        kVar9.d0(80);
        kVar9.b0(fValueOf);
        kVar9.X(Boolean.TRUE);
        kVar9.c0("circular");
        kVar9.U(8, 8, 8, 8);
        kVar9.f0(fValueOf2);
        kVar9.Q(fValueOf2);
        kVar9.P(1);
        kVar9.S(fValueOf3);
        k kVar10 = new k();
        f5846j = kVar10;
        kVar10.T(5);
        kVar10.d0(80);
        kVar10.O(fValueOf4);
        kVar10.b0(fValueOf);
        kVar10.Y(16, 6, 16, 6);
        kVar10.c0("text");
        kVar10.U(3, 3, 3, 3);
        kVar10.P(1);
        kVar10.S(fValueOf3);
        k kVar11 = new k();
        f5847k = kVar11;
        kVar11.T(17);
        kVar11.d0(80);
        kVar11.N(0);
        kVar11.U(3, 3, 3, 3);
        k kVar12 = new k(kVar11);
        f5848l = kVar12;
        kVar12.U(0, 0, 0, 0);
        k kVar13 = new k();
        f5852p = kVar13;
        kVar13.T(1);
        kVar13.d0(16);
        kVar13.Y(8, 8, 8, 8);
        kVar13.b0(fValueOf3);
        kVar13.f0(48);
        kVar13.Q(48);
        k kVar14 = new k();
        f5853q = kVar14;
        kVar14.T(3);
        kVar14.d0(48);
        kVar14.N(Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
        kVar14.c0("fullscreen");
    }

    public static Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static k b(Context context, k kVar) {
        if (kVar == null || !("crossfill".equals(kVar.D()) || "skipfill".equals(kVar.D()))) {
            return f5840d;
        }
        k kVar2 = new k();
        kVar2.X(Boolean.TRUE);
        return f5840d.g(kVar2);
    }
}
