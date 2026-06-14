package f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.iab.vast.processor.VastAd;
import com.ironsource.C4274d4;
import f2.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* JADX INFO: loaded from: classes5.dex */
public class e {
    private static final h.b A = new i();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f71855z = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f71858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastAd f71859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f71860e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bundle f71862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.explorestack.iab.vast.processor.b f71863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f71864i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Float f71866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f71867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f71868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f71869n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f71871p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b2.a f71857b = b2.a.FullLoad;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f2.j f71861f = f2.j.NonRewarded;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f71865j = 3.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f71870o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f71872q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f71873r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f71874s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f71875t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f71876u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f71877v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f71878w = 5.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f71879x = new AtomicBoolean(false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f71880y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f71856a = UUID.randomUUID().toString();

    public class a {
        public a() {
        }

        public a a(String str, String str2) {
            e.this.p(str, str2);
            return this;
        }

        public e b() {
            return e.this;
        }

        public a c(boolean z10) {
            e.this.f71871p = z10;
            return this;
        }

        public a d(b2.a aVar) {
            e.this.f71857b = aVar;
            return this;
        }

        public a e(int i10) {
            e.this.f71867l = i10;
            return this;
        }

        public a f(int i10) {
            e.this.f71869n = i10;
            return this;
        }

        public a g(String str) {
            e.this.f71860e = str;
            return this;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b2.b f71882b;

        b(b2.b bVar) {
            this.f71882b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f71864i != null) {
                e.this.f71864i.b(e.this, this.f71882b);
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f71884a;

        static {
            int[] iArr = new int[b2.a.values().length];
            f71884a = iArr;
            try {
                iArr[b2.a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71884a[b2.a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71884a[b2.a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f71885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f2.f f71887d;

        d(Context context, String str, f2.f fVar) {
            this.f71885b = context;
            this.f71886c = str;
            this.f71887d = fVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            e.this.U(this.f71885b, this.f71886c, this.f71887d);
        }
    }

    /* JADX INFO: renamed from: f2.e$e, reason: collision with other inner class name */
    class C0881e extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f71889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2.f f71890c;

        C0881e(Context context, f2.f fVar) {
            this.f71889b = context;
            this.f71890c = fVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.i(this.f71889b, eVar.f71859d, this.f71890c);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.f f71892b;

        f(f2.f fVar) {
            this.f71892b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f71892b.b(e.this);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b2.b f71894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2.f f71895c;

        g(b2.b bVar, f2.f fVar) {
            this.f71894b = bVar;
            this.f71895c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f2.f fVar;
            e eVar;
            b2.b bVarB;
            e.q(e.this);
            if (this.f71895c != null) {
                if (e.this.f71857b == b2.a.PartialLoad && e.this.f71879x.get() && !e.this.f71880y.get()) {
                    fVar = this.f71895c;
                    eVar = e.this;
                    bVarB = b2.b.b(String.format("%s load failed after display - %s", eVar.f71857b, this.f71894b));
                } else {
                    fVar = this.f71895c;
                    eVar = e.this;
                    bVarB = this.f71894b;
                }
                fVar.g(eVar, bVarB);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.b f71897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b2.b f71898c;

        h(f2.b bVar, b2.b bVar2) {
            this.f71897b = bVar;
            this.f71898c = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f2.b bVar = this.f71897b;
            if (bVar != null) {
                bVar.a(e.this, this.f71898c);
            }
        }
    }

    class i implements h.b {
        i() {
        }

        @Override // f2.h.b
        public void a(String str) {
            f2.c.a("VastRequest", "Fire url: %s", str);
            e2.g.q(str);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VastAd f71900b;

        j(VastAd vastAd) {
            this.f71900b = vastAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f71864i != null) {
                e.this.f71864i.a(e.this, this.f71900b);
            }
        }
    }

    class k implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f71902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File f71903c;

        public k(File file) {
            this.f71903c = file;
            this.f71902b = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j10 = this.f71902b;
            long j11 = ((k) obj).f71902b;
            if (j10 > j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
    }

    private e() {
    }

    public static a V() {
        return new e().new a();
    }

    private Uri c(Context context, String str) throws IOException {
        String strR = r(context);
        if (strR == null) {
            throw new FileNotFoundException("No dir for caching file");
        }
        File file = new File(strR);
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

    private Float f(VastAd vastAd, f2.k kVar) {
        Float fL = kVar != null ? kVar.l() : null;
        if (Q()) {
            fL = e2.g.w(fL, N());
        }
        Float fX = e2.g.x(fL, vastAd.m());
        return fX == null ? Float.valueOf(5.0f) : fX;
    }

    private void h(Context context) {
        File[] fileArrListFiles;
        try {
            String strR = r(context);
            if (strR == null || (fileArrListFiles = new File(strR).listFiles()) == null || fileArrListFiles.length <= f71855z) {
                return;
            }
            k[] kVarArr = new k[fileArrListFiles.length];
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                kVarArr[i10] = new k(fileArrListFiles[i10]);
            }
            Arrays.sort(kVarArr);
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                fileArrListFiles[i11] = kVarArr[i11].f71903c;
            }
            for (int i12 = f71855z; i12 < fileArrListFiles.length; i12++) {
                if (!Uri.fromFile(fileArrListFiles[i12]).equals(this.f71858c)) {
                    fileArrListFiles[i12].delete();
                }
            }
        } catch (Exception e10) {
            f2.c.b("VastRequest", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context, VastAd vastAd, f2.f fVar) {
        String str;
        b2.b bVarA;
        try {
            Uri uriC = c(context, vastAd.p().P());
            if (uriC != null && !TextUtils.isEmpty(uriC.getPath()) && new File(uriC.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriC.getPath(), 1);
                if (bitmapCreateVideoThumbnail == null) {
                    f2.c.a("VastRequest", "Video file not supported", new Object[0]);
                    X(f2.g.f71914k);
                    str = "Failed to get thumbnail by file URI";
                } else {
                    if (!bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, uriC);
                            long j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            int i10 = this.f71869n;
                            if (i10 == 0 || j10 <= i10) {
                                this.f71858c = uriC;
                                m(vastAd);
                                o(fVar);
                            } else {
                                X(f2.g.f71907d);
                                l(b2.b.a("Estimated duration does not match actual duration"), fVar);
                            }
                        } catch (Exception e10) {
                            f2.c.b("VastRequest", e10);
                            X(f2.g.f71914k);
                            bVarA = b2.b.j("Exception during metadata retrieval", e10);
                            l(bVarA, fVar);
                        }
                        h(context);
                        return;
                    }
                    f2.c.a("VastRequest", "Empty thumbnail", new Object[0]);
                    X(f2.g.f71914k);
                    str = "Thumbnail is empty";
                }
                bVarA = b2.b.a(str);
                l(bVarA, fVar);
                h(context);
                return;
            }
            f2.c.a("VastRequest", "fileUri is null", new Object[0]);
            X(f2.g.f71909f);
            l(b2.b.a("Can't find video by local URI"), fVar);
        } catch (Exception e11) {
            f2.c.b("VastRequest", e11);
            X(f2.g.f71909f);
            l(b2.b.j("Exception during caching media file", e11), fVar);
        }
    }

    private synchronized void j(b2.b bVar) {
        if (this.f71864i == null) {
            return;
        }
        e2.g.z(new b(bVar));
    }

    private void k(b2.b bVar, f2.b bVar2) {
        f2.c.a("VastRequest", "sendShowFailed - %s", bVar);
        e2.g.z(new h(bVar2, bVar));
    }

    private void l(b2.b bVar, f2.f fVar) {
        f2.c.a("VastRequest", "sendLoadFailed - %s", bVar);
        j(bVar);
        e2.g.z(new g(bVar, fVar));
    }

    private synchronized void m(VastAd vastAd) {
        if (this.f71864i == null) {
            return;
        }
        e2.g.z(new j(vastAd));
    }

    private void o(f2.f fVar) {
        if (this.f71879x.getAndSet(true)) {
            return;
        }
        f2.c.a("VastRequest", "sendLoaded", new Object[0]);
        if (fVar != null) {
            e2.g.z(new f(fVar));
        }
    }

    static /* synthetic */ d2.c q(e eVar) {
        eVar.getClass();
        return null;
    }

    private String r(Context context) {
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
        Bundle bundle3 = this.f71862g;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            f2.h.b(list, bundle2, A);
        } else {
            f2.c.a("VastRequest", "Url list is null", new Object[0]);
        }
    }

    public b2.a C() {
        return this.f71857b;
    }

    public float D() {
        return this.f71867l;
    }

    public Uri E() {
        return this.f71858c;
    }

    public int F() {
        return this.f71877v;
    }

    public float G() {
        return this.f71878w;
    }

    public String H() {
        return this.f71856a;
    }

    public int I() {
        return this.f71869n;
    }

    public float J() {
        return this.f71865j;
    }

    public int K() {
        if (!b0()) {
            return 0;
        }
        VastAd vastAd = this.f71859d;
        if (vastAd == null) {
            return 2;
        }
        h2.n nVarP = vastAd.p();
        return e2.g.B(nVarP.a0(), nVarP.Y());
    }

    public int L() {
        return this.f71870o;
    }

    public VastAd M() {
        return this.f71859d;
    }

    public Float N() {
        return this.f71866k;
    }

    public f2.j O() {
        return this.f71861f;
    }

    public boolean P() {
        return this.f71871p;
    }

    public boolean Q() {
        return this.f71868m;
    }

    public boolean R() {
        return this.f71875t;
    }

    public boolean S() {
        return this.f71876u;
    }

    public void T(Context context, String str, f2.f fVar) {
        f2.c.a("VastRequest", "loadVideoWithData\n%s", str);
        this.f71859d = null;
        if (!e2.g.t(context)) {
            l(b2.b.f5801c, fVar);
            return;
        }
        try {
            new d(context, str, fVar).start();
        } catch (Exception e10) {
            f2.c.b("VastRequest", e10);
            l(b2.b.j("Exception during creating background thread", e10), fVar);
        }
    }

    public void U(Context context, String str, f2.f fVar) {
        String str2;
        com.explorestack.iab.vast.processor.b aVar = this.f71863h;
        if (aVar == null) {
            aVar = new com.explorestack.iab.vast.processor.a(context);
        }
        com.explorestack.iab.vast.processor.d dVarD = new com.explorestack.iab.vast.processor.c(this, aVar).d(str);
        VastAd vastAdF = dVarD.f();
        this.f71859d = vastAdF;
        if (vastAdF == null) {
            f2.g gVarG = dVarD.g();
            if (gVarG != null) {
                X(gVarG);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(gVarG.a()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            l(b2.b.a(str2), fVar);
            return;
        }
        vastAdF.t(this);
        h2.e eVarH = this.f71859d.h();
        if (eVarH != null) {
            Boolean boolU = eVarH.u();
            if (boolU != null) {
                if (boolU.booleanValue()) {
                    this.f71872q = false;
                    this.f71873r = false;
                } else {
                    this.f71872q = true;
                    this.f71873r = true;
                }
            }
            if (eVarH.i().Y() > 0.0f) {
                this.f71867l = eVarH.i().Y();
            }
            this.f71875t = eVarH.r();
            this.f71876u = eVarH.o();
            Integer numK = eVarH.k();
            if (numK != null) {
                this.f71877v = numK.intValue();
            }
        }
        this.f71878w = f(this.f71859d, eVarH).floatValue();
        int i10 = c.f71884a[this.f71857b.ordinal()];
        if (i10 == 1) {
            i(context, this.f71859d, fVar);
            return;
        }
        if (i10 == 2) {
            o(fVar);
        } else {
            if (i10 != 3) {
                return;
            }
            o(fVar);
            i(context, this.f71859d, fVar);
        }
    }

    public void W(Context context, f2.f fVar) {
        if (this.f71859d == null) {
            l(b2.b.f("VastAd is null during performCache"), fVar);
            return;
        }
        try {
            new C0881e(context, fVar).start();
        } catch (Exception e10) {
            f2.c.b("VastRequest", e10);
            l(b2.b.j("Exception during creating background thread", e10), fVar);
        }
    }

    public void X(f2.g gVar) {
        f2.c.a("VastRequest", "sendVastSpecError - %s", gVar);
        try {
            if (this.f71859d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("params_error_code", gVar.a());
                A(this.f71859d.n(), bundle);
            }
        } catch (Exception e10) {
            f2.c.b("VastRequest", e10);
        }
    }

    public synchronized void Y(n nVar) {
        this.f71864i = nVar;
    }

    public boolean Z() {
        return this.f71874s;
    }

    public boolean a0() {
        return this.f71873r;
    }

    public boolean b0() {
        return this.f71872q;
    }

    public void p(String str, String str2) {
        if (this.f71862g == null) {
            this.f71862g = new Bundle();
        }
        this.f71862g.putString(str, str2);
    }

    public boolean u() {
        try {
            Uri uri = this.f71858c;
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return false;
            }
            return new File(this.f71858c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void w(Context context, f2.j jVar, f2.b bVar) {
        x(context, jVar, bVar, null, null, null);
    }

    public void x(Context context, f2.j jVar, f2.b bVar, VastView vastView, f2.d dVar, d2.b bVar2) {
        f2.c.a("VastRequest", "display", new Object[0]);
        this.f71880y.set(true);
        if (this.f71859d == null) {
            k(b2.b.f("VastAd is null during display VastActivity"), bVar);
            return;
        }
        this.f71861f = jVar;
        this.f71870o = context.getResources().getConfiguration().orientation;
        b2.b bVarB = new VastActivity.a().g(this).d(bVar).h(vastView).e(dVar).c(null).f(bVar2).b(context);
        if (bVarB != null) {
            k(bVarB, bVar);
        }
    }
}
