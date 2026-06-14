package com.bykv.vk.openvk.qdl.qdl.qdl.mo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends TextureView implements TextureView.SurfaceTextureListener, ud {
    private qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ud.qdl f15911ud;

    public mml(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.qdl(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.qdl(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public void qdl(qdl qdlVar) {
        this.qdl = qdlVar;
        setSurfaceTextureListener(this);
    }

    public void setWindowVisibilityChangedListener(ud.qdl qdlVar) {
        this.f15911ud = qdlVar;
    }

    public mml(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud
    public void qdl(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }
}
