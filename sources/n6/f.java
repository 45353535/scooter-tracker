package n6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f95118a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95119b = null;

    public void a(String str, String str2) {
        this.f95118a.put(str, str2);
    }

    public String b() {
        return this.f95119b;
    }

    public Map c() {
        return this.f95118a;
    }

    public void d(String str) {
        this.f95119b = str;
    }
}
