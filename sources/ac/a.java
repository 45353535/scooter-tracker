package ac;

import android.content.Context;
import android.net.Uri;
import bc.a;
import bc.b;
import bc.d;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0005a f4185h = new C0005a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f4187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdProcessCallback f4188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f4189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f4190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f4191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f4192g;

    /* JADX INFO: renamed from: ac.a$a, reason: collision with other inner class name */
    public static final class C0005a {
        public /* synthetic */ C0005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0005a() {
        }
    }

    static final class b extends Lambda implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Uri) obj);
            return Unit.f93236a;
        }

        public final void invoke(Uri imagePath) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            a.this.f4190e.d(imagePath);
        }
    }

    static final class c extends Lambda implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Uri) obj);
            return Unit.f93236a;
        }

        public final void invoke(Uri imagePath) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            a.this.f4190e.e(imagePath);
        }
    }

    public static final class d implements a.InterfaceC0131a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f4195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f4196b;

        d(Function1 function1, a aVar) {
            this.f4195a = function1;
            this.f4196b = aVar;
        }

        @Override // bc.a.InterfaceC0131a
        public void a(bc.a task, Uri imagePath) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            this.f4195a.invoke(imagePath);
            this.f4196b.q(task);
        }

        @Override // bc.a.InterfaceC0131a
        public void b(bc.a task) {
            Intrinsics.checkNotNullParameter(task, "task");
            this.f4196b.q(task);
        }
    }

    public static final class e implements b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f4198b;

        e(Context context) {
            this.f4198b = context;
        }

        @Override // bc.b.a
        public void a(bc.b task, Uri videoFileUri, c9.g vastRequest) throws Throwable {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
            Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
            a.this.f4190e.c(vastRequest);
            a.this.f4190e.g(videoFileUri);
            a.this.r(this.f4198b, videoFileUri);
            a.this.q(task);
        }

        @Override // bc.b.a
        public void b(bc.b task) {
            Intrinsics.checkNotNullParameter(task, "task");
            a.this.q(task);
        }
    }

    public static final class f implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f4200b;

        f(Context context) {
            this.f4200b = context;
        }

        @Override // bc.d.a
        public void a(bc.d task, Uri videoFileUri) throws Throwable {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
            a.this.f4190e.g(videoFileUri);
            a.this.r(this.f4200b, videoFileUri);
            a.this.q(task);
        }

        @Override // bc.d.a
        public void b(bc.d task) {
            Intrinsics.checkNotNullParameter(task, "task");
            a.this.q(task);
        }
    }

    static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f4201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.f4201f = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ec.b invoke() {
            return ec.a.f69047a.a(h9.a.b(this.f4201f));
        }
    }

    public a(Context context, Object assetsHolder, h adRequestParameters, AdProcessCallback callback, i nativeData, l nativeMediaData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(adRequestParameters, "adRequestParameters");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(nativeData, "nativeData");
        Intrinsics.checkNotNullParameter(nativeMediaData, "nativeMediaData");
        this.f4186a = assetsHolder;
        this.f4187b = adRequestParameters;
        this.f4188c = callback;
        this.f4189d = nativeData;
        this.f4190e = nativeMediaData;
        this.f4191f = lf.i.a(new g(context));
        this.f4192g = new CopyOnWriteArrayList();
    }

    private final void d() {
        if (this.f4192g.isEmpty()) {
            p();
        }
    }

    private final void e(ImageData imageData) {
        g(imageData, new b());
    }

    private final void f(ImageData imageData) {
        g(imageData, new c());
    }

    private final void g(ImageData imageData, Function1 function1) {
        String remoteUrl;
        if (imageData == null || imageData.getImage() != null || (remoteUrl = imageData.getRemoteUrl()) == null || remoteUrl.length() == 0) {
            return;
        }
        this.f4192g.add(new bc.a(this.f4186a, k(), new d(function1, this), remoteUrl, null, 16, null));
    }

    private final void h(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f4192g.add(new bc.b(context, this.f4186a, k(), new e(context), str, null, 32, null));
    }

    private final void i(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f4192g.add(new bc.d(this.f4186a, k(), new f(context), str, null, 16, null));
    }

    private final ec.b k() {
        return (ec.b) this.f4191f.getValue();
    }

    private final boolean l() {
        try {
            if (m() && n()) {
                if (o()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
            return false;
        }
    }

    private final boolean m() {
        return (this.f4187b.a(MediaAssetType.Icon) && this.f4190e.getIconUri() == null && this.f4190e.h() == null) ? false : true;
    }

    private final boolean n() {
        return (this.f4187b.a(MediaAssetType.Image) && this.f4190e.i() == null && this.f4190e.b() == null) ? false : true;
    }

    private final boolean o() {
        if (this.f4187b.a(MediaAssetType.Video)) {
            return this.f4189d.hasVideo();
        }
        return true;
    }

    private final synchronized void p() {
        try {
            if (!this.f4187b.c() || l()) {
                this.f4188c.processLoadSuccess();
            } else {
                this.f4188c.processLoadFail(ae.a.i("Native assets are invalid"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Runnable runnable) {
        this.f4192g.remove(runnable);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Context context, Uri uri) throws Throwable {
        String path;
        ImageData mainImage = this.f4189d.getMainImage();
        String remoteUrl = mainImage != null ? mainImage.getRemoteUrl() : null;
        if (uri == null || (path = uri.getPath()) == null) {
            return;
        }
        if ((remoteUrl == null || remoteUrl.length() == 0) && new File(path).exists()) {
            File fileE0 = io.bidmachine.core.h.e0(context, uri, "native_video_thumb");
            this.f4190e.e(fileE0 != null ? td.b.k(fileE0) : null);
        }
    }

    private final void s(Context context) {
        String videoUrl = this.f4189d.getVideoUrl();
        String videoAdm = this.f4189d.getVideoAdm();
        if (this.f4187b.a(MediaAssetType.Icon)) {
            e(this.f4189d.getIcon());
        }
        if (this.f4187b.a(MediaAssetType.Image)) {
            f(this.f4189d.getMainImage());
        }
        if (this.f4187b.a(MediaAssetType.Video)) {
            if (videoUrl != null && videoUrl.length() != 0) {
                i(context, videoUrl);
            } else if (videoAdm != null && videoAdm.length() != 0) {
                h(context, videoAdm);
            }
        }
        if (this.f4192g.isEmpty()) {
            d();
            return;
        }
        Iterator it = this.f4192g.iterator();
        while (it.hasNext()) {
            cc.b.a().execute((Runnable) it.next());
        }
    }

    public final void j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        s(context);
        d();
    }
}
