package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.player.POBVastHTMLView;
import com.pubmatic.sdk.video.vastmodels.POBIcon;

/* JADX INFO: loaded from: classes11.dex */
public class POBIconView extends POBVastHTMLView<POBIcon> implements POBHtmlRendererListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBVastHTMLView.b f63003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f63004d;

    public POBIconView(@NonNull Context context) {
        super(context);
    }

    void a(POBIcon pOBIcon) {
        POBVastHTMLView.b bVar;
        if (pOBIcon != null) {
            if (!POBNetworkMonitor.isNetworkAvailable(getContext())) {
                POBLog.debug("POBIconView", "Failed to render icon due to network connectivity issue.", new Object[0]);
            } else {
                if (renderVastHTMLView(pOBIcon) || (bVar = this.f63003c) == null) {
                    return;
                }
                bVar.a(new POBVastError(900, "Unable to render Icon due to invalid details."));
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.OnRenderProcessGoneListener
    public void onRenderProcessGone() {
        removeAllViews();
        this.f63004d = null;
        POBVastHTMLView.b bVar = this.f63003c;
        if (bVar != null) {
            bVar.a(new POBVastError(900, "Failed to render icon."));
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewClicked(@Nullable String str) {
        if (this.f63003c == null || str == null) {
            return;
        }
        if ("https://obplaceholder.click.com/".contentEquals(str)) {
            this.f63003c.a((String) null);
        } else {
            this.f63003c.a(str);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRendered(@NonNull View view) {
        this.f63004d = view;
        if (getChildCount() == 0) {
            POBVastHTMLView.b bVar = this.f63003c;
            if (bVar != null) {
                bVar.a();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            addView(view, layoutParams);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRenderingFailed(@NonNull POBError pOBError) {
        POBVastHTMLView.b bVar = this.f63003c;
        if (bVar != null) {
            bVar.a(new POBVastError(900, "Failed to render icon."));
        }
    }

    void setListener(@NonNull POBVastHTMLView.b bVar) {
        this.f63003c = bVar;
    }
}
