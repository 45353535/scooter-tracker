package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes11.dex */
final class TargetAction extends Action<Target> {
    TargetAction(Picasso picasso, Target target, Request request, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(picasso, target, request, i10, i11, i12, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        Target target = getTarget();
        if (target != null) {
            target.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.Action
    void error(Exception exc) {
        Target target = getTarget();
        if (target != null) {
            if (this.errorResId != 0) {
                target.onBitmapFailed(exc, this.picasso.context.getResources().getDrawable(this.errorResId));
            } else {
                target.onBitmapFailed(exc, this.errorDrawable);
            }
        }
    }
}
