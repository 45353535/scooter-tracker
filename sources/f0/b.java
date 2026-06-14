package f0;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f69212a = new ArrayList();

    void a(u uVar) {
        this.f69212a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f69212a.size() - 1; size >= 0; size--) {
            q0.p.b(path, (u) this.f69212a.get(size));
        }
    }
}
