package com.mbridge.msdk.config.component.midi;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.u;
import com.ironsource.C4240b4;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.midi.monitor.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MidiCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.model.a f47119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CusPlayerView f47120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f47121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f47122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.b f47123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f47124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47125n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f47126o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f47127p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f47128q;

    class a implements com.mbridge.msdk.config.component.midi.monitor.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str) {
            MidiCpt.this.f47128q = str;
            MidiCpt.this.j();
            MidiCpt.this.g();
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void b(final String str) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.midi.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47131b.c(str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void a(String str) {
            MidiCpt.this.c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        return (int) ((i10 / i11) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i() {
        HashMap map = new HashMap();
        CusPlayerView cusPlayerView = this.f47120i;
        if (cusPlayerView == null) {
            q0.b("PlayerComponent", "mbPlayerView is null in createProgressEventData");
            return map;
        }
        int iCeil = this.f47126o;
        if (iCeil == 0) {
            iCeil = (int) Math.ceil(((double) cusPlayerView.getCurPosition()) / 1000.0d);
        }
        int duration = this.f47127p;
        if (duration == 0) {
            duration = this.f47120i.getDuration();
        }
        int iA = this.f47125n;
        if (iA == 0) {
            iA = a(iCeil, duration);
        }
        map.put("percent", Integer.valueOf(iA));
        map.put("progress", Integer.valueOf(iCeil));
        map.put("mute", this.f47120i.isSilent() ? "1" : "0");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.midi.MidiCpt.j():void");
    }

    private void k() {
        com.mbridge.msdk.config.component.midi.model.a aVar;
        com.mbridge.msdk.config.component.midi.model.a aVar2;
        if (this.f47123l == null && (aVar2 = this.f47119h) != null && aVar2.c() == 1) {
            this.f47123l = new com.mbridge.msdk.config.component.midi.monitor.b();
        }
        if (this.f47124m != null || (aVar = this.f47119h) == null) {
            return;
        }
        this.f47124m = new c(aVar.g(), this.f47119h.i());
    }

    private void l() {
        if (this.f47122k == null) {
            this.f47122k = new a();
        }
        if (this.f47121j == null) {
            this.f47121j = new b();
        }
    }

    private void m() {
        CusPlayerView cusPlayerView = this.f47120i;
        if (cusPlayerView != null) {
            cusPlayerView.pause();
        }
        b("904003", i());
    }

    private void n() {
        if (this.f47119h == null || this.f47120i == null) {
            c("play params is null");
            return;
        }
        if (TextUtils.isEmpty(this.f47128q)) {
            c("Video URL is empty");
            return;
        }
        if (!TextUtils.isEmpty(this.f47119h.e())) {
            try {
                this.f47120i.setMixWithOtherAudio(Integer.valueOf(this.f47119h.e()).intValue());
            } catch (NumberFormatException e10) {
                q0.b("PlayerComponent", "Invalid mixWithOtherAudio value: " + this.f47119h.e(), e10);
            }
        }
        if (this.f47120i.getCurPosition() > 1) {
            p();
            return;
        }
        int iA = this.f47119h.a();
        if (iA >= 0) {
            this.f47120i.initBufferIngParam(iA);
        }
        CusPlayerView cusPlayerView = this.f47120i;
        String str = this.f47128q;
        cusPlayerView.initVFPData(str, str, this.f47121j);
        this.f47120i.playVideo();
        b("904004", i());
    }

    private void p() {
        CusPlayerView cusPlayerView = this.f47120i;
        if (cusPlayerView != null) {
            cusPlayerView.resumeStart();
        }
        b("904004", i());
    }

    public void o() {
        try {
            CusPlayerView cusPlayerView = this.f47120i;
            if (cusPlayerView != null) {
                cusPlayerView.stop();
                this.f47120i.release();
                this.f47120i = null;
            }
            c cVar = this.f47124m;
            if (cVar != null) {
                cVar.b();
                this.f47124m = null;
            }
            if (this.f47123l != null) {
                this.f47123l = null;
            }
            if (this.f47119h != null) {
                this.f47119h = null;
            }
            this.f47121j = null;
            this.f47122k = null;
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error in release", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CusPlayerView cusPlayerView = this.f47120i;
        if (cusPlayerView == null || this.f47119h == null) {
            q0.b("PlayerComponent", "check mute params is null");
            return;
        }
        if ((cusPlayerView.isSilent() ? "1" : "0").equals(this.f47119h.f())) {
            return;
        }
        if ("0".equals(this.f47119h.f())) {
            this.f47120i.openSound();
        } else {
            this.f47120i.closeSound();
        }
        b("904006", i());
    }

    private void h() {
        CusPlayerView cusPlayerView = this.f47120i;
        if (cusPlayerView != null) {
            cusPlayerView.stop();
        }
        b("904009", i());
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            q0.b("PlayerComponent", "execute " + this);
            l();
            c cVar = this.f47124m;
            if (cVar == null) {
                c("timeOutPlayerMonitor 为 null，无法启动监控");
            } else {
                cVar.a(this.f47122k);
                this.f47124m.f();
            }
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error in execute", e10);
            c("Error in execute: " + e10.getMessage());
        }
    }

    class b implements com.mbridge.msdk.config.dynamic.baseview.video.a {
        b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10) {
            if (MidiCpt.this.f47124m != null) {
                MidiCpt.this.f47124m.e();
            }
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904002", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingEnd() {
            q0.b("BufferState", "缓冲结束");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingStart() {
            q0.b("BufferState", "开始缓冲");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingTimeOut(String str) {
            q0.b("BufferState", "缓冲超时");
            MidiCpt.this.a("904010", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayCompleted() {
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904007", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayError(String str) {
            MidiCpt.this.a("904008", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10, long j11) {
            MidiCpt.this.f47126o = u.a(j10);
            MidiCpt.this.f47127p = u.a(j11);
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.f47125n = midiCpt.a(midiCpt.f47126o, MidiCpt.this.f47127p);
            HashMap map = new HashMap();
            map.put("percent", Integer.valueOf(MidiCpt.this.f47125n));
            map.put("progress", Long.valueOf(j10));
            map.put("mute", MidiCpt.this.f47120i.isSilent() ? "1" : "0");
            MidiCpt.this.b("904005", map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void c(Map<String, Object> map) {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f47119h;
        if (aVar == null) {
            q0.b("PlayerComponent", "playerModel is null, cannot parse event config");
        } else {
            aVar.b(map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "904001";
        this.f47119h = new com.mbridge.msdk.config.component.midi.model.a(map);
        try {
            ViewGroup viewGroupE = e();
            if (viewGroupE != null) {
                if (!TextUtils.isEmpty(this.f47119h.h())) {
                    this.f47120i = (CusPlayerView) e().findViewWithTag(this.f47119h.h());
                } else {
                    this.f47120i = (CusPlayerView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, CusPlayerView.class);
                }
            }
            CusPlayerView cusPlayerView = this.f47120i;
            if (cusPlayerView == null) {
                q0.b("PlayerComponent", "Failed to get CusPlayerView from root view");
            } else {
                this.f47119h.a(cusPlayerView);
            }
        } catch (Exception e10) {
            q0.b("PlayerComponent", "Error getting CusPlayerView", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HashMap map = new HashMap();
        map.put("reason", str);
        b("904005", map);
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        k();
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty() && (map.get("componentConfig") instanceof Map)) {
            Object obj = map.get("url");
            if (obj instanceof String) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf.equals(this.f47119h.i());
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Map<String, Object> map) {
        a(a(str, map));
        com.mbridge.msdk.config.component.midi.monitor.b bVar = this.f47123l;
        if (bVar != null) {
            bVar.a(str, this.f46642d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Map<String, Object> mapI = i();
        mapI.put("reason", str2);
        mapI.put("code", "4001");
        b(str, mapI);
        o();
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("PlayerComponent", "eventName is null");
            return;
        }
        str.getClass();
        if (str.equals("onStop")) {
            m();
        } else if (str.equals(C4240b4.i.f42655u0)) {
            p();
        }
    }
}
