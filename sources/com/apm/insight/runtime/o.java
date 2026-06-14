package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f8123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f8124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f8125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f8126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f8127f = null;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f8131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f8132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f8133d;

        /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        static /* synthetic */ void d(a aVar) {
            aVar.f8132c.delete();
        }

        private a(File file) {
            this.f8133d = null;
            this.f8132c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f8130a = Long.parseLong(strArrSplit[0]);
                this.f8131b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f8130a = j10;
                this.f8131b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f8133d == null) {
                try {
                    this.f8133d = new JSONObject(com.apm.insight.l.f.a(this.f8132c.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX));
                } catch (Throwable unused) {
                }
                if (this.f8133d == null) {
                    this.f8133d = new JSONObject();
                }
            }
            return this.f8133d;
        }

        static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f8130a;
            if (j11 > j10 && j11 - j10 > 604800000) {
                return true;
            }
            long j12 = aVar.f8131b;
            if (j12 >= j10 || j10 - j12 <= 604800000) {
                return aVar.f8132c.lastModified() < j10 && j10 - aVar.f8132c.lastModified() > 604800000;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f8123b = fileC;
        this.f8124c = new File(fileC, "did");
        this.f8125d = new File(fileC, "device_uuid");
        this.f8126e = context;
    }

    public static o a() {
        if (f8122a == null) {
            f8122a = new o(com.apm.insight.e.g());
        }
        return f8122a;
    }

    protected final String b() {
        try {
            return com.apm.insight.l.f.a(this.f8124c.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f8125d.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f8123b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b10 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b10);
                    arrayList.add(aVar2);
                    if (this.f8127f == null && ".ctx".equals(str) && (aVar == null || aVar2.f8131b >= aVar.f8131b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    j.a(th2, "NPTH_CATCH");
                }
            }
            if (this.f8127f == null && aVar != null) {
                this.f8127f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r9, org.json.JSONArray r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f8126e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.a(r0)
            org.json.JSONObject r6 = r0.a(r9)
            boolean r9 = com.apm.insight.entity.Header.c(r6)
            if (r9 == 0) goto L13
            r1 = r8
            goto La9
        L13:
            long r2 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.o$a r9 = r8.f8127f
            if (r9 != 0) goto L20
            java.lang.String r9 = ".ctx"
            r8.c(r9)
        L20:
            com.apm.insight.runtime.o$a r9 = r8.f8127f
            if (r9 != 0) goto L2b
            r4 = r2
            r1 = r8
            r7 = r10
            r1.a(r2, r4, r6, r7)
            return
        L2b:
            r7 = r10
            org.json.JSONObject r10 = com.apm.insight.runtime.o.a.a(r9)
            boolean r0 = com.apm.insight.entity.Header.c(r10)
            r1 = 1
            r4 = 2
            if (r0 != 0) goto L60
            boolean r0 = com.apm.insight.entity.Header.c(r6)
            if (r0 == 0) goto L40
            r10 = 0
            goto L61
        L40:
            java.lang.String r0 = "update_version_code"
            java.lang.Object r5 = r6.opt(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r10.opt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L60
            boolean r10 = com.apm.insight.entity.Header.d(r10)
            if (r10 == 0) goto L60
            r10 = r1
            goto L61
        L60:
            r10 = r4
        L61:
            if (r10 == r1) goto L6d
            if (r10 == r4) goto L67
            r1 = r8
            goto L7e
        L67:
            r4 = r2
            r1 = r8
            r1.a(r2, r4, r6, r7)
            goto L7e
        L6d:
            r4 = r2
            long r2 = com.apm.insight.runtime.o.a.b(r9)
            r1 = r8
            r1.a(r2, r4, r6, r7)
            r2 = r4
            java.io.File r9 = com.apm.insight.runtime.o.a.c(r9)
            com.apm.insight.l.f.a(r9)
        L7e:
            java.lang.String r9 = ""
            java.util.ArrayList r9 = r8.c(r9)     // Catch: java.lang.Throwable -> La6
            int r10 = r9.size()     // Catch: java.lang.Throwable -> La6
            r0 = 6
            if (r10 > r0) goto L8c
            goto La9
        L8c:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> La6
        L90:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r10 == 0) goto La9
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> La6
            com.apm.insight.runtime.o$a r10 = (com.apm.insight.runtime.o.a) r10     // Catch: java.lang.Throwable -> La6
            boolean r0 = com.apm.insight.runtime.o.a.a(r10, r2)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L90
            com.apm.insight.runtime.o.a.d(r10)     // Catch: java.lang.Throwable -> La6
            goto L90
        La6:
            r0 = move-exception
            r9 = r0
            goto Laa
        La9:
            return
        Laa:
            com.apm.insight.c.a()
            java.lang.String r10 = "NPTH_CATCH"
            com.apm.insight.runtime.j.a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.a(java.util.Map, org.json.JSONArray):void");
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f8125d, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONArray b(long j10) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f8130a && j10 <= next.f8131b) {
                file = next.f8132c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".allData")) {
                if (aVar == null || Math.abs(aVar.f8131b - j10) > Math.abs(aVar2.f8131b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f8132c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
            try {
                return new JSONArray(strA);
            } catch (Throwable th3) {
                th = th3;
                com.apm.insight.c.a();
                j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                return null;
            }
        }
        return null;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f8123b, j10 + TokenBuilder.TOKEN_DELIMITER + j11 + ".ctx");
        File file2 = new File(this.f8123b, j10 + TokenBuilder.TOKEN_DELIMITER + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f8127f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            j.a(e10, "NPTH_CATCH");
        }
    }

    protected final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f8124c, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        boolean z10;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f8130a && j10 <= next.f8131b) {
                file = next.f8132c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".ctx")) {
                if (aVar == null || Math.abs(aVar.f8131b - j10) > Math.abs(aVar2.f8131b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f8132c;
            z10 = true;
        } else {
            z10 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
            try {
                jSONObject = new JSONObject(strA);
            } catch (Throwable th3) {
                th = th3;
                com.apm.insight.c.a();
                j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
            }
        }
        if (jSONObject != null && z10) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
