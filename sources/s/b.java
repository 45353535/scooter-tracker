package s;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.coroutines.Continuation;
import s.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f99502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99503b;

    public static final class a implements i.a {
        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Bitmap bitmap, y.m mVar, o.e eVar) {
            return new b(bitmap, mVar);
        }
    }

    public b(Bitmap bitmap, y.m mVar) {
        this.f99502a = bitmap;
        this.f99503b = mVar;
    }

    @Override // s.i
    public Object a(Continuation continuation) {
        return new g(new BitmapDrawable(this.f99503b.g().getResources(), this.f99502a), false, q.f.MEMORY);
    }
}
