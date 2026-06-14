package c9;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b9.u;
import c9.k;
import com.ironsource.C4274d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.processor.VastAd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f6554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastAd f6555d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f6557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private io.bidmachine.iab.vast.processor.b f6558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f6559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a9.c f6560i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Float f6562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f6564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6565n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6567p;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final k.a f6551z = new j();
    private static int A = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y8.a f6553b = y8.a.FullLoad;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f6556e = n.NonRewarded;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6561j = 3.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6566o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6568q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f6569r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f6570s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6571t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6572u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6573v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6574w = 5.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f6575x = new AtomicBoolean(false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f6576y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6552a = UUID.randomUUID().toString();

    public class a {
        public a() {
        }

        public g a() {
            return g.this;
        }

        public a b(boolean z10) {
            g.this.f6564m = z10;
            return this;
        }

        public a c(a9.c cVar) {
            g.this.f6560i = cVar;
            return this;
        }

        public a d(y8.a aVar) {
            g.this.f6553b = aVar;
            return this;
        }

        public a e(int i10) {
            g.this.f6563l = i10;
            return this;
        }

        public a f(float f10) {
            g.this.f6561j = f10;
            return this;
        }

        public a g(int i10) {
            g.this.f6562k = Float.valueOf(i10);
            return this;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6578a;

        static {
            int[] iArr = new int[y8.a.values().length];
            f6578a = iArr;
            try {
                iArr[y8.a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6578a[y8.a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6578a[y8.a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f6579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c9.h f6581d;

        c(Context context, String str, c9.h hVar) {
            this.f6579b = context;
            this.f6580c = str;
            this.f6581d = hVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.U(this.f6579b, this.f6580c, this.f6581d);
        }
    }

    class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f6583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c9.h f6584c;

        d(Context context, c9.h hVar) {
            this.f6583b = context;
            this.f6584c = hVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.i(this.f6583b, gVar.f6555d, this.f6584c);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c9.h f6586b;

        e(c9.h hVar) {
            this.f6586b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6586b.onVastLoaded(g.this);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y8.b f6588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c9.h f6589c;

        f(y8.b bVar, c9.h hVar) {
            this.f6588b = bVar;
            this.f6589c = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f6560i != null) {
                g.this.f6560i.y(this.f6588b);
            }
            if (this.f6589c != null) {
                if (g.this.f6553b != y8.a.PartialLoad || !g.this.f6575x.get() || g.this.f6576y.get()) {
                    this.f6589c.onVastLoadFailed(g.this, this.f6588b);
                    return;
                }
                c9.h hVar = this.f6589c;
                g gVar = g.this;
                hVar.onVastLoadFailed(gVar, y8.b.b(String.format("%s load failed after display - %s", gVar.f6553b, this.f6588b)));
            }
        }
    }

    /* JADX INFO: renamed from: c9.g$g, reason: collision with other inner class name */
    class RunnableC0146g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c9.b f6591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y8.b f6592c;

        RunnableC0146g(c9.b bVar, y8.b bVar2) {
            this.f6591b = bVar;
            this.f6592c = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c9.b bVar = this.f6591b;
            if (bVar != null) {
                bVar.onVastShowFailed(g.this, this.f6592c);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VastAd f6594b;

        h(VastAd vastAd) {
            this.f6594b = vastAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f6559h != null) {
                g.this.f6559h.b(g.this, this.f6594b);
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y8.b f6596b;

        i(y8.b bVar) {
            this.f6596b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f6559h != null) {
                g.this.f6559h.a(g.this, this.f6596b);
            }
        }
    }

    static class j implements k.a {
        j() {
        }

        @Override // c9.k.a
        public void a(String str) {
            c9.e.a("VastRequest", "Fire url: %s", str);
            u.G(str);
        }
    }

    static class k implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File f6599c;

        public k(File file) {
            this.f6599c = file;
            this.f6598b = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j10 = this.f6598b;
            long j11 = ((k) obj).f6598b;
            if (j10 > j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
    }

    private g() {
    }

    public static a V() {
        return new g().new a();
    }

    public static void Y(int i10) {
        if (i10 > 0) {
            A = i10;
        }
    }

    private Uri c(Context context, String str) throws IOException {
        String strS = s(context);
        if (strS == null) {
            throw new FileNotFoundException("No dir for caching file");
        }
        File file = new File(strS);
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = 230 - file.getPath().length();
        String str2 = C4274d4.D + System.currentTimeMillis();
        String strReplace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "");
        File file2 = new File(file, strReplace);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(file, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        long contentLength = httpURLConnection.getContentLength();
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
        fileOutputStream.close();
        if (contentLength != j10) {
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        file3.renameTo(new File(file, strReplace));
        return Uri.fromFile(new File(file, strReplace));
    }

    private Float f(VastAd vastAd, c9.c cVar) {
        Float fL = cVar != null ? cVar.l() : null;
        if (Q()) {
            fL = u.y(fL, N());
        }
        Float fZ = u.z(fL, vastAd.n());
        return fZ == null ? Float.valueOf(5.0f) : fZ;
    }

    private void h(Context context) {
        File[] fileArrListFiles;
        try {
            String strS = s(context);
            if (strS == null || (fileArrListFiles = new File(strS).listFiles()) == null || fileArrListFiles.length <= A) {
                return;
            }
            k[] kVarArr = new k[fileArrListFiles.length];
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                kVarArr[i10] = new k(fileArrListFiles[i10]);
            }
            Arrays.sort(kVarArr);
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                fileArrListFiles[i11] = kVarArr[i11].f6599c;
            }
            for (int i12 = A; i12 < fileArrListFiles.length; i12++) {
                if (!Uri.fromFile(fileArrListFiles[i12]).equals(this.f6554c)) {
                    fileArrListFiles[i12].delete();
                }
            }
        } catch (Exception e10) {
            c9.e.c("VastRequest", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context, VastAd vastAd, c9.h hVar) {
        try {
            Uri uriC = c(context, vastAd.q().O());
            if (uriC != null && !TextUtils.isEmpty(uriC.getPath()) && new File(uriC.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriC.getPath(), 1);
                if (bitmapCreateVideoThumbnail == null) {
                    c9.e.a("VastRequest", "Video file not supported", new Object[0]);
                    X(c9.j.f6610k);
                    o(y8.b.a("Failed to get thumbnail by file URI"), hVar);
                } else if (bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                    c9.e.a("VastRequest", "Empty thumbnail", new Object[0]);
                    X(c9.j.f6610k);
                    o(y8.b.a("Thumbnail is empty"), hVar);
                } else {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(context, uriC);
                        long j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                        int i10 = this.f6565n;
                        if (i10 == 0 || j10 <= i10) {
                            this.f6554c = uriC;
                            l(vastAd);
                            k(hVar);
                        } else {
                            X(c9.j.f6603d);
                            o(y8.b.a("Estimated duration does not match actual duration"), hVar);
                        }
                    } catch (Exception e10) {
                        c9.e.c("VastRequest", e10);
                        X(c9.j.f6610k);
                        o(y8.b.j("Exception during metadata retrieval", e10), hVar);
                    }
                }
                h(context);
                return;
            }
            c9.e.a("VastRequest", "fileUri is null", new Object[0]);
            X(c9.j.f6605f);
            o(y8.b.a("Can't find video by local URI"), hVar);
        } catch (Exception e11) {
            c9.e.c("VastRequest", e11);
            X(c9.j.f6605f);
            o(y8.b.j("Exception during caching media file", e11), hVar);
        }
    }

    private void k(c9.h hVar) {
        if (this.f6575x.getAndSet(true)) {
            return;
        }
        c9.e.a("VastRequest", "sendLoaded", new Object[0]);
        if (hVar != null) {
            u.B(new e(hVar));
        }
    }

    private synchronized void l(VastAd vastAd) {
        if (this.f6559h == null) {
            return;
        }
        u.B(new h(vastAd));
    }

    private synchronized void m(y8.b bVar) {
        if (this.f6559h == null) {
            return;
        }
        u.B(new i(bVar));
    }

    private void n(y8.b bVar, c9.b bVar2) {
        c9.e.a("VastRequest", "sendShowFailed - %s", bVar);
        u.B(new RunnableC0146g(bVar2, bVar));
    }

    private void o(y8.b bVar, c9.h hVar) {
        c9.e.a("VastRequest", "sendLoadFailed - %s", bVar);
        m(bVar);
        u.B(new f(bVar, hVar));
    }

    private String s(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    public void A(List list, Bundle bundle) {
        B(list, bundle);
    }

    public void B(List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f6557f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            c9.k.b(list, bundle2, f6551z);
        } else {
            c9.e.a("VastRequest", "Url list is null", new Object[0]);
        }
    }

    public y8.a C() {
        return this.f6553b;
    }

    public float D() {
        return this.f6563l;
    }

    public Uri E() {
        return this.f6554c;
    }

    public int F() {
        return this.f6573v;
    }

    public float G() {
        return this.f6574w;
    }

    public String H() {
        return this.f6552a;
    }

    public int I() {
        return this.f6565n;
    }

    public float J() {
        return this.f6561j;
    }

    public int K() {
        if (!c0()) {
            return 0;
        }
        VastAd vastAd = this.f6555d;
        if (vastAd == null) {
            return 2;
        }
        e9.n nVarQ = vastAd.q();
        return u.D(nVarQ.Z(), nVarQ.X());
    }

    public int L() {
        return this.f6566o;
    }

    public VastAd M() {
        return this.f6555d;
    }

    public Float N() {
        return this.f6562k;
    }

    public n O() {
        return this.f6556e;
    }

    public boolean P() {
        return this.f6567p;
    }

    public boolean Q() {
        return this.f6564m;
    }

    public boolean R() {
        return this.f6571t;
    }

    public boolean S() {
        return this.f6572u;
    }

    public void T(Context context, String str, c9.h hVar) {
        c9.e.a("VastRequest", "loadVideoWithData\n%s", str);
        this.f6555d = null;
        if (!u.v(context)) {
            o(y8.b.f108392c, hVar);
            return;
        }
        try {
            new c(context, str, hVar).start();
        } catch (Exception e10) {
            c9.e.c("VastRequest", e10);
            o(y8.b.j("Exception during creating background thread", e10), hVar);
        }
    }

    public void U(Context context, String str, c9.h hVar) {
        String str2;
        io.bidmachine.iab.vast.processor.b aVar = this.f6558g;
        if (aVar == null) {
            aVar = new io.bidmachine.iab.vast.processor.a(context);
        }
        io.bidmachine.iab.vast.processor.d dVarL = new io.bidmachine.iab.vast.processor.c(this, aVar).l(str);
        VastAd vastAdG = dVarL.g();
        this.f6555d = vastAdG;
        if (vastAdG == null) {
            c9.j jVarH = dVarL.h();
            if (jVarH != null) {
                X(jVarH);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(jVarH.a()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            o(y8.b.a(str2), hVar);
            return;
        }
        vastAdG.u(this);
        e9.e eVarI = this.f6555d.i();
        if (eVarI != null) {
            Boolean boolU = eVarI.u();
            if (boolU != null) {
                if (boolU.booleanValue()) {
                    this.f6568q = false;
                    this.f6569r = false;
                } else {
                    this.f6568q = true;
                    this.f6569r = true;
                }
            }
            if (eVarI.i().X() > 0.0f) {
                this.f6563l = eVarI.i().X();
            }
            this.f6571t = eVarI.r();
            this.f6572u = eVarI.o();
            Integer numK = eVarI.k();
            if (numK != null) {
                this.f6573v = numK.intValue();
            }
        }
        this.f6574w = f(this.f6555d, eVarI).floatValue();
        a9.c cVar = this.f6560i;
        if (cVar != null) {
            cVar.R(this);
        }
        int i10 = b.f6578a[this.f6553b.ordinal()];
        if (i10 == 1) {
            i(context, this.f6555d, hVar);
            return;
        }
        if (i10 == 2) {
            k(hVar);
        } else {
            if (i10 != 3) {
                return;
            }
            k(hVar);
            i(context, this.f6555d, hVar);
        }
    }

    public void W(Context context, c9.h hVar) {
        if (this.f6555d == null) {
            o(y8.b.f("VastAd is null during performCache"), hVar);
            return;
        }
        try {
            new d(context, hVar).start();
        } catch (Exception e10) {
            c9.e.c("VastRequest", e10);
            o(y8.b.j("Exception during creating background thread", e10), hVar);
        }
    }

    public void X(c9.j jVar) {
        c9.e.a("VastRequest", "sendVastSpecError - %s", jVar);
        try {
            if (this.f6555d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("params_error_code", jVar.a());
                A(this.f6555d.o(), bundle);
            }
        } catch (Exception e10) {
            c9.e.c("VastRequest", e10);
        }
    }

    public synchronized void Z(l lVar) {
        this.f6559h = lVar;
    }

    public boolean a0() {
        return this.f6570s;
    }

    public boolean b0() {
        return this.f6569r;
    }

    public boolean c0() {
        return this.f6568q;
    }

    public boolean u() {
        if (this.f6575x.get()) {
            return this.f6553b != y8.a.FullLoad || v();
        }
        return false;
    }

    public boolean v() {
        try {
            Uri uri = this.f6554c;
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return false;
            }
            return new File(this.f6554c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void x(Context context, n nVar, c9.b bVar, VastView vastView, c9.f fVar, a9.b bVar2) {
        c9.e.a("VastRequest", "display", new Object[0]);
        this.f6576y.set(true);
        if (this.f6555d == null) {
            n(y8.b.f("VastAd is null during display VastActivity"), bVar);
            return;
        }
        this.f6556e = nVar;
        this.f6566o = context.getResources().getConfiguration().orientation;
        y8.b bVarB = new VastActivity.a().g(this).d(bVar).h(vastView).e(fVar).c(this.f6560i).f(bVar2).b(context);
        if (bVarB != null) {
            n(bVarB, bVar);
        }
    }
}
