package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class jx extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx f112490d;

    public jx(lx lxVar, int i10) {
        this.f112490d = lxVar;
        this.f112488b = lxVar.b(i10);
        this.f112489c = i10;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f112488b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map mapA = this.f112490d.a();
        if (mapA != null) {
            return mapA.get(this.f112488b);
        }
        int i10 = this.f112489c;
        if (i10 == -1 || i10 >= this.f112490d.size() || !y72.a(this.f112488b, this.f112490d.b(this.f112489c))) {
            this.f112489c = this.f112490d.a(this.f112488b);
        }
        int i11 = this.f112489c;
        if (i11 == -1) {
            return null;
        }
        return this.f112490d.c(i11);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapA = this.f112490d.a();
        if (mapA != null) {
            return mapA.put(this.f112488b, obj);
        }
        int i10 = this.f112489c;
        if (i10 == -1 || i10 >= this.f112490d.size() || !y72.a(this.f112488b, this.f112490d.b(this.f112489c))) {
            this.f112489c = this.f112490d.a(this.f112488b);
        }
        int i11 = this.f112489c;
        if (i11 == -1) {
            this.f112490d.put(this.f112488b, obj);
            return null;
        }
        Object objC = this.f112490d.c(i11);
        this.f112490d.a(this.f112489c, obj);
        return objC;
    }
}
