package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ImageView f102652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<WeakReference<g>> f102654c;

    public b(ImageView imageView) {
        this.f102653b = false;
        this.f102654c = new ArrayList();
        this.f102652a = imageView;
        imageView.setAdjustViewBounds(true);
    }

    private void a(String str) {
        try {
            int i10 = Integer.parseInt(str);
            ImageView imageView = this.f102652a;
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), i10));
        } catch (NumberFormatException unused) {
        }
    }

    private void b(final String str) {
        final WeakReference weakReference = new WeakReference(this.f102652a);
        final Context applicationContext = this.f102652a.getContext().getApplicationContext();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.common.p.b.3
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap bitmapA = b.this.f102653b ? sg.bigo.ads.common.utils.d.a(str) : sg.bigo.ads.common.utils.d.a(str, applicationContext);
                if (bitmapA == null) {
                    return;
                }
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.common.p.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageView imageView = (ImageView) weakReference.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmapA);
                        }
                    }
                });
            }
        });
    }

    public b(ImageView imageView, byte b10) {
        this.f102653b = false;
        this.f102654c = new ArrayList();
        this.f102652a = imageView;
        imageView.setAdjustViewBounds(true);
        this.f102653b = true;
    }

    private void b(@Nullable final Executor executor, final String str, final boolean z10) {
        final WeakReference weakReference = new WeakReference(this.f102652a);
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.common.p.b.1
            @Override // java.lang.Runnable
            public final void run() {
                final b bVar = b.this;
                Executor executor2 = executor;
                String str2 = str;
                boolean z11 = z10;
                final WeakReference weakReference2 = weakReference;
                g gVar = new g() { // from class: sg.bigo.ads.common.p.b.2
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str3, String str4) {
                        Iterator<WeakReference<g>> it = b.this.f102654c.iterator();
                        while (it.hasNext()) {
                            g gVar2 = it.next().get();
                            if (gVar2 != null) {
                                gVar2.a(i10, str3, str4);
                            }
                        }
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                        ImageView imageView = (ImageView) weakReference2.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                        Iterator<WeakReference<g>> it = b.this.f102654c.iterator();
                        while (it.hasNext()) {
                            g gVar2 = it.next().get();
                            if (gVar2 != null) {
                                gVar2.a(bitmap, fVar);
                            }
                        }
                    }
                };
                Context applicationContext = bVar.f102652a.getContext().getApplicationContext();
                if (bVar.f102653b) {
                    e.b(applicationContext, executor2, str2, z11, gVar);
                } else {
                    e.a(applicationContext, executor2, str2, z11, gVar);
                }
            }
        });
    }

    public final void a(@Nullable Executor executor, String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if ("res".equalsIgnoreCase(scheme)) {
            a(uri.getHost());
            return;
        }
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            b(executor, str, z10);
        } else if (C4240b4.i.f42616b.equalsIgnoreCase(scheme)) {
            b(uri.getPath());
        }
    }

    public final void a(g gVar) {
        if (gVar == null) {
            return;
        }
        this.f102654c.add(new WeakReference<>(gVar));
    }
}
