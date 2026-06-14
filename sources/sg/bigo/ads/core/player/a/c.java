package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    sg.bigo.ads.core.player.a.a.a f104551a;

    public c(sg.bigo.ads.common.h.a aVar) {
        this.f104586e = aVar;
        sg.bigo.ads.core.player.a.a.a aVar2 = new sg.bigo.ads.core.player.a.a.a(aVar);
        this.f104551a = aVar2;
        this.f104583b = aVar2;
    }

    static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    final void a(OutputStream outputStream, long j10) throws j, IOException {
        byte[] bArr = new byte[8192];
        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "responseWithCache start thread=" + Thread.currentThread().getName());
        while (true) {
            int iA = a(bArr, j10);
            if (iA == -1) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "responseWithCache end thread=" + Thread.currentThread().getName() + ",offset=" + j10);
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, iA);
            j10 += (long) iA;
        }
    }
}
