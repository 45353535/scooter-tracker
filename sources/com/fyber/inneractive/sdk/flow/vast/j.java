package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.N6;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, r rVar) {
        InneractiveErrorCode inneractiveErrorCode;
        t tVar;
        InneractiveErrorCode inneractiveErrorCode2;
        x xVarA;
        Set<com.fyber.inneractive.sdk.model.vast.r> setKeySet;
        String str;
        String str2 = gVar.f23729i;
        if ("VastErrorInvalidFile".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar = t.VAST_ERROR_INVALID_RESPONSE;
            if (gVar.f23730j != null) {
                xVarA = new x().a(gVar.f23730j, "exception");
                inneractiveErrorCode = inneractiveErrorCode2;
            }
            inneractiveErrorCode = inneractiveErrorCode2;
            xVarA = null;
        } else {
            if ("ErrorNoCompatibleMediaFile".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar = t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
                LinkedHashMap linkedHashMap = gVar.P;
                if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null && setKeySet.size() > 0) {
                    x xVar = new x();
                    JSONArray jSONArray = new JSONArray();
                    for (com.fyber.inneractive.sdk.model.vast.r rVar2 : setKeySet) {
                        try {
                            f fVar = (f) linkedHashMap.get(rVar2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", rVar2.f21232g);
                            jSONObject.put(com.taurusx.tax.f.a.f65992s, rVar2.f21230e);
                            jSONObject.put("mime", TextUtils.isEmpty(rVar2.f21229d) ? "na" : rVar2.f21229d);
                            jSONObject.put("delivery", rVar2.f21226a);
                            e eVar = fVar.f21010a;
                            jSONObject.put("reason", eVar != null ? eVar.value : 0);
                            jSONObject.put("required_value", fVar.f21011b);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                            IAlog.a("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                        }
                    }
                    xVar.a(jSONArray, "media_files");
                    inneractiveErrorCode = inneractiveErrorCode2;
                    xVarA = xVar;
                }
            } else if ("VastErrorTooManyWrappers".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar = t.VAST_ERROR_TOO_MANY_WRAPPERS;
                xVarA = new x().a(Integer.valueOf(IAConfigManager.O.f20303i.f20412b), "max");
                inneractiveErrorCode = inneractiveErrorCode2;
            } else if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar = t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                tVar = t.INTERNAL_CONFIG_MISMATCH;
            } else if ("VastErrorUnsecure".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar = t.VAST_ERROR_UNSECURE_URL;
            } else {
                inneractiveErrorCode = null;
                tVar = null;
                xVarA = null;
            }
            inneractiveErrorCode = inneractiveErrorCode2;
            xVarA = null;
        }
        if (tVar != null) {
            JSONArray jSONArrayB = rVar == null ? null : rVar.b();
            w wVar = new w(gVar);
            wVar.f21417b = tVar;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArrayB;
            if (xVarA != null) {
                wVar.f21421f.put(xVarA.f21423a);
            }
            wVar.a((String) null);
        }
        if (gVar.f23736p != UnitDisplayType.NATIVE) {
            ArrayList<com.fyber.inneractive.sdk.model.vast.h> arrayList = gVar.Q;
            if (arrayList != null && arrayList.size() > 0) {
                u uVar = u.VAST_EVENT_COMPANION_FILTERED;
                JSONArray jSONArrayB2 = rVar == null ? null : rVar.b();
                w wVar2 = new w(gVar);
                wVar2.f21418c = uVar;
                wVar2.f21416a = inneractiveAdRequest;
                wVar2.f21419d = jSONArrayB2;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (com.fyber.inneractive.sdk.model.vast.h hVar : arrayList) {
                    hVar.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, hVar.f21201a);
                        jSONObject3.put("h", hVar.f21202b);
                        jSONObject3.put(N6.J0, hVar.f21207g);
                        jSONObject3.put("clt", hVar.f21208h);
                        String str3 = hVar.f21206f;
                        if (str3 != null) {
                            jSONObject3.put("content", str3);
                            str = VastResourceXmlManager.HTML_RESOURCE;
                        } else {
                            str = null;
                        }
                        l lVar = hVar.f21204d;
                        if (lVar != null) {
                            jSONObject3.put("content", lVar.f21213b);
                            jSONObject3.put("creativeType", hVar.f21204d.f21212a);
                            str = VastResourceXmlManager.STATIC_RESOURCE;
                        }
                        if (!TextUtils.isEmpty(hVar.f21205e)) {
                            jSONObject3.put("content", hVar.f21205e);
                            str = "iFrameResource";
                        }
                        if (str != null) {
                            jSONObject3.put("type", str);
                        }
                        b bVar = hVar.f21209i;
                        if (bVar != null) {
                            jSONObject3.put("reason", bVar.f20996a);
                            jSONObject3.put("exception", hVar.f21209i.getMessage());
                        }
                    } catch (JSONException e10) {
                        IAlog.a("Failed creating Companion json object: %s", e10.getMessage());
                        jSONObject3 = null;
                    }
                    jSONArray2.put(jSONObject3);
                }
                try {
                    jSONObject2.put("companion_data", jSONArray2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONArray2);
                }
                wVar2.f21421f.put(jSONObject2);
                wVar2.a((String) null);
            }
            com.fyber.inneractive.sdk.model.vast.b bVar2 = gVar.O;
            int size = bVar2 != null ? bVar2.f21167g.size() : 0;
            ArrayList arrayList2 = gVar.Q;
            int size2 = arrayList2 != null ? arrayList2.size() : 0;
            u uVar2 = u.NUMBER_OF_COMPANIONS;
            JSONArray jSONArrayB3 = rVar == null ? null : rVar.b();
            w wVar3 = new w(gVar);
            wVar3.f21418c = uVar2;
            wVar3.f21416a = inneractiveAdRequest;
            wVar3.f21419d = jSONArrayB3;
            JSONObject jSONObject4 = new JSONObject();
            Integer numValueOf = Integer.valueOf(size + size2);
            try {
                jSONObject4.put("number_of_endcards", numValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "number_of_endcards", numValueOf);
            }
            wVar3.f21421f.put(jSONObject4);
            wVar3.a((String) null);
        }
        if (gVar.O != null) {
            i<com.fyber.inneractive.sdk.measurement.h> iVar = new i(gVar);
            if (iVar.size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                u uVar3 = u.OMID_VAST_DETECTION;
                JSONArray jSONArrayB4 = rVar == null ? null : rVar.b();
                w wVar4 = new w(gVar);
                wVar4.f21418c = uVar3;
                wVar4.f21416a = inneractiveAdRequest;
                wVar4.f21419d = jSONArrayB4;
                for (com.fyber.inneractive.sdk.measurement.h hVar2 : iVar) {
                    hVar2.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("success", String.valueOf(hVar2.b()));
                        if (!hVar2.b()) {
                            jSONObject6.put("error_reason", hVar2.a());
                        }
                    } catch (JSONException unused4) {
                        jSONObject6 = null;
                    }
                    if (jSONObject6 != null) {
                        jSONArray3.put(jSONObject6);
                    }
                }
                try {
                    jSONObject5.put("verifications", jSONArray3);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "verifications", jSONArray3);
                }
                wVar4.f21421f.put(jSONObject5);
                wVar4.a((String) null);
            }
        }
        return inneractiveErrorCode;
    }
}
