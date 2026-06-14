package f1;

import android.content.SharedPreferences;
import f1.bf;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f71441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f71447g;

    public wc(SharedPreferences mPrefs) {
        Intrinsics.checkNotNullParameter(mPrefs, "mPrefs");
        this.f71441a = mPrefs;
        this.f71442b = a();
        this.f71443c = System.currentTimeMillis();
        int iG = g() + 1;
        Integer numValueOf = iG < 0 ? null : Integer.valueOf(iG);
        this.f71444d = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
        h();
    }

    public final String a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return j6.a(string);
    }

    public final void b(bf type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, bf.b.f69484g)) {
            this.f71445e++;
        } else if (Intrinsics.areEqual(type, bf.c.f69485g)) {
            this.f71446f++;
        } else if (Intrinsics.areEqual(type, bf.a.f69483g)) {
            this.f71447g++;
        }
    }

    public final int c() {
        return this.f71444d;
    }

    public final int d(bf bfVar) {
        if (Intrinsics.areEqual(bfVar, bf.b.f69484g)) {
            return this.f71445e;
        }
        if (Intrinsics.areEqual(bfVar, bf.c.f69485g)) {
            return this.f71446f;
        }
        if (Intrinsics.areEqual(bfVar, bf.a.f69483g)) {
            return this.f71447g;
        }
        return 0;
    }

    public final long e() {
        return System.currentTimeMillis() - this.f71443c;
    }

    public final String f() {
        return this.f71442b;
    }

    public final int g() {
        return this.f71441a.getInt("session_key", 0);
    }

    public final void h() {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorEdit = this.f71441a.edit();
        if (editorEdit == null || (editorPutInt = editorEdit.putInt("session_key", this.f71444d)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    public final jd i() {
        return new jd(this.f71442b, e(), this.f71444d, d(bf.a.f69483g), d(bf.c.f69485g), d(bf.b.f69484g));
    }
}
