package z9;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.ironsource.D5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import s9.g;
import s9.k;
import z9.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f119293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f119296d;

    public l0(String str, boolean z10, g.a aVar) {
        q9.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f119293a = aVar;
        this.f119294b = str;
        this.f119295c = z10;
        this.f119296d = new HashMap();
    }

    @Override // z9.n0
    public byte[] a(UUID uuid, e0.d dVar) {
        return a0.a(this.f119293a.createDataSource(), dVar.b() + "&signedRequest=" + q9.o0.H(dVar.a()), null, Collections.EMPTY_MAP);
    }

    @Override // z9.n0
    public byte[] b(UUID uuid, e0.a aVar) throws o0 {
        String strB = aVar.b();
        if (this.f119295c || TextUtils.isEmpty(strB)) {
            strB = this.f119294b;
        }
        if (TextUtils.isEmpty(strB)) {
            k.b bVar = new k.b();
            Uri uri = Uri.EMPTY;
            throw new o0(bVar.i(uri).a(), uri, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = n9.f.f95291e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : n9.f.f95289c.equals(uuid) ? D5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f119296d) {
            map.putAll(this.f119296d);
        }
        return a0.a(this.f119293a.createDataSource(), strB, aVar.a(), map);
    }

    public void c(String str, String str2) {
        q9.a.e(str);
        q9.a.e(str2);
        synchronized (this.f119296d) {
            this.f119296d.put(str, str2);
        }
    }
}
