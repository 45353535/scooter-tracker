package j0;

import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f85454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f85455b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(Object obj, Object obj2) {
        this.f85454a = obj;
        this.f85455b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return a(pair.first, this.f85454a) && a(pair.second, this.f85455b);
    }

    public int hashCode() {
        Object obj = this.f85454a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f85455b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f85454a + " " + this.f85455b + "}";
    }
}
