package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.D5;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class h01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f111420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f111423d;

    public h01(String str, boolean z10, cd0 cd0Var) {
        fi.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f111420a = cd0Var;
        this.f111421b = str;
        this.f111422c = z10;
        this.f111423d = new HashMap();
    }

    public final byte[] a(UUID uuid, gm0 gm0Var) throws tj1 {
        String str = gm0Var.f111276b;
        if (this.f111422c || TextUtils.isEmpty(str)) {
            str = this.f111421b;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            fi.a(uri, "The uri must be set.");
            throw new tj1(new h30(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, sk2.f115840h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = ar.f108755e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : ar.f108753c.equals(uuid) ? D5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f111423d) {
            map2.putAll(this.f111423d);
        }
        return a(this.f111420a, str, gm0Var.f111275a, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] a(b30 b30Var, String str, byte[] bArr, Map map) throws Throwable {
        Exception exc;
        Object obj;
        Map map2;
        List list;
        d13 d13Var = new d13(b30Var.a());
        Uri uri = Uri.parse(str);
        fi.a(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        h30 h30Var = new h30(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i10 = 0;
        h30 h30Var2 = h30Var;
        int i11 = 0;
        Object obj2 = h30Var;
        Object obj3 = str;
        while (true) {
            try {
                e30 e30Var = new e30(d13Var, h30Var2);
                try {
                    int i12 = w83.f117341a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i13 = e30Var.read(bArr2);
                        if (i13 != -1) {
                            byteArrayOutputStream.write(bArr2, i10, i13);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                w83.a((Closeable) e30Var);
                                return byteArray;
                            } catch (Exception e10) {
                                exc = e10;
                                obj = obj2;
                                Uri uri2 = d13Var.f109698c;
                                uri2.getClass();
                                throw new tj1(obj, uri2, d13Var.f109696a.c(), d13Var.f109697b, exc);
                            }
                        }
                        th = th;
                        w83.a((Closeable) e30Var);
                        throw th;
                    }
                } catch (d01 e11) {
                    try {
                        int i14 = e11.f109677e;
                        String str3 = ((i14 != 307 && i14 != 308) || i11 >= 5 || (map2 = e11.f109678f) == null || (list = (List) map2.get("Location")) == null || list.isEmpty()) ? null : (String) list.get(i10);
                        if (str3 != null) {
                            i11++;
                            long j10 = h30Var2.f111453b;
                            int i15 = h30Var2.f111454c;
                            byte[] bArr3 = h30Var2.f111455d;
                            Map map3 = h30Var2.f111456e;
                            long j11 = h30Var2.f111457f;
                            long j12 = h30Var2.f111458g;
                            String str4 = h30Var2.f111459h;
                            int i16 = h30Var2.f111460i;
                            Object obj4 = h30Var2.f111461j;
                            Uri uri3 = Uri.parse(str3);
                            obj3 = obj2;
                            String str5 = str2;
                            try {
                                fi.a(uri3, str5);
                                h30 h30Var3 = new h30(uri3, j10, i15, bArr3, map3, j11, j12, str4, i16, obj4);
                                try {
                                    w83.a((Closeable) e30Var);
                                    str2 = str5;
                                    h30Var2 = h30Var3;
                                    i10 = 0;
                                    obj2 = obj3;
                                    obj3 = obj3;
                                } catch (Exception e12) {
                                    e = e12;
                                    exc = e;
                                    obj = obj3;
                                    Uri uri22 = d13Var.f109698c;
                                    uri22.getClass();
                                    throw new tj1(obj, uri22, d13Var.f109696a.c(), d13Var.f109697b, exc);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            throw e11;
                        }
                        th = th2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    w83.a((Closeable) e30Var);
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                obj3 = obj2;
            }
        }
    }

    public final byte[] a(jm0 jm0Var) {
        return a(this.f111420a, jm0Var.f112385b + "&signedRequest=" + w83.a(jm0Var.f112384a), null, Collections.EMPTY_MAP);
    }
}
