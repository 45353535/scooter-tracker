package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes10.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RelativeLayout f49964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f49965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f49966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f49967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f49968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ProgressBar f49969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FrameLayout f49970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinearLayout f49971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f49972i;
    public a style;

    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f49972i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f49964a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f49965b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f49966c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f49967d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f49968e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f49969f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f49970g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f49971h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f49966c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f49967d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f49969f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f49964a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f49965b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f49968e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f49970g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f49971h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
