package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ba2 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f108950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108951c;

    public ba2(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f108950b = z10;
        this.f108951c = i10;
    }

    public static ba2 a(String str) {
        return new ba2(str, null, true, 1);
    }

    public static ba2 b(String str) {
        return new ba2(str, null, false, 1);
    }
}
