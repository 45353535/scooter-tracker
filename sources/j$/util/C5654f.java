package j$.util;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5654f extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C5654f("Unsupported " + str + " :" + serializable);
    }
}
