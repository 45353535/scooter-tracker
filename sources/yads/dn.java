package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Result;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dn f109983a = new dn();

    public static final byte[] a(String str) {
        Object objB;
        ByteArrayInputStream byteArrayInputStream;
        try {
            Result.Companion companion = Result.f93230c;
            if (str == null) {
                str = "";
            }
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArrC = uf.b.c(gZIPInputStream);
                uf.c.a(gZIPInputStream, null);
                uf.c.a(byteArrayInputStream, null);
                objB = Result.b(bArrC);
                if (Result.g(objB) != null) {
                    objB = new byte[0];
                }
                return (byte[]) objB;
            } finally {
            }
        } finally {
        }
    }

    public static final String b(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new String(a(str), Charsets.UTF_8));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            objB = "";
        }
        return (String) objB;
    }
}
