package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class vk1 implements oq {
    public static final vk1 H = new vk1(new uk1());
    public static final nq I = new nq() { // from class: yads.tr0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return vk1.a(bundle);
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f117021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f117022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f117023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f117024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f117025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f117026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f117027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mj2 f117028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mj2 f117029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f117030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f117031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f117032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f117033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f117034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f117035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f117036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f117037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f117038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f117039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f117040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f117041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f117042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f117043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f117044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f117045z;

    public vk1(uk1 uk1Var) {
        this.f117021b = uk1Var.f116677a;
        this.f117022c = uk1Var.f116678b;
        this.f117023d = uk1Var.f116679c;
        this.f117024e = uk1Var.f116680d;
        this.f117025f = uk1Var.f116681e;
        this.f117026g = uk1Var.f116682f;
        this.f117027h = uk1Var.f116683g;
        this.f117028i = uk1Var.f116684h;
        this.f117029j = uk1Var.f116685i;
        this.f117030k = uk1Var.f116686j;
        this.f117031l = uk1Var.f116687k;
        this.f117032m = uk1Var.f116688l;
        this.f117033n = uk1Var.f116689m;
        this.f117034o = uk1Var.f116690n;
        this.f117035p = uk1Var.f116691o;
        this.f117036q = uk1Var.f116692p;
        Integer num = uk1Var.f116693q;
        this.f117037r = num;
        this.f117038s = num;
        this.f117039t = uk1Var.f116694r;
        this.f117040u = uk1Var.f116695s;
        this.f117041v = uk1Var.f116696t;
        this.f117042w = uk1Var.f116697u;
        this.f117043x = uk1Var.f116698v;
        this.f117044y = uk1Var.f116699w;
        this.f117045z = uk1Var.f116700x;
        this.A = uk1Var.f116701y;
        this.B = uk1Var.f116702z;
        this.C = uk1Var.A;
        this.D = uk1Var.B;
        this.E = uk1Var.C;
        this.F = uk1Var.D;
        this.G = uk1Var.E;
    }

    public static vk1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        uk1 uk1Var = new uk1();
        uk1Var.f116677a = bundle.getCharSequence(Integer.toString(0, 36));
        uk1Var.f116678b = bundle.getCharSequence(Integer.toString(1, 36));
        uk1Var.f116679c = bundle.getCharSequence(Integer.toString(2, 36));
        uk1Var.f116680d = bundle.getCharSequence(Integer.toString(3, 36));
        uk1Var.f116681e = bundle.getCharSequence(Integer.toString(4, 36));
        uk1Var.f116682f = bundle.getCharSequence(Integer.toString(5, 36));
        uk1Var.f116683g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        uk1Var.f116686j = byteArray != null ? (byte[]) byteArray.clone() : null;
        uk1Var.f116687k = numValueOf;
        uk1Var.f116688l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        uk1Var.f116699w = bundle.getCharSequence(Integer.toString(22, 36));
        uk1Var.f116700x = bundle.getCharSequence(Integer.toString(23, 36));
        uk1Var.f116701y = bundle.getCharSequence(Integer.toString(24, 36));
        uk1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        uk1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        uk1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        uk1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            uk1Var.f116684h = (mj2) mj2.f113535b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            uk1Var.f116685i = (mj2) mj2.f113535b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            uk1Var.f116689m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            uk1Var.f116690n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            uk1Var.f116691o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            uk1Var.f116692p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            uk1Var.f116693q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            uk1Var.f116694r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            uk1Var.f116695s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            uk1Var.f116696t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            uk1Var.f116697u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            uk1Var.f116698v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            uk1Var.f116702z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            uk1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new vk1(uk1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vk1.class == obj.getClass()) {
            vk1 vk1Var = (vk1) obj;
            if (w83.a(this.f117021b, vk1Var.f117021b) && w83.a(this.f117022c, vk1Var.f117022c) && w83.a(this.f117023d, vk1Var.f117023d) && w83.a(this.f117024e, vk1Var.f117024e) && w83.a(this.f117025f, vk1Var.f117025f) && w83.a(this.f117026g, vk1Var.f117026g) && w83.a(this.f117027h, vk1Var.f117027h) && w83.a(this.f117028i, vk1Var.f117028i) && w83.a(this.f117029j, vk1Var.f117029j) && Arrays.equals(this.f117030k, vk1Var.f117030k) && w83.a(this.f117031l, vk1Var.f117031l) && w83.a(this.f117032m, vk1Var.f117032m) && w83.a(this.f117033n, vk1Var.f117033n) && w83.a(this.f117034o, vk1Var.f117034o) && w83.a(this.f117035p, vk1Var.f117035p) && w83.a(this.f117036q, vk1Var.f117036q) && w83.a(this.f117038s, vk1Var.f117038s) && w83.a(this.f117039t, vk1Var.f117039t) && w83.a(this.f117040u, vk1Var.f117040u) && w83.a(this.f117041v, vk1Var.f117041v) && w83.a(this.f117042w, vk1Var.f117042w) && w83.a(this.f117043x, vk1Var.f117043x) && w83.a(this.f117044y, vk1Var.f117044y) && w83.a(this.f117045z, vk1Var.f117045z) && w83.a(this.A, vk1Var.A) && w83.a(this.B, vk1Var.B) && w83.a(this.C, vk1Var.C) && w83.a(this.D, vk1Var.D) && w83.a(this.E, vk1Var.E) && w83.a(this.F, vk1Var.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f117021b, this.f117022c, this.f117023d, this.f117024e, this.f117025f, this.f117026g, this.f117027h, this.f117028i, this.f117029j, Integer.valueOf(Arrays.hashCode(this.f117030k)), this.f117031l, this.f117032m, this.f117033n, this.f117034o, this.f117035p, this.f117036q, this.f117038s, this.f117039t, this.f117040u, this.f117041v, this.f117042w, this.f117043x, this.f117044y, this.f117045z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
