package yads;

import android.content.Context;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes4.dex */
public final class vg0 implements DivImageLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final px2 f117007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ag1 f117008b = new ag1();

    public vg0(Context context) {
        this.f117007a = j72.f112253c.a(context).a();
    }

    public static final void b(Ref$ObjectRef ref$ObjectRef) {
        t21 t21Var = (t21) ref$ObjectRef.f93280b;
        if (t21Var != null) {
            t21Var.a();
        }
    }

    public final LoadReference a(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.f117008b.a(new Runnable() { // from class: yads.qr0
            @Override // java.lang.Runnable
            public final void run() {
                vg0.a(ref$ObjectRef, this, str, divImageDownloadCallback);
            }
        });
        return new LoadReference() { // from class: yads.rr0
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                vg0.a(this.f115557a, ref$ObjectRef);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ Boolean hasSvgSupport() {
        return f7.a.a(this);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return f7.a.b(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return f7.a.c(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    public static final void a(Ref$ObjectRef ref$ObjectRef, vg0 vg0Var, String str, DivImageDownloadCallback divImageDownloadCallback) {
        ref$ObjectRef.f93280b = vg0Var.f117007a.a(str, new ug0(str, divImageDownloadCallback), 0, 0);
    }

    public static final void a(vg0 vg0Var, final Ref$ObjectRef ref$ObjectRef) {
        vg0Var.f117008b.a(new Runnable() { // from class: yads.sr0
            @Override // java.lang.Runnable
            public final void run() {
                vg0.b(ref$ObjectRef);
            }
        });
    }
}
