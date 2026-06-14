package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class C8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a f40478b;

    public interface a {
        void a(@NotNull gg ggVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40477a = "ISNNativeAdContainer";
    }

    private final gg a() {
        return new gg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    @Nullable
    public final a getListener$mediationsdk_release() {
        return this.f40478b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i10) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.f40477a, "onVisibilityChanged: " + i10);
        a aVar = this.f40478b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(this.f40477a, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f40478b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(@Nullable a aVar) {
        this.f40478b = aVar;
    }
}
