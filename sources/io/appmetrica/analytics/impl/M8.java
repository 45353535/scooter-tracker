package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class M8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kc f76120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kc f76121b;

    public M8() {
        this(new C4984b8(), new S9(), new C4975b());
    }

    public M8(C4984b8 c4984b8, S9 s92, C4975b c4975b) {
        Kc kc2 = new Kc(c4984b8);
        this.f76120a = kc2;
        kc2.a(N8.NONE, c4984b8);
        kc2.a(N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, s92);
        kc2.a(N8.AES_VALUE_ENCRYPTION, c4975b);
        this.f76121b = new Kc(c4984b8);
    }
}
