package f1;

import com.ironsource.X1;
import f1.ga;
import j1.e;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6 f69881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f69882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9 f69883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s2 f69884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j3 f69885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f4 f69886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1 f69887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f69888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ga.b f69889i;

    public g0(c6 c6Var, b2 b2Var, q9 q9Var, s2 s2Var, j3 j3Var, f4 f4Var, j1 j1Var, String str) {
        this.f69881a = c6Var;
        this.f69882b = b2Var;
        this.f69883c = q9Var;
        this.f69884d = s2Var;
        this.f69885e = j3Var;
        this.f69886f = f4Var;
        this.f69887g = j1Var;
        this.f69888h = str;
    }

    public int a() {
        return g().equals(e.b.f85469e.g()) ? 1 : 0;
    }

    public j1.d b(String str) {
        b2 b2Var = this.f69882b;
        if (b2Var != null) {
            return b2Var.a(str);
        }
        return null;
    }

    public void c(ga.b bVar) {
        this.f69889i = bVar;
    }

    public void d(j1.d dVar) {
        c6 c6Var = this.f69881a;
        if (c6Var != null) {
            c6Var.a(dVar);
        }
    }

    public Integer e() {
        j1.b bVar = (j1.b) b("coppa");
        if (bVar != null) {
            return bVar.getConsent().booleanValue() ? 1 : 0;
        }
        return null;
    }

    public int f() {
        return !g().equals(X1.f42014f) ? 1 : 0;
    }

    public String g() {
        j1.d dVarA = this.f69882b.a("gdpr");
        return dVarA == null ? X1.f42014f : (String) dVarA.getConsent();
    }

    public JSONObject h() {
        List listI = i();
        s2 s2Var = this.f69884d;
        if (s2Var == null || listI == null) {
            return null;
        }
        return s2Var.a(listI);
    }

    public List i() {
        ga.b bVar;
        j3 j3Var = this.f69885e;
        if (j3Var == null || (bVar = this.f69889i) == null) {
            return null;
        }
        return j3Var.a(bVar);
    }

    public v0 j() {
        return new v0(Integer.valueOf(a()), i(), Integer.valueOf(f()), e(), h(), g(), this.f69886f.a(), this.f69887g.b(), this.f69887g.a());
    }
}
