package sg.bigo.ads.controller.e;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f103652b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, a> f103653a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103654c = false;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicInteger f103655a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f103656b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f103657c = new AtomicInteger(0);

        public a() {
        }
    }

    @NonNull
    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        a aVar = this.f103653a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f103653a.put(str, aVar2);
        return aVar2;
    }

    public static g a() {
        return f103652b;
    }

    public final void a(boolean z10) {
        this.f103654c = z10;
        if (z10) {
            Iterator<Map.Entry<String, a>> it = this.f103653a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    value.f103657c.set(0);
                }
            }
        }
    }
}
