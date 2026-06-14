package w;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106922c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f106923a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106924b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f106925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f106926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f106927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f106928d;

        public b(int i10, WeakReference weakReference, Map map, int i11) {
            this.f106925a = i10;
            this.f106926b = weakReference;
            this.f106927c = map;
            this.f106928d = i11;
        }

        public final WeakReference a() {
            return this.f106926b;
        }

        public final Map b() {
            return this.f106927c;
        }

        public final int c() {
            return this.f106925a;
        }

        public final int d() {
            return this.f106928d;
        }
    }

    private final void e() {
        int i10 = this.f106924b;
        this.f106924b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }

    @Override // w.h
    public synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // w.h
    public synchronized MemoryCache.b b(MemoryCache.Key key) {
        try {
            ArrayList arrayList = (ArrayList) this.f106923a.get(key);
            MemoryCache.b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) bVar2.a().get();
                MemoryCache.b bVar3 = bitmap != null ? new MemoryCache.b(bitmap, bVar2.b()) : null;
                if (bVar3 != null) {
                    bVar = bVar3;
                    break;
                }
                i10++;
            }
            e();
            return bVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // w.h
    public synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f106923a;
            Object arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = (b) arrayList2.get(i11);
                if (i10 < bVar2.d()) {
                    i11++;
                } else if (bVar2.c() == iIdentityHashCode && bVar2.a().get() == bitmap) {
                    arrayList2.set(i11, bVar);
                } else {
                    arrayList2.add(i11, bVar);
                }
            }
            e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        WeakReference weakReferenceA;
        this.f106924b = 0;
        Iterator it = this.f106923a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull((List) arrayList);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : (Bitmap) weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).a().get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
