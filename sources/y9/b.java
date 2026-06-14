package y9;

import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108404d;

    public b(String str, String str2, int i10, int i11) {
        this.f108401a = str;
        this.f108402b = str2;
        this.f108403c = i10;
        this.f108404d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f108403c == bVar.f108403c && this.f108404d == bVar.f108404d && Objects.equals(this.f108401a, bVar.f108401a) && Objects.equals(this.f108402b, bVar.f108402b);
    }

    public int hashCode() {
        return Objects.hash(this.f108401a, this.f108402b, Integer.valueOf(this.f108403c), Integer.valueOf(this.f108404d));
    }
}
