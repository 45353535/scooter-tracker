package j$.util.stream;

import java.security.AccessController;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f85057a = ((Boolean) AccessController.doPrivileged(new j$.util.r0(2))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
