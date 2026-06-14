package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f23379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.remoteui.b f23380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f23381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f23382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f23383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23384f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.g f23388j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23385g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23386h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f23389k = new b(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f23390l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23391m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23392n = false;

    public d(Context context, t0 t0Var, String str) {
        this.f23381c = t0Var;
        this.f23384f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.f23380b = bVar;
        this.f23382d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        this.f23388j = new com.fyber.inneractive.sdk.flow.g(context, true, t0Var != null ? t0Var.f21035a : null, b(), null);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        HashMap map2;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f23896b.removeCallbacks(this.f23389k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f23384f : (String) map.get("failedURL");
        if (z10) {
            if (b() != null) {
                b().L = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.f23381c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f21035a : null, b(), str, str2, Boolean.valueOf(this.f23387i));
            map2 = map;
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String strName = bVar.name();
            t0 t0Var2 = this.f23381c;
            map2 = map;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, strName, str2, t0Var2 != null ? t0Var2.f21035a : null, b(), map2, Boolean.valueOf(this.f23387i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f23379a;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map2);
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.f23381c;
        if (t0Var != null) {
            return t0Var.f21036b;
        }
        return null;
    }

    public final void a() {
        this.f23386h = true;
        this.f23383e = null;
        e eVar = this.f23382d;
        eVar.f23394b.clear();
        eVar.f23393a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f23896b.removeCallbacks(this.f23389k);
        this.f23380b.setVisibility(8);
        this.f23380b.setUiReady(false);
        this.f23380b.destroy();
        this.f23388j = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        g1 lastClickedLocation = this.f23380b.getLastClickedLocation();
        e eVar = this.f23382d;
        eVar.getClass();
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1965090009:
                if (str.equals("clickSkip")) {
                    b10 = 0;
                }
                break;
            case -1744940703:
                if (str.equals("expandCollapseClick")) {
                    b10 = 1;
                }
                break;
            case -1379096487:
                if (str.equals("appInfoClick")) {
                    b10 = 2;
                }
                break;
            case -1351774483:
                if (str.equals("shouldSkipUpdateUi.true")) {
                    b10 = 3;
                }
                break;
            case -866863745:
                if (str.equals("onGeneralError")) {
                    b10 = 4;
                }
                break;
            case -841999016:
                if (str.equals("ctaClick")) {
                    b10 = 5;
                }
                break;
            case -791299859:
                if (str.equals("isSkipEnabled.false")) {
                    b10 = 6;
                }
                break;
            case -671397037:
                if (str.equals("clickMuteUnmute")) {
                    b10 = 7;
                }
                break;
            case -505134137:
                if (str.equals("DOMLoaded")) {
                    b10 = 8;
                }
                break;
            case -315413572:
                if (str.equals("adIdentifierClick")) {
                    b10 = 9;
                }
                break;
            case 1031220132:
                if (str.equals("shouldSkipUpdateUi.false")) {
                    b10 = 10;
                }
                break;
            case 1221833860:
                if (str.equals("isSkipEnabled.true")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1696642316:
                if (str.equals("onVideoClick")) {
                    b10 = Ascii.FF;
                }
                break;
            case 1812159227:
                if (str.equals("onResourceError")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                eVar.a(6, lastClickedLocation);
                break;
            case 1:
                eVar.a(5, lastClickedLocation);
                break;
            case 2:
                eVar.a(10, lastClickedLocation);
                break;
            case 3:
                d dVar2 = eVar.f23393a;
                if (dVar2 != null) {
                    dVar2.f23391m = true;
                }
                break;
            case 4:
                d dVar3 = eVar.f23393a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) map.get("error"), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                }
                break;
            case 5:
                eVar.a(3, lastClickedLocation);
                break;
            case 6:
                d dVar4 = eVar.f23393a;
                if (dVar4 != null) {
                    dVar4.f23392n = false;
                }
                break;
            case 7:
                eVar.a(1, lastClickedLocation);
                break;
            case 8:
                String str2 = eVar.f23395c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.f23393a;
                if (dVar5 != null) {
                    dVar5.f23380b.a(str2);
                }
                Iterator it = eVar.f23394b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.f23394b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.f23393a) != null) {
                        dVar.f23380b.a(str3);
                    }
                }
                eVar.f23394b.clear();
                d dVar6 = eVar.f23393a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.f23896b.removeCallbacks(dVar6.f23389k);
                    dVar6.f23385g = false;
                    dVar6.f23380b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().L = true;
                    }
                    dVar6.f23380b.setVisibility(0);
                }
                break;
            case 9:
                d dVar7 = eVar.f23393a;
                if (dVar7 != null && (gVar = dVar7.f23388j) != null) {
                    gVar.a();
                }
                break;
            case 10:
                d dVar8 = eVar.f23393a;
                if (dVar8 != null) {
                    dVar8.f23391m = false;
                }
                break;
            case 11:
                d dVar9 = eVar.f23393a;
                if (dVar9 != null) {
                    dVar9.f23392n = true;
                }
                break;
            case 12:
                eVar.a(7, lastClickedLocation);
                break;
            case 13:
                d dVar10 = eVar.f23393a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) map.get("error"), true, map);
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.f23393a;
        if (dVar11 != null) {
            dVar11.f23380b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
