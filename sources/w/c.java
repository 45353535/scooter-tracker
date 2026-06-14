package w;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c0.q;
import coil.memory.MemoryCache;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t.a;
import t.b;
import y.m;
import y.o;
import y.p;
import z.c;
import z.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106911c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.e f106912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f106913b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(o.e eVar, o oVar, q qVar) {
        this.f106912a = eVar;
        this.f106913b = oVar;
    }

    private final String b(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean e(y.h hVar, MemoryCache.Key key, MemoryCache.b bVar, i iVar, z.h hVar2) {
        boolean z10;
        double d10;
        int i10;
        boolean zD = d(bVar);
        if (z.b.a(iVar)) {
            return !zD;
        }
        String str = (String) key.getExtras().get("coil#transformation_size");
        if (str != null) {
            return Intrinsics.areEqual(str, iVar.toString());
        }
        int width = bVar.a().getWidth();
        int height = bVar.a().getHeight();
        z.c cVarB = iVar.b();
        int i11 = cVarB instanceof c.a ? ((c.a) cVarB).f119120a : Integer.MAX_VALUE;
        z.c cVarA = iVar.a();
        int i12 = cVarA instanceof c.a ? ((c.a) cVarA).f119120a : Integer.MAX_VALUE;
        double dC = q.h.c(width, height, i11, i12, hVar2);
        boolean zA = c0.h.a(hVar);
        if (zA) {
            double dH = kotlin.ranges.g.h(dC, 1.0d);
            d10 = 1.0d;
            z10 = false;
            if (Math.abs(((double) i11) - (((double) width) * dH)) <= 1.0d || Math.abs(((double) i12) - (dH * ((double) height))) <= 1.0d) {
                return true;
            }
        } else {
            z10 = false;
            d10 = 1.0d;
            if (c0.i.s(i11)) {
                i10 = 1;
            } else {
                i10 = 1;
                if (Math.abs(i11 - width) <= 1) {
                }
            }
            if (c0.i.s(i12) || Math.abs(i12 - height) <= i10) {
                return i10;
            }
        }
        if (dC != d10 && !zA) {
            return z10;
        }
        if (dC <= d10 || !zD) {
            return true;
        }
        return z10;
    }

    public final MemoryCache.b a(y.h hVar, MemoryCache.Key key, i iVar, z.h hVar2) {
        if (!hVar.C().g()) {
            return null;
        }
        MemoryCache memoryCacheD = this.f106912a.d();
        MemoryCache.b bVarB = memoryCacheD != null ? memoryCacheD.b(key) : null;
        if (bVarB == null || !c(hVar, key, bVarB, iVar, hVar2)) {
            return null;
        }
        return bVarB;
    }

    public final boolean c(y.h hVar, MemoryCache.Key key, MemoryCache.b bVar, i iVar, z.h hVar2) {
        if (this.f106913b.c(hVar, c0.a.c(bVar.a()))) {
            return e(hVar, key, bVar, iVar, hVar2);
        }
        return false;
    }

    public final MemoryCache.Key f(y.h hVar, Object obj, m mVar, o.c cVar) {
        MemoryCache.Key keyB = hVar.B();
        if (keyB != null) {
            return keyB;
        }
        cVar.p(hVar, obj);
        String strF = this.f106912a.getComponents().f(obj, mVar);
        cVar.k(hVar, strF);
        if (strF == null) {
            return null;
        }
        List listO = hVar.O();
        Map mapE = hVar.E().e();
        if (listO.isEmpty() && mapE.isEmpty()) {
            return new MemoryCache.Key(strF, null, 2, null);
        }
        Map mutableMap = MapsKt.toMutableMap(mapE);
        if (!listO.isEmpty()) {
            List listO2 = hVar.O();
            if (listO2.size() > 0) {
                androidx.privacysandbox.ads.adservices.topics.a.a(listO2.get(0));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("coil#transformation_");
                sb2.append(0);
                throw null;
            }
            mutableMap.put("coil#transformation_size", mVar.n().toString());
        }
        return new MemoryCache.Key(strF, mutableMap);
    }

    public final p g(b.a aVar, y.h hVar, MemoryCache.Key key, MemoryCache.b bVar) {
        return new p(new BitmapDrawable(hVar.l().getResources(), bVar.a()), hVar, q.f.MEMORY_CACHE, key, b(bVar), d(bVar), c0.i.t(aVar));
    }

    public final boolean h(MemoryCache.Key key, y.h hVar, a.b bVar) {
        MemoryCache memoryCacheD;
        Bitmap bitmap;
        if (hVar.C().h() && (memoryCacheD = this.f106912a.d()) != null && key != null) {
            Drawable drawableE = bVar.e();
            BitmapDrawable bitmapDrawable = drawableE instanceof BitmapDrawable ? (BitmapDrawable) drawableE : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar.f()));
                String strD = bVar.d();
                if (strD != null) {
                    linkedHashMap.put("coil#disk_cache_key", strD);
                }
                memoryCacheD.c(key, new MemoryCache.b(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
