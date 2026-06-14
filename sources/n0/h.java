package n0;

import android.content.Context;
import android.util.Pair;
import com.ironsource.D5;
import d0.i;
import d0.q;
import d0.z;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f95024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f95025b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95026a;

        static {
            int[] iArr = new int[c.values().length];
            f95026a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95026a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f95024a = gVar;
        this.f95025b = fVar;
    }

    private i a(Context context, String str, String str2) {
        g gVar;
        Pair pairA;
        z zVarB;
        if (str2 == null || (gVar = this.f95024a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i10 = a.f95026a[cVar.ordinal()];
        if (i10 == 1) {
            zVarB = q.B(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            zVarB = q.p(inputStream, str2);
        } else {
            try {
                zVarB = q.p(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                zVarB = new z((Throwable) e10);
            }
        }
        if (zVarB.b() != null) {
            return (i) zVarB.b();
        }
        return null;
    }

    private z b(Context context, String str, String str2) {
        q0.g.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f95025b.a(str);
                if (!dVarA.isSuccessful()) {
                    z zVar = new z((Throwable) new IllegalArgumentException(dVarA.I()));
                    try {
                        dVarA.close();
                        return zVar;
                    } catch (IOException e10) {
                        q0.g.d("LottieFetchResult close failed ", e10);
                        return zVar;
                    }
                }
                z zVarE = e(context, str, dVarA.Z(), dVarA.Y(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(zVarE.b() != null);
                q0.g.a(sb2.toString());
                try {
                    dVarA.close();
                    return zVarE;
                } catch (IOException e11) {
                    q0.g.d("LottieFetchResult close failed ", e11);
                    return zVarE;
                }
            } catch (Exception e12) {
                z zVar2 = new z((Throwable) e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        q0.g.d("LottieFetchResult close failed ", e13);
                    }
                }
                return zVar2;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e14) {
                q0.g.d("LottieFetchResult close failed ", e14);
                throw th2;
            }
        }
    }

    private z d(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f95024a) == null) ? q.p(new GZIPInputStream(inputStream), null) : q.p(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    private z e(Context context, String str, InputStream inputStream, String str2, String str3) {
        z zVarG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = D5.L;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            q0.g.a("Handling zip response.");
            c cVar2 = c.ZIP;
            zVarG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            q0.g.a("Handling gzip response.");
            cVar = c.GZIP;
            zVarG = d(str, inputStream, str3);
        } else {
            q0.g.a("Received json response.");
            cVar = c.JSON;
            zVarG = f(str, inputStream, str3);
        }
        if (str3 != null && zVarG.b() != null && (gVar = this.f95024a) != null) {
            gVar.f(str, cVar);
        }
        return zVarG;
    }

    private z f(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f95024a) == null) ? q.p(inputStream, null) : q.p(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private z g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f95024a) == null) ? q.B(context, new ZipInputStream(inputStream), null) : q.B(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    public z c(Context context, String str, String str2) {
        i iVarA = a(context, str, str2);
        if (iVarA != null) {
            return new z(iVarA);
        }
        q0.g.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
