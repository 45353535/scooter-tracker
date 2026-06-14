package s;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q.q;
import s.i;
import vh.x;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f99506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99507b;

    public static final class a implements i.a {
        private final boolean c(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "content");
        }

        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, y.m mVar, o.e eVar) {
            if (c(uri)) {
                return new e(uri, mVar);
            }
            return null;
        }
    }

    public e(Uri uri, y.m mVar) {
        this.f99506a = uri;
        this.f99507b = mVar;
    }

    private final Bundle d() {
        z.c cVarB = this.f99507b.n().b();
        c.a aVar = cVarB instanceof c.a ? (c.a) cVarB : null;
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f119120a;
        z.c cVarA = this.f99507b.n().a();
        c.a aVar2 = cVarA instanceof c.a ? (c.a) cVarA : null;
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.f119120a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    @Override // s.i
    public Object a(Continuation continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.f99507b.g().getContentResolver();
        if (b(this.f99506a)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f99506a, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f99506a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f99506a)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.f99506a);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f99506a + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.f99506a, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f99506a + "'.").toString());
            }
        }
        return new m(q.b(x.d(x.k(inputStreamOpenInputStream)), this.f99507b.g(), new q.e(this.f99506a)), contentResolver.getType(this.f99506a), q.f.DISK);
    }

    public final boolean b(Uri uri) {
        return Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean c(Uri uri) {
        List<String> pathSegments;
        int size;
        return Intrinsics.areEqual(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.areEqual(pathSegments.get(size + (-3)), "audio") && Intrinsics.areEqual(pathSegments.get(size + (-2)), "albums");
    }
}
