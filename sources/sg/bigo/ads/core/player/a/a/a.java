package sg.bigo.ads.core.player.a.a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.core.d.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements sg.bigo.ads.core.player.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f104543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f104544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f104545c;

    public a(sg.bigo.ads.common.h.a aVar) {
        try {
            this.f104544b = aVar;
            File file = new File(aVar.a());
            this.f104543a = file;
            this.f104543a = file.exists() ? this.f104543a : new File(this.f104543a.getParentFile(), f.c(this.f104543a.getName()));
            this.f104545c = new RandomAccessFile(this.f104543a, "r");
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error using file " + this.f104543a + " as disc cache, error message is : " + e10.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized int a(byte[] bArr, long j10) {
        int i10;
        i10 = 0;
        try {
            this.f104545c.seek(j10);
            i10 = this.f104545c.read(bArr, 0, 8192);
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading 8192 bytes with offset " + j10 + " from file[" + a() + " bytes] to buffer[" + bArr.length + " bytes], error message is : " + e10.toString());
        }
        return i10;
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized void b() {
        try {
            this.f104545c.close();
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing file " + this.f104543a + ", error message is : " + e10.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized boolean c() {
        return this.f104544b.b();
    }

    @Override // sg.bigo.ads.core.player.a.a
    public final synchronized long a() {
        long length;
        try {
            length = this.f104545c.length();
        } catch (IOException e10) {
            b.a(3005, 10112, e10.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading length of file " + this.f104543a + ", error message is : " + e10.toString());
            length = 0;
        }
        return length;
    }
}
