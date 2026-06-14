package sg.bigo.ads.common.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(17)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f102295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RenderScript f102296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScriptIntrinsicBlur f102297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f102298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f102299e;

    @RequiresApi(api = 17)
    public b(Context context) {
        this.f102295a = context;
    }

    private boolean b() {
        return (this.f102296b == null || this.f102297c == null) ? false : true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f102297c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f102297c = null;
        }
        RenderScript renderScript = this.f102296b;
        if (renderScript != null) {
            renderScript.destroy();
            this.f102296b = null;
        }
        Allocation allocation = this.f102298d;
        if (allocation != null) {
            allocation.destroy();
            this.f102298d = null;
        }
        Allocation allocation2 = this.f102299e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f102299e = null;
        }
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            if (this.f102298d == null) {
                this.f102298d = Allocation.createFromBitmap(this.f102296b, bitmap);
            }
            if (this.f102299e == null) {
                this.f102299e = Allocation.createFromBitmap(this.f102296b, bitmap2);
            }
            this.f102298d.copyFrom(bitmap);
            this.f102297c.setInput(this.f102298d);
            this.f102297c.forEach(this.f102299e);
            this.f102299e.copyTo(bitmap2);
        }
    }

    public final boolean a(float f10) {
        if (!b()) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(this.f102295a);
                this.f102296b = renderScriptCreate;
                this.f102297c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.f102297c.setRadius(f10);
        return true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final boolean a(Bitmap bitmap, float f10) {
        if (!a(f10)) {
            return false;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f102296b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f102298d = allocationCreateFromBitmap;
        this.f102299e = Allocation.createTyped(this.f102296b, allocationCreateFromBitmap.getType());
        return true;
    }
}
