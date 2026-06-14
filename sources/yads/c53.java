package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class c53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f109233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f109235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y31 f109237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f109238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y31 f109239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f109240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f109241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f109242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y31 f109243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y31 f109244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f109245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f109246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f109247v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f109248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f109249x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f109250y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f109251z;

    public c53() {
        this.f109226a = Integer.MAX_VALUE;
        this.f109227b = Integer.MAX_VALUE;
        this.f109228c = Integer.MAX_VALUE;
        this.f109229d = Integer.MAX_VALUE;
        this.f109234i = Integer.MAX_VALUE;
        this.f109235j = Integer.MAX_VALUE;
        this.f109236k = true;
        this.f109237l = y31.g();
        this.f109238m = 0;
        this.f109239n = y31.g();
        this.f109240o = 0;
        this.f109241p = Integer.MAX_VALUE;
        this.f109242q = Integer.MAX_VALUE;
        this.f109243r = y31.g();
        this.f109244s = y31.g();
        this.f109245t = 0;
        this.f109246u = 0;
        this.f109247v = false;
        this.f109248w = false;
        this.f109249x = false;
        this.f109250y = new HashMap();
        this.f109251z = new HashSet();
    }

    public static nk2 a(String[] strArr) {
        v31 v31Var = y31.f118068c;
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            str.getClass();
            String strE = w83.e(str);
            strE.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = strE;
            i10++;
            i11 = i12;
        }
        return y31.b(i11, objArrCopyOf);
    }

    public void b(Context context) {
        Point pointC = w83.c(context);
        a(pointC.x, pointC.y);
    }

    public c53 a(int i10, int i11) {
        this.f109234i = i10;
        this.f109235j = i11;
        this.f109236k = true;
        return this;
    }

    public void a(Context context) {
        CaptioningManager captioningManager;
        int i10 = w83.f117341a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f109245t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f109244s = y31.a(w83.a(locale));
                }
            }
        }
    }

    public c53(Context context) {
        this();
        a(context);
        b(context);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
    public c53(Bundle bundle) {
        nk2 nk2VarA;
        String strA = d53.a(6);
        d53 d53Var = d53.B;
        this.f109226a = bundle.getInt(strA, d53Var.f109771b);
        this.f109227b = bundle.getInt(d53.a(7), d53Var.f109772c);
        this.f109228c = bundle.getInt(d53.a(8), d53Var.f109773d);
        this.f109229d = bundle.getInt(d53.a(9), d53Var.f109774e);
        this.f109230e = bundle.getInt(d53.a(10), d53Var.f109775f);
        this.f109231f = bundle.getInt(d53.a(11), d53Var.f109776g);
        this.f109232g = bundle.getInt(d53.a(12), d53Var.f109777h);
        this.f109233h = bundle.getInt(d53.a(13), d53Var.f109778i);
        this.f109234i = bundle.getInt(d53.a(14), d53Var.f109779j);
        this.f109235j = bundle.getInt(d53.a(15), d53Var.f109780k);
        this.f109236k = bundle.getBoolean(d53.a(16), d53Var.f109781l);
        this.f109237l = y31.b((String[]) pt1.a(bundle.getStringArray(d53.a(17)), new String[0]));
        this.f109238m = bundle.getInt(d53.a(25), d53Var.f109783n);
        this.f109239n = a((String[]) pt1.a(bundle.getStringArray(d53.a(1)), new String[0]));
        this.f109240o = bundle.getInt(d53.a(2), d53Var.f109785p);
        this.f109241p = bundle.getInt(d53.a(18), d53Var.f109786q);
        this.f109242q = bundle.getInt(d53.a(19), d53Var.f109787r);
        this.f109243r = y31.b((String[]) pt1.a(bundle.getStringArray(d53.a(20)), new String[0]));
        this.f109244s = a((String[]) pt1.a(bundle.getStringArray(d53.a(3)), new String[0]));
        this.f109245t = bundle.getInt(d53.a(4), d53Var.f109790u);
        this.f109246u = bundle.getInt(d53.a(26), d53Var.f109791v);
        this.f109247v = bundle.getBoolean(d53.a(5), d53Var.f109792w);
        this.f109248w = bundle.getBoolean(d53.a(21), d53Var.f109793x);
        this.f109249x = bundle.getBoolean(d53.a(22), d53Var.f109794y);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d53.a(23));
        if (parcelableArrayList == null) {
            nk2VarA = y31.g();
        } else {
            nk2VarA = pq.a(b53.f108910d, parcelableArrayList);
        }
        this.f109250y = new HashMap();
        for (int i10 = 0; i10 < nk2VarA.size(); i10++) {
            b53 b53Var = (b53) nk2VarA.get(i10);
            this.f109250y.put(b53Var.f108911b, b53Var);
        }
        int[] iArr = (int[]) pt1.a(bundle.getIntArray(d53.a(24)), new int[0]);
        this.f109251z = new HashSet();
        for (int i11 : iArr) {
            this.f109251z.add(Integer.valueOf(i11));
        }
    }
}
