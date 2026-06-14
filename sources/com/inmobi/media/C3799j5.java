package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.C3799j5;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3799j5 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f38792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f38793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3799j5(Context context, byte b10, InterfaceC3878m9 interfaceC3878m9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38792a = b10;
        this.f38793b = interfaceC3878m9;
        int i10 = b10 == 0 ? 15 : (b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5 || b10 == 6) ? 30 : 0;
        try {
            Integer numA = a(b10);
            try {
                if (numA == null) {
                    if (interfaceC3878m9 != null) {
                        ((C3903n9) interfaceC3878m9).b("CustomView", "null drawable id while creating button - " + ((int) b10));
                        return;
                    }
                    return;
                }
                a(numA.intValue(), i10, i10, i10, i10);
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).c("CustomView", "new customView - " + ((int) b10) + " created");
                    return;
                }
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        InterfaceC3878m9 interfaceC3878m92 = this.f38793b;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("CustomView", "exception while building customView", exc);
        }
        Lazy lazy = P9.f37527a;
        AbstractC3779i9.a(exc);
    }

    public static Integer a(byte b10) {
        if (b10 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b10 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b10 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b10 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b10 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b10 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b10 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b10 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b10 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    public final void a(int i10, final int i11, final int i12, final int i13, final int i14) {
        C4148x5.f39893a.getClass();
        if (!C4148x5.w()) {
            eg.i.d(A9.f36558d, null, null, new C3775i5(this, i10, i11, i12, i13, i14, null), 3, null);
        } else {
            Icon.createWithResource(getContext(), i10).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: w3.k8
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C3799j5.a(this.f107141a, i11, i12, i13, i14, drawable);
                }
            }, ((Wb) AbstractC3925o6.f39166e.getValue()).f37946a);
        }
    }

    public static final void a(C3799j5 c3799j5, int i10, int i11, int i12, int i13, Drawable drawable) {
        if (drawable == null) {
            InterfaceC3878m9 interfaceC3878m9 = c3799j5.f38793b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("CustomView", "drawable for " + ((int) c3799j5.f38792a) + " is null");
                return;
            }
            return;
        }
        c3799j5.setImageDrawable(drawable);
        c3799j5.setPadding(i10, i11, i12, i13);
    }

    public final void a(final Drawable drawable, final int i10, final int i11, final int i12, final int i13) {
        post(new Runnable() { // from class: w3.j8
            @Override // java.lang.Runnable
            public final void run() {
                C3799j5.a(this.f107120b, drawable, i10, i11, i12, i13);
            }
        });
    }

    public static final void a(C3799j5 c3799j5, Drawable drawable, int i10, int i11, int i12, int i13) {
        c3799j5.setImageDrawable(drawable);
        c3799j5.setPadding(i10, i11, i12, i13);
    }
}
