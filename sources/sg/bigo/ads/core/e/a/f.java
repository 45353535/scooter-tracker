package sg.bigo.ads.core.e.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.core.e.b;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends sg.bigo.ads.common.g.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f104134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f104135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f104136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f104137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f104138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f104139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f104140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f104141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    final q f104142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f104143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f104147v;

    public f(@NonNull q qVar, Cursor cursor) {
        super(cursor);
        this.f104134i = 0;
        this.f104135j = 0L;
        this.f104136k = 0;
        this.f104137l = 0L;
        this.f104138m = 0;
        this.f104139n = 0L;
        this.f104140o = 0;
        this.f104141p = 0L;
        this.f104142q = qVar;
        this.f102451c = 1;
    }

    @SuppressLint({"ConcurrentModification"})
    final int b(Context context) {
        Iterator<e> it = this.f104145t.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "click_track", it.next());
        }
        return i10;
    }

    @SuppressLint({"ConcurrentModification"})
    final int c(Context context) {
        Iterator<e> it = this.f104146u.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "nurl_track", it.next());
        }
        return i10;
    }

    @SuppressLint({"ConcurrentModification"})
    final int d(Context context) {
        Iterator<e> it = this.f104147v.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "lurl_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String e() {
        if (this.f104147v == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f104147v.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f104125e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final long f() {
        return Math.max(Math.max(this.f104135j, this.f104137l), this.f102452d);
    }

    public final boolean g() {
        return a(this.f104144s) && a(this.f104145t) && a(this.f104146u) && a(this.f104147v);
    }

    public f(@NonNull q qVar, @NonNull Map<String, String> map) {
        super(map);
        this.f104134i = 0;
        this.f104135j = 0L;
        this.f104136k = 0;
        this.f104137l = 0L;
        this.f104138m = 0;
        this.f104139n = 0L;
        this.f104140o = 0;
        this.f104141p = 0L;
        this.f104142q = qVar;
        this.f102451c = 1;
    }

    @SuppressLint({"ConcurrentModification"})
    final void a(Context context) {
        Iterator<e> it = this.f104144s.iterator();
        while (it.hasNext()) {
            a(context, "impl_track", it.next());
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String b() {
        if (this.f104144s == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f104144s.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f104125e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String c() {
        if (this.f104145t == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f104145t.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f104125e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String d() {
        if (this.f104146u == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f104146u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f104125e);
        }
        return jSONArray.toString();
    }

    private void a(Context context, final String str, final e eVar) {
        String str2 = eVar.f104122b;
        if (eVar.b()) {
            if ("impl_track".equals(str)) {
                this.f104144s.remove(eVar);
                return;
            }
            if ("click_track".equals(str)) {
                this.f104145t.remove(eVar);
                return;
            } else if ("nurl_track".equals(str)) {
                this.f104146u.remove(eVar);
                return;
            } else {
                if ("lurl_track".equals(str)) {
                    this.f104147v.remove(eVar);
                    return;
                }
                return;
            }
        }
        int i10 = this.f104134i;
        if ("click_track".equals(str)) {
            i10 = this.f104136k;
        } else if ("nurl_track".equals(str)) {
            i10 = this.f104138m;
        } else if ("lurl_track".equals(str)) {
            i10 = this.f104140o;
        }
        int i11 = i10;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i12 = eVar.f104123c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i12, str, aVarD, str2, this.f104143r, this.f102450b, i11, this.f102456h, new b.a() { // from class: sg.bigo.ads.core.e.a.f.1
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                CopyOnWriteArrayList<e> copyOnWriteArrayList;
                if ("impl_track".equals(str)) {
                    copyOnWriteArrayList = f.this.f104144s;
                } else if ("click_track".equals(str)) {
                    copyOnWriteArrayList = f.this.f104145t;
                } else {
                    if (!"nurl_track".equals(str)) {
                        if ("lurl_track".equals(str)) {
                            copyOnWriteArrayList = f.this.f104147v;
                        }
                        d.a().b(f.this);
                    }
                    copyOnWriteArrayList = f.this.f104146u;
                }
                copyOnWriteArrayList.remove(eVar);
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i13) {
                return f.this.f104142q.a(i13);
            }
        });
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void b(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f104145t = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f104145t.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void c(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f104146u = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f104146u.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void d(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f104147v = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f104147v.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void a(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f104144s = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f104144s.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    final boolean a(int i10) {
        return this.f104142q.b(i10);
    }

    private static boolean a(List<e> list) {
        return list != null && list.size() == 0;
    }

    final boolean a(List<e> list, int i10) {
        return list == null || list.size() == 0 || !a(i10);
    }
}
