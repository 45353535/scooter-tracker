package sg.bigo.ads.ad.c;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ImageView f100401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.ad.b.b f100402b;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar) {
        ImageView imageView;
        Context context;
        this.f100402b = bVar;
        if (bVar == null || (context = bVar.f100335b.f102179f) == null) {
            imageView = null;
        } else {
            imageView = new ImageView(context);
            int iA = e.a(context, 38);
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iA, iA));
            imageView.setVisibility(8);
        }
        this.f100401a = imageView;
    }

    public final void a() {
        ImageView imageView = this.f100401a;
        if (imageView != null) {
            u.b(imageView);
            this.f100401a = null;
        }
        sg.bigo.ads.ad.b.b bVar = this.f100402b;
        if (bVar != null) {
            bVar.destroy();
            this.f100402b = null;
        }
    }
}
