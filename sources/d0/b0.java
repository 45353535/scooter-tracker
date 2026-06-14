package d0;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f68318a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f68319b = new ArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f68320c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator f68321d = new a();

    class a implements Comparator {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair pair, Pair pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f10) {
        if (this.f68318a) {
            q0.k kVar = (q0.k) this.f68320c.get(str);
            if (kVar == null) {
                kVar = new q0.k();
                this.f68320c.put(str, kVar);
            }
            kVar.a(f10);
            if (str.equals("__container")) {
                Iterator it = this.f68319b.iterator();
                if (it.hasNext()) {
                    androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                    throw null;
                }
            }
        }
    }

    void b(boolean z10) {
        this.f68318a = z10;
    }
}
