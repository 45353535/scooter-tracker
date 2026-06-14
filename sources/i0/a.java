package i0;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import j0.c;
import j0.i;
import java.util.HashMap;
import java.util.Map;
import q0.g;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f73855d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f73852a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f73853b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f73854c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f73856e = ".ttf";

    public a(Drawable.Callback callback, d0.b bVar) {
        if (callback instanceof View) {
            this.f73855d = ((View) callback).getContext().getAssets();
        } else {
            g.c("LottieDrawable must be inside of a view for images to work.");
            this.f73855d = null;
        }
    }

    private Typeface a(c cVar) {
        String strA = cVar.a();
        Typeface typeface = (Typeface) this.f73854c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f73855d, "fonts/" + strA + this.f73856e);
        this.f73854c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f73852a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f73853b.get(this.f73852a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f73853b.put(this.f73852a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f73856e = str;
    }

    public void d(d0.b bVar) {
    }
}
