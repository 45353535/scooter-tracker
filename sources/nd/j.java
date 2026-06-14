package nd;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f95837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f95838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f95839c;

    public j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f95837a = jCurrentTimeMillis;
        this.f95838b = jCurrentTimeMillis;
    }

    public Map a() {
        return this.f95839c;
    }

    public long b() {
        return this.f95838b;
    }

    public long c() {
        return this.f95837a;
    }

    public void d(long j10) {
        this.f95838b = Math.max(j10, this.f95837a);
    }

    public j e(String str, Object obj) {
        if (this.f95839c == null) {
            this.f95839c = new HashMap();
        }
        this.f95839c.put(str, obj);
        return this;
    }
}
