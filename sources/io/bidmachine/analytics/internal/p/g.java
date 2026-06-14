package io.bidmachine.analytics.internal.p;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f79727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuffer f79728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f79729c;

    public g(int i10, int i11) {
        this.f79727a = i11;
        this.f79728b = new StringBuffer(i10);
    }

    public final Long a() {
        return this.f79729c;
    }

    public String toString() {
        return this.f79728b.toString();
    }

    public final void a(String str) throws IOException {
        if (this.f79728b.length() + str.length() < this.f79727a) {
            this.f79728b.append((CharSequence) str).append('\n');
            this.f79729c = Long.valueOf(System.currentTimeMillis());
        }
    }
}
