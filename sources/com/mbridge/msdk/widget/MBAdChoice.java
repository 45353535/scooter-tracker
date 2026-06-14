package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes10.dex */
public class MBAdChoice extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f53326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f53327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f53329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f53330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.feedback.a f53331h;

    class a implements com.mbridge.msdk.foundation.feedback.a {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }
    }

    class b implements c {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f53327d = "";
        this.f53328e = "";
        this.f53329f = "";
        this.f53326c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.f53330g = campaignEx;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        c(campaignEx, gVarD);
        a(campaignEx, gVarD);
        b(campaignEx, gVarD);
        boolean z10 = (TextUtils.isEmpty(this.f53327d) || TextUtils.isEmpty(this.f53328e) || TextUtils.isEmpty(this.f53329f)) ? false : true;
        setImageUrl(this.f53327d);
        return z10;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.f53330g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f53328e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f53328e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f53328e = adchoice.h();
            }
            if (TextUtils.isEmpty(this.f53328e) && gVar != null) {
                this.f53328e = gVar.c();
            }
            if (TextUtils.isEmpty(this.f53328e)) {
                this.f53328e = d.h().f48734g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f53331h == null) {
            this.f53331h = new a();
        }
        v0.a(this.f53330g, this.f53331h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f53330g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f53330g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.f53331h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.f53330g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f53329f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f53329f = adchoice.i();
        }
        if (!TextUtils.isEmpty(this.f53329f) || gVar == null) {
            return;
        }
        this.f53329f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53327d = "";
        this.f53328e = "";
        this.f53329f = "";
        this.f53326c = context;
        b();
    }

    private void a() {
        if (this.f53326c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f53327d, new b());
        }
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.f53330g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f53327d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f53327d = adchoice.g();
        }
        if (!TextUtils.isEmpty(this.f53327d) || gVar == null) {
            return;
        }
        this.f53327d = gVar.b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53327d = "";
        this.f53328e = "";
        this.f53329f = "";
        this.f53326c = context;
        b();
    }
}
