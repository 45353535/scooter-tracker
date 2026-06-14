package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public sg.bigo.ads.core.f.a.a.a B;
    public List<sg.bigo.ads.core.c.a> C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f104262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public b f104263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f104264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public String f104265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public String f104266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    String f104267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f104268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f104269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f104270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f104271v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f104272w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f104273x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104250a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ArrayList<l> f104251b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ArrayList<c> f104252c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104253d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104255f = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104254e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ArrayList<j> f104256g = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104258i = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104257h = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104259j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104260k = new ArrayList<>();

    @NonNull
    private final ArrayList<n> D = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f104261l = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<n> f104274y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<n> f104275z = new ArrayList();
    public final List<a> A = new ArrayList();

    public final void a(@NonNull List<n> list) {
        this.f104250a.addAll(list);
    }

    public final void b(@NonNull List<n> list) {
        this.D.addAll(list);
    }

    public final void c(@NonNull List<n> list) {
        this.f104261l.addAll(list);
    }

    public final void d(@NonNull List<n> list) {
        this.f104253d.addAll(list);
    }

    public final void e(@NonNull List<n> list) {
        this.f104255f.addAll(list);
    }

    public final void f(@NonNull List<n> list) {
        this.f104254e.addAll(list);
    }

    public final void g(@NonNull List<j> list) {
        this.f104256g.addAll(list);
    }

    public final void h(@NonNull List<n> list) {
        this.f104258i.addAll(list);
    }

    public final void i(@NonNull List<n> list) {
        this.f104257h.addAll(list);
    }

    public final void j(@NonNull List<n> list) {
        this.f104259j.addAll(list);
    }

    public final void k(@NonNull List<l> list) {
        this.f104251b.addAll(list);
        Collections.sort(this.f104251b);
    }

    public final void l(@NonNull List<c> list) {
        this.f104252c.addAll(list);
        Collections.sort(this.f104252c);
    }
}
