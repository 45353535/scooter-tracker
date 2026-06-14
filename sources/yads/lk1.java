package yads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f113131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik1 f113133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f113134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f113135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y31 f113136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f113137g;

    public lk1(Uri uri, String str, ik1 ik1Var, List list, String str2, y31 y31Var, Object obj) {
        this.f113131a = uri;
        this.f113132b = str;
        this.f113133c = ik1Var;
        this.f113134d = list;
        this.f113135e = str2;
        this.f113136f = y31Var;
        u31 u31VarF = y31.f();
        if (y31Var.size() > 0) {
            androidx.privacysandbox.ads.adservices.topics.a.a(y31Var.get(0));
            throw null;
        }
        u31VarF.a();
        this.f113137g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk1)) {
            return false;
        }
        lk1 lk1Var = (lk1) obj;
        return this.f113131a.equals(lk1Var.f113131a) && w83.a(this.f113132b, lk1Var.f113132b) && w83.a(this.f113133c, lk1Var.f113133c) && w83.a((Object) null, (Object) null) && this.f113134d.equals(lk1Var.f113134d) && w83.a(this.f113135e, lk1Var.f113135e) && this.f113136f.equals(lk1Var.f113136f) && w83.a(this.f113137g, lk1Var.f113137g);
    }

    public final int hashCode() {
        int iHashCode = this.f113131a.hashCode() * 31;
        String str = this.f113132b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ik1 ik1Var = this.f113133c;
        int iHashCode3 = (this.f113134d.hashCode() + ((iHashCode2 + (ik1Var == null ? 0 : ik1Var.hashCode())) * 961)) * 31;
        String str2 = this.f113135e;
        int iHashCode4 = (this.f113136f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f113137g;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }
}
