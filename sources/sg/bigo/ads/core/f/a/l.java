package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends n implements Comparable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f104242a;

    public l(@NonNull String str, float f10) {
        super(str);
        this.f104242a = f10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull l lVar) {
        return Double.compare(this.f104242a, lVar.f104242a);
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        return "{\"Content\":\"" + this.f104245b + "\",\"progress\":\"" + this.f104242a + "\"}";
    }
}
