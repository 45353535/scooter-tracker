package e2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f68788a = Color.parseColor("#B4FFFFFF");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68789b = Color.parseColor("#5c000000");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68790c = Color.parseColor("#52000000");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f68791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f68792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f68793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f68794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f68795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f68796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f68797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f68798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f68799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f68800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f68801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f68802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f68803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f68804q;

    static {
        e eVar = new e();
        f68791d = eVar;
        eVar.T(5);
        eVar.d0(48);
        Float fValueOf = Float.valueOf(2.0f);
        eVar.b0(fValueOf);
        eVar.c0("cross");
        eVar.U(8, 8, 8, 8);
        Float fValueOf2 = Float.valueOf(30.0f);
        eVar.f0(fValueOf2);
        eVar.Q(fValueOf2);
        Float fValueOf3 = Float.valueOf(3.0f);
        eVar.S(fValueOf3);
        e eVar2 = new e();
        f68792e = eVar2;
        eVar2.T(5);
        eVar2.d0(48);
        eVar2.b0(fValueOf);
        eVar2.c0("skip");
        eVar2.U(8, 8, 8, 8);
        eVar2.f0(fValueOf2);
        eVar2.Q(fValueOf2);
        eVar2.S(fValueOf3);
        e eVar3 = new e();
        f68795h = eVar3;
        eVar3.T(5);
        eVar3.d0(48);
        eVar3.b0(fValueOf);
        eVar3.c0("circular");
        eVar3.U(8, 8, 8, 8);
        eVar3.f0(fValueOf2);
        eVar3.Q(fValueOf2);
        eVar3.P(1);
        eVar3.S(fValueOf3);
        e eVar4 = new e();
        f68796i = eVar4;
        eVar4.T(5);
        eVar4.d0(48);
        Float fValueOf4 = Float.valueOf(16.0f);
        eVar4.O(fValueOf4);
        eVar4.b0(fValueOf);
        eVar4.Y(12, 2, 12, 2);
        eVar4.M("%1.0f%");
        eVar4.c0("text");
        eVar4.U(8, 8, 8, 8);
        eVar4.P(1);
        eVar4.S(fValueOf3);
        e eVar5 = new e();
        f68794g = eVar5;
        eVar5.T(3);
        eVar5.d0(48);
        eVar5.b0(fValueOf);
        eVar5.U(8, 8, 8, 8);
        eVar5.f0(fValueOf2);
        eVar5.Q(fValueOf2);
        eVar5.S(fValueOf3);
        e eVar6 = new e();
        f68793f = eVar6;
        eVar6.T(17);
        eVar6.d0(48);
        eVar6.b0(fValueOf);
        eVar6.U(8, 8, 8, 8);
        eVar6.f0(fValueOf2);
        eVar6.Q(fValueOf2);
        eVar6.e0(Boolean.FALSE);
        eVar6.S(fValueOf3);
        e eVar7 = new e();
        f68801n = eVar7;
        eVar7.T(17);
        eVar7.d0(80);
        eVar7.N(0);
        eVar7.b0(fValueOf3);
        eVar7.f0(-1);
        eVar7.Q(3);
        eVar7.c0("linear");
        eVar7.S(fValueOf3);
        e eVar8 = new e();
        f68800m = eVar8;
        eVar8.T(17);
        eVar8.d0(80);
        eVar8.O(fValueOf4);
        eVar8.b0(fValueOf);
        eVar8.Y(12, 2, 12, 2);
        eVar8.M("%1.0f%");
        eVar8.c0("text");
        eVar8.U(3, 3, 3, 3);
        eVar8.P(1);
        eVar8.S(fValueOf3);
        e eVar9 = new e();
        f68802o = eVar9;
        eVar9.T(17);
        eVar9.d0(80);
        eVar9.b0(fValueOf);
        eVar9.X(Boolean.TRUE);
        eVar9.c0("circular");
        eVar9.U(8, 8, 8, 8);
        eVar9.f0(fValueOf2);
        eVar9.Q(fValueOf2);
        eVar9.P(1);
        eVar9.S(fValueOf3);
        e eVar10 = new e();
        f68797j = eVar10;
        eVar10.T(5);
        eVar10.d0(80);
        eVar10.O(fValueOf4);
        eVar10.b0(fValueOf);
        eVar10.Y(16, 6, 16, 6);
        eVar10.c0("text");
        eVar10.U(3, 3, 3, 3);
        eVar10.P(1);
        eVar10.S(fValueOf3);
        e eVar11 = new e();
        f68798k = eVar11;
        eVar11.T(17);
        eVar11.d0(80);
        eVar11.N(0);
        eVar11.U(3, 3, 3, 3);
        e eVar12 = new e(eVar11);
        f68799l = eVar12;
        eVar12.U(0, 0, 0, 0);
        e eVar13 = new e();
        f68803p = eVar13;
        eVar13.T(1);
        eVar13.d0(16);
        eVar13.Y(8, 8, 8, 8);
        eVar13.b0(fValueOf3);
        eVar13.f0(48);
        eVar13.Q(48);
        e eVar14 = new e();
        f68804q = eVar14;
        eVar14.T(3);
        eVar14.d0(48);
        eVar14.N(Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
        eVar14.c0("fullscreen");
    }

    public static Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static e b(Context context, e eVar) {
        if (eVar == null || !("crossfill".equals(eVar.D()) || "skipfill".equals(eVar.D()))) {
            return f68791d;
        }
        e eVar2 = new e();
        eVar2.X(Boolean.TRUE);
        return f68791d.g(eVar2);
    }
}
