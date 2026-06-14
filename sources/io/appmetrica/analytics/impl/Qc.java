package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Qc {
    public abstract void a(int i10);

    public final synchronized void a(Context context) {
        try {
            int iB = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (iB != libraryApiLevel) {
                if (iB < libraryApiLevel) {
                    SparseArray sparseArrayC = c();
                    while (true) {
                        iB++;
                        if (iB > libraryApiLevel) {
                            break;
                        }
                        Pc pc2 = (Pc) sparseArrayC.get(iB);
                        if (pc2 != null) {
                            pc2.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
