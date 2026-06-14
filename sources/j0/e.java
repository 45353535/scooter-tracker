package j0;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f85446c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f85447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f85448b;

    public e(String... strArr) {
        this.f85447a = Arrays.asList(strArr);
    }

    private boolean b() {
        return ((String) this.f85447a.get(r0.size() - 1)).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f85447a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f85447a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f85447a.size() - 1;
        String str2 = (String) this.f85447a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f85447a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES));
        }
        if (!z10 && ((String) this.f85447a.get(i10 + 1)).equals(str)) {
            return i10 == this.f85447a.size() + (-2) || (i10 == this.f85447a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f85447a.size() - 1) {
            return false;
        }
        return ((String) this.f85447a.get(i11)).equals(str);
    }

    public f d() {
        return this.f85448b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.f85447a.get(i10)).equals("**")) {
            return (i10 != this.f85447a.size() - 1 && ((String) this.f85447a.get(i10 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f85447a.equals(eVar.f85447a)) {
                return false;
            }
            f fVar = this.f85448b;
            f fVar2 = eVar.f85448b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f85447a.size()) {
            return false;
        }
        return ((String) this.f85447a.get(i10)).equals(str) || ((String) this.f85447a.get(i10)).equals("**") || ((String) this.f85447a.get(i10)).equals(ProxyConfig.MATCH_ALL_SCHEMES);
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f85447a.size() - 1 || ((String) this.f85447a.get(i10)).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f85447a.hashCode() * 31;
        f fVar = this.f85448b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f85448b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f85447a);
        sb2.append(",resolved=");
        sb2.append(this.f85448b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f85447a = new ArrayList(eVar.f85447a);
        this.f85448b = eVar.f85448b;
    }
}
