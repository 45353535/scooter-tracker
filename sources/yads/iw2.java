package yads;

import android.os.ConditionVariable;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class iw2 implements er {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f112166j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f112167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr f112168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cs f112169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nr f112170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f112171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f112172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f112174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public br f112175i;

    public iw2(File file, md1 md1Var, cs csVar, nr nrVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f112167a = file;
        this.f112168b = md1Var;
        this.f112169c = csVar;
        this.f112170d = nrVar;
        this.f112171e = new HashMap();
        this.f112172f = new Random();
        this.f112173g = true;
        this.f112174h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new hw2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final void a(kw2 kw2Var) {
        this.f112169c.a(kw2Var.f115131b).f118330c.add(kw2Var);
        ArrayList arrayList = (ArrayList) this.f112171e.get(kw2Var.f115131b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                md1 md1Var = (md1) ((lr) arrayList.get(size));
                md1Var.f113432b.add(kw2Var);
                md1Var.f113433c += kw2Var.f115133d;
                md1Var.a(this, 0L);
            }
        }
        md1 md1Var2 = (md1) this.f112168b;
        md1Var2.f113432b.add(kw2Var);
        md1Var2.f113433c += kw2Var.f115133d;
        md1Var2.a(this, 0L);
    }

    public final synchronized wb0 b(String str) {
        yr yrVar;
        try {
            yrVar = (yr) this.f112169c.f109547a.get(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return yrVar != null ? yrVar.f118332e : wb0.f117383c;
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            b((qr) it.next());
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(this.f112169c.f109547a.values()).iterator();
        while (it.hasNext()) {
            for (qr qrVar : ((yr) it.next()).f118330c) {
                if (qrVar.f115135f.length() != qrVar.f115133d) {
                    arrayList.add(qrVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b((qr) arrayList.get(i10));
        }
    }

    public final void b() {
        long j10;
        if (!this.f112167a.exists()) {
            try {
                a(this.f112167a);
            } catch (br e10) {
                this.f112175i = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f112167a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f112167a;
            uf1.b("SimpleCache", str);
            this.f112175i = new br(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                j10 = -1;
                break;
            }
            File file = fileArrListFiles[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    uf1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i10++;
        }
        this.f112174h = j10;
        if (j10 == -1) {
            try {
                this.f112174h = b(this.f112167a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f112167a;
                uf1.b("SimpleCache", uf1.a(str2, e11));
                this.f112175i = new br(str2, e11);
                return;
            }
        }
        try {
            this.f112169c.a(this.f112174h);
            nr nrVar = this.f112170d;
            if (nrVar != null) {
                nrVar.a(this.f112174h);
                HashMap mapA = this.f112170d.a();
                a(this.f112167a, true, fileArrListFiles, mapA);
                this.f112170d.a(mapA.keySet());
            } else {
                a(this.f112167a, true, fileArrListFiles, null);
            }
            cs csVar = this.f112169c;
            w73 it = d41.a(csVar.f109547a.keySet()).iterator();
            while (it.hasNext()) {
                csVar.b((String) it.next());
            }
            try {
                this.f112169c.a();
            } catch (Throwable th2) {
                uf1.b("SimpleCache", uf1.a("Storing index file failed", th2));
            }
        } catch (Throwable th3) {
            String str3 = "Failed to initialize cache indices: " + this.f112167a;
            uf1.b("SimpleCache", uf1.a(str3, th3));
            this.f112175i = new br(str3, th3);
        }
    }

    public static synchronized boolean c(File file) {
        return f112166j.add(file.getAbsoluteFile());
    }

    public final synchronized void a(String str, dz dzVar) {
        br brVar;
        a();
        cs csVar = this.f112169c;
        yr yrVarA = csVar.a(str);
        wb0 wb0Var = yrVarA.f118332e;
        wb0 wb0VarA = wb0Var.a(dzVar);
        yrVarA.f118332e = wb0VarA;
        if (!wb0VarA.equals(wb0Var)) {
            csVar.f109551e.a(yrVarA);
        }
        try {
            this.f112169c.a();
        } finally {
        }
    }

    public iw2(File file, md1 md1Var, fm0 fm0Var) {
        this(file, md1Var, new cs(fm0Var, file), new nr(fm0Var));
    }

    public final synchronized void a() {
        br brVar = this.f112175i;
        if (brVar != null) {
            throw brVar;
        }
    }

    public static void a(File file) throws br {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        uf1.b("SimpleCache", str);
        throw new br(str);
    }

    public final synchronized long a(String str, long j10, long j11) {
        yr yrVar;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        yrVar = (yr) this.f112169c.f109547a.get(str);
        return yrVar != null ? yrVar.a(j10, j11) : -j11;
    }

    public final synchronized TreeSet a(String str) {
        TreeSet treeSet;
        try {
            yr yrVar = (yr) this.f112169c.f109547a.get(str);
            if (yrVar != null && !yrVar.f118330c.isEmpty()) {
                treeSet = new TreeSet((Collection) yrVar.f118330c);
            } else {
                treeSet = new TreeSet();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return treeSet;
    }

    public final void b(qr qrVar) {
        yr yrVar = (yr) this.f112169c.f109547a.get(qrVar.f115131b);
        if (yrVar == null || !yrVar.f118330c.remove(qrVar)) {
            return;
        }
        File file = qrVar.f115135f;
        if (file != null) {
            file.delete();
        }
        if (this.f112170d != null) {
            String name = qrVar.f115135f.getName();
            try {
                nr nrVar = this.f112170d;
                nrVar.f114002b.getClass();
                try {
                    nrVar.f114001a.getWritableDatabase().delete(nrVar.f114002b, "name = ?", new String[]{name});
                } catch (Throwable th2) {
                    throw new i30(th2);
                }
            } catch (IOException unused) {
                bj1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f112169c.b(yrVar.f118329b);
        ArrayList arrayList = (ArrayList) this.f112171e.get(qrVar.f115131b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                md1 md1Var = (md1) ((lr) arrayList.get(size));
                md1Var.f113432b.remove(qrVar);
                md1Var.f113433c -= qrVar.f115133d;
            }
        }
        md1 md1Var2 = (md1) this.f112168b;
        md1Var2.f113432b.remove(qrVar);
        md1Var2.f113433c -= qrVar.f115133d;
    }

    public final void a(File file, boolean z10, File[] fileArr, HashMap map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                mr mrVar = map != null ? (mr) map.remove(name) : null;
                if (mrVar != null) {
                    j10 = mrVar.f113586a;
                    j11 = mrVar.f113587b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                kw2 kw2VarA = kw2.a(file2, j10, j11, this.f112169c);
                if (kw2VarA != null) {
                    a(kw2VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void a(qr qrVar) {
        cs csVar = this.f112169c;
        yr yrVar = (yr) csVar.f109547a.get(qrVar.f115131b);
        yrVar.getClass();
        long j10 = qrVar.f115132c;
        for (int i10 = 0; i10 < yrVar.f118331d.size(); i10++) {
            if (((xr) yrVar.f118331d.get(i10)).f117932a == j10) {
                yrVar.f118331d.remove(i10);
                this.f112169c.b(yrVar.f118329b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6 A[Catch: all -> 0x0025, TryCatch #1 {all -> 0x0025, IOException -> 0x0067, blocks: (B:4:0x0006, B:6:0x0015, B:16:0x0045, B:18:0x004a, B:21:0x0050, B:23:0x0063, B:27:0x0070, B:29:0x0082, B:31:0x0089, B:36:0x00e2, B:38:0x00e6, B:40:0x0108, B:42:0x010f, B:43:0x0135, B:47:0x0157, B:48:0x015c, B:34:0x00c5, B:49:0x015d, B:50:0x0162, B:25:0x0067, B:51:0x0163, B:52:0x016b, B:54:0x0173, B:56:0x0183, B:71:0x01a4, B:10:0x002c, B:12:0x0034, B:14:0x0040), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #1 {all -> 0x0025, IOException -> 0x0067, blocks: (B:4:0x0006, B:6:0x0015, B:16:0x0045, B:18:0x004a, B:21:0x0050, B:23:0x0063, B:27:0x0070, B:29:0x0082, B:31:0x0089, B:36:0x00e2, B:38:0x00e6, B:40:0x0108, B:42:0x010f, B:43:0x0135, B:47:0x0157, B:48:0x015c, B:34:0x00c5, B:49:0x015d, B:50:0x0162, B:25:0x0067, B:51:0x0163, B:52:0x016b, B:54:0x0173, B:56:0x0183, B:71:0x01a4, B:10:0x002c, B:12:0x0034, B:14:0x0040), top: B:78:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized yads.kw2 b(java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.iw2.b(java.lang.String, long, long):yads.kw2");
    }

    public static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }
}
