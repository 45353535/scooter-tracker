package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f119428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119429c;

    public h(char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f119428b = buffer;
        this.f119429c = buffer.length;
    }

    public char a(int i10) {
        return this.f119428b[i10];
    }

    public final char[] b() {
        return this.f119428b;
    }

    public int c() {
        return this.f119429c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public void d(int i10) {
        this.f119429c = i10;
    }

    public final String e(int i10, int i11) {
        return StringsKt.C(this.f119428b, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f119428b.length, i10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return StringsKt.C(this.f119428b, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}
