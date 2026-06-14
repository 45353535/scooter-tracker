package yads;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.ironsource.Fb;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn f114723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq f114724b;

    public po(l01 l01Var, xq xqVar) {
        this.f114723a = l01Var;
        this.f114724b = xqVar;
    }

    public final r62 a(km2 km2Var) throws oj3 {
        byte[] bArr;
        c72 c72Var;
        c72 c72Var2;
        int i10;
        Map map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            j01 j01Var = null;
            try {
                cr crVar = km2Var.f112776p;
                if (crVar == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str = crVar.f109524b;
                    if (str != null) {
                        map2.put(HttpHeaders.IF_NONE_MATCH, str);
                    }
                    long j10 = crVar.f109526d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map2.put(HttpHeaders.IF_MODIFIED_SINCE, simpleDateFormat.format(new Date(j10)));
                    }
                    map = map2;
                }
                j01 j01VarA = this.f114723a.a(km2Var, map);
                try {
                    int i11 = j01VarA.f112208a;
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(j01VarA.f112209b);
                    if (i11 == 304) {
                        return d72.a(km2Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listUnmodifiableList);
                    }
                    InputStream byteArrayInputStream = j01VarA.f112211d;
                    if (byteArrayInputStream == null) {
                        byteArrayInputStream = j01VarA.f112212e != null ? new ByteArrayInputStream(j01VarA.f112212e) : null;
                    }
                    byte[] bArrA = byteArrayInputStream != null ? d72.a(byteArrayInputStream, j01VarA.f112210c, this.f114724b) : new byte[0];
                    try {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (rj3.f115467a || jElapsedRealtime2 > 3000) {
                            int i12 = km2Var.f112775o.f118625b;
                            boolean z10 = lb1.f113032a;
                        }
                        if (i11 < 200 || i11 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new r62(i11, bArrA, r62.a(listUnmodifiableList), listUnmodifiableList, false);
                    } catch (IOException e10) {
                        e = e10;
                        j01Var = j01VarA;
                        bArr = bArrA;
                        if (e instanceof SocketTimeoutException) {
                            c72Var = new c72("socket", new i43());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + km2Var.g(), e);
                            }
                            if (j01Var != null) {
                                int i13 = j01Var.f112208a;
                                km2Var.g();
                                boolean z11 = rj3.f115467a;
                                boolean z12 = lb1.f113032a;
                                if (bArr != null) {
                                    List listUnmodifiableList2 = DesugarCollections.unmodifiableList(j01Var.f112209b);
                                    SystemClock.elapsedRealtime();
                                    r62 r62Var = new r62(i13, bArr, r62.a(listUnmodifiableList2), listUnmodifiableList2, false);
                                    if (i13 == 401 || i13 == 403) {
                                        c72Var = new c72("auth", new hl(r62Var));
                                    } else {
                                        if (i13 >= 400 && i13 <= 499) {
                                            throw new yu(r62Var);
                                        }
                                        if (i13 < 500 || i13 > 599 || !km2Var.f112773m) {
                                            throw new fv2(r62Var);
                                        }
                                        c72Var = new c72(Fb.f40907a, new fv2(r62Var));
                                    }
                                } else {
                                    c72Var = new c72("network", new o62());
                                }
                            } else {
                                if (!km2Var.f112774n) {
                                    throw new o72(e);
                                }
                                c72Var = new c72("connection", new o72());
                            }
                        }
                        c72Var2 = c72Var;
                        zd0 zd0Var = km2Var.f112775o;
                        i10 = zd0Var.f118624a;
                        try {
                            oj3 oj3Var = c72Var2.f109270b;
                            int i14 = zd0Var.f118625b + 1;
                            zd0Var.f118625b = i14;
                            zd0Var.f118624a = ((int) (i10 * zd0Var.f118627d)) + i10;
                            if (i14 > zd0Var.f118626c) {
                                throw oj3Var;
                            }
                            km2Var.a(c72Var2.f109269a + "-retry [timeout=" + i10 + C4240b4.j.f42674e);
                        } catch (oj3 e11) {
                            km2Var.a(c72Var2.f109269a + "-timeout-giveup [timeout=" + i10 + C4240b4.j.f42674e);
                            throw e11;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    bArr = null;
                    j01Var = j01VarA;
                }
            } catch (IOException e13) {
                e = e13;
                bArr = null;
            }
            km2Var.a(c72Var2.f109269a + "-retry [timeout=" + i10 + C4240b4.j.f42674e);
        }
    }
}
