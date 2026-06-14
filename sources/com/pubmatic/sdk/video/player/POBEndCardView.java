package com.pubmatic.sdk.video.player;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.R$id;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$dimen;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;

/* JADX INFO: loaded from: classes11.dex */
public class POBEndCardView extends POBVastHTMLView<POBAdDescriptor> implements POBEndCardRendering, POBHtmlRendererListener, View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.pubmatic.sdk.video.player.a f62998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBAdDescriptor f63000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f63001f;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBEndCardView.this.f62998c != null) {
                POBEndCardView.this.f62998c.b();
            }
        }
    }

    public POBEndCardView(@NonNull Context context) {
        super(context);
        setBackgroundColor(getResources().getColor(R.color.black));
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public FrameLayout getView() {
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.pubmatic.sdk.video.player.a aVar;
        if (this.f63000e != null || (aVar = this.f62998c) == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.OnRenderProcessGoneListener
    public void onRenderProcessGone() {
        View view = this.f63001f;
        if (view != null) {
            removeView(view);
            this.f63001f = null;
        }
        a(new POBVastError(602, "End-card failed to render."));
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewClicked(@Nullable String str) {
        if (this.f62998c != null) {
            if (str == null || !"https://obplaceholder.click.com/".contentEquals(str)) {
                this.f62998c.a(str, false);
            } else {
                this.f62998c.a(null, false);
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRendered(@NonNull View view) {
        this.f63001f = view;
        if (getChildCount() != 0 || this.f63000e == null) {
            return;
        }
        com.pubmatic.sdk.video.player.a aVar = this.f62998c;
        if (aVar != null) {
            aVar.a();
        }
        POBEndCardUtil.updateEndCardView(view, this, this.f63000e);
        addView(view);
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRenderingFailed(@NonNull POBError pOBError) {
        a(new POBVastError(602, "End-card failed to render."));
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void render(@Nullable POBAdDescriptor pOBAdDescriptor) {
        this.f63000e = pOBAdDescriptor;
        if (pOBAdDescriptor == null) {
            a();
            return;
        }
        POBLog.debug("POBEndCardView", "Suitable end-card found.", new Object[0]);
        if (!POBNetworkMonitor.isNetworkAvailable(getContext())) {
            a(new POBVastError(602, "End-card failed to render due to network connectivity."));
        } else {
            if (renderVastHTMLView(pOBAdDescriptor)) {
                return;
            }
            a(new POBVastError(604, "No supported resource found for end-card."));
        }
    }

    void setFSCEnabled(boolean z10) {
        setOnClickListener(z10 ? this : null);
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setLearnMoreTitle(@NonNull String str) {
        this.f62999d = str;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setListener(@Nullable com.pubmatic.sdk.video.player.a aVar) {
        this.f62998c = aVar;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setOnSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setSkipAfter(int i10) {
    }

    private void a() {
        POBLog.debug("POBEndCardView", "Rendering Learn More button on end-card.", new Object[0]);
        Resources resources = getResources();
        setBackgroundColor(resources.getColor(R.color.transparent));
        View viewA = b.a(getContext(), R$id.pob_learn_more_btn, this.f62999d, resources.getColor(R$color.pob_controls_background_color));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(com.pubmatic.sdk.video.R$dimen.pob_end_card_learn_more__bottom_margin);
        addView(viewA, layoutParams);
        viewA.setOnClickListener(new a());
    }

    private void a(POBVastError pOBVastError) {
        com.pubmatic.sdk.video.player.a aVar = this.f62998c;
        if (aVar != null) {
            aVar.a(pOBVastError);
        }
        a();
    }
}
