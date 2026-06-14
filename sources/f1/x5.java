package f1;

import f1.z2;
import java.io.File;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f71523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f71524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f71525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f71526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i8 f71527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f71528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f71529g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ad f71530h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PriorityQueue f71531i = new PriorityQueue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Cif f71532j;

    public x5(Executor executor, m mVar, wf wfVar, i iVar, AtomicReference atomicReference, i8 i8Var, Cif cif) {
        this.f71523a = executor;
        this.f71528f = mVar;
        this.f71524b = wfVar;
        this.f71525c = iVar;
        this.f71526d = atomicReference;
        this.f71527e = i8Var;
        this.f71532j = cif;
    }

    public synchronized void b() {
        try {
            int i10 = this.f71529g;
            if (i10 == 1) {
                eg.d("Change state to PAUSED", null);
                this.f71529g = 4;
            } else if (i10 == 2) {
                if (this.f71530h.g()) {
                    this.f71531i.add(this.f71530h.f69399n);
                    this.f71530h = null;
                    eg.d("Change state to PAUSED", null);
                    this.f71529g = 4;
                } else {
                    eg.d("Change state to PAUSING", null);
                    this.f71529g = 3;
                }
            }
        } finally {
        }
    }

    public synchronized void c(r rVar, Map map, AtomicInteger atomicInteger, w9 w9Var, String str) {
        try {
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AtomicReference atomicReference = new AtomicReference(w9Var);
            for (f9 f9Var : map.values()) {
                r rVar2 = rVar;
                AtomicInteger atomicInteger3 = atomicInteger;
                String str2 = str;
                this.f71531i.add(new jc(rVar2, f9Var.f69808b, f9Var.f69809c, f9Var.f69807a, atomicInteger3, atomicReference, atomicInteger2, str2));
                rVar = rVar2;
                atomicInteger = atomicInteger3;
                str = str2;
            }
            int i10 = this.f71529g;
            if (i10 == 1 || i10 == 2) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(ad adVar, g1.a aVar, ef efVar) {
        String str;
        try {
            int i10 = this.f71529g;
            if (i10 == 2 || i10 == 3) {
                if (adVar != this.f71530h) {
                    return;
                }
                this.f71530h = null;
                long millis = TimeUnit.NANOSECONDS.toMillis(adVar.f69460g);
                jc jcVar = adVar.f69399n;
                jcVar.f70208i.addAndGet((int) millis);
                jcVar.c(this.f71523a, aVar == null);
                if (aVar == null) {
                    eg.d("Downloaded " + jcVar.f70203d, null);
                } else {
                    String str2 = adVar.f69399n.f70205f;
                    String strD = aVar.d();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to download ");
                    sb2.append(jcVar.f70203d);
                    if (efVar != null) {
                        str = " Status code=" + efVar.b();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append(" Error message=");
                    sb2.append(strD);
                    eg.d(sb2.toString(), null);
                    this.f71532j.mo4436e(new oc(z2.a.f71698i, "Name: " + jcVar.f70202c + " Url: " + jcVar.f70203d + " Error: " + strD, str2, "", null));
                }
                if (this.f71529g == 3) {
                    eg.d("Change state to PAUSED", null);
                    this.f71529g = 4;
                } else {
                    h();
                }
            }
        } finally {
        }
    }

    public synchronized void e(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.f71529g == 2) {
            ad adVar = this.f71530h;
            if (adVar.f69399n.f70206g == atomicInteger && adVar.g()) {
                this.f71530h = null;
                h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0146 A[PHI: r9
  0x0146: PHI (r9v6 long) = (r9v3 long), (r9v2 long) binds: [B:68:0x016c, B:62:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void f() {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.x5.f():void");
    }

    public synchronized void g() {
        try {
            int i10 = this.f71529g;
            if (i10 == 3) {
                eg.d("Change state to DOWNLOADING", null);
                this.f71529g = 2;
            } else if (i10 == 4) {
                eg.d("Change state to IDLE", null);
                this.f71529g = 1;
                h();
            }
        } finally {
        }
    }

    public final void h() {
        jc jcVar;
        jc jcVar2;
        if (this.f71530h != null && (jcVar2 = (jc) this.f71531i.peek()) != null && this.f71530h.f69399n.f70201b.g() > jcVar2.f70201b.g() && this.f71530h.g()) {
            this.f71531i.add(this.f71530h.f69399n);
            this.f71530h = null;
        }
        while (this.f71530h == null && (jcVar = (jc) this.f71531i.poll()) != null) {
            if (jcVar.f70206g.get() > 0) {
                File file = new File(this.f71528f.a().f69554a, jcVar.f70204e);
                if (file.exists() || file.mkdirs() || file.isDirectory()) {
                    File file2 = new File(file, jcVar.f70202c);
                    if (file2.exists()) {
                        this.f71528f.n(file2);
                        jcVar.c(this.f71523a, true);
                    } else {
                        ad adVar = new ad(this, this.f71525c, jcVar, file2, this.f71524b.a());
                        this.f71530h = adVar;
                        this.f71524b.b(adVar);
                    }
                } else {
                    eg.i("Unable to create directory " + file.getPath(), null);
                    jcVar.c(this.f71523a, false);
                }
            }
        }
        if (this.f71530h != null) {
            if (this.f71529g != 2) {
                eg.d("Change state to DOWNLOADING", null);
                this.f71529g = 2;
                return;
            }
            return;
        }
        if (this.f71529g != 1) {
            eg.d("Change state to IDLE", null);
            this.f71529g = 1;
        }
    }
}
