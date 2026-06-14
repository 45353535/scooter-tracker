package yads;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class x31 extends y31 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f117694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f117695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y31 f117696f;

    public x31(y31 y31Var, int i10, int i11) {
        this.f117696f = y31Var;
        this.f117694d = i10;
        this.f117695e = i11;
    }

    @Override // yads.y31, java.util.List
    /* JADX INFO: renamed from: a */
    public final y31 subList(int i10, int i11) {
        ie2.a(i10, i11, this.f117695e);
        y31 y31Var = this.f117696f;
        int i12 = this.f117694d;
        return y31Var.subList(i10 + i12, i11 + i12);
    }

    @Override // yads.s31
    public final Object[] b() {
        return this.f117696f.b();
    }

    @Override // yads.s31
    public final int c() {
        return this.f117696f.d() + this.f117694d + this.f117695e;
    }

    @Override // yads.s31
    public final int d() {
        return this.f117696f.d() + this.f117694d;
    }

    @Override // yads.s31
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ie2.a(i10, this.f117695e);
        return this.f117696f.get(i10 + this.f117694d);
    }

    @Override // yads.y31, yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.y31, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f117695e;
    }

    @Override // yads.y31, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
