package com.apm.insight.nativecrash;

import com.apm.insight.l.j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f8010i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f8011j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f8012k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f8013l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f8014m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f8022h = new HashMap();

    public c(File file) {
        c(j.b(file));
    }

    public final String a() {
        return this.f8021g;
    }

    public final Map<String, String> b() {
        return this.f8022h;
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f8019e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f8020f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f8021g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public final void a(File file) {
        File fileB = j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(j.b(file));
    }

    public final void b(File file) {
        c(j.b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        if (r12 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        if (r12.contains("BuildId:") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        r12 = com.apm.insight.nativecrash.c.f8014m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a2, code lost:
    
        if (r12.find() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a4, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b6, code lost:
    
        if (r0.equals("data") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b8, code lost:
    
        r11.f8022h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.c(java.io.File):void");
    }
}
