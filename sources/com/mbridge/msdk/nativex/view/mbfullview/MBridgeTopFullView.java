package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName() + "WithResault";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ImageView f49976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected TextView f49977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected TextView f49978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f49979m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f49972i);
        if (viewInflate != null) {
            this.f49976j = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f49977k = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f49978l = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f49979m = (StarLevelLayoutView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f49978l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f49978l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f49976j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f49977k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f49979m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f49964a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f49965b.setLayoutParams(layoutParams2);
    }
}
