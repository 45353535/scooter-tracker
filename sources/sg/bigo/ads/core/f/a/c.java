package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends n implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104211a;

    public c(@NonNull String str, int i10) {
        super(str);
        this.f104211a = i10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull c cVar) {
        return this.f104211a - cVar.f104211a;
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        return "{\"Content\":\"" + this.f104245b + "\",\"pro_ms\":\"" + this.f104211a + "\"}";
    }
}
