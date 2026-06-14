package s;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import s.i;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f99508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99509b;

    public static final class a implements i.a {
        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Drawable drawable, y.m mVar, o.e eVar) {
            return new f(drawable, mVar);
        }
    }

    public f(Drawable drawable, y.m mVar) {
        this.f99508a = drawable;
        this.f99509b = mVar;
    }

    @Override // s.i
    public Object a(Continuation continuation) {
        Drawable bitmapDrawable;
        boolean zU = c0.i.u(this.f99508a);
        if (zU) {
            bitmapDrawable = new BitmapDrawable(this.f99509b.g().getResources(), c0.k.f6441a.a(this.f99508a, this.f99509b.f(), this.f99509b.n(), this.f99509b.m(), this.f99509b.c()));
        } else {
            bitmapDrawable = this.f99508a;
        }
        return new g(bitmapDrawable, zU, q.f.MEMORY);
    }
}
