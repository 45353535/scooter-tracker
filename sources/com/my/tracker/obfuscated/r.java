package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.s0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class r implements s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f61808a;

    public r(q qVar) {
        this.f61808a = qVar;
    }

    @Override // com.my.tracker.obfuscated.s0.a
    public String a() {
        return "application/octet-stream";
    }

    @Override // com.my.tracker.obfuscated.s0.a
    public void a(OutputStream outputStream) throws IOException {
        this.f61808a.a(outputStream);
    }
}
