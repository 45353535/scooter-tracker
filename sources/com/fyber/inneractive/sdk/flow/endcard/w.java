package com.fyber.inneractive.sdk.flow.endcard;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f20724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f20725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f20726e;

    public w(v vVar) {
        super(vVar);
        ImageView imageView = new ImageView(IAConfigManager.O.f20316v.a());
        imageView.setId(R.id.ia_inneractive_vast_endcard_static);
        this.f20725d = imageView;
        this.f20726e = a.a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f20726e;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        com.fyber.inneractive.sdk.util.v.a(b());
        Bitmap bitmap = this.f20724c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f20724c = null;
        this.f20725d.setImageBitmap(null);
    }
}
