package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC4041sn implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg.v f39561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f39562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39563c;

    public ViewOnAttachStateChangeListenerC4041sn(gg.v vVar, View view, ViewGroup viewGroup) {
        this.f39561a = vVar;
        this.f39562b = view;
        this.f39563c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f39561a.e(Boolean.valueOf(AbstractC4116vn.a(this.f39562b, this.f39563c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.f39561a.e(Boolean.FALSE);
    }
}
