package f2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static List f71919a = new a();

    class a extends ArrayList {
        a() {
            add(new g2.b());
        }
    }

    public interface b {
        void a(String str);
    }

    public static String a(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        Iterator it = f71919a.iterator();
        while (it.hasNext()) {
            str = ((g2.a) it.next()).a(str, bundle);
        }
        return str;
    }

    public static void b(List list, Bundle bundle, b bVar) {
        if (list == null || list.isEmpty() || bVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bVar.a(a((String) it.next(), bundle));
        }
    }
}
