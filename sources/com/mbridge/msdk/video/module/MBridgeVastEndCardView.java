package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f52642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f52643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f52644o;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVastEndCardView.this.notifyListener.a(104, "");
        }
    }

    class b extends com.mbridge.msdk.widget.a {
        b() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
            mBridgeVastEndCardView.notifyListener.a(108, mBridgeVastEndCardView.c());
        }
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    private boolean e() {
        this.f52642m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
        this.f52643n = findViewById(findID("mbridge_iv_vastclose"));
        View viewFindViewById = findViewById(findID("mbridge_iv_vastok"));
        this.f52644o = viewFindViewById;
        return isNotNULL(this.f52642m, this.f52643n, viewFindViewById);
    }

    private void f() {
        if (this.f52530e) {
            setMatchParent();
            setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f52642m.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f52530e) {
            this.f52643n.setOnClickListener(new a());
            this.f52644o.setOnClickListener(new b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_vast");
        if (i0.a(iFindLayout)) {
            this.f52528c.inflate(iFindLayout, this);
            this.f52530e = e();
            d();
            f();
        }
    }

    public void notifyShowListener() {
        this.notifyListener.a(111, "");
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
