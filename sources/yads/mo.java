package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113565d;

    public mo(int i10, int i11, String str, String str2) {
        this.f113562a = str;
        this.f113563b = str2;
        this.f113564c = i10;
        this.f113565d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo)) {
            return false;
        }
        mo moVar = (mo) obj;
        return this.f113564c == moVar.f113564c && this.f113565d == moVar.f113565d && y72.a(this.f113562a, moVar.f113562a) && y72.a(this.f113563b, moVar.f113563b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f113562a, this.f113563b, Integer.valueOf(this.f113564c), Integer.valueOf(this.f113565d)});
    }
}
