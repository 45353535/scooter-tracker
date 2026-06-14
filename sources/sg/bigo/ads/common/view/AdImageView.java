package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.d;

/* JADX INFO: loaded from: classes4.dex */
public class AdImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.common.p.b f102852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f102853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102854c;

    public AdImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBitmapInternal(Bitmap bitmap) {
        if (this.f102854c) {
            d.a(this, bitmap);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    private void setImageBitmapWithGradient(Bitmap bitmap) {
        d.a(bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.common.view.AdImageView.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                final Bitmap bitmap3 = bitmap2;
                AdImageView.this.post(new Runnable() { // from class: sg.bigo.ads.common.view.AdImageView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdImageView.this.setImageBitmapInternal(bitmap3);
                    }
                });
            }
        });
    }

    public final void a() {
        this.f102852a.f102654c.clear();
    }

    public void setBlurBorder(boolean z10) {
        this.f102853b = z10;
    }

    public void setFadeEnable(boolean z10) {
        this.f102854c = z10;
    }

    public void setIconTag(boolean z10) {
        sg.bigo.ads.common.p.b bVar = this.f102852a;
        if (bVar != null) {
            bVar.f102653b = z10;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (!this.f102853b || bitmap == null) {
            setImageBitmapInternal(bitmap);
        } else {
            setImageBitmapWithGradient(bitmap);
        }
    }

    public AdImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(String str, boolean z10) {
        a(null, str, z10);
    }

    public AdImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102853b = false;
        this.f102854c = false;
        this.f102852a = new sg.bigo.ads.common.p.b(this);
    }

    public final void a(@Nullable Executor executor, String str, boolean z10) {
        this.f102852a.a(executor, str, z10);
    }

    public final void a(g gVar) {
        this.f102852a.a(gVar);
    }
}
