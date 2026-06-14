package sg.bigo.ads.common.h.b;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f102507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f102508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f102509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f102510d;

    public d(Context context, a aVar) {
        this.f102510d = context;
        this.f102507a = aVar;
        sg.bigo.ads.common.h.a aVar2 = aVar.f102501b;
        this.f102509c = new File(aVar2.f102459c, sg.bigo.ads.common.utils.f.c(aVar2.f102460d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r14 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r20.f102509c.length() != r14) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r20.f102507a.f102504e != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r0 = r20.f102509c;
        r10 = r20.f102507a.f102501b;
        r0.renameTo(new java.io.File(r10.f102459c, r10.f102460d));
        r20.f102507a.f102504e = sg.bigo.ads.common.h.b.h.f102520f;
        r9 = true;
        sg.bigo.ads.common.h.b.f.a().a(r20.f102507a.f102500a);
        a("download is over.");
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.d.a():void");
    }

    private void b(String str) {
        sg.bigo.ads.common.t.a.a(0, IDownloadTask.TAG, str + " , " + this.f102507a.f102500a + " has a error ! " + this.f102507a.toString());
        a aVar = this.f102507a;
        aVar.f102505f = str;
        aVar.f102504e = h.f102521g;
        f.a().a(this.f102507a.f102500a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        if (sg.bigo.ads.common.utils.f.c(r8.f102509c) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        b("Failed to create temp file.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
    
        r8.f102507a.f102504e = sg.bigo.ads.common.h.b.h.f102517c;
        sg.bigo.ads.common.h.b.f.a().a(r8.f102507a.f102500a);
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.d.run():void");
    }

    private void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, str + ",taskId=" + this.f102507a.f102500a + ", downloadinfo = " + this.f102507a.toString());
    }
}
