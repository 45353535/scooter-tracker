package oa;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lb.t;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f96584s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f96585t = new a(new a.InterfaceC1112a() { // from class: oa.k
        @Override // oa.m.a.InterfaceC1112a
        public final Constructor getConstructor() {
            return m.h();
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a f96586u = new a(new a.InterfaceC1112a() { // from class: oa.l
        @Override // oa.m.a.InterfaceC1112a
        public final Constructor getConstructor() {
            return m.i();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f96587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f96588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f96593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f96594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f96595j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f96597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImmutableList f96598m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f96602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f96603r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f96596k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f96599n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t.a f96601p = new lb.h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f96600o = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1112a f96604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f96605b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor f96606c;

        /* JADX INFO: renamed from: oa.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC1112a {
            Constructor getConstructor();
        }

        public a(InterfaceC1112a interfaceC1112a) {
            this.f96604a = interfaceC1112a;
        }

        private Constructor b() {
            synchronized (this.f96605b) {
                if (this.f96605b.get()) {
                    return this.f96606c;
                }
                try {
                    return this.f96604a.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.f96605b.set(true);
                    return this.f96606c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public r a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (r) constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void e(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new vb.b());
                break;
            case 1:
                list.add(new vb.e());
                break;
            case 2:
                list.add(new vb.h(this.f96589d | (this.f96587b ? 1 : 0) | (this.f96588c ? 2 : 0)));
                break;
            case 3:
                list.add(new pa.b(this.f96590e | (this.f96587b ? 1 : 0) | (this.f96588c ? 2 : 0)));
                break;
            case 4:
                r rVarA = f96585t.a(Integer.valueOf(this.f96591f));
                if (rVarA == null) {
                    list.add(new ta.d(this.f96591f));
                } else {
                    list.add(rVarA);
                }
                break;
            case 5:
                list.add(new ua.c());
                break;
            case 6:
                list.add(new gb.e(this.f96601p, (this.f96600o ? 0 : 2) | this.f96592g));
                break;
            case 7:
                list.add(new hb.f(this.f96595j | (this.f96587b ? 1 : 0) | (this.f96588c ? 2 : 0)));
                break;
            case 8:
                list.add(new ib.h(this.f96601p, this.f96594i | ib.h.h(this.f96602q) | (this.f96600o ? 0 : 32)));
                list.add(new ib.n(this.f96601p, this.f96593h | ib.n.i(this.f96602q) | (this.f96600o ? 0 : 16)));
                break;
            case 9:
                list.add(new jb.d());
                break;
            case 10:
                list.add(new vb.c0());
                break;
            case 11:
                if (this.f96598m == null) {
                    this.f96598m = ImmutableList.of();
                }
                list.add(new vb.k0(this.f96596k, !this.f96600o ? 1 : 0, this.f96601p, new q9.j0(0L), new vb.j(this.f96597l, this.f96598m), this.f96599n));
                break;
            case 12:
                list.add(new wb.b());
                break;
            case 14:
                list.add(new wa.a(this.f96603r));
                break;
            case 15:
                r rVarA2 = f96586u.a(new Object[0]);
                if (rVarA2 != null) {
                    list.add(rVarA2);
                }
                break;
            case 16:
                list.add(new qa.b(1 ^ (this.f96600o ? 1 : 0), this.f96601p));
                break;
            case 17:
                list.add(new kb.a());
                break;
            case 18:
                list.add(new xb.a());
                break;
            case 19:
                list.add(new sa.a());
                break;
            case 20:
                int i11 = this.f96593h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new va.a());
                    break;
                }
                break;
            case 21:
                list.add(new ra.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor h() {
        if (Boolean.TRUE.equals(Class.forName("io.bidmachine.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("io.bidmachine.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor i() {
        return Class.forName("io.bidmachine.media3.decoder.midi.MidiExtractor").asSubclass(r.class).getConstructor(null);
    }

    @Override // oa.x
    public synchronized r[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    @Override // oa.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized m b(int i10) {
        this.f96602q = i10;
        return this;
    }

    @Override // oa.x
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized m experimentalSetTextTrackTranscodingEnabled(boolean z10) {
        this.f96600o = z10;
        return this;
    }

    public synchronized m j(int i10) {
        this.f96603r = i10;
        return this;
    }

    @Override // oa.x
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized m a(t.a aVar) {
        this.f96601p = aVar;
        return this;
    }

    @Override // oa.x
    public synchronized r[] createExtractors(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f96584s;
            arrayList = new ArrayList(iArr.length);
            int iB = n9.m.b(map);
            if (iB != -1) {
                e(iB, arrayList);
            }
            int iC = n9.m.c(uri);
            if (iC != -1 && iC != iB) {
                e(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    e(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (r[]) arrayList.toArray(new r[arrayList.size()]);
    }
}
