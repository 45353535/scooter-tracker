package s;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import q.q;
import s.i;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f99500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99501b;

    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    public static final class C1187a implements i.a {
        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, y.m mVar, o.e eVar) {
            if (c0.i.q(uri)) {
                return new a(uri, mVar);
            }
            return null;
        }
    }

    public a(Uri uri, y.m mVar) {
        this.f99500a = uri;
        this.f99501b = mVar;
    }

    @Override // s.i
    public Object a(Continuation continuation) {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(this.f99500a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new m(q.b(x.d(x.k(this.f99501b.g().getAssets().open(strJoinToString$default))), this.f99501b.g(), new q.a(strJoinToString$default)), c0.i.j(MimeTypeMap.getSingleton(), strJoinToString$default), q.f.DISK);
    }
}
