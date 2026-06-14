package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84635a;

    public l(String str) {
        this.f84635a = str;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb2) {
        sb2.append(this.f84635a);
        return true;
    }

    public final String toString() {
        return "'" + this.f84635a.replace("'", "''") + "'";
    }
}
