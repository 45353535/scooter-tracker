package f1;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f70433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f70434b;

    public m(Context context, AtomicReference atomicReference) {
        d0 d0Var = new d0(context.getCacheDir());
        this.f70434b = d0Var;
        this.f70433a = atomicReference;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((ga) atomicReference.get()).f69912p);
            File file = new File(d0Var.f69554a, "templates");
            if (file.exists()) {
                e(file.listFiles(), jCurrentTimeMillis);
                d(d0Var);
            }
        } catch (Exception e10) {
            eg.i("Exception while cleaning up templates directory at " + this.f70434b.f69559f.getPath(), e10);
            e10.printStackTrace();
        }
    }

    public d0 a() {
        return this.f70434b;
    }

    public File b(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    public Boolean c(dg dgVar) {
        Map mapI = dgVar.i();
        d0 d0VarA = a();
        if (d0VarA == null) {
            return Boolean.FALSE;
        }
        File file = d0VarA.f69554a;
        for (f9 f9Var : mapI.values()) {
            File fileA = f9Var.a(file);
            if (fileA == null) {
                return Boolean.FALSE;
            }
            if (!fileA.exists()) {
                eg.i("Asset does not exist: " + f9Var.f69808b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final void d(d0 d0Var) {
        File file = new File(d0Var.f69554a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        eg.i("Unable to delete " + file.getPath(), null);
    }

    public final void e(File[] fileArr, long j10) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    j(file.listFiles(), j10);
                    f(file.listFiles(), file);
                }
            }
        }
    }

    public final void f(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        eg.i("Unable to delete " + file.getPath(), null);
    }

    public boolean g(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h(java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L21
            boolean r2 = r7.isDirectory()     // Catch: java.lang.Exception -> L1e
            if (r2 == 0) goto L21
            java.io.File[] r7 = r7.listFiles()     // Catch: java.lang.Exception -> L1e
            if (r7 == 0) goto L3d
            int r2 = r7.length     // Catch: java.lang.Exception -> L1e
            r3 = 0
        L12:
            if (r3 >= r2) goto L20
            r4 = r7[r3]     // Catch: java.lang.Exception -> L1e
            long r4 = r6.h(r4)     // Catch: java.lang.Exception -> L1e
            long r0 = r0 + r4
            int r3 = r3 + 1
            goto L12
        L1e:
            r7 = move-exception
            goto L28
        L20:
            return r0
        L21:
            if (r7 == 0) goto L3d
            long r0 = r7.length()     // Catch: java.lang.Exception -> L1e
            return r0
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getFolderSize: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r2 = 0
            f1.eg.i(r7, r2)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.m.h(java.io.File):long");
    }

    public File i() {
        return this.f70434b.f69561h;
    }

    public final void j(File[] fileArr, long j10) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j10 && !file.delete()) {
                    eg.i("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    public boolean k(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public File[] l() {
        File fileI = i();
        if (fileI != null) {
            return fileI.listFiles();
        }
        return null;
    }

    public File m() {
        return this.f70434b.f69562i;
    }

    public void n(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                int i10 = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(i10);
                randomAccessFile.close();
            } finally {
            }
        } catch (FileNotFoundException e10) {
            eg.i("File not found when attempting to touch", e10);
        } catch (IOException e11) {
            eg.i("IOException when attempting to touch file", e11);
        }
    }

    public JSONObject o() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().f69554a;
            for (String str : ((ga) this.f70433a.get()).f69913q) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    bb.d(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e10) {
            eg.i("getWebViewCacheAssets: " + e10, null);
        }
        return jSONObject;
    }
}
