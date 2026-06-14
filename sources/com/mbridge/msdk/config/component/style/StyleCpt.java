package com.mbridge.msdk.config.component.style;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4240b4;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.style.model.b;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f47268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private XMLView f47269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f47270j;

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap map = new HashMap();
            map.put("view_tag", view.getTag());
            a(a("903008", map));
        }
    }

    private String[] e(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.replaceAll("[\\[\\]]", "").split(StringUtils.COMMA);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r6 = this;
            com.mbridge.msdk.config.component.style.model.b r0 = r6.f47268h
            java.lang.String r0 = r0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = "2000005"
            java.lang.String r1 = "Component command is null"
            r6.a(r0, r1)
            return
        L14:
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L3a
            r2 = -934592106(0xffffffffc84b4196, float:-208134.34)
            r3 = 2
            r4 = 1
            r5 = 3
            if (r1 == r2) goto L50
            r2 = 3202370(0x30dd42, float:4.487476E-39)
            if (r1 == r2) goto L46
            r2 = 3529469(0x35dafd, float:4.94584E-39)
            if (r1 == r2) goto L3c
            r2 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r1 == r2) goto L30
            goto L5a
        L30:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L5a
            r0 = r5
            goto L5b
        L3a:
            r0 = move-exception
            goto L76
        L3c:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L5a
            r0 = 0
            goto L5b
        L46:
            java.lang.String r1 = "hide"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L5a
            r0 = r4
            goto L5b
        L50:
            java.lang.String r1 = "render"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L3a
            if (r0 == 0) goto L5a
            r0 = r3
            goto L5b
        L5a:
            r0 = -1
        L5b:
            if (r0 == 0) goto L72
            if (r0 == r4) goto L6e
            if (r0 == r3) goto L68
            if (r0 == r5) goto L64
            goto L97
        L64:
            r6.g()     // Catch: java.lang.Exception -> L3a
            return
        L68:
            r0 = 8
            r6.a(r0)     // Catch: java.lang.Exception -> L3a
            return
        L6e:
            r6.l()     // Catch: java.lang.Exception -> L3a
            return
        L72:
            r6.r()     // Catch: java.lang.Exception -> L3a
            return
        L76:
            java.lang.String r1 = "XMLViewComponent"
            java.lang.String r2 = "Error in doRenderTemplateAction"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Command execute error "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = ""
            r6.a(r1, r0)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.style.StyleCpt.h():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:21:0x0057, B:54:0x00b6, B:50:0x00a7, B:51:0x00ab, B:52:0x00af, B:53:0x00b3, B:30:0x0073, B:35:0x007f, B:38:0x0089, B:41:0x0093), top: B:58:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            r10 = this;
            com.mbridge.msdk.config.component.style.model.b r0 = r10.f47268h
            if (r0 == 0) goto Lc5
            java.util.List r0 = r0.d()
            if (r0 != 0) goto Lc
            goto Lc5
        Lc:
            com.mbridge.msdk.config.component.style.model.b r0 = r10.f47268h
            java.util.List r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc5
            java.lang.Object r1 = r0.next()
            com.mbridge.msdk.config.component.style.model.a r1 = (com.mbridge.msdk.config.component.style.model.a) r1
            if (r1 != 0) goto L25
            goto L16
        L25:
            java.lang.String r2 = r1.a()
            java.lang.String r3 = r1.d()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L16
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L3a
            goto L16
        L3a:
            android.view.View r4 = r10.c(r3)
            java.lang.String r5 = "XMLViewComponent"
            if (r4 != 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Widget view not found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.mbridge.msdk.foundation.tools.q0.b(r5, r1)
            goto L16
        L57:
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L7d
            r6 = -934610812(0xffffffffc84af884, float:-207842.06)
            r7 = 3
            r8 = 2
            r9 = 1
            if (r3 == r6) goto L93
            r6 = 96417(0x178a1, float:1.35109E-40)
            if (r3 == r6) goto L89
            r6 = 3202370(0x30dd42, float:4.487476E-39)
            if (r3 == r6) goto L7f
            r6 = 3529469(0x35dafd, float:4.94584E-39)
            if (r3 == r6) goto L73
            goto L9d
        L73:
            java.lang.String r3 = "show"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L9d
            r2 = 0
            goto L9e
        L7d:
            r1 = move-exception
            goto Lbe
        L7f:
            java.lang.String r3 = "hide"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L9d
            r2 = r9
            goto L9e
        L89:
            java.lang.String r3 = "add"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L9d
            r2 = r8
            goto L9e
        L93:
            java.lang.String r3 = "remove"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L9d
            r2 = r7
            goto L9e
        L9d:
            r2 = -1
        L9e:
            if (r2 == 0) goto Lb3
            if (r2 == r9) goto Laf
            if (r2 == r8) goto Lab
            if (r2 == r7) goto La7
            goto Lb6
        La7:
            r10.b(r4)     // Catch: java.lang.Exception -> L7d
            goto Lb6
        Lab:
            r10.a(r4, r1)     // Catch: java.lang.Exception -> L7d
            goto Lb6
        Laf:
            r10.a(r4)     // Catch: java.lang.Exception -> L7d
            goto Lb6
        Lb3:
            r10.c(r4)     // Catch: java.lang.Exception -> L7d
        Lb6:
            r10.c(r4, r1)     // Catch: java.lang.Exception -> L7d
            r10.b(r4, r1)     // Catch: java.lang.Exception -> L7d
            goto L16
        Lbe:
            java.lang.String r2 = "Error in doWidgetViewAction"
            com.mbridge.msdk.foundation.tools.q0.b(r5, r2, r1)
            goto L16
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.style.StyleCpt.i():void");
    }

    private void j() {
        b bVar = this.f47268h;
        if (bVar == null || TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.f47269i = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.f47268h.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String strC;
        List<com.mbridge.msdk.config.component.style.model.a> listD = this.f47268h.d();
        if (listD != null && !listD.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : listD) {
                if (aVar != null && (strC = aVar.c()) != null) {
                    strC.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.f47269i);
    }

    private void l() {
        XMLView xMLView = this.f47269i;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        String strC = this.f47268h.c();
        if (TextUtils.isEmpty(strC)) {
            a("2000001", "Template URL is empty");
            return;
        }
        String strD = d(strC);
        if (strD == null || TextUtils.isEmpty(strD)) {
            a("2000003", "XML paths is empty");
            return;
        }
        try {
            XMLView xMLView = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(strD, e(), this.f46642d);
            this.f47269i = xMLView;
            if (xMLView == null) {
                a("2000004", "xml render fail");
            } else {
                xMLView.setRenderMap(strC);
                this.f47269i.setXmlViewActionListener(this.f47270j);
            }
        } catch (Exception e10) {
            a("2000004", e10.getMessage());
        }
    }

    private void q() {
        if (this.f47270j != null) {
            return;
        }
        this.f47270j = new a();
    }

    private void r() {
        HashMap map = new HashMap();
        a(a("903002", map));
        if (this.f47269i == null) {
            a(0);
        }
        Map<String, Object> mapK = k();
        if (!mapK.isEmpty()) {
            map.putAll(mapK);
        }
        a(a("903006", map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "903001";
        this.f47268h = new b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.style.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f47272b.m();
            }
        });
    }

    public void n() {
        a(a("903004", new HashMap()));
    }

    public void o() {
        a(a("903003", new HashMap()));
    }

    private void g() {
        if (this.f47269i != null && e() != null) {
            HashMap map = new HashMap();
            e().removeView(this.f47269i);
            Map<String, Object> mapK = k();
            if (!mapK.isEmpty()) {
                map.putAll(mapK);
            }
            a(a("903005", map));
        }
        Object objB = this.f46642d.b("sdk_context");
        if (objB instanceof Map) {
            Object obj = ((Map) objB).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        q();
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    private String d(String str) {
        com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(str, 2, this.f47268h.b());
        if (bVarA != null) {
            return bVarA.e() ? bVarA.d() : "";
        }
        return "";
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("url");
                if (obj2 instanceof String) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        return strValueOf.equals(this.f47268h.c());
                    }
                }
            }
        }
        return false;
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("XMLViewComponent", "Widget view is null");
                return;
            }
            String strE = aVar.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            String[] strArrE = e(strE);
            if (strArrE.length != 2) {
                q0.b("XMLViewComponent", "Invalid widget location format: " + strE);
                return;
            }
            int i10 = Integer.parseInt(strArrE[0]);
            int i11 = Integer.parseInt(strArrE[1]);
            view.setX(i10);
            view.setY(i11);
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error relocating widget: " + e10.getMessage());
        }
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("XMLViewComponent", "Widget view is null");
                return;
            }
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            String[] strArrE = e(strF);
            if (strArrE.length != 2) {
                q0.b("XMLViewComponent", "Invalid widget size format: " + strF);
                return;
            }
            int i10 = Integer.parseInt(strArrE[0]);
            int i11 = Integer.parseInt(strArrE[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i10;
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error resizing widget: " + e10.getMessage());
        }
    }

    class a implements com.mbridge.msdk.config.component.style.inter.a {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("XMLViewComponent", "Click tag is empty");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("view_tag", str);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            Map mapK = StyleCpt.this.k();
            if (!mapK.isEmpty()) {
                map2.put("all_properties", mapK);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", map2));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(String str, String str2) {
        q0.b("XMLViewComponent", str2);
        HashMap map = new HashMap();
        map.put("reason", str2);
        map.put("code", str);
        if (this.f47268h.d() != null) {
            q0.b("XMLViewComponent", map.toString());
        } else {
            a(a("903007", map));
        }
    }

    private View c(String str) {
        XMLView xMLView = this.f47269i;
        if (xMLView == null) {
            return e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object objB = aVar.b();
            View view2 = objB instanceof View ? (View) objB : null;
            if (view2 == null) {
                q0.b("XMLViewComponent", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e10) {
            q0.b("XMLViewComponent", "Error adding widget: " + e10.getMessage());
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap map = new HashMap();
            map.put("view_tag", view.getTag());
            a(a("903009", map));
        }
    }

    private void a(int i10) {
        XMLView xMLView;
        p();
        if (e() == null || (xMLView = this.f47269i) == null) {
            return;
        }
        xMLView.setVisibility(i10);
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.getClass();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals(C4240b4.i.f42655u0)) {
            n();
        }
    }
}
