package c9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static List f6615a = new b();

    public interface a {
        void a(String str);
    }

    class b extends ArrayList {
        b() {
            add(new d9.a());
        }
    }

    public static String a(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        Iterator it = f6615a.iterator();
        while (it.hasNext()) {
            str = ((d9.b) it.next()).a(str, bundle);
        }
        return str;
    }

    public static void b(List list, Bundle bundle, a aVar) {
        if (list == null || list.isEmpty() || aVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aVar.a(a((String) it.next(), bundle));
        }
    }
}
