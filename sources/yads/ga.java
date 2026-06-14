package yads;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ea2 f111122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f111123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f111124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f111125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f111127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f111128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ha f111129h;

    public ga(ea2 ea2Var, String str, List list) {
        ha haVar = ha.f111523d;
        ArrayList arrayList = new ArrayList();
        this.f111124c = arrayList;
        this.f111125d = new HashMap();
        this.f111122a = ea2Var;
        this.f111123b = null;
        this.f111126e = str;
        this.f111129h = haVar;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ab3 ab3Var = (ab3) it.next();
            this.f111125d.put(UUID.randomUUID().toString(), ab3Var);
        }
        this.f111128g = null;
        this.f111127f = null;
    }

    public final ha a() {
        return this.f111129h;
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.f111125d);
    }

    public final String c() {
        return this.f111126e;
    }

    public final WebView d() {
        return this.f111123b;
    }
}
