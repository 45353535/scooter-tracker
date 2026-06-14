package com.bykv.vk.openvk.qdl.qdl.qdl.mo;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends mzz implements SurfaceHolder.Callback, ud {
    private static final ArrayList<mo> lnr = new ArrayList<>();
    private ud.qdl mml;
    private WeakReference<qdl> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private mo f15910ud;

    public lnr(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        mo moVar = new mo(this);
        this.f15910ud = moVar;
        lnr.add(moVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(ud.qdl qdlVar) {
        this.mml = qdlVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference<qdl> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().qdl(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<qdl> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().qdl(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<qdl> weakReference = this.qdl;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.qdl.get().ud(surfaceHolder);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public void qdl(qdl qdlVar) {
        this.qdl = new WeakReference<>(qdlVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<mo> it = lnr.iterator();
        while (it.hasNext()) {
            mo next = it.next();
            if (next != null && next.qdl() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f15910ud);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public void qdl(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
