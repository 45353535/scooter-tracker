package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f48654c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f48655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f48656b = new ArrayList<>();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f48657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f48658b;

        public a(c cVar, File file) {
            this.f48658b = cVar;
            this.f48657a = file;
        }
    }

    private e(b bVar) {
        this.f48655a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f48656b == null || b().f48656b.isEmpty()) {
                return null;
            }
            for (a aVar : b().f48656b) {
                if (aVar.f48658b.equals(cVar)) {
                    return aVar.f48657a;
                }
            }
            return null;
        } catch (Throwable th2) {
            q0.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f48654c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48654c;
    }

    public static synchronized void a(b bVar) {
        if (f48654c == null) {
            f48654c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f48655a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f48656b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
