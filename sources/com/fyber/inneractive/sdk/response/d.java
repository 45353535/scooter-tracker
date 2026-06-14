package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.model.vast.y;
import com.fyber.inneractive.sdk.model.vast.z;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.s;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f23714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f23715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.f f23716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f23717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f23719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23720k;

    public d() {
        this.f23720k = true;
        this.f23717h = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        g gVar = new g();
        this.f23710a = gVar;
        this.f23714e = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        this.f23715f = r0Var;
        if (r0Var != null && r0Var.f20438f != null) {
            this.f23714e.N = System.currentTimeMillis();
            this.f23714e.C = this.f23715f.f20434b;
            this.f23718i = IAConfigManager.O.f20303i.f20412b;
            try {
                a(str, 0);
                a(this.f23716g, this.f23717h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
                this.f23714e.f23729i = e10.getMessage();
                this.f23714e.f23730j = e10.getCause().getMessage();
                return;
            } catch (InterruptedException e11) {
                throw e11;
            } catch (Exception e12) {
                this.f23714e.f23730j = e12.getMessage();
                g gVar = this.f23714e;
                gVar.f23729i = "VastErrorInvalidFile";
                gVar.f23746z = e12;
                if (IAlog.f23840a == 2) {
                    e12.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.f23710a.f23729i = "ErrorConfigurationMismatch";
    }

    public d(boolean z10) {
        this();
        this.f23720k = z10;
    }

    public final void a(String str, int i10) throws Exception {
        u uVarA;
        try {
            String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
            if (document != null) {
                Node firstChild = document.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    uVarA = u.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                uVarA = null;
            }
            try {
                if (this.f23719j == null) {
                    this.f23719j = new z(uVarA.f21233a);
                } else {
                    z zVar = new z(uVarA.f21233a);
                    if (zVar.compareTo(this.f23719j) >= 0) {
                        this.f23719j = zVar;
                    }
                }
            } catch (y unused) {
            }
            ArrayList arrayList = uVarA.f21234b;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
                a0 a0Var = fVar.f21191b;
                if (a0Var != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f23717h.size()));
                    int size = this.f23717h.size();
                    int i11 = this.f23718i;
                    if (size < i11) {
                        this.f23717h.add(fVar);
                        String str2 = a0Var.f21160i;
                        if (!TextUtils.isEmpty(str2)) {
                            if (h0.e(str2)) {
                                String strA = s.a(str2, 3000, 5000);
                                if (!TextUtils.isEmpty(strA)) {
                                    int i12 = this.f23718i - i10;
                                    if (i12 > 0) {
                                        a0Var.f21198f = i12;
                                        this.f23714e.S.put(str2, strA);
                                        a(strA, i10 + 1);
                                        return;
                                    }
                                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i11));
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", "More than " + this.f23718i + " found");
                }
                if (fVar.f21192c != null) {
                    this.f23716g = fVar;
                    return;
                }
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e10) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e10.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e10.getMessage());
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, List list) {
        String str;
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.f23720k);
        int iIntValue = this.f23715f.f20438f.f20491c.intValue();
        int iIntValue2 = this.f23715f.f20438f.f20490b.intValue();
        int iIntValue3 = this.f23715f.f20438f.f20495g.intValue();
        cVar.f20998b = iIntValue;
        cVar.f20999c = iIntValue2;
        cVar.f21000d = iIntValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f23715f.f20438f.f20498j)) {
            cVar.f21001e = true;
        }
        if (this.f23715f.f20438f.f20499k.contains(2)) {
            cVar.f21002f = true;
        }
        try {
            z zVar = this.f23719j;
            if (zVar == null) {
                str = "";
            } else {
                str = zVar.f21248b;
            }
            this.f23714e.O = cVar.a(fVar, list, str);
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            g gVar = this.f23714e;
            gVar.getClass();
            gVar.f23729i = e10.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f23714e.O;
        if (bVar != null) {
            String str2 = bVar.f21174n;
            if (!TextUtils.isEmpty(str2) && h0.e(str2)) {
                w wVar = new w(com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.f23710a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f21421f.put(jSONObject);
                wVar.a((String) null);
            } else if (!TextUtils.isEmpty(str2)) {
                this.f23714e.O.f21174n = "";
                com.fyber.inneractive.sdk.network.events.a.a(t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (InneractiveAdRequest) null, this.f23710a, "Unsecured URL", str2, Boolean.FALSE);
            }
        }
        g gVar2 = this.f23714e;
        LinkedHashMap linkedHashMap = cVar.f21003g;
        if (linkedHashMap != null) {
            gVar2.P.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        g gVar3 = this.f23714e;
        ArrayList arrayList = cVar.f21004h;
        if (arrayList != null) {
            gVar3.Q.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        g gVar4 = this.f23714e;
        ArrayList arrayList2 = cVar.f21007k;
        if (arrayList2 != null) {
            gVar4.R.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (IAlog.f23840a == 2) {
            LinkedHashMap linkedHashMap2 = cVar.f21003g;
            if (linkedHashMap2.size() > 0) {
                IAlog.e(" VParser: Unsupported media files:", new Object[0]);
                for (r rVar : linkedHashMap2.keySet()) {
                    IAlog.e("VParser: %s", rVar);
                    IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
                }
                return;
            }
            IAlog.e("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
