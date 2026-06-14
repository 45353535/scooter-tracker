package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$attr;
import g7.c;
import k8.ww;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/core/player/DivVideoAttachable;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divImageStyle : i10);
    }

    public /* synthetic */ void a(DivPlayer divPlayer) {
        c.a(this, divPlayer);
    }

    public /* synthetic */ void b() {
        c.b(this);
    }

    @Nullable
    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return c.c(this);
    }

    public /* bridge */ /* synthetic */ void setScale(@NotNull ww wwVar) {
        c.d(this, wwVar);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z10) {
        c.e(this, z10);
    }

    public DivPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
