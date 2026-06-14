package vd;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106491b;

    public c(int i10) {
        super("Server returned " + i10 + " code");
        this.f106491b = i10;
    }
}
