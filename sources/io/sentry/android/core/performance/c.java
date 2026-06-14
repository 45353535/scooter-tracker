package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f82702b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f82703c = new i();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f82702b.j(), cVar.f82702b.j());
        return iCompare == 0 ? Long.compare(this.f82703c.j(), cVar.f82703c.j()) : iCompare;
    }

    public final i c() {
        return this.f82702b;
    }

    public final i d() {
        return this.f82703c;
    }
}
