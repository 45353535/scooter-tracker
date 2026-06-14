package sg.bigo.ads.common.h.b;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static sg.bigo.ads.common.h.a a(String str) {
        a aVarC = i.c(str);
        if (aVarC != null) {
            return aVarC.f102501b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(T t10) {
        if (t10 == 0) {
            return;
        }
        if (t10.getClass() == String.class) {
            i.a((String) t10);
        } else {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument is only String or List ");
        }
    }

    public static void a() {
        Iterator<a> it = i.b().iterator();
        while (it.hasNext()) {
            i.a(it.next());
        }
        i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Context context, T t10) {
        if (t10 == 0) {
            return;
        }
        if (t10.getClass() == sg.bigo.ads.common.h.a.class) {
            a(context, (sg.bigo.ads.common.h.a) t10);
            return;
        }
        if (!(t10 instanceof List)) {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument is only Downloader or List ");
            return;
        }
        List list = (List) t10;
        if (list.size() <= 0 || list.get(0).getClass() != sg.bigo.ads.common.h.a.class) {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument of collect is only Downloader");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(context, (sg.bigo.ads.common.h.a) it.next());
        }
    }

    private static void a(Context context, sg.bigo.ads.common.h.a aVar) {
        a aVarC = i.c(aVar.f102457a);
        if (aVarC != null) {
            if (aVarC.f102501b.equals(aVar)) {
                aVarC.b(aVar.f102463g);
                aVarC.a(aVar.f102465i);
                aVarC.f102504e = h.f102515a;
                f.a().a(aVar.f102457a);
                return;
            }
            a(aVar.f102457a);
        }
        a aVar2 = new a(aVar);
        aVar2.f102502c = new d(context, aVar2);
        aVar2.f102504e = h.f102515a;
        i.b(aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(T t10) {
        if (t10 == 0) {
            return;
        }
        if (t10.getClass() == String.class) {
            i.b((String) t10);
        } else {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument is only String or List ");
        }
    }

    public static void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        f fVarA = f.a();
        if (!fVarA.f102512a.containsKey(str) || (copyOnWriteArrayList = fVarA.f102512a.get(str)) == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.contains(eVar)) {
            return;
        }
        copyOnWriteArrayList.add(eVar);
        fVarA.f102512a.put(str, copyOnWriteArrayList);
    }

    public static void a(boolean z10) {
        g.a(z10);
    }
}
