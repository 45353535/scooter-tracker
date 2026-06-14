package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f15824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Long f15825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f15826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f15827f = new AtomicBoolean(false);

    a(String str, String str2) {
        this.f15822a = str;
        this.f15823b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f15826e != null) {
            return this.f15826e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f15826e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f15826e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f15826e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f15824c != null) {
            return this.f15824c;
        }
        if (this.f15825d != null && this.f15825d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15822a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        try {
            if (this.f15825d == null) {
                this.f15825d = g.a(new File(this.f15822a, str));
            }
            if (this.f15825d == null) {
                this.f15825d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f15822a, str2 + str + str2 + this.f15825d + str2 + "using.lock");
            this.f15824c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f15824c;
            bVarA.a();
            return file2;
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }

    final InputStream a(String str) throws Exception {
        return d(this.f15823b).a(a(this.f15823b, str));
    }

    final boolean b(String str) throws Exception {
        return d(this.f15823b).b(a(this.f15823b, str));
    }

    public final int c(String str) {
        try {
            File file = new File(e(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    final String b() {
        return this.f15823b;
    }

    final Long a() {
        return this.f15825d;
    }

    final void c() throws Exception {
        if (this.f15827f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15822a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f15823b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f15824c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f15824c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f15822a + str + this.f15823b);
        } finally {
            bVarA.a();
        }
    }
}
