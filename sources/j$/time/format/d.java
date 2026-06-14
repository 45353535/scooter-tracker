package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f84618a;

    public d(char c10) {
        this.f84618a = c10;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb2) {
        sb2.append(this.f84618a);
        return true;
    }

    public final String toString() {
        char c10 = this.f84618a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
