package sg.bigo.ads.common.h.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f102511b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap<String, CopyOnWriteArrayList<e>> f102512a = new HashMap<>();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.b.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f102513a;

        static {
            int[] iArr = new int[h.a().length];
            f102513a = iArr;
            try {
                iArr[h.f102515a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102513a[h.f102516b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102513a[h.f102517c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102513a[h.f102518d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102513a[h.f102519e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102513a[h.f102520f - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102513a[h.f102521g - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    f() {
    }

    protected static f a() {
        return f102511b;
    }

    protected final void b(String str) {
        if (!this.f102512a.containsKey(str) || this.f102512a.get(str) == null) {
            return;
        }
        this.f102512a.get(str).clear();
    }

    public final void a(String str) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        a aVarC;
        if (!this.f102512a.containsKey(str) || (copyOnWriteArrayList = this.f102512a.get(str)) == null || (aVarC = i.c(str)) == null) {
            return;
        }
        a(aVarC, copyOnWriteArrayList);
    }

    private void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if (this.f102512a.containsKey(str) && (copyOnWriteArrayList = this.f102512a.get(str)) != null && copyOnWriteArrayList.contains(eVar)) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    private void a(a aVar, CopyOnWriteArrayList<e> copyOnWriteArrayList) {
        switch (AnonymousClass1.f102513a[aVar.f102504e - 1]) {
            case 1:
                Iterator<e> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                Iterator<e> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                break;
            case 3:
                Iterator<e> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().a(aVar.f102500a);
                }
                break;
            case 4:
                for (e eVar : copyOnWriteArrayList) {
                    String str = aVar.f102500a;
                    j.a(aVar.f102503d);
                    eVar.b(str);
                }
                break;
            case 5:
                Iterator<e> it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    it4.next().c(aVar.f102500a);
                }
                break;
            case 6:
                for (e eVar2 : copyOnWriteArrayList) {
                    eVar2.d(aVar.f102500a);
                    a(aVar.f102500a, eVar2);
                }
                break;
            case 7:
                for (e eVar3 : copyOnWriteArrayList) {
                    eVar3.a(aVar.f102500a, aVar.f102505f, aVar.f102501b.f102463g);
                    a(aVar.f102500a, eVar3);
                }
                break;
        }
    }
}
