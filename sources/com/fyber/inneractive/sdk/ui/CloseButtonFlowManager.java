package com.fyber.inneractive.sdk.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.o;

/* JADX INFO: loaded from: classes7.dex */
public class CloseButtonFlowManager implements com.fyber.inneractive.sdk.flow.storepromo.observer.a, CloseButtonConfigurationChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f23796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f23797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f23798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f23799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f23800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23801f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CloseButtonConfiguration f23802g = new CloseButtonConfiguration(this);

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View viewFindViewById = inneractiveFullscreenAdActivity.findViewById(R.id.ia_fl_close_button);
        this.f23796a = viewFindViewById;
        this.f23797b = (TextView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_tv_close_button);
        View viewFindViewById2 = inneractiveFullscreenAdActivity.findViewById(R.id.ia_clickable_close_button);
        this.f23798c = viewFindViewById2;
        this.f23799d = (ImageView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_iv_close_button);
        this.f23800e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(R.id.close_button_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setOnClickListener(new a(inneractiveFullscreenAdActivity));
    }

    @Override // com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener
    public final void a(CloseButtonConfiguration closeButtonConfiguration) {
        int i10;
        int i11;
        if (closeButtonConfiguration.f23794f) {
            this.f23796a.setVisibility(8);
            this.f23797b.setVisibility(8);
            this.f23799d.setVisibility(8);
            this.f23798c.setVisibility(8);
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration2 = this.f23802g;
        if (closeButtonConfiguration2.f23790b) {
            if (!closeButtonConfiguration2.f23791c || this.f23801f) {
                this.f23796a.setAlpha(1.0f);
                this.f23799d.setAlpha(1.0f);
            } else {
                this.f23796a.setAlpha(0.0f);
                this.f23799d.setAlpha(0.0f);
            }
            this.f23797b.setText("");
            this.f23797b.setVisibility(8);
            int i12 = closeButtonConfiguration2.f23792d;
            if (i12 >= 5) {
                int iA = o.a(i12);
                this.f23799d.getLayoutParams().width = iA;
                this.f23799d.getLayoutParams().height = iA;
            }
            int i13 = closeButtonConfiguration2.f23793e;
            if (i13 >= 5) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23799d.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f23796a.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f23798c.getLayoutParams();
                int iA2 = o.a(i13);
                int i14 = layoutParams.width;
                int i15 = iA2 - i14;
                if (iA2 <= i14 || i15 <= (i11 = layoutParams2.rightMargin)) {
                    layoutParams3.width = iA2;
                    layoutParams3.height = iA2;
                    i10 = layoutParams2.rightMargin;
                    if (i15 < i10) {
                        i10 -= i15 / 2;
                    }
                } else {
                    int i16 = (i14 / 2) + (iA2 / 2) + i11;
                    layoutParams3.width = i16;
                    layoutParams3.height = i16;
                    layoutParams2.gravity = 53;
                    i10 = 0;
                }
                layoutParams3.setMargins(i10, i10, i10, i10);
                layoutParams3.gravity = 17;
            }
        }
        this.f23796a.setVisibility((closeButtonConfiguration.f23789a || closeButtonConfiguration.f23790b) ? 0 : 8);
        this.f23797b.setVisibility(closeButtonConfiguration.f23789a ? 0 : 8);
        int i17 = closeButtonConfiguration.f23790b ? 0 : 8;
        this.f23799d.setVisibility(i17);
        this.f23798c.setVisibility(i17);
        this.f23798c.setEnabled(closeButtonConfiguration.f23790b);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        CloseButtonConfiguration closeButtonConfiguration = this.f23802g;
        closeButtonConfiguration.f23794f = bVar.f20969a;
        closeButtonConfiguration.f23795g.a(closeButtonConfiguration);
    }
}
