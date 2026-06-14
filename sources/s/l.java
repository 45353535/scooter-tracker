package s;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q.q;
import q.r;
import s.i;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f99534c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f99535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99536b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements i.a {
        private final boolean c(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "android.resource");
        }

        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, y.m mVar, o.e eVar) {
            if (c(uri)) {
                return new l(uri, mVar);
            }
            return null;
        }
    }

    public l(Uri uri, y.m mVar) {
        this.f99535a = uri;
        this.f99536b = mVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // s.i
    public Object a(Continuation continuation) {
        Integer intOrNull;
        String authority = this.f99535a.getAuthority();
        if (authority != null) {
            if (StringsKt.y0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.lastOrNull((List) this.f99535a.getPathSegments());
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    b(this.f99535a);
                    throw new lf.g();
                }
                int iIntValue = intOrNull.intValue();
                Context contextG = this.f99536b.g();
                Resources resources = Intrinsics.areEqual(authority, contextG.getPackageName()) ? contextG.getResources() : contextG.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strJ = c0.i.j(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.B0(charSequence, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null), charSequence.length()).toString());
                if (!Intrinsics.areEqual(strJ, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(q.b(x.d(x.k(resources.openRawResource(iIntValue, typedValue2))), contextG, new r(authority, iIntValue, typedValue2.density)), strJ, q.f.DISK);
                }
                Drawable drawableA = Intrinsics.areEqual(authority, contextG.getPackageName()) ? c0.d.a(contextG, iIntValue) : c0.d.d(contextG, resources, iIntValue);
                boolean zU = c0.i.u(drawableA);
                if (zU) {
                    drawableA = new BitmapDrawable(contextG.getResources(), c0.k.f6441a.a(drawableA, this.f99536b.f(), this.f99536b.n(), this.f99536b.m(), this.f99536b.c()));
                }
                return new g(drawableA, zU, q.f.DISK);
            }
        }
        b(this.f99535a);
        throw new lf.g();
    }
}
