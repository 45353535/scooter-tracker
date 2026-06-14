package f1;

import android.content.Context;
import f1.q1;
import f1.q3;
import g1.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class b3 implements q3.a, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf f69411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb f69412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f69413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f69414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s6 f69415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f69416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue f69417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f69418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f69419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f69420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicInteger f69421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f69422l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f69423b = new a("CAN_NOT_DOWNLOAD", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f69424c = new a("CREATE_ASSET_AND_DOWNLOAD", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f69425d = new a("BRING_TO_FRONT_QUEUE_AND_DOWNLOAD", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f69426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f69427f;

        static {
            a[] aVarArrD = d();
            f69426e = aVarArrD;
            f69427f = qf.a.a(aVarArrD);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f69423b, f69424c, f69425d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f69426e.clone();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69428a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f69423b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f69424c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f69425d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69428a = iArr;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(Long.valueOf(((c9) obj).a()), Long.valueOf(((c9) obj2).a()));
        }
    }

    public b3(wf networkRequestService, qb policy, i iVar, m mVar, s6 tempHelper, ScheduledExecutorService backgroundExecutor) {
        Intrinsics.checkNotNullParameter(networkRequestService, "networkRequestService");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.f69411a = networkRequestService;
        this.f69412b = policy;
        this.f69413c = iVar;
        this.f69414d = mVar;
        this.f69415e = tempHelper;
        this.f69416f = backgroundExecutor;
        this.f69417g = new ConcurrentLinkedQueue();
        this.f69418h = new ConcurrentLinkedQueue();
        this.f69419i = new ConcurrentHashMap();
        this.f69420j = new ConcurrentHashMap();
        this.f69421k = new AtomicInteger(1);
        this.f69422l = new Runnable() { // from class: f1.a3
            @Override // java.lang.Runnable
            public final void run() {
                b3.g(this.f69365b);
            }
        };
    }

    public static final void g(b3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(null, this$0.f69421k.incrementAndGet(), false);
    }

    @Override // f1.q1
    public int a(c9 c9Var) {
        if (c9Var == null) {
            return 0;
        }
        if (q(c9Var)) {
            return 5;
        }
        File fileP = p(c9Var);
        long length = fileP != null ? fileP.length() : 0L;
        if (c9Var.d() == 0) {
            return 0;
        }
        return p1.a(length / c9Var.d());
    }

    @Override // f1.q1
    public c9 b(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (c9) this.f69420j.get(filename);
    }

    @Override // f1.q3.a
    public void c(String uri, String videoFileName, g1.a aVar) {
        String strD;
        Unit unit;
        File fileF;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        eg.e("onError: " + uri, null, 2, null);
        if (aVar == null || (strD = aVar.d()) == null) {
            strD = "Unknown error";
        }
        c9 c9VarB = b(videoFileName);
        if (c9VarB != null && (fileF = c9VarB.f()) != null) {
            fileF.delete();
        }
        if (aVar == null || aVar.h() != a.c.f72140c) {
            m(uri);
            e9 e9Var = (e9) this.f69419i.get(uri);
            if (e9Var != null) {
                e9Var.a(uri);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Missing callback on error", null, 2, null);
            }
        } else if (c9VarB != null) {
            this.f69417g.add(c9VarB);
            i(c9VarB);
        }
        this.f69419i.remove(uri);
        this.f69420j.remove(videoFileName);
        a(null, this.f69421k.get(), false);
        eg.j("Video download failed: " + uri + " with error " + strD, null, 2, null);
        h8.b("Video downloaded failed " + uri + " with error " + strD);
        this.f69418h.remove(uri);
    }

    @Override // f1.q1
    public synchronized void d(String url, String filename, boolean z10, e9 e9Var) throws Throwable {
        Throwable th2;
        File fileI;
        try {
            try {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(filename, "filename");
                eg.e("downloadVideoFile: " + url, null, 2, null);
                m mVar = this.f69414d;
                if (mVar != null) {
                    try {
                        fileI = mVar.i();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    fileI = null;
                }
                m mVar2 = this.f69414d;
                int i10 = b.f69428a[e(url, filename, z10, e9Var, a(filename), mVar2 != null ? mVar2.b(fileI, filename) : null).ordinal()];
                if (i10 == 2) {
                    h(url, filename, new File(fileI, filename), fileI);
                    a(z10 ? filename : null, this.f69421k.get(), z10);
                } else if (i10 == 3) {
                    q1.a.a(this, filename, 0, true, 2, null);
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final a e(String str, String str2, boolean z10, e9 e9Var, boolean z11, File file) {
        e9 e9Var2;
        String str3;
        String str4;
        String str5;
        b3 b3Var;
        if (z10) {
            if (z11) {
                if (this.f69419i.containsKey(str)) {
                    eg.e("Already downloading for show operation: " + str2, null, 2, null);
                    h8.b("Already downloading for show operation: " + str2);
                    b(str, str2, file != null ? file.length() : 0L, e9Var);
                    return a.f69423b;
                }
                str5 = str;
                e9Var2 = e9Var;
                str3 = "Register callback for show operation: ";
                str4 = str2;
                if (e9Var2 != null) {
                    eg.e(str3 + str4, null, 2, null);
                    h8.b(str3 + str4);
                    b(str5, str4, file != null ? file.length() : 0L, e9Var2);
                    return a.f69423b;
                }
                b3Var = this;
            } else {
                e9Var2 = e9Var;
                str3 = "Register callback for show operation: ";
                str4 = str2;
                str5 = str;
                b3Var = this;
                eg.e("Not downloading for show operation: " + str4, null, 2, null);
                if (e9Var2 != null) {
                    c9 c9Var = (c9) b3Var.f69420j.get(str4);
                    if (Intrinsics.areEqual(c9Var != null ? c9Var.e() : null, str4) || b3Var.f69419i.containsKey(str5)) {
                        b3Var.f69419i.put(str5, e9Var2);
                        return a.f69425d;
                    }
                }
            }
            if (e9Var2 != null) {
                eg.e(str3 + str4, null, 2, null);
                h8.b(str3 + str4);
                b3Var.f69419i.put(str5, e9Var2);
            }
        } else if (k(str, str2) || z11) {
            eg.e("Already queued or downloading for cache operation: " + str2, null, 2, null);
            h8.b("Already queued or downloading for cache operation: " + str2);
            return a.f69423b;
        }
        return a.f69424c;
    }

    public final void f() {
        if (j()) {
            Collection collectionValues = this.f69420j.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator it = CollectionsKt.sortedWith(collectionValues, new c()).iterator();
            while (it.hasNext()) {
                s((c9) it.next());
                if (!j()) {
                    return;
                }
            }
        }
    }

    public final void h(String str, String str2, File file, File file2) {
        File fileM;
        m mVar = this.f69414d;
        String absolutePath = (mVar == null || (fileM = mVar.m()) == null) ? null : fileM.getAbsolutePath();
        c9 c9Var = new c9(str, str2, file, file2, 0L, absolutePath + File.separator + str2, 0L, 80, null);
        file.setLastModified(c9Var.a());
        i(c9Var);
        this.f69420j.putIfAbsent(str2, c9Var);
        this.f69417g.offer(c9Var);
    }

    public final void i(c9 c9Var) {
        if (h8.f70006a.g()) {
            File file = new File(c9Var.g());
            try {
                file.createNewFile();
                file.setLastModified(o3.a());
            } catch (IOException e10) {
                eg.j("Error while creating queue empty file: " + e10, null, 2, null);
            }
        }
    }

    public final boolean j() {
        m mVar = this.f69414d;
        if (mVar == null) {
            return false;
        }
        return this.f69412b.g(mVar.h(mVar.i()));
    }

    public final boolean k(String str, String str2) {
        if (this.f69417g.size() <= 0) {
            return false;
        }
        for (c9 c9Var : this.f69417g) {
            if (Intrinsics.areEqual(c9Var.h(), str) && Intrinsics.areEqual(c9Var.e(), str2)) {
                return true;
            }
        }
        return false;
    }

    public final void l(c9 c9Var) {
        if (h8.f70006a.g()) {
            File file = new File(c9Var.g());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final void m(String str) {
        for (c9 c9Var : new LinkedList(this.f69417g)) {
            if (c9Var != null && Intrinsics.areEqual(c9Var.h(), str)) {
                this.f69417g.remove(c9Var);
            }
        }
    }

    public final boolean n() {
        i iVar = this.f69413c;
        return iVar != null && iVar.e() && !this.f69412b.q() && this.f69418h.isEmpty();
    }

    public final c9 o(String str) {
        Object objPoll;
        if (str == null) {
            objPoll = this.f69417g.poll();
        } else {
            c9 c9Var = null;
            for (c9 c9Var2 : this.f69417g) {
                if (Intrinsics.areEqual(c9Var2.e(), str)) {
                    c9Var = c9Var2;
                }
            }
            objPoll = c9Var;
        }
        c9 c9Var3 = (c9) objPoll;
        if (c9Var3 != null) {
            l(c9Var3);
        }
        return c9Var3;
    }

    public final File p(c9 c9Var) {
        return this.f69415e.a(c9Var.c(), c9Var.e());
    }

    public final boolean q(c9 c9Var) {
        m mVar;
        if (c9Var == null || c9Var.f() == null || (mVar = this.f69414d) == null) {
            return false;
        }
        return mVar.k(c9Var.f());
    }

    public final boolean r(c9 c9Var) {
        return this.f69415e.c(c9Var.c(), c9Var.e());
    }

    public boolean s(c9 c9Var) {
        if (c9Var == null || !q(c9Var)) {
            return false;
        }
        File fileF = c9Var.f();
        String strE = c9Var.e();
        m mVar = this.f69414d;
        if (mVar == null || !mVar.g(fileF)) {
            return false;
        }
        this.f69420j.remove(strE);
        return true;
    }

    public final void t(c9 c9Var) {
        eg.e("startDownloadNow: " + c9Var.h(), null, 2, null);
        if (a(c9Var.e())) {
            h8.b("File already downloaded or downloading: " + c9Var.e());
            String strH = c9Var.h();
            e9 e9Var = (e9) this.f69419i.remove(strH);
            if (e9Var != null) {
                e9Var.a(strH);
                return;
            }
            return;
        }
        h8.b("Start downloading " + c9Var.h());
        this.f69412b.a();
        this.f69418h.add(c9Var.h());
        i iVar = this.f69413c;
        File fileF = c9Var.f();
        Intrinsics.checkNotNull(fileF);
        this.f69411a.b(new q3(iVar, fileF, c9Var.h(), this, r.f70879e, this.f69411a.a()));
    }

    @Override // f1.q3.a
    public void b(String url, String videoFileName, long j10, e9 e9Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        eg.e("tempFileIsReady: " + videoFileName, null, 2, null);
        c9 c9VarB = b(videoFileName);
        if (j10 > 0 && c9VarB != null) {
            c9VarB.b(j10);
        }
        if (c9VarB != null) {
            this.f69420j.remove(videoFileName);
        }
        if (e9Var == null) {
            e9Var = (e9) this.f69419i.get(url);
        }
        if (e9Var != null) {
            e9Var.a(url);
        }
    }

    @Override // f1.q1
    public void a(Context context) {
        File[] fileArrL;
        Intrinsics.checkNotNullParameter(context, "context");
        m mVar = this.f69414d;
        if (mVar == null || (fileArrL = mVar.l()) == null) {
            return;
        }
        Intrinsics.checkNotNull(fileArrL);
        int length = fileArrL.length;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArrL[i10];
            if (file.exists()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.g0(name, ".tmp", z10, 2, null)) {
                    mVar.g(file);
                    return;
                }
            }
            qb qbVar = this.f69412b;
            Intrinsics.checkNotNull(file);
            if (qbVar.d(file)) {
                mVar.g(file);
            } else {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                c9 c9Var = new c9("", name2, file, mVar.i(), file.lastModified(), null, file.length(), 32, null);
                ConcurrentHashMap concurrentHashMap = this.f69420j;
                String name3 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                concurrentHashMap.put(name3, c9Var);
            }
            i10++;
            z10 = false;
        }
    }

    @Override // f1.q1
    public boolean a(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        c9 c9VarB = b(videoFilename);
        return (c9VarB != null && r(c9VarB)) || (c9VarB != null && q(c9VarB));
    }

    @Override // f1.q3.a
    public void a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        eg.e("onSuccess: " + uri, null, 2, null);
        h8.b("Video downloaded success " + uri);
        f();
        this.f69418h.remove(uri);
        this.f69419i.remove(uri);
        this.f69421k = new AtomicInteger(1);
        m(uri);
        a(null, this.f69421k.get(), false);
    }

    @Override // f1.q1
    public void a(String str, int i10, boolean z10) {
        eg.e("startDownloadIfPossible: " + str, null, 2, null);
        if (this.f69417g.size() > 0) {
            if (!z10 && !n()) {
                h8.b("Can't cache next video at the moment");
                this.f69416f.schedule(this.f69422l, ((long) i10) * 5000, TimeUnit.MILLISECONDS);
                return;
            }
            c9 c9VarO = o(str);
            if (c9VarO != null) {
                t(c9VarO);
            }
        }
    }
}
