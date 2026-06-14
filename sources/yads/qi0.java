package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class qi0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f115001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm3 f115002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zi0 f115003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f115004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f115005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f115006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f115008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f115009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f115010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f115011k;

    public qi0(HandlerThread handlerThread, ec0 ec0Var, fc0 fc0Var, Handler handler, boolean z10) {
        super(handlerThread.getLooper());
        this.f115001a = handlerThread;
        this.f115002b = ec0Var;
        this.f115003c = fc0Var;
        this.f115004d = handler;
        this.f115009i = 3;
        this.f115010j = 5;
        this.f115008h = z10;
        this.f115005e = new ArrayList();
        this.f115006f = new HashMap();
    }

    public static int a(oi0 oi0Var, oi0 oi0Var2) {
        long j10 = oi0Var.f114327c;
        long j11 = oi0Var2.f114327c;
        int i10 = w83.f117341a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final void b() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f115005e.size(); i11++) {
            oi0 oi0Var = (oi0) this.f115005e.get(i11);
            si0 si0Var = (si0) this.f115006f.get(oi0Var.f114325a.f117459b);
            int i12 = oi0Var.f114326b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        si0Var.getClass();
                        if (si0Var.f115820e) {
                            throw new IllegalStateException();
                        }
                        if (this.f115008h || this.f115007g != 0 || i10 >= this.f115009i) {
                            a(oi0Var, 0, 0);
                            si0Var.a(false);
                        }
                    } else {
                        if (i12 != 5 && i12 != 7) {
                            throw new IllegalStateException();
                        }
                        if (si0Var == null) {
                            si0 si0Var2 = new si0(oi0Var.f114325a, ((fc0) this.f115003c).a(oi0Var.f114325a), oi0Var.f114332h, true, this.f115010j, this);
                            this.f115006f.put(oi0Var.f114325a.f117459b, si0Var2);
                            si0Var2.start();
                        } else if (!si0Var.f115820e) {
                            si0Var.a(false);
                        }
                    }
                } else if (si0Var != null) {
                    if (si0Var.f115820e) {
                        throw new IllegalStateException();
                    }
                    si0Var.a(false);
                }
            } else if (si0Var != null) {
                if (si0Var.f115820e) {
                    throw new IllegalStateException();
                }
                si0Var.a(false);
            } else if (this.f115008h || this.f115007g != 0 || this.f115011k >= this.f115009i) {
                si0Var = null;
            } else {
                oi0 oi0VarA = a(oi0Var, 2, 0);
                si0 si0Var3 = new si0(oi0VarA.f114325a, ((fc0) this.f115003c).a(oi0VarA.f114325a), oi0VarA.f114332h, false, this.f115010j, this);
                this.f115006f.put(oi0VarA.f114325a.f117459b, si0Var3);
                int i13 = this.f115011k;
                this.f115011k = i13 + 1;
                if (i13 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                si0Var3.start();
                si0Var = si0Var3;
            }
            if (si0Var != null && !si0Var.f115820e) {
                i10++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        dc0 dc0Var;
        ?? arrayList;
        String str;
        ec0 ec0Var;
        dc0 dc0Var2 = null;
        int i10 = 7;
        i = 0;
        int i11 = 0;
        switch (message.what) {
            case 0:
                this.f115007g = message.arg1;
                try {
                    try {
                        ((ec0) this.f115002b).b();
                        int[] iArr = {0, 1, 2, 5, 7};
                        ec0 ec0Var2 = (ec0) this.f115002b;
                        ec0Var2.a();
                        StringBuilder sb2 = new StringBuilder("state IN (");
                        for (int i12 = 0; i12 < 5; i12++) {
                            if (i12 > 0) {
                                sb2.append(',');
                            }
                            sb2.append(iArr[i12]);
                        }
                        sb2.append(')');
                        dc0Var = new dc0(ec0Var2.a(sb2.toString(), (String[]) null));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                while (true) {
                    try {
                    } catch (IOException e11) {
                        e = e11;
                        dc0Var2 = dc0Var;
                        uf1.b("DownloadManager", uf1.a("Failed to load index.", e));
                        this.f115005e.clear();
                        w83.a((Closeable) dc0Var2);
                    } catch (Throwable th3) {
                        th = th3;
                        dc0Var2 = dc0Var;
                        w83.a((Closeable) dc0Var2);
                        throw th;
                    }
                    if (!dc0Var.f109874a.moveToPosition(dc0Var.f109874a.getPosition() + 1)) {
                        w83.a((Closeable) dc0Var);
                        this.f115004d.obtainMessage(0, new ArrayList(this.f115005e)).sendToTarget();
                        b();
                        i11 = 1;
                        this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                        return;
                    }
                    this.f115005e.add(ec0.a(dc0Var.f109874a));
                    break;
                }
                break;
            case 1:
                this.f115008h = message.arg1 != 0;
                b();
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 2:
                this.f115007g = message.arg1;
                b();
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 3:
                String str2 = (String) message.obj;
                int i13 = message.arg1;
                if (str2 != null) {
                    oi0 oi0VarA = a(str2, false);
                    if (oi0VarA != null) {
                        a(oi0VarA, i13);
                    } else {
                        try {
                            ((ec0) this.f115002b).a(i13, str2);
                        } catch (IOException e12) {
                            uf1.b("DownloadManager", uf1.a("Failed to set manual stop reason: ".concat(str2), e12));
                        }
                    }
                    break;
                } else {
                    for (int i14 = 0; i14 < this.f115005e.size(); i14++) {
                        a((oi0) this.f115005e.get(i14), i13);
                    }
                    try {
                        ec0 ec0Var3 = (ec0) this.f115002b;
                        ec0Var3.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i13));
                            ec0Var3.f110306b.getWritableDatabase().update(ec0Var3.f110305a, contentValues, ec0.f110303e, null);
                        } catch (Throwable th4) {
                            throw new i30(th4);
                        }
                    } catch (IOException e13) {
                        uf1.b("DownloadManager", uf1.a("Failed to set manual stop reason", e13));
                    }
                    break;
                }
                b();
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 4:
                this.f115009i = message.arg1;
                b();
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 5:
                this.f115010j = message.arg1;
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 6:
                wi0 wi0Var = (wi0) message.obj;
                int i15 = message.arg1;
                oi0 oi0VarA2 = a(wi0Var.f117459b, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (oi0VarA2 != null) {
                    int i16 = oi0VarA2.f114326b;
                    long j10 = (i16 == 5 || i16 == 3 || i16 == 4) ? jCurrentTimeMillis : oi0VarA2.f114327c;
                    if (i16 != 5 && i16 != 7) {
                        i10 = i15 != 0 ? 1 : 0;
                    }
                    wi0 wi0Var2 = oi0VarA2.f114325a;
                    if (!wi0Var2.f117459b.equals(wi0Var.f117459b)) {
                        throw new IllegalArgumentException();
                    }
                    if (wi0Var2.f117462e.isEmpty() || wi0Var.f117462e.isEmpty()) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = new ArrayList(wi0Var2.f117462e);
                        for (int i17 = 0; i17 < wi0Var.f117462e.size(); i17++) {
                            h13 h13Var = (h13) wi0Var.f117462e.get(i17);
                            if (!arrayList.contains(h13Var)) {
                                arrayList.add(h13Var);
                            }
                        }
                    }
                    a(new oi0(new wi0(wi0Var2.f117459b, wi0Var.f117460c, wi0Var.f117461d, arrayList, wi0Var.f117463f, wi0Var.f117464g, wi0Var.f117465h), i10, j10, jCurrentTimeMillis, -1L, i15, 0, new ui0()));
                } else {
                    a(new oi0(wi0Var, i15 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i15, 0, new ui0()));
                }
                b();
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 7:
                String str3 = (String) message.obj;
                oi0 oi0VarA3 = a(str3, true);
                if (oi0VarA3 == null) {
                    uf1.b("DownloadManager", "Failed to remove nonexistent download: " + str3);
                } else {
                    a(oi0VarA3, 5, 0);
                    b();
                }
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 8:
                a();
                i11 = 1;
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 9:
                si0 si0Var = (si0) message.obj;
                String str4 = si0Var.f115817b.f117459b;
                this.f115006f.remove(str4);
                boolean z10 = si0Var.f115820e;
                if (!z10) {
                    int i18 = this.f115011k - 1;
                    this.f115011k = i18;
                    if (i18 == 0) {
                        removeMessages(11);
                    }
                }
                if (si0Var.f115823h) {
                    b();
                } else {
                    Exception exc = si0Var.f115824i;
                    if (exc != null) {
                        uf1.b("DownloadManager", uf1.a("Task failed: " + si0Var.f115817b + ", " + z10, exc));
                    }
                    oi0 oi0VarA4 = a(str4, false);
                    oi0VarA4.getClass();
                    int i19 = oi0VarA4.f114326b;
                    if (i19 == 2) {
                        if (z10) {
                            throw new IllegalStateException();
                        }
                        oi0 oi0Var = new oi0(oi0VarA4.f114325a, exc == null ? 3 : 4, oi0VarA4.f114327c, System.currentTimeMillis(), oi0VarA4.f114329e, oi0VarA4.f114330f, exc == null ? 0 : 1, oi0VarA4.f114332h);
                        this.f115005e.remove(a(oi0Var.f114325a.f117459b));
                        try {
                            ((ec0) this.f115002b).a(oi0Var);
                        } catch (IOException e14) {
                            uf1.b("DownloadManager", uf1.a("Failed to update index.", e14));
                        }
                        this.f115004d.obtainMessage(2, new pi0(oi0Var, false, new ArrayList(this.f115005e), exc)).sendToTarget();
                        break;
                    } else {
                        if (i19 != 5 && i19 != 7) {
                            throw new IllegalStateException();
                        }
                        if (!z10) {
                            throw new IllegalStateException();
                        }
                        if (i19 == 7) {
                            int i20 = oi0VarA4.f114330f;
                            a(oi0VarA4, i20 == 0 ? 0 : 1, i20);
                            b();
                        } else {
                            this.f115005e.remove(a(oi0VarA4.f114325a.f117459b));
                            try {
                                tm3 tm3Var = this.f115002b;
                                str = oi0VarA4.f114325a.f117459b;
                                ec0Var = (ec0) tm3Var;
                                ec0Var.a();
                            } catch (IOException unused) {
                                uf1.b("DownloadManager", "Failed to remove from database");
                            }
                            try {
                                ec0Var.f110306b.getWritableDatabase().delete(ec0Var.f110305a, "id = ?", new String[]{str});
                                this.f115004d.obtainMessage(2, new pi0(oi0VarA4, true, new ArrayList(this.f115005e), null)).sendToTarget();
                            } catch (Throwable th5) {
                                throw new i30(th5);
                            }
                        }
                    }
                    b();
                }
                this.f115004d.obtainMessage(1, i11, this.f115006f.size()).sendToTarget();
                return;
            case 10:
                si0 si0Var2 = (si0) message.obj;
                int i21 = message.arg1;
                int i22 = message.arg2;
                int i23 = w83.f117341a;
                long j11 = ((((long) i21) & 4294967295L) << 32) | (4294967295L & ((long) i22));
                oi0 oi0VarA5 = a(si0Var2.f115817b.f117459b, false);
                oi0VarA5.getClass();
                if (j11 == oi0VarA5.f114329e || j11 == -1) {
                    return;
                }
                a(new oi0(oi0VarA5.f114325a, oi0VarA5.f114326b, oi0VarA5.f114327c, System.currentTimeMillis(), j11, oi0VarA5.f114330f, oi0VarA5.f114331g, oi0VarA5.f114332h));
                return;
            case 11:
                for (int i24 = 0; i24 < this.f115005e.size(); i24++) {
                    oi0 oi0Var2 = (oi0) this.f115005e.get(i24);
                    if (oi0Var2.f114326b == 2) {
                        try {
                            ((ec0) this.f115002b).a(oi0Var2);
                        } catch (IOException e15) {
                            uf1.b("DownloadManager", uf1.a("Failed to update index.", e15));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f115006f.values().iterator();
                while (it.hasNext()) {
                    ((si0) it.next()).a(true);
                }
                try {
                    ((ec0) this.f115002b).b();
                    break;
                } catch (IOException e16) {
                    uf1.b("DownloadManager", uf1.a("Failed to update index.", e16));
                }
                this.f115005e.clear();
                this.f115001a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final oi0 a(String str, boolean z10) {
        int iA = a(str);
        if (iA != -1) {
            return (oi0) this.f115005e.get(iA);
        }
        if (!z10) {
            return null;
        }
        try {
            return ((ec0) this.f115002b).b(str);
        } catch (IOException e10) {
            uf1.b("DownloadManager", uf1.a("Failed to load download: " + str, e10));
            return null;
        }
    }

    public final int a(String str) {
        for (int i10 = 0; i10 < this.f115005e.size(); i10++) {
            if (((oi0) this.f115005e.get(i10)).f114325a.f117459b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final oi0 a(oi0 oi0Var) {
        int i10 = oi0Var.f114326b;
        if (i10 != 3 && i10 != 4) {
            int iA = a(oi0Var.f114325a.f117459b);
            if (iA == -1) {
                this.f115005e.add(oi0Var);
                Collections.sort(this.f115005e, new xf0());
            } else {
                boolean z10 = oi0Var.f114327c != ((oi0) this.f115005e.get(iA)).f114327c;
                this.f115005e.set(iA, oi0Var);
                if (z10) {
                    Collections.sort(this.f115005e, new xf0());
                }
            }
            try {
                ((ec0) this.f115002b).a(oi0Var);
            } catch (IOException e10) {
                uf1.b("DownloadManager", uf1.a("Failed to update index.", e10));
            }
            this.f115004d.obtainMessage(2, new pi0(oi0Var, false, new ArrayList(this.f115005e), null)).sendToTarget();
            return oi0Var;
        }
        throw new IllegalStateException();
    }

    public final oi0 a(oi0 oi0Var, int i10, int i11) {
        if (i10 != 3 && i10 != 4) {
            return a(new oi0(oi0Var.f114325a, i10, oi0Var.f114327c, System.currentTimeMillis(), oi0Var.f114329e, i11, 0, oi0Var.f114332h));
        }
        throw new IllegalStateException();
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        try {
            int[] iArr = {3, 4};
            ec0 ec0Var = (ec0) this.f115002b;
            ec0Var.a();
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(iArr[i10]);
            }
            sb2.append(')');
            Cursor cursorA = ec0Var.a(sb2.toString(), (String[]) null);
            while (cursorA.moveToPosition(cursorA.getPosition() + 1)) {
                try {
                    arrayList.add(ec0.a(cursorA));
                } finally {
                }
            }
            cursorA.close();
        } catch (IOException unused) {
            uf1.b("DownloadManager", "Failed to load downloads.");
        }
        for (int i11 = 0; i11 < this.f115005e.size(); i11++) {
            ArrayList arrayList2 = this.f115005e;
            oi0 oi0Var = (oi0) arrayList2.get(i11);
            arrayList2.set(i11, new oi0(oi0Var.f114325a, 5, oi0Var.f114327c, System.currentTimeMillis(), oi0Var.f114329e, 0, 0, oi0Var.f114332h));
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ArrayList arrayList3 = this.f115005e;
            oi0 oi0Var2 = (oi0) arrayList.get(i12);
            arrayList3.add(new oi0(oi0Var2.f114325a, 5, oi0Var2.f114327c, System.currentTimeMillis(), oi0Var2.f114329e, 0, 0, oi0Var2.f114332h));
        }
        Collections.sort(this.f115005e, new xf0());
        try {
            ((ec0) this.f115002b).c();
        } catch (IOException e10) {
            uf1.b("DownloadManager", uf1.a("Failed to update index.", e10));
        }
        ArrayList arrayList4 = new ArrayList(this.f115005e);
        for (int i13 = 0; i13 < this.f115005e.size(); i13++) {
            this.f115004d.obtainMessage(2, new pi0((oi0) this.f115005e.get(i13), false, arrayList4, null)).sendToTarget();
        }
        b();
    }

    public final void a(oi0 oi0Var, int i10) {
        if (i10 == 0) {
            if (oi0Var.f114326b == 1) {
                a(oi0Var, 0, 0);
            }
        } else if (i10 != oi0Var.f114330f) {
            int i11 = oi0Var.f114326b;
            if (i11 == 0 || i11 == 2) {
                i11 = 1;
            }
            a(new oi0(oi0Var.f114325a, i11, oi0Var.f114327c, System.currentTimeMillis(), oi0Var.f114329e, i10, 0, oi0Var.f114332h));
        }
    }
}
