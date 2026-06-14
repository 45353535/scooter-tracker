package nf;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: nf.a$a, reason: collision with other inner class name */
    public static final class C1100a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f96112b;

        C1100a(Function0 function0) {
            this.f96112b = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f96112b.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C1100a c1100a = new C1100a(block);
        if (z11) {
            c1100a.setDaemon(true);
        }
        if (i10 > 0) {
            c1100a.setPriority(i10);
        }
        if (str != null) {
            c1100a.setName(str);
        }
        if (classLoader != null) {
            c1100a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c1100a.start();
        }
        return c1100a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z10, z11, classLoader, str2, i12, function0);
    }
}
