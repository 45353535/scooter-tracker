package de;

import android.util.Log;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f68660a;

    public a(String str) {
        this.f68660a = str;
    }

    private static String l(Throwable th2) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    @Override // de.c
    public void a(ce.b bVar) {
        o(6, null, null, bVar, null);
    }

    @Override // de.c
    public void b(Object obj, ce.b bVar) {
        o(5, obj, null, bVar, null);
    }

    @Override // de.c
    public void c(Throwable th2) {
        o(5, null, null, null, th2);
    }

    @Override // de.c
    public void d(Object obj, String str) {
        o(3, obj, str, null, null);
    }

    @Override // de.c
    public void e(Object obj, ce.b bVar) {
        o(3, obj, null, bVar, null);
    }

    @Override // de.c
    public void f(ce.b bVar) {
        o(3, null, null, bVar, null);
    }

    @Override // de.c
    public void g(ce.b bVar) {
        o(5, null, null, bVar, null);
    }

    @Override // de.c
    public void h(Object obj, ce.b bVar) {
        o(6, obj, null, bVar, null);
    }

    @Override // de.c
    public void i(String str) {
        o(5, null, str, null, null);
    }

    @Override // de.c
    public void j(Object obj, String str) {
        o(5, obj, str, null, null);
    }

    protected String k(Object obj, String str, ce.b bVar, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(C4240b4.j.f42672d);
            sb2.append(obj);
            sb2.append("] ");
        }
        if (str != null) {
            sb2.append(str);
        } else if (bVar != null) {
            sb2.append((String) bVar.get());
        }
        if (th2 != null) {
            if (sb2.length() != 0) {
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb2.append(l(th2));
        }
        return sb2.toString();
    }

    protected boolean m(int i10) {
        return true;
    }

    protected void n(int i10, String str) {
        if (str.length() <= 1000) {
            p(i10, this.f68660a, str);
            return;
        }
        int length = (str.length() + 999) / 1000;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1000;
            p(i10, this.f68660a, str.substring(i12, Math.min(str.length(), i13)));
            i11++;
            i12 = i13;
        }
    }

    protected void o(int i10, Object obj, String str, ce.b bVar, Throwable th2) {
        if (m(i10)) {
            n(i10, k(obj, str, bVar, th2));
        }
    }

    protected void p(int i10, String str, String str2) {
        Log.println(i10, str, str2);
    }

    @Override // de.c
    public void d(String str) {
        o(3, null, str, null, null);
    }

    @Override // de.c
    public void e(String str) {
        o(6, null, str, null, null);
    }

    @Override // de.c
    public void d(Object obj, Throwable th2) {
        o(5, obj, null, null, th2);
    }
}
