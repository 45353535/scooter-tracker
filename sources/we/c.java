package we;

import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import xe.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xe.d f107920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f107923d;

    public c(xe.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f107920a = builder;
        this.f107923d = (b) d.f107925b.h0();
    }

    private final boolean b(CharSequence charSequence, int i10) {
        return i.e(this.f107920a, this.f107923d.c(i10 + 1), this.f107923d.c(i10 + 2), charSequence);
    }

    private final void g() {
        int i10 = this.f107921b;
        b bVar = this.f107923d;
        this.f107921b = 0;
        this.f107922c = (this.f107922c * 2) | 128;
        b bVar2 = (b) d.f107925b.h0();
        bVar2.e((bVar.b() * 2) | 1);
        this.f107923d = bVar2;
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            e(bVar.c(iIntValue + 1), bVar.c(iIntValue + 2), bVar.c(iIntValue + 3), bVar.c(iIntValue + 4));
        }
        d.f107925b.O(bVar);
        if (i10 != this.f107921b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final boolean h() {
        return ((double) this.f107921b) >= ((double) this.f107922c) * 0.75d;
    }

    public final CharSequence a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f107921b == 0) {
            return null;
        }
        int iAbs = Math.abs(i.g(name, 0, 0, 3, null));
        int i10 = this.f107922c;
        while (true) {
            int i11 = iAbs % i10;
            int i12 = i11 * 6;
            if (this.f107923d.c(i12) == -1) {
                return null;
            }
            if (b(name, i12)) {
                return i(i12);
            }
            iAbs = i11 + 1;
            i10 = this.f107922c;
        }
    }

    public final CharSequence c(int i10) {
        return this.f107920a.subSequence(this.f107923d.c(i10 + 1), this.f107923d.c(i10 + 2));
    }

    public final Sequence d() {
        return this.f107923d.d();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        int i14;
        if (h()) {
            g();
        }
        int iAbs = Math.abs(i.f(this.f107920a, i10, i11));
        CharSequence charSequenceSubSequence = this.f107920a.subSequence(i10, i11);
        int i15 = iAbs % this.f107922c;
        int i16 = -1;
        while (true) {
            i14 = i15 * 6;
            if (this.f107923d.c(i14) == -1) {
                break;
            }
            if (b(charSequenceSubSequence, i14)) {
                i16 = i15;
            }
            i15 = (i15 + 1) % this.f107922c;
        }
        this.f107923d.g(i14, iAbs);
        this.f107923d.g(i14 + 1, i10);
        this.f107923d.g(i14 + 2, i11);
        this.f107923d.g(i14 + 3, i12);
        this.f107923d.g(i14 + 4, i13);
        this.f107923d.g(i14 + 5, -1);
        if (i16 != -1) {
            this.f107923d.g((i16 * 6) + 5, i15);
        }
        this.f107921b++;
    }

    public final void f() {
        this.f107921b = 0;
        this.f107922c = 0;
        d.f107925b.O(this.f107923d);
        this.f107923d = (b) d.f107925b.h0();
    }

    public final CharSequence i(int i10) {
        return this.f107920a.subSequence(this.f107923d.c(i10 + 3), this.f107923d.c(i10 + 4));
    }

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        d.c(this, "", sb2);
        return sb2.toString();
    }
}
