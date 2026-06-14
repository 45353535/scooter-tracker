package com.applovin.impl;

import androidx.core.util.Consumer;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.sdk.AppLovinErrorCodes;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f10201e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f10203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f10204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f10205d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f10207b;

        public long a() {
            return this.f10206a;
        }

        public long b() {
            return this.f10207b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f10206a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f10207b = j10;
        }
    }

    private class c implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f10209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f10211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f10212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f10213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f10214g;

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x004d: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:78), block:B:29:0x004c */
        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i10;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.f10214g.a(this.f10208a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f10213f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    q0.this.a(this.f10210c, this.f10208a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.f10212e || u4.b(bArrD) != u4.a.V2)) {
                                        q0.this.f10202a.t().a(bArrD != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f10208a, this.f10209b.b() != null ? this.f10209b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.f10214g.a(this.f10208a, this.f10211d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f10213f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f10209b.r()) {
                                            q0.this.f10205d = new d(this.f10209b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f10212e) {
                                        String strB = u4.b(bArrD, q0.this.f10202a.i0(), q0.this.f10202a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put("request", StringUtils.getHostAndPath(this.f10208a));
                                            map.put("response", str);
                                            q0.this.f10202a.F().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.f10214g.a(this.f10208a, q0.this.a(str, this.f10211d), iC);
                                        return;
                                    } catch (Throwable th2) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f10208a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                                        com.applovin.impl.sdk.o unused = q0.this.f10203b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            q0.this.f10203b.a("ConnectionManager", str2, th2);
                                        }
                                        q0.this.f10202a.D().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f10208a)));
                                        this.f10214g.a(this.f10208a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e10) {
                                    e = e10;
                                }
                            } catch (MalformedURLException e11) {
                                malformedURLException = e11;
                                iC = i10;
                            }
                        } else {
                            try {
                                q0.this.a(this.f10210c, this.f10208a, iC, jE, (Throwable) null);
                                this.f10214g.a(this.f10208a, iC, null, null);
                                return;
                            } catch (MalformedURLException e12) {
                                e = e12;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e13) {
                        e = e13;
                    }
                    malformedURLException = e;
                } catch (Throwable th3) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f10212e) {
                                str3 = u4.b(bArrF, q0.this.f10202a.i0(), q0.this.f10202a);
                            }
                            objA = q0.this.a(str3, this.f10211d);
                        }
                    } catch (Throwable unused2) {
                    }
                    q0.this.a(this.f10210c, this.f10208a, iB, jE, th3);
                    this.f10214g.a(this.f10208a, iB, th3.getMessage(), objA);
                    return;
                }
            } catch (MalformedURLException e14) {
                malformedURLException = e14;
                iC = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f10211d != null) {
                q0.this.a(this.f10210c, this.f10208a, iC, jE, malformedURLException2);
                this.f10214g.a(this.f10208a, -901, malformedURLException2.getMessage(), null);
            } else {
                q0.this.a(this.f10210c, this.f10208a, iC, jE);
                this.f10214g.a(this.f10208a, this.f10211d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f10208a = str;
            this.f10209b = aVar;
            this.f10210c = str2;
            this.f10211d = obj;
            this.f10212e = z10;
            this.f10213f = bVar;
            this.f10214g = eVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f10216a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f10218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f10219d;

        public d(String str, long j10, long j11) {
            this.f10217b = str;
            this.f10218c = j10;
            this.f10219d = j11;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f10218c;
        }

        public long c() {
            return this.f10216a;
        }

        public String d() {
            return this.f10217b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f10219d;
        }
    }

    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.f10202a = kVar;
        this.f10203b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f10204c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217 A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:40:0x0106, B:44:0x0132, B:43:0x012e, B:51:0x016c, B:53:0x0184, B:59:0x01a6, B:74:0x01fd, B:77:0x020c, B:79:0x0217, B:61:0x01aa, B:64:0x01b2, B:69:0x01c9, B:71:0x01cf, B:72:0x01e9, B:55:0x0193, B:82:0x0220, B:66:0x01c3), top: B:107:0x0106, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r20, com.applovin.impl.q0.b r21, com.applovin.impl.q0.e r22) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    public d a() {
        return this.f10205d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.f10202a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f10203b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10203b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f10202a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f10203b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + r0.g(this.f10202a) + " to " + a(str2), th2);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
